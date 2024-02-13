package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDiretaLoteDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaLoteModel;

public class CompraDiretaLoteConversor implements DePara<CompraDiretaLoteModel, CompraDiretaLoteDTO> {

	@Override
	public CompraDiretaLoteModel converteParaModel(CompraDiretaLoteDTO dto) {
		CompraDiretaLoteModel lote = new CompraDiretaLoteModel();
		lote.setValorReferencia(dto.getDVlReferencia());
		lote.setCodiogLoteSequencial(dto.getNCdLoteSequencial());
		// lote.setNStLote(lotez.getNStLote() );
		lote.setCodigoLoteLegado(dto.getSCdLoteLegado());
		lote.setDescricaoLote(dto.getSDsLote());
		return lote;
	}

	@Override
	public CompraDiretaLoteDTO converteParaDTO(CompraDiretaLoteModel model) {
		CompraDiretaLoteDTO lote = new CompraDiretaLoteDTO();
		lote.setDVlReferencia(model.getValorReferencia());
		lote.setNCdLoteSequencial(model.getCodiogLoteSequencial());
		lote.setNStLote(model.getSituacaoLote());
		lote.setSCdLoteLegado(model.getCodigoLoteLegado());
		lote.setSDsLote(model.getDescricaoLote());
		return lote;
	}

}
