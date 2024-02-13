package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.unidademedida.ArrayOfUnidadeMedidaDTO;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.IUnidadeMedida;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.RetornoDTO;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.UnidadeMedida;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.UnidadeMedidaDTO;
import br.gov.sp.saobernardo.paradigma.ws.unidademedida.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.conversores.UnidadeDeMedidaConversor;

public class UnidadeDeMedidaService implements ServiceGrava<UnidadeDeMedidaModel> {

	private IUnidadeMedida servico;
	private UnidadeDeMedidaConversor dePara;

	public UnidadeDeMedidaService(WSDLs wsdls) {
		dePara = new UnidadeDeMedidaConversor();
		try {
			URL wsdlURL = new URL(wsdls.getValue());
			QName serviceName = new QName(ServicesName.UNIDADE_MEDIDA.getUrl(),
					ServicesName.UNIDADE_MEDIDA.getServico());
			UnidadeMedida ss = new UnidadeMedida(wsdlURL, serviceName);
			servico = ss.getBasicHttpBindingIUnidadeMedida();
		} catch (Exception e) {
			System.console().writer().println(e);
		}
	}

	@Override
	public List<UnidadeDeMedidaModel> grava(List<UnidadeDeMedidaModel> unidadesDeMedida) {

		ArrayOfUnidadeMedidaDTO dadosParaEnvio = new ArrayOfUnidadeMedidaDTO();
		for (UnidadeDeMedidaModel unidadeDeMedida : unidadesDeMedida) {
			dadosParaEnvio.getUnidadeMedidaDTO().add(dePara.converteParaDTO(unidadeDeMedida));
		}

		RetornoDTO retorno = servico.processarUnidadeMedida(dadosParaEnvio);
		List<UnidadeDeMedidaModel> listaDeRetorno = new ArrayList<UnidadeDeMedidaModel>();
		for (WbtLogDTO wbtLogDTO : retorno.getLstWbtLogDTO().getWbtLogDTO()) {
			listaDeRetorno.add(dePara.converteLogParaModel(wbtLogDTO));
		}

		return listaDeRetorno;
	}

	@Override
	public UnidadeDeMedidaModel grava(UnidadeDeMedidaModel unidadeDeMedida) {
		ArrayOfUnidadeMedidaDTO dadosParaEnvio = converteParaListaUnidadeDeMedidaModel(unidadeDeMedida);
		RetornoDTO retorno = servico.processarUnidadeMedida(dadosParaEnvio);
		WbtLogDTO wbtLogDTO = retorno.getLstWbtLogDTO().getWbtLogDTO().get(0);
		dePara.converteLogParaModel(wbtLogDTO);
		UnidadeDeMedidaModel unidadeRetorno = dePara.converteLogParaModel(wbtLogDTO);
		unidadeRetorno.setCodigo(unidadeDeMedida.getCodigo());
		return unidadeRetorno;
	}

	public UnidadeDeMedidaModel busca(String codigoDaUnidadeDeMedida) {
		UnidadeMedidaDTO unidadeMedidaDTO = servico.retornarUnidadeMedida(codigoDaUnidadeDeMedida);
		UnidadeDeMedidaModel unidadeDeMedida = new UnidadeDeMedidaModel();
		unidadeDeMedida.setCodigo(unidadeMedidaDTO.getSCdUnidadeMedida());
		unidadeDeMedida.setDescricao(unidadeMedidaDTO.getSDsUnidadeMedida());
		unidadeDeMedida.setSigla(unidadeMedidaDTO.getSSgUnidadeMedida());
		return unidadeDeMedida;
	}

	private ArrayOfUnidadeMedidaDTO converteParaListaUnidadeDeMedidaModel(UnidadeDeMedidaModel unidadeDeMedida) {
		ArrayOfUnidadeMedidaDTO dadosParaEnvio = new ArrayOfUnidadeMedidaDTO();
		UnidadeMedidaDTO unidadeDeMedidaDTO = dePara.converteParaDTO(unidadeDeMedida);
		dadosParaEnvio.getUnidadeMedidaDTO().add(unidadeDeMedidaDTO);
		return dadosParaEnvio;
	}
}
