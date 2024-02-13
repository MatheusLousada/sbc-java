package br.gov.sp.saobernardo.webservice.paradigma.service.builders;

import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;

public class UnidadeDeMedidaBuilder {

	private String codigo;
	private String sigla;
	private String descricao;
	private LogDeRetornoDaGravacao logDeRetornoDaGravacao;

	public UnidadeDeMedidaBuilder() {
	}

	public UnidadeDeMedidaBuilder comCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}

	public UnidadeDeMedidaBuilder comSigla(String sigla) {
		this.sigla = sigla;
		return this;
	}

	public UnidadeDeMedidaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public UnidadeDeMedidaBuilder comLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDeRetornoDaGravacao = logDaGravacao;
		return this;
	}

	public UnidadeDeMedidaModel build() {
		UnidadeDeMedidaModel unidadeDeMedidaModel = new UnidadeDeMedidaModel();
		unidadeDeMedidaModel.setCodigo(codigo);

		if (null == descricao) {
			descricao = "Teste de integracao " + codigo;
		}
		unidadeDeMedidaModel.setDescricao(descricao);

		if (null == sigla) {
			sigla = "Teste" + codigo;
		}
		unidadeDeMedidaModel.setSigla(sigla);
		if (null != logDeRetornoDaGravacao) {
			unidadeDeMedidaModel.setLogDaGravacao(logDeRetornoDaGravacao);
		}
		return unidadeDeMedidaModel;
	}
}