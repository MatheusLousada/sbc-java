package br.gov.sp.saobernardo.webservice.paradigma.service.conversores;

import javax.xml.namespace.QName;

import br.gov.sp.saobernardo.paradigma.ws.cotacao.CotacaoMoedaDTO;
import br.gov.sp.saobernardo.webservice.classes.modelos.CotacaoMoedaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.paradigma.service.ServicesName;

public class CotacaoMoedaConversor implements DePara<CotacaoMoedaModel, CotacaoMoedaDTO> {

	private Conversores conv;

	public CotacaoMoedaConversor() {
		conv = new Conversores(new QName(ServicesName.COTACAO.getUrl(), ServicesName.COTACAO.getServico(), "pref"));
	}

	@Override
	public CotacaoMoedaModel converteParaModel(CotacaoMoedaDTO dto) {
		
		CotacaoMoedaModel moeda = new CotacaoMoedaModel();
		moeda.setsCdMoeda( dto.getSCdMoeda().getValue() );
		//moeda.setSiglaMoeda(dto.ge);
		return moeda;
	}

	@Override
	public CotacaoMoedaDTO converteParaDTO(CotacaoMoedaModel moeda) {
		CotacaoMoedaDTO dto = new CotacaoMoedaDTO();
		dto.setSCdMoeda(conv.converteParaJAXBElement(moeda.getCodigoMoeda()));

		/** Estes valores sao aleatorios 
		 * 
		 * */
		dto.setNNrCasasDecimais(2);
		dto.setNCdSituacao(1L);
		dto.setBFlAtivo(1);
		return dto;
	}

}
