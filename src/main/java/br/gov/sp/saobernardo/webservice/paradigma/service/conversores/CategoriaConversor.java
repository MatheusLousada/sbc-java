package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.categoria.CategoriaDTO;
import br.gov.sp.saobernardo.paradigma.ws.categoria.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;
import br.gov.sp.saobernardo.webservice.paradigma.service.Servicos;

public class CategoriaConversor implements DePara<CategoriaModel, CategoriaDTO>, DeParaLog<CategoriaModel, WbtLogDTO> {

	@Override
	public CategoriaModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		CategoriaModel categoria = new CategoriaModel();
		Servicos<WbtLogDTO> servicos = new Servicos<WbtLogDTO>(WbtLogDTO.class);
		try {
			categoria.setLogDaGravacao(servicos.converteParaLogRetornoGravacaoModel(wbtLogDTO));
		} catch (Exception e) {
			e.printStackTrace();
			LogDeRetornoDaGravacao logDaGravacao = new LogDeRetornoDaGravacao();
			logDaGravacao.setDescricao("Erro convertendo Categoria" + e.getMessage());
			categoria.setLogDaGravacao(logDaGravacao);
		}
		return categoria;
	}

	@Override
	public CategoriaModel converteParaModel(CategoriaDTO dto) {
		CategoriaModel cat = new CategoriaModel();
		cat.setCodigo(dto.getSCdClasse());
		cat.setDescricao(dto.getSDsClasse());
		cat.setCodigoPai(dto.getSCdClassePai());
		return cat;
	}

	@Override
	public CategoriaDTO converteParaDTO(CategoriaModel categoria) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setSCdClasse(categoria.getCodigo());
		dto.setSCdClassePai(categoria.getCodigoPai());
		dto.setSDsClasse(categoria.getDescricao());
		return dto;
	}

}
