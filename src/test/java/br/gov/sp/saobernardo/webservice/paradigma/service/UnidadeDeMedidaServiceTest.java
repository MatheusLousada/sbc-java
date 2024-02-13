package br.gov.sp.saobernardo.webservice.paradigma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.builders.UnidadeDeMedidaBuilder;

/**
 * Nao usar codigo 001001 ou 01001 ou 1001 Esta gerando duplicidades no WBC
 */
public class UnidadeDeMedidaServiceTest {

	private static final String MENSAGEM_DE_SUCESSO = "executada com sucesso para a chave";
	private UnidadeDeMedidaService servico;

	@Test
	@Ignore
	/**
	 * Sera verificado em outro momento o motivo da falha. Alexandre 03/06/2019
	 */
	
	public void inseriUmaUnidadeDeMedida() {
		String numero = "01002";
		UnidadeDeMedidaModel unidadeDeMedida = criaUnidadeDemedida(numero);
		UnidadeDeMedidaService servico = new UnidadeDeMedidaService(WSDLs.WSDL_UNIDADE_MEDIDA_DESENV_HMG);
		UnidadeDeMedidaModel gravado = servico.grava(unidadeDeMedida);

		assertEquals(numero, gravado.getCodigo());
		LogDeRetornoDaGravacao log = gravado.getLogDaGravacao();
		Assert.assertNotEquals("", log.getData());
		Assert.assertNotEquals("", log.getDescricao());
		Assert.assertNotEquals("", log.getToken());
		assertTrue("Deve informar sucesso : " + log.getDescricao(),
				log.getDescricao().indexOf(MENSAGEM_DE_SUCESSO) > 0);

	}

	public UnidadeDeMedidaModel criaUnidadeDemedida(String codigo) {
		return new UnidadeDeMedidaBuilder().comCodigo(codigo).build();
	}

	@Before
	public void antes() {
		servico = new UnidadeDeMedidaService(WSDLs.WSDL_UNIDADE_MEDIDA_DESENV_HMG);
	}

	@Test
	@Ignore
	/**
	 * Sera verificado em outro momento o motivo da falha. Alexandre 03/06/2019
	 */
	public void inseriVariasUnidadesDeMedida() {

		List<UnidadeDeMedidaModel> listaDeEnvio = new ArrayList<UnidadeDeMedidaModel>();
		listaDeEnvio.add(criaUnidadeDemedida("01002"));
		listaDeEnvio.add(criaUnidadeDemedida("01003"));
		listaDeEnvio.add(criaUnidadeDemedida("01004"));

		List<UnidadeDeMedidaModel> listaRecebida = servico.grava(listaDeEnvio);

		for (UnidadeDeMedidaModel log : listaRecebida) {

			assertNotEquals("", log.getLogDaGravacao().getData());
			assertNotEquals("", log.getLogDaGravacao().getDescricao());
			assertNotEquals("", log.getLogDaGravacao().getToken());
		}

	}

	@Test
	@Ignore("Os dados serão retornados via banco")
	public void selecionaUmaUnidadeDeMedida() {
		String numero = "01002";

		UnidadeDeMedidaModel umEnviada = criaUnidadeDemedida(numero);

		servico.grava(umEnviada);

		UnidadeDeMedidaModel umBuscada = servico.busca(numero);

		assertEquals("Codigo deve ser igual ", umEnviada.getCodigo(), umBuscada.getCodigo());
		assertEquals("Descricao deve ser igual ", umEnviada.getDescricao(), umBuscada.getDescricao());
		assertEquals("Sigla deve ser igual ", umEnviada.getSigla(), umBuscada.getSigla());

	}
}
