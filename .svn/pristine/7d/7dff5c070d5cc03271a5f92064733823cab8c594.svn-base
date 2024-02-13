package br.gov.sp.saobernardo.webservice.paradigma.connections;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Logger;

import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.DBDrivers;
import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.JdbcUrl;

/**
 * @author 41476 ( Alexandre Salafia )
 * @author 27811746
 * @author 48703328 
 * @since ‪05/abr./2022 Novo endereco do servidor SQL de producao
 * @since 105/set/2023 Novo endereco do servidor SQL de producao
 */
public class ConnectionParadigmaProducao extends BaseConexaoAbstract  {

	public ConnectionParadigmaProducao() {
		super(DBDrivers.MSSQL_DRIVER, new JdbcUrl("dti-sql-01", "WBC_SECOM").asMsSqlServer(), "devweb", "#D3w@_Dti0308",
				"Paradigma - PRD");
	}

}
