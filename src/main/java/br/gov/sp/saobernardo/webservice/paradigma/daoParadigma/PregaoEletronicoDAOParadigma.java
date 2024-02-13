package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class PregaoEletronicoDAOParadigma implements PregaoEletronicoDAOInterface {
	
	private ArquivoDeLog log;
	private static final String QUERY_SELECIONA_COMISSAO_PARTICIPANTE = "SELECT nCdPregaoEletronico, sCdUsuario, nIdPerfil FROM P_PREGAO_COMISSAO WHERE nCdPregaoEletronico = ?";
	private static final String QUERY_SELECIONA_ITENS_DO_PREGAO = "SELECT * FROM P_PREGAO_ITEM WHERE nCdPregaoEletronico = ?";
	private static final String QUERY_SELECIONA_PREGOES_POR_NUMERO_EDITAL_E_PROCESSO = "SELECT * FROM P_PREGAO WHERE sNrEdital = '%s' and sNrProcessoDisplay = '%s'";
	public static final String SEPARADOR = ":";
	private static final String LICITACAO_EM_HOMOLOGACAO = "24";

	private DAOExecutor daoEx;

	public PregaoEletronicoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
		this.log = new ArquivoDeLog();
	}

	public List<PregaoEletronicoModel> selecionaPregoesHomologados(String quantidadePregoes) throws Exception {

		String query = querySelecionaEmHomologacao(quantidadePregoes);

	 
		ResultSet rs1 = daoEx.executeQuery(query);

 
		ArrayList<PregaoEletronicoModel> pregoes = new ArrayList<PregaoEletronicoModel>();
		//Conversores conversores = new Conversores(null);

		while (rs1.next()) {
			PregaoEletronicoModel pem = new PregaoEletronicoModel();
			populaDadosComuns( rs1, pem );
			//final String sNrProcessoDisplay = rs1.getString("sNrProcessoDisplay");
			//final String sNrEdital = rs1.getString("sNrEdital");
			//final String nCdSituacao = rs1.getString("nCdSituacao");
			//final String tDtInicialProposta = rs1.getString("tDtInicialProposta");
			//final String tDtFinalProposta = rs1.getString("tDtFinalProposta");
			//final String tDtInicialDisputa = rs1.getString("tDtInicialDisputa");
			//final String nCdPrazoEntrega = rs1.getString("nCdPrazoEntrega");
			final String sDsObjeto = rs1.getString("sDsObjeto");
			pem.setDescricaoObjeto(sDsObjeto);

			//pem.setNumeroProcessoDisplay(sNrProcessoDisplay);
			//pem.setNumeroEdital(sNrEdital);
			//pem.setCodigoSituacao(Integer.parseInt(nCdSituacao));
			//pem.setCodigoPrazoEntrega(nCdPrazoEntrega);
			//pem.setDataInicialProposta(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
			//pem.setDataInicialDisputa(conversores.stringParaXMLGregorianCalendar(tDtInicialDisputa));
			//pem.setDataFinalProposta(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));

			pregoes.add(pem);
		}
		rs1.close();
		daoEx.close();
		return pregoes;
	}

	public List<PregaoEletronicoModel> selecionaPregaoPorProcessoComEdital(String pregao, String processo)
			throws Exception {

		ResultSet rs1 = daoEx.executeQuery(querySelecionaPregoes(pregao, processo));

		ArrayList<PregaoEletronicoModel> pregoes = new ArrayList<PregaoEletronicoModel>();
		//Conversores conversores = new Conversores(null);

		while (rs1.next()) {
			PregaoEletronicoModel pem = new PregaoEletronicoModel();
			populaDadosComuns(rs1, pem );
			final Long nCdPregaoEletronico = rs1.getLong("nCdPregaoEletronico");
			//final String sNrProcessoDisplay = rs1.getString("sNrProcessoDisplay");
			//final String sNrEdital = rs1.getString("sNrEdital");
			//final String nCdSituacao = rs1.getString("nCdSituacao");
			//final String tDtInicialProposta = rs1.getString("tDtInicialProposta");
			//final String tDtFinalProposta = rs1.getString("tDtFinalProposta");
			//final String tDtInicialDisputa = rs1.getString("tDtInicialDisputa");
			final String nCdPrazoEntrega = rs1.getString("nCdPrazoEntrega");
			final int nCdCondicaoPagamento = rs1.getInt("nCdCondicaoPagamento");

			pem.setCodigoCondicaoPagamento(nCdCondicaoPagamento);
			//pem.setNumeroProcessoDisplay(sNrProcessoDisplay);
			//pem.setNumeroEdital(sNrEdital);
			//pem.setCodigoSituacao(Integer.parseInt(nCdSituacao));
			//pem.setDataInicialProposta(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
			//pem.setDataInicialDisputa(conversores.stringParaXMLGregorianCalendar(tDtInicialDisputa));
			//pem.setDataFinalProposta(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));

			PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega = buscaPrazoDeEntrega(nCdPrazoEntrega);
			pem.setPrazoDeEntrega(prazoDeEntrega);
			pem.setCodigoPrazoEntrega(nCdPrazoEntrega);

			adicionaCommissaoNoPregao(pem, nCdPregaoEletronico);
			adicionaItensNoPregao(pem, nCdPregaoEletronico);

			pregoes.add(pem);
		}
		rs1.close();
		 
		if (pregoes.size() == 0) {
			log.adiciona(String.format("Pregão [%s]   Processo [%s] não encontrado ", pregao, processo));
		}
		daoEx.close();
		return pregoes;
	}
	
	private void populaDadosComuns(ResultSet rs, PregaoEletronicoModel pem) throws SQLException {
		Conversores conversores = new Conversores(null);
		
		final String sNrProcessoDisplay = rs.getString("sNrProcessoDisplay");
		pem.setNumeroProcessoDisplay(sNrProcessoDisplay);
		
		final String sNrEdital = rs.getString("sNrEdital");
		pem.setNumeroEdital(sNrEdital);
		
		final String nCdSituacao = rs.getString("nCdSituacao");
		pem.setCodigoSituacao(Integer.parseInt(nCdSituacao));
		
		final String tDtInicialProposta = rs.getString("tDtInicialProposta");
		pem.setDataInicialProposta(conversores.stringParaXMLGregorianCalendar(tDtInicialProposta));
		
		final String tDtFinalProposta = rs.getString("tDtFinalProposta");
		pem.setDataFinalProposta(conversores.stringParaXMLGregorianCalendar(tDtFinalProposta));

		final String tDtInicialDisputa = rs.getString("tDtInicialDisputa");
		pem.setDataInicialDisputa(conversores.stringParaXMLGregorianCalendar(tDtInicialDisputa));

	}

	private PregaoEletronicoPrazoDeEntregaModel buscaPrazoDeEntrega(String codigoWBC) throws SQLException {
		PregaoEletronicoPrazoDeEntregaDAOParadigma prazoDeEntregaDAO = new PregaoEletronicoPrazoDeEntregaDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
		return prazoDeEntregaDAO.buscaPeloCodigoDoParadigma(Long.valueOf(codigoWBC));
	}

	private void adicionaCommissaoNoPregao(PregaoEletronicoModel pem, Long nCdPregaoEletronico) throws SQLException {
		List<PregaoEletronicoComissaoModel> comissoes = new ArrayList<PregaoEletronicoComissaoModel>();

		 
		try {
			 daoEx.clearResetParameters().addParameter(nCdPregaoEletronico);
			ResultSet rs2 = daoEx.executeQuery(queryComissaoParticipante() );
			while (rs2.next()) {
				PregaoEletronicoComissaoModel comissao = new PregaoEletronicoComissaoModel();
				String sCdUsuario = rs2.getString("sCdUsuario");
				int nIdPerfil = rs2.getInt("nIdPerfil");
				comissao.setCodigoUsuario(sCdUsuario);
				comissao.setCodigoPerfil(nIdPerfil);
				comissoes.add(comissao);
			}
			rs2.close();
			pem.setLstPregaoEletronicoComissao(comissoes);
		} finally {

			daoEx.close();
			
		}
	}

	private void adicionaItensNoPregao(PregaoEletronicoModel pem, Long nCdPregaoEletronico) throws Exception {
		 
		daoEx.clearResetParameters().addParameter(nCdPregaoEletronico);
		 
		ResultSet rs1 = daoEx.executeQuery(queryItensDoPregao() );		 

		List<PregaoEletronicoItemModel> itens = new ArrayList<PregaoEletronicoItemModel>();

		while (rs1.next()) {

			PregaoEletronicoItemModel peim = new PregaoEletronicoItemModel();

			final Long nCdItem = rs1.getLong("nCdItem");
			final String sCdItemLegado = rs1.getString("sCdItemLegado");
			final int nCdItemSequencial = rs1.getInt("nCdItemSequencial");
			final String nCdLote = rs1.getString("nCdLote");
			final Long nCdProduto = rs1.getLong("nCdProduto");
			final String sDsItem = rs1.getString("sDsItem");
			final BigDecimal dQtItem = rs1.getBigDecimal("dQtItem");
			final BigDecimal dVlReferencia = rs1.getBigDecimal("dVlReferencia");
			final long nStItem = rs1.getLong("nStItem");

			// String nCdClasse = rs1.getString("nCdClasse");
			// String nCdUnidadeMedida = rs1.getString("nCdUnidadeMedida");

			PregaoEletronicoItemSituacaoDAOParadigma situacaoDAO = new PregaoEletronicoItemSituacaoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			ProdutoDAOParadigma produtoDAO = new ProdutoDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			ProdutoModel produto = produtoDAO.buscaProdutoPeloCodigoParadigma(nCdProduto);
			PregaoEletronicoItemLanceDAOParadigma lancesDao = new PregaoEletronicoItemLanceDAOParadigma(daoEx.getConnection(), daoEx.isImprimirSql());
			
			peim.setSituacaoPregao(situacaoDAO.buscaPeloCodigoDoParadigma(nStItem));
			peim.setCodigoClasse(produto.getCategoria().getCodigo());
			peim.setCodigoItemLegado(sCdItemLegado);
			peim.setCodigoItemSequencial(nCdItemSequencial);
			peim.setCodigoLoteLegado(nCdLote);
			peim.setCodigoProduto(produto.getCodigo());
			peim.setCodigoUnidadeMedida(produto.getUnidadesDeMedida().get(0).getCodigo());
			peim.setDescricaoItem(sDsItem);
			peim.setQuantidadeItem(dQtItem);
			peim.setValorReferencia(dVlReferencia);
			peim.setLances(lancesDao.buscaPeloCodigoDoParadigma(nCdPregaoEletronico, nCdItem));

			// peim.setPregaoEletronicoItensEnderecos(pregaoEletronicoItensEnderecos);

			itens.add(peim);
		}

		rs1.close();
		pem.setLstPregaoEletronicoItem(itens);
		daoEx.close();
	}

	private String querySelecionaPregoes(String edital, String processo) {
		return String.format(QUERY_SELECIONA_PREGOES_POR_NUMERO_EDITAL_E_PROCESSO, edital, processo);
	}

	private String querySelecionaEmHomologacao(String quantidadePregoes) {
		return MessageFormat.format(
				" SELECT TOP {0} * FROM P_PREGAO WHERE nCdSituacao = {1} ORDER BY nCdPregaoEletronico DESC;",
				quantidadePregoes, LICITACAO_EM_HOMOLOGACAO);

	}

	private String queryItensDoPregao() {
		return QUERY_SELECIONA_ITENS_DO_PREGAO;
	}

	private String queryComissaoParticipante() {
		return QUERY_SELECIONA_COMISSAO_PARTICIPANTE;
	}

	private String querySelecionaPregoesDoAno(String ano) {

		StringBuilder s = new StringBuilder();

		s.append("Select p.nCdPregaoEletronico, p.sNrProcessoDisplay, p.sNrEdital, p.nCdSituacao, s.sDsSituacao ");
		s.append("  from p_pregao p  ");
		s.append("   join p_pregao_situacao s ON p.nCdSituacao = s.nCdSituacao");
		// s.append("--Where sNrEdital IN ( 'PE 385/2019', 'PE 205/2019', 'PE 206/2019',
		// 'PE 207/2019', 'PE 208/2019') " );
		s.append(" where p.nCdSituacao in ( 24 ) and sNrEdital like '%").append(ano).append("%' ");
		s.append(" order by p.sNrEdital DESC");
		
		return s.toString();
	}

	public List<String> selecionaPregaoPorAno(final String ano) throws SQLException {

		final List<String> pregoes = new ArrayList<String>();

		ResultSet rs1 = daoEx.executeQuery(querySelecionaPregoesDoAno(ano));

		while (rs1.next()) {

			StringBuilder s = new StringBuilder();
			s.append(rs1.getString("sNrEdital"));
			s.append(SEPARADOR);
			s.append(rs1.getString("sNrProcessoDisplay"));
			s.append(SEPARADOR);
			s.append(rs1.getString("sDsSituacao"));

			pregoes.add(s.toString());
		}
		
		rs1.close();
		daoEx.close();
		 
		return pregoes;
	}
}
