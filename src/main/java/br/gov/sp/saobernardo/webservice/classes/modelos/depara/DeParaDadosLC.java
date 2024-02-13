package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.webservice.classes.modelos.MicroOuPequenoPorte;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosLC {

	private Map<String, String> mapa;
	//private ArquivoDeLog log;

	public DeParaDadosLC(ArquivoDeLog log) {
		mapa = new HashMap<String, String>();
		mapa.put("ME_EPP", "tipo");

		//this.log = log;
	}

	public void populaDados(MicroOuPequenoPorte de, CFORXBean para)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<? extends CFORXBean> classeCFORXBEAN = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends MicroOuPequenoPorte> classeEmpresaModel = de.getClass();
			Field campoEmpresaModel = classeEmpresaModel.getDeclaredField(entry.getValue());
			campoEmpresaModel.setAccessible(true);

			Field campoCFORXBEAN = classeCFORXBEAN.getDeclaredField(entry.getKey());
			campoCFORXBEAN.setAccessible(true);
			Object valorDe = campoEmpresaModel.get(de);
			Object valorPara = campoCFORXBEAN.get(para);
			if (valorDe != null && !valorPara.equals(valorDe)) {
				campoCFORXBEAN.set(para, valorDe);
				//log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
			}
		}
	}

}
