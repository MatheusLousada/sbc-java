package br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms;

import java.util.EnumMap;
import java.util.Map;

public class JdbcUrl {

	private static final String DEFAULT = "default";

	private String servidor;
	private String port;
	private String sid;
	private TiposDatabase tipo;
	private Map<TiposDatabase, String> qualProtocolo;

	public JdbcUrl(String servidor, String port, String sid) {
		montaProtocolos();
		this.servidor = servidor;
		this.port = port;
		this.sid = sid;
	}

	public JdbcUrl(String servidor, String sid) {
		montaProtocolos();
		this.servidor = servidor;
		this.port = DEFAULT;
		this.sid = sid;
	}

	/**
	 * Quais os protocolos de banco conhecidos
	 */
	private void montaProtocolos() {
		qualProtocolo = new EnumMap<TiposDatabase, String>(TiposDatabase.class);
		qualProtocolo.put(TiposDatabase.ORACLE, "jdbc:oracle:thin");
		//qualProtocolo.put(TiposDatabase.MICROSOFT_SQLSERVER, "jdbc:sqlserver");
		qualProtocolo.put(TiposDatabase.MICROSOFT_SQLSERVER, "jdbc:jtds:sqlserver");
		qualProtocolo.put(TiposDatabase.MYSQL, "jdbc:mysql");
	}

	/**
	 * @return a url jdbc no formato do Oracle
	 */
	public String asOracle() {
		port = (DEFAULT.equals(port)) ? "1521" : port;
		return String.format("%s:%s%s:%s/%s", qualProtocolo.get(TiposDatabase.ORACLE), "@", servidor, port, sid);
	}

	/**
	 * @return a url jdbc no formato do MySql
	 */
	public String asMySql() {
		port = (DEFAULT.equals(port)) ? "3306" : port;
		return String.format("%s://%s:%s/%s", qualProtocolo.get(TiposDatabase.MYSQL), servidor, port, sid);
	}

	/**
	 * @return a url jdbc no formato do Microsoft Sql Server
	 */
	public String asMsSqlServer() {
		port = (DEFAULT.equals(port)) ? "1433" : port;
		return String.format("%s://%s:%s;databaseName=%s", qualProtocolo.get(TiposDatabase.MICROSOFT_SQLSERVER),
				servidor, port, sid);
	}

	public TiposDatabase getTipo() {
		return tipo;
	}

	public void setTipo(TiposDatabase tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return TiposDatabase.MICROSOFT_SQLSERVER.equals(tipo) ? asMsSqlServer() :
			   TiposDatabase.ORACLE.equals(tipo) ? asOracle() : 
			   TiposDatabase.MYSQL.equals(tipo) ? asMySql() : "";
	}

}
