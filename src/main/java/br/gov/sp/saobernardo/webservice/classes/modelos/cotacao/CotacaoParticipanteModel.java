package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

import br.gov.sp.saobernardo.webservice.classes.utils.Validadores;

public class CotacaoParticipanteModel {

	/**
	 * sCdEmpresa
	 * 
	 * String 14
	 * 
	 * Código ou CNPJ da empresa participante da cotação
	 */
	private String codigoEmpresa;

	/**
	 * Int 1
	 * 
	 * Indica a participa��o da empresa: 0 � Habilitado, 1 � Processo lido, 2 �
	 * Resposta parcial, 3 � Resposta total
	 */
	private int participacao;
	public static final int PARTICIPACAO_HABILITADA = 0;
	public static final int PARTICIPACAO_PROCESSO_LIDO = 1;
	public static final int PARTICIPACAO_REPOSTA_PARCIAL = 2;
	public static final int PARTICIPACAO_RESPOSTA_TOTAL = 3;

	/**
	 * int 1
	 * 
	 * Participante homologado
	 */
	private int homologado;
	public static final int HOMOLOGACAO_HOMOLOGADO = 1;
	public static final int HOMOLOGACAO_NAO_HOMOLOGADO = 0;

	Validadores validador;

	public CotacaoParticipanteModel() {
		super();
		this.validador = new Validadores();
	}

	public String getsCdEmpresa() {
		return codigoEmpresa;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = validador.maxLen(codigoEmpresa, Validadores.CNPJ_SIZE);
	}

	public int getParticipacao() {
		return participacao;
	}

	public void setParticipacao(int participacao) {
		if (participacao < PARTICIPACAO_HABILITADA || participacao > PARTICIPACAO_RESPOSTA_TOTAL) {
			throw new IllegalArgumentException("Tipo de participacao desconhecida :" + participacao);
		}
		this.participacao = participacao;
	}

	public int getHomologado() {
		return homologado;
	}

	public void setHomologado(int homologado) {
		if (participacao < HOMOLOGACAO_NAO_HOMOLOGADO || participacao > HOMOLOGACAO_HOMOLOGADO) {
			throw new IllegalArgumentException("Tipo de homologacao desconhecida :" + participacao);
		}
		this.homologado = homologado;
	}

}
