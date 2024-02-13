package br.gov.sp.saobernardo.webservice.paradigma.service;

import br.gov.sp.saobernardo.webservice.classes.modelos.Constantes;

public enum ServicesName {

	UNIDADE_MEDIDA(Constantes.TEMPURI, "UnidadeMedida"), 
	CATEGORIA(Constantes.TEMPURI, "Categoria"), 
	EMPRESA(Constantes.TEMPURI, "Empresa"),
	USUARIO(Constantes.TEMPURI, "Usuario"),
	CONDICAO_DE_PAGAMENTO(Constantes.TEMPURI, "CondicaoPagamento"),
	COTACAO(Constantes.TEMPURI,"Cotacao"),
	PREGAO_ELETRONICO( Constantes.TEMPURI,"PregaoEletronico"),
	COMPRA_DIRETA(Constantes.TEMPURI, "CompraDireta"),
	MOEDA(Constantes.TEMPURI, "Moeda"),
	PRODUTO_UNIDADE_MEDIDA(Constantes.TEMPURI, "ProdutoUnidadeMedida"),
	PRODUTO(Constantes.TEMPURI, "Produto");

	private String url;
	private String servico;

	ServicesName(String url, String servico) {
		this.url = url;
		this.servico = servico;
	}

	public String getUrl() {
		return url;
	}

	public String getServico() {
		return servico;
	}
}
