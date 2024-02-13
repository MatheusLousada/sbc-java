package br.gov.sp.saobernardo.webservice.paradigma.log;

import org.apache.commons.lang3.StringUtils;

public class TextFormatter {
	private int largura_linha;
	private String leftDelimiter;
	private String rightDelimiter;

	public TextFormatter(int largura, String leftDelimiter, String rightDelimiter) {
		super();
		inicio(largura, leftDelimiter, rightDelimiter);
	}

	public TextFormatter(int largura ) {
		super();
		inicio(largura, "|", "|");
	}

	public TextFormatter() {
		super();
		inicio(80, "|", "|");
	}

	private void inicio(int largura, String leftDelimiter, String rightDelimiter) {
		this.largura_linha = largura;
		this.leftDelimiter = leftDelimiter;
		this.rightDelimiter = rightDelimiter;
	}

	public String repeat(String txt) {
		return this.formatar(StringUtils.repeat(txt, largura_linha));
	}

	public String formatar(String texto) {
		return formataLinha(this.leftDelimiter, texto, this.rightDelimiter);
	}

	private String formataLinha(String leftDelimiter, String text, String rightDelimiter) {
		StringBuilder retorno = new StringBuilder();
		text = text == null ? "" : text;

		if (text.length() < largura_linha) {
			text = StringUtils.rightPad(text, largura_linha);
		}

		retorno.append(leftDelimiter).append(text.substring(0, largura_linha - 2)).append(rightDelimiter);
		return retorno.toString();
	}
}
