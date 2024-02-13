package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import br.gov.sp.saobernardo.webservice.classes.modelos.ItemModel;

public class PregaoEletronicoItemLanceModel implements ItemModel {

	public static final int BENEFICIARIO_LEI_123_NAO = 0;
	public static final int BENEFICIARIO_LEI_123_SIM = 1;

	public static final int LANCE_VENCEDOR = 1;
	public static final int LANCE_NAO_VENCEDOR = 0;

	public static final int LANCE_VALIDO = 1;
	public static final int LANCE_INVALIDO = 0;

	public static final int TAMANHO_DA_STRING_DE_NUMEROS_DE_REGISTRO_DA_ANVISA = 13;

	/** DateTime Data em que o lance vencedor foi enviado. */
	private XMLGregorianCalendar dataLance;

	/** Decimal 16,4 Valor do lance vencedor. */
	private BigDecimal dVlLance;

	/** String 14 Código da empresa que enviou o lance vencedor. */
	private String sCdEmpresa;

	/**
	 * Int 1 Indica se a empresa que enviou o lance é beneficiária da Lei123/06
	 * 0 – Não beneficiário 1 - Beneficiário
	 */
	private int bFlBeneficiarioLei123;

	/** Int 5 Ordem dos lances. */
	private int nNrRanking;

	/**
	 * Int 5 Indica se o lance é o vencedor. 0 – Não vencedor 1 - Vencedor
	 */
	private int bFlVencedor;

	/**
	 * Int 5 Indica se o lance é o vencedor. 0 – Não vencedor 1 - Vencedor
	 */
	private boolean lanceValido;

	/**
	 * Proposta dada no lance
	 */
	private PregaoEletronicoItemProposta proposta;

	private String justificativa;

	@Override
	public XMLGregorianCalendar getDataLance() {
		return dataLance;
	}

	public void setDataLance(XMLGregorianCalendar dataLance) {
		this.dataLance = dataLance;
	}

	@Override
	public BigDecimal getValorLance() {
		return dVlLance;
	}

	public void setValorLance(BigDecimal valorLance) {
		this.dVlLance = valorLance;
	}

	public String getCodigoEmpresa() {
		return sCdEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.sCdEmpresa = codigoEmpresa;
	}

	public int getBeneficiarioLei123() {
		return bFlBeneficiarioLei123;
	}

	public void setBeneficiarioLei123(int beneficiarioLei123) {
		this.bFlBeneficiarioLei123 = beneficiarioLei123;
	}

	@Override
	public int getNumeroRanking() {
		return nNrRanking;
	}

	public void setNumeroRanking(int numeroRanking) {
		this.nNrRanking = numeroRanking;
	}

	public int getVencedor() {
		return bFlVencedor;
	}

	public void setVencedor(int vencedor) {
		this.bFlVencedor = vencedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataLance == null) ? 0 : dataLance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PregaoEletronicoItemLanceModel other = (PregaoEletronicoItemLanceModel) obj;
		if (dataLance == null) {
			if (other.dataLance != null)
				return false;
		} else if (!dataLance.equals(other.dataLance)){
			return false;
		}
		return true;
	}

	public PregaoEletronicoItemProposta getProposta() {
		return proposta;
	}

	public void setProposta(PregaoEletronicoItemProposta proposta) {
		this.proposta = proposta;
	}

	@Override
	public boolean isLanceValido() {
		return lanceValido;
	}

	public void setLanceValido(boolean lanceValido) {
		this.lanceValido = lanceValido;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Override
	public String getNumeroDoRegistro() {
		return "";
	}

	@Override
	public String getMarca() {
		return "";
	}
}
