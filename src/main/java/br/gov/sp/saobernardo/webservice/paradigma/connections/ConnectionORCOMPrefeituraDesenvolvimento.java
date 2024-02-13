package br.gov.sp.saobernardo.webservice.paradigma.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionORCOMPrefeituraDesenvolvimento implements Conexao {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@rac-dhpp-scan:1521/DEVORCOM_SVC";

	// Database credentials
	static final String USER = "ORCOM_APP_BATCH";
	static final String PASS = "T1S54qqMk1";
	Connection con = null;
	private Logger log = Logger.getAnonymousLogger();

	@Override
	public Connection conecta() throws Exception {

		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			return con;
		} catch (ClassNotFoundException e) {
			log.log(java.util.logging.Level.SEVERE,  "Driver nao encontrado" + e.getMessage(),  e.getCause() );
		} catch (SQLException e) {
			log.log(java.util.logging.Level.SEVERE, "Erro acessando o banco :" + e.getSQLState() + "\n"+e.getMessage(), e.getCause() );
		}
		throw new Exception("use o metodo conecta para estabelecer uma conecao");

	}
	
	@Override
	public boolean fecha() {
		if (con != null) {
			try {
				con.close();
				con = null;
				return true;
			} catch (SQLException e) {
				log.log(java.util.logging.Level.SEVERE, "Erro fechando conexao com o banco :" + e.getSQLState() + "\n"+e.getMessage(), e.getCause() );
				/**e.printStackTrace();*/
			}
		}
		return false;
	}

	@Override
	public Connection getConnection() throws Exception {
		if(con == null){
			throw new ConnectionException("use o metodo conecta para estabelecer uma conexao");
		}
		return con;
	}
}
