package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.ProdutoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.CategoriaDAO;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class ProdutoDAOParadigma implements ProdutoDAOInterface {

	private DAOExecutor daoEx;

	public ProdutoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL );
	}

	public ProdutoModel buscaProdutoPeloCodigoParadigma(Long nCdProduto) throws Exception {

		final String query = "SELECT * FROM PRODUTO WHERE nCdProduto = '" + nCdProduto + "'";

		ProdutoModel produto = new ProdutoModel();

		try {
			 
			ResultSet rs = daoEx.executeQuery(query);
			while (rs.next()) {

				produto = new ProdutoModel();
				CategoriaDAO categoria = new CategoriaDAO(daoEx.getConnection(), daoEx.isImprimirSql());

				final String sCdProdutoEmpresa = rs.getString("sCdProdutoEmpresa");
				final String nCdEmpresa = rs.getString("nCdEmpresa");
				final String sDsProduto = rs.getString("sDsProduto");
				final String sDsDetalhe = rs.getString("sDsDetalhe");
				final Long nCdClasse = rs.getLong("nCdClasse");
				final Long nCdUnidadeMedida = rs.getLong("nCdUnidadeMedida");

				produto.setCategoria(categoria.buscaPeloCodigoDoParadigma(nCdClasse));
				produto.setCodigo(sCdProdutoEmpresa);
				produto.setCodigoEmpresa(nCdEmpresa);
				produto.setDescricao(sDsProduto);
				produto.setDetalhe(sDsDetalhe);

				UnidadeDeMedidaDAO unidadeMedidaDao = new UnidadeDeMedidaDAO(daoEx.getConnection(), daoEx.isImprimirSql());
				UnidadeDeMedidaModel unidadeMedida = unidadeMedidaDao.buscaPeloCodigoDoParadigma(nCdUnidadeMedida);
				ArrayList<UnidadeDeMedidaModel> unidadesDeMedida = new ArrayList<UnidadeDeMedidaModel>();
				unidadesDeMedida.add(unidadeMedida);

				produto.setUnidadesDeMedida(unidadesDeMedida);
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return produto;
	}
}
