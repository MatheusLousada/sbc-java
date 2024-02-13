package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

public class PregaoEletronicoComissaoModel {

	public static final int PERFIL_COMISSAO_APOIO = 1;

	public static final int PERFIL_COMISSAO_PREGOEIRO = 2;

	public static final int PERFIL_COMISSAO_PREGOEIRO_E_APOIO = 3;

	public static final int PERFIL_COMISSAO_AUTORIDADE_COMPETENTE = 4;

	public static final int PERFIL_COMISSAO_AUTORIDADE_COMP_E_APOIO = 5;

	public static final int PERFIL_COMISSAO_AUTORIDADE_COMP_E_PREGOEIRO = 6;

	public static final int PERFIL_COMISSAO_AUTORIDADE_COMPETENTE_PREGOEIRO_E_APOIO = 7;

	/** String 100 Código do usuário da comissão. */
	private String codigoUsuario;

	private int codigoPerfil;
	/*
	 * Int 5 Código da comissão: 1 – Apoio 2 – Pregoeiro 3 – Pregoeiro e apoio 4
	 * – Autoridade competente 5 – Auto. Comp. E apoio 6 – Auto. Comp. E
	 * pregoeiro 7 – Auto. Comp. Preg e Apoio
	 */

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(int codigoPerfil) {
		if (codigoPerfil < PERFIL_COMISSAO_APOIO
				|| codigoPerfil > PERFIL_COMISSAO_AUTORIDADE_COMPETENTE_PREGOEIRO_E_APOIO) {
			throw new IllegalArgumentException("Perfil do pregoeiro invalido ");
		}
		this.codigoPerfil = codigoPerfil;

	}
}
