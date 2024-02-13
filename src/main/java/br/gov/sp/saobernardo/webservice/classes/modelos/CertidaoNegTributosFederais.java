package br.gov.sp.saobernardo.webservice.classes.modelos;

public class CertidaoNegTributosFederais implements Certificado {
	
	public static final String CAMPO_DATA = "DATA4";
	
	private String dataDeValidade;

	@Override
	public String getDataDeValidade() {
		return dataDeValidade;
	}

	@Override
	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

}
