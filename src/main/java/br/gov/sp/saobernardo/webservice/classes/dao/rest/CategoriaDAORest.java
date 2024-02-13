package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CategoriaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CategoriaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CategoriaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class CategoriaDAORest extends AbstractDAORest<CategoriaModel, CategoriaMapperParametro, CategoriaResponse> implements CategoriaDAOInterface {

    public CategoriaDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        
        super(contexto, requestData);
        
        CategoriaModel categoria = new CategoriaModel();
        CategoriaMapperParametro categoriaParametro = new CategoriaMapperParametro(this.contexto, categoria);
        super.setParametro(categoriaParametro);
    }

    public CategoriaModel buscaPeloCodigoDoParadigma(Long nCdProduto) throws Exception {

        super.setResponse();
        return this.listar();
    }

    public CategoriaModel listar() throws Exception {
        return super.listar();
    }
}
