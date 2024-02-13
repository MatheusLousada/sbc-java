package br.gov.sp.saobernardo.webservice.paradigma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.CondicaoDePagamentoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemEnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemTaxaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaLoteModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;

@Ignore
public class CompraDiretaServiceTest {

	private static final String CNPJ_FALSO_PARA_TESTES = ConstantesTest.CNPJ_PREFEITURA;

	private static final String SEGUNDA = "2";
	private static final String PRIMEIRA = "1";
	private CompraDiretaService sujeito;
	List<CompraDiretaModel> compras;

	@Before public void antes() throws Exception {
		sujeito = new CompraDiretaService(WSDLs.WSDL_COMPRA_DIRETA_PRODUCAO);
	}

	@Test @Ignore public void deveRetornarTodasAsComprasDiretas() {
		List<CompraDiretaModel> retorno = sujeito.retornaCompraDireta();
		assertTrue(!retorno.isEmpty());
	}
	
	@Test
	@Ignore
	public void deveRetornarUmaCompraDireta() {
		CompraDiretaModel compra = new CompraDiretaModel();
		compra.setNumeroProcessoDisplay("60000/2016");
		List<CompraDiretaModel> retorno = sujeito.retornaCompraDireta(compra);

		assertNotNull(retorno);
		assertTrue("Lista vazia! : ", !retorno.isEmpty());
		CompraDiretaModel compraDireta = retorno.get(0);
		assertEquals(ConstantesTest.CNPJ_PREFEITURA, compraDireta.getCodigoComprador());

		assertEquals("2", compraDireta.getCodigoCondicaoPagamento());
		assertEquals("2", compraDireta.getCodigoPrazoEntrega());
		assertEquals("31728067820", compraDireta.getCodigoUsuarioCriador());
		assertEquals("MEDICAMENTO - TESTE", compraDireta.getDescricaoObjeto());

		assertTrue(compraDireta.getObservacoes()
				.indexOf("Os lances deverão ser formulados em valores distintos e decrescentes") > -1);

		assertEquals("ce 000.2016", compraDireta.getNumeroEdital());

		assertEquals("60000/2016", compraDireta.getNumeroProcessoDisplay());

		/**
		 * tDtFinal 2016-05-19T10:21:30.033
		 */
		assertEquals(19, compraDireta.getDataFinal().getDay());
		assertEquals(05, compraDireta.getDataFinal().getMonth());
		assertEquals(2016, compraDireta.getDataFinal().getYear());

		/** DtInicial 2016-05-19T10:00:00 */
		assertEquals(19, compraDireta.getDataInicial().getDay());
		assertEquals(05, compraDireta.getDataInicial().getMonth());
		assertEquals(2016, compraDireta.getDataInicial().getYear());

		assertTrue(compraDireta.getDescricaoTermo()
				.indexOf("REGULAMENTO DO SECOM/SBC - Dispensa de Licitação, Convite e Pregão") > -1);

	}

	@Test
	@Ignore
	public void deveGravarUmaDeListaDeCompraDireta() {

		enviaCondicaoDePagamento();
		compras = new ArrayList<CompraDiretaModel>();
		compras.add(montaCompraDireta(PRIMEIRA));
		compras.add(montaCompraDireta(SEGUNDA));
		List<CompraDiretaModel> retorno = sujeito.grava(compras);
		assertNotNull(retorno);
	}

	@Test
	public void deveGravarUmaCompraDireta() {
		compras = new ArrayList<CompraDiretaModel>();
		CompraDiretaModel compra = montaCompraDireta(PRIMEIRA);

		compras.add(compra);

		List<CompraDiretaModel> retorno = sujeito.grava(compras);
		assertNotNull(retorno);
	}

	private void enviaCondicaoDePagamento() {
		List<CondicaoDePagamentoModel> condicoesPg = new ArrayList<CondicaoDePagamentoModel>();
		condicoesPg.add(montaCondicaoPagamento());

		CondicaoDePagamentoService condicaoDePagamentoService = new CondicaoDePagamentoService(
				WSDLs.WSDL_CONDICAO_PAGAMENTO_DESENV_HMG);

		/** List<CondicaoDePagamentoModel> retorno = */
		condicaoDePagamentoService.grava(condicoesPg);
	}

