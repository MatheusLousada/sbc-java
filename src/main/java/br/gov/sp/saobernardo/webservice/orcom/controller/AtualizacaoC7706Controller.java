package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import br.gov.sp.saobernardo.orcom.c7706.C7706;
import br.gov.sp.saobernardo.orcom.c7706.C7706Bean;
import br.gov.sp.saobernardo.orcom.c7706.OrcomC7706Exception;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.menusetelas.ComandosOrcom;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7706;
import br.gov.sp.saobernardo.webservice.classes.modelos.BuscadorCodigoFornecedor;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoDeRegularidadeDoFGTS;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegDebitosTrabalhistas;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegFalenciaEConcordata;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosEstaduais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosFederais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosMunicipaisMobi;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCertidoes;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.orcom.dao.UsuarioSenha;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DocumentoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;
import br.gov.sp.saobernardo.webservice.paradigma.util.DateFormatter;

/**
 * @author 41476
 *
 */
public class AtualizacaoC7706Controller {
	private static final String NOME_TELA = "C7706";
	
	Conexao conexaoParadigma;
	EmpresaDAO eDAO;
	DocumentoDAO dDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;

	// public AtualizacaoC7706Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery)
	// 		throws Exception {
	// 	iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog());
	// }

	// public AtualizacaoC7706Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)
	// 		throws Exception {
	// 	iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log));
	// }

	// public AtualizacaoC7706Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog log)
	// 		throws Exception {
	// 	iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, log);
	// }

	public AtualizacaoC7706Controller(ContextoImportacao ci) throws Exception {
		conexaoParadigma = new Conexoes().getConexao(ci.getOrigem());
		conexaoParadigma.conecta();
		eDAO = new EmpresaDAO(conexaoParadigma.getConnection(), ci);
		dDAO = new DocumentoDAO(conexaoParadigma.getConnection(), ci);
		this.log = log;
		this.ambienteORCOM = ambienteORCOM;

	}

	public void atualizaCertificadosDeCnpj(String cnpj) throws Exception {

		log.rotina(NOME_TELA, "atualiza Certificados De Cnpj ");
		
		EmpresaModel empresa = eDAO.buscaPeloCnpj(cnpj);
		log.adiciona(String.format("Fornecedor:%s", (null == empresa.getCodigoFornecedor() ? "<codigo ORCOM ainda nao foi atribuido>" : empresa.getCodigoFornecedor())));
		log.adiciona("CNPJ:" + empresa.getCnpj());

		String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);
		log.adiciona("Codigo fornecedor do ORCOM:" + fornecedor);

		if (null != fornecedor) {
			empresa.setCodigoFornecedor(fornecedor);
		}

		if (empresa.getSituacao().getSituacaoEmpresa() == 0) {
			log.erro("Fornecedor Inativo.");
			return;
		}

		defineCertificados(empresa);

	
		M077 telaDoMenu =  new MenuOrcomM077(  ambienteORCOM ).getMenu();
		M077Bean dadosDaTelaDeMenu = telaDoMenu.loadPage();
		log.adiciona(telaDoMenu.getGLB_WORK());
		dadosDaTelaDeMenu.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_05_CERTIFICADO_REGISTRO_CADASTRAL_CRC);
		telaDoMenu.submit(dadosDaTelaDeMenu);

		C7706 telaCertificados = new TelaC7706(telaDoMenu, ambienteORCOM ).getTela();
		
		C7706Bean dadosCertificados = telaCertificados.redirecionadaDaTela();
		dadosCertificados.setORD_TFORN(empresa.getCodigoFornecedor());
		dadosCertificados.setOPCAO3(ComandosOrcom.INQ.toString());

		C7706Bean dadosDaAlteracao = telaCertificados.submit(dadosCertificados);

