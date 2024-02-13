package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.webservice.classes.modelos.OcupacaoModel;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosOcupacao {

	private Map<String, String> mapa;
	//private ArquivoDeLog log;

	public DeParaDadosOcupacao(ArquivoDeLog log)  {
		mapa = new HashMap<String, String>();
		mapa.put("OCUPACAO1", "descricao");
		//this.log = log;
	}

	public void populaDados(OcupacaoModel de, CFORXBean para)
			throws Exception {
		Class<? extends CFORXBean> classeCFORXBEAN = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends OcupacaoModel> classe = de.getClass();
			Field campo = classe.getDeclaredField(entry.getValue());
			campo.setAccessible(true);

			Field campoCFORXBEAN = classeCFORXBEAN.getDeclaredField(entry.getKey());
			campoCFORXBEAN.setAccessible(true);
			Object valorDe = campo.get(de);
			Object valorPara = campoCFORXBEAN.get(para);
			if (valorDe != null && !valorPara.equals(valorDe)) {
				campoCFORXBEAN.set(para, valorDe);
//				log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
			}
		}
	}
}
