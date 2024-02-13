package br.gov.sp.saobernardo.webservice.classes.modelos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoUnidadeMedidaModel {

	private ProdutoModel produto;
	private List<UnidadeDeMedidaModel> unidadesMedida;

	public ProdutoUnidadeMedidaModel() {
		super();
		this.unidadesMedida = new ArrayList<UnidadeDeMedidaModel>();
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public List<UnidadeDeMedidaModel> getUnidadesMedida() {
		return unidadesMedida;
	}

	public void setUnidadesMedida(List<UnidadeDeMedidaModel> unidadesMedida) {
		this.unidadesMedida = unidadesMedida;
	}
}
