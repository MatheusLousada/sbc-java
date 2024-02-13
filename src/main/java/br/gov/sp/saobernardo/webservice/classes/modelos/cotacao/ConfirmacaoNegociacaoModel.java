package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

import br.gov.sp.saobernardo.webservice.classes.utils.Validadores;

public class ConfirmacaoNegociacaoModel {

	/**
	 * String 20 Código da negociação no WBC. sCdProcessoWbc;
	 */
	private String codigoProcessoWbc;

	/**
	 * Int 20 Indica o código do processo. 2 – Cotação, 1 – Leilão.
	 * nIdTipoProcesso;
	 */
	private int idTipoProcesso;

	private Validadores val;

	public static final int TIPO_PROCESSO_COTACAO = 2;
	public static final int TIPO_PROCESSO_LEILAO = 1;

	public ConfirmacaoNegociacaoModel() {
		val = new Validadores();
	}

	public String getCodigoProcessoWbc() {
		return codigoProcessoWbc;
	}

	public void setCodigoProcessoWbc(String codigoProcessoWbc) {

		this.codigoProcessoWbc = val.maxLen(codigoProcessoWbc, 20);
	}

	public int getIdTipoProcesso() {
		return idTipoProcesso;
	}

	public void setIdTipoProcesso(int idTipoProcesso) {
		this.idTipoProcesso = val.inRange(idTipoProcesso, TIPO_PROCESSO_LEILAO, TIPO_PROCESSO_COTACAO);
	}

}
