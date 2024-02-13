package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.orcom.cforx.CFORX;
import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.menusetelas.ComandosOrcom;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaCFORX;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.BuscadorCodigoFornecedor;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.OcupacaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosAgencia;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosBanco;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCadastrais;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosContaCorrente;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosLC;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosOcupacao;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.gui.FichaCForx;
import br.gov.sp.saobernardo.webservice.orcom.dao.UsuarioSenha;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.BancoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.OcupacaoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class AtualizacaoCFORXController {

	Conexao conexaoParadigma;
	EmpresaDAO empresaDAO;
	BancoDAO bancoDAO;
	OcupacaoDAO ocupacaoDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;
	private String ambienteWBC;
	private boolean imprimirQuery;

	public AtualizacaoCFORXController(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery) throws IOException {
		inicia(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog());
	}

	public AtualizacaoCFORXController(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)  {
		inicia(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log) );
	}

	public AtualizacaoCFORXController(ContextoImportacao ci) throws Exception {
		inicia( ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery(), new ArquivoDeLog());
	}

	/**
	 *  Metodo executado pelos construtores
	 * @param ambienteWBC
	 * @param ambienteORCOM
	 * @param imprimirQuery
	 * @param arquivoDeLog 
	 * @throws IOException
	 */
	private void inicia(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog arquivoDeLog) {
		this.ambienteWBC = ambienteWBC;
		this.ambienteORCOM = ambienteORCOM;
		this.imprimirQuery = imprimirQuery;
		this.log = arquivoDeLog;
	}

	public void abreConexao() throws Exception {
		conexaoParadigma = new Conexoes().getConexao(ambienteWBC);
		conexaoParadigma.conecta();
		empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		bancoDAO = new BancoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		ocupacaoDAO = new OcupacaoDAO(conexaoParadigma.getConnection(), imprimirQuery);
	}

	public void fechaConexao() {
		if (conexaoParadigma != null) {
			conexaoParadigma.fecha();
		}
	}

	public void atualizaDadosCadastraisDeCnpj(String cnpj) throws Exception {
		log.rotina("CFORX", "atualiza dados cadastrais de cnpj");
		if (conexaoParadigma == null) {
			abreConexao();
		}
		
		EmpresaModel empresa = empresaDAO.buscaPeloCnpj(cnpj);
		final boolean isFornecedorNaoIdentificado = null == empresa.getCodigoFornecedor();
		String msg = (isFornecedorNaoIdentificado? "Fornecedor:<codigo ORCOM ainda nao foi atribuido>":empresa.getNomeEmpresa() );
		log.adiciona( String.format( "Identificando fornecedor CNPJ  : %s %s", (isFornecedorNaoIdentificado ? "" : empresa.getCnpj() ), msg) );
		String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);

		if (null != fornecedor) {
			empresa.setCodigoFornecedor(fornecedor);
		}

		if (empresa.getSituacao().getSituacaoEmpresa() == 0) {
			log.erro("Fornecedor Inativo.  Terminando.");
			return;
		}

		M077 telaDoMenu = new MenuOrcomM077( ambienteORCOM ).getMenu();
		M077Bean dadosDaTelaDeMenu = telaDoMenu.loadPage();
		dadosDaTelaDeMenu.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_02_CADASTRO_DE_FORNECEDOR );
		telaDoMenu.submit(dadosDaTelaDeMenu);
		CFORX cforx = new br.gov.sp.saobernardo.orcom.menusetelas.TelaCFORX( telaDoMenu, ambienteORCOM ).getTela();
		CFORXBean dadosDaTelaDeAlteracao = cforx.redirecionadaDaTela();
		dadosDaTelaDeAlteracao.setORD_TFORN(empresa.getCodigoFornecedor());
		dadosDaTelaDeAlteracao.setOPCAO3(ComandosOrcom.INQ.toString());

		CFORXBean dadosDoFornecedor = cforx.submit(dadosDaTelaDeAlteracao);
		DeParaDadosCadastrais deParaDadosCadastrais = new DeParaDadosCadastrais(log);
		deParaDadosCadastrais.populaDados(empresa, dadosDoFornecedor);
	 
		//final boolean isAtivacaoDesconhecida = TelaCFORX.FORNECEDOR_ATIVACAO_DESCONHECIDA.equals(dadosDoFornecedor.getATIVOC());
		//final boolean isInativo = TelaCFORX.FORNECEDOR_INATIVO.equals(dadosDoFornecedor.getATIVOC());
		//if (isAtivacaoDesconhecida || isInativo) {
			log.adiciona(" Ativando fornecedor => ATIVOC", dadosDoFornecedor.getATIVOC(), TelaCFORX.FORNECEDOR_ATIVO);
			dadosDoFornecedor.setATIVOC_WS(TelaCFORX.FORNECEDOR_ATIVO);
		//}

		DeParaDadosLC deParaDadosLC = new DeParaDadosLC(log);
		deParaDadosLC.populaDados(empresa.getMicroOuPequenoPorte(), dadosDoFornecedor);

		OcupacaoModel ocupacao = ocupacaoDAO
				.buscaPeloCodigoDeEmpresaParadigma(Long.valueOf(empresa.getCodigoEmpresa()));

		if ( !ocupacao.isEmpty()) {
			DeParaDadosOcupacao deParaDadosOcupacao = new DeParaDadosOcupacao(log);
			deParaDadosOcupacao.populaDados(ocupacao, dadosDoFornecedor);
		}

		/**
		 * Se os dados bancarios nao vierem do SECOM, estes serao desprezados e
		 * preenchidos posteriormente no ORCOM
		 */
		BancoModel banco = bancoDAO.buscaPeloCodigoDeEmpresaParadigma(Long.valueOf(empresa.getCodigoEmpresa()));

		
		List<String> errosDadosBancarios = new ArrayList<String>();
		
		if (banco == null) {
			errosDadosBancarios.add("Nenhuma informação de banco encontrada.VERIFIQUE no SECOM");
		}
		if (banco.getAgencia() == null) {
			errosDadosBancarios.add("Numero da conta/digito não encontrado. VERIFIQUE no SECOM");
		}
		if (banco.getContaCorrente() == null) {
			errosDadosBancarios.add("AGENCIA BANCÁRIA não encontrada. VERIFIQUE no SECOM");
		}
		
		if (!errosDadosBancarios.isEmpty()) {
			StringBuilder s = new StringBuilder("\n");
			s.append("=========================================\n");
			s.append("Erros nas informacoes de dados bancarios:\n");
			s.append(empresa.toString()).append("\n");
			for (String e : errosDadosBancarios) {
				s.append("<span style=\"text-decoration: underline double #ff0000;\">").append(e).append("</span>\n");
			}
			s.append("=========================================\n");
			log.adiciona(s.toString());
			//throw new AtualizacaoCFORXException(s.toString());
		}else{
			DeParaDadosBanco deParaDadosBanco = new DeParaDadosBanco(log);
			deParaDadosBanco.populaDados(banco, dadosDoFornecedor);

			DeParaDadosAgencia deParaDadosAgencia = new DeParaDadosAgencia(log);
			deParaDadosAgencia.populaDados(banco.getAgencia(), dadosDoFornecedor);

			DeParaDadosContaCorrente deParaDadosContaCorrente = new DeParaDadosContaCorrente(log);
			deParaDadosContaCorrente.populaDados(banco.getContaCorrente(), dadosDoFornecedor);
		}

		dadosDoFornecedor.setOPCAO3(ComandosOrcom.CHG.toString());
		UsuarioSenha usuario = new UsuarioSenha();
		dadosDoFornecedor.setMATRICULA1(usuario.getMatricula());
		dadosDoFornecedor.setTSENHA(usuario.getSenha());

		CFORXBean submit = cforx.submit(dadosDoFornecedor);
		
		FichaCForx ficha = new FichaCForx(dadosDoFornecedor);

		log.adiciona( ficha.tela()); 
		log.erroXSeed(submit.getXSEEDMSG(), empresa.getCodigoFornecedor(), empresa.getCnpj(), empresa.getNomeEmpresa());
		
	}

	public void atualizaDadosCadastraisDeEmpresas() throws Exception {
		for (EmpresaModel empresa : empresaDAO.buscaDadosCadastraisDeEmpresas()) {
			atualizaDadosCadastraisDeCnpj(empresa.getCnpj());
		}
	}

	public void atualizaDadosCadastraisDeEmpresasAlteradasRecentemente() throws Exception {
		for (EmpresaModel empresa : empresaDAO.buscaTodasEmpresasAlteradasRecentemente()) {
			atualizaDadosCadastraisDeCnpj(empresa.getCnpj());
		}
	}

}
