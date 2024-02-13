package br.gov.sp.saobernardo.webservice.orcom.model.orgaos;

public class Prefeitura extends Orgaos {
	public static final String NOME = "PREFEITURA";
	public static final int ORGAO = 1;
	public static final String DESCRICAO = "MUNICÍPIO DE SÃO BERNARDO DO CAMPO";

	public Prefeitura() {
		super(ORGAO, DESCRICAO, NOME);
	}

}
