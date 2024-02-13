package br.gov.sp.saobernardo.webservice.classes.modelos;

import br.gov.sp.saobernardo.webservice.classes.modelos.telefone.NumeroComDdd;
import br.gov.sp.saobernardo.webservice.classes.modelos.telefone.NumeroComDddDuplicado;
import br.gov.sp.saobernardo.webservice.classes.modelos.telefone.NumeroSemDdd;

public class FaxFactory {

	private NumeroTelefonico fax;

	public FaxFactory(String numeroCompleto) {

		if (null != numeroCompleto) {
			String numericos = removeNaoNumericos(numeroCompleto);

			if (numericos.length() == 7 || numericos.length() == 8) {
				fax = new NumeroSemDdd(numericos);
			} else if (numericos.length() == 9 || numericos.length() == 10 || numericos.length() == 11
					|| numericos.length() > 13) {
				fax = new NumeroComDdd(numericos);
			} else if (numericos.length() == 12 || numericos.length() == 13) {
				fax = new NumeroComDddDuplicado(numericos);
			}

		}
	}

	private String removeNaoNumericos(String numeroCompleto) {
		return numeroCompleto.replaceFirst("^0+(?!$)", "").replaceAll("[^\\d]", "");
	}

	public NumeroTelefonico getFax() {
		return fax;
	}

}
