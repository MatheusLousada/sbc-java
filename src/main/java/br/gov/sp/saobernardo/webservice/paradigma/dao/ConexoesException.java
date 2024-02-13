package br.gov.sp.saobernardo.webservice.paradigma.dao;

public class ConexoesException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConexoesException(String ambienteNaoDefinido) {
		super(ambienteNaoDefinido);
	}

}
