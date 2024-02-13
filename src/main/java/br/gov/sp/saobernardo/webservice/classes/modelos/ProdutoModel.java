package br.gov.sp.saobernardo.webservice.classes.modelos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {

	public static final int TAMANHO_CODIGO = 50;
	public static final int TAMANHO_PRODUTO = 2000;
	public static final int TAMANHO_DETALHE = 8000;
	public static final int TAMANHO_CLASSE = 50;
	public static final int TAMANHO_CODIGO_EMPRESA = 14;

	// Nome do campo Tipo Tamanho Descrição
	private String codigo; // String 50 Código do produto no sistema cliente
	private String descricao; // String 2000 Nome/descrição do produto
	private String detalhe; // String 8000 Detalhes do produto
	private CategoriaModel codigoCategoria; // String 50 Código da categoria do produto

	private LogDeRetornoDaGravacao logDaGravacao;

	private List<UnidadeDeMedidaModel> unidadesDeMedida = new ArrayList<UnidadeDeMedidaModel>();

	private String codigoEmpresa; // Código ou CNPJ da empresa

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public CategoriaModel getCategoria() {
		return codigoCategoria;
	}

	public void setCategoria(CategoriaModel codigoPai) {
		this.codigoCategoria = codigoPai;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public List<UnidadeDeMedidaModel> getUnidadesDeMedida() {
		return unidadesDeMedida;
	}

	public void setUnidadesDeMedida(List<UnidadeDeMedidaModel> unidadeDeMedida) {
		this.unidadesDeMedida = unidadeDeMedida;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

}
