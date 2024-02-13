package br.gov.sp.saobernardo.webservice.classes.modelos.compradireta;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;

public class CompraDiretaModel {

	public static final int CODIGO_TEMPLATE = 19000;

	public static final int PARTICIPACAO_INDEFINIDA = 0;
	public static final int PARTICIPACAO_RESTRITA_SIM = 1;
	public static final int PARTICIPACAO_RESTRITA_NAO = 2;

	public static final int PRORROGACAO_AUTOMATICA_NAO = 0;
	public static final int PRORROGACAO_AUTOMATICA_SIM = 1;

	public static final int EXIGE_TERMO_NENHUM = 0;
	public static final int EXIGE_TERMO_DE_CONCORDANCIA = 1;
	public static final int EXIGE_TERMO_DE_COMPRA_DIRETA = 2;
	public static final int EXIGE_TERMO_DE_CONCORDANCIA_E_EDITAL = 3;

	public static final int ESTILO_COMPRA_NORMAL = 1;
	public static final int ESTILO_COMPRA_RANKING = 2;

	public static final int TIPO_APURACAO_ITEM = 1;
	public static final int TIPO_APURACAO_LOTE = 2;

	public static final int EXIBE_VALOR_DE_REFERENCIA_NAO = 0;
	public static final int EXIBE_VALOR_DE_REFERENCIA_SIM = 1;

	public static final int PERMITE_FORNECEDORES_ENVIEM_MENSAGEM_PELO_CHAT_NAO = 0;
	public static final int PERMITE_FORNECEDORES_ENVIEM_MENSAGEM_PELO_CHAT_SIM = 1;

	public static final int TEM_VARIACAO_NOS_LANCES_NAO = 0;
	public static final int TEM_VARIACAO_NOS_LANCES_SIM = 1;

	public static final int USUARIO_ESCOLHE_MARCA_NAO = 0;
	public static final int USUARIO_ESCOLHE_MARCA_OBRIGATORIO = 1;
	public static final int USUARIO_ESCOLHE_MARCA_OPCIONAL = 0;

	public static final int PERMITE_USUARIO_ESCOLHER_PROCEDENCIA_NAO = 0;
	public static final int PERMITE_USUARIO_ESCOLHER_PROCEDENCIA_OBRIGATORIO = 1;

	public static final int PERMITE_FORNECEDOR_INVALIDAR_LANCE_NAO = 0;
	public static final int PERMITE_FORNECEDOR_INVALIDAR_LANCE_SIM = 1;

	public static final int QUANTAS_CASAS_DECIMAIS_DUAS = 2;
	public static final int QUANTAS_CASAS_DECIMAIS_TRES = 2;
	public static final int QUANTAS_CASAS_DECIMAIS_QUATRO = 4;

	public static final long CODIGO_SITUACAO = 0;

	public static final int TIPO_AVALIACAO_MENOR_PRECO = 1;

	public static final int CODIGO_MOEDA_REAL = 1;

	public static final int RESTRINGE_ENVIO_MSG_PARA_FORNECEDORES_NO_CHAT_NAO = 0;
	public static final int RESTRINGE_ENVIO_MSG_PARA_FORNECEDORES_NO_CHAT_SIM = 1;

	public static final int DESATIVAR_AUTO_ENCERRAMENTO_SIM = 0;
	public static final int DESATIVAR_AUTO_ENCERRAMENTO_NAO = 1;

	public static final int ITENS_POR_PAGINA_TUDO = 0;
	public static final int ITENS_POR_PAGINA_DEZ = 10;
	public static final int ITENS_POR_PAGINA_VINTE = 20;
	public static final int ITENS_POR_PAGINA_TRINTA = 30;
	public static final int ITENS_POR_PAGINA_QUARENTA = 40;
	public static final int ITENS_POR_PAGINA_CINQUENTA = 50;

	public static final int OBRIGAR_DECLARACAO_VENDEDOR_SIM = 1;
	public static final int OBRIGAR_DECLARACAO_VENDEDOR_NAO = 2;
	public static final int OBRIGAR_DECLARACAO_VENDEDOR_VALOR_ALTERADO_PELA_PARADIGMA = 0;

	public static final int SISTEMA_GERA_EDITAL_AUTOMATICAMENTE_SIM = 1;
	public static final int SISTEMA_GERA_EDITAL_AUTOMATICAMENTE_NAO = 0;

