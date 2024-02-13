package br.gov.sp.saobernardo.webservice.classes.modelos;

public enum TipoPessoa {
	NAO_IDENTIFICADO("0"), PESSOA_JURIDICA("1"), PESSOA_FISICA("2");

	private String tipo;

	private TipoPessoa(String codigo) {
		this.tipo = codigo;
	}

	public String getTipo() {
		return tipo;
	}
}
