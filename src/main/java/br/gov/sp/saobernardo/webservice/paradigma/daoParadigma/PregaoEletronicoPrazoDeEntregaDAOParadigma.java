package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoPrazoDeEntregaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class PregaoEletronicoPrazoDeEntregaDAOParadigma implements PregaoEletronicoPrazoDeEntregaDAOInterface {

	private DAOExecutor daoEx;

	public PregaoEletronicoPrazoDeEntregaDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public PregaoEletronicoPrazoDeEntregaModel buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException {

		final String query = "SELECT nCdPrazoEntrega, sDsPrazoEntrega, nNrDias FROM  PRAZO_ENTREGA  WHERE nCdPrazoEntrega = " + String.valueOf(codigoWBC);

		PregaoEletronicoPrazoDeEntregaModel unidadeMedida = new PregaoEletronicoPrazoDeEntregaModel();
		
		try {
 
			ResultSet rs = daoEx.executeQuery(query );

			while (rs.next()) {
				unidadeMedida.setCodigo(rs.getInt("nCdPrazoEntrega"));
				unidadeMedida.setDescricao(rs.getString("sDsPrazoEntrega"));
				unidadeMedida.setNumeroDeDias(rs.getInt("nNrDias"));

			}

			rs.close();
			
		} finally {
			daoEx.close();
		}

		return unidadeMedida;
	}
}
