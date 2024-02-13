package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoItemLanceDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;

public class PregaoEletronicoItemLanceConversor
		implements DePara<PregaoEletronicoItemLanceModel, PregaoEletronicoItemLanceDTO> {

	@Override
	public PregaoEletronicoItemLanceModel converteParaModel(PregaoEletronicoItemLanceDTO dto) {
		PregaoEletronicoItemLanceModel lance = new PregaoEletronicoItemLanceModel();
		lance.setBeneficiarioLei123(dto.getBFlBeneficiarioLei123());
		lance.setCodigoEmpresa(dto.getSCdEmpresa());
		lance.setDataLance(dto.getTDtLance());
		lance.setNumeroRanking(dto.getNNrRanking());
		lance.setValorLance(dto.getDVlLance());
		lance.setVencedor(dto.getBFlVencedor());
		return lance;
	}

	@Override
	public PregaoEletronicoItemLanceDTO converteParaDTO(PregaoEletronicoItemLanceModel model) {
		PregaoEletronicoItemLanceDTO dto = new PregaoEletronicoItemLanceDTO();
		dto.setBFlBeneficiarioLei123(model.getBeneficiarioLei123());
		dto.setBFlVencedor(model.getVencedor());
		dto.setDVlLance(model.getValorLance());
		dto.setNNrRanking(model.getNumeroRanking());
		dto.setSCdEmpresa(model.getCodigoEmpresa());
		dto.setTDtLance(model.getDataLance());
		// FIXME: Montar estes campos na modelagem
		// dto.setSDsMarca(lance.get);
		// dto.setSDsModelo(lance.get);
		return dto;
	}

}