	public static final int TIPO_COMPRA_DIRETA_ORCAMENTO = 0;
	public static final int TIPO_COMPRA_DIRETA_PEDIDO = 1;
	public static final int TIPO_COMPRA_DIRETA_CONTRATO = 2;

	public static final int TIPO_LANCE_INICIAL_COM_VLR_REFERENCIA = 1;
	public static final int TIPO_LANCE_INICIAL_SEM_VLR_REFERENCIA = 1;

	// ============================

	/** String 30 Número do processo. */
	private String numeroProcessoDisplay;

	/** String 30 Não obrigatório. Número do edital. */
	private String numeroEdital;

	/** String 1000 Descrição do objeto. */
	private String descricaoObjeto;

	/** DateTime Data de inicial do envio de lances. */
	private XMLGregorianCalendar dataInicial;

	/** DateTime Data final do envio de lances. */
	private XMLGregorianCalendar dataFinal;

	/**
	 * Int 1 Restrição: 1 – Sim: Permite restringir a participação dos
	 * fornecedor pelo processo de escolha dos mesmos. 2 – Não: Não permite
	 * restringir a participação dos fornecedores.
	 */
	private int participacaoRestrita;

	/**
	 * Int 1 Prorrogação automática. Os critérios serão respeitados até o início
	 * da etapa de auto-encerramento do item/lote. 0 – Não 1 – Sim
	 */
	private int prorrogacaoAutomatica;

	/**
	 * Int 3 Não obrigatório. Caso haja prorrogação, informar a condição em
	 * minutos
	 */
	private int minutosProrrogaCondicao;

	/**
	 * Int 3 Não obrigatório. Caso haja prorrogação, informar em quantos minutos
	 * será prorrogado caso a condição seja atendida.
	 */
	private int minutosProrrogaSeAtendido;

	/**
	 * Int 1 Exige que ao cessar a compra direta, o fornecedor dê o aceite
	 * conforme as seguintes condições. 0 – Nenhum (não precisa de aceite) 1 -
	 * Termo de concordância 2 - Edital da compra direta 3 - Termo de
	 * concordância e Edital
	 */
	private int exigeTermo;

	/**
	 * String 4000 Não obrigatório. Descrição do termo da compra direta. Caso a
	 * informação não for enviada, o sistema considerará a informação do
	 * parâmetro já existente.
	 */
	private String descricaoTermo;

	/**
	 * Int 1 Estilo da compra direta 1 – Normal 2 – Ranking
	 */
	private int estiloCompra;

	/**
	 * Int 1 Tipo da apuração da compra direta: 1 – Por item 2 – Por lote
	 */
	private int tipoApuracao;

	/**
	 * Int 1 Exibe o valor de referência. 0 – Não 1 - Sim
	 */
	private int mostraReferencia;

	/**
	 * Int 1 Permite que os fornecedores enviem mensagem pelo chat. 0 – Não 1 –
	 * Sim
	 */
	private int permiteChatBilateral;

	/**
	 * Int 1 Indica se possuirá variação nos valores dos lances. 0 – Não 1 – Sim
	 */
	private int temVariacaoNosLances;

	/**
	 * Decimal 16,4 Não obrigatório. Caso houver variação, informar o valor da
	 * variação mínima.
	 */
	private BigDecimal valorVariacaoMin;

	/**
	 * Decimal 16,4 Não obrigatório. Caso houver variação, informar o valor da
	 * variação máxima.
	 */
	private BigDecimal valorVariacaoMax;

	/**
	 * Int 1 Permite que o usuário escolha a marca de cada item: 0 – Não (não
	 * exibe o campo para escolha) 1 – Obriga a escolha da marca. 2 – A escolha
	 * da marca é opcional.
	 */
	private int usuarioEscolheMarca;

	/**
	 * Int 1 Permite que o usuário escolha a procedência de cada item: 0 – Não
	 * (não exibe o campo para escolha) 1 – Obriga a escolha da procedência.
	 */
	private int permiteUsuarioEscolherProcedencia;

	/**
	 * Int 1 Permite que o próprio fornecedor, possa invalidar o seu lance. 0 –
	 * Não 1 - Sim
	 */
	private int permiteFornecedorInvalidarLance;

	/** Int 10 Considerar sempre o envio do valor 19000. */
	private long codigoTemplate;

	/**
	 * String 2000 Não obrigatório. Descrição das observações da compra direta.
	 * Caso a informação não for enviada, o sistema considerará a informação do
	 * parâmetro já existente.
	 */
	private String observacoes;

	/**
	 * Int 1 Número de casas decimais, permitindo as seguintes opções: 2, 3 ou
	 * 4.
	 */
	private int numeroCasasDecimais;

