package br.gov.sp.saobernardo.webservice.paradigma.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseConexaoAbstract implements Conexao {

	private String driver;
	private String url;

	private String user;
	private String pass;
	private Connection con = null;
	private String nomeConexao;
	
	@SuppressWarnings("unused")
	private BaseConexaoAbstract() {
		throw new RuntimeException("Deve ser instanciada somente com parametros");
	}

	/**
	 * @param driver
	 * @param url
	 * @param user
	 * @param pass
	 * @param nomeConexao 
	 */
	public BaseConexaoAbstract(String driver, String url, String user, String pass, String nomeConexao) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
		this.nomeConexao = nomeConexao;
	}


	@Override
	public Connection conecta() throws ConnectionException {

		try {
			Class.forName(this.driver);
			con = DriverManager.getConnection(this.url, this.user, this.pass);
			return con;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		final String msg = String.format("nao foi possivel se conectar ao banco de dados [%s]", this.nomeConexao);
		throw new ConnectionException(msg);

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
	public Connection getConnection() throws ConnectionException {
		if(con == null){
			final String msg = String.format( "use o metodo conecta() para estabelecer uma conexao em [%s]", this.nomeConexao);
			throw new ConnectionException(msg);
		}
		return con;
	}
	
	
	protected String getDriver() {
		return driver;
	}

	protected String getUrl() {
		return url;
	}

	protected String getUser() {
		return user;
	}

	protected String getPass() {
		return pass;
	}
	protected String getNomeConexao() {
		return nomeConexao;
	}

}
