package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoItemParticipanteDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoItemParticipanteModel;

public class CotacaoItemParticipanteConversor
		implements DePara<CotacaoItemParticipanteModel, CotacaoItemParticipanteDTO> {

	@Override
	public CotacaoItemParticipanteModel converteParaModel(CotacaoItemParticipanteDTO dto) {
		CotacaoItemParticipanteModel participante = new CotacaoItemParticipanteModel();

		participante.setCodigoItem((int) dto.getNCdItem());
		participante.setCodigoEmpresa(dto.getSCdEmpresa());

		return participante;
	}

	@Override
	public CotacaoItemParticipanteDTO converteParaDTO(CotacaoItemParticipanteModel itemParticipante) {
		CotacaoItemParticipanteDTO dto = new CotacaoItemParticipanteDTO();
		dto.setBFlHomologado(itemParticipante.getHomologado());
		dto.setNCdItem(itemParticipante.getCodigoItem());

		dto.setSCdEmpresa(itemParticipante.getCodigoEmpresa());
		return dto;
	}

}
