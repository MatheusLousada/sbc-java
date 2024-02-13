package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;

public class PregaoEletronicoModel {

	public static final int TIPO_APURACAO_PREGAO_POR_ITEM = 1;
	public static final int TIPO_APURACAO_PREGAO_POR_LOTE = 2;

	public static final int TERMO_DE_ACEITE_NAO_EXIGIDO = 0;
	public static final int TERMO_DE_ACEITE_TERMO_DE_CONCORDANCIA = 1;
	public static final int TERMO_DE_ACEITE_EDITAL_PREGAO = 2;
	public static final int TERMO_DE_ACEITE_CONCORDANCIA_E_EDITAL = 3;

	public static final int DUAS_CASAS_DECIMAIS = 2;
	public static final int TRES_CASAS_DECIMAIS = 3;
	public static final int QUATRO_CASAS_DECIMAIS = 4;

	public static final int CODIGO_TEMPLATE = 18000;

	public static final int CODIGO_DA_SITUACAO_EM_CONFIGURACAO = 0;

	public static final int MODALIDADE_PREGAO_MENOR_PRECO = 1;

	public static final int CHAT_BILATERAL_NAO = 0;
	public static final int CHAT_BILATERAL_SIM = 1;

	public static final int PROCEDENCIA_NAO_EXIBIR = 0;
	public static final int PROCEDENCIA_ESCOLHER = 1;
	public static final int PROCEDENCIA_OPCIONAL = 2;

	public static final int USUARIO_ESCOLHE_MARCA_ITEM_NAO = 0;
	public static final int USUARIO_ESCOLHE_MARCA_ITEM_OBRIGATORIO = 1;
	public static final int USUARIO_ESCOLHE_MARCA_ITEM_OPCIONAL = 2;

	public static final int RESTRINGIR_PARTICIPACAO_PROCESSO_DE_ESCOLHA_SIM = 1;
	public static final int RESTRINGIR_PARTICIPACAO_PROCESSO_DE_ESCOLHA_NAO = 2;

	public static final int RESTRINGIR_PARTICIPACAO_EMPRESA_SEM_CRC_NAO = 0;
	public static final int RESTRINGIR_PARTICIPACAO_EMPRESA_SEM_CRC_SIM = 1;

	public static final int RESTRINGIR_SOMENTE_ME_EPP_NAO = 0;
	public static final int RESTRINGIR_SOMENTE_ME_EPP_SIM = 1;

	public static final int PERMITE_USUARIO_INFORMAR_ANEXO_NAO = 0;
	public static final int PERMITE_USUARIO_INFORMAR_ANEXO_OBRIGATORIO = 1;
	public static final int PERMITE_USUARIO_INFORMAR_ANEXO_OPCIONAL = 2;

	public static final int CODIGO_MOEDA_REAL = 1;

	public static final int TIPO_PREGAO_NORMAL = 1;
	public static final int TIPO_PREGAO_REGISTRO_DE_PRECOS = 2;

	public static final int QUANTOS_ITENS_POR_PAGINA_SEM_PAGINACAO = 0;
	public static final int QUANTOS_ITENS_POR_PAGINA_DEZ = 10;
	public static final int QUANTOS_ITENS_POR_PAGINA_VINTE = 20;
	public static final int QUANTOS_ITENS_POR_PAGINA_TRINTA = 30;
	public static final int QUANTOS_ITENS_POR_PAGINA_QUARENTA = 40;
	public static final int QUANTOS_ITENS_POR_PAGINA_CINQUENTA = 50;

	public static final int USUARIO_ESCOLHE_MODELO_ITEM_NAO = 0;
	public static final int USUARIO_ESCOLHE_MODELO_ITEM_OBRIGATORIO = 1;
	public static final int USUARIO_ESCOLHE_MODELO_ITEM_OPCIONAL = 2;

	public static final int OBRIGAR_DECLARACAO_VENDEDOR_SIM = 1;
	public static final int OBRIGAR_DECLARACAO_VENDEDOR_NAO = 2;

	public static final int GERAR_EDITAL_AUTOMATICAMENTE_SIM = 1;
	public static final int GERAR_EDITAL_AUTOMATICAMENTE_NAO = 2;

	public static final int MOSTRAR_VALOR_DE_REFERENCIA_NAO = 0;
	public static final int MOSTRAR_VALOR_DE_REFERENCIA_SIM = 1;

	public static final int APLICA_LEI_123_NAO = 0;
	public static final int APLICA_LEI_123_SIM = 1;

