package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionParadigmaHomologacao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionParadigmaProducao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.AmbientesException;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;

public class ParadigmaFornecedorController {

	Conexao conexaoParadigma;
	EmpresaDAO empresaDAO;
	private boolean imprimirQuery;

	public ParadigmaFornecedorController(String ambiente, boolean imprimirQuery) {
		this.imprimirQuery = imprimirQuery;
		if (Ambientes.PARADIGMA_DESENVOLVIMENTO.equals(ambiente)) {
			conexaoParadigma = new ConnectionParadigmaHomologacao();
		} else if (Ambientes.PARADIGMA_HOMOLOGACAO.equals(ambiente)) {
			conexaoParadigma = new ConnectionParadigmaHomologacao();
		} else if (Ambientes.PARADIGMA_PRODUCAO.equals(ambiente)) {
			conexaoParadigma = new ConnectionParadigmaProducao();
		} else {
			throw new AmbientesException(Ambientes.AMBIENTE_NAO_DEFINIDO);
		}
	}

	public EmpresaModel buscaFornecedorPorCodigoWBC(Long wbc) {
		EmpresaModel retorno = null;
		try {
			conexaoParadigma.conecta();
			empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
			retorno = empresaDAO.buscaPeloCodigoDaParadigma(wbc);
		} catch (Exception e) {
			retorno = new EmpresaModel();
			System.out.println(e);
		}

		conexaoParadigma.fecha();
		return retorno;
	}

	public List<EmpresaModel> buscaTodas() {
		List<EmpresaModel> retorno = null;
		try {
			conexaoParadigma.conecta();
			empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
			retorno = empresaDAO.buscaTodasEmpresas();
		} catch (Exception e) {
			retorno = new ArrayList<EmpresaModel>();
			System.out.println(e);
		}

		conexaoParadigma.fecha();
		return retorno;
	}

}
