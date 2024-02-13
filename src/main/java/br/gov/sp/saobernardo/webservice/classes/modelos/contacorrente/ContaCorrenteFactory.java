package br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente;

import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;

public class ContaCorrenteFactory {

	public ContaCorrenteModel fabricaConta(BancoModel banco, String numeroDaConta, String digito) {

		TratamentoDeString trataString = new TratamentoDeString();

		String somenteNumericos = trataString.removeZerosAEsquerda(trataString.removeNaoNumericos(numeroDaConta));

		if (banco.getCodigoDobanco().equals("033") || banco.getCodigoDobanco().equals("104")
				|| banco.getCodigoDobanco().equals("389")) {
			if (numeroDaConta.length() > 2) {
				String tipo = numeroDaConta.substring(0, 2);
				String numero = numeroDaConta.substring(2);
				return new ContaCorrenteComTipo(tipo, trataString.completaComZerosAEsquerda(numero, 6), digito);
			} else {
				return null;
			}
		} else if (banco.getCodigoDobanco().equals("341") || banco.getCodigoDobanco().equals("399")) {
			return new ContaCorrenteSemTipo(trataString.completaComZerosAEsquerda(somenteNumericos, 5), digito);
		}

		else if (banco.getCodigoDobanco().equals("001") || banco.getCodigoDobanco().equals("151")
				|| banco.getCodigoDobanco().equals("291") || banco.getCodigoDobanco().equals("380")
				|| banco.getCodigoDobanco().equals("409")) {
			return new ContaCorrenteSemTipo(trataString.completaComZerosAEsquerda(somenteNumericos, 6), digito);
		}

		else if (banco.getCodigoDobanco().equals("237") || banco.getCodigoDobanco().equals("353")
				|| banco.getCodigoDobanco().equals("356")) {
			return new ContaCorrenteSemTipo(trataString.completaComZerosAEsquerda(somenteNumericos, 7), digito);
		}

		else if (banco.getCodigoDobanco().equals("745")) {
			return new ContaCorrenteSemTipo(trataString.completaComZerosAEsquerda(somenteNumericos, 8), digito);
		}

		else if (banco.getCodigoDobanco().equals("347")) {
			return new ContaCorrenteSemTipo(trataString.completaComZerosAEsquerda(somenteNumericos, 9), digito);
		}

		else {
			return new ContaCorrenteSemTipo(somenteNumericos, digito);
		}

	}

}
