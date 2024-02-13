package br.gov.sp.saobernardo.webservice.paradigma.modelos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.TelefoneFactory;

public class NumeroTelefonicoTest {

	private TelefoneFactory telefoneFactory;
	
	@Test
	public void removeTexto() {
		telefoneFactory = new TelefoneFactory("não temos número");
		assertEquals(null, telefoneFactory.getTelefone1());
	}
	
	@Test
	public void removeCamposNaoNumericos() {
		telefoneFactory = new TelefoneFactory("(11) 2630-5067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDddDeNumero() {
		telefoneFactory = new TelefoneFactory("1126305067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDddDuplicadoDeNumero() {
		telefoneFactory = new TelefoneFactory("111126305067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDddDuplicadoComZeroDeNumero() {
		telefoneFactory = new TelefoneFactory("1101126305067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDddDuplicadoDeNumeroComNoveDigitos() {
		telefoneFactory = new TelefoneFactory("1111926305067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("926305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDddDuplicadoComZeroDeNumeroComNoveDigitos() {
		telefoneFactory = new TelefoneFactory("11011926305067");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("926305067", telefoneFactory.getTelefone1().getNumero());
	}
	
	@Test
	public void separaDoisNumerosSemDdd() {
		telefoneFactory = new TelefoneFactory("2630506726305044");
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
		assertEquals("26305044", telefoneFactory.getTelefone2().getNumero());
	}
	
	@Test
	public void separaDoisNumerosSemDddOPrimeiroComDdd() {
		telefoneFactory = new TelefoneFactory("112630506726305044");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
		assertEquals("26305044", telefoneFactory.getTelefone2().getNumero());
	}
	
	@Test
	public void separaDoisNumerosComDdd() {
		telefoneFactory = new TelefoneFactory("11263050671126305044");
		assertEquals("11", telefoneFactory.getTelefone1().getDdd());
		assertEquals("26305067", telefoneFactory.getTelefone1().getNumero());
		assertEquals("11", telefoneFactory.getTelefone2().getDdd());
		assertEquals("26305044", telefoneFactory.getTelefone2().getNumero());
	}

}
