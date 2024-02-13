package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.EnderecoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class EnderecoDAOParadigma implements EnderecoDAOInterface {

	private DAOExecutor daoEx;
	private ResultSet rs; 
	
	public EnderecoDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public EnderecoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa, Long codigoWBCTipo) throws SQLException {

		final String query = "SELECT * FROM ENDERECO INNER JOIN EMPRESA_ENDERECO ON ENDERECO.nCdEndereco = EMPRESA_ENDERECO.nCdEndereco WHERE  EMPRESA_ENDERECO.nCdEmpresa = ? and  EMPRESA_ENDERECO.nIdTipo = ?";

		EnderecoModel enderecoModel = new EnderecoModel();
		rs = null;

		try {
			daoEx.clearResetParameters().addParameter(codigoWBCEmpresa);
			daoEx.addParameter(codigoWBCTipo);
			rs = daoEx.executeQuery(query);

			while (rs.next()) {

				enderecoModel.setBairro(rs.getString("sNmBairro"));
				enderecoModel.setNumero(rs.getString("sNrEndereco"));

				// Se o CEP estiver null, emitira uma NullPointerException, sem qualquer
				// informacao
				enderecoModel.setCep(rs.getString("sCdCep"));
				enderecoModel.setCidade(rs.getString("nCdCidade"));
				enderecoModel.setDescricao(rs.getString("sDsEndereco"));
				enderecoModel.setComplemento(rs.getString("sDsComplemento"));
				enderecoModel.setSiglaPais(rs.getString("sCdPais"));
				enderecoModel.setTipoEndereco(codigoWBCTipo);
				enderecoModel.setUf(rs.getString("sCdEstado"));

			}

		} finally {
			if( rs != null ) rs.close();
			daoEx.close();
		}
		
		return enderecoModel;
	}
}
