package br.gov.sp.saobernardo.webservice.paradigma.connections;

import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.DBDrivers;
import br.gov.sp.saobernardo.webservice.paradigma.connections.sqldms.JdbcUrl;

public class ConnectionORCOMPrefeituraProducao2 extends BaseConexaoAbstract {
	public ConnectionORCOMPrefeituraProducao2() {
		super(DBDrivers.ORACLE_DRIVER, new JdbcUrl("rac-prod-scan", "ORCOM_SVC").asOracle(), "ORCOM_APP_BATCH",
				"O3TgStP72sj", "Orcom - Prefeitura - PRD");
	}

}
