package br.gov.sp.saobernardo.webservice.classes.modelos;

public class CondicaoDePagamentoModel {

	/**
	 * Array de condicaoItemDTO Não obrigatório. Array contendo lista de
	 * Itens/parcelas da condição de pagamento. // lstCondicaoPagamentoItem;
	 */
	/**
	 * Array de CondicaoPagamentoIdiomaDTO Não obrigatório. Array contendo lista
	 * de condições de pagamento por idioma. // lstCondicaoPagamentoIdiomaDTO;
	 */

	/** String 20 Código da condição de pagamento no sistema cliente */
	private String codigoCondicaoPagamento;

	/** String 60 Nome/descrição da condição de pagamento */
	private String descricaoCondicaoPagamento;

	/**
	 * String 14 Código ou CNPJ da empresa dona da condição de pagamento.
	 * Informar o código da empresa matriz quando a condição de pagamento for
	 * centralizado.
	 */
	private String codigoEmpresa;

	private LogDeRetornoDaGravacao logDaGravacao;

	public String getCodigoCondicaoPagamento() {
		return codigoCondicaoPagamento;
	}

	public void setCodigoCondicaoPagamento(String condicaoPagamento) {
		this.codigoCondicaoPagamento = condicaoPagamento;
	}

	public String getDescricaoCondicaoPagamento() {
		return descricaoCondicaoPagamento;
	}

	public void setDescricaoCondicaoPagamento(String descricaoCondicaoPagamento) {
		this.descricaoCondicaoPagamento = descricaoCondicaoPagamento;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;

	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

}
