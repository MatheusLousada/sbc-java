package br.gov.sp.saobernardo.webservice.gui;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.controller.AtualizacaoCFORXController;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class AtualizaDadosCadastrais  {
	private ArquivoDeLog log = new ArquivoDeLog();
	/**
	 * Para debugar com GUI
	 * @param cnpj : CNPJ a ser importado do destino para a origem
	 * @param origem : qual o ambiente de leitura
	 * @param destino : qual o ambiente de gravação
	 * @throws Exception Qualquer exceção
	 */
	public AtualizaDadosCadastrais(String cnpj, ContextoImportacao ci ) throws Exception {

		try {
			atualizar(cnpj, ci);
		} catch (Exception e) {
			if ("VERIFIQUE no SECOM".indexOf(e.getMessage()) >= 0) {
				log.erro("=========================================");
				log.erro(e.getMessage());
				log.erro("=========================================");
			} else {
				log.excecao(e);
			}
		}
	}

	/**
	 * Para importar um CNPJ em produção direto para a produção
	 * 
	 * @param cnpj
	 * @throws Exception
	 */
/*	public AtualizaDadosCadastrais(String cnpj) throws Exception {
		ContextoImportacao ci = new ContextoImportacao(Ambientes.PARADIGMA_PRODUCAO, Ambientes.ORCOM_PREFEITURA_PRODUCAO, false);
		atualizar(cnpj, ci);
	}*/

	private void atualizar(String cnpj, ContextoImportacao ci) throws Exception {
		AtualizacaoCFORXController atualizacaoCFORXController = new AtualizacaoCFORXController(ci.getOrigem(),ci.getDestino(), false);
		atualizacaoCFORXController.abreConexao();
		atualizacaoCFORXController.atualizaDadosCadastraisDeCnpj(cnpj);
		atualizacaoCFORXController.fechaConexao();
	}
	
}
