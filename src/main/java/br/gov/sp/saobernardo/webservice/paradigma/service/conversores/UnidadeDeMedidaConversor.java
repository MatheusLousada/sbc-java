package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.unidademedida.UnidadeMedidaDTO;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;

public class UnidadeDeMedidaConversor
		implements DePara<UnidadeDeMedidaModel, UnidadeMedidaDTO>, DeParaLog<UnidadeDeMedidaModel, WbtLogDTO> {

	@Override
	public UnidadeDeMedidaModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		UnidadeDeMedidaModel unidadeDeMedidaRetornada = new UnidadeDeMedidaModel();
		unidadeDeMedidaRetornada.setCodigo(wbtLogDTO.getSCdOrigem().getValue());
		LogDeRetornoDaGravacao logDaGravacao = new LogDeRetornoDaGravacao();
		logDaGravacao.setData(wbtLogDTO.getTDtLog().toString());
		logDaGravacao.setToken(wbtLogDTO.getSNrToken().getValue());
		logDaGravacao.setDescricao(wbtLogDTO.getSDsLog().getValue());
		unidadeDeMedidaRetornada.setLogDaGravacao(logDaGravacao);
		return unidadeDeMedidaRetornada;
	}

	@Override
	public UnidadeDeMedidaModel converteParaModel(UnidadeMedidaDTO dto) {
		UnidadeDeMedidaModel unidadeMedida = new UnidadeDeMedidaModel();
		unidadeMedida.setCodigo(dto.getSCdUnidadeMedida());
		unidadeMedida.setDescricao(dto.getSDsUnidadeMedida());
		unidadeMedida.setSigla(dto.getSSgUnidadeMedida());
		return unidadeMedida;
	}

	@Override
	public UnidadeMedidaDTO converteParaDTO(UnidadeDeMedidaModel model) {
		UnidadeMedidaDTO dto = new UnidadeMedidaDTO();
		dto.setSCdUnidadeMedida(model.getCodigo());
		dto.setSDsUnidadeMedida(model.getDescricao());
		dto.setSSgUnidadeMedida(model.getSigla());
		return dto;
	}

}
