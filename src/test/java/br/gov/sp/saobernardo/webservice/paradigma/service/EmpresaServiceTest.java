package br.gov.sp.saobernardo.webservice.paradigma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.SituacaoEmpresa;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoEmpresa;
@Ignore
//@Ignore("As empresas não serão cadastradas por nós e toda busca será realizada pelo banco")
public class EmpresaServiceTest {

	private static final String MENSAGEM_DE_SUCESSO = "executada com sucesso para a chave";

	private static final String CNPJ_UP_DENT = "13035703000105";

	public final static String FALHA_NAO_DESENVOLVIDO = "Ainda não implementado";

	public final static String CODIGO_EMPRESA_WBC_UPDENT = "3960";

	private static final long ATIVA = 1L;
	private static final long VENDEDORA = 3L;
	private EmpresaModel empresaUpDent;
	private EmpresaService sujeito;
	private EmpresaModel retorno;
	private EmpresaModel empresaTeste;

	@Before
	public void antes() {
		empresaUpDent = empresaUpDent();
		empresaTeste = empresaDeTesteNova();
		sujeito = new EmpresaService(WSDLs.WSDL_EMPRESA_PRODUCAO);

	}

	//@Test
	public void buscarEmpresaUpDent() {

		retorno = sujeito.retornarEmpresaPorCnpj(empresaUpDent.getCnpj());

		Assert.assertEquals(empresaUpDent.getCnpj(), retorno.getCnpj());
		Assert.assertNotNull(retorno.getCodigoEmpresa());
		Assert.assertEquals(empresaUpDent.getNomeEmpresa().trim(), retorno.getNomeEmpresa().trim());
		Assert.assertEquals(empresaUpDent.getNomeFantasia(), retorno.getNomeFantasia());
		// Assert.assertEquals(empresaUpDent.getCodigoEmpresa(),
		// retorno.getCodigoEmpresa());
	}

	//@Test
	public void buscarEmpresaTeste() {

		retorno = sujeito.retornarEmpresaPorCnpj(empresaTeste.getCnpj());

		Assert.assertEquals(empresaTeste.getCnpj(), retorno.getCnpj());
		Assert.assertEquals(empresaTeste.getCodigoEmpresa(), retorno.getCodigoEmpresa());
		Assert.assertEquals(empresaTeste.getNomeEmpresa(), retorno.getNomeEmpresa());
		Assert.assertEquals(empresaTeste.getNomeFantasia(), retorno.getNomeFantasia());
	}

	@Test
	@Ignore
	public void retornarEmpresaUpDentPorCodigoWBC() {

		retorno = sujeito.retornarEmpresaPorCodigoWbc(Long.valueOf(empresaUpDent.getCodigoEmpresa()));

		Assert.assertEquals(empresaUpDent.getCnpj(), retorno.getCnpj());
		// Assert.assertNull(retorno.getCodigoEmpresa());
		Assert.assertEquals(empresaUpDent.getNomeEmpresa(), retorno.getNomeEmpresa());
		Assert.assertEquals(empresaUpDent.getNomeFantasia(), retorno.getNomeFantasia());
	}

	@Ignore("Nao iremos gravar no WBC. Somente receber")
	@Test
	public void deveGravarUmaListaDeEmpresas() {
		List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();

		empresas.add(empresaTeste);

		List<EmpresaModel> retorno = sujeito.grava(empresas);
		LogDeRetornoDaGravacao log = retorno.get(0).getLogDaGravacao();
		Assert.assertNotNull(log);
		assertEquals("Nao deve gravar uma nova empresa", "E-mail obrigatorio para a empresa 9001!", log.getDescricao());
		assertTrue("Nao gravou com sucesso ", log.getDescricao().indexOf(MENSAGEM_DE_SUCESSO) > 0);
	}

	@Test
	@Ignore("Erro na Paradigma; Solicita email mesmo tendo sido enviado")
	public void naoPodeIncluirEmpresaUpDent() {

		EmpresaModel retorno = sujeito.grava(empresaUpDent);

		Assert.assertNotEquals(empresaUpDent.getCnpj(), retorno.getCnpj());
		Assert.assertNotNull(retorno.getCodigoEmpresa());

		Assert.assertEquals(empresaUpDent.getCodigoEmpresa(), retorno.getCodigoEmpresa());
		assertEquals(empresaUpDent.getCodigoEmpresa(), retorno.getCodigoEmpresa());

		Assert.assertNotEquals(empresaUpDent.getNomeEmpresa(), retorno.getNomeEmpresa());
		Assert.assertNotEquals(empresaUpDent.getNomeFantasia(), retorno.getNomeFantasia());
		Assert.assertNull(retorno.getNomeEmpresa());

		Assert.assertNull(retorno.getNomeFantasia());

		LogDeRetornoDaGravacao log = retorno.getLogDaGravacao();
		assertNotEquals("", log.getData());
		assertNotEquals("", log.getDescricao());
		assertEquals("E-mail obrigatorio para a empresa " + CODIGO_EMPRESA_WBC_UPDENT + "!", log.getDescricao());

		// Assert.assertFalse(log.getDescricao().contains(s));

		assertNotEquals("", log.getToken());

	}

