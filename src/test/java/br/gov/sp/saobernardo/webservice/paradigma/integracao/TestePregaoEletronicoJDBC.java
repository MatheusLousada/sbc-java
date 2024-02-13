package br.gov.sp.saobernardo.webservice.paradigma.integracao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.paradigma.connections.Conexao;
import br.gov.sp.saobernardo.webservice.paradigma.connections.ConnectionParadigmaProducao;
import br.gov.sp.saobernardo.webservice.paradigma.dao.PregaoEletronicoDAO;

public class TestePregaoEletronicoJDBC {

	public static void main(String[] args) throws Exception {

		Conexao connection = new ConnectionParadigmaProducao();
		Connection con = connection.conecta();
		try {
			if (con != null) {
				PregaoEletronicoDAO pregao = new PregaoEletronicoDAO(con, false);
				List<PregaoEletronicoModel> pregoes = pregao.selecionaPregaoPorProcessoComEdital("PE 193/2017",
						"00453/2017 - PE 193");
				for (PregaoEletronicoModel pem : pregoes) {
					System.out.println(pem.getNumeroProcessoDisplay());
					System.out.println(pem.getNumeroEdital());
					System.out.println(pem.getCodigoSituacao());

					System.out.println("\tItens:");

					for (PregaoEletronicoItemModel peim : pem.getLstPregaoEletronicoItem()) {
						int situacao = peim.getSituacaoPregao().getCodigo();
						if (situacao == 7 || situacao == 12) {
							System.out.println("\tgetCodigoClasse: " + peim.getCodigoClasse());
							System.out.println("\tgetCodigoItemLegado: " + peim.getCodigoItemLegado());
							System.out.println("\tgetCodigoItemSequencial: " + peim.getCodigoItemSequencial());
							System.out.println("\tgetCodigoLoteLegado: " + peim.getCodigoLoteLegado());
							System.out.println("\tgetCodigoProduto: " + peim.getCodigoProduto());
							System.out.println("\tgetCodigoUnidadeMedida: " + peim.getCodigoUnidadeMedida());
							System.out.println("\tgetDescricaoItem: " + peim.getDescricaoItem());
							System.out.println("\tgetSituacaoItem: " + peim.getSituacaoItem());
							System.out.println("\tgetQuantidadeItem: " + peim.getQuantidadeItem());
							System.out.println("\tgetValorReferencia: " + peim.getValorReferencia());
							System.out.println("\tgetSituacao: " + peim.getSituacaoPregao().getCodigo() + " - "
									+ peim.getSituacaoPregao().getDescricao());

							System.out.println("\t\tLances: ");

							peim.setLances(pegaUltimoLanceDeCadaFornecedor(peim.getLances()));

							for (PregaoEletronicoItemLanceModel peilm : peim.getLances()) {
								System.out.println("\t\tgetBeneficiarioLei123: " + peilm.getBeneficiarioLei123());
								System.out.println("\t\tgetCodigoEmpresa: " + peilm.getCodigoEmpresa());
								System.out.println("\t\tgetNumeroRanking: " + peilm.getNumeroRanking());
								System.out.println("\t\tgetVencedor: " + peilm.getVencedor());
								System.out.println("\t\tgetDataLance: " + peilm.getDataLance());
								System.out.println("\t\tgetValorLance: " + peilm.getValorLance());
								System.out.println("\t\tgetMarca: " + peilm.getProposta().getMarca());
								System.out.println(
										"\t\tgetNumeroDoRegistro: " + peilm.getProposta().getNumeroDoRegistro());
								System.out.println("\t\tgetJustificativa: " + peilm.getJustificativa());
								System.out.println("\t\tisLanceValido: " + peilm.isLanceValido());
								System.out.println("");
							}

							System.out.println("");
						}

					}

					System.out.println("\n\tComissao:");
					for (PregaoEletronicoComissaoModel comissao : pem.getLstPregaoEletronicoComissao()) {
						System.out.println("\t" + comissao.getCodigoUsuario() + " - " + comissao.getCodigoPerfil());
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection.fecha()) {
				System.out.println("fechado com sucesso");
			}
		}
	}

	private static List<PregaoEletronicoItemLanceModel> pegaUltimoLanceDeCadaFornecedor(
			List<PregaoEletronicoItemLanceModel> listaDeLancesOriginais) {
		List<PregaoEletronicoItemLanceModel> novaListaDeLances = new ArrayList<PregaoEletronicoItemLanceModel>();

		for (PregaoEletronicoItemLanceModel peilm : listaDeLancesOriginais) {
			if (novaListaDeLances.size() > 0) {

				int posicao = -1;

				for (int i = 0; i < novaListaDeLances.size(); i++) {

					if (novaListaDeLances.get(i).getCodigoEmpresa().equals(peilm.getCodigoEmpresa())) {
						posicao = i;
						break;
					}
				}

				if (posicao >= 0) {
					novaListaDeLances.remove(novaListaDeLances.get(posicao));
					novaListaDeLances.add(peilm);
				} else {
					novaListaDeLances.add(peilm);
				}

			} else {
				novaListaDeLances.add(peilm);
			}
		}
		return novaListaDeLances;
	}
}
