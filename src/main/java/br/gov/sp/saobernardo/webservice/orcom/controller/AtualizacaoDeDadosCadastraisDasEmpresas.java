package br.gov.sp.saobernardo.webservice.orcom.controller;

import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class AtualizacaoDeDadosCadastraisDasEmpresas {

	/**
	 * Para debug Acessar
	 * http://dti-webservice-03:8080/atualizacao-wbc-orcom/atualiza-compra-direta
	 * Verificar os dados da licitacao e preencher conforme os exemplos abaixo.
	 */
	public static void main(String[] args) {
		// AtualizacaoCFORXController dadosCadastraisController;
		// AtualizacaoC7708Controller enderecoController;
		// AtualizacaoC7703Controller materiaisController;
		// AtualizacaoC7706Controller certificadosController;
		// AtualizacaoC7702Controller novasEmpresasController;
		AtualizacaoC7121Controller pregaoEletronicoController;

		/** Enviar cotacoes */
		/*
		 * AtualizacaoC7942Controller propostasController; ORCOM_SECOM_QUADRO_Controller
		 * orcom_SECOM_QUADRO_Controller;
		 */
		try {

			boolean imprimirQuery = true;
			pregaoEletronicoController = new AtualizacaoC7121Controller(Ambientes.PARADIGMA_PRODUCAO,
					Ambientes.ORCOM_DESENVOLVIMENTO, imprimirQuery);
			pregaoEletronicoController.cadastraCompraDireta("CE 082", "00302/2019 - CE 082", "2019");
			System.out.println("FIM");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
