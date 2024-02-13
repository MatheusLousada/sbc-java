package br.gov.sp.saobernardo.webservice.gui;

public class JanelaMain {

	public static final String NOME_CAMPO_ORIGEM = "cmbOrigem";
	public static final String NOME_CAMPO_DESTINO = "cmbDestino";
	public static final String NOME_CAMPO_IMPRIME_QUERY = "viewSql";
	public static final String NOME_CAMPO_ORGAO = "cmbOrgao";
	public static final String NOME_CAMPO_ATUALIZACAO_CADASTRAL_CNPJ = "cnpjAC";
	public static final String NOME_CAMPO_ANO = "anoLC";
	public static final String NOME_CAMPO_NUMERO_LICITACAO = "numeroLC";
	public static final String NOME_CAMPO_PROCESSO = "processoLC";
	public static final String NOME_CAMPO_PREGOES_DISPONIVEIS_PARA_IMPORTACAO = "pregoesImportaveis";
	public static final String NOME_CAMPO_RADIO_TIPO_LICITACAO_COMPRA_DIRETA = "radioButton1";
	public static final String NOME_CAMPO_RADIO_TIPO_LICITACAO_PREGAO_ELETRONICO = "radioButton2";
	public static final String NOME_CAMPO_COTACOES_DISPONIVEIS_PARA_IMPORTACAO = "cotacoesImportaveis";
	public static final String NOME_CAMPO_FILTRO_SOMENTE_COTACOES_ENCERRADAS = "somenteCotacoesEncerradas";
	public static final String NOME_CAMPO_ANO_COTACAO = "anoCot";
	public static final String FILTRO_MES_COTACAO = "mesCot";
	public static final String NOME_CAMPO_PROCESSO_COTACAO = "processoCot";
	public static final String NOME_CAMPO_ATUALIZACAO_CERTIFICADOS_CNPJ = "cnpjCertf";
	public static final String NOME_CAMPO_ATUALIZACAO_CERTIDAO_CNPJ = "cnpjCertidao";
	public static final String COMBO_TIPO_LICITACAO = "cbTipoLicitacao";
	public static final String LICITACAO_PE = "tipoPE";
	public static final String LICITACAO_CE = "tipoCE";

	public static void main(String[] args) {
		JanelaLicitarController c = new JanelaLicitarController();
		c.init();
	}
}
