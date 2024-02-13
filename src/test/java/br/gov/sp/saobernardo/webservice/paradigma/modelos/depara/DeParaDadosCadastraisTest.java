package br.gov.sp.saobernardo.webservice.paradigma.modelos.depara;

import org.junit.Ignore;

import br.gov.sp.saobernardo.orcom.c7702.C7702;
import br.gov.sp.saobernardo.orcom.c7702.C7702Bean;
import br.gov.sp.saobernardo.orcom.cforx.CFORX;
import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7702;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaCFORX;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.depara.DeParaDadosCadastrais;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

class DeParaDadosCadastraisTest {
	private ArquivoDeLog log;
	private EmpresaDAO eDAO;
	private DeParaDadosCadastrais deParaDadosCadastrais;
	private Conexao conexaoParadigma;
	private C7702Bean dadosC7702;
	private C7702 c7702;
	private EmpresaModel empresa;
	private M077 m077;
	private M077Bean pageM077;
	private CFORX cforx;
	private CFORXBean dadosCFORX;
	private static final String CNPJ_REMA = "43776447000160";

	//BeforeClass
	void testDeParaDadosCadastrais() throws Exception {

		deParaDadosCadastrais = new DeParaDadosCadastrais(log);
		conexaoParadigma = new Conexoes().getConexao(Ambientes.PARADIGMA_PRODUCAO);
		conexaoParadigma.conecta();

		eDAO = new EmpresaDAO(conexaoParadigma.getConnection(), false);
		empresa = eDAO.buscaNovoPeloCnpj(CNPJ_REMA);

		m077 = new MenuOrcomM077(Ambientes.ORCOM_DESENVOLVIMENTO).getMenu();
		pageM077 = m077.loadPage();
		pageM077.setOPCAO2(MenuOrcomM077.MENU_ORCOM_M077_OPCAO_03_INCLUSAO);
		m077.submit(pageM077);
		c7702 = new TelaC7702(m077, Ambientes.ORCOM_DESENVOLVIMENTO).getTela();
		dadosC7702 = c7702.redirecionadaDaTela();
		

		//CFORX cforx = new CFORX(c7702, TelaCFORX.CODIGO_DE_AUTENTICIDADE, ambienteORCOM);
		  cforx = new TelaCFORX(m077, c7702, Ambientes.ORCOM_DESENVOLVIMENTO).getTela();
		  dadosCFORX = cforx.redirecionadaDaTela();

		
	}

	@Ignore
	void testPopulaDados() throws Exception {
		dadosC7702.setOPCAO1WS(TelaC7702.OPCAO1_3_INCLUSAO_DE_FORNECEDOR);
		c7702.submit(dadosC7702);

		deParaDadosCadastrais.populaDados(empresa, dadosCFORX);
	}

	//AfterClass
	public void fecha() {
		conexaoParadigma.fecha();
	}

}
