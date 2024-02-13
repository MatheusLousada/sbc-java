package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosBanco {

	private Map<String, String> mapa;
	private ArquivoDeLog log;

	public DeParaDadosBanco(ArquivoDeLog log) throws SecurityException, IOException {
		mapa = new HashMap<String, String>();
		mapa.put("COD_BCO", "codigoDobanco");
		mapa.put("COD_BCO_WS", "codigoDobanco");
		this.log = log;
	}

	public void populaDados(BancoModel de, CFORXBean para)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		try {
			Class<? extends CFORXBean> classeCFORXBEAN = para.getClass();

			for (Map.Entry<String, String> entry : mapa.entrySet()) {
				Class<? extends BancoModel> classe = de.getClass();
				Field campo = classe.getDeclaredField(entry.getValue());
				campo.setAccessible(true);

				Field campoCFORXBEAN = classeCFORXBEAN.getDeclaredField(entry.getKey());
				log.adiciona("Analisando campo '" + entry.getKey() + "'...");
				campoCFORXBEAN.setAccessible(true);
				Object valorDe = campo.get(de);
				Object valorPara = campoCFORXBEAN.get(para);
				if (valorDe != null && !valorPara.equals(valorDe)) {
					campoCFORXBEAN.set(para, valorDe);

					log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
				} /*else {
					log.adiciona(
							"Campo:" + campoCFORXBEAN.getName() + ". Valor nao sera alterado no ORCOM: "
									+ (valorDe == null ? "valorDe NULO. Necessario corrigir no SECOM primeiro "
											: (valorPara.equals(valorDe)
													? "De e Para tem o mesmo valor '" + valorPara + "'"
													: "investigar o motivo")));
				}*/
			}
		} catch (NullPointerException e) {
			log.erro("Os dados bancários estão nulos!");
			throw e;
		}
	}
}
