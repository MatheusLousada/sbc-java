package br.gov.sp.saobernardo.webservice.orcom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.orcom.model.OrcomEdit3Model;
import br.gov.sp.saobernardo.webservice.orcom.model.TiposLicitacoes;
import br.gov.sp.saobernardo.webservice.paradigma.dao.ImprimeQuery;
import br.gov.sp.saobernardo.webservice.paradigma.util.ConversorDeDadosDoBancoParaModelo;

public class OrcomEdit3DAO /* extends AbstractDAO */ {

	private boolean imprimirSQL;
	// private Statement stmt1;
	private PreparedStatement ps1;
	private ResultSet rs1;
	private Connection con;

	public OrcomEdit3DAO(Connection con, boolean imprimirSQL) {
		this.con = con;
		this.imprimirSQL = imprimirSQL;
	}

	public OrcomEdit3Model buscaPrimeiroPregaoEletroncioPorNumero(Integer numeroLicitacao) throws Exception {
		return buscaPrimeiraLicitacaoPorNumeroETipo(TiposLicitacoes.PE.toString(), numeroLicitacao);
	}

	public OrcomEdit3Model buscaPrimeiraCompraDiretaPorNumero(Integer numeroLicitacao) throws Exception {
		return buscaPrimeiraLicitacaoPorNumeroETipo(TiposLicitacoes.CE.toString(), numeroLicitacao);
	}

	public OrcomEdit3Model buscaPrimeiraLicitacaoPorNumeroETipo(String tipo, Integer numeroLicitacao) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append("SELECT * FROM ").append(SchemaOrcom.SCHEMA + ".EDIT3");
		query.append(" WHERE TIPO1 = '").append(tipo);
		query.append("' AND NUMERO1 = ? ORDER BY ITEM, VL_UNI ");

		OrcomEdit3Model edit3 = new OrcomEdit3Model();
		try {
			ps1 = con.prepareStatement(query.toString());
			ps1.setInt(1, numeroLicitacao);

			if (imprimirSQL) {
				ImprimeQuery.imprimeQuery(query.toString(), String.valueOf(numeroLicitacao));
			}

			rs1 = ps1.executeQuery();

			while (rs1.next()) {
				ConversorDeDadosDoBancoParaModelo.converte(edit3, rs1);
			}
		} finally {
			 
			if (ps1 != null) {
				ps1.close();
			}
			if (rs1 != null) {
				rs1.close();
			}
		}

		return edit3;

	}
}
