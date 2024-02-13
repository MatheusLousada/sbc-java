package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CategoriaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class CategoriaMapperParametro implements InterfaceMapperParametro<CategoriaResponse> {

    private ContextoImportacao contexto;
    private CategoriaModel categoria;
    private List<CategoriaResponse> response;

    public CategoriaMapperParametro(ContextoImportacao contexto, CategoriaModel categoria) {
        this.contexto = contexto;
        this.categoria = categoria;
    }
    
    @Override
    public List<CategoriaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<CategoriaResponse> response) {
        this.response = response;
    }

    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    public void setContexto(ContextoImportacao contexto) {
        this.contexto = contexto;
    }

    public CategoriaModel getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }
}
