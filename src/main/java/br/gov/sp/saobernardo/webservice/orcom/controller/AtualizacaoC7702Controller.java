package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.orcom.c7702.C7702;
import br.gov.sp.saobernardo.orcom.c7702.C7702Bean;
import br.gov.sp.saobernardo.orcom.cforx.CFORX;
import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.m077.OrcomM077Exception;
import br.gov.sp.saobernardo.orcom.menusetelas.ComandosOrcom;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7702;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaCFORX;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.BuscadorCodigoFornecedor;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.OcupacaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoDeEndereco;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoPessoa;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosAgencia;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosBanco;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCadastrais;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCep;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCepCorrespondencia;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosContaCorrente;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosEndereco;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosEnderecoCorrespondencia;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosEnderecoORCOM;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosLC;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosOcupacao;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.dao.UsuarioSenha;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.BancoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EnderecoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.OcupacaoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class AtualizacaoC7702Controller {

	private Conexao conexaoParadigma;
	private EmpresaDAO eDAO;
	private BancoDAO bDAO;
	private EnderecoDAO endDAO;
	private OcupacaoDAO oDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;
	private AtualizacaoC7703Controller atualizacaoC7703Controller;
	private AtualizacaoC7706Controller atualizacaoC7706Controller;
	private DeParaDadosCep deParaDadosCep;
	private DeParaDadosCepCorrespondencia deParaDadosCepCorrespondencia;
	private DeParaDadosCadastrais deParaDadosCadastrais;
	private DeParaDadosLC deParaDadosLC;
	private DeParaDadosEndereco deParaDadosEndereco;
	private DeParaDadosEnderecoCorrespondencia deParaDadosEnderecoCorrespondencia;
	private DeParaDadosEnderecoORCOM deParaDadosEnderecoORCOM;
	private DeParaDadosBanco deParaDadosBanco;
	private DeParaDadosAgencia deParaDadosAgencia;
	private DeParaDadosContaCorrente deParaDadosContaCorrente;
	private M077 m077;
	private M077Bean pageM077;
	private C7702 c7702;
	private C7702Bean dadosC7702;

	public AtualizacaoC7702Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog() );
	}

	public AtualizacaoC7702Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log));
	}

	public AtualizacaoC7702Controller(ContextoImportacao ci) throws Exception {
		iniciar(ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery(), new ArquivoDeLog());
	}

	private void iniciar(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog log) throws Exception{
		conexaoParadigma = new Conexoes().getConexao(ambienteWBC);
		conexaoParadigma.conecta();
		eDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		bDAO = new BancoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		endDAO = new EnderecoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		oDAO = new OcupacaoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		this.log = log;
		this.ambienteORCOM = ambienteORCOM;
		atualizacaoC7703Controller = new AtualizacaoC7703Controller(ambienteWBC, ambienteORCOM, imprimirQuery);
		atualizacaoC7706Controller = new AtualizacaoC7706Controller(ambienteWBC, ambienteORCOM, imprimirQuery);
	}
	
	public void cadastraDadosDeCnpj(String cnpj) throws Exception  {
		log.rotina(  "C7702", "Cadastrar dados de cnpj");
		log.adiciona("CNPJ: " + cnpj );
		EmpresaModel e = eDAO.buscaNovoPeloCnpj(cnpj);
		if (null == e.getCodigoFornecedor()) {
			log.adiciona("Fornecedor:<codigo ORCOM ainda nao foi atribuido>");
  		}
		String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(e.getCnpj(), ambienteORCOM);

		log.adiciona("Código fornecedor do ORCOM:" + fornecedor);
		if (null != fornecedor) {
			e.setCodigoFornecedor(fornecedor);
		}

		if (e.getSituacao().getSituacaoEmpresa() == 0) {
			log.erro("Fornecedor Inativo.");
			return;
		}

		if ("0".equals(fornecedor)) {
			
			acionaMenuM077_Inclusao();
			
			dadosC7702.setTP_IDENTWS(TipoPessoa.NAO_IDENTIFICADO.getTipo());
			dadosC7702.setTP_IDENT(TipoPessoa.NAO_IDENTIFICADO.getTipo());
	
			if (TipoPessoa.PESSOA_JURIDICA.getTipo().equals(e.getTipoIdentificacao())) {
				dadosC7702.setCGC_CPF1(e.getCnpj());
			} else {
				dadosC7702.setCPFINDIV(e.getCnpj());
			}

			final long codigoEmpresa = Long.parseLong(e.getCodigoEmpresa());
			final EnderecoModel endereco = endDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa,
					TipoDeEndereco.MATRIZ.getCodigo());
			e.setEndereco(endereco);
			e.setEnderecoCorrespondencia(endereco);

			iniciarDeParas();

			deParaDadosCep.populaDados(e.getEndereco(), dadosC7702);
			deParaDadosCepCorrespondencia.populaDados(e.getEnderecoCorrespondencia(), dadosC7702);

			dadosC7702.setOPCAO1WS( TelaC7702.OPCAO1_3_INCLUSAO_DE_FORNECEDOR);
			c7702.submit(dadosC7702);

			CFORX cforx = new TelaCFORX(m077, c7702, ambienteORCOM).getTela();
			CFORXBean dadosCFORX = cforx.redirecionadaDaTela();

			deParaDadosCadastrais.populaDados(e, dadosCFORX);
			deParaDadosLC.populaDados(e.getMicroOuPequenoPorte(), dadosCFORX);
			deParaDadosEndereco.populaDados(e.getEndereco(), dadosCFORX);
			deParaDadosEnderecoCorrespondencia.populaDados(e.getEnderecoCorrespondencia(), dadosCFORX);
			deParaDadosEnderecoORCOM.logaDados(new CFORXBean(), dadosCFORX);
			
			if (TipoPessoa.PESSOA_JURIDICA.getTipo().equals(e.getTipoIdentificacao())) {
				dadosCFORX.setCGC_CPF(e.getCnpj());
			} else {
				dadosCFORX.setCPFINDIV(e.getCnpj());
			}
			
			OcupacaoModel ocupacao = oDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa);

			if (null != ocupacao && !ocupacao.getDescricao().isEmpty()) {
				DeParaDadosOcupacao deParaDadosOcupacao = new DeParaDadosOcupacao(log);
				deParaDadosOcupacao.populaDados(ocupacao, dadosCFORX);
			} else {
				dadosCFORX.setOCUPACAO1(".");
			}

			BancoModel banco = bDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa);

			/*
			 * if (null != banco.getCodigoDobanco()) { deParaDadosBanco.populaDados(banco,
			 * dadosCFORX); deParaDadosAgencia.populaDados(banco.getAgencia(), dadosCFORX);
			 * deParaDadosContaCorrente.populaDados(banco.getContaCorrente(), dadosCFORX); }
			 */
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
				s.append(e.toString()).append("\n");
				for (String erro : errosDadosBancarios) {
					s.append("<span style=\"text-decoration: underline double #ff0000;\">").append(erro).append("</span>\n");
				}
				s.append("=========================================\n");
				log.adiciona(s.toString());
				//throw new AtualizacaoCFORXException(s.toString());
			}else{
				DeParaDadosBanco deParaDadosBanco = new DeParaDadosBanco(log);
				deParaDadosBanco.populaDados(banco, dadosCFORX);

				DeParaDadosAgencia deParaDadosAgencia = new DeParaDadosAgencia(log);
				deParaDadosAgencia.populaDados(banco.getAgencia(), dadosCFORX);

				DeParaDadosContaCorrente deParaDadosContaCorrente = new DeParaDadosContaCorrente(log);
				deParaDadosContaCorrente.populaDados(banco.getContaCorrente(), dadosCFORX);
			}

			executar(e, cforx, dadosCFORX);
		}

	}

	public void cadastraEmpresas() throws Exception {

		log.rotina("C7702", "Cadastra Empresas");

		iniciarDeParas();

		for (EmpresaModel e : eDAO.buscaDadosCadastraisDeNovasEmpresas()) {

			String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(e.getCnpj(), ambienteORCOM);

			if (null != fornecedor) {
				e.setCodigoFornecedor(fornecedor);
			}

			if ("0".equals(fornecedor)) {
				log.adiciona("Código fornecedor do ORCOM:" + fornecedor);
				String msg = String.format( "Fornecedor: %s", (null == e.getCodigoFornecedor() ? "<codigo ORCOM ainda nao foi atribuido>": e.getCodigoFornecedor() ) );
				log.adiciona( msg );
				log.adiciona("CNPJ:" + e.getCnpj());
			
				acionaMenuM077_Inclusao() ;

				if (TipoPessoa.PESSOA_JURIDICA.getTipo().equals(e.getTipoIdentificacao())) {
					dadosC7702.setCGC_CPF1(e.getCnpj());
				} else {
					dadosC7702.setCPFINDIV(e.getCnpj());
				}

				final long codigoEmpresa = Long.parseLong(e.getCodigoEmpresa());
				final EnderecoModel endereco = endDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa, TipoDeEndereco.MATRIZ.getCodigo());
				e.setEndereco( endereco);
				e.setEnderecoCorrespondencia( endereco);

				deParaDadosCep.populaDados(e.getEndereco(), dadosC7702);
				deParaDadosCepCorrespondencia.populaDados(e.getEnderecoCorrespondencia(), dadosC7702);

				
				//Problema esta na navegacao enre telas aqui. O processo comeca na C7702 e vai DIRETO para a CFORX. Dados serao enviados pela GLOBAL_WORK
				
				dadosC7702.setOPCAO1WS(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_03_INCLUSAO);
				c7702.submit(dadosC7702);

				CFORX cforx = new TelaCFORX(c7702, ambienteORCOM).getTela();
				CFORXBean dadosCFORX = cforx.redirecionadaDaTela();

				deParaDadosCadastrais.populaDados(e, dadosCFORX);
				deParaDadosLC.populaDados(e.getMicroOuPequenoPorte(), dadosCFORX);
				deParaDadosEndereco.populaDados(e.getEndereco(), dadosCFORX);
				deParaDadosEnderecoCorrespondencia.populaDados(e.getEnderecoCorrespondencia(), dadosCFORX);
				deParaDadosEnderecoORCOM.logaDados(new CFORXBean(), dadosCFORX);

				OcupacaoModel ocupacao = oDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa);

				if (null != ocupacao && !ocupacao.getDescricao().isEmpty()) {
					DeParaDadosOcupacao deParaDadosOcupacao = new DeParaDadosOcupacao(log);
					deParaDadosOcupacao.populaDados(ocupacao, dadosCFORX);
				} else {
					dadosCFORX.setOCUPACAO1(".");
				}

				BancoModel banco = bDAO.buscaPeloCodigoDeEmpresaParadigma(codigoEmpresa);
				if (null != banco) {
					deParaDadosBanco.populaDados(banco, dadosCFORX);
					deParaDadosAgencia.populaDados(banco.getAgencia(), dadosCFORX);
					deParaDadosContaCorrente.populaDados(banco.getContaCorrente(), dadosCFORX);
				}
				executar(e, cforx, dadosCFORX);
			}

		}

	}
	private void acionaMenuM077_Inclusao() throws OrcomM077Exception {
		m077 = new MenuOrcomM077(ambienteORCOM).getMenu();
		pageM077 = m077.loadPage();
		pageM077.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_03_INCLUSAO);
		m077.submit(pageM077);
		c7702 = new TelaC7702(m077, ambienteORCOM).getTela();
		dadosC7702 = c7702.redirecionadaDaTela();
	}

	private void iniciarDeParas() throws IOException {
		deParaDadosCep = new DeParaDadosCep(log);
		deParaDadosCepCorrespondencia = new DeParaDadosCepCorrespondencia(log);
		deParaDadosCadastrais = new DeParaDadosCadastrais(log);
		deParaDadosLC = new DeParaDadosLC(log);
		deParaDadosEndereco = new DeParaDadosEndereco(log);
		deParaDadosEnderecoCorrespondencia = new DeParaDadosEnderecoCorrespondencia(log);
		deParaDadosEnderecoORCOM = new DeParaDadosEnderecoORCOM(log);
		deParaDadosBanco = new DeParaDadosBanco(log);
		deParaDadosAgencia = new DeParaDadosAgencia(log);
		deParaDadosContaCorrente = new DeParaDadosContaCorrente(log);
	}

		

	private void executar(EmpresaModel empresa, CFORX cforx, CFORXBean dadosCforx) throws Exception {
		UsuarioSenha usuario = new UsuarioSenha();
		dadosCforx.setMATRICULA1(usuario.getMatricula());
		dadosCforx.setTSENHA(usuario.getSenha());
		dadosCforx.setATIVOC_WS(TelaCFORX.FORNECEDOR_ATIVO); //Ativa o fornecedor por padrao
		dadosCforx.setOPCAO3(ComandosOrcom.ADD.toString());
		CFORXBean submit = cforx.submit(dadosCforx);
		final String xseedmsg = submit.getXSEEDMSG();
		
		log.erroXSeed(xseedmsg, empresa.getCodigoFornecedor(), empresa.getCnpj(), empresa.getNomeEmpresa());
		
		if( ! xseedmsg.isEmpty() ){
			String msgPassou ="Dados do fornecedor (codigo '%s' %s [%s]) submetidos com sucesso. %s";
			String msgFalhou ="Fornecedor (codigo '%s') %s [%s] : %s";
			String msg = (String.format(("".equals(xseedmsg) || xseedmsg.isEmpty() ? msgPassou : msgFalhou),
					empresa.getCodigoFornecedor(), empresa.getNomeEmpresa(), empresa.getCnpj(), xseedmsg));			

			throw new AtualizacaoC7702Exception("Tela CFORX : " +msg);
		}

		atualizacaoC7703Controller.realizaCargaDeCnpj(empresa.getCnpj());
		atualizacaoC7706Controller.atualizaCertificadosDeCnpj(empresa.getCnpj());
	}

}
