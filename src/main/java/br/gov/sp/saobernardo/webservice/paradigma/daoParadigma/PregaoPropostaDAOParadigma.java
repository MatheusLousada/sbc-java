package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemPropostaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class PregaoPropostaDAOParadigma implements PregaoEletronicoItemPropostaDAOInterface {

	private DAOExecutor daoEx;

	public PregaoPropostaDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public PregaoEletronicoItemProposta buscaPeloCodigoDoParadigma(Long codigoWBCItem, Long codigoWBCEmpresa) throws SQLException {

		final String query = "SELECT sDsMarca, sNrRegistro, sDsEmbalagem, sDsModelo, sDsFabricante FROM P_PREGAO_PROPOSTA  WHERE nStProposta = 1 and nCdItem = ? and  nCdEmpresa = ?";
		PregaoEletronicoItemProposta proposta = new PregaoEletronicoItemProposta();

		try {

			daoEx.clearResetParameters().addParameter(codigoWBCItem);
			daoEx.addParameter(codigoWBCEmpresa);
			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {

				final String sDsMarca = rs.getString("sDsMarca");
				final String sNrRegistro = rs.getString("sNrRegistro");
				final String sDsEmbalagem = rs.getString("sDsEmbalagem");
				final String sDsModelo = rs.getString("sDsModelo");
				final String sDsFabricante = rs.getString("sDsFabricante");
				proposta.setMarca(sDsMarca);
				proposta.setNumeroDoRegistro(sNrRegistro);
				proposta.setEmbalagem(sDsEmbalagem);
				proposta.setModelo(sDsModelo);
				proposta.setFabricante(sDsFabricante);

			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return proposta;
	}
}
