package br.gov.sp.saobernardo.webservice.classes.utils;

 /** Facilidades para criar pausa no sistema
 * @author 41476
 * @since ‪06/mai/2020
 */
public class Pausa {

	/**
	 * Faz uma pausa de um segundo
	 */
	public void pausa() {
		pausa((long) 1000);

	}

	/** Faz uma pausa durante o número de segundos especificado
	 * @param segundos
	 * É o mesmo que chamar pausa( (long) segundos / 1000 )
	 */
	public void esperar(int segundos) {
		pausa((long) segundos);
	}

	/**
	 * Pausa o processamento por miliSegundos
	 * 
	 * @param miliSegundos Número em milisegundos
	 */
	public void pausa(long miliSegundos) {
		try {
			Thread.sleep(miliSegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
