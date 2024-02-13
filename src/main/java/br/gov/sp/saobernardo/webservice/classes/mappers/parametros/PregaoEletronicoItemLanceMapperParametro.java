package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class PregaoEletronicoItemLanceMapperParametro implements InterfaceMapperParametro<PregaoEletronicoItemLanceResponse> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private List<PregaoEletronicoItemLanceModel> pregoes;
    private List<PregaoEletronicoItemLanceResponse> response;

    public PregaoEletronicoItemLanceMapperParametro(ContextoImportacao contexto, RequestData requestData, List<PregaoEletronicoItemLanceModel> pregoes) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.pregoes = pregoes;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<PregaoEletronicoItemLanceResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<PregaoEletronicoItemLanceResponse> response) {
        this.response = response;
    }

    public RequestData getRequestData() {
        return this.requestData;
    }

    public List<PregaoEletronicoItemLanceModel> getPregoes() {
        return this.pregoes;
    }
}
