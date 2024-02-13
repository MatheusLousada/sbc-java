package br.gov.sp.saobernardo.webservice.classes.modelos;

public class UsuarioModel {

	/**
	 * Código/Login identificador do usuário no cliente
	 */
	private String codigoUsuario;

	/** Nome do usuário */
	private String nomeUsuario;

	/** E-mail do usuário */
	private String emailContato;

	private SituacaoUsuario situacaoUsuario;

	/** Código ou CNPJ da empresa que o usuário pertence */
	private String codigoEmpresa;

	public static final int ID_REPRESENTANTE_SOCIO = 1;
	public static final int ID_REPRESNTANTE_REPRESENTANTE = 2;
	public static final int ID_REPRESENTANTE_SERVIDOR = 3;
	/**
	 * Int 5 Não Obrigatório. Indicar o tipo de representação: - 1 – Sócio, 2 –
	 * Representante e 3 – Servidor
	 */
	private int nIdRepresentante;

	public static final long PERFIL_USUARIO_ADMINISTRADOR = 1;
	public static final long PERFIL_USUARIO_COMPRADOR = 2;
	public static final long PERFIL_USUARIO_VENDEDOR = 3;
	public static final long PERFIL_USUARIO_REQUISITANTE = 4;

	/**
	 * Array de long Não obrigatório.
	 * 
	 * Identificador do perfil do usuário: 1 – Administrador, 2 – Comprador, 3 –
	 * Vendedor, 4 – Requisitante.
	 * 
	 * O lstIdPerfil é mandatório. Caso não for encontrado, o sistema fará a
	 * tentativa de encontrar o lstGrupoUsuario.
	 */
	private long[] lstIdPerfil;

	/**
	 * Array de GrupoUsuarioDTO Não obrigatório. Identificador do perfil do
	 * usuário: 1 – Administrador, 2 – Comprador, 3 – Vendedor, 4 –
	 * Requisitante. Caso o lstGrupoUsuario não for encontrado, pois, já tentou
	 * encontrar o lstIdPerfil por ser mandatório, uma exceção será lançada.
	 * 
	 * private List<GrupoUsuarioDTO> lstGrupoUsuario;
	 */

	private LogDeRetornoDaGravacao logDaGravacao;

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public SituacaoUsuario getSituacaoUsuario() {
		return situacaoUsuario;
	}

	public void setSituacaoUsuario(SituacaoUsuario situacaoUsuario) {
		this.situacaoUsuario = situacaoUsuario;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public long[] getLstIdPerfil() {
		return lstIdPerfil;
	}

	public void setLstIdPerfil(long[] lstIdPerfil) {
		this.lstIdPerfil = lstIdPerfil;
	}

	public int getnIdRepresentante() {
		return nIdRepresentante;
	}

	public void setnIdRepresentante(int nIdRepresentante) {
		this.nIdRepresentante = nIdRepresentante;
	}

}
