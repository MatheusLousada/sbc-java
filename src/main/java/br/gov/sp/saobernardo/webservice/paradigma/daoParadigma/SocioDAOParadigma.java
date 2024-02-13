package br.gov.sp.saobernardo.webservice.paradigma.daoParadigma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.SocioDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.DAOExecutor;

public class SocioDAOParadigma implements SocioDAOInterface {

	private DAOExecutor daoEx;

	public SocioDAOParadigma(Connection con, boolean imprimirSQL) {
		daoEx = new DAOExecutor(con, imprimirSQL);
	}

	public List<SocioModel> buscaSocios(Long codigoWBCEmpresa) throws SQLException {

		List<SocioModel> socios = new ArrayList<SocioModel>();

		StringBuilder query = new StringBuilder();
		query.append("SELECT uc.sNrCPF, ut.sNmUsuarioTipo, u.sNmUsuario, u.sDsEmail ");
		query.append(" FROM usuario u INNER JOIN EMPRESA e ON e.nCdEmpresa = u.nCdEmpresa ");
		query.append(" INNER JOIN USUARIO_COMPLEMENTO uc ON uc.sCdUsuario = u.sCdUsuario ");
		query.append(" INNER JOIN USUARIO_TIPO ut ON ut.nCdUsuarioTipo = uc.nIdRepresentante ");
		query.append(" WHERE e.nCdEmpresa = '").append(codigoWBCEmpresa).append("' AND u.nStUsuario = 1");
		
		try {

			//daoEx.clearResetParameters().addParameter();
			ResultSet rs = daoEx.executeQuery(query );
			while (rs.next()) {
				SocioModel socio = new SocioModel(rs.getString("sNrCPF"), rs.getString("sNmUsuarioTipo"),
						rs.getString("sNmUsuario"), rs.getString("sDsEmail"));
				 
				socios.add(socio);
			}

			rs.close();
			
		} finally {
			daoEx.close();
		}

		return socios;
	}

}
