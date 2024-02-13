package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.UnidadeDeMedidaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.UnidadeDeMedidaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class UnidadeDeMedidaDAORest extends AbstractDAORest<UnidadeDeMedidaModel, UnidadeDeMedidaMapperParametro, UnidadeDeMedidaDAORest> implements UnidadeDeMedidaDAOInterface {

    public UnidadeDeMedidaDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public UnidadeDeMedidaModel listar() throws Exception {
        
        ResultSet resultSet = this.dao.getResultSet();
        UnidadeDeMedidaModel unidadeDeMedida = new UnidadeDeMedidaModel();
        UnidadeDeMedidaMapperParametro unidadeParametro = new UnidadeDeMedidaMapperParametro(this.contexto, unidadeDeMedida);
        
        return super.listar(unidadeParametro);
    }
}
