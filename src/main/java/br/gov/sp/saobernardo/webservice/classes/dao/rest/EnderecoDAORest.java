package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.EnderecoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.EnderecoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.*;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class EnderecoDAORest extends AbstractDAORest<EnderecoModel, EnderecoMapperParametro, EnderecoResponse> implements EnderecoDAOInterface {

    public EnderecoDAORest(ContextoImportacao contexto, RequestData requestData) {
        super(contexto, requestData);
    }

    public EnderecoModel listar() throws Exception {

        EnderecoModel enderecoModel = new EnderecoModel();
        ResultSet resultSet = dao.getResultSet();
        EnderecoMapperParametro enderecoParametro = new EnderecoMapperParametro(enderecoModel, resultSet);
        
        return super.listar(enderecoParametro);
    }
}
