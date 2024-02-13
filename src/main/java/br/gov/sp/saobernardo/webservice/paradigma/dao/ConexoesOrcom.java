package br.gov.sp.saobernardo.webservice.paradigma.dao;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionORCOMPrefeituraDesenvolvimento2;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionORCOMPrefeituraHomologacao2;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionORCOMPrefeituraProducao2;

public class ConexoesOrcom {

	public Conexao getConexao(String ambiente) {
		Conexao conexaoORCOM;
		if (Ambientes.ORCOM_DESENVOLVIMENTO.equals(ambiente)) {
			conexaoORCOM = new ConnectionORCOMPrefeituraDesenvolvimento2();
		} else if (Ambientes.ORCOM_HOMOLOGACAO.equals(ambiente)) {
			conexaoORCOM = new ConnectionORCOMPrefeituraHomologacao2();
		} else if (Ambientes.ORCOM_PRODUCAO.equals(ambiente)) {
			conexaoORCOM = new ConnectionORCOMPrefeituraProducao2();
		} else {
			throw new AmbientesException(Ambientes.AMBIENTE_NAO_DEFINIDO);
		}
		return conexaoORCOM;
	}

	public Conexao getConexao(ContextoImportacao ci) {
		return getConexao(ci.getDestino());
	}

}
