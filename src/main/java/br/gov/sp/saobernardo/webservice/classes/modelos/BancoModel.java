package br.gov.sp.saobernardo.webservice.classes.modelos;

import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteModel;

public class BancoModel {

	private static final String VAZIO = "";
	private String codigoDobanco =VAZIO;
	private AgenciaModel agencia;
	private ContaCorrenteModel contaCorrente;

	public BancoModel() {
		this.agencia = new AgenciaModel();
	}

	public String getCodigoDobanco() {
		return codigoDobanco;
	}

	public void setCodigoDobanco(String codigoDobanco) {
		this.codigoDobanco = codigoDobanco;
	}

	public AgenciaModel getAgencia() {
		return agencia;
	}

	public void setAgencia(AgenciaModel agencia) {
		this.agencia = agencia;
	}

	public ContaCorrenteModel getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrenteModel contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	@Override
	public String toString() {
		return "Banco [" + codigoDobanco + "] AG.:" + agencia + " C.C.:" + contaCorrente;
	}

	public boolean isEmpty() {
		return VAZIO.equals(codigoDobanco);
	} 
}
