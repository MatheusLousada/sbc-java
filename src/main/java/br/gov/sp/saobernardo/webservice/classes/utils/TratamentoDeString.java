package br.gov.sp.saobernardo.webservice.classes.utils;

import java.text.Normalizer;

import org.apache.commons.lang3.StringUtils;

public class TratamentoDeString {

	public String removeNaoNumericos(String s) {
		return s.replaceAll("[^\\d]", "");
	}

	public String removeZerosAEsquerda(String s) {
		return s.replaceFirst("^0+(?!$)", "");
	}
	
	public String completaComZerosAEsquerda(String palavra, int tamanho) {
		return StringUtils.leftPad(palavra, tamanho, "0");
	}
	
	public boolean isSomenteNumeros(String palavra) {
		return palavra.matches("[0-9]+");
	}
	
	public String preparaStringParaANVISA(String palavra, int tamanhoString) {
		if(isSomenteNumeros(palavra)) {
			return palavra;
		} else {
			String apenasNumericos = removeNaoNumericos(palavra);
			return completaComZerosAEsquerda(apenasNumericos, tamanhoString);
		}
	}
	
	/**
	 * @param text
	 * @return text com a primeira letra em Maiusculas
	 */
	public String capitalize( String text ) {
		String primeiraLetra = new StringBuilder(text.substring(0, 1)).toString().toUpperCase();
		StringBuilder s2 = new StringBuilder(primeiraLetra).append(text.substring(1));
		return s2.toString();

	}
	
	/** remove acentos
	 * @see <a href="https://pt.stackoverflow.com/questions/42/como-remover-acentos-e-outros-sinais-gr%C3%A1ficos-de-uma-string-em-java">resposta</a>
	 * @param str
	 * @return
	 */
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
}
