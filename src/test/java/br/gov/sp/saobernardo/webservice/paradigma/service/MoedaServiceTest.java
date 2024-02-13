package br.gov.sp.saobernardo.webservice.paradigma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;

import br.gov.sp.saobernardo.webservice.classes.modelos.CotacaoMoedaModel;

public class MoedaServiceTest {

	private MoedaService sujeito;

	@Before
	public void setUp()   {
		sujeito = new MoedaService(WSDLs.WSDL_MOEDA_PRODUCAO);
	}

	@Ignore(" Deixou de funcionar em 27/NOV/2019")
	public void deveGravarDefinicaoDeMoedaReal() {
		CotacaoMoedaModel real = new CotacaoMoedaModel();

		real.setsCdMoeda("1m");
		real.setDescricaoMoeda("REAL");
		real.setSiglaMoeda("R$");

		CotacaoMoedaModel retorno = sujeito.grava(real);
		assertNotNull(retorno);
		assertEquals("Devia ser moeda : " + real.getCodigoMoeda(), real.getCodigoMoeda(), retorno.getCodigoMoeda());
	}

}
