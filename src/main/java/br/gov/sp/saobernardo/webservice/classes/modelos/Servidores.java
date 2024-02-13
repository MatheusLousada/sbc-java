package br.gov.sp.saobernardo.webservice.classes.modelos;

public enum Servidores {

	IP_HMG("http://10.1.0.160/services/"), IP_PRD("http://www.compras.saobernardo.sp.gov.br/Services/");

	private String ip;

	Servidores(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return this.ip;
	}
}
