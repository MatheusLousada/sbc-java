package br.gov.sp.saobernardo.webservice.classes.modelos.telefone;

import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroTelefonico;

public class NumeroSemDdd implements NumeroTelefonico{

	private String ddd;
	private String numero;

	public NumeroSemDdd(String numero) {
		this.numero = numero;
	}

	@Override
	public String getDdd() {
		return ddd;
	}

	@Override
	public String getNumero() {
		return numero;
	}

}
