package br.gov.sp.saobernardo.webservice.paradigma.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import br.gov.sp.saobernardo.webservice.classes.modelos.LogDeRetornoDaGravacao;

public class Servicos<T> {

	@SuppressWarnings("unused")
	private Class<T> class1;

	public Servicos(Class<T> class1) {
		this.class1 = class1;
	}

	@SuppressWarnings("unchecked")
	public LogDeRetornoDaGravacao converteParaLogRetornoGravacaoModel(T wbtLogDTO)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Method method1;
		Method method2;
		Method method3;

		LogDeRetornoDaGravacao log;

		log = new LogDeRetornoDaGravacao();
		method1 = wbtLogDTO.getClass().getDeclaredMethod("getTDtLog");
		method2 = wbtLogDTO.getClass().getDeclaredMethod("getSNrToken");
		method3 = wbtLogDTO.getClass().getDeclaredMethod("getSDsLog");

		XMLGregorianCalendar d = (XMLGregorianCalendar) method1.invoke(wbtLogDTO);
		log.setData(d.toString());
		
		Object t = method2.invoke(wbtLogDTO);
		log.setToken((String) ((JAXBElement<String>) t).getValue());
		
		Object s = method3.invoke(wbtLogDTO);
		log.setDescricao((String)  ((JAXBElement<String>) s).getValue());
		return log;
	}
}
