package br.gov.sp.saobernardo.webservice.orcom.controller;

import br.gov.sp.saobernardo.webservice.orcom.dao.OrcomSecomQuadroDAO;
import br.gov.sp.saobernardo.webservice.orcom.model.OrcomSecomQuadroModel;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.ConexoesOrcom;

public class OrcomSecomQuadroController {

	Conexao conexaoORCOM;
	OrcomSecomQuadroDAO orcomQuadroDAO;
	private boolean imprimirQuery;
	private String ambiente;

	public OrcomSecomQuadroController(String ambiente, boolean imprimirQuery) {
		this.ambiente = ambiente;
		this.imprimirQuery = imprimirQuery;
	}

	public void abreConexao() throws Exception {
		conexaoORCOM = new ConexoesOrcom().getConexao(ambiente);
		conexaoORCOM.conecta();
	}

	public OrcomSecomQuadroModel buscaPrimeiroItemDoQuadro(Integer numero1) {
		OrcomSecomQuadroModel retorno = null;
		try {
			if (conexaoORCOM == null) {
				abreConexao();
			}
			orcomQuadroDAO = new OrcomSecomQuadroDAO(conexaoORCOM.getConnection(), imprimirQuery);
			retorno = orcomQuadroDAO.buscaPrimeiroPregaoEletronicoPorNumero(numero1);

		} catch (Exception e) {
			retorno = new OrcomSecomQuadroModel();
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
