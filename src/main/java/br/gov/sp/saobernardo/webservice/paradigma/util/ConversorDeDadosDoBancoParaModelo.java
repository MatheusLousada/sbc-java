package br.gov.sp.saobernardo.webservice.paradigma.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;

public class ConversorDeDadosDoBancoParaModelo {

	public static <T> void converte(Object modelo, ResultSet rs) throws Exception {
		Field[] fields = modelo.getClass().getDeclaredFields();

		for (Field field : fields) {

			TratamentoDeString ts = new TratamentoDeString();

			final String nomeCampo = ts.capitalize(field.getName());
			final String nomeDoMetodo = new StringBuilder("set").append(nomeCampo).toString();
			final Method metodo = modelo.getClass().getDeclaredMethod(nomeDoMetodo, field.getType());
			final String tipoCampo = field.getType().toString();
 
			if (tipoCampo.endsWith("BigDecimal")) {
				metodo.invoke(modelo, rs.getBigDecimal(nomeCampo));
				continue;
			}

			if (tipoCampo.endsWith("Integer")) {
				metodo.invoke(modelo, rs.getInt(nomeCampo));
				continue;
			}

			if (tipoCampo.endsWith("Long")) {
				metodo.invoke(modelo, rs.getLong(nomeCampo));
				continue;
			}

			if (tipoCampo.endsWith("Double")) {
				metodo.invoke(modelo, rs.getDouble(nomeCampo));
				continue;
			}

			if (tipoCampo.endsWith("String")) {
				metodo.invoke(modelo, rs.getString(nomeCampo));
				continue;
			}

			if (tipoCampo.endsWith("int")) {
				metodo.invoke(modelo, rs.getInt(nomeCampo));
			} else {
				throw new Exception(String.format("Incluir modelo de dado do tipo: [%s]   Campo nao mapeado =>[%s]", field.getType().toString(), nomeCampo));
			}

		}
	}


}
