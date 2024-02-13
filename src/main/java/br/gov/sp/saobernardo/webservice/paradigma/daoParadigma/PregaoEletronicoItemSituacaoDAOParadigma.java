package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemSituacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemSituacao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class PregaoEletronicoItemSituacaoDAOParadigma implements PregaoEletronicoItemSituacaoDAOInterface {
	 
	private DAOExecutor daoEx;
	public PregaoEletronicoItemSituacaoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL );
	}

	public PregaoEletronicoItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException {

		final String query = "SELECT nCdSituacao, sDsSituacao FROM P_PREGAO_ITEM_SITUACAO WHERE nCdSituacao = " + codigoWBC;

		PregaoEletronicoItemSituacao situacao = new PregaoEletronicoItemSituacao();

		try {
			 
			ResultSet rs = daoEx.executeQuery(query );

			while (rs.next()) {

				int codigo = rs.getInt("nCdSituacao");
				String descricao = rs.getString("sDsSituacao");

				situacao.setCodigo(codigo);
				situacao.setDescricao(descricao);

				break;
			}

			rs.close();

		} finally {
			daoEx.close();
		}
		
		return situacao;
	}
}
