package br.gov.sp.saobernardo.webservice.paradigma.controller;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7121Controller;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class TestaSelecaoPregaoEletronicoHomologados {

	private static final int QTD_ITENS = 500;

	@Test
	public void obtemListaDePregoesEletronicos() throws Exception {

		final AtualizacaoC7121Controller sujeito = new AtualizacaoC7121Controller(Ambientes.PARADIGMA_PRODUCAO,
				Ambientes.ORCOM_DESENVOLVIMENTO, true);
		List<PregaoEletronicoModel> homologacao = sujeito.selecionaPregoesHomologados(String.valueOf(QTD_ITENS));
		assertTrue(homologacao.size() == QTD_ITENS);
	}

	@Test
	public void deveTerUmaListaDePregoesHomologados() throws Exception {

		final AtualizacaoC7121Controller sujeito = new AtualizacaoC7121Controller(Ambientes.PARADIGMA_PRODUCAO,
				Ambientes.ORCOM_DESENVOLVIMENTO, true);
		List<PregaoEletronicoModel> homologacao = sujeito.selecionaPregoesHomologados(String.valueOf(QTD_ITENS));
		assertNotEquals("Deveria trazer alguns itens",0, homologacao.size());

		/*
		 * for (PregaoEletronicoModel pregao : homologacao) { StringBuilder s = new
		 * StringBuilder(); s.append(pregao.getNumeroProcessoDisplay());
		 * s.append(" - "); s.append(pregao.getNumeroEdital()); s.append(" - ");
		 * s.append(pregao.getDescricaoObjeto()); s.append(" - ");
		 * s.append(pregao.getDataInicialProposta().toGregorianCalendar().getTime());
		 * s.append(" - "); s.append(pregao.getDataFinalProposta());
		 * System.out.println(s.toString()); }
		 */
	}

}
