package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

public class Teste {
	public static void main(String[] args) {
		String teste = "a01234c56789b";
		teste = teste.replaceAll("[^+0-9]", "");
		System.out.println(teste);
	}
}
