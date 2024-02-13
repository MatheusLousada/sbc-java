package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.gov.sp.saobernardo.webservice.classes.modelos.CotacaoMoedaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.utils.Validadores;

/** Traduz CotacaoDTO para o modelo que nos utilizaremos */
public class CotacaoModel {

	private Validadores validador;

	public static final String FRETE_CIF = "1";
	public static final String FRETE_FOB = "F";

	private String codigoProcesso;

	/**
	 * sCdCotacaoWbc
	 * 
	 * String 9
	 * 
	 * Nao obrigatorio. Codigo da cotacao no WBC E-Procurement
	 */
	private String codigoCotacaoWbc;

	/**
	 * sCdCotacaoERP
	 * 
	 * String 10
	 * 
	 * Codigo da cotacao no ERP
	 */
	private String codigoCotacaoERP;

	/**
	 * sDsCotacao
	 * 
	 * String 400
	 * 
	 * Descricao do processo
	 */
	private String descricaoCotacao;

	/**
	 * bFlRestrita
	 * 
	 * Int 1
	 * 
	 * Indica se eh restrita ou nao: 0 = Nao restrita, 1 = Restrita
	 */
	private int restrita;
	public static final int COTACAO_NAO_RESTRITA = 0;
	public static final int COTACAO_RESTRITA = 1;

	/**
	 * tDtInicial
	 * 
	 * DateTime
	 * 
	 * Data e hora de inicio da cotacao
	 */
	private XMLGregorianCalendar dataInicial;

	/**
	 * tDtFinal
	 * 
	 * DateTime
	 * 
	 * Data e hora de encerramento da cotacao.
	 */
	private XMLGregorianCalendar dataFinal;

	/**
	 * sCdMoeda
	 * 
	 * String 9
	 * 
	 * Codigo da moeda
	 */
	private String codigoMoeda;

	/**
	 * sCdFretePreferencia
	 * 
	 * String 1
	 * 
	 * Tipo do frete: C = CIF, F = FOB
	 */
	private String codigoFretePreferencia;

	/**
	 * sCdUsuario
	 * 
	 * String 100
	 * 
	 * Codigo do usuario responsavel pelo processo, ou* seja, o comprador
	 */
	private String codigoUsuario;

	/**
	 * bFlTermo
	 * 
	 * String 1
	 * 
	 * Indica se a cotacao deve exigir que o fornecedor aceite o termo de
	 * participacao na conconrrencia: 0 = Nao, 1 = Sim
	 */
	private int exigirTermo;
	public static final int ACEITA_TERMO_DE_PARTICIPACAO = 1;
	public static final int NAO_ACEITA_TERMO_DE_PARTICIPACAO = 0;

	/**
	 * sDsTermo
	 * 
	 * String 1000
	 * 
	 * Nao obrigatorio.
	 * 
	 * Descricao do termo de participacao. Usado quando o campo bFlTermo estah
	 * marcado com valor 1
	 */
	private String descricaoTermoParticipacao;

	/**
	 * nCdSituacao
	 * 
	 * Int 2
	 * 
	 * Situacao do processo: 1 = Em configuracao, 2 = Agendada
	 */
	private long codigoSituacao;

	public static final long SITUACAO_PROCESSO_EM_CONFIGURACAO = 1;
	public static final long SITUACAO_PROCESSO_AGENDADA = 2;

	/**
	 * nIdTipoNegociacao
	 * 
	 * Int
	 * 
	 * Tipo da negociacao: 0 = tomada de precos ou or�amento, 1 = gerar pedido,
	 * 2 = gerar contrato.
	 */
	private int tipoNegociacao;
	public static final int TIPO_NEGOCIACAO_ORCAMENTO = 0;
	public static final int TIPO_NEGOCIACAO_GERAR_PEDIDO = 1;
	public static final int TIPO_NEGOCIACAO_GERAR_CONTRATO = 2;

	/**
	 * sCdCotacaoWbcPai
	 *
	 * String 9
	 *
	 * Nao obrigatorio.
	 * 
	 * Codigo da cotacao de origem. Quando temos contra-oferta
	 */
	private String codigoCotacaoWbcPai;

	/**
	 * bFlPermissaoEmpresaClic
	 * 
	 * Int 1
	 * 
	 * Nao obrigatorio.
	 * 
	 * Apresentar nome da empresa no processo do clicbusiness
	 */
	private int permissaoEmpresaClic;

	/**
	 * bFlVisivelClic
	 * 
	 * Int 1
	 * 
	 * Nao obrigatorio.
	 * 
	 * Processo visivel para os novos fornecedores no clicbusiness.
	 */
	private int visivelClic;

	/**
	 * lstCotacaoItemDTO
	 * 
	 * Array de cotacaoItemDTO
	 * 
	 * Lista de itens da cotacao
	 */
	private List<CotacaoItemModel> cotacaoItem;

	/**
	 * lstCotacaoParticipanteDTO
	 * 
	 * Array de cotacaoParticipanteDTO
	 * 
	 * Lista de participantes da cotacao
	 */
	private List<CotacaoParticipanteModel> cotacaoParticipante;

