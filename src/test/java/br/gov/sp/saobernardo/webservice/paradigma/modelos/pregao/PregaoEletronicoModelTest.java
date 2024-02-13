package br.gov.sp.saobernardo.webservice.paradigma.modelos.pregao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;

public class PregaoEletronicoModelTest {

	@Test
	public void testIsPregaoComAno() {
		PregaoEletronicoModel pregaoEletronicoModel = new PregaoEletronicoModel();
		pregaoEletronicoModel.setNumeroEdital("PE391/2022");
		assertTrue(pregaoEletronicoModel.isEditalComAno());

		pregaoEletronicoModel.setNumeroEdital("PE391");
		assertFalse(pregaoEletronicoModel.isEditalComAno());

		pregaoEletronicoModel.setNumeroEdital("PE391/abc");
		assertFalse(pregaoEletronicoModel.isEditalComAno());

		pregaoEletronicoModel.setNumeroEdital("");
		assertFalse(pregaoEletronicoModel.isEditalComAno());

		pregaoEletronicoModel.setNumeroEdital(null);
		assertFalse(pregaoEletronicoModel.isEditalComAno());
	}

}
