package br.gov.sp.saobernardo.webservice.orcom.controller;

import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AtualizacaoDeMateriais {

	public static void main(String[] args) {
		AtualizacaoC7703Controller controller;
		try {
			controller = new AtualizacaoC7703Controller(Ambientes.ORCOM_DESENVOLVIMENTO, Ambientes.ORCOM_DESENVOLVIMENTO, true);
			controller.realizaCargaDeCnpj("57334666000101");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
