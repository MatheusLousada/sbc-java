package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.orcom.c7942.C7942;
import br.gov.sp.saobernardo.orcom.c7942.C7942Bean;
import br.gov.sp.saobernardo.orcom.m079.M079;
import br.gov.sp.saobernardo.orcom.m079.M079Bean;
import br.gov.sp.saobernardo.orcom.menusetelas.ComandosOrcom;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM079;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7942;
import br.gov.sp.saobernardo.webservice.classes.modelos.BuscadorCodigoFornecedor;
import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroProcessoOrcomModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.proposta.PropostaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.model.OrcomSecomQuadroModel;
import br.gov.sp.saobernardo.webservice.orcom.model.TiposLicitacoes;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.CotacaoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.PropostaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;
import br.gov.sp.saobernardo.webservice.paradigma.log.TextFormatter;

/**
 * Faz o controle de importação de cotações
 * 
 * @author 41476
 * @author Marcelos Banhos/Jefferson Aparecido Zuanon
 *
 */
public class AtualizacaoC7942Controller {

	private static final Boolean PASSOU = Boolean.TRUE;

	private static final Boolean FALHOU = Boolean.FALSE;

	private static final int LARGURA_LINHA = 80;

	Conexao conexaoParadigma;
	PropostaDAO propostaDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;
	private CotacaoDAO cotacaoDAO;

	private TextFormatter tf;

	private TextFormatter tfh;

