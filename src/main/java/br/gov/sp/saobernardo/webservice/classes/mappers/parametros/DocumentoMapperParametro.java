package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.responses.DocumentoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class DocumentoMapperParametro implements InterfaceMapperParametro<DocumentoResponse> {

    private String dia;
    private List<DocumentoResponse> response;
    private ContextoImportacao contexto;

    public DocumentoMapperParametro(ContextoImportacao contexto) {
        this.contexto = contexto;
    }

        @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<DocumentoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<DocumentoResponse> response) {
        this.response = response;
    }


    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
