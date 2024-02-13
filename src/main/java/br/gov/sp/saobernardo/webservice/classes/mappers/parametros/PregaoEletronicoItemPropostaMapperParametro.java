package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class PregaoEletronicoItemPropostaMapperParametro implements InterfaceMapperParametro<PregaoEletronicoItemPropostaResponse> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private PregaoEletronicoItemProposta proposta;
    private List<PregaoEletronicoItemPropostaResponse> response;

    public PregaoEletronicoItemPropostaMapperParametro(ContextoImportacao contexto, RequestData requestData, PregaoEletronicoItemProposta proposta) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.proposta = proposta;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<PregaoEletronicoItemPropostaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<PregaoEletronicoItemPropostaResponse> response) {
        this.response = response;
    }

    public RequestData getRequestData() {
        return this.requestData;
    }

    public PregaoEletronicoItemProposta getProposta() {
        return this.proposta;
    }

    public void setProposta(PregaoEletronicoItemProposta proposta) {
        this.proposta = proposta;
    }
}
