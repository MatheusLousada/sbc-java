package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.OcupacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.OcupacaoModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class OcupacaoDAOParadigma implements OcupacaoDAOInterface {

	private ResultSet rs1;
	private DAOExecutor daoEx;

	public OcupacaoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public OcupacaoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws SQLException {

		final String query = "SELECT DISTINCT C.nCdCnae, C.sDsCnae FROM CNAE C INNER JOIN EMPRESA E  ON E.nCdCnae = C.nCdCnae WHERE E.nCdEmpresa = "
				+ String.valueOf(codigoWBCEmpresa);

		OcupacaoModel ocupacaoModel = new OcupacaoModel(-1L, "");

		try {

			rs1 = daoEx.executeQuery(query);

			while (rs1.next()) {
				ocupacaoModel = new OcupacaoModel(rs1.getLong("nCdCnae"), rs1.getString("sDsCnae"));
			}

			rs1.close();
			
		} finally {
			daoEx.close();
		}

		return ocupacaoModel;
	}
}
