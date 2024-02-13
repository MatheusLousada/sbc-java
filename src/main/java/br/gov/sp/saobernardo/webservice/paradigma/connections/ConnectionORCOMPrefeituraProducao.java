package br.gov.sp.saobernardo.webservice.paradigma.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionORCOMPrefeituraProducao implements Conexao {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@rac-prod-scan:1521/ORCOM_SVC";

	// Database credentials
	static final String USER = "ORCOM_APP_BATCH";
	static final String PASS = "O3TgStP72sj";
	Connection con = null;

	@Override
	public Connection conecta() throws Exception {

		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new Exception("nao foi possivel se conectar ao banco de dados");

	}
	
	@Override
	public boolean fecha() {
		if (con != null) {
			try {
				con.close();
				con = null;
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Connection getConnection() throws Exception {
		if(con == null){
			throw new Exception("use o metodo conecta para estabelecer uma conecao");
		}
		return con;
	}
}
