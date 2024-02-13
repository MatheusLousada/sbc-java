package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

public class PregaoEletronicoPrazoDeEntregaModel {

	public static final int CONFORME_EDITAL = 1;
	private int codigo;
	private String descricao;
	private int numeroDeDias;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeroDeDias() {
		return numeroDeDias;
	}

	public void setNumeroDeDias(int numeroDeDias) {
		this.numeroDeDias = numeroDeDias;
	}
}
