package br.gov.sp.saobernardo.webservice.classes.modelos.telefone;

import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroTelefonico;

public class NumeroComDddDuplicado implements NumeroTelefonico {

	private String ddd;
	private String numero;

	public NumeroComDddDuplicado(String numeroCompleto) {
		if (null != numeroCompleto) {
			String numeroSemDddDuplicado = removeDddDuplicado(numeroCompleto);
			ddd = numeroSemDddDuplicado.substring(0, 2);
			numero = removeZeroAEsquerda(numeroSemDddDuplicado).substring(2);
		}
	}

	private String removeDddDuplicado(String numeroCompleto) {
		String numero = numeroCompleto.substring(2, numeroCompleto.length());
		numero = removeZeroAEsquerda(numero);
		return numero;
	}

	private String removeZeroAEsquerda(String numero) {
		String numeroSemZero = numero;
		if (numero.charAt(0) == '0')
			numeroSemZero = numero.substring(1);
		return numeroSemZero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
