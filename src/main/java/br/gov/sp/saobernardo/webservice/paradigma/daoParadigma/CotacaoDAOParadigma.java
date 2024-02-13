package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CotacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class CotacaoDAOParadigma implements CotacaoDAOInterface {

	public static final String SEPARADOR = ":";
	private DAOExecutor daoEx;

	public CotacaoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public final List<String> selecionaCotacoesEncerradasDescricao(String ano) throws SQLException {

		List<String> descricoes = new ArrayList<String>();
		final String query = queryCotacaoDesricao(ano);

		try {

			ResultSet rs = daoEx.executeQuery(query);
  
			while (rs.next()) {
				descricoes.add(rs.getString("scdprocesso"));
			}

			// Collections.sort(descricoes);

			rs.close();

		} finally {
			daoEx.close();
		}
		
		return descricoes;
	}

	public List<CotacaoModel> selecionaCotacoesEncerradas(int ano, int mes) throws SQLException {

		final String query = querySelecionaEncerradas(ano, mes);
		ArrayList<CotacaoModel> cotacoes = new ArrayList<CotacaoModel>();

		try {

			Conversores conversores = new Conversores(null);

			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				CotacaoModel cotacao = new CotacaoModel();
				String sCdProcesso = rs.getString("sCdProcesso");
				String sDsCotacao = rs.getString("sDsCotacao");
				String tDtInicial = rs.getString("tDtInicial");
				String tDtFinal = rs.getString("tDtFinal");
				cotacao.setCodigoProcesso(sCdProcesso);
				cotacao.setDescricaoCotacao(sDsCotacao);
				cotacao.setDataInicial(conversores.stringParaXMLGregorianCalendar(tDtInicial));
				cotacao.setDataFinal(conversores.stringParaXMLGregorianCalendar(tDtFinal));

				cotacoes.add(cotacao);
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return cotacoes;
	}

	public List<Integer> filtraAnosComCotacoesEncerradas() throws SQLException {

		String query = queryAnosCotacaoEncerrada();
		ArrayList<Integer> anos = new ArrayList<Integer>();

		try {

			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				anos.add(rs.getInt("ano"));
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return anos;
	}

	public Boolean isProcessoComCotacoesEncerradas(String processo) throws SQLException {

		Boolean isCotacaoEncerrada = Boolean.FALSE;
		String query = querySituacaoCotacao(processo);

		try {
			ResultSet rs = daoEx.executeQuery(query);

			while (rs.next()) {
				isCotacaoEncerrada = 0 == rs.getInt("situacao");
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return isCotacaoEncerrada;
	}

	private String querySituacaoCotacao(String processo) {

		final String query = "SELECT count( c.ncdsituacao ) situacao FROM cotacao c WHERE c.scdprocesso = '%s' AND ncdsituacao <> 7";
		return String.format(query, processo);
	}

	private String querySelecionaEncerradas(int ano, int mes) {

		StringBuilder query = new StringBuilder();

		query.append("SELECT TOP(300) C.SCDPROCESSO, C.SDSCOTACAO, C.TDTINICIAL, C.TDTFINAL ");
		query.append("\n  FROM COTACAO C");
		query.append("\n INNER JOIN COTACAO_ITEM CI ON CI.NCDCOTACAO = C.NCDCOTACAO");
		query.append("\n WHERE NCDSITUACAO = 7");

		if (mes == 0 && ano == 0) {
			query.append("\n   AND CAST( c.tDtencerramento AS DATE ) >= GETDATE() -30");
		} else {
			query.append("\n AND datepart(month, c.tDtencerramento) = ").append(mes);
			query.append("\n AND datepart(year, c.tDtencerramento) = ").append(ano);
		}

		query.append("\n GROUP BY C.SCDPROCESSO, C.nCdCotacao, C.SDSCOTACAO, C.TDTINICIAL, C.TDTFINAL");
		// query.append("HAVING SUM(CI.DVLREFERENCIA * CI.DQTITEM )> 8000 \n");
		query.append("\n ORDER BY C.nCdCotacao DESC; ");

		return query.toString();
	}

	private String queryCotacaoDesricao(String ano) {

		StringBuilder query = new StringBuilder();

		query.append(" SELECT C.scdprocesso + '").append(CotacaoDAOParadigma.SEPARADOR)
				.append("' + c.sDsSituacao as scdprocesso, C.SDSCOTACAO");
		query.append(
				"   FROM ( SELECT cast( SUBSTRING( c1.scdprocesso, 1, CHARINDEX('/', c1.scdprocesso)-1 )  AS INT ) nprocesso,");
		query.append(
				"                 SUBSTRING( c1.scdprocesso, CHARINDEX('/', c1.scdprocesso)+1, LEN( c1.scdprocesso ) - CHARINDEX('/', c1.scdprocesso) ) ano");
		query.append("               , c1.sCdProcesso, c1.SDSCOTACAO, s1.sDsSituacao ");
		query.append("            FROM COTACAO C1");
		query.append("                 INNER JOIN COTACAO_ITEM CI1 ON CI1.NCDCOTACAO = c1.NCDCOTACAO");
		query.append("                 JOIN COTACAO_SITUACAO S1 on c1.ncdsituacao = s1.ncdsituacao");
		query.append("           WHERE c1.scdprocesso like '%/#ANO#%'");
//			query.append("            AND  c1.NCDSITUACAO = 7");
		query.append("           GROUP BY c1.SCDPROCESSO, c1.SDSCOTACAO, s1.sDsSituacao");
		query.append("        ) c");
		query.append("  GROUP BY C.SCDPROCESSO, C.SDSCOTACAO, c.nprocesso, c.sDsSituacao");
		query.append("  ORDER BY c.nProcesso DESC");

		return query.toString().replaceAll("#ANO#", ano.trim());
	}

	public String queryAnosCotacaoEncerrada() {

		StringBuilder q = new StringBuilder();

		q.append("SELECT year( cast( c.tDtencerramento AS DATE ) ) ano ");
		q.append("	FROM cotacao c ");
		q.append(" INNER JOIN COTACAO_ITEM CI ON C.NCDCOTACAO = CI.NCDCOTACAO ");
		q.append(" WHERE c.tDtencerramento is not null ");
		q.append("  and c.NCDSITUACAO = 7");
		q.append(" GROUP BY year( CAST(c.tDtencerramento AS DATE) )  ");
		// q.append(" HAVING SUM(CI.DVLREFERENCIA * CI.DQTITEM )> 8000" );
		q.append(" ORDER BY 1 desc ");
		return q.toString();
	}
}
