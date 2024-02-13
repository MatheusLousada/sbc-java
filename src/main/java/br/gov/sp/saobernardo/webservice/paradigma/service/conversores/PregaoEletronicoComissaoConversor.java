package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ComissaoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoComissaoModel;

public class PregaoEletronicoComissaoConversor implements DePara<PregaoEletronicoComissaoModel, ComissaoDTO> {

	@Override
	public PregaoEletronicoComissaoModel converteParaModel(ComissaoDTO dto) {
		PregaoEletronicoComissaoModel comissao = new PregaoEletronicoComissaoModel();
		comissao.setCodigoPerfil(dto.getNIdPerfil());
		comissao.setCodigoUsuario(dto.getSCdUsuario());
		return comissao;
	}

	@Override
	public ComissaoDTO converteParaDTO(PregaoEletronicoComissaoModel model) {
		ComissaoDTO dto = new ComissaoDTO();
		dto.setNIdPerfil(model.getCodigoPerfil());
		dto.setSCdUsuario(model.getCodigoUsuario());
		return dto;
	}

}
