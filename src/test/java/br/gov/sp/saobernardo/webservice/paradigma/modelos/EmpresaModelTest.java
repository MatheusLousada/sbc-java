package br.gov.sp.saobernardo.webservice.paradigma.modelos;

import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;

public class EmpresaModelTest {
	
	EmpresaModel empresa = new EmpresaModel();
	
	@Test
	public void teste() {
		empresa.setInscricaoMunicipal("1");
		empresa.setInscricaoEstadual("ABC");
	}

}
