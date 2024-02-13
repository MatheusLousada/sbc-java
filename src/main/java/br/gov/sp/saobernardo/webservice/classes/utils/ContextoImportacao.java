package br.gov.sp.saobernardo.webservice.classes.utils;

import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

/**
 * define um contexto de importacao
 * 
 * @author 41476
 *
 */
public class ContextoImportacao {
	private String origem;
	private String destino;
	private Boolean imprimirQuery;
	private Orgaos orgao;

	public ContextoImportacao(String origem, String destino, Boolean imprimirQuery, Orgaos orgao) {
		iniciar(origem, destino, imprimirQuery, orgao);
	}

	public ContextoImportacao(String origem, String destino, Orgaos orgao) {
		iniciar(origem, destino, Boolean.FALSE, orgao);
	}

	private void iniciar(String origem, String destino, Boolean imprimirQuery, Orgaos orgao) {
		this.origem = origem;
		this.destino = destino;
		this.imprimirQuery = imprimirQuery;
		this.orgao = orgao;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Boolean getImprimirQuery() {
		return imprimirQuery;
	}

	public void setImprimirQuery(Boolean imprimirQuery) {
		this.imprimirQuery = imprimirQuery;
	}

	public Orgaos getOrgao() {
		return orgao;
	}

	@Override
    public String toString() {
        return "ContextoImportacao{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", imprimirQuery=" + imprimirQuery +
                orgao + '}';
    }
}
