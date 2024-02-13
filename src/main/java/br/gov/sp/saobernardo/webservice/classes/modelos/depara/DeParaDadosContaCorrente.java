package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteModel;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosContaCorrente {

	private Map<String, String> mapa;
	public DeParaDadosContaCorrente(ArquivoDeLog log) throws SecurityException, IOException {
		mapa = new HashMap<String, String>();
		mapa.put("TIPO_CONTA", "tipo");
		mapa.put("CTA_ALFA", "numero");
		mapa.put("DIGITOCT", "digito");
	}

	public void populaDados(ContaCorrenteModel de, CFORXBean para)
			throws IllegalAccessException, NoSuchFieldException {
		Class<? extends CFORXBean> classeCFORXBEAN = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends ContaCorrenteModel> classe = de.getClass();
			
			Field campo = classe.getDeclaredField(entry.getValue());
			campo.setAccessible(true);

			Field campoCFORXBEAN = classeCFORXBEAN.getDeclaredField(entry.getKey());
			campoCFORXBEAN.setAccessible(true);
			Object valorDe = campo.get(de);
			Object valorPara = campoCFORXBEAN.get(para);
			if (valorDe != null && !valorPara.equals(valorDe)) {
				campoCFORXBEAN.set(para, valorDe);
				//log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
			}

		}
	}

}
