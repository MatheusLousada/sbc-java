package br.gov.sp.saobernardo.webservice.orcom.controller;

import java.sql.SQLException;
import java.util.List;

import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.Conexoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.EmpresaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class EmpresasController {
	
	Conexao conexaoParadigma;
	EmpresaDAO empresaDAO;
	@SuppressWarnings("unused")	private ArquivoDeLog log;

	public EmpresasController(String ambiente, boolean imprimirQuery) throws Exception {

		conexaoParadigma = new Conexoes().getConexao(ambiente);
		conexaoParadigma.conecta();
		empresaDAO = new EmpresaDAO(conexaoParadigma.getConnection(), imprimirQuery);
		this.log = new ArquivoDeLog();
	}
	
	public List<String>listaCnpj() throws SQLException {
		return empresaDAO.listaCnpj();
	}

}
