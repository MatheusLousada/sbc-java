package br.gov.sp.saobernardo.webservice.orcom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.gov.sp.saobernardo.webservice.orcom.model.OrcomSecomQuadroModel;
import br.gov.sp.saobernardo.webservice.paradigma.dao.ImprimeQuery;
import br.gov.sp.saobernardo.webservice.paradigma.util.ConversorDeDadosDoBancoParaModelo;

public class OrcomSecomQuadroDAO {
	private Connection con;
	private boolean imprimirSQL;

	public OrcomSecomQuadroDAO(Connection con, boolean imprimirSQL) {
		this.con = con;
		this.imprimirSQL = imprimirSQL;
	}

	public OrcomSecomQuadroModel buscaPrimeiroPregaoEletronicoPorNumero(Integer numeroRequisicao) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append("SELECT EMPRESA,MATERIAL,MATRICULA,REQUISICAO, VALOR,QUANTIDADE,CNPJ,MEDIA,TIPO_ITEM,ITEM,MARCA,UNIDADE,ESTADO,MESTOTAL,MESNOANO,TIPODOC,SEQUENCIA,DTA_EMISSAO,OBSERVACAO \n");
		query.append( " FROM  " + SchemaOrcom.SCHEMA+ ".SECOM_QUADRO \n");
		query.append( " WHERE REQUISICAO like ? \n ");
		query.append( " ORDER BY ITEM, SEQUENCIA \n ");

		OrcomSecomQuadroModel quadro = new OrcomSecomQuadroModel();
		
		Statement stmt = con.createStatement();
		PreparedStatement ps = con.prepareStatement(query.toString());
		ps.setString(1, new StringBuilder("%").append( numeroRequisicao ).append("%").toString() );

		if (imprimirSQL) {
			ImprimeQuery.imprimeQuery(query.toString(), String.valueOf(numeroRequisicao));
		}

		ResultSet rs = ps.executeQuery();

		
		while (rs.next()) {
			ConversorDeDadosDoBancoParaModelo.converte(quadro, rs);
			stmt.close();
		}

		return quadro;

	}
	
	
	/**
	 * Apaga quadro de precos do ORCOM. Somente quadro de precos que veio do SECOM
	 * @throws SQLException 
	 */
	public void apagaQuadroDePrecosSecom( String requisicao) throws SQLException{
		String sql = new StringBuilder("DELETE FROM " + SchemaOrcom.SCHEMA+ ".secom_quadro s WHERE s.requisicao = " ) 
				.append(requisicao ).toString();
		
		Statement stmt = con.createStatement();
		PreparedStatement ps = con.prepareStatement(sql.toString());
		
		ResultSet rs = ps.executeQuery();
		rs.close();
		
		ps.close();
		stmt.close();

	}
	
}
