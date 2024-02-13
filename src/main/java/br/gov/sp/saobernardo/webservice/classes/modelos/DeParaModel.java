package br.gov.sp.saobernardo.webservice.classes.modelos;

public class DeParaModel {

	private LogDeRetornoDaGravacao logDaGravacao;
	private String codigoWBT;
	private String codigoPMSBC;
	private String descricao;
	private int tipo;

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public String getCodigoWBT() {
		return codigoWBT;
	}

	public void setCodigoWBT(String codigoWBT) {
		this.codigoWBT = codigoWBT;
	}

	public String getCodigoPMSBC() {
		return codigoPMSBC;
	}

	public void setCodigoPMSBC(String codigoPMSBC) {
		this.codigoPMSBC = codigoPMSBC;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
