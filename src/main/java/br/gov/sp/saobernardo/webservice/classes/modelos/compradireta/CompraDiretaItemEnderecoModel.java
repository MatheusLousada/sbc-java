package br.gov.sp.saobernardo.webservice.classes.modelos.compradireta;

import java.math.BigDecimal;

public class CompraDiretaItemEnderecoModel {
	
	/** Decimal 16,4 Quantidade do item. */
	private BigDecimal dQtItem;
	
	/** String 14 Código da empresa do endereço de entrega */
	private String sCdEmpresaEntregaEndereco;
	
	/** String 14 Código da empresa do endereço de cobrança */
	private String sCdEmpresaCobrancaEndereco;
	
	/*** String 14 Código da empresa do endereço de faturamento */
	private String sCdEmpresaFaturamentoEndereco;

	public BigDecimal getdQtItem() {
		return dQtItem;
	}

	public void setdQtItem(BigDecimal dQtItem) {
		this.dQtItem = dQtItem;
	}

	public String getsCdEmpresaEntregaEndereco() {
		return sCdEmpresaEntregaEndereco;
	}

	public void setsCdEmpresaEntregaEndereco(String sCdEmpresaEntregaEndereco) {
		this.sCdEmpresaEntregaEndereco = sCdEmpresaEntregaEndereco;
	}

	public String getsCdEmpresaCobrancaEndereco() {
		return sCdEmpresaCobrancaEndereco;
	}

	public void setsCdEmpresaCobrancaEndereco(String sCdEmpresaCobrancaEndereco) {
		this.sCdEmpresaCobrancaEndereco = sCdEmpresaCobrancaEndereco;
	}

	public String getsCdEmpresaFaturamentoEndereco() {
		return sCdEmpresaFaturamentoEndereco;
	}

	public void setsCdEmpresaFaturamentoEndereco(String sCdEmpresaFaturamentoEndereco) {
		this.sCdEmpresaFaturamentoEndereco = sCdEmpresaFaturamentoEndereco;
	}

}