	public static final int VENDEDOR_INFORMA_CONFORMIDADE_REGRAS_CAPACITACAO_SIM = 1;
	public static final int VENDEDOR_INFORMA_CONFORMIDADE_REGRAS_CAPACITACAO_NAO = 2;

	public static final int DISPUTA_LANCES_COM_AUTO_ENCERRAMENTO = 0;
	public static final int DISPUTA_LANCES_COM_PRORROGACAO_AUTOMATICA = 1;
	public static final int DISPUTA_LANCES_COM_COM_PRORROGACAO_E_AUTO_ENCERRAMENTO = 2;

	public static final int ANEXO_FASE_NEGOCIACAO_NAO = 0;
	public static final int ANEXO_FASE_NEGOCIACAO_OPCIONAL = 1;
	public static final int ANEXO_FASE_NEGOCIACAO_OBRIGATORIO = 2;

	// ==============================

	/** String 30 Número do processo. */
	private String numeroProcessoDisplay;

	/** String 30 Número do edital. */
	private String numeroEdital;

	/** String 1000 Descrição do objeto. */
	private String descricaoObjeto;

	/** DateTime Data de início da etapa de envio das propostas. */
	private XMLGregorianCalendar dataInicialProposta;

	/**
	 * DateTime Não obrigatório. Data de encerramento da etapa de envio das
	 * propostas. Caso a informação não for enviada, o sistema considerará a
	 * informação do parâmetro já existente.
	 */

	private XMLGregorianCalendar dataFinalProposta;

	/**
	 * DateTime Não obrigatório. Data de início da etapa de disputa de lances. É
	 * obrigatório que esta seja maior ou igual à data de encerramento da etapa
	 * de propostas. Se a data final de proposta não for preenchida, a data
	 * inicial da disputa será calculada automaticamente conforme parâmetro do
	 * sistema.
	 */
	private XMLGregorianCalendar dataInicialDisputa;

	/**
	 * Int 1 Restrição: 1 – Sim: Permite restringir a participação dos
	 * fornecedor pelo processo de escolha dos mesmos. 2 – Não: Não permite
	 * restringir a participação dos fornecedores.
	 */
	private int restrito;

	/**
	 * Int 1 Tipo da apuração do pregão: 1 – Por item 2 – Por lote
	 */
	private int tipoApuracao;

	/**
	 * String 4000 Não obrigatório. Descrição do termo do pregão. Caso a
	 * informação não for enviada, o sistema considerará a informação do
	 * parâmetro já existente.
	 */
	private String descricaoTermo;

	/**
	 * String 2000 Não obrigatório. Descrição das observações do pregão. Caso a
	 * informação não for enviada, o sistema considerará a informação do
	 * parâmetro já existente.
	 */
	private String observacao;

	/**
	 * Int 1 Exige que ao cessar o pregão, o fornecedor dê o aceite conforme as
	 * seguintes condições. 0 – Nenhum (não precisa de aceite) 1 - Termo de
	 * concordância 2 - Edital do pregão 3 - Termo de concordância e Edital
	 */
	private int aceiteTermo;

	/** Int 10 Código da condição de pagamento */
	private int codigoCondicaoPagamento;

	/**
	 * Int 1 Número de casas decimais, permitindo as seguintes opções: 2, 3 ou
	 * 4.
	 */
	private int numeroCasasDecimais;

	/** Int 10 Considerar sempre o envio do valor 18000. */
	private int codigoTemplate;

	/** String 14 Código da empresa compradora */
	private String codigoComprador;

	/**
	 * String 100 Código do usuário responsável. Geralmente o comprador que
	 * fechou a negociação
	 */
	private String codigoUsuarioCriador;

	/**
	 * Int 2 Código da situação: 0 – Em configuração
	 */
	private Integer codigoSituacao;

	/** String 10 Código do prazo de entrega */
	private String codigoPrazoEntrega;

	/**
	 * Int 1 Modalidade do pregão: 1 – Menor preço
	 */
	private int modalidade;

	/**
	 * Int 1 Chat bilateral, permite que o fornecedor também envie mensagens
	 * através do chat: 0 – Não 1 - Sim
	 */
	private int permiteChatBilateral;

	/**
	 * Int 1 Permite que o usuário escolha a procedência de cada item: 0 – Não
	 * (não exibe o campo para escolha) 1 – Obriga a escolha da procedência. 2 –
	 * A escolha da procedência é opcional.
	 */
	private int procedenciaProposta;

