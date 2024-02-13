package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CategoriaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DeParaDAO;

public class CategoriaDAOParadigma implements CategoriaDAOInterface {

	private DAOExecutor daoEx;

	public CategoriaDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public CategoriaModel buscaPeloCodigoDoParadigma(Long nCdProduto) throws SQLException {

		final String query = "SELECT nCdClasse, nCdClassePai, sDsCaminho FROM CLASSE_PRODUTO WHERE nCdClasse = " + nCdProduto;

		CategoriaModel categoria = new CategoriaModel();
		
		try {

			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
		
				final String nCdClasse = rs.getString("nCdClasse");
				final String nCdClassePai = rs.getString("nCdClassePai");
				final String sDsCaminho = rs.getString("sDsCaminho");

				DeParaDAO dePara = new DeParaDAO(daoEx.getConnection(), daoEx.isImprimirSql());

				categoria.setCodigo(dePara.buscaComCodigoParadigma(nCdClasse, 4).getCodigoPMSBC());
				categoria.setDescricao(sDsCaminho);
				categoria.setCodigoPai(dePara.buscaComCodigoParadigma(nCdClassePai, 4).getCodigoPMSBC());

			}
		
			rs.close();
		
		} finally {
			daoEx.close();
		}

		return categoria;
	}
}
