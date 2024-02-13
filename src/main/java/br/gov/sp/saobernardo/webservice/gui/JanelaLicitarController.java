package br.gov.sp.saobernardo.webservice.gui;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.bodys.AbstractBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.PregaoEletronicoBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.PregaoEletronicoDAORest;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.PregaoEletronicoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;
import thinlet.FrameLauncher;
import thinlet.Thinlet;

public class JanelaLicitarController extends Thinlet {
	private static final int ALTURA_JANELA = 290;
	private static final int LARGURA_JANELA = 370;
	private static final long serialVersionUID = 1L;
	private static final String XML_GUI_MAIN = "/janela_licitar.xml";
	private static final ContextoImportacao contexto = new ContextoImportacao(Ambientes.LICITAR_DESENVOLVIMENTO, Ambientes.ORCOM_DESENVOLVIMENTO, new Prefeitura());
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

	public JanelaLicitarController() {
		try {
			add(parse(XML_GUI_MAIN));

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

	private void createScreen() {
		new FrameLauncher("WEB-ORCOM", this, LARGURA_JANELA, ALTURA_JANELA);
	}

	public void shutdown() {
	}

	public void closeDialog(Object dialog) {
		ThinletUtils.closeDialog(this, dialog);
	}

	public void listarFornecedores() {

		try {
			
			String action = "listarPregoesHomologados";
			int organizationId = 1;

			PregaoEletronicoEndpoint pregaoEletronicoEndpoint = new PregaoEletronicoEndpoint(contexto);

			AbstractBody body = new PregaoEletronicoBody(action);
			String bodyString = String.format("{\"organizationId\":%d, \"action\":\"%s\"}", organizationId, action);
			body.setJson(bodyString);
			
			RequestData pregaoEletronicoRequestData = new RequestData(EndpointsEnum.PregaoEletronicoEndpoint, pregaoEletronicoEndpoint.getEndpoint("process"), body);

			PregaoEletronicoDAORest pregaoDAO = new PregaoEletronicoDAORest(contexto, pregaoEletronicoRequestData);
			List<PregaoEletronicoModel> pregoes = pregaoDAO.listarPregoesHomologados();

			int i = 0;
			for (PregaoEletronicoModel pregao : pregoes) {
				System.out.println("pregao " + i);
				System.out.println(pregao.toString());
				System.out.println("-----------------------------");
				i++;
			}

		} catch (Exception e) {
			System.out.println("erro listarPregoesHomologados: ");
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
