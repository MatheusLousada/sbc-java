package br.gov.sp.saobernardo.webservice.orcom.dao;

public class UsuarioSenha {

	private String senha = null;
	private String matricula = null;

	public UsuarioSenha(String matricula, String senha) {
		defineUsuarioSenha(matricula, senha);
	}

	/**
	 * Define usário padrao no orcom
	 */
	public UsuarioSenha() {
		defineUsuarioSenha("99988", "PAGAN");
	}

	private void defineUsuarioSenha(String matricula, String senha) {
		this.senha = senha;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String getSenha() {
		return this.senha;
	}

}
