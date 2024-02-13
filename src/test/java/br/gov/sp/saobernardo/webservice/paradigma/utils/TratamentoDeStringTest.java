package br.gov.sp.saobernardo.webservice.paradigma.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;

public class TratamentoDeStringTest {
	
	private TratamentoDeString tratador;

	@Before
	public void antes() {
		tratador = new TratamentoDeString();
	}

	@Test
	public void deveCompletarStringComZerosAEsquerda() {

		String s = "1234";
		int tamanho = 10;
		
		String sCompletada = tratador.completaComZerosAEsquerda(s, tamanho);
		
		assertEquals("0000001234", sCompletada);
		assertEquals(tamanho, sCompletada.length());
	
	}
	
	@Test
	public void deveRemoverZerosAEsquerda() {
		
		String s = "000000001234";
		int tamanho = 4;
		
		String sSemZeros = tratador.removeZerosAEsquerda(s);
		
		assertEquals("1234", sSemZeros);
		assertEquals(tamanho, sSemZeros.length());
		
	}
	
	@Test
	public void deveCompletarStringVaziaComZerosAEsquerda() {
		
		String s = "";
		int tamanho = 10;
		
		String sTratada = tratador.completaComZerosAEsquerda(s, tamanho);
		
		assertEquals("0000000000", sTratada);
		assertEquals(tamanho, sTratada.length());
		
	}
	
	@Test
	public void deveRemoverNaoNumericos() {
		
		String s = "_-43AYb5N3f90";
		int tamanho = 6;
		
		String sTratada = tratador.removeNaoNumericos(s);
		
		assertEquals("435390", sTratada);
		assertEquals(tamanho, sTratada.length());
		
	}
	
	@Test
	public void deveRemoverNaoNumericosDeUmaStringSemNumeros() {
		
		String s = "___________";
		int tamanho = 0;
		
		String sTratada = tratador.removeNaoNumericos(s);
		
		assertEquals("", sTratada);
		assertEquals(tamanho, sTratada.length());
		
	}
	
	@Test
	public void deveRemoverNaoNumericosDeUmaStringSemNumerosEPreencheComSomenteZeros() {
		
		String s = "___________";
		int tamanhoDesejado = CompraDiretaItemLanceModel.TAMANHO_DA_STRING_DE_NUMEROS_DE_REGISTRO_DA_ANVISA;
		
		String sTratada = tratador.removeNaoNumericos(s);
		String stringVaziaComSomenteZeros = tratador.completaComZerosAEsquerda(sTratada, tamanhoDesejado);
		
		
		assertEquals("0000000000000", stringVaziaComSomenteZeros);
		assertEquals(tamanhoDesejado, stringVaziaComSomenteZeros.length());
		
	}
	
	

}
