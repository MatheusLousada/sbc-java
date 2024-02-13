package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

public class CotacaoItemParticipanteModel {
	/** Int 16 Codigo do item da cotacao no WBC. */
	private int codigoItem;

	/** String 14 Codigo ou CNPJ da empresa participante da cotacao */
	private String codigoEmpresa;

	/** Int 1 Indica a participacao. 1 – Homologado, 0 – Nao homologado. */
	private int homologado;

	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public int getHomologado() {
		return homologado;
	}

	public void setHomologado(int homologado) {
		this.homologado = homologado;
	}


}
