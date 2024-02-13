package br.gov.sp.saobernardo.webservice.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import br.gov.sp.saobernardo.webservice.classes.dao.rest.DAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.EmpresaDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.EmpresaMapper;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.classes.utils.NormalizadorDeProcesso;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EmpresaEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EnderecoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7121Controller;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7706Controller;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7942Controller;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoDeCertificados;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoDeFonecedoresCnpj;
import br.gov.sp.saobernardo.webservice.orcom.controller.OrcomSecomQuadroController;
import br.gov.sp.saobernardo.webservice.orcom.dao.OrcomSecomQuadroDAO;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Faculdade;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.CompraDiretaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.ConexoesOrcom;
import br.gov.sp.saobernardo.webservice.paradigma.dao.CotacaoDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.PregaoEletronicoDAO;
import thinlet.FrameLauncher;
import thinlet.Thinlet;

public class JanelaThinletController extends Thinlet {
	private static final String SELECTED = "selected";
	private static final int ALTURA_JANELA = 290;
	private static final int LARGURA_JANELA = 370;
	private static final long serialVersionUID = 1L;
	private static final String XML_GUI_MAIN = "/janela_thinlet.xml";
	public static final String XML_GUI_DIALOG = "/gui_dialog.xml";

	@SuppressWarnings("unused")
	private static final String TAB_ASSOCIATIONS = "tabEmpresas";
	@SuppressWarnings("unused")
	private static final String TAB_MEMBERS = "tabNegocios";
	@SuppressWarnings("unused")
	private static final String TAB_ASSETS = "tabAssets";
	@SuppressWarnings("unused")
	private static final String TAB_REUNIONS = "tabReunions";
	@SuppressWarnings("unused")
	private static final String TAB_PAYMENTS = "tabPayments";
	@SuppressWarnings("unused")
	private static final String TAB_DEBTS = "tabDebts";

	public JanelaThinletController() {
		try {
			add(parse(XML_GUI_MAIN));
			carregaCombos();

		} catch (Exception e) {
			e.printStackTrace();
			showDialog(this, "Deu erro", "err.msg.load.gui");
		}
	}

