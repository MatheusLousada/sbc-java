/**
 * 
 */
package br.gov.sp.saobernardo.webservice.gui;

/**
 * @author 41476
 *
 */
public class JanelaThinletControllerRuntimeException extends RuntimeException {

	/**
	 */
	private static final long serialVersionUID = 1L;

	/**
	 */
	public JanelaThinletControllerRuntimeException() {
	}

	/**
	 * @param message
	 */
	public JanelaThinletControllerRuntimeException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public JanelaThinletControllerRuntimeException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public JanelaThinletControllerRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
