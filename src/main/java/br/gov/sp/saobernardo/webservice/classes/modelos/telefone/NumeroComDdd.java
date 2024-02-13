package br.gov.sp.saobernardo.webservice.classes.modelos.telefone;

import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroTelefonico;

public class NumeroComDdd implements NumeroTelefonico {

	private String ddd;
	private String numero;

	public NumeroComDdd(String numeroCompleto) {
		if (null != numeroCompleto) {
			ddd = numeroCompleto.substring(0, 2);
			numero = numeroCompleto.substring(2);
		}
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String getDdd() {
		return ddd;
	}

}
