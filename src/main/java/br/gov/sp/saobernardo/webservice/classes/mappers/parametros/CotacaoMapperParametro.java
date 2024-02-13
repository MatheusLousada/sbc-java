package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CotacaoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class CotacaoMapperParametro implements InterfaceMapperParametro<CotacaoResponse> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private CotacaoModel cotacao;
    private List<String> cotacoes;
    private List<CotacaoResponse> response;

    public CotacaoMapperParametro(ContextoImportacao contexto, RequestData requestData, CotacaoModel cotacao) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.cotacao = cotacao;
    }

    public CotacaoMapperParametro(ContextoImportacao contexto, RequestData requestData) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.cotacoes = new ArrayList<>();
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<CotacaoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<CotacaoResponse> response) {
        this.response = response;
    }

    public RequestData getRequestData() {
        return this.requestData;
    }

    public List<String> getCotacoes() {
        return this.cotacoes;
    }

    public CotacaoModel getCotacao() {
        return this.cotacao;
    }

    public void setCotacao(CotacaoModel cotacao) {
        this.cotacao = cotacao;
    }
}
