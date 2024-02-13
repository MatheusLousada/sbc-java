package br.gov.sp.saobernardo.webservice.classes.utils;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.ParadigmaIntegracaoException;

/**
 * Validadores
 */
public class Validadores {

	public static final int CNPJ_SIZE = 14;

	/**
	 * Ajusta uma string para um tamanho maximo
	 * 
	 * @throws ParadigmaIntegracaoException
	 */
	public String maxLen(String valor, int maximo) {
		String retorno = null;
		if (valor != null) {
			if (valor.length() > maximo) {
				valor = valor.substring(0, maximo);
//				String msg = "Valor " + valor + " ultrapassa o comprimento permitido de " + maximo;
//				throw new ParadigmaIntegracaoException(msg);
			}
			retorno = valor.toUpperCase();
		}
		return retorno;
	}

	public int valoresValidos(int valor, List<Integer> listaValida) {

		if (listaValida.contains(valor)) {
			return valor;
		}
		throw new ParadigmaIntegracaoException("Valor invalido " + valor);
	}

	public int inRange(int valor, int min, int max) {
		if (valor >= min && valor <= max) {
			return valor;
		}
		throw new ParadigmaIntegracaoException("Valor fora da faixa permitida " + min + ".." + max + " => " + valor);
	}

	public String valorNaoPodeSer(String valor, String[] naoPodeSer) {
		for (String string : naoPodeSer) {
			if (string.equals(valor)) {
				return null;
			}
		}
		return valor;
	}

}
