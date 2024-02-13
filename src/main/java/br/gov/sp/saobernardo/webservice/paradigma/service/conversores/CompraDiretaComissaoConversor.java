package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.compradireta.ComissaoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;

public class CompraDiretaComissaoConversor implements DePara<CompraDiretaComissaoModel, ComissaoDTO> {

	@Override
	public CompraDiretaComissaoModel converteParaModel(ComissaoDTO dto) {
		return null;
	}

	@Override
	public ComissaoDTO converteParaDTO(CompraDiretaComissaoModel model) {
		ComissaoDTO dtoc = new ComissaoDTO();
		dtoc.setNIdPerfil(model.getPerfil());
		dtoc.setSCdUsuario(model.getCodigoUsuario());
		return dtoc;
	}

}
