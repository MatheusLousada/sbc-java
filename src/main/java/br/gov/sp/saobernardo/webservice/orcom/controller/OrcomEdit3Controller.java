package br.gov.sp.saobernardo.webservice.orcom.controller;

import br.gov.sp.saobernardo.webservice.orcom.dao.OrcomEdit3DAO;
import br.gov.sp.saobernardo.webservice.orcom.model.OrcomEdit3Model;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.ConexoesOrcom;

public class OrcomEdit3Controller {

	Conexao conexaoORCOM;
	OrcomEdit3DAO orcomEmpresaDAO;
	private boolean imprimirQuery;
	private String ambiente;

	public OrcomEdit3Controller(String ambiente, boolean imprimirQuery) {
		this.ambiente = ambiente;
		this.imprimirQuery = imprimirQuery;
	}

	public void abreConexao() throws Exception {
		conexaoORCOM = new ConexoesOrcom().getConexao(ambiente);
		conexaoORCOM.conecta();
	}

	public OrcomEdit3Model buscaPrimeiroItemDoPregaoEletronico(Integer numero1) {
		OrcomEdit3Model retorno = null;
		try {
			if (conexaoORCOM == null) {
				abreConexao();
			}
			orcomEmpresaDAO = new OrcomEdit3DAO(conexaoORCOM.getConnection(), imprimirQuery);
			retorno = orcomEmpresaDAO.buscaPrimeiroPregaoEletroncioPorNumero(numero1);

		} catch (Exception e) {
			retorno = new OrcomEdit3Model();
			System.out.println(e);
		}

		return retorno;
	}

	public OrcomEdit3Model buscaPrimeiroItemDaCompraDireta(Integer numero1) {
		OrcomEdit3Model retorno = null;
		try {
			if (conexaoORCOM == null) {
				abreConexao();
			}
			orcomEmpresaDAO = new OrcomEdit3DAO(conexaoORCOM.getConnection(), imprimirQuery);
			retorno = orcomEmpresaDAO.buscaPrimeiraCompraDiretaPorNumero(numero1);

		} catch (Exception e) {
			retorno = new OrcomEdit3Model();
			System.out.println(e);
		}

		return retorno;
	}

	public void fechaConexao() {
		if (conexaoORCOM != null) {
			conexaoORCOM.fecha();
		}
	}

}