	//@Test
	public void deveRetornarEmpresaVencedoraNovaSemDePara() {
		List<EmpresaModel> empresas = sujeito.retornaEmpresasSemDePara();
		assertNotNull(empresas);
		assertTrue(empresas.size() > 0);
	}

	@Test
	@Ignore("Erro na Paradigma; Solicita email mesmo tendo sido enviado")
	public void deveFazerODeParaDaEmpresaDeTeste() {
		EmpresaModel empresaUpDent2 = empresaUpDent();
		empresaUpDent2.setCnpj(null);
		empresaUpDent2.setEmailContato("teste@paradigmabs.com.br");

		EmpresaModel retorno = sujeito.grava(empresaUpDent2);

		LogDeRetornoDaGravacao log = retorno.getLogDaGravacao();
		assertNotEquals("", log.getData());
		assertNotEquals("", log.getDescricao());
		assertNotEquals("", log.getToken());
		assertTrue("Deve informar sucesso : " + log.getDescricao(),
				log.getDescricao().indexOf(MENSAGEM_DE_SUCESSO) > 0);

	}

	@Ignore
	@Test
	public void RetornarEmpresa() {
		EmpresaModel empresa = sujeito.retornarEmpresa(CODIGO_EMPRESA_WBC_UPDENT);
		assertNotNull(empresa);
	}

	@Test
	public void deveConsultarUmaEmpresaPeloCnpj() {

		EmpresaModel empresa = sujeito.retornarEmpresaPorCnpj(CNPJ_UP_DENT);
		assertNotNull(empresa);
		assertEquals(empresaUpDent.getCnpj(), empresa.getCnpj());
		assertEquals(empresaUpDent.getCodigoEmpresa(), empresa.getCodigoEmpresa());
		assertEquals(empresaUpDent.getNomeEmpresa().trim(), empresa.getNomeEmpresa().trim());
		//assertEquals(empresaUpDent.getNomeFantasia(), empresa.getNomeFantasia());
		//String endereco = empresaUpDent.getEndereco().getDescricao().substring(0,
		//		empresa.getEndereco().getDescricao().length());
		//assertEquals(endereco, empresa.getEndereco());
	}

	/** Cria uma empresa com os valores default */
	private EmpresaModel templateEmpresa() {
		TipoEmpresa tipoEmpresa = new TipoEmpresa(VENDEDORA);
		SituacaoEmpresa situacao = new SituacaoEmpresa(ATIVA);
		EmpresaModel template = new EmpresaModel();
		template.setSituacao(situacao);
		template.setTipoEmpresa(tipoEmpresa);
		return template;

	}

	private EmpresaModel empresaUpDent() {

		EmpresaModel upDent = templateEmpresa();
		upDent.setCnpj(CNPJ_UP_DENT);

		/** Nome foi cadastrado com espaco antes e depois */
		upDent.setNomeEmpresa("ZAX, COMERCIO, SERVICOS E EMPREENDIMENTOS LTDA - ME");
		upDent.setNomeFantasia("ZAX EMPREENDIMENTOS");

		/** Obtido do site de homologacao, tabela DE PARA */
		// upDent.setCodigoEmpresa("20306488000197");
		upDent.setCodigoEmpresa(CODIGO_EMPRESA_WBC_UPDENT);

		EnderecoModel endereco = new EnderecoModel();
		endereco.setCep("12227660");
		endereco.setDescricao("rua uiriamiris, 61");
		endereco.setBairro("jardim uira");
		endereco.setCidade("SAO JOSE DOS CAMPOS");
		endereco.setUf("SP");
		endereco.setSiglaPais("BR");

		upDent.setEndereco(endereco);

		return upDent;
	}

	private EmpresaModel empresaDeTesteNova() {
		EmpresaModel teste = templateEmpresa();

		/** Obtido no site http://www.geradordecnpj.org/ */
		teste.setCnpj("02069476000104");
		teste.setNomeEmpresa("TESTE Alexandre e Jefferson");
		teste.setNomeFantasia("Teste");
		// teste.setCodigoEmpresa("009001");
		teste.setEmailContato("teste@teste.com.br");
		teste.setCodigoEmpresa("02069476000104");
		
		EnderecoModel endereco = new EnderecoModel();
		endereco.setCep("09700000");
		endereco.setDescricao("rua teste, 99");
		endereco.setBairro("assuncao");
		endereco.setCidade("São Bernardo do Campo");
		endereco.setUf("SP");
		endereco.setSiglaPais("BR");
		
		teste.setEndereco(endereco);
		teste.setEmailContato("teste@ignorar.com.br");

		return teste;
	}

	/**
	 * @Test public void RetornarEmpresaCompradoraPorNome() {
	 *       fail(FALHA_NAO_DESENVOLVIDO); }
	 */

	/**
	 * @Test public void RetornarEmpresaCotacao() {
	 *       fail(FALHA_NAO_DESENVOLVIDO); }
	 */

	/**
	 * @Test public void RetornarEmpresaParticipante() {
	 *       fail(FALHA_NAO_DESENVOLVIDO); }
	 */

	/**
	 * @Test public void RetornarEmpresaSemDePara() {
	 *       fail(FALHA_NAO_DESENVOLVIDO); }
	 */
}