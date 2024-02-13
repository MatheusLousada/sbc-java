package br.gov.sp.saobernardo.webservice.classes.modelos.compradireta;

public class CompraDiretaComissaoModel {

	public static final int CODIGO_COMISSAO_APOIO = 1;
	public static final int CODIGO_COMISSAO_PREGOEIRO = 2;
	public static final int CODIGO_COMISSAO_PREGOEIRO_E_APOIO = 3;
	public static final int CODIGO_COMISSAO_AUTORIDADE_COMPETENTE = 4;
	public static final int CODIGO_COMISSAO_AUTORIDADE_COMP_E_APOIO = 5;
	public static final int CODIGO_COMISSAO_AUTORIDADE_COMP_E_PREGOEIRO = 6;
	public static final int CODIGO_COMISSAO_AUTORIDADE_COMPETENTE_PREGOEIRO_E_APOIO = 7;

	/** String 100 Código do usuário da comissão. */
	private String codigoUsuario;

	/**
	 * Int 5 Código da comissão: 1 – Apoio 2 – Coordenador 3 – Coordenador e
	 * apoio 4 – Autoridade competente 5 – Auto. Comp. E apoio 6 – Auto. Comp. E
	 * Coord 7 – Auto. Comp. Coord e Apoio
	 */
	private int perfil;

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int codigoPerfil) {
		if (codigoPerfil < CODIGO_COMISSAO_APOIO
				|| codigoPerfil > CODIGO_COMISSAO_AUTORIDADE_COMPETENTE_PREGOEIRO_E_APOIO) {
			throw new IllegalArgumentException("Perfil da comissao de apoio invalido ");
		}
		this.perfil = codigoPerfil;
	}
}
