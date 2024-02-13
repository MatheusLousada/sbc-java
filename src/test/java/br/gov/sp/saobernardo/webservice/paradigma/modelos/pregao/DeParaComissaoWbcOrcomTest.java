package br.gov.sp.saobernardo.webservice.paradigma.modelos.pregao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.DeParaComissaoWbcOrcom;

public class DeParaComissaoWbcOrcomTest {

	private DeParaComissaoWbcOrcom deParaComissaoWbcOrcom;

	
	@Before
	public void setup() {
		deParaComissaoWbcOrcom = new DeParaComissaoWbcOrcom();
	}
	
	@Test
	public void deveRetornarCodigoDePregoeiroDoOrcom() {
		Integer codigoDePregoeiroDoWbc = 2;
		Integer codigoDePregoeiroDoOrcom = 3;
		assertEquals(codigoDePregoeiroDoOrcom, deParaComissaoWbcOrcom.getCodigoOrcom(codigoDePregoeiroDoWbc));
	}
	
	@Test
	public void deveRetornarCodigoDeAutoridadeDoOrcom() {
		Integer codigoDeAutoridadeDoWbc = 4;
		Integer codigoDeAutoridadeDoOrcom = 8;
		assertEquals(codigoDeAutoridadeDoOrcom, deParaComissaoWbcOrcom.getCodigoOrcom(codigoDeAutoridadeDoWbc));
	}
	
	@Test
	public void deveRetornarCodigoDeApoioDoOrcom() {
		Integer codigoDeApoioDoWbc = 1;
		Integer codigoDeApoioDoOrcom = 4;
		assertEquals(codigoDeApoioDoOrcom, deParaComissaoWbcOrcom.getCodigoOrcom(codigoDeApoioDoWbc));
	}
	
	@Test
	public void deveRetornarZeroCasoCodigoNaoSejaEncontrado() {
		assertEquals(Integer.valueOf(0), deParaComissaoWbcOrcom.getCodigoOrcom(null));
		assertEquals(Integer.valueOf(0), deParaComissaoWbcOrcom.getCodigoOrcom(10));
	}

}
