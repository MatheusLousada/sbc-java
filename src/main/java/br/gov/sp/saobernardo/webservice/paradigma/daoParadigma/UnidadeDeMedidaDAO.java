package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.UnidadeDeMedidaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DeParaDAO;

public class UnidadeDeMedidaDAO implements UnidadeDeMedidaDAOInterface {

	private DAOExecutor daoEx;

	public UnidadeDeMedidaDAO(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con,imprimirSQL);
	}

	public UnidadeDeMedidaModel buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException {

		StringBuilder query = new StringBuilder();
		query.append(" SELECT * FROM UNIDADE_MEDIDA WHERE nCdUnidadeMedida = ").append(  codigoWBC );

		UnidadeDeMedidaModel unidadeMedida = new UnidadeDeMedidaModel();
		
		try {
 
			ResultSet rs = daoEx.executeQuery(query );
			while (rs.next()) {

				unidadeMedida = new UnidadeDeMedidaModel();

				final String sDsUnidadeMedida = rs.getString("sDsUnidadeMedida");
				final String sSgUnidadeMedida = rs.getString("sSgUnidadeMedida");

				DeParaDAO dePara = new DeParaDAO(daoEx.getConnection(), daoEx.isImprimirSql());

				unidadeMedida.setCodigo(dePara.buscaComCodigoParadigma(String.valueOf(codigoWBC), 5).getCodigoPMSBC());
				unidadeMedida.setDescricao(sDsUnidadeMedida);
				unidadeMedida.setSigla(sSgUnidadeMedida);
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return unidadeMedida;
	}
}
