package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.modelos.DeParaModel;

public class DeParaDAO /* extends AbstractDAO */ {

	private DAOExecutor daoEx;

	public DeParaDAO(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public DeParaModel buscaComCodigoParadigma(String codigoWBC, int tipo) throws SQLException {

		final String query = "SELECT * FROM WBT_DE_PARA WHERE sCdItemWBC = " + codigoWBC + " and nCdTipoDocumento = "
				+ String.valueOf(tipo);

		DeParaModel dePara = new DeParaModel();

		try {
			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				dePara.setCodigoWBT(rs.getString("sCdItemWBC"));
				dePara.setCodigoPMSBC(rs.getString("sCdItemEmpresa"));
				dePara.setDescricao(rs.getString("sDsDescricao"));
				dePara.setTipo(rs.getInt("nCdTipoDocumento"));
			}
			rs.close();
		} finally {
			daoEx.close();
		}

		return dePara;

	}
}
