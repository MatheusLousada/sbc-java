package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemLanceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class CompraDiretaItemLanceMapperParametro implements InterfaceMapperParametro<CompraDiretaItemLanceResponse> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private List<CompraDiretaItemLanceModel> lances;
    private List<CompraDiretaItemLanceResponse> response;

    public CompraDiretaItemLanceMapperParametro(ContextoImportacao contexto, RequestData requestData, List<CompraDiretaItemLanceModel> lances) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.lances = lances;
    }

    @Override
    public List<CompraDiretaItemLanceResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<CompraDiretaItemLanceResponse> response) {
        this.response = response;
    }

    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    public RequestData getRequestData() {
        return this.requestData;
    }

    public List<CompraDiretaItemLanceModel> getLances() {
        return this.lances;
    }

    public void setLances(List<CompraDiretaItemLanceModel> lances) {
        this.lances = lances;
    }
}
