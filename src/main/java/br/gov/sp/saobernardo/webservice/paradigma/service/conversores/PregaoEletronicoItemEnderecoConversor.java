package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.PregaoEletronicoItemEnderecoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemEnderecoModel;

public class PregaoEletronicoItemEnderecoConversor implements DePara<PregaoEletronicoItemEnderecoModel , PregaoEletronicoItemEnderecoDTO> {

	@Override
	public PregaoEletronicoItemEnderecoModel converteParaModel(PregaoEletronicoItemEnderecoDTO dto) {
		PregaoEletronicoItemEnderecoModel endereco = new PregaoEletronicoItemEnderecoModel();
		endereco.setCodigoEmpresaCobrancaEndereco(dto.getSCdEmpresaCobrancaEndereco());
		endereco.setCodigoEmpresaEntregaEndereco(dto.getSCdEmpresaEntregaEndereco());
		endereco.setCodigoEmpresaFaturamentoEndereco(dto.getSCdEmpresaFaturamentoEndereco());
		endereco.setQuantidadeItem(dto.getDQtItem());
		return endereco;
	}

	@Override
	public PregaoEletronicoItemEnderecoDTO converteParaDTO(PregaoEletronicoItemEnderecoModel model) {
		PregaoEletronicoItemEnderecoDTO dto = new PregaoEletronicoItemEnderecoDTO();
		dto.setDQtItem(model.getQuantidadeItem());
		dto.setSCdEmpresaCobrancaEndereco(model.getCodigoEmpresaCobrancaEndereco());
		dto.setSCdEmpresaEntregaEndereco(model.getCodigoEmpresaEntregaEndereco());
		dto.setSCdEmpresaFaturamentoEndereco(model.getCodigoEmpresaFaturamentoEndereco());
		return dto;
	}

}
