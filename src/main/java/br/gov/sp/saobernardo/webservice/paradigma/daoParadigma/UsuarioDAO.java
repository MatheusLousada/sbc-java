package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.UsuarioDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.UsuarioModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class UsuarioDAO implements UsuarioDAOInterface {

	private DAOExecutor daoEx;

	public UsuarioDAO(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public UsuarioModel buscaPorCodigo(String codigoWBC) throws SQLException {
		
		final String query = "SELECT * FROM USUARIO WHERE sCdUsuario = '" + codigoWBC + "'";
		UsuarioModel usuario = new UsuarioModel();

		try {

			ResultSet rs = daoEx.executeQuery(query);
			while (rs.next()) {
				usuario = new UsuarioModel();

				final String codigoUsuario = rs.getString("sCdUsuario");
				final String nomeUsuario = rs.getString("sNmUsuario");

				usuario.setCodigoUsuario(codigoUsuario);
				usuario.setNomeUsuario(nomeUsuario);

			}
			
			rs.close();

		} finally {
			daoEx.close();
		}

		return usuario;
	}
}