	/**
	 * Int 1 Permite que o usuário escolha a marca de cada item: 0 – Não (não
	 * exibe o campo para escolha) 1 – Obriga a escolha da marca. 2 – A escolha
	 * da marca é opcional.
	 */
	private int propostaMarca;

	/**
	 * Int 1 Não obrigatório. Restringe a participação do usuário, caso sua
	 * empresa não tiver o CRC cadastrado. 0 – Não (sugerimos sempre utilizar
	 * esta opção) 1 – Sim Caso a informação não for enviada, o sistema
	 * considerará a informação do parâmetro já existente.
	 */
	private int requerCRC;

	/**
	 * Int 1 Restringe a escolha dos participantes, somente dos que forem
	 * ME/EPP. 0 – Não (sugerimos sempre utilizar esta opção) 1 - Sim
	 */
	private int numeroSuperSimples;

	/**
	 * Int 1 Permite que o usuário informe o anexo de cada item: 0 – Não (não
	 * exibe o campo para escolha) 1 – Obriga a colocação de pelo menos um
	 * anexo. 2 – A colocação do anexo é opcional.
	 */
	private int numeroPropostaAnexo;

	/**
	 * Int 10 Moeda em que o pregão será conduzido: 1 – Real
	 */
	private int codigoMoeda;

	/**
	 * Int 5 Tipo do pregão: 1 – Normal 2 – Registro de preços
	 */
	private int codigoPregaoTipo;

	/**
	 * Int 3 Quantidade de itens/lotes exibidos por página. Recomendado que
	 * quando houverem muitos itens, seja paginada a exibição das informações: 0
	 * – Sem paginação 10, 20, 30, 40 ou 50
	 */
	private int quantosItensPagina;

	/**
	 * Int 1 Permite que o usuário escolha o modelo de cada item: 0 – Não (não
	 * exibe o campo para escolha) 1 – Obriga a escolha do modelo. 2 – A escolha
	 * do modelo é opcional.
	 */
	private int propostaModelo;

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
	private int publicarEdital;

	/**
	 * Int 1 Não obrigatório. Exibe o valor de referência para o vendedor
	 * durante a etapa de propostas: 0 – Não 1 – Sim Caso a informação não for
	 * enviada, o sistema considerará a informação do parâmetro já existente.
	 */
	private int mostraReferencia;

	/**
	 * Int 1 Não obrigatório. Aplicação da Lei 123 durante a etapa de
	 * negociação: 0 – Não 1 – Sim (recomendamos a utilização desta opção) Caso
	 * a informação não for enviada, o sistema considerará a informação do
	 * parâmetro já existente.
	 */
	private int aplicaLei123;

	/**
	 * Int 1 Obriga o comprador após a habilitação, informar se o vendedor está
	 * em conformidade com as regras da capacitação exigidas: 1 – Sim 2 – Não
	 */
	private int exigeCapacitacao;

	/**
	 * Int 1 Não obrigatório. Opções disponíveis para a etapa de disputa de
	 * lances: 0 - Disputa com auto-encerramento (opção padrão prevista em lei)
	 * 1 - Disputa com prorrogação automática 2 - Disputa com prorrogação
	 * automática e auto-encerramento Caso a informação não for enviada, o
	 * sistema considerará a informação do parâmetro já existente.
	 */
	private int autoEncerramento;

	/**
	 * Int 3 Não obrigatório. Caso a configuração (nIdAutoEncerramento) for
	 * diferente de 0, o preenchimento deste campo é obrigatório.
	 */
	private int valorTempoDisputa;

	/**
	 * Int 3 Não obrigatório. Caso a configuração (nIdAutoEncerramento) for
	 * diferente de 0, o preenchimento deste campo é obrigatório.
	 */
	private int valorProrrogaCondicao;

	/**
	 * Int 3 Não obrigatório. Caso a configuração (nIdAutoEncerramento) for
	 * diferente de 0, o preenchimento deste campo é obrigatório. Esta
	 * informação deve ser maior ou igual à informação relacionada ao campo
	 * nVlProrrogaCondicao
	 */
	private int valorProrroga;

	/**
	 * Int 1 Não obrigatório. Indica se terá anexos na fase de negociação. Não =
	 * 0, Opcional = 1 e Obrigatório na negociação = 2;
	 */
	private int negociacaoAnexo;

	/**
	 * Array de pregaoEletronicoLote Não obrigatório. Lista dos lotes do pregão
	 * eletrônico.
	 */
	List<PregaoEletronicoLoteModel> lstPregaoEletronicoLote;

	/** Array de pregaoEletronicoItem Lista dos itens do pregão eletrônico. */
	List<PregaoEletronicoItemModel> lstPregaoEletronicoItem;

