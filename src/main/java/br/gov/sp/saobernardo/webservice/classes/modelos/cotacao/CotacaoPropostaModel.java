package br.gov.sp.saobernardo.webservice.classes.modelos.cotacao;

import java.math.BigDecimal;

/**
 * Objeto de retorno
 */
public class CotacaoPropostaModel {

	/** DateTime Data de cadastro da proposta */
	private long tDtProposta;

	/** String 50 Código da marca da proposta */
	private String sCdMarca;

	/** Int Código da proposta no WBC */
	private int nCdProposta;

	/** String Código da condição de pagamento da proposta */
	private String sCdCondicaoPagamento;

	/** String Código da frete da proposta */
	private String sCdFrete;

	/** String Código ou CNPJ da empresa fornecedora */
	private String sCdEmpresa;

	/** String Código do usuário que fez a proposta */
	private String sCdUsuario;

	/** String Observações da proposta */
	private String sDsObservacao;

	/** DateTime Data de validade da proposta */
	private long tDtValidade;

	/** Int Posição no ranking da proposta */
	private int nNrRanking;

	/** Int Situação da proposta: 0 – Desclassificada, 1 – Aceita */
	private int nCdSituacao;

	/** String 400 Motivo de desclassificação de proposta */
	private String sDsMotivoDesclassificado;

	/** Decimal Valor bruto da proposta */
	private BigDecimal dVlProposta;

	/** DateTime Data de atualização da proposta */
	private long tDtAtualizacao;

	/**
	 * Decimal Valor líquido da proposta. Este valor pode ser parametrizado pelo
	 * cliente, desde que este no envie o seu cálculo para valor líquido. Em
	 * caso de envio será analisado para ver se é possível a aplicação do mesmo.
	 */
	private BigDecimal dVlLíquido;

	/** Decimal Valor da proposta para a unidade de medida alternativa. */
	private BigDecimal dVlUnidade;

	/**
	 * Int Indica se a proposta foi determinada vencedora pelo negociador ou
	 * não: 0 – Não, 1 - Sim
	 */
	private int nIdVencedor;

	/** Decimal Indica o percentual de desconto. */
	private BigDecimal DecimaldPcDesconto;

	/** String NCM informado na proposta. */
	private String sCdNmb;

	public long gettDtProposta() {
		return tDtProposta;
	}

	public void settDtProposta(long tDtProposta) {
		this.tDtProposta = tDtProposta;
	}

	public String getsCdMarca() {
		return sCdMarca;
	}

	public void setsCdMarca(String sCdMarca) {
		this.sCdMarca = sCdMarca;
	}

	public int getnCdProposta() {
		return nCdProposta;
	}

	public void setnCdProposta(int nCdProposta) {
		this.nCdProposta = nCdProposta;
	}

	public String getsCdCondicaoPagamento() {
		return sCdCondicaoPagamento;
	}

	public void setsCdCondicaoPagamento(String sCdCondicaoPagamento) {
		this.sCdCondicaoPagamento = sCdCondicaoPagamento;
	}

	public String getsCdFrete() {
		return sCdFrete;
	}

	public void setsCdFrete(String sCdFrete) {
		this.sCdFrete = sCdFrete;
	}

	public String getsCdEmpresa() {
		return sCdEmpresa;
	}

	public void setsCdEmpresa(String sCdEmpresa) {
		this.sCdEmpresa = sCdEmpresa;
	}

	public String getsCdUsuario() {
		return sCdUsuario;
	}

	public void setsCdUsuario(String sCdUsuario) {
		this.sCdUsuario = sCdUsuario;
	}

	public String getsDsObservacao() {
		return sDsObservacao;
	}

	public void setsDsObservacao(String sDsObservacao) {
		this.sDsObservacao = sDsObservacao;
	}

	public long gettDtValidade() {
		return tDtValidade;
	}

	public void settDtValidade(long tDtValidade) {
		this.tDtValidade = tDtValidade;
	}

	public int getnNrRanking() {
		return nNrRanking;
	}

	public void setnNrRanking(int nNrRanking) {
		this.nNrRanking = nNrRanking;
	}

	public int getnCdSituacao() {
		return nCdSituacao;
	}

	public void setnCdSituacao(int nCdSituacao) {
		this.nCdSituacao = nCdSituacao;
	}

	public String getsDsMotivoDesclassificado() {
		return sDsMotivoDesclassificado;
	}

	public void setsDsMotivoDesclassificado(String sDsMotivoDesclassificado) {
		this.sDsMotivoDesclassificado = sDsMotivoDesclassificado;
	}

	public BigDecimal getdVlProposta() {
		return dVlProposta;
	}

	public void setdVlProposta(BigDecimal dVlProposta) {
		this.dVlProposta = dVlProposta;
	}

	public long gettDtAtualizacao() {
		return tDtAtualizacao;
	}

	public void settDtAtualizacao(long tDtAtualizacao) {
		this.tDtAtualizacao = tDtAtualizacao;
	}

	public BigDecimal getdVlLíquido() {
		return dVlLíquido;
	}

	public void setdVlLíquido(BigDecimal dVlLíquido) {
		this.dVlLíquido = dVlLíquido;
	}

	public BigDecimal getdVlUnidade() {
		return dVlUnidade;
	}

	public void setdVlUnidade(BigDecimal dVlUnidade) {
		this.dVlUnidade = dVlUnidade;
	}

	public int getnIdVencedor() {
		return nIdVencedor;
	}

	public void setnIdVencedor(int nIdVencedor) {
		this.nIdVencedor = nIdVencedor;
	}

	public BigDecimal getDecimaldPcDesconto() {
		return DecimaldPcDesconto;
	}

	public void setDecimaldPcDesconto(BigDecimal decimaldPcDesconto) {
		DecimaldPcDesconto = decimaldPcDesconto;
	}

	public String getsCdNmb() {
		return sCdNmb;
	}

	public void setsCdNmb(String sCdNmb) {
		this.sCdNmb = sCdNmb;
	}

	/** Array de entregas Lista de entrega dos itens da proposta */
	// private cotacaoPropostaEnderecoDTO;

	/** Array de taxas Lista de valores de taxas da proposta */
	// private cotacaoPropostaTaxaDTO;

	/**
	 * Array de cotacaoPropostaRequisicao Lista de requsições que compõem a
	 * proposta. Somente terá dados quando a cotação for de requisição. Usada
	 * para encontrar diretamente a requisição e entregas abaixo dela.
	 */
	// private lstCotacaoPropostaRequisicao;

}
