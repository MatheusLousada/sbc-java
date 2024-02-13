package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDiretaItemEnderecoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemEnderecoModel;

public class CompraDiretaItemEnderecoConversor implements DePara<CompraDiretaItemEnderecoModel, CompraDiretaItemEnderecoDTO> {

	@Override
	public CompraDiretaItemEnderecoModel converteParaModel(CompraDiretaItemEnderecoDTO dto) {
		return null;
	}

	@Override
	public CompraDiretaItemEnderecoDTO converteParaDTO(CompraDiretaItemEnderecoModel model) {
		CompraDiretaItemEnderecoDTO endereco = new CompraDiretaItemEnderecoDTO();
		endereco.setDQtItem(model.getdQtItem());
		endereco.setSCdEmpresaCobrancaEndereco(model.getsCdEmpresaCobrancaEndereco());
		endereco.setSCdEmpresaEntregaEndereco(model.getsCdEmpresaEntregaEndereco());
		endereco.setSCdEmpresaFaturamentoEndereco(model.getsCdEmpresaFaturamentoEndereco());
		return endereco;
	}

}
