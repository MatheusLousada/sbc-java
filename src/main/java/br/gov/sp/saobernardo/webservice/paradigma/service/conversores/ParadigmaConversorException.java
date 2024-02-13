package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.webservice.classes.modelos.Constantes;

public class ParadigmaConversorException extends RuntimeException {
	/**
	 * 
	 * try {
				serv.converteParaLogRetornoGravacaoModel(wbtLogDTO);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
	 * 
	 * 
	 */
	private static final long serialVersionUID = Constantes.SERIAL_VERSION_UID;
	
	public ParadigmaConversorException( Object msg ){
		super( msg.toString() );
	}
}
