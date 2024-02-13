package br.gov.sp.saobernardo.webservice.paradigma.integracao;

import br.gov.sp.saobernardo.webservice.integracao.MarcaTodasEmpresasDaWBCComoWBCNoORCOM;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class MarcaTodasEmpresasDaWBCComoWBCNoORCOMTest {

	private static boolean imprimeQuery = true;

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					MarcaTodasEmpresasDaWBCComoWBCNoORCOM marca = new MarcaTodasEmpresasDaWBCComoWBCNoORCOM(
							Ambientes.ORCOM_HOMOLOGACAO, imprimeQuery);
					marca.executa();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		thread.start();
		System.out.println("fim");

	}

}
