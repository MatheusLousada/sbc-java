package br.gov.sp.saobernardo.webservice.classes.modelos;

public class LogDeRetornoDaGravacao {
	private String data;
	private String token;
	private String descricao;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
