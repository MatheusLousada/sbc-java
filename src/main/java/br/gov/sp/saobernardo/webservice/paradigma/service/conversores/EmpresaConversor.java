package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import br.gov.sp.saobernardo.paradigma.ws.empresa.EmpresaDTO;
import br.gov.sp.saobernardo.paradigma.ws.empresa.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.SituacaoEmpresa;
import br.gov.sp.saobernardo.webservice.classes.modelos.TipoEmpresa;
import br.gov.sp.saobernardo.webservice.paradigma.service.Servicos;

public class EmpresaConversor implements DePara<EmpresaModel, EmpresaDTO>, DeParaLog<EmpresaModel, WbtLogDTO> {

	@Override
	public EmpresaModel converteLogParaModel(WbtLogDTO wbtLogDTO) {
		EmpresaModel empresa = new EmpresaModel();
		Servicos<WbtLogDTO> serv = new Servicos<WbtLogDTO>(WbtLogDTO.class);
		try {
			empresa.setLogDaGravacao(serv.converteParaLogRetornoGravacaoModel(wbtLogDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empresa;
	}

	@Override
	public EmpresaModel converteParaModel(EmpresaDTO dto) {
		EmpresaModel empresa = new EmpresaModel();

		empresa.setCodigoEmpresa(dto.getSCdEmpresa());
		empresa.setCnpj(dto.getSNrCnpj());
		empresa.setNomeEmpresa(dto.getSNmEmpresa());
		empresa.setNomeFantasia(dto.getSNmFantasia());

		EnderecoModel endereco = new EnderecoModel();
		endereco.setBairro(dto.getSNmBairro());
		endereco.setCep(dto.getSDsCep());
		endereco.setDescricao(dto.getSDsEndereco());
		endereco.setBairro(dto.getSNmBairro());
		endereco.setCidade(dto.getSNmCidade());
		endereco.setUf(dto.getSSgEstado());
		endereco.setSiglaPais(dto.getSSgPais());

		empresa.setEndereco(endereco);
		empresa.setSituacao(new SituacaoEmpresa(dto.getNCdSituacao()));
		empresa.setTipoEmpresa(new TipoEmpresa(dto.getNCdTipo()));

		return empresa;
	}

	@Override
	public EmpresaDTO converteParaDTO(EmpresaModel model) {
		EmpresaDTO dto = new EmpresaDTO();
		dto.setSNmBairro(model.getEndereco().getBairro());
		dto.setSDsCep(model.getEndereco().getCep());
		dto.setSCdEmpresa(model.getCodigoEmpresa());
		dto.setSNrCnpj(model.getCnpj());
		dto.setSNmEmpresa(model.getNomeEmpresa());
		dto.setSNmFantasia(model.getNomeFantasia());
		dto.setSDsEndereco(model.getEndereco().getDescricao());
		dto.setSNmBairro(model.getEndereco().getBairro());
		dto.setSNmCidade(model.getEndereco().getCidade());
		dto.setSSgEstado(model.getEndereco().getUf());

		dto.setSSgPais(model.getEndereco().getSiglaPais());

		dto.setNCdSituacao(model.getSituacao().getSituacaoEmpresa());
		dto.setNCdTipo(model.getTipoEmpresa().getTipo());
		return dto;
	}

}