	/**
	 * Construtor
	 * 
	 * @param ambienteWBC
	 * @param ambienteORCOM
	 * @param imprimirQuery
	 * @param log
	 * @throws Exception
	 */
	public AtualizacaoC7942Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log));
	}

	/**
	 * Construtor
	 * 
	 * @param ContextoImportacao ci
	 * @throws Exception
	 */
	public AtualizacaoC7942Controller(ContextoImportacao ci) throws Exception {
		iniciar(ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery(), new ArquivoDeLog());
	}

	/**
	 * Construtor
	 * 
	 * @param ambienteWBC
	 * @param ambienteORCOM
	 * @param imprimirQuery
	 * @throws Exception
	 */
	public AtualizacaoC7942Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog());
	}

	/**
	 * Faz o trabalho "sujo" do construtor
	 * 
	 * @param ambienteWBC
	 * @param ambienteORCOM
	 * @param imprimirQuery
	 * @throws Exception
	 */
	private void iniciar(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog log)
			throws Exception {
		conexaoParadigma = new Conexoes().getConexao(ambienteWBC);
		conexaoParadigma.conecta();
		propostaDAO = new PropostaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		cotacaoDAO = new CotacaoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		this.log = log;
		this.ambienteORCOM = ambienteORCOM;
		tf = new TextFormatter(80);
		tfh = new TextFormatter(80, " ", " ");
	}

	public void fecha() {
		conexaoParadigma.fecha();
	}

	public Boolean atualizaPropostasDeProcesso(String codigoProcesso, String anoOrcom) throws Exception {

		NumeroProcessoOrcomModel npo = new NumeroProcessoOrcomModel(codigoProcesso);
		if (!cotacaoDAO.isProcessoComCotacoesEncerradas(npo.toParadigma())) {
			final String message = "Processo com cotações não encerradas. Verifique !   Processo " + npo.toParadigma();
			log.adiciona(tf.formatar(message));
			return FALHOU;
		}

		log.adiciona(tfh.repeat("_"));
		log.adiciona(tf.formatar(StringUtils.center(String.format("Orcamentos do processo [%s]", npo.toParadigma(), npo.getAnoDoProcesso()), LARGURA_LINHA - 2)));
		int contador = 0;
		Boolean retorno = PASSOU;
		try {
			for (String cnpj : propostaDAO.buscaCNPJsDeProcesso(codigoProcesso)) {
				contador++;

				M079 m079 = new MenuOrcomM079(ambienteORCOM).getMenu();
				M079Bean dadosDaTelam079 = m079.loadPage();
				String xSeedMsg = dadosDaTelam079.getXSEEDMSG();
				if (!xSeedMsg.isEmpty()) {
					log.erro(xSeedMsg);
				}

				dadosDaTelam079.setOPCM_1(MenuOrcomM079.MENU_ORCOM_M079_OPCAO_03_REGISTRAR_ORCAMENTO);

				M079Bean beanDeSaida = m079.submit(dadosDaTelam079);
				xSeedMsg = beanDeSaida.getXSEEDMSG();
				if (!xSeedMsg.isEmpty()) {
					throw new AtualizacaoC7942Exception(xSeedMsg);
				}

				C7942 telaC7942 = new TelaC7942(m079, ambienteORCOM).getTela();
				C7942Bean dadosDaTelaDeRegistros = telaC7942.redirecionadaDaTela();

				dadosDaTelaDeRegistros.setNUMERO(npo.getNumeroDoProcesso().toString());
				dadosDaTelaDeRegistros.setANO(npo.getAnoDoProcesso().toString() );
				dadosDaTelaDeRegistros.setTIPODOCW("1");
				dadosDaTelaDeRegistros.setCNPJ(cnpj);
				dadosDaTelaDeRegistros
						.setEMPRESA(new BuscadorCodigoFornecedor().buscaRazaoSocialDe(cnpj, ambienteORCOM));
				dadosDaTelaDeRegistros.setSMAINT(ComandosOrcom.INQ.toString());

				fichaItemOrcamento(contador, dadosDaTelaDeRegistros);

				C7942Bean registroDeOrcamentoDoFornecedor = telaC7942.executa(dadosDaTelaDeRegistros, false);
				int quantidadeDeMateriais = registroDeOrcamentoDoFornecedor.getListaDeCopyFrom().size();

				registroDeOrcamentoDoFornecedor = telaC7942.submit(registroDeOrcamentoDoFornecedor);

				List<PropostaModel> propostas = propostaDAO.buscaPropostasDeCNPJ(npo.toParadigma(), cnpj);

				// Inclusao de propostas
				for (int pagina = 0; pagina <= (quantidadeDeMateriais - 1) / 4; pagina++) {

					int qualProduto = 0;
					for (PropostaModel proposta : propostas) {
						qualProduto++;
						preencheCopyFrom(qualProduto, registroDeOrcamentoDoFornecedor, proposta, false);

					}

					if (!propostas.isEmpty()) {
						registroDeOrcamentoDoFornecedor.setSMAINT(ComandosOrcom.ADD.toString());
						registroDeOrcamentoDoFornecedor = telaC7942.submit(registroDeOrcamentoDoFornecedor);
						if (!registroDeOrcamentoDoFornecedor.getXSEEDMSG().isEmpty()) {
							log.adiciona(tf.formatar(String.format(" M079 ->OPCAO %s [C7942]:%s",
									MenuOrcomM079.MENU_ORCOM_M079_OPCAO_03_REGISTRAR_ORCAMENTO,
									registroDeOrcamentoDoFornecedor.getXSEEDMSG())));
						}
					}
				}

			}
			log.adiciona(tf.repeat("_"));

		} catch (Exception e) {
			log.erro(tf.formatar(e.getMessage()));
			retorno = FALHOU;
		}
		log.adiciona(tf.formatar("  <<<Fim das cotacoes>>>"));
		log.adiciona(tf.repeat("_"));
		log.adiciona(" ");
		return retorno;
	}

	public Boolean excluiPropostasDeProcesso(String codigoProcesso, String anoOrcom) throws SQLException {

		
		NumeroProcessoOrcomModel npo = new NumeroProcessoOrcomModel(codigoProcesso);
 		if (!cotacaoDAO.isProcessoComCotacoesEncerradas(npo.toParadigma())) {
			final String message = "Processo com cotações não encerradas. Verifique !   Processo " + npo.toParadigma();
			log.adiciona(tf.formatar(message));
			return FALHOU;
		}

		log.adiciona(tfh.repeat("_"));
		log.adiciona(tf.repeat(" "));
		log.adiciona(tf.formatar(StringUtils.center("* EXCLUSAO DE ORCAMENTO *", LARGURA_LINHA - 2)));
		log.adiciona(tf.repeat(" "));
		log.adiciona(tf.formatar(StringUtils.center(String.format("Orcamentos do processo [%s]", npo.toParadigma(), npo.getAnoDoProcesso()), LARGURA_LINHA - 2)));
		
		int contador = 0;
		Boolean retorno = PASSOU;

		try {
			for (String cnpj : propostaDAO.buscaCNPJsDeProcesso(npo.toParadigma())) {
				contador++;

				M079 m079 = new MenuOrcomM079(ambienteORCOM).getMenu();
				M079Bean dadosDaTelam079 = m079.loadPage();
				String xSeedMsg = dadosDaTelam079.getXSEEDMSG();
				if (!xSeedMsg.isEmpty()) {
					log.erro(xSeedMsg);
				}

				dadosDaTelam079.setOPCM_1(MenuOrcomM079.MENU_ORCOM_M079_OPCAO_03_REGISTRAR_ORCAMENTO);

				M079Bean beanDeSaida = m079.submit(dadosDaTelam079);
				xSeedMsg = beanDeSaida.getXSEEDMSG();
				if (!xSeedMsg.isEmpty()) {
					throw new AtualizacaoC7942Exception(xSeedMsg);
				}

				C7942 telaC7942 = new TelaC7942(m079, ambienteORCOM).getTela();
				C7942Bean dadosDaTelaDeRegistros = telaC7942.redirecionadaDaTela();

				dadosDaTelaDeRegistros.setNUMERO(npo.getNumeroDoProcesso().toString());
				dadosDaTelaDeRegistros.setANO(npo.getAnoDoProcesso().toString());
				dadosDaTelaDeRegistros.setTIPODOCW("1");
				dadosDaTelaDeRegistros.setCNPJ(cnpj);
				dadosDaTelaDeRegistros.setEMPRESA(new BuscadorCodigoFornecedor().buscaRazaoSocialDe(cnpj, ambienteORCOM));
				dadosDaTelaDeRegistros.setSMAINT(ComandosOrcom.INQ.toString());

				fichaItemOrcamento(contador, dadosDaTelaDeRegistros);

				C7942Bean registroDeOrcamentoDoFornecedor = telaC7942.executa(dadosDaTelaDeRegistros, false);
				int quantidadeDeMateriais = registroDeOrcamentoDoFornecedor.getListaDeCopyFrom().size();

				registroDeOrcamentoDoFornecedor = telaC7942.submit(registroDeOrcamentoDoFornecedor);

				List<PropostaModel> propostas = propostaDAO.buscaPropostasDeCNPJ(npo.toParadigma(), cnpj);

				// Excluir importações antigas antes
				for (int pagina = 0; pagina <= (quantidadeDeMateriais - 1) / 4; pagina++) {

					int qualProduto = 0;
					for (PropostaModel proposta : propostas) {
						qualProduto++;
						preencheCopyFrom(qualProduto, registroDeOrcamentoDoFornecedor, proposta, true);
					}

					if (!propostas.isEmpty()) {
						registroDeOrcamentoDoFornecedor.setSMAINT(ComandosOrcom.DEL.toString());
						registroDeOrcamentoDoFornecedor = telaC7942.submit(registroDeOrcamentoDoFornecedor);
						if (!registroDeOrcamentoDoFornecedor.getXSEEDMSG().isEmpty()) {
							log.adiciona(tf.formatar(String.format(" M079 ->OPCAO %s [C7942]:%s",
									MenuOrcomM079.MENU_ORCOM_M079_OPCAO_03_REGISTRAR_ORCAMENTO,
									registroDeOrcamentoDoFornecedor.getXSEEDMSG())));
						}
					}
				}
				log.adiciona(tf.repeat("_"));

			}
		} catch (Exception e) {
			log.erro(tf.formatar(e.getMessage()));
			retorno = FALHOU;
		}
		log.adiciona(tf.formatar("  <<<Fim das cotacoes>>>"));
		log.adiciona(tf.repeat("_"));
		log.adiciona(" ");
		return retorno;
	}

	private void fichaProposta(int qualProduto, String codigo, String valor, String qtd) {
		final String padrao = "          %10s | %10s | %s";
		if (qualProduto == 1) {
			log.adiciona(tf.formatar(String.format(padrao, "Produto", "V. Un.", "Qtd")));
		}
		log.adiciona(tf.formatar(String.format(padrao, codigo, valor, qtd)));
	}

	private void fichaItemOrcamento(int contador, C7942Bean dadosDaTelaDeRegistros) {
		log.adiciona(tf.repeat("_"));
		log.adiciona(tf.formatar(String.format(" %03d) Fornecedor [%14s] %s", contador,
				dadosDaTelaDeRegistros.getCNPJ(), dadosDaTelaDeRegistros.getEMPRESA())));

	}

	private boolean preencheCopyFrom(int qualProduto, C7942Bean dadosDaTela, PropostaModel proposta, boolean excluir) {

		final String codigo = proposta.getCodigo();
		final String valor = casasDecimais(proposta.getValor(), 4);
		final String q0 = casasDecimais(dadosDaTela.getCOPYFROM_QUANTI_0(), 4);
		final String q1 = casasDecimais(dadosDaTela.getCOPYFROM_QUANTI_1(), 4);
		final String q2 = casasDecimais(dadosDaTela.getCOPYFROM_QUANTI_2(), 4);
		final String q3 = casasDecimais(dadosDaTela.getCOPYFROM_QUANTI_3(), 4);

		if (dadosDaTela.getCOPYFROM_COD_MAT_0().equals(codigo)) {
			dadosDaTela.setCOPYFROM_VALOR_0(valor);
			dadosDaTela.setCOPYFROM_QUANTI_0(q0);

			if (excluir) {
				dadosDaTela.setCOPYFROM_ITEM_MAT_0("S");
			}

			fichaProposta(qualProduto, codigo, valor, q0);
			return true;
		}

		if (dadosDaTela.getCOPYFROM_COD_MAT_1().equals(codigo)) {
			dadosDaTela.setCOPYFROM_VALOR_1(valor);
			dadosDaTela.setCOPYFROM_QUANTI_1(q1);

			if (excluir) {
				dadosDaTela.setCOPYFROM_ITEM_MAT_1("S");
			}

			fichaProposta(qualProduto, codigo, valor, q1);
			return true;
		}

		if (dadosDaTela.getCOPYFROM_COD_MAT_2().equals(codigo)) {
			dadosDaTela.setCOPYFROM_VALOR_2(valor);
			dadosDaTela.setCOPYFROM_QUANTI_2(q2);

			if (excluir) {
				dadosDaTela.setCOPYFROM_ITEM_MAT_2("S");
			}

			fichaProposta(qualProduto, codigo, valor, q2);
			return true;
		}

		if (dadosDaTela.getCOPYFROM_COD_MAT_3().equals(codigo)) {
			dadosDaTela.setCOPYFROM_VALOR_3(valor);
			dadosDaTela.setCOPYFROM_QUANTI_3(q3);

			if (excluir) {
				dadosDaTela.setCOPYFROM_ITEM_MAT_3("S");
			}

			fichaProposta(qualProduto, codigo, valor, q3);
			return true;
		}

		return false;
	}

	private String casasDecimais(String num, int numeroCasasDecimais) {
		return casasDecimais(new BigDecimal(num), numeroCasasDecimais);
	}

	private String casasDecimais(BigDecimal v, int numeroCasasDecimais) {
		BigDecimal bd = v.setScale(numeroCasasDecimais, BigDecimal.ROUND_DOWN);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(numeroCasasDecimais);
		df.setMinimumFractionDigits(numeroCasasDecimais);
		df.setGroupingUsed(false);
		return df.format(bd).replace(",", ".");
	}

	public List<CotacaoModel> selecionaCotacoesEncerradas() throws SQLException {
		return cotacaoDAO.selecionaCotacoesEncerradas(0, 0);
	}

	public List<CotacaoModel> selecionaCotacoesEncerradas(int ano, int mes) throws SQLException {
		return cotacaoDAO.selecionaCotacoesEncerradas(ano, mes);
	}

	public List<Integer> listaAnosDeCotacoesEncerradas() throws SQLException {
		return cotacaoDAO.filtraAnosComCotacoesEncerradas();
	}

	public List<CotacaoModel> retornaListaDeCotacoesNaoCadastradasNoORCOM(List<CotacaoModel> selecionaCotacoes,
			String ambienteORCOM, OrcomSecomQuadroController secomQuadroController) throws Exception {

		List<CotacaoModel> novaLista = new ArrayList<CotacaoModel>();

		for (CotacaoModel cotacao : selecionaCotacoes) {

			Integer numeroProcesso = preparaNumeroPregaoEletronico(cotacao.getCodigoProcesso());

			OrcomSecomQuadroModel secomQuadroModelo = secomQuadroController.buscaPrimeiroItemDoQuadro(numeroProcesso);

			if (null == secomQuadroModelo.getRequisicao()) {
				secomQuadroModelo.setRequisicao(0);
			}

			if (!secomQuadroModelo.getRequisicao().toString().contains(numeroProcesso.toString())) {
				novaLista.add(cotacao);
			}

			/*
			 * if (!numeroProcesso.equals(secomQuadroModelo.getRRequisicao())) {
			 * novaLista.add(cotacao); }
			 */
		}

		return novaLista;
	}

	private Integer preparaNumeroPregaoEletronico(String numeroEdital) {
		Integer retorno = new Integer(0);
		log.adiciona("Edital PE: " + numeroEdital);
		if (numeroEdital.contains("/") || numeroEdital.contains("-")) {
			String[] numeroSplit;
			numeroSplit = numeroEdital.split(numeroEdital.contains("/") ? "/" : "-");
			Integer numero = Integer.valueOf(numeroSplit[0].replace(TiposLicitacoes.PE.toString(), "").replace(" ", ""));
			Integer ano = Integer.valueOf(numeroSplit[1].replace(" ", ""));
			retorno = Integer.valueOf(ano + String.format("%06d", numero));

		}
		return retorno;
	}

}
