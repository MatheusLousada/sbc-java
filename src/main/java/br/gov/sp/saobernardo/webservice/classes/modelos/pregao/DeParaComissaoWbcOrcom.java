package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

import java.util.HashMap;
import java.util.Map;

public class DeParaComissaoWbcOrcom {
	
	private static final int CODIGO_APOIO_WBC = 1;
	private static final int CODIGO_APOIO_ORCOM = 4;
	
	private static final int CODIGO_PREGOEIRO_WBC = 2;
	private static final int CODIGO_PREGOEIRO_ORCOM = 3;
	
	private static final int CODIGO_AUTORIDADE_WBC = 4;
	private static final int CODIGO_AUTORIDADE_ORCOM = 8;
	
	private Map<Integer, Integer> mapa;
	
	public DeParaComissaoWbcOrcom() {
		mapa = new HashMap<Integer, Integer>();
		mapa.put(CODIGO_APOIO_WBC, CODIGO_APOIO_ORCOM);
		mapa.put(CODIGO_PREGOEIRO_WBC, CODIGO_PREGOEIRO_ORCOM);
		mapa.put(CODIGO_AUTORIDADE_WBC, CODIGO_AUTORIDADE_ORCOM);
	}
	
	public Integer getCodigoOrcom(Integer codigoWbc) {
		return mapa.get(codigoWbc) != null ? mapa.get(codigoWbc) : 0; 
	}

}
