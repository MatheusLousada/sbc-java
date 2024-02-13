package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

import java.math.BigDecimal;

public class PregaoEletronicoItemEnderecoModel {

	/** Decimal 16,4 Quantidade do item. */
	private BigDecimal quantidadeItem;

	/** String 14 Código da empresa do endereço de entrega */
	private String codigoEmpresaEntregaEndereco;

	/** String 14 Código da empresa do endereço de cobrança */
	private String codigoEmpresaCobrancaEndereco;

	/** String 14 Código da empresa do endereço de faturamento */
	private String codigoEmpresaFaturamentoEndereco;

	public BigDecimal getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(BigDecimal quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
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

}
