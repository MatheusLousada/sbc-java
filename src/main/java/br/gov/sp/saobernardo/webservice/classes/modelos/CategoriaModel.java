package br.gov.sp.saobernardo.webservice.classes.modelos;

public class CategoriaModel {

	private LogDeRetornoDaGravacao logDaGravacao;
	private String codigo;
	private String descricao;
	private String codigoPai;

	public String getCodigoPai() {
		return codigoPai;
	}

	public void setCodigoPai(String codigoPai) {
		this.codigoPai = codigoPai;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
