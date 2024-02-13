package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfConfirmacaoNegociacaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.ConfirmacaoNegociacaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.Cotacao;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoDTO;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.ICotacao;
import br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.ConfirmacaoNegociacaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.paradigma.service.conversores.CotacaoConversor;

/**
 * Este web service pode, como sugestão, ser executado depois do(s) web
 * service(s) de:
 * 
 * • Envio de empresa
 * 
 * • Envio de unidade de medida
 * 
 * • Envio de categoria de produto
 * 
 * • Envio de produto
 * 
 * • Envio de usuário
 * 
 * • Envio de condição de pagamento
 * 
 */
public class CotacaoService implements ServiceGrava<CotacaoModel> {
	private static final String METODO_NAO_IMPLEMENTADO = "Metodo ainda nao implementado : ";
	public static final int NUMERO_SEQUENCIAL = 1;
	private static final Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());
	private ICotacao servico;
	private QName serviceName;

	private CotacaoConversor convCot;

	public CotacaoService(WSDLs wsdls) {
		try {
			URL wsdlURL = new URL(wsdls.getValue());
			ServicesName nomeServico = ServicesName.COTACAO;
			serviceName = new QName(nomeServico.getUrl(), nomeServico.getServico(), "pref");
			Cotacao ss = new Cotacao(wsdlURL, serviceName);
			servico = ss.getBasicHttpBindingICotacao();

			convCot = new CotacaoConversor();

		} catch (Exception ex) {
			logger.log(Level.SEVERE, ex.toString(), ex);
			System.console().writer().println(ex.getStackTrace());
		}
	}

	public CotacaoModel habilitarRetornarCotacao(ConfirmacaoNegociacaoModel confirmacaoNegociacaoModel) {

		ConfirmacaoNegociacaoDTO xx = new ConfirmacaoNegociacaoDTO();
		xx.setNIdTipoProcesso(confirmacaoNegociacaoModel.getIdTipoProcesso());
		xx.setSCdProcessoWbc(confirmacaoNegociacaoModel.getCodigoProcessoWbc());

		ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO = new ArrayOfConfirmacaoNegociacaoDTO();
		lstConfirmacaoNegociacaoDTO.getConfirmacaoNegociacaoDTO().add(xx);
		RetornoDTO retorno = servico.habilitarRetornarCotacao(lstConfirmacaoNegociacaoDTO);
		return convCot.converteLogParaModel(retorno.getLstWbtLogDTO().getWbtLogDTO().get(0));
	}

	public RetornoDTO habilitarRetornarCotacaoItem(CotacaoModel cotacao) {
		ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO = null;
		return servico.habilitarRetornarCotacaoItem(lstConfirmacaoNegociacaoDTO);
	}

	@Override
	public List<CotacaoModel> grava(List<CotacaoModel> cotacoes) {
		ArrayOfCotacaoDTO dtos = new ArrayOfCotacaoDTO();
		for (CotacaoModel cotacao : cotacoes) {
			dtos.getCotacaoDTO().add(convCot.converteParaDTO(cotacao));
		}
		List<CotacaoModel> ret = new ArrayList<CotacaoModel>();
		ret.add(processaCotacao(dtos));
		return ret;
	}

	@Override
	public CotacaoModel grava(CotacaoModel cotacao) {
		List<CotacaoModel> cotacoes = new ArrayList<CotacaoModel>();
		cotacoes.add(cotacao);
		return this.grava(cotacoes).get(0);
	}

	private CotacaoModel processaCotacao(ArrayOfCotacaoDTO cotacoes) {
		RetornoDTO retorno = servico.processarCotacao(cotacoes);
		return convCot.converteLogParaModel(retorno.getLstWbtLogDTO().getWbtLogDTO().get(0));
	}

	public RetornoDTO reabrirCotacao() {
		ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO = null;
		return servico.reabrirCotacao(lstConfirmacaoNegociacaoDTO);
	}

	/** Metodo de encerramento total da cotacao */
	public List<CotacaoModel> retornarCotacao() {
		ArrayList<CotacaoModel> cotacoes = new ArrayList<CotacaoModel>();
		for (CotacaoDTO dto : servico.retornarCotacao().getCotacaoDTO()) {
			cotacoes.add(convCot.converteParaModel(dto));
		}
		return cotacoes;
	}

	/** Metodo de retorno da cotacao de orcamento */
	public List<CotacaoModel> retornarCotacaoOrcamento() {
		ArrayList<CotacaoModel> cotacoes = new ArrayList<CotacaoModel>();
		for (CotacaoDTO dto : servico.retornarCotacaoOrcamento().getCotacaoDTO()) {
			cotacoes.add(convCot.converteParaModel(dto));
		}
		return cotacoes;
	}

	/**
	 * Metodo de encerramento parcial da cotacao
	 */
	public void retornarCotacaoItem() {

		throw new UnsupportedOperationException(METODO_NAO_IMPLEMENTADO + "retornarCotacaoItem");
	}

	public void retornarCotacaoComEmpresaSemDePara() {
		throw new UnsupportedOperationException(METODO_NAO_IMPLEMENTADO + "retornarCotacaoComEmpresaSemDePara");

	}

	public void reabrirCotacaoItem() {
		throw new UnsupportedOperationException(METODO_NAO_IMPLEMENTADO + "reabrirCotacaoItems");
	}

	public QName getServiceName() {
		return serviceName;
	}

}
