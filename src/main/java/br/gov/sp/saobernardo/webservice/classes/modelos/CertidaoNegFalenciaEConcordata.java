package br.gov.sp.saobernardo.webservice.classes.modelos;

public class CertidaoNegFalenciaEConcordata implements Certificado {
	private String dataDeValidade;
	public static final String CAMPO_DATA = "DATA7";

	@Override
	public String getDataDeValidade() {
		return dataDeValidade;
	}

	@Override
	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

}
