package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.paradigma.ws.produtounidademedida.ProdutoUnidadeMedidaDTO;
import br.gov.sp.saobernardo.paradigma.ws.produtounidademedida.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoUnidadeMedidaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.Servicos;

public class ProdutoUnidadeMedidaConversor implements DePara<ProdutoUnidadeMedidaModel, ProdutoUnidadeMedidaDTO>,
		DeParaLog<ProdutoUnidadeMedidaModel, WbtLogDTO> {

	@Override
	public ProdutoUnidadeMedidaModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		Servicos<WbtLogDTO> serv = new Servicos<WbtLogDTO>(WbtLogDTO.class);
		ProdutoUnidadeMedidaModel p = new ProdutoUnidadeMedidaModel();
		try {
			serv.converteParaLogRetornoGravacaoModel(wbtLogDTO);
		} catch (Exception e) {
			System.out.println(e);

		}
		return p;
	}

	@Override
	public ProdutoUnidadeMedidaModel converteParaModel(ProdutoUnidadeMedidaDTO dto) {
		ProdutoUnidadeMedidaModel model = new ProdutoUnidadeMedidaModel();
		ProdutoModel p = new ProdutoModel();
		p.setCodigo(dto.getSCdProduto());
		model.setProduto(p);

		List<UnidadeDeMedidaModel> ums = new ArrayList<UnidadeDeMedidaModel>();
		UnidadeDeMedidaModel um = new UnidadeDeMedidaModel();
		um.setCodigo(dto.getSCdUnidadeMedida());
		ums.add(um);
		model.setUnidadesMedida(ums);

		return model;
	}

	@Override
	public ProdutoUnidadeMedidaDTO converteParaDTO(ProdutoUnidadeMedidaModel model) {
		ProdutoUnidadeMedidaDTO dto = new ProdutoUnidadeMedidaDTO();
		dto.setSCdProduto(model.getProduto().getCodigo());
		/** pega o primeiro que encontrar! */
		dto.setSCdUnidadeMedida(model.getUnidadesMedida().get(0).getCodigo());

		return dto;
	}

}
