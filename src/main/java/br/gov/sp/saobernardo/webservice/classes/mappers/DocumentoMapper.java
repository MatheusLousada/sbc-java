package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.DocumentoMapperParametro;
import br.gov.sp.saobernardo.webservice.paradigma.util.DateFormatter;

public class DocumentoMapper extends AbstractMapper implements InterfaceMapper<String, DocumentoMapperParametro> {

    private DocumentoMapperParametro documentoMapperParametro;

    public DocumentoMapper(DocumentoMapperParametro p) throws Exception {
        this.documentoMapperParametro = p;
        setDados();
    }

    public void setDados() throws SQLException {
        
        String dia = "";
        ResultSet resultSet = this.documentoMapperParametro.getResultSet();

		while (resultSet.next()) {
			dia = DateFormatter.formataDiaMesAno(resultSet.getDate("tDtValidade"));
		}

		resultSet.close();
        this.documentoMapperParametro.setDia(dia);
    }

    @Override
    public String listar() throws Exception {
        return this.documentoMapperParametro.getDia();
    }
}
