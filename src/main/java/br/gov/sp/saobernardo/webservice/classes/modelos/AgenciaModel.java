package br.gov.sp.saobernardo.webservice.classes.modelos;

public class AgenciaModel {
private static final String VAZIO = " ";
	private String numero = VAZIO;
	private String digito = VAZIO;

	public AgenciaModel() {
	}

	public AgenciaModel(String numero, String digito) {
		this.numero = numero;
		this.digito = digito == null ? VAZIO: digito;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	@Override
	public String toString() {
		return numero + (digito == null ? "" : "-" + digito);
	}
	
	public boolean isEmpty() {
		return VAZIO.equals(numero);
	}

}
