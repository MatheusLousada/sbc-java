package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.sql.ResultSet;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemSituacao;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class PregaoEletronicoItemSituacaoMapperParametro implements InterfaceMapperParametro<PregaoEletronicoItemSituacaoResponse> {

    private ContextoImportacao contexto;
    private PregaoEletronicoItemSituacao situacao;
    private List<PregaoEletronicoItemSituacaoResponse> response;

    public PregaoEletronicoItemSituacaoMapperParametro(ContextoImportacao contexto, PregaoEletronicoItemSituacao situacao) {
        this.contexto = contexto;
        this.situacao = situacao;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<PregaoEletronicoItemSituacaoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<PregaoEletronicoItemSituacaoResponse> response) {
        this.response = response;
    }

    public PregaoEletronicoItemSituacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(PregaoEletronicoItemSituacao situacao) {
        this.situacao = situacao;
    }
}
