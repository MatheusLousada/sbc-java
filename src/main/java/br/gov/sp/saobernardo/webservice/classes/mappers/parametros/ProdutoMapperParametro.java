package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.ProdutoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class ProdutoMapperParametro implements InterfaceMapperParametro<ProdutoResponse> {

    private ContextoImportacao contexto;
    private ProdutoModel produto;
    private List<ProdutoResponse> response;

    public ProdutoMapperParametro(ContextoImportacao contexto, ProdutoModel produto) {
        this.contexto = contexto;
        this.produto = produto;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }
    
    @Override
    public List<ProdutoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<ProdutoResponse> response) {
        this.response = response;
    }

    public void setContexto(ContextoImportacao contexto) {
        this.contexto = contexto;
    }

    public ProdutoModel getProduto() {
        return this.produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
}
