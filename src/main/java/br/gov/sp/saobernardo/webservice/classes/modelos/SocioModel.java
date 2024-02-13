package br.gov.sp.saobernardo.webservice.classes.modelos;

public class SocioModel {

	private String tipoDocumento;
	private String documento;
	private String tipoUsuario;
	private String nome;
	private String email;

	public SocioModel(String documento, String tipoUsuario, String nome, String email) {
		this.documento = documento;
		this.tipoUsuario = tipoUsuario;
		this.nome = nome;
		this.email = email;
		
		if (documento != null && documento.length() == 11) {
			tipoDocumento = "CPF";
		}
		
		if (documento != null && documento.length() > 11) {
			tipoDocumento = "CNPJ";
		}
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