	/**
	 * Int 2 Código da situação: 0 – Em configuração
	 */
	private Long codigoSituacao;

	/** String 14 Código da empresa compradora */
	private String codigoComprador;

	/**
	 * String 100 Código do usuário responsável. Geralmente o comprador que
	 * fechou a negociação
	 */
	private String codigoUsuarioCriador;

	/** String 1 Código da condição de pagamento */
	private String codigoCondicaoPagamento;

	/** String 10 Código do prazo de entrega */
	private String codigoPrazoEntrega;

	private PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega;

	/**
	 * Int 1 Tipo de avaliação: 1 – Menor preço
	 */
	private int tipoAvaliacao;

	/**
	 * Int 10 Moeda em que a compra direta será conduzido: 1 – Real
	 */
	private long codigoMoeda;

	/**
	 * Int 1 Restringe o envio de mensagens no chat para os fornecedores. 0 –
	 * Não 1 – Sim
	 */
	private int restringeChatBilateralFornecedores;

	/**
	 * Int 1 Ativação do auto encerramento com tempo aleatório. Se escolhida a
	 * opção 0, a compra direta encerrará na data final sem usar o recurso do
	 * auto-encerramento. 0 – Sim 1 - Não
	 */
	private int desativarAutoEncerramento;

	/**
	 * Int 3 Quantidade de itens/lotes exibidos por página. Recomendado que
	 * quando houverem muitos itens, seja paginada a exibição das informações: 0
	 * – Sem paginação 10, 20, 30, 40 ou 50
	 */
	private long quantosItensPagina;

	/**
	 * Int 1 Não obrigatório. Permite que o usuário escolha entre as opções
	 * abaixo de se declarar representante ou distribuidor do que se está
	 * solicitando na compra: 1 – Sim 2 – Não Caso a informação não for enviada,
	 * o sistema considerará a informação do parâmetro já existente.
	 */
	private int obrigarDeclaracaoVendedor;

	/**
	 * Int 1 Permite que o sistema gere automaticamente o edital para acesso à
	 * área pública: 1 – Sim 2 – Não
	 */
	private int bFlPublicarEdital;

	/** Int 1 Não obrigatório. Obriga declaração do fornecedor */
	// private int bFlObrigarDeclaracaoVendedor1;

	/**
	 * Int 5 Não obrigatório. Indica o tipo da compra direta 0 - Orçamento 1 -
	 * Pedido 2 - Contrato
	 */
	private int codigoTipoCompraDireta;

	/**
	 * Int 5 Não obrigatório. Indica o tipo do lance inicial. 1 – Com valor de
	 * referência, 2 – Sem valor de referência.
	 */
	private int tipoLanceInicial;

	/**
	 * Int 5 Não obrigatório. Indica se permite lance
	 * 
	 */
	private int permitirLance;

	/**
	 * Array de compraDiretaLote Não obrigatório. Lista dos lotes da compra
	 * direta.
	 */
	List<CompraDiretaLoteModel> lstCompraDiretaLote;

	/** Array de compraDiretaItem Lista dos itens da compra direta. */
	List<CompraDiretaItemModel> lstCompraDiretaItem;

	/** Array de compraDiretaComissao Lista das comissões da compra direta. */
	List<CompraDiretaComissaoModel> lstCompraDiretaComissao;

	private LogDeRetornoDaGravacao logDaGravacao;

	public String getNumeroProcessoDisplay() {
		return numeroProcessoDisplay;
	}

	public void setNumeroProcessoDisplay(String numeroProcessoDisplay) {
		this.numeroProcessoDisplay = numeroProcessoDisplay;
	}

	public String getNumeroEdital() {
		return numeroEdital;
	}

	public void setNumeroEdital(String numeroEdital) {
		this.numeroEdital = numeroEdital;
	}

	public String getDescricaoObjeto() {
		return descricaoObjeto;
	}

