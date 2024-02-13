package br.gov.sp.saobernardo.webservice.classes.modelos.depara;


public class DeParaDadosException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DeParaDadosException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DeParaDadosException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public DeParaDadosException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DeParaDadosException(Throwable cause) {
		super(cause);
	}

}
