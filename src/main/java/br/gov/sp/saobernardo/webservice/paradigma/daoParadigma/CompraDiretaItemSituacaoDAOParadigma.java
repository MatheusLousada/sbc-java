package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaItemSituacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class CompraDiretaItemSituacaoDAOParadigma implements CompraDiretaItemSituacaoDAOInterface {

	private DAOExecutor daoEx;

	public CompraDiretaItemSituacaoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public CompraDiretaItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException {

		final String query = "SELECT * FROM P_COMPRA_DIRETA_ITEM_SITUACAO WHERE nCdSituacao = ?";

		CompraDiretaItemSituacao situacao = new CompraDiretaItemSituacao();

		try {

			daoEx.clearResetParameters().addParameter(codigoWBC);
			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				situacao.setCodigo(rs.getInt("nCdSituacao"));
				situacao.setDescricao(rs.getString("sDsSituacao"));
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return situacao;
	}
}
