package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoItemEnderecoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoItemParticipanteDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoItemTaxaDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemEnderecoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemParticipanteDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemTaxaDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemEnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemParticipanteModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemTaxaModel;

public class CotacaoItemConversor implements DePara<CotacaoItemModel, CotacaoItemDTO> {

	private CotacaoItemEnderecoConversor convItemEnd;
	private CotacaoItemParticipanteConversor convIPart;
	private CotacaoItemTaxaConversor convTx;

	public CotacaoItemConversor() {
		convItemEnd = new CotacaoItemEnderecoConversor();
		convIPart = new CotacaoItemParticipanteConversor();
		convTx = new CotacaoItemTaxaConversor();
	}

	@Override
	public CotacaoItemModel converteParaModel(CotacaoItemDTO dto) {
		CotacaoItemModel item = new CotacaoItemModel();

		item.setCodigoItemEmpresa(dto.getSCdItemEmpresa());
		item.setCodigoCotacaoWBC(dto.getSCdCotacao().getValue());
		item.setCodigoClasse(dto.getSCdClasse());
		item.setDescricaoItem(dto.getSDsItem());
		item.setCodigoUnidadeMedida(dto.getSCdUnidadeMedida());
		item.setQuantidadeItem(dto.getDQtItem());
		item.setJustificativa(dto.getSDsJustificativa());
		item.setCodigoCondicaoPagamento(dto.getSCdCondicaoPagamento());
		item.setCodigoProdutoERP(dto.getSCdProduto());
		item.setCodigoMarca(dto.getSCdMarca().getValue());
		item.setObservacao(dto.getSDsObservacao().getValue());
		item.setValorReferencia(dto.getDVlReferencia());
		item.setCodigoItemWbcPai(dto.getSCdItemWbcPai().getValue());
		item.setCodigoItemWbc(dto.getSCdItemWbc().getValue());

		List<CotacaoItemEnderecoModel> cotacaoItemEnderecos = new ArrayList<CotacaoItemEnderecoModel>();
		for (CotacaoItemEnderecoDTO e : dto.getLstCotacaoItemEnderecoDTO().getCotacaoItemEnderecoDTO()) {
			cotacaoItemEnderecos.add(convItemEnd.converteParaModel(e));
		}
		item.setCotacaoItemEndereco(cotacaoItemEnderecos);

		List<CotacaoItemParticipanteModel> participantes = new ArrayList<CotacaoItemParticipanteModel>();
		for (CotacaoItemParticipanteDTO p : dto.getLstCotacaoItemParticipanteDTO().getCotacaoItemParticipanteDTO()) {
			participantes.add(convIPart.converteParaModel(p));
		}
		item.setCotacaoItemParticipante(participantes);

		List<CotacaoItemTaxaModel> taxas = new ArrayList<CotacaoItemTaxaModel>();
		for (CotacaoItemTaxaDTO tx : dto.getLstCotacaoItemTaxaDTO().getCotacaoItemTaxaDTO()) {
			taxas.add(convTx.converteParaModel(tx));
		}
		item.setCotacaoItemTaxa(taxas);

		return item;
	}

	@Override
	public CotacaoItemDTO converteParaDTO(CotacaoItemModel item) {
		CotacaoItemDTO dto = new CotacaoItemDTO();

		dto.setSCdProduto(item.getCodigoProdutoERP());

		dto.setSCdItemEmpresa(item.getCodigoItemEmpresa());
		dto.setSCdClasse(item.getCodigoClasse());
		dto.setSDsItem(item.getDescricaoItem());
		dto.setSCdUnidadeMedida(item.getCodigoUnidadeMedida());
		dto.setDQtItem(item.getQuantidadeItem());
		dto.setBFlCalculaReferencia(item.getReferenciaCalculada());
		dto.setSDsJustificativa(item.getJustificativa());
		dto.setNCdAplicacao(item.getCodigoAplicacao());
		dto.setSCdCondicaoPagamento(item.getCodigoCondicaoPagamento());
		dto.setNCdSituacao(item.getCodigoSituacao());

		ArrayOfCotacaoItemEnderecoDTO cotacaoItemEndereco1 = new ArrayOfCotacaoItemEnderecoDTO();
		for (CotacaoItemEnderecoModel cie : item.getCotacaoItemEndereco()) {
			cotacaoItemEndereco1.getCotacaoItemEnderecoDTO().add(convItemEnd.converteParaDTO(cie));
		}
		dto.setLstCotacaoItemEnderecoDTO(cotacaoItemEndereco1);

		ArrayOfCotacaoItemParticipanteDTO cotacaoItemParticipante1 = new ArrayOfCotacaoItemParticipanteDTO();
		for (CotacaoItemParticipanteModel cotacaoItemParticipante : item.getCotacaoItemParticipante()) {
			cotacaoItemParticipante1.getCotacaoItemParticipanteDTO()
					.add(convIPart.converteParaDTO(cotacaoItemParticipante));
		}
		dto.setLstCotacaoItemParticipanteDTO(cotacaoItemParticipante1);
		CotacaoItemTaxaConversor convItTx = new CotacaoItemTaxaConversor();
		ArrayOfCotacaoItemTaxaDTO cotacaoItemTaxa1 = new ArrayOfCotacaoItemTaxaDTO();
		for (CotacaoItemTaxaModel tx : item.getCotacaoItemTaxa()) {
			cotacaoItemTaxa1.getCotacaoItemTaxaDTO().add(convItTx.converteParaDTO(tx));
		}
		dto.setLstCotacaoItemTaxaDTO(cotacaoItemTaxa1);

		return dto;
	}
}
