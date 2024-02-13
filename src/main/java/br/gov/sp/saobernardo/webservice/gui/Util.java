package br.gov.sp.saobernardo.webservice.gui;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
	
	/** @deprecated */
	@Deprecated
	private Util(){
		/** @deprecated */
	}
	public static String parseText(Object obj, String text) {
		if (text == null) {
			return obj.toString();
		}

		String[] variables = extractVariables(text);
		if (variables == null) {
			return obj.toString();
		}
		Method meth = null;
		Object retobj = null;
		String methName = null;
		for (int i = 0; i < variables.length; i++) {
			try {
				methName = "get" + variables[i].substring(0, 1).toUpperCase() + variables[i].substring(1);
				meth = obj.getClass().getMethod(methName, new Class[0]);
				retobj = meth.invoke(obj, new Object[0]);
			} catch (Exception e) {
				e.printStackTrace();
			}
			text = text.replaceFirst("[$]" + variables[i], retobj.toString());
		}

		return text;
	}

	private static String[] extractVariables(String text) {
		ArrayList<String> list = new ArrayList<String>();
		Matcher matcher = Pattern.compile("[$][a-zA-Z0-9]+").matcher(text);
		while (matcher.find()) {
			String contents = matcher.group();
			list.add(contents.substring(1));
		}
		String[] variables = new String[list.size()];
		list.toArray(variables);
		return variables;
	}
}
