package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.orcom.c7707.C7707;
import br.gov.sp.saobernardo.orcom.c7707.C7707Bean;
import br.gov.sp.saobernardo.orcom.c7707.OrcomC7707Exception;
import br.gov.sp.saobernardo.orcom.c7708.C7708;
import br.gov.sp.saobernardo.orcom.c7708.C7708Bean;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.m077.OrcomM077Exception;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7707;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7708;
import br.gov.sp.saobernardo.webservice.classes.modelos.BuscadorCodigoFornecedor;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoDeEndereco;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCep;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCepCorrespondencia;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.gui.FichaCForx;
import br.gov.sp.saobernardo.webservice.orcom.dao.UsuarioSenha;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EnderecoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

	/**
 * @author 41476
 * @since ‪04/nov/2021
 */
public class AtualizacaoC7708Controller {

	private static final String CODIGO_FORNECEDOR_DO_ORCOM = "Codigo fornecedor do ORCOM:";
	Conexao conexaoParadigma;
	EmpresaDAO empresaDAO;
	EnderecoDAO enderecoDAO;
	private ArquivoDeLog log;
	private String ambienteORCOM;

	public AtualizacaoC7708Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog());
	}

	public AtualizacaoC7708Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, Logger log)
			throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, new ArquivoDeLog(log) );
	}
	
	public AtualizacaoC7708Controller(ContextoImportacao ci) throws Exception {
		iniciar(ci.getOrigem(),ci.getDestino(), ci.getImprimirQuery(), new ArquivoDeLog());
	}
	
	public AtualizacaoC7708Controller(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery,
			ArquivoDeLog arquivoDeLog) throws Exception {
		iniciar(ambienteWBC, ambienteORCOM, imprimirQuery, arquivoDeLog  );
		
	}

	private void iniciar(String ambienteWBC, String ambienteORCOM, boolean imprimirQuery, ArquivoDeLog log)
			throws Exception {
		conexaoParadigma = new Conexoes().getConexao(ambienteWBC);
		conexaoParadigma.conecta();
		empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		enderecoDAO = new EnderecoDAO(conexaoParadigma.getConnection(), imprimirQuery);
		this.log = log;
		this.ambienteORCOM = ambienteORCOM;
	}

	public void atualizaEnderecoDeCnpj(String cnpj) throws Exception {
		log.rotina("C7708 - atualiza Endereco De Cnpj");
		UsuarioSenha usuario = new UsuarioSenha();

		StringBuilder msg = new StringBuilder();
		EmpresaModel empresa = empresaDAO.buscaPeloCnpj(cnpj);
		if (null == empresa.getCodigoFornecedor()) {
			msg.append("Fornecedor:<codigo ORCOM ainda nao foi atribuido>");
		} else {
			msg.append("Fornecedor:" + empresa.getCodigoFornecedor());
		}
		msg.append(String.format("  CNPJ: %s | %s", empresa.getCnpj(), empresa.getNomeEmpresa()));
		log.adiciona(msg.toString());

		String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);
		log.adiciona(CODIGO_FORNECEDOR_DO_ORCOM + fornecedor);
		if (null != fornecedor) {
			empresa.setCodigoFornecedor(fornecedor);
		}

		if (empresa.getSituacao().getSituacaoEmpresa() == 0) {
			log.erro("Fornecedor Inativo.");
			return;
		}
		processaC778Bean(usuario, empresa);

	}

	public void atualizaEnderecoDeEmpresas() throws Exception {
		log.rotina("atualiza Endereco De Empresas ");
		UsuarioSenha usuario = new UsuarioSenha();

		for (EmpresaModel empresa : empresaDAO.buscaDadosCadastraisDeEmpresas()) {

			String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);
			log.adiciona(CODIGO_FORNECEDOR_DO_ORCOM + fornecedor);
			if (null != fornecedor) {
				empresa.setCodigoFornecedor(fornecedor);
			}
			if (null != empresa.getCodigoFornecedor()) {
				log.adiciona("Fornecedor:" + empresa.getCodigoFornecedor());
				log.adiciona("CNPJ      :" + empresa.getCnpj());
				processaC778Bean(usuario, empresa);
			}
		}

	}

	public void atualizaDadosCadastraisDeEmpresasAlteradasRecentemente() throws Exception {
		log.rotina("atualiza Dados Cadastrais De Empresas Alteradas Recentemente");
		UsuarioSenha usuario = new UsuarioSenha();

		for (EmpresaModel empresa : empresaDAO.buscaTodasEmpresasAlteradasRecentemente()) {

			String fornecedor = new BuscadorCodigoFornecedor().buscaCodigoDe(empresa.getCnpj(), ambienteORCOM);

			log.adiciona(CODIGO_FORNECEDOR_DO_ORCOM + fornecedor);
			if (null != fornecedor) {
				empresa.setCodigoFornecedor(fornecedor);
			}
			if (null != empresa.getCodigoFornecedor()) {
				log.adiciona("Fornecedor: " + empresa.getCodigoFornecedor());
				log.adiciona("CNPJ: " + empresa.getCnpj());
				processaC778Bean(usuario, empresa);
			}
		}

	}

	/**
	 * Faz o trabalho "sujo"
	 * 
	 * @param usuario
	 * @param empresa
	 * @throws Exception 
	 * @throws SecurityException
	 */
	private void processaC778Bean(UsuarioSenha usuario, EmpresaModel empresa) throws Exception {

		M077 m077; 
		M077Bean dadosM077 ;
		C7708 c7708 ;
		C7708Bean dadosC7708 ;
		C7708Bean alteracoes ;
		C7708Bean dadosComEnderecosAtualizados ;
		//C7708Bean submit ;
		
		m077 = new MenuOrcomM077(  ambienteORCOM ).getMenu();
		dadosM077 = m077.loadPage();
		dadosM077.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_11_ALTERACAO_DE_CEP_DE_FORNECEDOR);
		m077.submit(dadosM077);

		c7708 = new TelaC7708(m077,  ambienteORCOM).getTela();
		dadosC7708 = c7708.redirecionadaDaTela();
		dadosC7708.setORD_TFORN(empresa.getCodigoFornecedor());
		alteracoes = c7708.submit(dadosC7708);

		defineEnderecos(empresa, alteracoes );
		fazDeParaCorrespondencia(empresa, alteracoes);
		
		final String cepM = empresa.getEndereco().getCep();
		final String cepC = empresa.getEnderecoCorrespondencia().getCep();
		
		
		//pesquisar o CEP MATRIZ
		C7707Bean consultaM = consultaCep( cepM );
		String rua = consultaM.getCOPYFROM_TIPOLOG_0() + " " + consultaM.getCOPYFROM_NOMELOG_0().trim();
		alteracoes.setUFLOG(comparaSecomECorreios( empresa.getEndereco().getUf(), consultaM.getCOPYFROM_UFLOG_0()));
		alteracoes.setCIDLOG(comparaSecomECorreios( empresa.getEndereco().getCidade(), consultaM.getCOPYFROM_CIDLOG_0()));
		alteracoes.setCEPLOG(consultaM.getCOPYFROM_CEPLOG_0());
		alteracoes.setTIPOLOG(consultaM.getCOPYFROM_TIPOLOG_0());
		alteracoes.setBAIRROLOG(comparaSecomECorreios( empresa.getEndereco().getBairro(),consultaM.getCOPYFROM_BAIRROLOG_0()));	
		alteracoes.setNOMELOG(comparaSecomECorreios( empresa.getEndereco().getDescricao(), rua));
		
		//Numero e complemento obrigatoriamente vem do SECOM
		alteracoes.setCOMPMATRIZ(empresa.getEndereco().getComplemento());
		alteracoes.setNUMMATRIZ(empresa.getEndereco().getNumero());
		
		
		//pesquisar CEP CORRESPONDENCIA	
		C7707Bean consultaC = consultaCep(cepC);
		rua = consultaC.getCOPYFROM_TIPOLOG_0() + " " + consultaC.getCOPYFROM_NOMELOG_0().trim();
		
		alteracoes.setCEPLOGC(consultaC.getCOPYFROM_CEPLOG_0());
		alteracoes.setTIPOLOGC(consultaC.getCOPYFROM_TIPOLOG_0());
		alteracoes.setUFLOGC(comparaSecomECorreios( empresa.getEnderecoCorrespondencia().getUf(), consultaC.getCOPYFROM_UFLOG_0()));
		alteracoes.setCIDLOGC(comparaSecomECorreios( empresa.getEnderecoCorrespondencia().getCidade(), consultaC.getCOPYFROM_CIDLOG_0()));
		alteracoes.setBAIRROLOGC(comparaSecomECorreios( empresa.getEnderecoCorrespondencia().getBairro(), consultaC.getCOPYFROM_BAIRROLOG_0()));
		alteracoes.setNOMELOGC(comparaSecomECorreios( empresa.getEnderecoCorrespondencia().getDescricao(), rua));

		//Numero e complemento obrigatoriamente vem do SECOM
		alteracoes.setCOMPCORR(empresa.getEnderecoCorrespondencia().getComplemento());
		alteracoes.setNUMCORR( empresa.getEnderecoCorrespondencia().getNumero());

		alteracoes.setOPCAO1_C(TelaC7708.OPCAO1_C_S_CONFIRMA_ALTERACAO);
		alteracoes.setMATRICULA1(usuario.getMatricula());
		alteracoes.setTSENHA(usuario.getSenha());
		dadosComEnderecosAtualizados = c7708.submit(alteracoes);
		
		final String xseedmsg = dadosComEnderecosAtualizados.getXSEEDMSG();
		
		FichaCForx ficha = new FichaCForx(alteracoes);
		log.adiciona(ficha.tela());
		msgResultadoSubmitXSeed(String.format("Dados do fornecedor (codigo '%s') submetidos com sucesso. ", empresa.getCodigoFornecedor()), xseedmsg);
	}
	
	/** Em caso de CEP GENERICO, prevalece o que vier do SECOM
	 * Alexandre 04/NOV/2021
	 * @param valorSecom
	 * @param valorCorreio
	 * @return
	 */
	private String comparaSecomECorreios(String valorSecom, String valorCorreio) {
		return TratamentoDeString.removerAcentos( valorCorreio.trim().isEmpty() ? valorSecom : valorCorreio );
	}
	
	
	/** Chama o menu M077, invoca a tela C7707, informa o CEP e faz o submit
	 * @param cep a ser pesquisado. String com 8 digitos
	 * @return bean com os dados do CEP pesquisado nos correios.
	 * @throws OrcomM077Exception
	 * @throws OrcomC7707Exception
	 */
	private C7707Bean consultaCep(String cep) throws OrcomM077Exception, OrcomC7707Exception {
		M077 m077a = new MenuOrcomM077(  ambienteORCOM ).getMenu();
		M077Bean dadosM077a = m077a.loadPage();
		dadosM077a.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_10_CONSULTA_CEP);
		C7707 c7707 = new TelaC7707(m077a, ambienteORCOM).getTela();
		C7707Bean dadosC7707 = c7707.redirecionadaDaTela();
		dadosC7707.setPCEP(cep);
		C7707Bean consulta = c7707.submit(dadosC7707);
		return consulta;
		
	}

	private void defineEnderecos(EmpresaModel empresa, C7708Bean dadosDaTelaDeAlteracao) throws SQLException {
		final EnderecoModel endereco = enderecoDAO.buscaPeloCodigoDeEmpresaParadigma(Long.parseLong(empresa.getCodigoEmpresa()), TipoDeEndereco.MATRIZ.getCodigo());
		empresa.setEndereco(endereco);
		empresa.setEnderecoCorrespondencia(endereco);
		dadosDaTelaDeAlteracao.setORD_TFORN(empresa.getCodigoFornecedor());
	}

	private void fazDeParaCorrespondencia(EmpresaModel empresa, C7708Bean dadosDaTelaParaConsultaDeCep)
			throws IllegalAccessException, NoSuchFieldException {
		DeParaDadosCep deParaDadosCep = new DeParaDadosCep(log);
		deParaDadosCep.populaDados(empresa.getEndereco(), dadosDaTelaParaConsultaDeCep);

		DeParaDadosCepCorrespondencia deParaDadosCepCorrespondencia = new DeParaDadosCepCorrespondencia(log);
		deParaDadosCepCorrespondencia.populaDados(empresa.getEnderecoCorrespondencia(), dadosDaTelaParaConsultaDeCep);
	}

	/*
	private void preparaDadosTela(EmpresaModel empresa, C7708Bean dadosComEnderecosAtualizados, C7708Bean dadosDaTelaParaConsultaDeCep, UsuarioSenha usuario)
			throws IllegalAccessException, NoSuchFieldException {

		DeParaDadosEndereco deParaDadosEndereco = new DeParaDadosEndereco(log);
		deParaDadosEndereco.populaDados(empresa.getEndereco(), dadosComEnderecosAtualizados);

		DeParaDadosEnderecoCorrespondencia deParaDadosEnderecoCorrespondencia = new DeParaDadosEnderecoCorrespondencia(log);
		deParaDadosEnderecoCorrespondencia.populaDados(empresa.getEnderecoCorrespondencia(),dadosComEnderecosAtualizados);

		DeParaDadosEnderecoORCOM deParaDadosEnderecoORCOM = new DeParaDadosEnderecoORCOM(log);
		deParaDadosEnderecoORCOM.logaDados(dadosComEnderecosAtualizados, dadosDaTelaParaConsultaDeCep);

		dadosComEnderecosAtualizados.setOPCAO1_C(TelaC7708.OPCAO1_CWS_CONFIRMAR_ALTERACAO);
		dadosComEnderecosAtualizados.setMATRICULA1(usuario.getMatricula());
		dadosComEnderecosAtualizados.setTSENHA(usuario.getSenha());

	}
	*/

	private void msgResultadoSubmitXSeed(String mensagem, String xseedmsg) {
		if ("".equals(xseedmsg) || xseedmsg.isEmpty()) {
			log.adiciona(mensagem + xseedmsg);
		} else {
			log.erro(xseedmsg);
		}
	}

}
