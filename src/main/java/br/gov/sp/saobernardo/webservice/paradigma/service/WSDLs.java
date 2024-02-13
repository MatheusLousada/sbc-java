package br.gov.sp.saobernardo.webservice.paradigma.service;

import br.gov.sp.saobernardo.webservice.classes.modelos.Servidores;

public enum WSDLs {

	WSDL_UNIDADE_MEDIDA_DESENV_HMG( Servidores.IP_HMG.getIp() + "UnidadeMedida.svc?wsdl"), 
	WSDL_UNIDADE_MEDIDA_PRODUCAO(  	Servidores.IP_PRD.getIp() + "UnidadeMedida.svc?wsdl"),

	WSDL_CATEGORIA_DESENV_HMG( Servidores.IP_HMG.getIp() + "Categoria.svc?wsdl"), 
	WSDL_CATEGORIA_PRODUCAO(   Servidores.IP_PRD.getIp() + "Categoria.svc?wsdl"),

	WSDL_CONDICAO_PAGAMENTO_DESENV_HMG( Servidores.IP_HMG.getIp() + "CondicaoPagamento.svc?wsdl"), 
	WSDL_CONDICAO_PAGAMENTO_PRODUCAO(  	Servidores.IP_PRD.getIp() + "CondicaoPagamento.svc?wsdl"),

	WSDL_EMPRESA_DESENV_HMG( Servidores.IP_HMG.getIp() + "Empresa.svc?wsdl"), 
	WSDL_EMPRESA_PRODUCAO(   Servidores.IP_PRD.getIp() + "Empresa.svc?wsdl"),

	WSDL_USUARIO_DESENV_HMG( Servidores.IP_HMG.getIp() + "Usuario.svc?wsdl"),
	WSDL_USUARIO_PRODUCAO(   Servidores.IP_PRD.getIp() + "Usuario.svc?wsdl"),

	WSDL_PRODUTO_DESENV_HMG( Servidores.IP_HMG.getIp() + "Produto.svc?wsdl"), 
	WSDL_PRODUTO_PRODUCAO(   Servidores.IP_PRD.getIp() + "Produto.svc?wsdl"),
	
	WSDL_COMPRA_DIRETA_DESENV_HMG( Servidores.IP_HMG.getIp() + "CompraDireta.svc?wsdl"), 
	WSDL_COMPRA_DIRETA_PRODUCAO(   Servidores.IP_PRD.getIp() + "CompraDireta.svc?wsdl"),
	
	WSDL_PREGAO_ELETRONICO_DESENV_HMG( Servidores.IP_HMG.getIp() + "PregaoEletronico.svc?wsdl"), 
	WSDL_PREGAO_ELETRONICO_PRODUCAO(   Servidores.IP_PRD.getIp() + "PregaoEletronico.svc?wsdl"),
	
	WSDL_MOEDA_DESENV_HMG( Servidores.IP_HMG.getIp() + "Moeda.svc?wsdl"), 
	WSDL_MOEDA_PRODUCAO(   Servidores.IP_PRD.getIp() + "Moeda.svc?wsdl"),

	WSDL_PRODUTO_X_UNIDADE_MEDIDA_DESENV_HMG( Servidores.IP_HMG.getIp() + "ProdutoUnidadeMedida.svc?wsdl"), 
	WSDL_PRODUTO_X_UNIDADE_MEDIDA_PRODUCAO( Servidores.IP_PRD.getIp() + "ProdutoUnidadeMedida.svc?wsdl"), 
	
	WSDL_COTACAO_DESENV_HMG( Servidores.IP_HMG.getIp() + "Cotacao.svc?wsdl"), 
	WSDL_COTACAO_PRODUCAO(   Servidores.IP_PRD.getIp() + "Cotacao.svc?wsdl");

	private String value;

	WSDLs(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
