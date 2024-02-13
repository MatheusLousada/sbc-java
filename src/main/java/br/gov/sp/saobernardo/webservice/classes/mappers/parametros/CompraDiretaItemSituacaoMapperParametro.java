package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemSituacaoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class CompraDiretaItemSituacaoMapperParametro implements InterfaceMapperParametro<CompraDiretaItemSituacaoResponse> {

    private ContextoImportacao contexto;
    private CompraDiretaItemSituacao situacao;
    private List<CompraDiretaItemSituacaoResponse> response;

    public CompraDiretaItemSituacaoMapperParametro(ContextoImportacao contexto, CompraDiretaItemSituacao situacao) {
        this.contexto = contexto;
        this.situacao = situacao;
    }

    @Override
    public List<CompraDiretaItemSituacaoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<CompraDiretaItemSituacaoResponse> response) {
        this.response = response;
    }

    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    public void setContexto(ContextoImportacao contexto) {
        this.contexto = contexto;
    }

    public CompraDiretaItemSituacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(CompraDiretaItemSituacao situacao) {
        this.situacao = situacao;
    }
}