	private void showDialog(Thinlet thinlet, String title, String text) {
		try {
			Object dialog = thinlet.parse(XML_GUI_DIALOG);
			thinlet.setString(dialog, ThinletUtils.TEXT, title);
			thinlet.setString(thinlet.find(dialog, "lblDialogText"), ThinletUtils.TEXT, text);
			thinlet.add(dialog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void init() {
		createScreen();
	}

	public void atualizaDadosCadastrais() throws Exception {
		String cnpj = this.getString(JanelaMain.NOME_CAMPO_ATUALIZACAO_CADASTRAL_CNPJ);
		ContextoImportacao ci = defineContextoImportacao();

		@SuppressWarnings("unused")
		AtualizaDadosCadastrais adc = new AtualizaDadosCadastrais(cnpj, ci);
	}

	public void cadastraCompraDireta() throws Exception {
		Boolean viewSql = this.getBoolean(this.find(JanelaMain.NOME_CAMPO_IMPRIME_QUERY), SELECTED);
		String processo = getString(JanelaMain.NOME_CAMPO_PROCESSO);
		String numeroCompraDireta = getString(JanelaMain.NOME_CAMPO_NUMERO_LICITACAO);
		String ano = getString(JanelaMain.NOME_CAMPO_ANO);
		ContextoImportacao ci = defineContextoImportacao();
		CadastraCompraDireta cdd = new CadastraCompraDireta();
		cdd.cadastraCompraDireta(ano, numeroCompraDireta, processo, ci);
	}

	public void atualizaCertificados() {
		AtualizacaoDeCertificados adc = new AtualizacaoDeCertificados();
		String cnpj = this.getString(JanelaMain.NOME_CAMPO_ATUALIZACAO_CERTIFICADOS_CNPJ);
		ContextoImportacao ci = defineContextoImportacao();
		adc.atualizaCertificados(cnpj, ci);

	}

	private ContextoImportacao defineContextoImportacao() {
		String origem = this.getString(JanelaMain.NOME_CAMPO_ORIGEM);
		String destino = this.getString(JanelaMain.NOME_CAMPO_DESTINO);
		Boolean viewSql = this.getBoolean(this.find(JanelaMain.NOME_CAMPO_IMPRIME_QUERY), SELECTED);
		String orgao = this.getString(JanelaMain.NOME_CAMPO_ORGAO);

		Orgaos o = Faculdade.NOME.equals(orgao) ? new Faculdade()
				: (Prefeitura.NOME.equals(orgao) ? new Prefeitura() : null);

		return new ContextoImportacao(origem, destino, viewSql, o);
	}

	private String getString(String campo) {
		Object o = this.find(campo);
		return this.getString(o, ThinletUtils.TEXT);

	}

	public void carregaCombos() {
		// Ambientes PARADIGMA
		List<String> origens = new ArrayList<String>();
		origens.add(Ambientes.PARADIGMA_PRODUCAO);
		origens.add(Ambientes.PARADIGMA_HOMOLOGACAO);
		origens.add(Ambientes.PARADIGMA_DESENVOLVIMENTO);

		// Ambientes ORCOM
		List<String> destinos = new ArrayList<String>();
		destinos.add(Ambientes.ORCOM_DESENVOLVIMENTO);
		destinos.add(Ambientes.ORCOM_PRODUCAO);
		destinos.add(Ambientes.ORCOM_HOMOLOGACAO);

		List<String> orgaos = new ArrayList<String>();
		orgaos.add(Prefeitura.NOME);
		orgaos.add(Faculdade.NOME);

		List<String> anos = new ArrayList<String>();
		Calendar dataFinal = Calendar.getInstance();
		Integer anoAtual = dataFinal.get(Calendar.YEAR);

		Integer anoInicial = anoAtual - 2;
		for (Integer ano = anoAtual; ano >= anoInicial; ano--) {
			anos.add(ano.toString());
		}

		final String ano = buscaAno(JanelaMain.NOME_CAMPO_ANO);
		Integer anoCot = Integer.valueOf(buscaAno(JanelaMain.NOME_CAMPO_ANO_COTACAO));
		Integer mesCot = Integer.valueOf(buscaAno(JanelaMain.FILTRO_MES_COTACAO));

		List<String> pregoesDoAno = new ArrayList<String>();

		ContextoImportacao ci = new ContextoImportacao(Ambientes.PARADIGMA_PRODUCAO, Ambientes.ORCOM_DESENVOLVIMENTO,
				true, new Prefeitura());
		Conexao conexaoParadigma = new Conexoes().getConexao(ci.getOrigem());
		PregaoEletronicoDAO pregaoEletronicoDAO = null;
		CompraDiretaDAO compraDiretaDAO = null;
		CotacaoDAO cotacaoDao = null;
		List<String> cotacoesDoAno = new ArrayList<String>();
		List<String> anosComCotacaoEncerrada = new ArrayList<String>();

		List<String> meses = Arrays.asList("1,2,3,4,5,6,7,8,9,10,11,12".split(","));

		try {
			conexaoParadigma.conecta();

			final Boolean radioPE = this.getBoolean(this.find(JanelaMain.LICITACAO_PE), SELECTED);
			final Boolean radioCE = this.getBoolean(this.find(JanelaMain.LICITACAO_CE), SELECTED);
			final Boolean somenteEncerradas = this
					.getBoolean(this.find(JanelaMain.NOME_CAMPO_FILTRO_SOMENTE_COTACOES_ENCERRADAS), SELECTED);

			if (Boolean.TRUE.equals(radioPE)) {
				pregaoEletronicoDAO = new PregaoEletronicoDAO(conexaoParadigma.getConnection(), ci.getImprimirQuery());
				pregoesDoAno = pregaoEletronicoDAO.selecionaPregaoPorAno(ano);
			}

			if (Boolean.TRUE.equals(radioCE)) {
				compraDiretaDAO = new CompraDiretaDAO(conexaoParadigma.getConnection(), ci.getImprimirQuery());
				pregoesDoAno.addAll(compraDiretaDAO.selecionaCompraDiretaPorAno(ano));
			}

			cotacaoDao = new CotacaoDAO(conexaoParadigma.getConnection(), ci.getImprimirQuery());
			try {
				for (Integer anoCotacao : cotacaoDao.filtraAnosComCotacoesEncerradas()) {
					anosComCotacaoEncerrada.add(anoCotacao.toString());
				}

			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			if (Boolean.TRUE.equals(somenteEncerradas)) {
				OrcomSecomQuadroController secomQuadroController = new OrcomSecomQuadroController(ci.getDestino(),
						false);

				secomQuadroController.abreConexao();
				AtualizacaoC7942Controller atualizacaoC7942Controller = new AtualizacaoC7942Controller(ci);
				List<CotacaoModel> cotacoesNaoCadastradasNoORCOM = atualizacaoC7942Controller
						.retornaListaDeCotacoesNaoCadastradasNoORCOM(
								cotacaoDao.selecionaCotacoesEncerradas(anoCot, mesCot),
								ci.getDestino(), secomQuadroController);
				secomQuadroController.fechaConexao();
				atualizacaoC7942Controller.fecha();

				for (CotacaoModel cotacao : cotacoesNaoCadastradasNoORCOM) {
					cotacoesDoAno.add(cotacao.getCodigoProcesso());
				}

			} else {
				cotacoesDoAno = cotacaoDao
						.selecionaCotacoesEncerradasDescricao(buscaAno(JanelaMain.NOME_CAMPO_ANO_COTACAO));
			}

		} catch (Exception e) {
			Logger.getAnonymousLogger().severe(e.getMessage());
		}

		carregaCombo(cotacoesDoAno, this.find(JanelaMain.NOME_CAMPO_COTACOES_DISPONIVEIS_PARA_IMPORTACAO));
		carregaCombo(anosComCotacaoEncerrada, this.find(JanelaMain.NOME_CAMPO_ANO_COTACAO));
		carregaCombo(meses, this.find(JanelaMain.FILTRO_MES_COTACAO));
		carregaCombo(pregoesDoAno, this.find(JanelaMain.NOME_CAMPO_PREGOES_DISPONIVEIS_PARA_IMPORTACAO));
		carregaCombo(origens, this.find(JanelaMain.NOME_CAMPO_ORIGEM));
		carregaCombo(destinos, this.find(JanelaMain.NOME_CAMPO_DESTINO));
		carregaCombo(anos, this.find(JanelaMain.NOME_CAMPO_ANO));
		carregaCombo(origens, this.find(JanelaMain.NOME_CAMPO_ORIGEM));
		carregaCombo(destinos, this.find(JanelaMain.NOME_CAMPO_DESTINO));
		carregaCombo(orgaos, this.find(JanelaMain.NOME_CAMPO_ORGAO));

	}

	public void atualizaCamposLicitacoes() {
		try {

			String ano = buscaAno(JanelaMain.NOME_CAMPO_ANO);

			final String pregaoSelecionado = this.getString(JanelaMain.NOME_CAMPO_PREGOES_DISPONIVEIS_PARA_IMPORTACAO);
			final String[] s = pregaoSelecionado.split(PregaoEletronicoDAO.SEPARADOR);
			this.setString(this.find(JanelaMain.NOME_CAMPO_NUMERO_LICITACAO), ThinletUtils.TEXT, s[0]);
			this.setString(this.find(JanelaMain.NOME_CAMPO_PROCESSO), ThinletUtils.TEXT, s[1]);
			this.setString(this.find(JanelaMain.NOME_CAMPO_ORIGEM), ThinletUtils.TEXT, Ambientes.PARADIGMA_PRODUCAO);
			this.setString(this.find(JanelaMain.NOME_CAMPO_DESTINO), ThinletUtils.TEXT,
					Ambientes.ORCOM_DESENVOLVIMENTO);
			this.setString(this.find(JanelaMain.NOME_CAMPO_ANO), ThinletUtils.TEXT, ano);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void atualizaCamposCotacao() {
		String ano = buscaAno(JanelaMain.NOME_CAMPO_ANO);

		final String pregaoSelecionado = this.getString(JanelaMain.NOME_CAMPO_COTACOES_DISPONIVEIS_PARA_IMPORTACAO);
		final String[] s = pregaoSelecionado.split(CotacaoDAO.SEPARADOR);

		this.setString(this.find(JanelaMain.NOME_CAMPO_ANO), ThinletUtils.TEXT, ano);
		this.setString(this.find(JanelaMain.NOME_CAMPO_PROCESSO_COTACAO), ThinletUtils.TEXT, s[0]);

	}

	private String buscaAno(String nomeCampoAno) {
		return ("".equals(getString(nomeCampoAno)) ? "2019" : getString(nomeCampoAno));
	}

	private void carregaCombo(List<String> origens, Object comboOrigem) {
		ThinletUtils.loadObjectsIntoCombo(this, origens, comboOrigem);
	}

	private void createScreen() {
		new FrameLauncher("WEB-ORCOM", this, LARGURA_JANELA, ALTURA_JANELA);
	}

	public void shutdown() {
	}

	@SuppressWarnings("unused")
	public void tabChanged(Object tabbedPane) {
		try {
			Object newTabPanel = null;
			Object selectedTab = this.getSelectedItem(tabbedPane);
			String tabName = this.getString(selectedTab, "name");

			if (selectedTab == null) {
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeDialog(Object dialog) {
		ThinletUtils.closeDialog(this, dialog);
	}

	public void atualizaCertidao() throws Exception {
		String cnpj = this.getString(JanelaMain.NOME_CAMPO_ATUALIZACAO_CERTIDAO_CNPJ);
		ContextoImportacao ci = defineContextoImportacao();
		AtualizacaoC7706Controller controller = new AtualizacaoC7706Controller(ci);
		controller.atualizaCertificadosDeCnpj(cnpj);
	}

	public void atualizaFornecedoresCnpj() {

		final String cnpj = this.getString(JanelaMain.NOME_CAMPO_ATUALIZACAO_CADASTRAL_CNPJ);
		ContextoImportacao ci = defineContextoImportacao();
		AtualizacaoDeFonecedoresCnpj atualizacaoDeFonecedoresCnpj = new AtualizacaoDeFonecedoresCnpj(cnpj, ci);
		atualizacaoDeFonecedoresCnpj.atualizaFornecedor();

	}

	@SuppressWarnings("unused")
	private void atualizaFornecedores() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaFornecedoresRecentes() {
		naoImplementado();
	}

	public void atualizaOrcamento() throws Exception {
		String processo = this.getString(JanelaMain.NOME_CAMPO_PROCESSO_COTACAO);
		if (processo.isEmpty()) {
			ThinletUtils.showDialog(this, "Erro na importacao da cotação", "Processo nao informado");
			return;
		}
		ContextoImportacao ci = defineContextoImportacao();
		AtualizacaoC7942Controller cotacoes = new AtualizacaoC7942Controller(ci);
		cotacoes.atualizaPropostasDeProcesso(processo, buscaAno(JanelaMain.NOME_CAMPO_ANO_COTACAO));
		cotacoes.fecha();
	}

	public void excluiOrcamentoOrcom() throws Exception {
		String processo = this.getString(JanelaMain.NOME_CAMPO_PROCESSO_COTACAO);
		if (processo.isEmpty()) {
			ThinletUtils.showDialog(this, "Erro na importacao da cotação", "Processo nao informado");
			return;
		}

		NormalizadorDeProcesso normalizador = new NormalizadorDeProcesso();

		String codigoOrcom = processo;
		String anoOrcom = buscaAno(JanelaMain.NOME_CAMPO_ANO_COTACAO);

		if (!normalizador.isProcessoComAno(processo) && (null != anoOrcom) && !anoOrcom.isEmpty()) {
			codigoOrcom = normalizador.normalizaAnoDeProcesso(processo, anoOrcom);
		}

		String[] separacaoDoCodigo = codigoOrcom.split(codigoOrcom.contains("/") ? "/" : "-");

		String numeroDoProcesso = separacaoDoCodigo[0];
		String anoDoProcesso = separacaoDoCodigo[1].trim().substring(0, 4);

		String codigoProcesso = anoDoProcesso + numeroDoProcesso;

		ContextoImportacao ci = defineContextoImportacao();
		Conexao conexaoORCOM = new ConexoesOrcom().getConexao(ci);
		conexaoORCOM.conecta();

		OrcomSecomQuadroDAO orcomQuadroDAO = new OrcomSecomQuadroDAO(conexaoORCOM.getConnection(),
				ci.getImprimirQuery());
		orcomQuadroDAO.apagaQuadroDePrecosSecom(codigoProcesso);
		conexaoORCOM.fecha();
	}

	public void atualizaPregaoEletronico() {

		final Boolean viewSql = this.getBoolean(this.find(JanelaMain.NOME_CAMPO_IMPRIME_QUERY), SELECTED);
		final String origem = this.getString(JanelaMain.NOME_CAMPO_ORIGEM);
		final String destino = this.getString(JanelaMain.NOME_CAMPO_DESTINO);
		final ContextoImportacao contextoDeImportacao = new ContextoImportacao(origem, destino, viewSql,
				new Prefeitura());

		final String ano = this.getString(JanelaMain.NOME_CAMPO_ANO);
		final String pregao = this.getString(JanelaMain.NOME_CAMPO_NUMERO_LICITACAO);
		final String processo = this.getString(JanelaMain.NOME_CAMPO_PROCESSO);

		final String msg = " Pregao Eletronico {0}   processo {4}: de {1} para {2} imprimeSql: {3}";
		final String texto = MessageFormat.format(msg, pregao, origem, destino, viewSql, processo);
		System.out.println(texto);

		try {
			AtualizacaoC7121Controller c = new AtualizacaoC7121Controller(contextoDeImportacao.getOrigem(), contextoDeImportacao.getDestino(), contextoDeImportacao.getImprimirQuery());
			c.cadastraPregaoEletronico(pregao, processo, ano);

		} catch (Exception e) {
			for (StackTraceElement el : e.getStackTrace()) {
				if (el.getClassName().startsWith("br")) {
					System.err
							.println("at " + el.getClassName() + ": " + el.getMethodName() + ":" + el.getLineNumber());
				}
			}
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	private void atualizaEmpresas() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaNegociacoes() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void orcomParaWbcCategoria() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void orcomParaWbcUnidadeDeMedida() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaMateriaisCnpj() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaMateriai(String cnpj) {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaNovosFornecedoresCnpj() {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaNovosFornecedores(String cnpj) {
		naoImplementado();
	}

	@SuppressWarnings("unused")
	private void atualizaNovosFornecedores() {
		naoImplementado();
	}

	private void naoImplementado() {
		throw new JanelaThinletControllerRuntimeException("Metodo nao implementado");
	}
}
