package br.gov.sp.saobernardo.webservice.paradigma.connections;

import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.DBDrivers;
import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.JdbcUrl;

public class ConnectionORCOMPrefeituraDesenvolvimento2 extends BaseConexaoAbstract {

	public ConnectionORCOMPrefeituraDesenvolvimento2() {

		super(DBDrivers.ORACLE_DRIVER, new JdbcUrl("rac-dhpp-scan", "DEVORCOM_SVC").asOracle(), "ORCOM_APP_BATCH",
				"T1S54qqMk1", "Orcom - Prefeitura - DEV");
	}
}
