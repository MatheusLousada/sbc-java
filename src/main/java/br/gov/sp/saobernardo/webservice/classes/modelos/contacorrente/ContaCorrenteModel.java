package br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente;

public abstract class ContaCorrenteModel {
	private String tipo;
	private String numero;
	private String digito;

	public ContaCorrenteModel() {
	}

	public ContaCorrenteModel(String tipo, String numero, String digito) {
		this.tipo = tipo;
		this.numero = numero;
		this.digito = digito;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return  ( tipo == null ? "" : tipo  + " ") + (numero == null ? "" : numero + "/" ) + ( digito == null ? "" : digito );
	}

}
