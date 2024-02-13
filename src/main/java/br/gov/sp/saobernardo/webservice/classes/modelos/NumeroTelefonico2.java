package br.gov.sp.saobernardo.webservice.classes.modelos;

public class NumeroTelefonico2 {

	public NumeroTelefonico2(String numeroCompleto) {
		if (null != numeroCompleto && isNumeroValido(numeroCompleto)) {
			ddd = numeroCompleto.substring(0, 2);
			numero = numeroCompleto.substring(2);
		} else {
			ddd = "";
			numero = "";
		}
	}

	private boolean isNumeroValido(String numeroCompleto) {
		return numeroCompleto.length()>=2 && numeroCompleto.matches("[0-9]+");
	}

	private String ddd;
	private String numero;

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
