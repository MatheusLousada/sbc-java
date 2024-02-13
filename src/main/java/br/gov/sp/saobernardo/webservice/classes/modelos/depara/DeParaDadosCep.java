package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.c7702.C7702Bean;
import br.gov.sp.saobernardo.orcom.c7708.C7708Bean;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosCep {

	private Map<String, String> mapa;
	private ArquivoDeLog log;

	public DeParaDadosCep(ArquivoDeLog log) {
		mapa = new HashMap<String, String>();
		mapa.put("CEPLOG", "cep");
		//mapa.put("TIPOLOG", "tipoEndereco");
		mapa.put("NOMELOG", "descricao");
		mapa.put("BAIRROLOG", "bairro");
		mapa.put("CIDLOG", "cidade");
		mapa.put("UFLOG", "uf");

		this.log = log;
	}

	public void populaDados(EnderecoModel de, C7708Bean para) throws IllegalAccessException, NoSuchFieldException {
		Class<? extends C7708Bean> classeC7708Bean = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends EnderecoModel> classeEmpresaModel = de.getClass();
			Field campoEmpresaModel = classeEmpresaModel.getDeclaredField(entry.getValue());
			campoEmpresaModel.setAccessible(true);

			Field campoC7708Bean = classeC7708Bean.getDeclaredField(entry.getKey());
			campoC7708Bean.setAccessible(true);
			Object valorDe = campoEmpresaModel.get(de);
			Object valorPara = campoC7708Bean.get(para);
			if (valorDe != null && !valorPara.equals(valorDe)) {
				campoC7708Bean.set(para, valorDe);
				log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
			}
		}
	}

	public void populaDados(EnderecoModel de, C7702Bean para) throws NoSuchFieldException, IllegalAccessException {
		Class<? extends C7702Bean> classeC7708Bean = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends EnderecoModel> classeEmpresaModel = de.getClass();
			Field campoEmpresaModel = classeEmpresaModel.getDeclaredField(entry.getValue());
			campoEmpresaModel.setAccessible(true);

			Field campoC7708Bean = classeC7708Bean.getDeclaredField(entry.getKey());
			campoC7708Bean.setAccessible(true);
			Object valorDe = campoEmpresaModel.get(de);
			Object valorPara = campoC7708Bean.get(para);
			if (valorDe != null && !valorPara.equals(valorDe)) {
				campoC7708Bean.set(para, valorDe);
				// log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
			}
		}
	}
}