	/**
	 * Montado com dados do xml de exemplo da Paradigma
	 * ProcessarCompraDireta.xml
	 * 
	 * @param parametroCompra
	 */
	private CompraDiretaModel montaCompraDireta(String parametroCompra) {
		CompraDiretaModel compra = new CompraDiretaModel();

		String codigoUsuario = "suportepta";

		BigDecimal zero = new BigDecimal(0);
		BigDecimal quantidadeItem = new BigDecimal(2000);
		BigDecimal valorReferencia = new BigDecimal(2.0822);

		compra.setPermiteChatBilateral(CompraDiretaModel.PERMITE_FORNECEDORES_ENVIEM_MENSAGEM_PELO_CHAT_NAO);
		compra.setRestringeChatBilateralFornecedores(
				CompraDiretaModel.RESTRINGE_ENVIO_MSG_PARA_FORNECEDORES_NO_CHAT_SIM);
		compra.setDesativarAutoEncerramento(CompraDiretaModel.DESATIVAR_AUTO_ENCERRAMENTO_NAO);
		compra.setMostraReferencia(CompraDiretaModel.EXIBE_VALOR_DE_REFERENCIA_NAO);
		compra.setObrigarDeclaracaoVendedor(
				CompraDiretaModel.OBRIGAR_DECLARACAO_VENDEDOR_VALOR_ALTERADO_PELA_PARADIGMA);
		compra.setPermiteFornecedorInvalidarLance(CompraDiretaModel.PERMITE_FORNECEDOR_INVALIDAR_LANCE_SIM);
		// compra.setPermitirLance(int permitirLance);
		compra.setProrrogacaoAutomatica(CompraDiretaModel.PRORROGACAO_AUTOMATICA_SIM);
		compra.setPublicarEdital(CompraDiretaModel.SISTEMA_GERA_EDITAL_AUTOMATICAMENTE_NAO);
		compra.setParticipacaoRestrita(CompraDiretaModel.PARTICIPACAO_RESTRITA_NAO);
		compra.setExigeTermo(CompraDiretaModel.EXIGE_TERMO_NENHUM);
		compra.setTemVariacaoNosLances(CompraDiretaModel.TEM_VARIACAO_NOS_LANCES_NAO);
		compra.setValorVariacaoMax(zero);
		compra.setValorVariacaoMin(zero);

		List<CompraDiretaComissaoModel> comissoes = new ArrayList<CompraDiretaComissaoModel>();
		CompraDiretaComissaoModel comissao = new CompraDiretaComissaoModel();
		comissao.setCodigoUsuario(codigoUsuario);
		comissao.setPerfil(CompraDiretaComissaoModel.CODIGO_COMISSAO_AUTORIDADE_COMPETENTE_PREGOEIRO_E_APOIO);
		comissoes.add(comissao);
		compra.setLstCompraDiretaComissao(comissoes);

		List<CompraDiretaItemModel> itens = new ArrayList<CompraDiretaItemModel>();
		CompraDiretaItemModel item = new CompraDiretaItemModel();

		item.setQuantidadeItem(quantidadeItem);
		item.setValorReferencia(valorReferencia);

		List<CompraDiretaItemEnderecoModel> enderecos = new ArrayList<CompraDiretaItemEnderecoModel>();
		CompraDiretaItemEnderecoModel endereco = new CompraDiretaItemEnderecoModel();

		endereco.setdQtItem(quantidadeItem);
		String codigodEmpresaTeste = CNPJ_FALSO_PARA_TESTES;
		endereco.setsCdEmpresaCobrancaEndereco(codigodEmpresaTeste);
		endereco.setsCdEmpresaEntregaEndereco(codigodEmpresaTeste);
		endereco.setsCdEmpresaFaturamentoEndereco(codigodEmpresaTeste);

		enderecos.add(endereco);
		item.setListaCompraDiretaItemEndereco(enderecos);

		// Nao esta no exemplo
		List<CompraDiretaItemTaxaModel> itemTaxas = new ArrayList<CompraDiretaItemTaxaModel>();
		CompraDiretaItemTaxaModel taxa = new CompraDiretaItemTaxaModel();
		taxa.setCodigoEmpresaEntrega(3);
		taxa.setCodigoTaxa(1);
		itemTaxas.add(taxa);
		item.setListaCompraDiretaItemTaxaDTO(itemTaxas);

		/** Situacao esta fixa na classe */
		item.setCodigoClasse("6145");
		item.setCodigoProduto("4C014010077");
		item.setCodigoUnidadeMedida("01120"); 
		item.setDescricaoItem("CABO FLEXIVEL DE COBRE  ELETROLITICO, 750V, BITOLA");

		// item.setsCdItemLegado("");
		// item.setsCdLoteLegado("");
		item.setCodigoItemSequencial(1);

		itens.add(item);
		compra.setLstCompraDiretaItem(itens);

		// Nao esta no exemplo
		List<CompraDiretaLoteModel> lotes = new ArrayList<CompraDiretaLoteModel>();
		CompraDiretaLoteModel lote = new CompraDiretaLoteModel();
		lote.setDescricaoLote("");
		lote.setValorReferencia(valorReferencia);
		lotes.add(lote);
		compra.setLstCompraDiretaLote(lotes);

		compra.setCodigoMoeda(CompraDiretaModel.CODIGO_MOEDA_REAL);
		compra.setCodigoSituacao(CompraDiretaModel.CODIGO_SITUACAO);
		compra.setCodigoTemplate(CompraDiretaModel.CODIGO_TEMPLATE);
		compra.setCodigoTipoCompraDireta(CompraDiretaModel.TIPO_COMPRA_DIRETA_ORCAMENTO);
		compra.setTipoAvaliacao(CompraDiretaModel.TIPO_AVALIACAO_MENOR_PRECO);
		compra.setEstiloCompra(CompraDiretaModel.ESTILO_COMPRA_NORMAL);
		compra.setUsuarioEscolheMarca(CompraDiretaModel.USUARIO_ESCOLHE_MARCA_OBRIGATORIO);
		compra.setPermiteUsuarioEscolherProcedencia(CompraDiretaModel.PERMITE_USUARIO_ESCOLHER_PROCEDENCIA_NAO);
		compra.setTipoApuracao(CompraDiretaModel.TIPO_APURACAO_ITEM);
		// compra.setTipoLanceInicial(int tipoLanceInicial);
		compra.setNumeroCasasDecimais(CompraDiretaModel.QUANTAS_CASAS_DECIMAIS_QUATRO);
		compra.setQuantosItensPagina(CompraDiretaModel.ITENS_POR_PAGINA_TUDO);

		int doisMinutos = 2;
		compra.setMinutosProrrogaSeAtendido(doisMinutos);
		compra.setMinutosProrrogaCondicao(doisMinutos);

		compra.setCodigoComprador(CNPJ_FALSO_PARA_TESTES);
		CondicaoDePagamentoModel condicaoPagamento = montaCondicaoPagamento();
		compra.setCodigoCondicaoPagamento(condicaoPagamento.getCodigoCondicaoPagamento());
		compra.setCodigoPrazoEntrega(PRIMEIRA);
		compra.setCodigoUsuarioCriador(codigoUsuario);
		compra.setDescricaoObjeto("CABO FLEXÍVEL DE COBRE ELETROLÍTICO");
		compra.setDescricaoTermo("Declaro, expressamente, sob as penas da lei que:<BR>"
				+ "1. inexiste qualquer fato superveniente ao meu registro cadastral que me impeça de contratar com o Município, nos termos do disposto no Â§ 2Âº do artigo 32 da Lei Federal nÂº 8.666, de 21 de junho de 1993;<BR>"
				+ "2. conheço e aceito o REGULAMENTO DO SECOM/SBC - Dispensa de Licitação, Convite e Pregão;<BR>"
				+ "3. atendo Ã s exigências de habilitação previstas no Edital;<BR>"
				+ "4. não me utilizo, em qualquer fase do processo produtivo e/ou prestação de serviço, de mão-de-obra de menores de 18 (dezoito) anos de idade em trabalho noturno, perigoso ou insalubre, bem como de menores de 16 (dezesseis) anos de idade, em qualquer trabalho, salvo na condição de aprendiz, a partir de 14 (catorze) anos);<BR>"
				+ "5. me responsabilizo pela autenticidade e procedência dos bens e qualidade dos serviços que cotar;<BR>"
				+ "6. se possuir cem ou mais empregados, dois a cinco por cento desses cargos serão preenchidos por beneficiÃ¡rios reabilitados, ou pessoas portadoras de deficiência, conforme preceitua o artigo 93 da Lei Federal nÂº 8.213, de 24 de julho de 1991 e Portaria nÂº 4.677, de 29 de julho de 1998; e, por fim que<BR>"
				+ "7. atendo as exigências, principalmente quanto Ã s condições para pagamentos indicadas pelo Município;<BR>"
				+ "8. que cumpre as Normas de Trabalho Decente da Organização Internacional do Trabalho e do MinistÃ©rio do Trabalho e Emprego, conforme preceitua a Lei Municipal nÂº 6.078 de 03 de novembro de 2010.<BR>");
		compra.setObservacoes("Teste de observacao");
		// "<P class=MsoNormal><B>LANCES:</B> Os lances deverão ser formulados
		// em valores distintos e decrescentes, inferiores Ã  proposta de menor
		// preço, ou em valores distintos e decrescentes ao Ãºltimo valor
		// apresentado pela prÃ³pria licitante.</P> <P class=MsoNormal>Não
		// serão aceitos dois ou mais lances de mesmo valor, preservando aquele
		// que for recebido e registro em primeiro lugar.</P> <P
		// class=MsoNormal><B>PRORROGAÃ‡ÃƒO AUTOMÃ�TICA:</B> A duração da
		// etapa de lances serÃ¡ prorrogada automaticamente pelo sistema,
		// visando Ã  continuidade da disputa, quando houver lance admissível
		// ofertado nos Ãºltimos 02 (dois) minutos do período de LANCES ou nos
		// sucessivos períodos de prorrogação automÃ¡tica.</P>");

		Conversores conv = new Conversores(sujeito.getServiceName());
		compra.setDataFinal(conv.converteParaXMLGregorianCalendar(20170215L));
		compra.setDataInicial(conv.converteParaXMLGregorianCalendar(20170210L));
		compra.setNumeroEdital("TESTE2301/2017- CD" + parametroCompra);
		compra.setNumeroProcessoDisplay("TESTE2301/2017- CD" + parametroCompra);

		return compra;
	}

	private CondicaoDePagamentoModel montaCondicaoPagamento() {
		CondicaoDePagamentoModel cond15Dias = new CondicaoDePagamentoModel();
		cond15Dias.setCodigoCondicaoPagamento("2");
		cond15Dias.setDescricaoCondicaoPagamento("Quinze dias fora quinzena");
		cond15Dias.setCodigoEmpresa("");
		return cond15Dias;
	}

}
