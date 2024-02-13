package br.gov.sp.saobernardo.webservice.classes.modelos;

public class MicroOuPequenoPorte {

	public MicroOuPequenoPorte(Integer l) {
		if (null != l) {
			if (l == 1) {
				tipo = "S";
			} else {
				tipo = "N";
			}

		} else {
			tipo = "";
		}
	}

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
