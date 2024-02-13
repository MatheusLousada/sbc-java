package br.gov.sp.saobernardo.webservice.paradigma.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7942Controller;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AtualizacaoC7942ControllerTest {

	private AtualizacaoC7942Controller sujeito;

	@Before
	public void before() throws Exception {
		/* Importante não mudar os ambientes! */
		ContextoImportacao ci = new ContextoImportacao(Ambientes.PARADIGMA_PRODUCAO, Ambientes.ORCOM_DESENVOLVIMENTO, false,new Prefeitura());
		sujeito = new AtualizacaoC7942Controller(ci);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void atualizaOrcamentoEncerradoComCodigoDeProcessoMalFormado() throws Exception {
		String codigoProcessoSemAno = "0999";
		String anoOrcom = "2021";
		Boolean retorno =  sujeito.atualizaPropostasDeProcesso(codigoProcessoSemAno, anoOrcom );
		sujeito.fecha();
		assertTrue(retorno);	
	}

	@Test
	public void atualizaOrcamentoEncerrado() throws Exception {
		String codigoProcessoSemAno = "0999/2021";
		String anoOrcom = "2021";
		Boolean retorno = sujeito.atualizaPropostasDeProcesso(codigoProcessoSemAno, anoOrcom);
		sujeito.fecha();
		assertTrue(retorno);
	}

}