	public void setDescricaoObjeto(String descricaoObjeto) {
		this.descricaoObjeto = descricaoObjeto;
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

	public int getParticipacaoRestrita() {
		return participacaoRestrita;
	}

	public void setParticipacaoRestrita(int participacaoRestrita) {
		if (naFaixaDeValores(participacaoRestrita, PARTICIPACAO_INDEFINIDA, PARTICIPACAO_RESTRITA_NAO)) {
			this.participacaoRestrita = participacaoRestrita;
		}
	}

	public int getProrrogacaoAutomatica() {
		return prorrogacaoAutomatica;
	}

	public void setProrrogacaoAutomatica(int prorrogacaoAutomatica) {
		this.prorrogacaoAutomatica = prorrogacaoAutomatica;
	}

	public int getMinutosProrrogaCondicao() {
		return minutosProrrogaCondicao;
	}

	public void setMinutosProrrogaCondicao(int minutosProrrogaCondicao) {
		this.minutosProrrogaCondicao = minutosProrrogaCondicao;
	}

	public int getMinutosProrrogaSeAtendido() {
		return minutosProrrogaSeAtendido;
	}

	public void setMinutosProrrogaSeAtendido(int minutosProrrogaSeAtendido) {
		this.minutosProrrogaSeAtendido = minutosProrrogaSeAtendido;
	}

	public int getExigeTermo() {
		return exigeTermo;
	}

	public void setExigeTermo(int exigeTermo) {
		this.exigeTermo = exigeTermo;
	}

	public String getDescricaoTermo() {
		return descricaoTermo;
	}

	public void setDescricaoTermo(String descricaoTermo) {
		this.descricaoTermo = descricaoTermo;
	}

	public int getEstiloCompra() {
		return estiloCompra;
	}

	public void setEstiloCompra(int estiloCompra) {
		this.estiloCompra = estiloCompra;
	}

	public int getTipoApuracao() {
		return tipoApuracao;
	}

	public void setTipoApuracao(int tipoApuracao) {
		this.tipoApuracao = tipoApuracao;
	}

	public int getMostraReferencia() {
		return mostraReferencia;
	}

	public void setMostraReferencia(int mostraReferencia) {
		this.mostraReferencia = mostraReferencia;
	}

	public int getPermiteChatBilateral() {
		return permiteChatBilateral;
	}

	public void setPermiteChatBilateral(int permiteChatBilateral) {
		this.permiteChatBilateral = permiteChatBilateral;
	}

	public int getTemVariacaoNosLances() {
		return temVariacaoNosLances;
	}

	public void setTemVariacaoNosLances(int temVariacaoNosLances) {
		this.temVariacaoNosLances = temVariacaoNosLances;
	}

	public BigDecimal getValorVariacaoMin() {
		return valorVariacaoMin;
	}

	public void setValorVariacaoMin(BigDecimal valorVariacaoMin) {
		this.valorVariacaoMin = valorVariacaoMin;
	}

	public BigDecimal getValorVariacaoMax() {
		return valorVariacaoMax;
	}

	public void setValorVariacaoMax(BigDecimal valorVariacaoMax) {
		this.valorVariacaoMax = valorVariacaoMax;
	}

	public int getUsuarioEscolheMarca() {
		return usuarioEscolheMarca;
	}

	public void setUsuarioEscolheMarca(int usuarioEscolheMarca) {
		this.usuarioEscolheMarca = usuarioEscolheMarca;
	}

	public int getPermiteFornecedorInvalidarLance() {
		return permiteFornecedorInvalidarLance;
	}

	public void setPermiteFornecedorInvalidarLance(int permiteFornecedorInvalidarLance) {
		this.permiteFornecedorInvalidarLance = permiteFornecedorInvalidarLance;
	}

	public long getCodigoTemplate() {
		return codigoTemplate;
	}

	public void setCodigoTemplate(long l) {
		this.codigoTemplate = l;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public int getNumeroCasasDecimais() {
		return numeroCasasDecimais;
	}

	public void setNumeroCasasDecimais(int numeroCasasDecimais) {
		this.numeroCasasDecimais = numeroCasasDecimais;
	}

	public Long getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(Long l) {
		this.codigoSituacao = l;
	}

	public String getCodigoComprador() {
		return codigoComprador;
	}

	public void setCodigoComprador(String codigoComprador) {
		this.codigoComprador = codigoComprador;
	}

	public String getCodigoUsuarioCriador() {
		return codigoUsuarioCriador;
	}

	public void setCodigoUsuarioCriador(String codigoUsuarioCriador) {
		this.codigoUsuarioCriador = codigoUsuarioCriador;
	}

	public String getCodigoCondicaoPagamento() {
		return codigoCondicaoPagamento;
	}

	public void setCodigoCondicaoPagamento(String codigoCondicaoPagamento) {
		this.codigoCondicaoPagamento = codigoCondicaoPagamento;
	}

	public PregaoEletronicoPrazoDeEntregaModel getPrazoDeEntrega() {
		return prazoDeEntrega;
	}

	public void setPrazoDeEntrega(PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega) {
		this.prazoDeEntrega = prazoDeEntrega;
	}

	public String getCodigoPrazoEntrega() {
		return codigoPrazoEntrega;
	}

	public void setCodigoPrazoEntrega(String codigoPrazoEntrega) {
		this.codigoPrazoEntrega = codigoPrazoEntrega;
	}

	public int getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	public void setTipoAvaliacao(int tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}

	public long getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(long l) {
		this.codigoMoeda = l;
	}

	public int getRestringeChatBilateralFornecedores() {
		return restringeChatBilateralFornecedores;
	}

	public void setRestringeChatBilateralFornecedores(int restringeChatBilateralFornecedores) {
		this.restringeChatBilateralFornecedores = restringeChatBilateralFornecedores;
	}

	public int getDesativarAutoEncerramento() {
		return desativarAutoEncerramento;
	}

	public void setDesativarAutoEncerramento(int desativarAutoEncerramento) {
		this.desativarAutoEncerramento = desativarAutoEncerramento;
	}

	public long getQuantosItensPagina() {
		return quantosItensPagina;
	}

	public void setQuantosItensPagina(long l) {
		this.quantosItensPagina = l;
	}

	public int getObrigarDeclaracaoVendedor() {
		return obrigarDeclaracaoVendedor;
	}

	public void setObrigarDeclaracaoVendedor(int obrigarDeclaracaoVendedor) {
		this.obrigarDeclaracaoVendedor = obrigarDeclaracaoVendedor;
	}

	public int getbFlPublicarEdital() {
		return bFlPublicarEdital;
	}

	public void setPublicarEdital(int bFlPublicarEdital) {
		if (naFaixaDeValores(bFlPublicarEdital, SISTEMA_GERA_EDITAL_AUTOMATICAMENTE_NAO,
				SISTEMA_GERA_EDITAL_AUTOMATICAMENTE_SIM)) {
			this.bFlPublicarEdital = bFlPublicarEdital;
		}
	}

	public int getCodigoTipoCompraDireta() {
		return codigoTipoCompraDireta;
	}

	public void setCodigoTipoCompraDireta(int codigoTipoCompraDireta) {
		this.codigoTipoCompraDireta = codigoTipoCompraDireta;
	}

	public int getTipoLanceInicial() {
		return tipoLanceInicial;
	}

	public void setTipoLanceInicial(int tipoLanceInicial) {
		this.tipoLanceInicial = tipoLanceInicial;
	}

	public int getPermitirLance() {
		return permitirLance;
	}

	public void setPermitirLance(int permitirLance) {
		this.permitirLance = permitirLance;
	}

	public List<CompraDiretaLoteModel> getLstCompraDiretaLote() {
		return lstCompraDiretaLote;
	}

	public void setLstCompraDiretaLote(List<CompraDiretaLoteModel> lstCompraDiretaLote) {
		this.lstCompraDiretaLote = lstCompraDiretaLote;
	}

	public List<CompraDiretaItemModel> getLstCompraDiretaItem() {
		return lstCompraDiretaItem;
	}

	public void setLstCompraDiretaItem(List<CompraDiretaItemModel> lstCompraDiretaItem) {
		this.lstCompraDiretaItem = lstCompraDiretaItem;
	}

	public List<CompraDiretaComissaoModel> getLstCompraDiretaComissao() {
		return lstCompraDiretaComissao;
	}

	public void setLstCompraDiretaComissao(List<CompraDiretaComissaoModel> lstCompraDiretaComissao) {
		this.lstCompraDiretaComissao = lstCompraDiretaComissao;
	}

	private boolean naFaixaDeValores(int valor, int menor, int maior) {
		boolean b = valor < Math.min(menor, maior) || valor > Math.max(menor, maior);
		if (b) {
			throw new IllegalArgumentException("Valor deve estar entre " + menor + " e " + maior + " : " + valor);
		}
		return !b;
	}

	public int getPermiteUsuarioEscolherProcedencia() {
		return permiteUsuarioEscolherProcedencia;
	}

	public void setPermiteUsuarioEscolherProcedencia(int permiteUsuarioEscolherProcedencia) {
		this.permiteUsuarioEscolherProcedencia = permiteUsuarioEscolherProcedencia;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao listaLogs) {
		this.logDaGravacao = listaLogs;
	}

	public boolean isEditalComAno() {
		try {
			String[] split = numeroEdital.split("/");
			return split[1].matches("\\d{4}$");
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}
}
