package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class CompraDiretaDAOParadigma implements CompraDiretaDAOInterface {

	public static final String SEPARADOR = ":";
	private DAOExecutor daoEx;

	public CompraDiretaDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public List<CompraDiretaModel> selecionaComprasHomologadas() throws SQLException {

		final String query = querySelecionaEmHomologacao();
		ArrayList<CompraDiretaModel> compras = new ArrayList<CompraDiretaModel>();
		ResultSet rs = daoEx.executeQuery(query);

		while (rs.next()) {

			CompraDiretaModel cdm = new CompraDiretaModel();
			final String sNrProcessoDisplay = rs.getString("sNrProcessoDisplay");
			final String sNrEdital = rs.getString("sNrEdital");
			final String nCdSituacao = rs.getString("nCdSituacao");
			final String tDtInicialProposta = rs.getString("tDtInicial");
			final String tDtFinalProposta = rs.getString("tDtFinal");
			final String nCdPrazoEntrega = rs.getString("nCdPrazoEntrega");
			final String sDsObjeto = rs.getString("sDsObjeto");

			cdm.setNumeroProcessoDisplay(sNrProcessoDisplay);
			cdm.setNumeroEdital(sNrEdital);
			cdm.setCodigoSituacao(Long.valueOf(nCdSituacao));
			cdm.setCodigoPrazoEntrega(nCdPrazoEntrega);
			cdm.setDescricaoObjeto(sDsObjeto);

			Conversores conversores = new Conversores(null);
			cdm.setDataInicial(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
			cdm.setDataFinal(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));

			compras.add(cdm);
		}
		
		rs.close();
		daoEx.close();

		return compras;
	}

	public List<CompraDiretaModel> selecionaCompraPorProcessoComEdital(String compra, String processo) throws Exception {
 
		ArrayList<CompraDiretaModel> compras = new ArrayList<CompraDiretaModel>();
		Conversores conversores = new Conversores(null);
		daoEx.clearResetParameters().addParameter(compra);
		daoEx.addParameter(processo);
		ResultSet rs = daoEx.executeQuery(querySelecionaCompras() );

		while (rs.next()) {

			CompraDiretaModel cdm = new CompraDiretaModel();
			final String sNrProcessoDisplay = rs.getString("sNrProcessoDisplay");
			final String tDtInicialProposta = rs.getString("tDtInicial");
			final int nCdCondicaoPagamento = rs.getInt("nCdCondicaoPagamento");
			final String tDtFinalProposta = rs.getString("tDtFinal");
			final String nCdPrazoEntrega = rs.getString("nCdPrazoEntrega");
			final Long nCdCompraDireta = rs.getLong("nCdCompraDireta");
			final String nCdSituacao = rs.getString("nCdSituacao");
			final String sNrEdital = rs.getString("sNrEdital");
			PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega = buscaPrazoEntrega(nCdPrazoEntrega);

			cdm.setCodigoCondicaoPagamento(String.valueOf(nCdCondicaoPagamento));
			cdm.setNumeroProcessoDisplay(sNrProcessoDisplay);
			cdm.setCodigoSituacao(Long.valueOf(nCdSituacao));
			cdm.setNumeroEdital(sNrEdital);
			cdm.setDataInicial(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
			cdm.setDataFinal(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));
			cdm.setPrazoDeEntrega(prazoDeEntrega);
			cdm.setCodigoPrazoEntrega(nCdPrazoEntrega);

			adicionaCommissaoNoPregao(cdm, nCdCompraDireta);
			adicionaItensNaCompra(cdm, nCdCompraDireta);

			compras.add(cdm);
		}

		rs.close();
		daoEx.close();

		return compras;
	}

	private String querySelecionaComprasDoAno(String ano) {

		StringBuilder s = new StringBuilder();

		s.append("Select p.nCdCompraDireta, p.sNrProcessoDisplay, p.sNrEdital, p.nCdSituacao, s.sDsSituacao");
		s.append("  from p_compra_direta p");
		s.append("   join p_compra_direta_situacao s ON p.nCdSituacao = s.nCdSituacao");
		// s.append("-- Where sNrEdital IN ( 'CE 383/2019' )");
		s.append(" where  p.nCdSituacao in ( 8 ) and");
		s.append("      sNrEdital like '%").append(ano).append("%' ");
		s.append(" order by p.sNrEdital DESC");

		return s.toString();
	}

	public List<String> selecionaCompraDiretaPorAno(final String ano) throws SQLException {

		final List<String> pregoes = new ArrayList<String>();
		ResultSet rs = daoEx.executeQuery(querySelecionaComprasDoAno(ano));

		while (rs.next()) {
			StringBuilder s = new StringBuilder();
			s.append(rs.getString("sNrEdital"));
			s.append(SEPARADOR);
			s.append(rs.getString("sNrProcessoDisplay"));
			s.append(SEPARADOR);
			s.append(rs.getString("sDsSituacao"));

			pregoes.add(s.toString());
		}

		rs.close();
		daoEx.close();

		return pregoes;
	}

	private PregaoEletronicoPrazoDeEntregaModel buscaPrazoEntrega(String codigoWBC) throws SQLException {

		PregaoEletronicoPrazoDeEntregaDAOParadigma condicaoDAO = new PregaoEletronicoPrazoDeEntregaDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
		return condicaoDAO.buscaPeloCodigoDoParadigma(Long.valueOf(codigoWBC));
	}

	private void adicionaCommissaoNoPregao(CompraDiretaModel cdm, Long nCdCompraDireta) throws SQLException {

		List<CompraDiretaComissaoModel> comissoes = new ArrayList<CompraDiretaComissaoModel>();
		daoEx.clearResetParameters().addParameter(nCdCompraDireta);
		ResultSet rs = daoEx.executeQuery(queryComissaoParticipante() );

		while (rs.next()) {
			CompraDiretaComissaoModel comissao = new CompraDiretaComissaoModel();
			comissao.setCodigoUsuario(rs.getString("sCdUsuario"));
			comissao.setPerfil(rs.getInt("nIdPerfil"));
			comissoes.add(comissao);
		}

		rs.close();
		daoEx.close();

		cdm.setLstCompraDiretaComissao(comissoes);
	}

	private void adicionaItensNaCompra(CompraDiretaModel cdm, Long nCdCompraDireta) throws Exception {

		List<CompraDiretaItemModel> itens = new ArrayList<CompraDiretaItemModel>();
		daoEx.clearResetParameters().addParameter(nCdCompraDireta);
		ResultSet rs = daoEx.executeQuery(queryItensDaCompra());

		while (rs.next()) {

			CompraDiretaItemModel cdim = new CompraDiretaItemModel();
			Long nCdItem = rs.getLong("nCdItem");
			String sCdItemLegado = rs.getString("sCdItemLegado");
			int nCdItemSequencial = rs.getInt("nCdItemSequencial");
			String nCdLote = rs.getString("nCdLote");
			Long nCdProduto = rs.getLong("nCdProduto");
			String sDsItem = rs.getString("sDsItem");
			BigDecimal dQtItem = rs.getBigDecimal("dQtItem");
			BigDecimal dVlReferencia = rs.getBigDecimal("dVlReferencia");
			long nStItem = rs.getLong("nStItem");

			CompraDiretaItemSituacaoDAOParadigma situacaoDAO = new CompraDiretaItemSituacaoDAOParadigma(daoEx.getConnection(),
					daoEx.isImprimirSql());
			cdim.setSituacaoCompra(situacaoDAO.buscaPeloCodigoDoParadigma(nStItem));

			ProdutoDAOParadigma produtoDAO = new ProdutoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			ProdutoModel produto = produtoDAO.buscaProdutoPeloCodigoParadigma(nCdProduto);

			cdim.setCodigoClasse(produto.getCategoria().getCodigo());
			cdim.setCodigoItemLegado(sCdItemLegado);
			cdim.setCodigoItemSequencial(nCdItemSequencial);
			cdim.setCodigoLoteLegado(nCdLote);

			cdim.setCodigoProduto(produto.getCodigo());

			cdim.setCodigoUnidadeMedida(produto.getUnidadesDeMedida().get(0).getCodigo());
			cdim.setDescricaoItem(sDsItem);
			// peim.setPregaoEletronicoItensEnderecos(pregaoEletronicoItensEnderecos);
			cdim.setQuantidadeItem(dQtItem);
			cdim.setValorReferencia(dVlReferencia);

			CompraDiretaItemLanceDAOParadigma lancesDao = new CompraDiretaItemLanceDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			cdim.setLances(lancesDao.buscaPeloCodigoDoParadigma(nCdCompraDireta, nCdItem));

			itens.add(cdim);
		}

		rs.close();
		daoEx.close();

		cdm.setLstCompraDiretaItem(itens);
	}

	private String querySelecionaCompras() {

		StringBuilder query = new StringBuilder();

		query.append(" SELECT * \n");
		query.append(" FROM \n");
		query.append("    P_COMPRA_DIRETA \n");
		query.append(" WHERE \n");
		query.append("    sNrEdital = ? and \n");
		query.append("    sNrProcessoDisplay = ? ;");

		return query.toString();
	}

	private String querySelecionaEmHomologacao() {

		StringBuilder query = new StringBuilder();

		query.append("SELECT TOP 200 CD.nCdCompraDireta, CD.sNrProcessoDisplay, CD.sNrEdital, CD.nCdSituacao, CD.tDtInicial, CD.tDtFinal, CD.nCdPrazoEntrega, CD.sDsObjeto \n");
		query.append("  FROM P_COMPRA_DIRETA CD \n");
		query.append(" INNER JOIN P_COMPRA_DIRETA_LANCE CDL ON CDL.nCdCompraDireta = CD.nCdCompraDireta \n");
		query.append(" WHERE CDL.bFlVencedor = 1 \n");
		query.append(" AND CD.nCdSituacao = 8 \n");
		query.append(" AND CD.sNrEdital IS NOT NULL \n");
		query.append(" GROUP BY CD.nCdCompraDireta, CD.sNrProcessoDisplay, CD.sNrEdital, \n");
		query.append(" CD.nCdSituacao, CD.tDtInicial, CD.tDtFinal, \n");
		query.append(" CD.nCdPrazoEntrega, CD.sDsObjeto \n");
		query.append(" HAVING SUM(CDL.dVlLance * CDL.dQtLance) > 0 \n");
		query.append(" ORDER BY CD.nCdCompraDireta DESC; \n");

		return query.toString();
	}

	private String queryItensDaCompra() {

		StringBuilder query = new StringBuilder();

		query.append(" SELECT * \n");
		query.append(" FROM \n");
		query.append("    P_COMPRA_DIRETA_ITEM \n");
		query.append(" WHERE \n");
		query.append("    nCdCompraDireta = ? ;");

		return query.toString();
	}

	private String queryComissaoParticipante() {

		StringBuilder query = new StringBuilder();

		query.append(" SELECT \n");
		query.append("    nCdCompraDireta \n");
		query.append("    , sCdUsuario \n");
		query.append("    , nIdPerfil \n");
		query.append(" FROM \n");
		query.append("    P_COMPRA_DIRETA_COMISSAO \n");
		query.append(" WHERE \n");
		query.append("    nCdCompraDireta = ?  ;");

		return query.toString();
	}
}
