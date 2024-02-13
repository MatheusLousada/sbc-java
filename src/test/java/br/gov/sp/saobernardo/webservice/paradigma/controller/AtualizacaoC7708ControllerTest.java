package br.gov.sp.saobernardo.webservice.paradigma.controller;

import org.junit.Before;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7708Controller;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;
import br.gov.sp.saobernardo.webservice.paradigma.service.ConstantesTest;

public class AtualizacaoC7708ControllerTest {

	AtualizacaoC7708Controller sujeito;

	@Test
	public void teste() throws Exception {
		sujeito.atualizaEnderecoDeCnpj(ConstantesTest.CNPJ_PREFEITURA);
	}

	@Test(expected = Exception.class)
	public void testaAtualizacaoComCNPJErrado() throws Exception {
		sujeito.atualizaEnderecoDeCnpj("CNPJ_ERRADO");
	}

	@Before
	public void antes() throws Exception {
		ContextoImportacao ci = new ContextoImportacao(Ambientes.PARADIGMA_PRODUCAO, Ambientes.ORCOM_DESENVOLVIMENTO , new Prefeitura());
		sujeito = new AtualizacaoC7708Controller(ci);

	}

}
