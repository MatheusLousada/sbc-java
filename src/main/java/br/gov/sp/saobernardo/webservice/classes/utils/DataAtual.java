package br.gov.sp.saobernardo.webservice.classes.utils;

import java.util.Calendar;

public class DataAtual {

	Calendar dataAtual;

	public DataAtual() {
		this.dataAtual = Calendar.getInstance();
	}

	public boolean before(Calendar data) {
		if (data != null) {

			if (this.dataAtual.get(Calendar.YEAR) < data.get(Calendar.YEAR)) {
				return true;
			}

			if (this.dataAtual.get(Calendar.YEAR) == data.get(Calendar.YEAR)) {
				return this.dataAtual.get(Calendar.DAY_OF_YEAR) < data.get(Calendar.DAY_OF_YEAR);
			}

		}
		return false;
	}

	public boolean after(Calendar data) {
		if (data != null) {

			if (this.dataAtual.get(Calendar.YEAR) > data.get(Calendar.YEAR)) {
				return true;
			}

			if (this.dataAtual.get(Calendar.YEAR) == data.get(Calendar.YEAR)) {
				return this.dataAtual.get(Calendar.DAY_OF_YEAR) > data.get(Calendar.DAY_OF_YEAR);
			}

		}
		return false;
	}

	public boolean equals(Calendar data) {

		if (data != null) {
			return (this.dataAtual.get(Calendar.YEAR) == data.get(Calendar.YEAR)
					&& this.dataAtual.get(Calendar.DAY_OF_YEAR) == data.get(Calendar.DAY_OF_YEAR));
		}

		return false;
	}

	public boolean between(Calendar dataInicio, Calendar dataFim) {
		if (null != dataInicio && null != dataFim) {
			return (this.equals(dataInicio) || this.after(dataInicio))
					&& (this.equals(dataFim) || this.before(dataFim));
		}
		return false;
	}

	public Calendar now() {
		return this.dataAtual;
	}

}
