package br.gov.sp.saobernardo.webservice.paradigma.service;

import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AmbienteDeTeste {

	private static String ambiente = Ambientes.ORCOM_HOMOLOGACAO;

	private AmbienteDeTeste() {
		/** empty */
	}

	public static WSDLs getAmbienteWSDLCategoria() {
		if (ambiente.equals(Ambientes.ORCOM_HOMOLOGACAO)) {

			return WSDLs.WSDL_CATEGORIA_DESENV_HMG;
		} else {

			return WSDLs.WSDL_CATEGORIA_PRODUCAO;
		}
	}
}
