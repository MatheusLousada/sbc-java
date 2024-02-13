package br.gov.sp.saobernardo.webservice.paradigma.modelos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;

public class MaterialModelTest {

	@Test
	public void novoMaterial() {
		MaterialModel materialModel = new MaterialModel("8620", "8620 - SOFTWARES");
		assertEquals("86", materialModel.getGrupo());
		assertEquals("20", materialModel.getSubGrupo());
		assertEquals("8620 - SOFTWARES", materialModel.getDescricao());
	}

}
