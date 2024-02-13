package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.ProdutoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.ProdutoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.ProdutoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class ProdutoDAORest extends AbstractDAORest<ProdutoModel, ProdutoMapperParametro, ProdutoResponse> implements ProdutoDAOInterface {

    public ProdutoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public ProdutoModel listar() throws Exception {
        
        ProdutoModel produto = new ProdutoModel();
        ProdutoMapperParametro parametroProduto = new ProdutoMapperParametro(this.contexto, produto);
        super.setParametro(parametroProduto);

        return super.listar();
    }
}