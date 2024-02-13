package br.gov.sp.saobernardo.webservice.classes.modelos;

public class ParadigmaIntegracaoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = Constantes.SERIAL_VERSION_UID;

	public ParadigmaIntegracaoException(Object msg) {
		super(msg.toString());
	}

}
