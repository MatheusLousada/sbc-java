package br.gov.sp.saobernardo.webservice.orcom.model.orgaos;

public abstract class Orgaos {
	private int orgao;
	private String descricao;
	private String nome;

	@SuppressWarnings("unused")
	private Orgaos() {
	}

	public Orgaos(int orgao, String descricao, String nome) {
		this.orgao = orgao;
		this.descricao = descricao;
		this.nome = nome;
	}

	protected int getOrgao() {
		return orgao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome() {
		return nome;
	}

 	@Override
	public String toString() {
		return "Orgao =" + orgao + 
				", nome=" + nome + 
				", descricao=" + descricao + "]";
	}	 
}