	/**
	 * Array de pragaoEletronicoComissao Lista das comissões do pregão
	 * eletrônico.
	 */
	List<PregaoEletronicoComissaoModel> lstPregaoEletronicoComissao;

	private LogDeRetornoDaGravacao logDaGravacao;

	private PregaoEletronicoPrazoDeEntregaModel prazoDeEntrega;

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

	public XMLGregorianCalendar getDataInicialProposta() {
		return dataInicialProposta;
	}

	public void setDataInicialProposta(XMLGregorianCalendar dataInicialProposta) {
		this.dataInicialProposta = dataInicialProposta;
	}

	public XMLGregorianCalendar getDataFinalProposta() {
		return dataFinalProposta;
	}

	public void setDataFinalProposta(XMLGregorianCalendar dataFinalProposta) {
		this.dataFinalProposta = dataFinalProposta;
	}

	public XMLGregorianCalendar getDataInicialDisputa() {
		return dataInicialDisputa;
	}

	public void setDataInicialDisputa(XMLGregorianCalendar dataInicialDisputa) {
		this.dataInicialDisputa = dataInicialDisputa;
	}

	public int getRestrito() {
		return restrito;
	}

	public void setRestrito(int restrito) {
		this.restrito = restrito;
	}

	public int getTipoApuracao() {
		return tipoApuracao;
	}

	public void setTipoApuracao(int tipoApuracao) {
		this.tipoApuracao = tipoApuracao;
	}

	public String getDescricaoTermo() {
		return descricaoTermo;
	}

