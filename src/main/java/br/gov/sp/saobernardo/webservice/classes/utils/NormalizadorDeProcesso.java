package br.gov.sp.saobernardo.webservice.classes.utils;

public class NormalizadorDeProcesso {

	public String normalizaAnoDeProcesso(String processo, String ano) {

		String caractereDivisao = obtemCaractereDeDivisao(processo);

		String[] split = processo.split(caractereDivisao);
		processo = split[0];

		StringBuilder sb = new StringBuilder();
		sb.append(processo);
		sb.append(caractereDivisao);
		sb.append(ano);
		return sb.toString();

	}

	private String obtemCaractereDeDivisao(String processo) {
		String caractereDivisao = "/";

		if (processo.contains("-")) {
			caractereDivisao = "-";
		}
		return caractereDivisao;
	}

	public boolean isProcessoComAno(String processo) {
		try {
			String caractereDivisao = obtemCaractereDeDivisao(processo);
			String[] split = processo.split(caractereDivisao);
			return split[1].matches("\\d{4}$");
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

}
