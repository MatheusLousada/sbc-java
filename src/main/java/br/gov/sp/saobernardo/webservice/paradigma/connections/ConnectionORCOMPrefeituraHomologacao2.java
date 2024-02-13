package br.gov.sp.saobernardo.webservice.paradigma.connections;

import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.DBDrivers;
import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.JdbcUrl;

public class ConnectionORCOMPrefeituraHomologacao2 extends BaseConexaoAbstract {
	public ConnectionORCOMPrefeituraHomologacao2() {
		super(DBDrivers.ORACLE_DRIVER, new JdbcUrl("rac-dhpp-scan", "HMGORCOM_SVC").asOracle(), "ORCOM_APP_BATCH",
				"orcom_pmsbc", "Orcom - Prefeitura - HMG");
	}
}
