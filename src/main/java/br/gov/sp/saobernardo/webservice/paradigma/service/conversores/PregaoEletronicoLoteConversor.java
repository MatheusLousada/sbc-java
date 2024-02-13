package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoLoteDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoLoteModel;

public class PregaoEletronicoLoteConversor implements DePara<PregaoEletronicoLoteModel, PregaoEletronicoLoteDTO>  {

	@Override
	public PregaoEletronicoLoteModel converteParaModel(PregaoEletronicoLoteDTO dto) {
		PregaoEletronicoLoteModel lote = new PregaoEletronicoLoteModel();
		lote.setCodigoLoteLegado(dto.getSCdLoteLegado());
		lote.setCodigoLoteSequencial(dto.getNCdLoteSequencial());
		lote.setDescricaoLote(dto.getSDsLote());
		lote.setValorReferencia(dto.getDVlReferencia());
		return lote;
	}

	@Override
	public PregaoEletronicoLoteDTO converteParaDTO(PregaoEletronicoLoteModel lote) {
		PregaoEletronicoLoteDTO dto = new PregaoEletronicoLoteDTO();
		dto.setDVlReferencia(lote.getValorReferencia());
		dto.setNCdLoteSequencial(lote.getCodigoLoteSequencial());
		dto.setNStLote(lote.getSituacaoLote());
		dto.setSCdLoteLegado(lote.getCodigoLoteLegado());
		dto.setSDsLote(lote.getDescricaoLote());
		return dto;
	}
}
