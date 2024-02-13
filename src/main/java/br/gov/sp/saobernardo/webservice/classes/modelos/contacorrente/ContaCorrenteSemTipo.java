package br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente;

public class ContaCorrenteSemTipo extends ContaCorrenteModel {

	private String tipo;
	private String numero;
	private String digito;

	public ContaCorrenteSemTipo(String numero, String digito) {
		super("", numero, digito);
		this.tipo = "";
		this.numero = numero;
		this.digito = digito;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public String getNumero() {
		return numero;
	}

	@Override
	public String getDigito() {
		return digito;
	}

}
