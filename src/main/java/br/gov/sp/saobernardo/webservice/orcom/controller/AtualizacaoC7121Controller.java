package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.orcom.c7121.C7121;
import br.gov.sp.saobernardo.orcom.c7121.C7121Bean;
import br.gov.sp.saobernardo.orcom.c7121.OrcomC7121Exception;
import br.gov.sp.saobernardo.orcom.c7184.C7184;
import br.gov.sp.saobernardo.orcom.c7184.C7184Bean;
import br.gov.sp.saobernardo.orcom.c7184.OrcomC7184Exception;
import br.gov.sp.saobernardo.orcom.m071.M071;
import br.gov.sp.saobernardo.orcom.m071.M071Bean;
import br.gov.sp.saobernardo.orcom.m071.OrcomM071Exception;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM071;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7121;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7184;
import br.gov.sp.saobernardo.webservice.classes.modelos.ItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.UsuarioModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.DeParaComissaoWbcOrcom;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.Leiloeiro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.classes.utils.Pausa;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.orcom.model.OrcomTFornModel;
import br.gov.sp.saobernardo.webservice.orcom.model.TiposLicitacoes;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.CompraDiretaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.PregaoEletronicoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.UsuarioDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class AtualizacaoC7121Controller {

	private static final String REMOVER_NAO_NUMEROS = "[^\\d]";
	//private static final String CE = "CE";
	//private static final String PE = "PE";
	private static final String DD_M_MYYYY = "ddMMyyyy";

	private static final String LANCE_DESCLASSIFICADO = "1";
	private static final String LANCE_VENCEDOR = "2";
	private static final String LANCE_CLASSIFICADO = "6";

	private static final String PESSOA_JURIDICA = "1";
	@SuppressWarnings("unused")
	private static final String PESSOA_FISICA = "2";

	Conexao conexaoParadigma;
	EmpresaDAO empresaDAO;
	PregaoEletronicoDAO pregaoEletronicoDAO;
	CompraDiretaDAO compraDiretaDAO;
	UsuarioDAO usuarioDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;
	private boolean imprimirQuery;

	Conversores conversores = new Conversores(null);

	public AtualizacaoC7121Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog());
	}

	public AtualizacaoC7121Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log));
	}

	public AtualizacaoC7121Controller(ContextoImportacao ci) throws Exception {
		iniciar(ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery(), new ArquivoDeLog()); 
	}

	private void iniciar(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog arquivoDeLog)
			throws Exception {
		conexaoParadigma = new Conexoes().getConexao(ambienteWBC);
		conexaoParadigma.conecta();
		empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		pregaoEletronicoDAO = new PregaoEletronicoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		compraDiretaDAO = new CompraDiretaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		usuarioDAO = new UsuarioDAO(conexaoParadigma.getConnection(), imprimirQuery);

		this.log = arquivoDeLog;
		this.ambienteORCOM = ambienteORCOM;
		this.imprimirQuery = imprimirQuery;
	}

	public void fecha() {
		conexaoParadigma.fecha();
	}

	public List<String> retornaCNPJDasEmpresas(String pregao, String processo) {
		Set<String> listaCNPJDeTodosEnvolvidosNoPregao = new HashSet<String>();
		try {
			for (PregaoEletronicoModel pregaoEletronico : pregaoEletronicoDAO
					.selecionaPregaoPorProcessoComEdital(pregao, processo)) {
				for (PregaoEletronicoItemModel peim : pregaoEletronico.getLstPregaoEletronicoItem()) {
					listaCNPJDeTodosEnvolvidosNoPregao.addAll(listaCNPJDeTodosEnvolvidosNoPregao(peim));
				}
			}
		} catch (SQLException e) {
			log.excecao(e);
		}
		return new ArrayList<String>(listaCNPJDeTodosEnvolvidosNoPregao);
	}

	public void cadastraPregaoEletronico(String pregao, String processo, String anoOrcom)
			throws OrcomM071Exception, OrcomC7121Exception, OrcomC7184Exception, SQLException {

		final Pausa pausa = new Pausa();

		for (PregaoEletronicoModel pe : pregaoEletronicoDAO.selecionaPregaoPorProcessoComEdital(pregao, processo)) {

			//Forçando o número do processo da PE ( Exceção )
			//pe.setNumeroProcessoDisplay("01022/2020 - PE 228");
			
			
			M071 m071 = new MenuOrcomM071(ambienteORCOM).getMenu();
			M071Bean loadPageM071 = m071.loadPage();
			loadPageM071.setOPCAO2(MenuOrcomM071.MENU_ORCOM_M071_OPCAO_23_QUADRO_DE_PRECOS);
			m071.submit(loadPageM071);

			if (TelaC7121.NOME_TELA.equals(m071.getPageCarregado().getName())) {
				C7121 c7121 = new TelaC7121(m071, ambienteORCOM).getTela();
				C7121Bean beanC7121 = c7121.redirecionadaDaTela();

				pe.setNumeroEdital(tratarNumeroEdital(pe.isEditalComAno(), anoOrcom, pregao));
				headerProcesso("PE - Pregao Eletronico", pe.getNumeroProcessoDisplay(), pe.getNumeroEdital(),
						pe.getCodigoSituacao().toString());
				log.adiciona(" Itens  :");

				for (PregaoEletronicoItemModel peim : pe.getLstPregaoEletronicoItem()) {
					cadastraLanceNoORCOM(pe, c7121, beanC7121, peim);
					pausa.pausa((long) 100);
				}

				C7184 c7184 = new TelaC7184(ambienteORCOM).getTela();
				C7184Bean loadPage = c7184.loadPage();
				log.adiciona(" ");
				log.adiciona("\tComissão:");
				log.adiciona("\tCPF         | Perfil | Nome ");
				log.adiciona("\t------------+--------+--------------------------------");

				for (PregaoEletronicoComissaoModel comissao : pe.getLstPregaoEletronicoComissao()) {

					UsuarioModel usuario = usuarioDAO.buscaPorCodigo(comissao.getCodigoUsuario());

					loadPage.setTIPO1(TiposLicitacoes.PE.toString());
					loadPage.setNUMERO1(preparaNumeroPregaoEletronico(pe.getNumeroEdital()).toString());
					loadPage.setOPCAO2("2");

					String cpf = usuario.getCodigoUsuario().replaceAll("[^+0-9]", "");
					String codigoPerfil = new DeParaComissaoWbcOrcom().getCodigoOrcom(comissao.getCodigoPerfil())
							.toString();
					String nomeUsuario = usuario.getNomeUsuario();

					loadPage.setCPF1(cpf);
					loadPage.setATRIBUICAO1(codigoPerfil);
					loadPage.setNOME1(nomeUsuario);

					log.adiciona(String.format("\t%s |   %s    | %s ", cpf, codigoPerfil, nomeUsuario));
					c7184.submit(loadPage);

				}
			}
		}
		log.adiciona("--<fim>--------");
	}

	private String tratarNumeroEdital(boolean isEditalComAno, String anoOrcom, String numeroEdital) {
		String retorno = numeroEdital;
		if (!isEditalComAno && isAnoValido(anoOrcom)) {
			if (numeroEdital.contains("/")) {
				String[] split = numeroEdital.split("/");
				numeroEdital = split[0];
			}
			retorno = String.format("%s/%s", numeroEdital, anoOrcom);
		}
		return retorno;
	}

	/**
	 * 
	 * @param compra   : numero da CE no site do wbc
	 * @param processo : numero do processo no site do wbc
	 * @param ano      : somente se o ano não estiver cadastrado no WBC
	 * @throws Exception
	 */
	public void cadastraCompraDireta(String compra, String processo, String ano) {

		final Pausa pausa = new Pausa();

		try {
			for (CompraDiretaModel compraDireta : compraDiretaDAO.selecionaCompraPorProcessoComEdital(compra,
					processo)) {

				M071 m071 = new MenuOrcomM071(ambienteORCOM).getMenu();
				M071Bean loadPageM071;
				loadPageM071 = m071.loadPage();
				loadPageM071.setOPCAO2(MenuOrcomM071.MENU_ORCOM_M071_OPCAO_23_QUADRO_DE_PRECOS);
				m071.submit(loadPageM071);

				if (TelaC7121.NOME_TELA.equals(m071.getPageCarregado().getName())) {
					C7121 c7121 = new TelaC7121(m071, ambienteORCOM).getTela();
					C7121Bean beanC7121 = c7121.redirecionadaDaTela();
					compraDireta.setNumeroEdital(tratarNumeroEdital(compraDireta.isEditalComAno(), ano, compra));

					headerProcesso("CD - Compra Direta", compraDireta.getNumeroProcessoDisplay(),
							compraDireta.getNumeroEdital(), compraDireta.getCodigoSituacao().toString());

					int i = 1;
					for (CompraDiretaItemModel cdim : compraDireta.getLstCompraDiretaItem()) {
						cadastraLanceNoORCOM(i, compraDireta, c7121, beanC7121, cdim);
						i++;
						pausa.pausa((long) 100);
					}
					log.adiciona("--<fim>--------");
				}

			}
		} catch (SQLException e) {
			throw new AtualizacaoC7121ControllerException(e);
		} catch (OrcomM071Exception e) {
			throw new AtualizacaoC7121ControllerException(e);
		} catch (OrcomC7121Exception e) {
			throw new AtualizacaoC7121ControllerException(e);
		}

	}

	private void headerProcesso(String tipoProcesso, String processo, String edital, String situacao) {
		log.adiciona(String.format("  [%s]   ", tipoProcesso));
		log.adiciona(String.format(" Processo: %s", processo));
		log.adiciona(String.format(" Edital  : %s", edital));
		log.adiciona(String.format(" Situacao: %s", situacao));
		log.adiciona(" ");

	}

	private Collection<String> listaCNPJDeTodosEnvolvidosNoPregao(PregaoEletronicoItemModel peim) {
		List<String> listaDeCNPJ = new ArrayList<String>();
		for (PregaoEletronicoItemLanceModel lance : new Leiloeiro().obtemMenoresLances(peim.getLances())) {
			listaDeCNPJ.add(lance.getCodigoEmpresa());
		}
		return listaDeCNPJ;
	}

	/**
	 * @since 05/12/2018 Alexandre: precisa trazer todos os itens independente da
	 *        situação
	 */
	private void cadastraLanceNoORCOM(PregaoEletronicoModel pregaoEletronico, C7121 c7121, C7121Bean beanC7121,
			PregaoEletronicoItemModel peim) throws OrcomC7121Exception {
		// 123 1234567890 123456789012345 123456789012345 12345678901
		// 1234567890123 12345678901234567890123456789012345678901234567890
		// 12345678 12345678 12345
		log.adiciona(
				"    Seq | Classe    | Item Legado | Cod Lote Legado | Cod Produto | Cod Un Medida | DescricaoItem                                      | Sit Item | Qtd Item | Valor Ref | Situacao");
		String l = " %6s | %10s | %15s | %15s | %11s | %13s | %50s | %8s | %8s | %10.4f | %s - %s";
		log.adiciona(String.format(l, peim.getCodigoItemSequencial(), peim.getCodigoClasse(),
				peim.getCodigoItemLegado(), peim.getCodigoLoteLegado(), peim.getCodigoProduto(),
				peim.getCodigoUnidadeMedida(), peim.getDescricaoItem(), peim.getSituacaoItem(),
				peim.getQuantidadeItem(), peim.getValorReferencia(), peim.getSituacaoPregao().getCodigo(),
				peim.getSituacaoPregao().getDescricao()));

		log.adiciona("       Lances: ");

		int qualItem = 0;
		for (PregaoEletronicoItemLanceModel peilm : new Leiloeiro().obtemMenoresLances(peim.getLances())) {
			qualItem++;
			String[] split = pregaoEletronico.getNumeroEdital().split("/");

			String codigoFornecedorORCOM = buscaNoOrcomPorCFPCNPJ(peilm.getCodigoEmpresa());

			beanC7121.setTIPO1W(TiposLicitacoes.PE.toString());
			beanC7121.setNUM(split[0].replaceAll(REMOVER_NAO_NUMEROS, "").trim());
			beanC7121.setANO(split[1].trim());
			beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_CONSULTAR_QUADRO_DE_PRECOS);
			beanC7121.setPEDIDO("00");
			beanC7121.setORD_TFORN(codigoFornecedorORCOM);
			beanC7121.setITEM(String.valueOf(peim.getCodigoItemSequencial()));

			beanC7121 = c7121.submit(beanC7121);
			if (!"".equals(beanC7121.getXSEEDMSG())) {
				log.erro(String.format("%d) Fornecedor [%s] [%s]: %s", qualItem, peilm.getCodigoEmpresa(),
						codigoFornecedorORCOM, beanC7121.getXSEEDMSG()));
			}

			String prazoEntrega = buscaPrazoDeEntrega(pregaoEletronico.getPrazoDeEntrega());
			String condicaoDePagamento = buscaCondicaoPagamentoORCOM(pregaoEletronico.getCodigoCondicaoPagamento());
			final XMLGregorianCalendar dataInicialDisputa = pregaoEletronico.getDataInicialDisputa();
			String dataOrcamento = conversores.converteDataParaModeloDoOrcom(dataInicialDisputa, DD_M_MYYYY);
			XMLGregorianCalendar novaData = conversores.adicionaRemoveDias(dataInicialDisputa, 60);
			String data = conversores.converteDataParaModeloDoOrcom(novaData, DD_M_MYYYY);

			beanC7121.setMARCA(marcaModeloItem(peilm.getProposta()));
			beanC7121.setPRAZO(prazoEntrega);
			beanC7121.setCOND_PGTO(condicaoDePagamento);
			beanC7121.setDT_ORCAMENTO(dataOrcamento);
			beanC7121.setDT_VALID(data);
			beanC7121.setVL_UNI(peilm.getValorLance().toString());
			beanC7121.setTIPO_DOCW(PESSOA_JURIDICA);

			beanC7121.setCONDICAO_PARTICIPANTEW("0");
			beanC7121.setDESC3_50(trataFabricante(peilm.getProposta().getFabricante()));
			beanC7121.setDESC4_50(trataEmbalagem(peilm.getProposta().getEmbalagem()));

			trataAnvisa(beanC7121, peim, peilm);
			String situacao = trataClassificacao(beanC7121, peilm);

			// Grava o Quadro de Precos
			beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_GRAVAR_QUADRO_DE_PRECOS);
			beanC7121 = c7121.submit(beanC7121);
			String xMsg = beanC7121.getXSEEDMSG();

			if (peilm.getVencedor() == PregaoEletronicoItemLanceModel.LANCE_VENCEDOR) {
				beanC7121.setTIPO1W(TiposLicitacoes.PE.toString());
				beanC7121.setNUM(split[0].replaceAll(REMOVER_NAO_NUMEROS, "").trim());
				beanC7121.setANO(split[1].trim());
				beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_CONSULTAR_QUADRO_DE_PRECOS);
				beanC7121.setPEDIDO("00");
				beanC7121.setORD_TFORN(codigoFornecedorORCOM);
				beanC7121.setHABILITACAO(LANCE_VENCEDOR);
				beanC7121.setITEM(String.valueOf(peim.getCodigoItemSequencial()));
				beanC7121 = c7121.submit(beanC7121);
				beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_RESULTADO);
				c7121.submit(beanC7121);
			}

			geraLogsDoFimDoCadastroDoLanceDoORCOM(1 == qualItem, codigoFornecedorORCOM,
					Integer.valueOf(beanC7121.getTIPO_DOCW()), peilm, situacao, xMsg, peilm.getProposta().getMarca());

		}
		log.adiciona("");
	}

	/**
	 * Formata a embalagem
	 * 
	 * @param qualEmbalagem
	 * @return
	 */
	private String trataEmbalagem(String qualEmbalagem) {
		return null == qualEmbalagem ? "" : "EMBALAGEM: " + qualEmbalagem;
	}

	/**
	 * Formata o fabricante
	 * 
	 * @param qualFabricante
	 * @return
	 */
	private String trataFabricante(String qualFabricante) {
		return (null == qualFabricante ? "" : "FABRICANTE: " + qualFabricante);
	}

	/**
	 * trata a classificacao do fornecedor dentro da licitacao
	 * 
	 * @param beanC7121
	 * @param peilm
	 * @return
	 */
	private String trataClassificacao(C7121Bean beanC7121, PregaoEletronicoItemLanceModel peilm) {
		String situacao = "";
		beanC7121.setHABILITACAOW("");// LIMPA
		beanC7121.setHABILITACAO_MOTIVOW("");// LIMPA
		if (peilm.getVencedor() == PregaoEletronicoItemLanceModel.LANCE_VENCEDOR) {
			beanC7121.setHABILITACAOW(LANCE_VENCEDOR);
			situacao = "Vencedor";
		} else {
			if (peilm.isLanceValido()) {
				beanC7121.setHABILITACAOW(LANCE_CLASSIFICADO);
				situacao = "classificado";
			} else {
				beanC7121.setHABILITACAOW(LANCE_DESCLASSIFICADO);
				situacao = "desclassificado";
				if (null != peilm.getJustificativa()) {
					beanC7121.setHABILITACAO_MOTIVOW(peilm.getJustificativa());
				} else {
					beanC7121.setHABILITACAO_MOTIVOW("Lance inválido - valor acima da referência.");
				}
			}
		}
		return situacao;
	}

	private void trataAnvisa(C7121Bean beanC7121, PregaoEletronicoItemModel peim,
			PregaoEletronicoItemLanceModel peilm) {
		TratamentoDeString tratador = new TratamentoDeString();
		if (peim.getCodigoProduto().startsWith("5")) {
			beanC7121.setISENTO("I");
			beanC7121.setISENTO_W("I");
			if (null != peilm.getProposta().getNumeroDoRegistro()) {
				String stringParaANVISA = tratador.preparaStringParaANVISA(peilm.getProposta().getNumeroDoRegistro(),
						PregaoEletronicoItemLanceModel.TAMANHO_DA_STRING_DE_NUMEROS_DE_REGISTRO_DA_ANVISA);
				
				if ( !"0000000000000".equals(stringParaANVISA) ) {
					peilm.getProposta().setNumeroDoRegistro(stringParaANVISA);
					beanC7121.setREG_ANVISA(stringParaANVISA);
					beanC7121.setISENTO("");
					beanC7121.setISENTO_W("");
				}
			}
		}
	}

	/**
	 * @since 05/12/2018 Alexandre: precisa trazer todos os itens independente da
	 *        situação
	 */
	private void cadastraLanceNoORCOM(int qualItem, CompraDiretaModel compraDireta, C7121 c7121, C7121Bean beanC7121,
			CompraDiretaItemModel cdim) throws OrcomC7121Exception {

		CompraDiretaItemLanceModel cdilm = pegaLanceVencedorDoItem(cdim.getLances());
		if (null == cdilm) {
			return;
		}
		if (qualItem == 1) {
			inicioDoCadastroDoLanceNoORCOM(cdim);
		}

		final String[] split = compraDireta.getNumeroEdital().split("/");
		final String codigoFornecedorORCOM = buscaNoOrcomPorCFPCNPJ(cdilm.getCodigoEmpresa());
		final String numeroCompraDireta = split[0].replaceAll(REMOVER_NAO_NUMEROS, "").trim();
		final String anoCompraDireta = split[1].trim();

		beanC7121 = consultarQuadroDePreco(c7121, beanC7121, cdim, codigoFornecedorORCOM, numeroCompraDireta,
				anoCompraDireta);

		String prazoEntrega = buscaPrazoDeEntrega(compraDireta.getPrazoDeEntrega());
		String condicaoDePagamento = buscaCondicaoPagamentoORCOM(
				Integer.valueOf(compraDireta.getCodigoCondicaoPagamento()));
		String dataOrcamento = conversores.converteDataParaModeloDoOrcom(compraDireta.getDataInicial(), DD_M_MYYYY);
		XMLGregorianCalendar novaData = conversores.adicionaRemoveDias(compraDireta.getDataInicial(), 60);
		String data = conversores.converteDataParaModeloDoOrcom(novaData, DD_M_MYYYY);

		beanC7121.setMARCA(marcaModeloItem(cdilm.getMarca(), cdilm.getModelo()));
		beanC7121.setDT_ORCAMENTO(dataOrcamento);
		beanC7121.setPRAZO(prazoEntrega);
		beanC7121.setCOND_PGTO(condicaoDePagamento);
		beanC7121.setDT_VALID(data);
		beanC7121.setVL_UNI(cdilm.getValorLance().toString());
		beanC7121.setTIPO_DOCW(PESSOA_JURIDICA);
		beanC7121.setHABILITACAOW("");// LIMPA
		beanC7121.setHABILITACAOW(CompraDiretaItemLanceModel.LANCE_VENCEDOR == cdilm.getVencedor() ? LANCE_VENCEDOR
				: LANCE_DESCLASSIFICADO);
		beanC7121.setHABILITACAO_MOTIVOW("");// LIMPA
		beanC7121.setCONDICAO_PARTICIPANTEW("0");
		beanC7121.setDESC3_50(trataFabricante(cdilm.getFabricante()));
		beanC7121.setDESC4_50(trataEmbalagem(cdilm.getEmbalagem()));

		TratamentoDeString tratador = new TratamentoDeString();
		if (cdim.getCodigoProduto().startsWith("5")) {
			if (null != cdilm.getNumeroDoRegistro()) {
				String numeroANVISA = tratador.preparaStringParaANVISA(cdilm.getNumeroDoRegistro(),
						CompraDiretaItemLanceModel.TAMANHO_DA_STRING_DE_NUMEROS_DE_REGISTRO_DA_ANVISA);
				beanC7121.setREG_ANVISA(numeroANVISA);
			} else {
				beanC7121.setISENTO("I");
				beanC7121.setISENTO_W("I");
			}
		}

		beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_GRAVAR_QUADRO_DE_PRECOS);
		C7121Bean submit = c7121.submit(beanC7121);
		String xMsg = submit.getXSEEDMSG();

		beanC7121 = consultarQuadroDePreco(c7121, beanC7121, cdim, codigoFornecedorORCOM, numeroCompraDireta,
				anoCompraDireta);
		beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_RESULTADO);
		submit = c7121.submit(beanC7121);
		xMsg = submit.getXSEEDMSG();

		if (xMsg.trim().endsWith("CHAVE NAO EXISTE")) {
			xMsg = new StringBuilder(xMsg).append(" [Nao existe quadro de preco ?]").toString();
		}

		geraLogsDoFimDoCadastroDoLanceDoORCOM(1 == qualItem, codigoFornecedorORCOM,
				Integer.valueOf(beanC7121.getTIPO_DOCW()), cdilm,
				LANCE_VENCEDOR.equals(beanC7121.getHABILITACAOW()) ? "    Vencedor" : "Nao vencedor", xMsg,
				cdilm.getMarca());

	}

	private void geraLogsDoFimDoCadastroDoLanceDoORCOM(Boolean imprimeHeader, String codigoFornecedorORCOM,
			int beneficiarioLei123, ItemModel item, String situacao, String xMsg, String marca) {

		String lanceValido = (item.isLanceValido() ? "  SIM " : "  NAO ");

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataLance = simpleDateFormat1.format(item.getDataLance().toGregorianCalendar().getTime());

		StringBuilder m = new StringBuilder(marca == null ? "" : marca);

		if (m.length() > 20) {
			m = new StringBuilder(m.substring(0, 19));
		}

		String numeroDoRegistro = null == item.getNumeroDoRegistro() ? " " : item.getNumeroDoRegistro();

		if (Boolean.TRUE.equals(imprimeHeader)) {
			log.adiciona("     Lances");
			log.adiciona(
					"        ORCOM | Fisico/Jurid. | CNPJ           | Ranking | Vencedor        | Data do Lance       | Valor Lance    |   N Registro  | Valido | Marca                | C7121 - submit ao ORCOM");
		}
		log.adiciona(String.format("%13s | %12s  | %14s | %7s | %15s | %19s | %14.4f | %13s | %s | %20s | %s ",
				codigoFornecedorORCOM, beneficiarioLei123, item.getCodigoEmpresa(), item.getNumeroRanking(), situacao,
				dataLance, item.getValorLance(), numeroDoRegistro, lanceValido, m.toString(), xMsg));

	}

	private C7121Bean consultarQuadroDePreco(C7121 c7121, C7121Bean beanC7121, CompraDiretaItemModel cdim,
			String codigoFornecedorORCOM, final String numeroCompraDireta, final String anoCompraDireta) {
		beanC7121.setTIPO1W(TiposLicitacoes.CE.toString());
		beanC7121.setNUM(numeroCompraDireta);
		beanC7121.setANO(anoCompraDireta);
		beanC7121.setOPCAO1_W(TelaC7121.OPCAO1_CONSULTAR_QUADRO_DE_PRECOS);
		beanC7121.setPEDIDO("00");
		beanC7121.setORD_TFORN(codigoFornecedorORCOM);
		beanC7121.setHABILITACAO(LANCE_VENCEDOR);
		beanC7121.setITEM(String.valueOf(cdim.getCodigoItemSequencial()));
		try {
			beanC7121 = c7121.submit(beanC7121);
		} catch (OrcomC7121Exception e) {
			throw new AtualizacaoC7121ControllerException(e);
		}
		return beanC7121;
	}

	private void inicioDoCadastroDoLanceNoORCOM(CompraDiretaItemModel cdim) {
		// 0 1 2 3 1 2 3 1 1 1 2 3 4
		// 1234 12345678 1234567890123 12345678901
		// 123456789012345678901234567890123456789012345 123456789012 1234567890
		// 12345678901234567890123456789012345678901234567890
		log.adiciona(" ");
		log.adiciona(
				"   Seq | Classe     | Item Legado     | Un Medida | Descricao Item                 | Situacao Item | Quantidade |  Vlr Ref | Situacao ");
		log.adiciona(String.format("%6s | %10s | %15s | %9s | %30s | %13s | %10.4f | %8.4f | %s-%s ",
				cdim.getCodigoItemSequencial(), cdim.getCodigoClasse(),
				(null == cdim.getCodigoItemLegado() ? " " : cdim.getCodigoItemLegado()), cdim.getCodigoUnidadeMedida(),
				cdim.getDescricaoItem().substring(0, Math.min(29, cdim.getDescricaoItem().length())).trim(),
				cdim.getSituacaoItem() + " - ATIVO", cdim.getQuantidadeItem(), cdim.getValorReferencia(),
				cdim.getSituacaoCompra().getCodigo(), cdim.getSituacaoCompra().getDescricao()));

	}

	private String marcaModeloItem(PregaoEletronicoItemProposta proposta) {
		return marcaModeloItem(proposta.getMarca(), proposta.getModelo());
	}

	private String marcaModeloItem(String marca, String modelo) {
		StringBuilder sb = new StringBuilder("");
		marca = null == marca ? "" : marca;
		modelo = null == modelo ? "" : modelo;
		if (!marca.isEmpty()) {
			sb.append(marca);
			if (null != modelo && !"".equals(modelo)) {
				sb.append("/");
			}
			sb.append(modelo);
		}
		return sb.toString();
	}

	private String buscaPrazoDeEntrega(PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega) {
		if (prazoDeEntrega.getNumeroDeDias() == PregaoEletronicoPrazoDeEntregaModel.CONFORME_EDITAL) {
			return "C/EDIT.";
		} else {
			return prazoDeEntrega.getNumeroDeDias() + "DIAS";
		}
	}

	private String buscaNoOrcomPorCFPCNPJ(String cnpj) {
		try {
			ORCOMFornecedorController orcom = new ORCOMFornecedorController(ambienteORCOM, this.imprimirQuery);
			OrcomTFornModel fornecedor = orcom.buscaFornecedorPorCNPJ(cnpj);
			return Integer.toString(fornecedor.getORD_TFORN());
		} catch (Exception e) {
			log.excecao(e);
			final String message = MessageFormat.format(
					"Não foi possivel obter o código do fornecedor no ORCOM no ambiente: {0} para o CNPJ [{1}]",
					ambienteORCOM, cnpj);
			throw new AtualizacaoC7121ControllerException(message);
		}
	}

	public List<PregaoEletronicoItemLanceModel> pegaUltimoLanceDeCadaFornecedor(
			List<PregaoEletronicoItemLanceModel> listaDeLancesOriginais) {
		List<PregaoEletronicoItemLanceModel> novaListaDeLances = new ArrayList<PregaoEletronicoItemLanceModel>();

		/* Incluindo uma empresa valida de cada lance */

		for (PregaoEletronicoItemLanceModel peilm : listaDeLancesOriginais) {
			if (!novaListaDeLances.isEmpty()) {

				boolean empresaJaIncluida = false;
				for (int i = 0; i < novaListaDeLances.size(); i++) {
					if (novaListaDeLances.get(i).getCodigoEmpresa().equals(peilm.getCodigoEmpresa())) {
						empresaJaIncluida = true;
						break;
					}
				}

				if (!empresaJaIncluida) {
					novaListaDeLances.add(peilm);
				}
			} else {
				novaListaDeLances.add(peilm);
			}

		}

		// pegando o menor lance valido de cada empresa
		for (int i = 0; i < novaListaDeLances.size(); i++) {
			for (PregaoEletronicoItemLanceModel peilm : listaDeLancesOriginais) {
				final PregaoEletronicoItemLanceModel itemLance = novaListaDeLances.get(i);
				final boolean isMesmaEmpresa = itemLance.getCodigoEmpresa().equals(peilm.getCodigoEmpresa());
				if (isMesmaEmpresa && (itemLance.getValorLance().compareTo(peilm.getValorLance()) > 0)) {
					novaListaDeLances.set(i, peilm);
				}
			}
		}

		// verifica + uma vez pela exclusao do buble sort
		for (int i = 0; i < novaListaDeLances.size(); i++) {
			for (PregaoEletronicoItemLanceModel peilm : listaDeLancesOriginais) {
				final PregaoEletronicoItemLanceModel itemLance = novaListaDeLances.get(i);
				final boolean isMesmaEmpresa = itemLance.getCodigoEmpresa().equals(peilm.getCodigoEmpresa());
				if (isMesmaEmpresa && (itemLance.getValorLance().compareTo(peilm.getValorLance()) > 0)) {
					itemLance.setValorLance(peilm.getValorLance());
				}
			}
		}

		ordenacaoDescendente(novaListaDeLances);

		return novaListaDeLances;
	}

	/** Ordenando do maior para o menor */
	private void ordenacaoDescendente(List<PregaoEletronicoItemLanceModel> novaListaDeLances) {
		Collections.sort(novaListaDeLances, new Comparator<PregaoEletronicoItemLanceModel>() {
			@Override
			public int compare(PregaoEletronicoItemLanceModel obj1, PregaoEletronicoItemLanceModel obj2) {
				return obj2.getValorLance().compareTo(obj1.getValorLance());
			}

		});
	}

	@SuppressWarnings("unused")
	private List<CompraDiretaItemLanceModel> pegaUltimoLanceDaCompraDiretaDeCadaFornecedor(
			List<CompraDiretaItemLanceModel> listaDeLancesOriginais) {
		List<CompraDiretaItemLanceModel> novaListaDeLances = new ArrayList<CompraDiretaItemLanceModel>();

		// Incluindo uma empresa valida de cada lance
		for (CompraDiretaItemLanceModel deilm : listaDeLancesOriginais) {
			if (!novaListaDeLances.isEmpty()) {

				boolean empresaJaIncluida = false;
				for (int i = 0; i < novaListaDeLances.size(); i++) {
					if (novaListaDeLances.get(i).getCodigoEmpresa().equals(deilm.getCodigoEmpresa())) {
						empresaJaIncluida = true;
						break;
					}
				}

				if (!empresaJaIncluida) {
					novaListaDeLances.add(deilm);
				}
			} else {
				novaListaDeLances.add(deilm);
			}

		}

		// pegando o menor lance valido de cada empresa
		for (int i = 0; i < novaListaDeLances.size(); i++) {
			for (CompraDiretaItemLanceModel cdilm : listaDeLancesOriginais) {
				if (novaListaDeLances.get(i).getCodigoEmpresa().equals(cdilm.getCodigoEmpresa())
						&& novaListaDeLances.get(i).getValorLance().compareTo(cdilm.getValorLance()) > 0) {
					novaListaDeLances.set(i, cdilm);

				}
			}
		}

		// verifica + uma vez pela exclusao do buble sort
		for (int i = 0; i < novaListaDeLances.size(); i++) {
			for (CompraDiretaItemLanceModel cdilm : listaDeLancesOriginais) {
				final CompraDiretaItemLanceModel itemLance = novaListaDeLances.get(i);
				if (itemLance.getCodigoEmpresa().equals(cdilm.getCodigoEmpresa())
						&& itemLance.getValorLance().compareTo(cdilm.getValorLance()) > 0) {
					itemLance.setValorLance(cdilm.getValorLance());

				}
			}
		}

		// Ordenando do maior para o menor

		Collections.sort(novaListaDeLances, new Comparator<CompraDiretaItemLanceModel>() {

			@Override
			public int compare(CompraDiretaItemLanceModel obj1, CompraDiretaItemLanceModel obj2) {

				return obj2.getValorLance().compareTo(obj1.getValorLance());
			}

		});

		return novaListaDeLances;
	}

	/**
	 * @since 06/MAR/2020 Nao usado. Remover se nao for mais necessario
	 * 
	 * @param listaDeLancesOriginais
	 * @return
	 */
	private CompraDiretaItemLanceModel pegaLanceVencedorDoItem(
			List<CompraDiretaItemLanceModel> listaDeLancesOriginais) {

		for (CompraDiretaItemLanceModel deilm : listaDeLancesOriginais) {
			if (deilm.getVencedor() == CompraDiretaItemLanceModel.LANCE_VENCEDOR) {
				return deilm;
			}
		}

		return null;
	}

	private String buscaCondicaoPagamentoORCOM(int condicao) {
		final String cond = condicao == 2 ? "15DFQ" : "C/EDIT";
		return (condicao == 1 ? "5DU" : cond);
	}

	public List<PregaoEletronicoModel> selecionaPregoesHomologados(String quantidadePregoes) throws SQLException {
		return pregaoEletronicoDAO.selecionaPregoesHomologados(quantidadePregoes);
	}

	public List<CompraDiretaModel> selecionaComprasHomologadas() throws SQLException {
		return compraDiretaDAO.selecionaComprasHomologadas();
	}

	private Integer preparaNumeroPregaoEletronico(String numeroEdital) {

		if (numeroEdital.contains("/")) {

			String[] numeroSplit = numeroEdital.split("/");

			Integer numero = Integer.valueOf(numeroSplit[0].replaceAll(REMOVER_NAO_NUMEROS, ""));
			Integer ano = Integer.valueOf(numeroSplit[1].replaceAll(REMOVER_NAO_NUMEROS, ""));

			return ano*100000+numero;
		} else {
			return 0;
		}
	}

	private boolean isAnoValido(String ano) {
		return ano != null && !ano.isEmpty();
	}

}
