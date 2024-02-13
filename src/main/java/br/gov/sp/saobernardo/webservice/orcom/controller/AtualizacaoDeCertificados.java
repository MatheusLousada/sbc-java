package br.gov.sp.saobernardo.webservice.orcom.controller;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AtualizacaoDeCertificados {

	public static void main(String[] args) {
		AtualizacaoC7706Controller controller;

		try {
			controller = new AtualizacaoC7706Controller(Ambientes.PARADIGMA_DESENVOLVIMENTO, Ambientes.ORCOM_DESENVOLVIMENTO, false);
			controller.atualizaCertificadosDeCnpj("18670574000132");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void atualizaCertificados(String cnpj, ContextoImportacao ci){
		AtualizacaoC7706Controller controller;
		try {
			controller = new AtualizacaoC7706Controller( ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery());
			controller.atualizaCertificadosDeCnpj(cnpj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