	public void setDescricaoTermo(String descricaoTermo) {
		this.descricaoTermo = descricaoTermo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getAceiteTermo() {
		return aceiteTermo;
	}

	public void setAceiteTermo(int aceiteTermo) {
		this.aceiteTermo = aceiteTermo;
	}

	public int getCodigoCondicaoPagamento() {
		return codigoCondicaoPagamento;
	}

	public void setCodigoCondicaoPagamento(int codigoCondicaoPagamento) {
		this.codigoCondicaoPagamento = codigoCondicaoPagamento;
	}

	public int getNumeroCasasDecimais() {
		return numeroCasasDecimais;
	}

	public void setNumeroCasasDecimais(int numeroCasasDecimais) {
		this.numeroCasasDecimais = numeroCasasDecimais;
	}

	public int getCodigoTemplate() {
		return codigoTemplate;
	}

	public void setCodigoTemplate(int codigoTemplate) {
		this.codigoTemplate = codigoTemplate;
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

	public Integer getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(Integer codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public String getCodigoPrazoEntrega() {
		return codigoPrazoEntrega;
	}

	public void setCodigoPrazoEntrega(String codigoPrazoEntrega) {
		this.codigoPrazoEntrega = codigoPrazoEntrega;
	}

	public int getModalidade() {
		return modalidade;
	}

	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}

	public int getPermiteChatBilateral() {
		return permiteChatBilateral;
	}

	public void setPermiteChatBilateral(int permiteChatBilateral) {
		this.permiteChatBilateral = permiteChatBilateral;
	}

	public int getProcedenciaProposta() {
		return procedenciaProposta;
	}

	public void setProcedenciaProposta(int procedenciaProposta) {
		this.procedenciaProposta = procedenciaProposta;
	}

	public int getPropostaMarca() {
		return propostaMarca;
	}

	public void setPropostaMarca(int propostaMarca) {
		this.propostaMarca = propostaMarca;
	}

	public int getRequerCRC() {
		return requerCRC;
	}

	public void setRequerCRC(int requerCRC) {
		this.requerCRC = requerCRC;
	}

	public int getNumeroSuperSimples() {
		return numeroSuperSimples;
	}

	public void setNumeroSuperSimples(int numeroSuperSimples) {
		this.numeroSuperSimples = numeroSuperSimples;
	}

	public int getNumeroPropostaAnexo() {
		return numeroPropostaAnexo;
	}

	public void setNumeroPropostaAnexo(int numeroPropostaAnexo) {
		this.numeroPropostaAnexo = numeroPropostaAnexo;
	}

	public int getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(int codigoMoeda) {
		this.codigoMoeda = codigoMoeda;
	}

	public int getCodigoPregaoTipo() {
		return codigoPregaoTipo;
	}

	public void setCodigoPregaoTipo(int codigoPregaoTipo) {
		this.codigoPregaoTipo = codigoPregaoTipo;
	}

	public int getQuantosItensPagina() {
		return quantosItensPagina;
	}

	public void setQuantosItensPagina(int quantosItensPagina) {
		this.quantosItensPagina = quantosItensPagina;
	}

	public int getPropostaModelo() {
		return propostaModelo;
	}

	public void setPropostaModelo(int propostaModelo) {
		this.propostaModelo = propostaModelo;
	}

	public int getObrigarDeclaracaoVendedor() {
		return obrigarDeclaracaoVendedor;
	}

	public void setObrigarDeclaracaoVendedor(int obrigarDeclaracaoVendedor) {
		this.obrigarDeclaracaoVendedor = obrigarDeclaracaoVendedor;
	}

	public int getPublicarEdital() {
		return publicarEdital;
	}

	public void setPublicarEdital(int publicarEdital) {
		this.publicarEdital = publicarEdital;
	}

	public int getMostraReferencia() {
		return mostraReferencia;
	}

	public void setMostraReferencia(int mostraReferencia) {
		this.mostraReferencia = mostraReferencia;
	}

	public int getAplicaLei123() {
		return aplicaLei123;
	}

	public void setAplicaLei123(int aplicaLei123) {
		this.aplicaLei123 = aplicaLei123;
	}

	public int getExigeCapacitacao() {
		return exigeCapacitacao;
	}

	public void setExigeCapacitacao(int exigeCapacitacao) {
		this.exigeCapacitacao = exigeCapacitacao;
	}

	public int getAutoEncerramento() {
		return autoEncerramento;
	}

	public void setAutoEncerramento(int autoEncerramento) {
		this.autoEncerramento = autoEncerramento;
	}

	public int getValorTempoDisputa() {
		return valorTempoDisputa;
	}

	public void setValorTempoDisputa(int valorTempoDisputa) {
		this.valorTempoDisputa = valorTempoDisputa;
	}

	public int getValorProrrogaCondicao() {
		return valorProrrogaCondicao;
	}

	public void setValorProrrogaCondicao(int valorProrrogaCondicao) {
		this.valorProrrogaCondicao = valorProrrogaCondicao;
	}

	public int getValorProrroga() {
		return valorProrroga;
	}

	public void setValorProrroga(int valorProrroga) {
		this.valorProrroga = valorProrroga;
	}

	public int getNegociacaoAnexo() {
		return negociacaoAnexo;
	}

	public void setNegociacaoAnexo(int negociacaoAnexo) {
		this.negociacaoAnexo = negociacaoAnexo;
	}

	public List<PregaoEletronicoLoteModel> getLstPregaoEletronicoLote() {
		return lstPregaoEletronicoLote;
	}

	public void setLstPregaoEletronicoLote(List<PregaoEletronicoLoteModel> lstPregaoEletronicoLote) {
		this.lstPregaoEletronicoLote = lstPregaoEletronicoLote;
	}

	public List<PregaoEletronicoItemModel> getLstPregaoEletronicoItem() {
		return lstPregaoEletronicoItem;
	}

	public void setLstPregaoEletronicoItem(List<PregaoEletronicoItemModel> lstPregaoEletronicoItem) {
		this.lstPregaoEletronicoItem = lstPregaoEletronicoItem;
	}

	public List<PregaoEletronicoComissaoModel> getLstPregaoEletronicoComissao() {
		return lstPregaoEletronicoComissao;
	}

	public void setLstPregaoEletronicoComissao(List<PregaoEletronicoComissaoModel> lstPregaoEletronicoComissao) {
		this.lstPregaoEletronicoComissao = lstPregaoEletronicoComissao;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public PregaoEletronicoPrazoDeEntregaModel getPrazoDeEntrega() {
		return prazoDeEntrega;
	}

	public void setPrazoDeEntrega(PregaoEletronicoPrazoDeEntregaModel condicaoDePagamento) {
		this.prazoDeEntrega = condicaoDePagamento;
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

	@Override
	public String toString() {
		return "PregaoEletronicoModel{" +
				"numeroProcessoDisplay='" + numeroProcessoDisplay + '\'' +
				", numeroEdital='" + numeroEdital + '\'' +
				", codigoSituacao=" + (codigoSituacao != null ? codigoSituacao.toString() : "null") +
				", dataInicialProposta=" + (dataInicialProposta != null ? dataInicialProposta.toString() : "null") +
				", dataFinalProposta=" + (dataFinalProposta != null ? dataFinalProposta.toString() : "null") +
				", dataInicialDisputa=" + (dataInicialDisputa != null ? dataInicialDisputa.toString() : "null") +
				'}';
	}
}
