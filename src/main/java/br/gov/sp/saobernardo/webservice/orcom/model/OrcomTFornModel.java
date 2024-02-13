package br.gov.sp.saobernardo.webservice.orcom.model;

public class OrcomTFornModel {

	//TABELA TFORN
	
	private int ORD_TFORN;
	private String CGC_CPF;
	private String R_SOCIAL;
	private String WBC;

	public int getORD_TFORN() {
		return ORD_TFORN;
	}

	public void setORD_TFORN(int oRD_TFORN) {
		ORD_TFORN = oRD_TFORN;
	}

	public String getR_SOCIAL() {
		return R_SOCIAL;
	}

	public void setR_SOCIAL(String r_SOCIAL) {
		R_SOCIAL = r_SOCIAL;
	}

	public String getCGC_CPF() {
		return CGC_CPF;
	}

	public void setCGC_CPF(String cGC_CPF) {
		CGC_CPF = cGC_CPF;
	}

	public String getWBC() {
		return WBC;
	}

	public void setWBC(String wBC) {
		WBC = wBC;
	}

}
