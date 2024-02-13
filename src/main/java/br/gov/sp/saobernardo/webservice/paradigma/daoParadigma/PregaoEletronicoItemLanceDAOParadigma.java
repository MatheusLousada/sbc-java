package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemLanceDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.classes.utils.Pausa;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class PregaoEletronicoItemLanceDAOParadigma implements PregaoEletronicoItemLanceDAOInterface {
	
	private DAOExecutor daoEx;
	
	public PregaoEletronicoItemLanceDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con,   imprimirSQL);
	}

	public List<PregaoEletronicoItemLanceModel> buscaPeloCodigoDoParadigma(Long codigoWBCPregao, Long codigoWBCItem)
			throws SQLException {

		// =========================================================================
		// [Hudo, 10/10/2019] Query para saber se o pregao foi feito em lotes ou não
		// =========================================================================

		final String queryIsPregaoComLote = "SELECT DISTINCT(nCdPregaoEletronico) FROM P_PREGAO_LOTE_LANCE  WHERE nCdPregaoEletronico = '" + codigoWBCPregao + "'";

		ResultSet rsPregaoComLote = daoEx.executeQuery(queryIsPregaoComLote );
		Long nroPregaoEletronico = 0L;

		while (rsPregaoComLote.next()) {
			nroPregaoEletronico = rsPregaoComLote.getLong("nCdPregaoEletronico");
		}

		rsPregaoComLote.close();

		ResultSet rs;
		// Testaremos se o pregao é com lote ou não
		if (nroPregaoEletronico == (long)0) {
			// --------------------------------------------------------
			// Pregao não é com lote - Usaremos a tabela P_PREGAO_LANCE
			// --------------------------------------------------------

			StringBuilder queryLanceItem = querySemLote(codigoWBCPregao, codigoWBCItem);
			rs = daoEx.executeQuery(queryLanceItem);
 
		} else {
			// ---------------------------------------------------------
			// Pregao é com lote - Usaremos a tabela P_PREGAO_LOTE_LANCE
			// ---------------------------------------------------------
			
			StringBuilder queryVencedor = queryComLote();
			
			daoEx.clearResetParameters().addParameter(codigoWBCPregao);
			daoEx.addParameter(codigoWBCItem);

			ResultSet rsVenc = daoEx.executeQuery(queryVencedor );
			BigDecimal percentualUnitario = new BigDecimal(0);

			while (rsVenc.next()) {
				percentualUnitario = rsVenc.getBigDecimal("percentualUnitario");
			}

			rsVenc.close();

			/*
			 * [Hudo, 19/09/2019] Se o percentual unitario para o item for 0 (zero),
			 * significa que o lote foi fracassado e, portanto, não foi possível calcular o
			 * percentual unitário
			 */
			final boolean isLoteFracassado = percentualUnitario.signum() == 0;

			// Pregão com lote e status desclassificado (0) - Deve ir para o ORCOM também
			//System.out.println( "Pregão com lote e status desclassificado 0 => percentualUnitario.signum() == 0 " + isLoteFracassado);
			if (isLoteFracassado) {
			
				StringBuilder queryDesclasItem = queryComLoteItemDesclassificado();

				daoEx.clearResetParameters().addParameter(codigoWBCPregao);
				daoEx.addParameter(codigoWBCPregao);
				daoEx.addParameter(codigoWBCItem);
				rs = daoEx.executeQuery(queryDesclasItem);

			} else{ // Pregão com lote e status classificado (1)
			
				StringBuilder query = queryLancesOutrosParticipantes();

				daoEx.clearResetParameters();
				//.addParameter( 1 );
				daoEx.addParameter( percentualUnitario );
				daoEx.addParameter( codigoWBCPregao );
				daoEx.addParameter( codigoWBCPregao );
				daoEx.addParameter( codigoWBCItem );
				daoEx.addParameter( percentualUnitario );
				daoEx.addParameter( codigoWBCPregao );
				daoEx.addParameter( codigoWBCPregao );
				daoEx.addParameter( codigoWBCItem );
				
				rs = daoEx.executeQuery(query );
			}
		}

		List<PregaoEletronicoItemLanceModel> lances = new ArrayList<PregaoEletronicoItemLanceModel>();
		final Pausa pausa = new Pausa();

		while (rs.next()) {

			PregaoEletronicoItemLanceModel lance = new PregaoEletronicoItemLanceModel();

			String nCdEmpresa = rs.getString("nCdEmpresa");
			String tDtLance = rs.getString("dataLance");
			int nNrRanking = rs.getInt("nNrRanking");
			BigDecimal dVlLance = rs.getBigDecimal("vlUnitario");
			int nStLance = rs.getInt("stLoteLance");
			String sDsJustificativa = rs.getString("descJustificativa");
//			int bFlAceitabilidade = rs.getInt("bFlAceitabilidade");
			int bFlVencedor = rs.getInt("bFlVencedor");

			// lance.setBeneficiarioLei123(beneficiarioLei123)
			EmpresaDAOParadigma empresaDAO = new EmpresaDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			EmpresaModel empresa = empresaDAO.buscaPeloCodigoDaParadigma(Long.valueOf(nCdEmpresa));

			lance.setCodigoEmpresa(empresa.getCodigoEmpresa());
			Conversores conversores = new Conversores(null);
			lance.setDataLance(conversores.stringParaXMLGregorianCalendar(tDtLance));
			lance.setNumeroRanking(nNrRanking);
			lance.setValorLance(dVlLance);
//			lance.setBeneficiarioLei123(bFlAceitabilidade);
			lance.setVencedor(bFlVencedor);
			lance.setJustificativa(sDsJustificativa);
			lance.setLanceValido( nStLance == PregaoEletronicoItemLanceModel.LANCE_VALIDO );
			lance.setBeneficiarioLei123(empresa.getBeneficiarioLei123());

			PregaoPropostaDAOParadigma pregaoPropostaDAO = new PregaoPropostaDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			PregaoEletronicoItemProposta proposta = pregaoPropostaDAO.buscaPeloCodigoDoParadigma(codigoWBCItem, Long.valueOf(nCdEmpresa));

			lance.setProposta(proposta);
			lances.add(lance);
			
			pausa.pausa((long)100);
		}

		rs.close();
		daoEx.close();

		return lances;
	}

	private StringBuilder queryComLoteItemDesclassificado() {

		StringBuilder sql = new StringBuilder();

		/*
		 * NO Convert abaixo definimos o valor unitario 
		 * com base no menor lance desclassificado dividido
		 * pela quantidade de itens
		 */
		sql.append("SELECT ");
		sql.append("   INTERNA.nCdEmpresa, ");
		sql.append("   MAX(PLL_E.tDtLoteLance) AS dataLance, ");
		sql.append("   PLL_E.nNrRanking, ");
		sql.append("   CONVERT( DECIMAL(18,2), min(PLL_E.dVlLoteLance) / INTERNA.dQtItem ) AS vlUnitario, "); 
		sql.append("   PLL_E.nStLoteLance AS stLoteLance, ");
		sql.append("   PLL_E.sDsJustificativa AS descJustificativa, ");
		sql.append("   PLL_E.bFlVencedor ");
		sql.append("\n FROM ( ");
		sql.append("   SELECT PI.nCdItem, PI.dQtItem, PLL.nCdLote, PLL.nCdPregaoEletronico, min(PLL.dVlLoteLance) AS LanceFinal, PLL.nCdEmpresa, E.sNmEmpresa  ");
		sql.append("\n   FROM P_PREGAO_LOTE_LANCE PLL ");
		sql.append("\n     JOIN P_PREGAO_ITEM PI ON PLL.nCdPregaoEletronico = PI.nCdPregaoEletronico AND PLL.nCdLote = PI.nCdLote ");
		sql.append("\n     JOIN EMPRESA E ON PLL.nCdEmpresa = E.nCdEmpresa ");
		sql.append("\n   WHERE PLL.nCdPregaoEletronico = ? ");
		sql.append("\n   GROUP BY PI.nCdItem, PI.dQtItem, PLL.nCdLote, PLL.nCdPregaoEletronico, PLL.nCdEmpresa, E.sNmEmpresa ");
		sql.append("   ) AS INTERNA ");
		sql.append("\n   INNER JOIN P_PREGAO_LOTE_LANCE PLL_E ");
		sql.append("\n     ON INTERNA.nCdPregaoEletronico = PLL_E.nCdPregaoEletronico AND INTERNA.nCdEmpresa = PLL_E.nCdEmpresa AND INTERNA.nCdLote = PLL_E.nCdLote ");
		sql.append("\n WHERE INTERNA.nCdPregaoEletronico = ? AND PLL_E.nStLoteLance = 0 AND PLL_E.nNrRanking IS NULL AND INTERNA.nCdItem = ?");
		sql.append("\n GROUP BY INTERNA.nCdEmpresa, PLL_E.nNrRanking, INTERNA.dQtItem, PLL_E.nStLoteLance, PLL_E.sDsJustificativa, PLL_E.bFlVencedor");
		
		return sql;
	}

	private StringBuilder queryLancesOutrosParticipantes() {

		StringBuilder sql = new StringBuilder();

		sql.append("SELECT PLL.nCdEmpresa, " );
		sql.append("\n     CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.tDtLance ELSE PLL.tDtLoteLance END AS dataLance, " );
		sql.append("\n     PLL.nNrRanking, " );

		// ---> 1) Aqui o percentual unitário do vencedor é usado
		sql.append("\n     CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.dVlLance ELSE convert( decimal(18,2), ? * PLL.dVlLoteLance ) END AS vlUnitario, " ); 
		sql.append("\n     CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.nStLance ELSE PLL.nStLoteLance  END AS stLoteLance, "  );
		sql.append("\n     CASE WHEN PL.sDsJustificativa IS NULL THEN ' ' ELSE PL.sDsJustificativa END AS descJustificativa, "  );
		sql.append("\n     PLL.bFlVencedor "  );
		sql.append("\n FROM (SELECT PLL.* FROM P_PREGAO_LOTE_LANCE PLL" );
		sql.append("\n JOIN " );

		// 2) Aqui o código do pregão eletrônico é usado
		sql.append("\n      ( SELECT max(nCdLoteLance) AS maxNCdLoteLance, nCdEmpresa AS maxNCdEmpresa, nCdLote FROM P_PREGAO_LOTE_LANCE " ); 
		sql.append("\n        WHERE nCdPregaoEletronico = ? "  );
		sql.append("\n        GROUP BY nCdEmpresa, nCdLote ) AS X " ); 
		sql.append("\n      ON nCdLoteLance = maxNCdLoteLance AND nCdEmpresa = maxNCdEmpresa) AS PLL " );
		
		sql.append("\n      JOIN EMPRESA E  ON PLL.nCdEmpresa = E.nCdEmpresa " );
		sql.append("\n      LEFT OUTER JOIN P_PREGAO_LANCE PL ON PLL.nCdPregaoEletronico = PL.nCdPregaoEletronico AND PLL.nCdLoteLance = PL.nCdLoteLance "  );
		
		sql.append("\n      JOIN P_PREGAO_ITEM PI ON PLL.nCdPregaoEletronico = PI.nCdPregaoEletronico AND PLL.nCdLote = PI.nCdLote AND PL.nCdItem = PI.nCdItem" );
		sql.append("\n WHERE PLL.nCdPregaoEletronico = ? " ); 
		sql.append("\n  AND PL.nCdItem = ? " ); 
		
		sql.append("\n\n UNION ALL " );
		
		sql.append("\n\nSELECT PLL.nCdEmpresa, "  );
		sql.append("\n       CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.tDtLance ELSE PLL.tDtLoteLance END AS dataLance, "  );
		sql.append("\n       PLL.nNrRanking, " );
		sql.append("\n       CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.dVlLance ELSE convert( decimal(18,2), ? * PLL.dVlLoteLance ) END AS vlUnitario, " );
 // ---> 5) Aqui o percentual unitário do vencedor é usado
		sql.append("\n       CASE WHEN PLL.nNrRanking = 1 AND PLL.nNrRanking IS NOT NULL THEN PL.nStLance ELSE PLL.nStLoteLance END AS stLoteLance, "  );
		sql.append("\n       CASE WHEN PLL.sDsJustificativa IS NULL THEN ' ' ELSE PLL.sDsJustificativa END AS descJustificativa, "  );
		sql.append("\n       PLL.bFlVencedor "  );
		
		sql.append("\n       FROM (SELECT PLL.* FROM P_PREGAO_LOTE_LANCE PLL "  );
		sql.append("\n       JOIN ( SELECT max(nCdLoteLance) AS maxNCdLoteLance, nCdEmpresa AS maxNCdEmpresa, nCdLote " );
		sql.append("\n        FROM P_PREGAO_LOTE_LANCE " );
		sql.append("\n       WHERE nCdPregaoEletronico = ? " ); //6)   código do pregão eletrônico  
	 	sql.append("\n        GROUP BY nCdEmpresa, nCdLote ) AS X "  );
		sql.append("\n      ON nCdLoteLance = maxNCdLoteLance AND nCdEmpresa = maxNCdEmpresa) AS PLL "  );
		sql.append("\n      JOIN EMPRESA E ON PLL.nCdEmpresa = E.nCdEmpresa "  );
		sql.append("\n      LEFT OUTER JOIN P_PREGAO_LANCE PL ON PLL.nCdPregaoEletronico = PL.nCdPregaoEletronico AND PLL.nCdLoteLance = PL.nCdLoteLance "  );
		sql.append("\n      JOIN P_PREGAO_ITEM PI ON PLL.nCdPregaoEletronico = PI.nCdPregaoEletronico AND PLL.nCdLote = PI.nCdLote "  );

		// 7) Aqui o código do pregão eletrônico é usado
		sql.append("\n WHERE PLL.nCdPregaoEletronico = ? "  );

		// 8) Aqui o código do item é usado
		sql.append("\n  AND PI.nCdItem = ? "  );
		sql.append("\n  AND PL.nCdItem IS NULL "  );
		sql.append("\n ORDER BY nNrRanking; ");

		return sql;
	}

	private StringBuilder queryComLote() {

		StringBuilder sql = new StringBuilder();

		sql.append("SELECT CONVERT( DECIMAL(18,8), PL.dVlLance / PLL.dVlLoteLance ) percentualUnitario ");
		sql.append(" FROM P_PREGAO_LOTE_LANCE PLL ");
		sql.append(" JOIN P_PREGAO_LANCE PL ON PLL.nCdPregaoEletronico = PL.nCdPregaoEletronico ");
		sql.append(" AND PLL.nCdLoteLance = PL.nCdLoteLance ");
		sql.append(" JOIN EMPRESA E ON PLL.nCdEmpresa = E.nCdEmpresa ");
		sql.append(" WHERE PLL.nCdPregaoEletronico = ? AND PL.nCdItem = ?  AND PLL.nNrRanking IS NOT NULL" );
		
		return sql;
	}

	private StringBuilder querySemLote(Long codigoWBCPregao, Long codigoWBCItem) {

		StringBuilder sql = new StringBuilder();

		sql.append("SELECT nCdEmpresa, tDtLance AS dataLance, nNrRanking, dVlLance AS vlUnitario, nStLance AS stLoteLance, sDsJustificativa AS descJustificativa, bFlVencedor ");
		sql.append("\n FROM P_PREGAO_LANCE ");
		sql.append("\n WHERE nCdPregaoEletronico = '#PREGAO#' AND nCdItem = '#ITEM#' AND (bFlAceitabilidade IS NULL OR bFlAceitabilidade <> 0) AND nNrRanking IS NOT NULL ");
		sql.append("\n UNION ALL ");
		sql.append("\nSELECT INTERNA.nCdEmpresa, PL_E.tDtLance AS dataLance, PL_E.nNrRanking, MIN(INTERNA.vlUnit) AS vlUnitario, INTERNA.stLoteLance, INTERNA.descJustificativa, INTERNA.bFlVencedor ");
		sql.append("\n FROM ( SELECT PL.nCdPregaoEletronico, MAX(PL.nCdLance) AS ultimoLance,  PL.nCdEmpresa, MIN(PL.dVlLance) AS vlUnit, PL.nStLance AS stLoteLance, PL.sDsJustificativa AS descJustificativa, PL.bFlVencedor ");
		sql.append("\n FROM P_PREGAO_LANCE PL ");
		sql.append("\n  WHERE PL.nCdPregaoEletronico = '#PREGAO#' AND PL.nStLance = 0 and nCdItem = '#ITEM#' ");
		sql.append("\n GROUP BY PL.nCdPregaoEletronico, PL.nCdEmpresa, PL.nStLance,  PL.sDsJustificativa, PL.bFlVencedor ");
		sql.append(" ) AS INTERNA ");
		sql.append("\n INNER JOIN P_PREGAO_LANCE PL_E ON INTERNA.nCdPregaoEletronico = PL_E.nCdPregaoEletronico  AND INTERNA.nCdEmpresa = PL_E.nCdEmpresa  AND INTERNA.ultimoLance = PL_E.nCdLance ");
		sql.append("\n WHERE PL_E.nCdPregaoEletronico = '#PREGAO#' AND nCdItem = '#ITEM#' ");
		sql.append("\n GROUP BY INTERNA.nCdEmpresa, PL_E.tDtLance, PL_E.nNrRanking, INTERNA.stLoteLance, INTERNA.descJustificativa, INTERNA.bFlVencedor ");
		sql.append("\n ORDER BY stLoteLance DESC, nNrRanking ");
		
		String query =sql.toString()
                .replaceAll("#ITEM#", codigoWBCItem.toString() )
        		.replaceAll("#PREGAO#", codigoWBCPregao.toString() );
		
		StringBuilder r = new StringBuilder( query);
		
		return r; 
	}
}
