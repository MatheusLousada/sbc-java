package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemTaxaDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemTaxaModel;

public class CotacaoItemTaxaConversor implements DePara<CotacaoItemTaxaModel, CotacaoItemTaxaDTO> {

	@Override
	public CotacaoItemTaxaModel converteParaModel(CotacaoItemTaxaDTO dto) {
		CotacaoItemTaxaModel taxa = new CotacaoItemTaxaModel();
		taxa.setCodigoItem(dto.getNCdItem());
		taxa.setCodigoTaxaWBC(dto.getNCdTaxa());
		taxa.setTaxaInclusa(dto.getBFlIncluso());
		return taxa;
	}

	@Override
	public CotacaoItemTaxaDTO converteParaDTO(CotacaoItemTaxaModel taxa) {
		CotacaoItemTaxaDTO dto = new CotacaoItemTaxaDTO();
		dto.setBFlIncluso(taxa.getTaxaInclusa());
		dto.setNCdItem((long) taxa.getCodigoItem());
		dto.setNCdTaxa(taxa.getCodigoTaxaWBC());
		return dto;
	}

}
