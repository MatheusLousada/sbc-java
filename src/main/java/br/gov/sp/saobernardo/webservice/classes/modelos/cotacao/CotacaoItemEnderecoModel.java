package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

public class CotacaoItemEnderecoModel {

	/**
	 * String 14 Não obrigatório. Código de controle interno do WBC.
	 */
	private String codigoEntregaEndereco;

	/**
	 * String 14 Não obrigatório. Código de controle interno do WBC.
	 */
	private String codigoCobrancaEndereco;

	/**
	 * String 14 Não obrigatório. Código de controle interno do WBC.
	 */
	private String codigoFaturamentoEndereco;

	/**
	 * String 20 Não obrigatório. Código da requisção
	 */
	private String codigoRequisicaoEmpresa;

	/** Int Sequência das entregas dos itens da cotação */
	private int sequenciaDeEntregaItemEndereco;

	/** Decimal Quantidade de entrega prevista */
	private Double qtdPrevistaEntrega;

	/** DateTime Data de entrega prevista */
	private Long dataPrevistaEntrega;

	/** String 14 Código da empresa do endereço de entrega */
	private String codigoEmpresaEntregaEndereco;

	/** String 14 Código da empresa do endereço de cobrança */
	private String codigoEmpresaCobrancaEndereco;

	/** String 14 Código da empresa do endereço de faturamento */
	private String codigoEmpresaFaturamentoEndereco;

	public int getSequenciaDeEntregaItemEndereco() {
		return sequenciaDeEntregaItemEndereco;
	}

	public void setSequenciaDeEntregaItemEndereco(int sequenciaDeEntregaItemEndereco) {
		this.sequenciaDeEntregaItemEndereco = sequenciaDeEntregaItemEndereco;
	}

	public Double getQtdPrevistaEntrega() {
		return qtdPrevistaEntrega;
	}

	public void setQtdPrevistaEntrega(Double qtdPrevistaEntrega) {
		this.qtdPrevistaEntrega = qtdPrevistaEntrega;
	}

	public Long getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(Long dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public String getCodigoEmpresaEntregaEndereco() {
		return codigoEmpresaEntregaEndereco;
	}

	public void setCodigoEmpresaEntregaEndereco(String codigoEmpresaEntregaEndereco) {
		this.codigoEmpresaEntregaEndereco = codigoEmpresaEntregaEndereco;
	}

	public String getCodigoEmpresaCobrancaEndereco() {
		return codigoEmpresaCobrancaEndereco;
	}

	public void setCodigoEmpresaCobrancaEndereco(String codigoEmpresaCobrancaEndereco) {
		this.codigoEmpresaCobrancaEndereco = codigoEmpresaCobrancaEndereco;
	}

	public String getCodigoEmpresaFaturamentoEndereco() {
		return codigoEmpresaFaturamentoEndereco;
	}

	public void setCodigoEmpresaFaturamentoEndereco(String codigoEmpresaFaturamentoEndereco) {
		this.codigoEmpresaFaturamentoEndereco = codigoEmpresaFaturamentoEndereco;
	}

	public String getCodigoEntregaEndereco() {
		return codigoEntregaEndereco;
	}

	public void setCodigoEntregaEndereco(String codigoEntregaEndereco) {
		this.codigoEntregaEndereco = codigoEntregaEndereco;
	}

	public String getCodigoCobrancaEndereco() {
		return codigoCobrancaEndereco;
	}

	public void setCodigoCobrancaEndereco(String codigoCobrancaEndereco) {
		this.codigoCobrancaEndereco = codigoCobrancaEndereco;
	}

	public String getCodigoFaturamentoEndereco() {
		return codigoFaturamentoEndereco;
	}

	public void setCodigoFaturamentoEndereco(String codigoFaturamentoEndereco) {
		this.codigoFaturamentoEndereco = codigoFaturamentoEndereco;
	}

	public String getCodigoRequisicaoEmpresa() {
		return codigoRequisicaoEmpresa;
	}

	public void setCodigoRequisicaoEmpresa(String codigoRequisicaoEmpresa) {
		this.codigoRequisicaoEmpresa = codigoRequisicaoEmpresa;
	}

}
