package br.gov.sp.saobernardo.webservice.paradigma.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao2 implements Conexao {

	private String driver;
	private String user;
	private String pass;
	private String url;
	private Connection con = null;

	public Conexao2(BaseConexao cliente) {
		super();
		this.driver = cliente.getDriver();
		this.pass = cliente.getPass();
		this.url = cliente.getUrl();
		this.user = cliente.getUser();
	}

	@Override
	public Connection conecta() throws Exception {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
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
		if (con == null) {
			throw new Exception("use o metodo conecta para estabelecer uma conecao");
		}
		return con;
	}
}
