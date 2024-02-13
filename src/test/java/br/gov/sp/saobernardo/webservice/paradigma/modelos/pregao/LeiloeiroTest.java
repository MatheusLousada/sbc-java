package br.gov.sp.saobernardo.webservice.paradigma.modelos.pregao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.Leiloeiro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;

public class LeiloeiroTest {

	private Leiloeiro sujeito;
	private List<PregaoEletronicoItemLanceModel> listaDeLancesOriginais;

	@Before
	public void before() {
		sujeito = new Leiloeiro();

		listaDeLancesOriginais = new ArrayList<PregaoEletronicoItemLanceModel>();

		listaDeLancesOriginais.addAll(Arrays.asList(criaLance("SILVANIA MARIA DURANTE", new BigDecimal(1900), true, false),
				criaLance("SILVANIA MARIA DURANTE", new BigDecimal(1200.0), true, false),
				criaLance("SILVANIA MARIA DURANTE", new BigDecimal(1195.0), true, false),
				criaLance("SILVANIA MARIA DURANTE", new BigDecimal(1190.0), true, true),
				criaLance("SILVANIA MARIA DURANTE", new BigDecimal(499.0), false, false),
				criaLance("MUTE LABEN COMERCIAL LTDA EPP", new BigDecimal(320.0), false, false),
				criaLance("DECATTI ABC COMERCIAL LTDA ME", new BigDecimal(315.0), false, false),
				criaLance("DECATTI ABC COMERCIAL LTDA ME", new BigDecimal(310.0), false, false),
				criaLance("MUTE LABEN COMERCIAL LTDA EPP", new BigDecimal(310.0), false, false),
				criaLance("DECATTI ABC COMERCIAL LTDA ME", new BigDecimal(329.0), false, false),
				criaLance("MUTE LABEN COMERCIAL LTDA EPP", new BigDecimal(309.0), false, false)

		));
	}

	@Test
	public void deveTrazerOsMenoresLancesDeCadaFornecedor() throws Exception {
		List<PregaoEletronicoItemLanceModel> menoresLancesValidos = sujeito.obtemMenoresLances(listaDeLancesOriginais);

		assertEquals(new BigDecimal(1190), menoresLancesValidos.get(0).getValorLance());
		assertEquals(new BigDecimal(310), menoresLancesValidos.get(1).getValorLance());
		assertEquals(new BigDecimal(309), menoresLancesValidos.get(2).getValorLance());
	}

	private PregaoEletronicoItemLanceModel criaLance(String codigoEmpresa, BigDecimal valor, boolean lanceValido,
			boolean vencedor) {
		PregaoEletronicoItemLanceModel lance = new PregaoEletronicoItemLanceModel();
		lance.setCodigoEmpresa(codigoEmpresa);
		lance.setValorLance(valor);
		lance.setLanceValido(lanceValido);
		lance.setVencedor(vencedor == false ? 0 : 1);
		return lance;
	}

	@Test
	public void deveHaverLanceVencedor() {
		List<PregaoEletronicoItemLanceModel> menoresLancesValidos = sujeito.obtemMenoresLances(listaDeLancesOriginais);
		boolean teveVencedor = false;

		for (PregaoEletronicoItemLanceModel lance : menoresLancesValidos) {
			if (lance.getVencedor() == PregaoEletronicoItemLanceModel.LANCE_VENCEDOR) {
				teveVencedor = true;
			}
		}

		assertTrue(teveVencedor);
	}

	@Test
	public void deveAceitarCasosEmQueNaoHajaLanceVencedor() {
		listaDeLancesOriginais.removeAll(listaDeLancesOriginais);

		listaDeLancesOriginais.addAll(Arrays.asList(criaLance("NACIONAL COMERCIAL HOSPITALAR LTDA", new BigDecimal(0.86), false, false),
				criaLance("CBS MEDICO CIENTIFICA S/A", new BigDecimal(1.05), false, false),
				criaLance("NACIONAL COMERCIAL HOSPITALAR LTDA", new BigDecimal(1.30), false, false),
				criaLance("PONTO MEDICO INSTRUMENTOS PARA MEDICINA LTDA EPP", new BigDecimal(2.14), false, false),
				criaLance("PONTO MEDICO INSTRUMENTOS PARA MEDICINA LTDA EPP", new BigDecimal(2.5), false, false),
				criaLance("GILMAR CHIZZOLINI ME", new BigDecimal(10.0), false, false)

		));

		List<PregaoEletronicoItemLanceModel> menoresLancesValidos = sujeito.obtemMenoresLances(listaDeLancesOriginais);

		assertEquals(new BigDecimal(10), menoresLancesValidos.get(0).getValorLance());
		assertEquals(new BigDecimal(2.14), menoresLancesValidos.get(1).getValorLance());
		assertEquals(new BigDecimal(1.05), menoresLancesValidos.get(2).getValorLance());
		assertEquals(new BigDecimal(0.86), menoresLancesValidos.get(3).getValorLance());
	}

}
