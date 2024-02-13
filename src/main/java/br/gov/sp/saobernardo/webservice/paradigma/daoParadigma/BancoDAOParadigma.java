package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.BancoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.AgenciaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteFactory;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class BancoDAOParadigma implements BancoDAOInterface {

	private DAOExecutor daoEx;

	public BancoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public BancoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws SQLException {

		final String query = "SELECT * FROM BANCO INNER JOIN EMPRESA_BANCO ON BANCO.nCdBanco = EMPRESA_BANCO.nCdBanco  WHERE EMPRESA_BANCO.nCdEmpresa = '"
				+ String.valueOf(codigoWBCEmpresa)+"'";

		BancoModel bancoModel = new BancoModel();

		TratamentoDeString ts = new TratamentoDeString();

		try {

			ResultSet rs = daoEx.executeQuery(query);
			
			while (rs.next()) {

				final Long codigoDoBanco = rs.getLong("nCdBanco");
				AgenciaModel agencia = new AgenciaModel(ts.completaComZerosAEsquerda(rs.getString("sCdAgencia"), 4), rs.getString("sCdAgenciaDigito"));
				bancoModel.setCodigoDobanco(ts.completaComZerosAEsquerda(String.valueOf(codigoDoBanco), 3));
				bancoModel.setAgencia(agencia);
				bancoModel.setContaCorrente(new ContaCorrenteFactory().fabricaConta(bancoModel, rs.getString("sCdContaCorrente"), rs.getString("sCdContaDigito")));
			}

			rs.close();

		} finally {
			daoEx.close();
		}

		return bancoModel;
	}
}