	/**
	 * lstCotacaoCotacaoDTO
	 * 
	 * Arrray de MoedaDTO
	 * 
	 * Lista de cotacao moeda
	 */
	private List<CotacaoMoedaModel> moedas;

	/**
	 * sCdEmpresa
	 * 
	 * String 14
	 * 
	 * CNPJ da empresa. Nao consta na documentacao, mas aparece no XML de
	 * exemplo
	 */
	private String cnpj;

	private LogDeRetornoDaGravacao logDaGravacao;

	public CotacaoModel() {

		validador = new Validadores();
		// Garante que nenhum campo seja null
		this.setExigirTermo(NAO_ACEITA_TERMO_DE_PARTICIPACAO);
		this.setCodigoFretePreferencia(FRETE_CIF);
		this.moedas = new ArrayList<CotacaoMoedaModel>();

	}

	/* Getters e Setters */

	public String getCodigoProcesso() {
		return codigoProcesso;
	}

	public void setCodigoProcesso(String codigoProcesso) {
		this.codigoProcesso = codigoProcesso;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public String getCodigoCotacaoERP() {
		return codigoCotacaoERP;
	}

	public void setCodigoCotacaoERP(String codigoCotacaoERP) {
		this.codigoCotacaoERP = validador.maxLen(codigoCotacaoERP, 10);
	}

	public String getDescricaoCotacao() {
		return descricaoCotacao;
	}

	public void setDescricaoCotacao(String descricaoCotacao) {
		this.descricaoCotacao = validador.maxLen(descricaoCotacao, 400);
	}

	public int getRestrita() {
		return restrita;
	}

	public void setRestrita(int restrita) {
		this.restrita = restrita;
	}

	public XMLGregorianCalendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(XMLGregorianCalendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public XMLGregorianCalendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(XMLGregorianCalendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(String codigoMoeda) {
		this.codigoMoeda = validador.maxLen(codigoMoeda, 9);
	}

	public String getCodigoFretePreferencia() {
		return codigoFretePreferencia;
	}

	/** Sempre usar o FRETE_CIF */
	public void setCodigoFretePreferencia(String codigoFretePreferencia) {
		this.codigoFretePreferencia = FRETE_CIF;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = validador.maxLen(codigoUsuario, 100);
	}

	public int getExigirTermo() {
		return exigirTermo;
	}

	public void setExigirTermo(int i) {
		this.exigirTermo = i;
	}

	public long getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(long l) {
		this.codigoSituacao = l;
	}

	public int getTipoNegociacao() {
		return tipoNegociacao;
	}

	public void setTipoNegociacao(int tipoNegociacao) {
		List<Integer> v = new ArrayList<Integer>();
		v.add(CotacaoModel.TIPO_NEGOCIACAO_GERAR_CONTRATO);
		v.add(CotacaoModel.TIPO_NEGOCIACAO_GERAR_PEDIDO);
		v.add(CotacaoModel.TIPO_NEGOCIACAO_ORCAMENTO);
		this.tipoNegociacao = validador.valoresValidos(tipoNegociacao, v);
	}

	public String getCodigoCotacaoWbcPai() {
		return codigoCotacaoWbcPai;
	}

	public void setCodigoCotacaoWbcPai(String codigoCotacaoWbcPai) {
		this.codigoCotacaoWbcPai = validador.maxLen(codigoCotacaoWbcPai, 9);
	}

	public List<CotacaoItemModel> getCotacaoItem() {
		return cotacaoItem;
	}

	public void setCotacaoItem(List<CotacaoItemModel> arrayOfCotacaoItem) {
		this.cotacaoItem = arrayOfCotacaoItem;
	}

	public List<CotacaoParticipanteModel> getCotacaoParticipante() {
		return cotacaoParticipante;
	}

	public void setCotacaoParticipante(List<CotacaoParticipanteModel> participantesCotacao) {
		this.cotacaoParticipante = participantesCotacao;
	}

	public String getCodigoCotacaoWbc() {
		return codigoCotacaoWbc;
	}

	public void setCodigoCotacaoWbc(String codigoCotacaoWbc) {
		this.codigoCotacaoWbc = validador.maxLen(codigoCotacaoWbc, 9);
	}

	public String getDescricaoTermoParticipacao() {
		return descricaoTermoParticipacao;
	}

	public void setDescricaoTermoParticipacao(String descricaoTermoParticipacao) {
		this.descricaoTermoParticipacao = validador.maxLen(descricaoTermoParticipacao, 1000);
	}

	public int getPermissaoEmpresaClic() {
		return permissaoEmpresaClic;
	}

	public void setPermissaoEmpresaClic(int permissaoEmpresaClic) {
		this.permissaoEmpresaClic = permissaoEmpresaClic;
	}

	public int getVisivelClic() {
		return visivelClic;
	}

	public void setVisivelClic(int visivelClic) {
		this.visivelClic = visivelClic;
	}

	public List<CotacaoMoedaModel> getMoedas() {

		return moedas;
	}

	public void setMoedas(List<CotacaoMoedaModel> moedas) {
		this.moedas = moedas;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = validador.maxLen(cnpj, Validadores.CNPJ_SIZE);
	}

	public boolean isProcessoComAno() {
		try {
			String[] split = codigoProcesso.split("/");
			return split[1].matches("\\d{4}$");
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

}
