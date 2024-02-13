package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.MaterialDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class MaterialDAOParadigma implements MaterialDAOInterface {

	private DAOExecutor daoEx;

	public MaterialDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL );
	}

	public List<MaterialModel> buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws SQLException {
		List<MaterialModel> materiais = new ArrayList<MaterialModel>();

		final String query = "SELECT cp.sCdClasseEmpresa, cp.sDsCaminho FROM EMPRESA_CLASSE EC INNER JOIN CLASSE_PRODUTO cp ON ec.nCdClasse = cp.nCdClasse WHERE  ec.nCdEmpresa = ? and cp.nCdClassePai is not null;";

		try {

			daoEx.clearResetParameters().addParameter(codigoWBCEmpresa);
			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				MaterialModel materialModel = new MaterialModel(rs.getString("sCdClasseEmpresa"),
						rs.getString("sDsCaminho"));
				materiais.add(materialModel);
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return materiais;
	}
}
