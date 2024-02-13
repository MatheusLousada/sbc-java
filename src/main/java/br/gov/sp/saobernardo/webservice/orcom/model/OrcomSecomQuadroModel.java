package br.gov.sp.saobernardo.webservice.orcom.model;

import java.math.BigDecimal;

public class OrcomSecomQuadroModel {

	private String empresa;
	private String material;
	private Integer matricula;
	private Integer requisicao;
	private BigDecimal valor;
	private BigDecimal quantidade;
	private String cnpj;
	private String media;
	private Integer tipo_item;
	private Integer item;
	private String marca;
	private String unidade;
	private String estado;
	private Integer mestotal;
	private Integer mesnoano;
	private Integer tipodoc;
	private Integer sequencia;
	private Integer dta_emissao;
	private String observacao;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Integer requisicao) {
		this.requisicao = requisicao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Integer getTipo_item() {
		return tipo_item;
	}

	public void setTipo_item(Integer tipo_item) {
		this.tipo_item = tipo_item;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getMestotal() {
		return mestotal;
	}

	public void setMestotal(Integer mestotal) {
		this.mestotal = mestotal;
	}

	public Integer getMesnoano() {
		return mesnoano;
	}

	public void setMesnoano(Integer mesnoano) {
		this.mesnoano = mesnoano;
	}

	public Integer getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(Integer tipodoc) {
		this.tipodoc = tipodoc;
	}

	public Integer getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}

	public Integer getDta_emissao() {
		return dta_emissao;
	}

	public void setDta_emissao(Integer dta_emissao) {
		this.dta_emissao = dta_emissao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
