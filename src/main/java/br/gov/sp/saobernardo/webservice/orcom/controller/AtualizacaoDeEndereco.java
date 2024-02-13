package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AtualizacaoDeEndereco {

	private String cnpj;
	private ContextoImportacao ci;

	public AtualizacaoDeEndereco(String cnpj, ContextoImportacao ci2) {
		this.cnpj = cnpj;
		this.ci = ci2;
	}

	public static void main(String[] args) {
		ContextoImportacao ci = new ContextoImportacao(Ambientes.PARADIGMA_DESENVOLVIMENTO, Ambientes.ORCOM_DESENVOLVIMENTO, true,new Prefeitura());
		AtualizacaoDeEndereco ae = new AtualizacaoDeEndereco("11354726000149", ci);
		try {
			ae.atualizaEndereco();
		} catch (Exception e) {
			Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage());
		}
	}

	public void atualizaEndereco() throws Exception {
		AtualizacaoC7708Controller controller;		
		//controller = new AtualizacaoC7708Controller(ci.getOrigem(), ci.getDestino(), ci.getImprimirQuery());
		controller = new AtualizacaoC7708Controller(ci );
		controller.atualizaEnderecoDeCnpj(cnpj);

	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		try {
			atualizaEndereco();
		} catch (Exception ex) {
			Logger.getAnonymousLogger().log(Level.SEVERE, ex.getMessage());
		}
	}*/

}
