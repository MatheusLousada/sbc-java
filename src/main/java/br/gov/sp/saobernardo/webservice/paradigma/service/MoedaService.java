package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.moeda.ArrayOfMoedaDTO;
import br.gov.sp.saobernardo.paradigma.ws.moeda.IMoeda;
import br.gov.sp.saobernardo.paradigma.ws.moeda.Moeda;
import br.gov.sp.saobernardo.paradigma.ws.moeda.MoedaDTO;
import br.gov.sp.saobernardo.paradigma.ws.moeda.RetornoDTO;
import br.gov.sp.saobernardo.paradigma.ws.moeda.WbtLogDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.CotacaoMoedaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;

public class MoedaService implements ServiceGrava<CotacaoMoedaModel> {

	private IMoeda servico;
	private QName serviceName;

	public MoedaService(WSDLs wsdls) {
		try {
			URL wsdlURL = new URL(wsdls.getValue());
			ServicesName nomeServico = ServicesName.MOEDA;
			serviceName = new QName(nomeServico.getUrl(), nomeServico.getServico());
			Moeda ss = new Moeda(wsdlURL, serviceName);
			servico = ss.getBasicHttpBindingIMoeda();
		} catch (Exception e) {
			System.console().writer().println(e);
		}
	}

	@Override
	public CotacaoMoedaModel grava(CotacaoMoedaModel moeda) {
		MoedaDTO dto = converteParaMoedaDTO(moeda);
		CotacaoMoedaModel moedaGravada = new CotacaoMoedaModel();

		ArrayOfMoedaDTO lstMoeda = new ArrayOfMoedaDTO();
		lstMoeda.getMoedaDTO().add(dto);
		RetornoDTO retorno = servico.processarMoeda(lstMoeda);
		List<WbtLogDTO> logs = retorno.getLstWbtLogDTO().getWbtLogDTO();

		for (WbtLogDTO log : logs) {
			moedaGravada.setsCdMoeda(log.getSCdOrigem().getValue());
			moedaGravada.setLogDaGravacao(converteParaMoedaModel(log));
		}
		return moedaGravada;
	}

	private MoedaDTO converteParaMoedaDTO(CotacaoMoedaModel moeda) {
		MoedaDTO dto = new MoedaDTO();
		dto.setSCdMoeda(moeda.getCodigoMoeda());
		dto.setSDsMoeda(moeda.getDescricaoMoeda());
		dto.setSSgMoeda(moeda.getSiglaMoeda());
		return dto;
	}

	private LogDeRetornoDaGravacao converteParaMoedaModel(WbtLogDTO wbtLogDTO) {
		LogDeRetornoDaGravacao logDaGravacao = new LogDeRetornoDaGravacao();
		logDaGravacao.setData(wbtLogDTO.getTDtLog().toString());
		logDaGravacao.setToken(wbtLogDTO.getSNrToken().getValue());
		logDaGravacao.setDescricao(wbtLogDTO.getSDsLog().getValue());
		return logDaGravacao;
	}

	/** "Este metodo nao devera ser usado" 
	 *@deprecated 
	 * */
	@Override
	@Deprecated
	public List<CotacaoMoedaModel> grava(List<CotacaoMoedaModel> moedas) {
		List<CotacaoMoedaModel> retorno = new ArrayList<CotacaoMoedaModel>();
		for (CotacaoMoedaModel moeda : moedas) {
			this.grava(moeda);
		}
		return retorno;
	}
}
