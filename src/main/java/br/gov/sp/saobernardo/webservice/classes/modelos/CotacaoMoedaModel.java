package br.gov.sp.saobernardo.webservice.classes.modelos;

public class CotacaoMoedaModel {
	/** Codigo da Moeda */
	private String codigoMoeda;

	/** Descricao da Moeda */
	private String descricaoMoeda;

	/** Sigla da Moeda */
	private String siglaMoeda;

	private LogDeRetornoDaGravacao logDaGravacao;

	public String getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setsCdMoeda(String sCdMoeda) {
		this.codigoMoeda = sCdMoeda;
	}

	public String getDescricaoMoeda() {
		return descricaoMoeda;
	}

	public void setDescricaoMoeda(String sDsMoeda) {
		this.descricaoMoeda = sDsMoeda;
	}

	public String getSiglaMoeda() {
		return siglaMoeda;
	}

	public void setSiglaMoeda(String sSgMoeda) {
		this.siglaMoeda = sSgMoeda;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

}
