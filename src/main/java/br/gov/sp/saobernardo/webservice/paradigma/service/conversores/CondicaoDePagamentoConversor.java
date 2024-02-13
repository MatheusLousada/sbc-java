package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.CondicaoPagamentoDTO;
import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.CondicaoDePagamentoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.paradigma.service.Servicos;

public class CondicaoDePagamentoConversor implements DePara<CondicaoDePagamentoModel, CondicaoPagamentoDTO>,DeParaLog<CondicaoDePagamentoModel, WbtLogDTO> {

	@Override
	public CondicaoDePagamentoModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		CondicaoDePagamentoModel condicao = new CondicaoDePagamentoModel();
		Servicos<WbtLogDTO> servicos = new Servicos<WbtLogDTO>(WbtLogDTO.class);

		try {
			condicao.setLogDaGravacao(servicos.converteParaLogRetornoGravacaoModel(wbtLogDTO));
		} catch (Exception e) {
			e.printStackTrace();
			LogDeRetornoDaGravacao logDaGravacao = new LogDeRetornoDaGravacao();
			logDaGravacao.setDescricao("Erro na conversao : " + e.getMessage());
			condicao.setLogDaGravacao(logDaGravacao);
		}
		return condicao;

	}

	@Override
	public CondicaoDePagamentoModel converteParaModel(CondicaoPagamentoDTO dto) {
		/** List<CondicaoDePagamentoModel> lista = new
		// ArrayList<CondicaoDePagamentoModel>();
		*/

		CondicaoDePagamentoModel condicao = new CondicaoDePagamentoModel();
		condicao.setCodigoCondicaoPagamento(dto.getSCdCondicaoPagamento());
		condicao.setCodigoEmpresa(dto.getSCdEmpresa());
		condicao.setDescricaoCondicaoPagamento(dto.getSDsCondicaoPagamento());
		/** lista.add(condicao); */
		return condicao;
	}

	@Override
	public CondicaoPagamentoDTO converteParaDTO(CondicaoDePagamentoModel model) {
		CondicaoPagamentoDTO dto = new CondicaoPagamentoDTO();
		dto.setSCdCondicaoPagamento(model.getCodigoCondicaoPagamento());
		dto.setSCdEmpresa(model.getCodigoEmpresa());
		dto.setSDsCondicaoPagamento(model.getCodigoEmpresa());
		return dto;
	}

}
