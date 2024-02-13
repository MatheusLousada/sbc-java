package br.gov.sp.saobernardo.webservice.paradigma.dao;

import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionParadigmaHomologacao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionParadigmaProducao;

public class Conexoes {

	Conexao conexaoParadigma;

	public Conexao getConexao(String ambienteWBC) {

		if (Ambientes.PARADIGMA_DESENVOLVIMENTO.equals(ambienteWBC)) {
			conexaoParadigma = new ConnectionParadigmaHomologacao();
			
		} else if (Ambientes.PARADIGMA_HOMOLOGACAO.equals(ambienteWBC)) {
			conexaoParadigma = new ConnectionParadigmaHomologacao();

		} else if (Ambientes.PARADIGMA_PRODUCAO.equals(ambienteWBC)) {
			conexaoParadigma = new ConnectionParadigmaProducao();

		} else {
			throw new AmbientesException(Ambientes.AMBIENTE_NAO_DEFINIDO);
		}

		return conexaoParadigma;
	}
}
