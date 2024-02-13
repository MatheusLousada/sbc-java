package br.gov.sp.saobernardo.webservice.paradigma.dao;

/**
 * Define os ambientes que o sistema conhece
 * 
 * @author 41476
 *
 */
public class Ambientes {

	public static final String AMBIENTE_NAO_DEFINIDO = "nao foi definido um ambiente";
	
	public static final String ORCOM_PRODUCAO = "producao";
	public static final String ORCOM_HOMOLOGACAO = "homologacao";
	public static final String ORCOM_DESENVOLVIMENTO = "desenvolvimento";
	public static final String LICITAR_DESENVOLVIMENTO = "https://manager-api-dev.licitardigital.com.br";

	public static final String PARADIGMA_DESENVOLVIMENTO = ORCOM_DESENVOLVIMENTO;
	public static final String LICITAR_DIGITAL_DESENVOLVIMENTO = ORCOM_DESENVOLVIMENTO;
	public static final String PARADIGMA_HOMOLOGACAO = ORCOM_HOMOLOGACAO;
	public static final String PARADIGMA_PRODUCAO = ORCOM_PRODUCAO;

	@Deprecated	public static final String ORCOM_PREFEITURA_DESENVOLVIMENTO = ORCOM_DESENVOLVIMENTO;
	@Deprecated	public static final String ORCOM_PREFEITURA_HOMOLOGACAO = ORCOM_HOMOLOGACAO;
	@Deprecated	public static final String ORCOM_PREFEITURA_PRODUCAO = ORCOM_PRODUCAO;

	@Deprecated	public static final String ORCOM_FACULDADE_PRODUCAO = ORCOM_PRODUCAO;
	@Deprecated	public static final String ORCOM_FACULDADE_HOMOLOGACAO = ORCOM_HOMOLOGACAO;
	@Deprecated	public static final String ORCOM_FACULDADE_DESENVOLVIMENTO = ORCOM_DESENVOLVIMENTO;

	private Ambientes() {
		/** Construtor */
	}
}
