package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.ArrayOfCondicaoPagamentoDTO;
import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.CondicaoPagamento;
import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.ICondicaoPagamento;
import br.gov.sp.saobernardo.paradigma.ws.condicaopagamento.RetornoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.CondicaoDePagamentoModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.conversores.CondicaoDePagamentoConversor;

public class CondicaoDePagamentoService implements ServiceGrava<CondicaoDePagamentoModel> {

	ICondicaoPagamento servico;
	CondicaoDePagamentoConversor conversor;

	public CondicaoDePagamentoService(WSDLs wsdls) {
		conversor = new CondicaoDePagamentoConversor();
		try {
			URL wsdlURL = new URL(wsdls.getValue());
			QName serviceName = new QName(ServicesName.CONDICAO_DE_PAGAMENTO.getUrl(),
					ServicesName.CONDICAO_DE_PAGAMENTO.getServico());
			CondicaoPagamento ss = new CondicaoPagamento(wsdlURL, serviceName);
			servico = ss.getBasicHttpBindingICondicaoPagamento();
		} catch (Exception e) {
			System.console().writer().println(e);
		}
	}

	@Override
	public List<CondicaoDePagamentoModel> grava(List<CondicaoDePagamentoModel> lstCondicaoPagamento) {
		List<CondicaoDePagamentoModel> condicoes = new ArrayList<CondicaoDePagamentoModel>();
		for (CondicaoDePagamentoModel cond : lstCondicaoPagamento) {
			condicoes.add(this.grava(cond));
		}
		return condicoes;
	}

	@Override
	public CondicaoDePagamentoModel grava(CondicaoDePagamentoModel condicaoPagamento) {
		ArrayOfCondicaoPagamentoDTO dtos = new ArrayOfCondicaoPagamentoDTO();
		dtos.getCondicaoPagamentoDTO().add(conversor.converteParaDTO(condicaoPagamento));
		RetornoDTO processarCondicaoPagamento = servico.processarCondicaoPagamento(dtos);
		return conversor.converteLogParaModel(processarCondicaoPagamento.getLstWbtLogDTO().getWbtLogDTO().get(0));
	}

	public List<CondicaoDePagamentoModel> buscarCondicaoPagamento(String sCdCondicaoPagamentoErp) {
		List<CondicaoDePagamentoModel> lista = new ArrayList<CondicaoDePagamentoModel>();
		lista.add(conversor.converteParaModel(servico.retornarCondicaoPagamento(sCdCondicaoPagamentoErp)));
		return lista;
	}
}
