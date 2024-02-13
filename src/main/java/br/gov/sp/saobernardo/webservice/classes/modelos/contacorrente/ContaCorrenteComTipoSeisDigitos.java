package br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente;

public class ContaCorrenteComTipoSeisDigitos extends ContaCorrenteModel {

	private String tipo;
	private String numero;
	private String digito;

	public ContaCorrenteComTipoSeisDigitos(String tipo, String numero, String digito) {
		super(tipo, numero, digito);
		this.tipo = tipo;
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
