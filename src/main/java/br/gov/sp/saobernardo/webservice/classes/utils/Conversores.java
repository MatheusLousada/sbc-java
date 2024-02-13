package br.gov.sp.saobernardo.webservice.classes.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.joda.time.DateTime;

public class Conversores {
	private static final Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());

	private QName serviceName;

	public Conversores(QName serviceName) {
		this.serviceName = serviceName;
	}

	@SuppressWarnings("unchecked")
	public <T> JAXBElement<T> converteParaJAXBElement(T convertivel) {
		if (null == convertivel) {
			return null;
		} else {
			return new JAXBElement<T>(serviceName, (Class<T>) convertivel.getClass(), null, convertivel);
		}
	}

	/**
	 * @param data
	 *            = data no formato yyyymmaa
	 * @throws DatatypeConfigurationException
	 */
	public XMLGregorianCalendar converteParaXMLGregorianCalendar(long data) {

		XMLGregorianCalendar retorno = null;
		try {
			retorno = DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime().toGregorianCalendar());
			String data1 = Long.toString(data);
			String ano = data1.substring(0, 4);
			String mes = data1.replace(ano, "").substring(0, 2);
			String dia = data1.replace(ano, "").replace(mes, "");

			retorno.setDay(Integer.parseInt(dia));
			retorno.setMonth(Integer.valueOf(mes));
			retorno.setYear(Integer.valueOf(ano));
		} catch (DatatypeConfigurationException e) {
			System.console().writer().println("Erro convertendo data : " + data);
			logger.log(Level.SEVERE, e.getMessage(), e);
		}

		return retorno;
	}

	public Long converteParaLong(XMLGregorianCalendar calendar) {
		Long data = null;

		int dia = calendar.getDay();
		int mes = calendar.getMonth();
		int ano = calendar.getYear();
		try {
			String dataConvertida = String.format("%s%s%s", ano, mes, dia);
			data = Long.parseLong(dataConvertida);
		} catch (IllegalArgumentException e) {
			System.console().writer().println(String.format("Erro convertendo data : %s/%s/%s", dia, mes, ano));
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		return data;

	}

	public XMLGregorianCalendar stringParaXMLGregorianCalendar(String tDtLance) {
		try {
			Calendar data = Calendar.getInstance();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parse = df.parse(tDtLance);
			data.setTime(parse);

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(data.getTimeInMillis());
			try {
				return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Calendar stringParaCalendar(String dataOriginal) {
		if( dataOriginal == null || dataOriginal.isEmpty() ) {
			return null;
		}
		try {
			Calendar data = Calendar.getInstance();
			DateFormat df = new SimpleDateFormat("ddMMyyyy");
			Date parse = df.parse(dataOriginal);
			data.setTime(parse);

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(data.getTimeInMillis());
			return calendar;

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String converteDataParaModeloDoOrcom(XMLGregorianCalendar data, String formato) {

		int dia = data.getDay();
		int mes = data.getMonth();
		int ano = data.getYear();
		StringBuilder novaData = new StringBuilder();

		if (formato.startsWith("dd") && formato.endsWith("yyyy")) {

			if (dia < 10) {
				novaData.append("0");
			}
			novaData.append(dia);

			if (mes < 10) {
				novaData.append("0");
			}
			novaData.append(mes);
			novaData.append(ano);
		} else if (formato.endsWith("yyyy") && formato.endsWith("dd")) {
			novaData.append(ano);

			if (mes < 10) {
				novaData.append("0");
			}
			novaData.append(mes);

			if (dia < 10) {
				novaData.append("0");
			}
			novaData.append(dia);
		}

		
		
		return novaData.toString();
	}

	public XMLGregorianCalendar adicionaRemoveDias(XMLGregorianCalendar data, int dias) {
		try {
			GregorianCalendar calendar = data.toGregorianCalendar();
			calendar.add(Calendar.DAY_OF_MONTH, dias);
			data = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return data;
	}
}
