package br.gov.sp.saobernardo.webservice.paradigma.modelos.contacorrente;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteFactory;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteModel;

@Ignore
public class ContaCorrenteFactoryTest {

	ContaCorrenteFactory fabrica = new ContaCorrenteFactory();
	
	@Test
	public void contaCorrenteComTipo() {
		ContaCorrenteModel conta = fabrica.fabricaConta(new BancoModel(),"000.0.0.2.9.0.0.0.6.06", "5");
		assertEquals("29", conta.getTipo());
		assertEquals("000606", conta.getNumero());
		assertEquals("5", conta.getDigito());				
	}
	
	@Test
	public void contaCorrenteSemTipo() {
		ContaCorrenteModel conta = fabrica.fabricaConta(new BancoModel(), "000.0.0.0.0.0.6.06", "5");
		assertEquals("", conta.getTipo());
		assertEquals("000606", conta.getNumero());
		assertEquals("5", conta.getDigito());
	}

}
