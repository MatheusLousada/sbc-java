package br.gov.sp.saobernardo.webservice.paradigma.connections;

import java.sql.Connection;

public class ConnectionORCOMFaculdadeHomologacao implements BaseConexao {
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@rac-prod-scan:1521/ORCOM_SVC";

	// Database credentials
	private static final String USER = "ORCOM_APP_BATCH";
	private static final String PASS = "O3TgStP72sj";
	Connection con = null;
	
	public String getDriver() { return JDBC_DRIVER; }
	public String getUrl() { return DB_URL; }
	public String getUser() { return USER; }
	public String getPass() { return PASS; }

}
