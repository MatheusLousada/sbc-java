package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.c7706.C7706Bean;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoDeRegularidadeDoFGTS;
import br.gov.sp.saobernardo.webservice.classes.utils.Conversores;
import br.gov.sp.saobernardo.webservice.classes.utils.DataAtual;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

/**
 * @author 41476
 * @deprecated ‪18/abr./2022 Usar novo DePara com generics
 * 
 */
@Deprecated
public class DeParaDadosCertidaoDeRegularidadeDeFGTS {

	private Map<String, String> mapa;
	@SuppressWarnings("unused")
	private ArquivoDeLog log;

	public DeParaDadosCertidaoDeRegularidadeDeFGTS(ArquivoDeLog log)  {
		mapa = new HashMap<String, String>();
		mapa.put("DATA8", "dataDeValidade");

		this.log = log;
	}

	public void populaDados(CertidaoDeRegularidadeDoFGTS de, C7706Bean para)  {
		try {
			Class<? extends C7706Bean> classeC7706Bean = para.getClass();
			Conversores conversores = new Conversores(null);
			DataAtual dataAtual = new DataAtual();
			for (Map.Entry<String, String> entry : mapa.entrySet()) {
				Class<? extends CertidaoDeRegularidadeDoFGTS> classe = de.getClass();
				Field campo = classe.getDeclaredField(entry.getValue());
				campo.setAccessible(true);

				Field campoC7706Bean = classeC7706Bean.getDeclaredField(entry.getKey());
				campoC7706Bean.setAccessible(true);
				Object valorDe = campo.get(de);
				Object valorPara = campoC7706Bean.get(para);
				if (valorDe != null && !valorPara.equals(valorDe)
						&& (dataAtual.before(conversores.stringParaCalendar((String) valorDe))
								|| dataAtual.equals(conversores.stringParaCalendar((String) valorDe)))) {
					campoC7706Bean.set(para, valorDe);

					//log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
				}
			}
		} catch (IllegalArgumentException e) {
			throw new DeParaDadosException(e);
		} catch (IllegalAccessException e) {
			throw new DeParaDadosException(e);
		} catch (SecurityException e) {
			throw new DeParaDadosException(e);
		} catch (NoSuchFieldException e) {
			throw new DeParaDadosException(e);
		}

	}
}