/*
		DeParaDadosCertidaoNegTributosMunicipaisMobi deParaDadosCertidaoNegTributosMunicipaisMobi = new DeParaDadosCertidaoNegTributosMunicipaisMobi( log);
		deParaDadosCertidaoNegTributosMunicipaisMobi.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
		executar(dadosDaAlteracao, telaCertificados, empresa);
	*/
		DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi> dePara = new DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi>( log, CertidaoNegTributosMunicipaisMobi.CAMPO_DATA);
		dePara.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
		executar(dadosDaAlteracao, telaCertificados, empresa);

	}

	public void atualizaCertificadosDeEmpresas() throws Exception {

		log.rotina(NOME_TELA, "atualiza Certificados De Empresas ");

		for (EmpresaModel empresa : eDAO.buscaDadosCadastraisDeEmpresas()) {
			identificaOFornecedorNoOrcom(empresa);
			
			defineCertificados(empresa);

			new Conversores(null).stringParaCalendar(empresa.getCertidaoNegTributosEstaduais().getDataDeValidade());

			M077 telaDoMenu = new MenuOrcomM077(  ambienteORCOM ).getMenu();
			M077Bean dadosDaTelaDeMenu = telaDoMenu.loadPage();
			log.adiciona(telaDoMenu.getGLB_WORK());
			dadosDaTelaDeMenu.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_02_CADASTRO_DE_FORNECEDOR);
			telaDoMenu.submit(dadosDaTelaDeMenu);

			C7706 telaCertificados = new TelaC7706(telaDoMenu, ambienteORCOM).getTela();
			C7706Bean dadosCertificados = telaCertificados.redirecionadaDaTela();

			if (null != empresa.getCodigoFornecedor()) {
				dadosCertificados.setORD_TFORN(empresa.getCodigoFornecedor());
				dadosCertificados.setOPCAO3(ComandosOrcom.INQ.toString());

				C7706Bean dadosDaAlteracao = telaCertificados.submit(dadosCertificados);

				if (null != empresa.getCertidaoNegTributosMunicipaisMobi()) {
					/*
					DeParaDadosCertidaoNegTributosMunicipaisMobi deParaCertNegTribMunMobi = new DeParaDadosCertidaoNegTributosMunicipaisMobi( log );
					deParaCertNegTribMunMobi.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
					*/
					DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi> dePara = new DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi>( log,CertidaoNegTributosMunicipaisMobi.CAMPO_DATA);
					dePara.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
				}
				executar(dadosDaAlteracao, telaCertificados, empresa);
				
			}
		}

	}

	public void atualizaDadosCadastraisDeEmpresasAlteradasRecentemente() throws Exception {
		log.rotina(NOME_TELA, "atualiza Dados Cadastrais De Empresas Alteradas Recentemente");

		for (EmpresaModel empresa : eDAO.buscaTodasEmpresasAlteradasRecentemente()) {
			identificaOFornecedorNoOrcom(empresa);
			defineCertificados(empresa);

			M077 telaDoMenu = new MenuOrcomM077(  ambienteORCOM ).getMenu();
			M077Bean paginaOrcom = telaDoMenu.loadPage();
			log.adiciona(telaDoMenu.getGLB_WORK());
			paginaOrcom.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_02_CADASTRO_DE_FORNECEDOR);
			telaDoMenu.submit(paginaOrcom);

			C7706 telaCertificados = new  TelaC7706(telaDoMenu, ambienteORCOM).getTela();
			C7706Bean dadosCertificados = telaCertificados.redirecionadaDaTela();

			if (null != empresa.getCodigoFornecedor()) {
				dadosCertificados.setORD_TFORN(empresa.getCodigoFornecedor());
				dadosCertificados.setOPCAO3(ComandosOrcom.INQ.toString());

				C7706Bean dadosDaAlteracao = telaCertificados.submit(dadosCertificados);

				if (null != empresa.getCertidaoNegTributosMunicipaisMobi()) {
					/*
					DeParaDadosCertidaoNegTributosMunicipaisMobi deParaDadosCertidaoNegTributosMunicipaisMobi = new DeParaDadosCertidaoNegTributosMunicipaisMobi( log);
					deParaDadosCertidaoNegTributosMunicipaisMobi.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
					*/
					DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi> dePara = new DeParaDadosCertidoes<CertidaoNegTributosMunicipaisMobi>( log,CertidaoNegTributosMunicipaisMobi.CAMPO_DATA);
					dePara.populaDados(empresa.getCertidaoNegTributosMunicipaisMobi(), dadosDaAlteracao);
				}

				executar(dadosDaAlteracao, telaCertificados, empresa);

			}
		}
	}
	
	private void defineCertificados(EmpresaModel empresa) throws SQLException {
		final Long codigoEmpresa = Long.valueOf(empresa.getCodigoEmpresa());
		empresa.setCertidaoNegTributosMunicipaisMobi(dDAO.buscaCertidaoNegTributosMunicipaisMobi(codigoEmpresa));
		empresa.setCertidaoNegTributosEstaduais(dDAO.buscaCertidaoNegTributosEstaduais(codigoEmpresa));
		empresa.setCertidaoNegTributosFederais(dDAO.buscaCertidaoNegTributosFederais(codigoEmpresa));
		empresa.setCertidaoNegDebitosTrabalhistas(dDAO.buscaCertidaoNegDebitosTrabalhistas(codigoEmpresa));
		empresa.setCertidaoNegFalenciaEConcordata(dDAO.buscaCertidaoNegFalenciaEConcordata(codigoEmpresa));
		empresa.setCertidaoDeRegularidadeDoFGTS(dDAO.buscaCertidaoRegularidadeDoGets(codigoEmpresa));
		
 		log.adiciona(                       "   Certificados                                    ");
		log.adiciona(                       "   ------------------------------------------------");
		log.adiciona( isCertificadoVencido( "   CERTIDÃO NEG.TRIBUTOS MUNICIPAIS MOBILIÁRIO      : %s %s", empresa.getCertidaoNegTributosMunicipaisMobi().getDataDeValidade() ) );
		log.adiciona( isCertificadoVencido( "   CERTIDÃO NEGATIVA DE TRIBUTOS ESTADUAIS          : %s %s", empresa.getCertidaoNegTributosEstaduais().getDataDeValidade() ) );
		log.adiciona( isCertificadoVencido( "   CERT.CONJUNTA NEG.TRIB.FEDERAL E DIV.ATIVA UNIÃO : %s %s", empresa.getCertidaoNegTributosFederais().getDataDeValidade() ) );
		log.adiciona( isCertificadoVencido( "   CERTIDÃO NEGATIVA DE DÉBITOS TRABALHISTAS        : %s %s", empresa.getCertidaoNegDebitosTrabalhistas().getDataDeValidade() ) );
		log.adiciona( isCertificadoVencido( "   CERTIDÃO NEGATIVA DE FALÊNCIA E CONCORDATA       : %s %s", empresa.getCertidaoNegFalenciaEConcordata().getDataDeValidade() ) );
		log.adiciona( isCertificadoVencido( "   CERTIFICADO DE REGULARIDADE DO FGTS              : %s %s", empresa.getCertidaoDeRegularidadeDoFGTS().getDataDeValidade() ) );
	}
	
	private String isCertificadoVencido( String titulo, String valor ){
		if( valor.isEmpty()){
			return "Sem informacao";
		}
		Long d    = toAnsiDate( valor );
		Long hoje =  toAnsiDate( DateFormatter.formataDiaMesAno( DateTime.now().toDate() ) );
		boolean b = ( hoje > d );
		return String.format( titulo, dataFormatada(valor ), (  b ? "Vencido":"OK     " ) ); 
	}
	
	/** Coloca a data no formato aaaaMMdd
	 * @param date : data no formato ddMMaaaa
	 * @return data no formato aaaaMMdd
	 */
	private Long toAnsiDate( String date ){
		String[] s = dataFormatada( date ).split("/");		
		return Long.valueOf(String.format("%s%s%s", s[2], s[1], s[0]));
	}
	
	/** formata a data separando os campos por /
	 * @param data no formato ddMMaaaa
	 * @return data no formata dd/MM/aaaa
	 */
	private String dataFormatada( String data ){
		StringBuilder df = new StringBuilder( data );
		df.insert(4, '/');
		df.insert(2, '/');
		return df.toString();
	}
	
	private void identificaOFornecedorNoOrcom(EmpresaModel empresa) throws Exception {
		log.adiciona("Fornedor: " + empresa.getCodigoFornecedor());
		log.adiciona("CNPJ: " + empresa.getCnpj());
		
		String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);
		
		log.adiciona("Codigo fornecedor do ORCOM:" + fornecedor);
		if (null != fornecedor) {
			empresa.setCodigoFornecedor(fornecedor);
		}
	}

	private void executar(C7706Bean dadosDaAlteracao, C7706 telaCertificados, EmpresaModel empresa) throws OrcomC7706Exception {
		UsuarioSenha usuario = new UsuarioSenha();
		/*
		if (null != empresa.getCertidaoNegTributosEstaduais()) {
			DeParaDadosCertidaoNegTributosEstaduais deParaDadosCertidaoNegTributosEstaduais = new DeParaDadosCertidaoNegTributosEstaduais( log);
			deParaDadosCertidaoNegTributosEstaduais.populaDados(empresa.getCertidaoNegTributosEstaduais(), dadosDaAlteracao);
		}

		if (null != empresa.getCertidaoNegTributosFederais()) {
			DeParaDadosCertidaoNegTributosFederais deParaDadosCertidaoNegTributosFederais = new DeParaDadosCertidaoNegTributosFederais( log);
			deParaDadosCertidaoNegTributosFederais.populaDados(empresa.getCertidaoNegTributosFederais(), dadosDaAlteracao);
		}

		if (null != empresa.getCertidaoNegDebitosTrabalhistas()) {
			DeParaDadosCertidaoNegDebitosTrabalhistas deParaDadosCertidaoNegDebitosTrabalhistas = new DeParaDadosCertidaoNegDebitosTrabalhistas( log);
			deParaDadosCertidaoNegDebitosTrabalhistas.populaDados(empresa.getCertidaoNegDebitosTrabalhistas(), dadosDaAlteracao);
		}

		if (null != empresa.getCertidaoNegFalenciaEConcordata()) {
			DeParaDadosCertidaoNegFalenciaEConcordata deParaDadosCertidaoNegFalenciaEConcordata = new DeParaDadosCertidaoNegFalenciaEConcordata( log);
			deParaDadosCertidaoNegFalenciaEConcordata.populaDados(empresa.getCertidaoNegFalenciaEConcordata(), dadosDaAlteracao);
		}
		*/
		
		if (null != empresa.getCertidaoNegTributosEstaduais()) {
			DeParaDadosCertidoes<CertidaoNegTributosEstaduais> dePara = new DeParaDadosCertidoes<CertidaoNegTributosEstaduais>( log,CertidaoNegTributosEstaduais.CAMPO_DATA);
			dePara.populaDados(empresa.getCertidaoNegTributosEstaduais(), dadosDaAlteracao);
		}
		
		if (null != empresa.getCertidaoNegTributosFederais()) {
			DeParaDadosCertidoes<CertidaoNegTributosFederais> dePara = new DeParaDadosCertidoes<CertidaoNegTributosFederais>( log,CertidaoNegTributosFederais.CAMPO_DATA);
			dePara.populaDados(empresa.getCertidaoNegTributosFederais(), dadosDaAlteracao);
		}
		
		if (null != empresa.getCertidaoNegDebitosTrabalhistas()) {
			DeParaDadosCertidoes<CertidaoNegDebitosTrabalhistas> dePara = new DeParaDadosCertidoes<CertidaoNegDebitosTrabalhistas>( log, CertidaoNegDebitosTrabalhistas.CAMPO_DATA);
			dePara.populaDados(empresa.getCertidaoNegDebitosTrabalhistas(), dadosDaAlteracao);
		}
		
		if (null != empresa.getCertidaoNegFalenciaEConcordata()) {
			DeParaDadosCertidoes<CertidaoNegFalenciaEConcordata> dePara = new DeParaDadosCertidoes<CertidaoNegFalenciaEConcordata>( log, CertidaoNegFalenciaEConcordata.CAMPO_DATA);
			dePara.populaDados(empresa.getCertidaoNegFalenciaEConcordata(), dadosDaAlteracao);
		}
		
		if (null != empresa.getCertidaoDeRegularidadeDoFGTS()) {
			DeParaDadosCertidoes<CertidaoDeRegularidadeDoFGTS> dePara = new DeParaDadosCertidoes<CertidaoDeRegularidadeDoFGTS>( log, CertidaoDeRegularidadeDoFGTS.CAMPO_DATA);
			dePara.populaDados(empresa.getCertidaoDeRegularidadeDoFGTS(), dadosDaAlteracao);
		}

		dadosDaAlteracao.setOPCAO3(ComandosOrcom.CHG.toString());
		dadosDaAlteracao.setMATRICULA1(usuario.getMatricula());
		dadosDaAlteracao.setTSENHA(usuario.getSenha());

		C7706Bean submit = telaCertificados.submit(dadosDaAlteracao);

		log.erroXSeed(submit.getXSEEDMSG(), empresa.getCodigoFornecedor(), empresa.getCnpj(), empresa.getNomeEmpresa());

	}

}
