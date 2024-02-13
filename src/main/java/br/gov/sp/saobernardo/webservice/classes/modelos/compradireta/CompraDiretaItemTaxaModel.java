package br.gov.sp.saobernardo.webservice.classes.modelos.compradireta;

public class CompraDiretaItemTaxaModel {

	/** Int 20 Código de taxa */
	private long codigoTaxa;

	/** Int 5 Código da empresa do endereço de entrega */
	private int codigoEmpresaEntrega;

	public long getCodigoTaxa() {
		return codigoTaxa;
	}

	public void setCodigoTaxa(long l) {
		this.codigoTaxa = l;
	}

	public int getCodigoEmpresaEntrega() {
		return codigoEmpresaEntrega;
	}

	public void setCodigoEmpresaEntrega(int codigoEmpresaEntrega) {
		this.codigoEmpresaEntrega = codigoEmpresaEntrega;
	}

}
