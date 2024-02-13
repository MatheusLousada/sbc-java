package br.gov.sp.saobernardo.webservice.classes.utils;

import java.text.Normalizer;

public class Normalizador {

	public static String removerAcentos(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\P{Print}",
				"");
	}
}
