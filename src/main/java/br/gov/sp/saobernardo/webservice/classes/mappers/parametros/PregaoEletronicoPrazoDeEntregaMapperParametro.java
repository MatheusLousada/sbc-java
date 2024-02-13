package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoPrazoDeEntregaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class PregaoEletronicoPrazoDeEntregaMapperParametro implements InterfaceMapperParametro<PregaoEletronicoPrazoDeEntregaResponse> {

    private ContextoImportacao contexto;
    private PregaoEletronicoPrazoDeEntregaModel pregrao;
    private List<PregaoEletronicoPrazoDeEntregaResponse> response;

    public PregaoEletronicoPrazoDeEntregaMapperParametro(ContextoImportacao contexto, PregaoEletronicoPrazoDeEntregaModel pregrao) {
        this.contexto = contexto;
        this.pregrao = pregrao;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<PregaoEletronicoPrazoDeEntregaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<PregaoEletronicoPrazoDeEntregaResponse> response) {
        this.response = response;
    }


    public PregaoEletronicoPrazoDeEntregaModel getPregrao() {
        return this.pregrao;
    }

    public void setPregrao(PregaoEletronicoPrazoDeEntregaModel pregrao) {
        this.pregrao = pregrao;
    }
}
