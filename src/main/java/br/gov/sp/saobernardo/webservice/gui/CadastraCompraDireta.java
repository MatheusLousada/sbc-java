package br.gov.sp.saobernardo.webservice.gui;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7121Controller;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoC7942Controller;

public class CadastraCompraDireta {

	public void cadastraCompraDireta(String ano, String numeroCompraDireta,
			String processo, ContextoImportacao ci /*
							 * , String origem, String destino, Boolean imprimirQuery
							 */) throws Exception {

		// ContextoImportacao ci = new ContextoImportacao(origem, destino,
		// imprimirQuery);

		AtualizacaoC7121Controller pregaoEletronicoController = new AtualizacaoC7121Controller(ci);
		// Atualiza os orçamentos, porém impede se houverem orçamentos sem encerrar
		AtualizacaoC7942Controller cotacoes = new AtualizacaoC7942Controller(ci);
		if (cotacoes.atualizaPropostasDeProcesso(processo, ano)) {
			pregaoEletronicoController.cadastraCompraDireta(numeroCompraDireta, processo, ano);
		}
		cotacoes.fecha();

	}

}
