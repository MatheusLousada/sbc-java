package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.enums.TipoPregaoEnum;

public class PregaoEletronicoMapperParametro implements InterfaceMapperParametro<PregaoEletronicoResponse> {

    private ContextoImportacao contexto;
    private List<PregaoEletronicoModel> pregoes;
    private List<String> pregoesString;
    private TipoPregaoEnum tipoPregao;
    private List<PregaoEletronicoResponse> response;
    private List<CompraDiretaModel> compras;

    public PregaoEletronicoMapperParametro(ContextoImportacao contexto) {
        this.contexto = contexto;
    }

    public PregaoEletronicoMapperParametro(ContextoImportacao contexto, List<PregaoEletronicoModel> pregoes,
            TipoPregaoEnum tipoPregao) {
        this.contexto = contexto;
        this.pregoes = pregoes;
        this.tipoPregao = tipoPregao;
    }

    public PregaoEletronicoMapperParametro(ContextoImportacao contexto, List<String> pregoesString) {
        this.contexto = contexto;
        this.pregoesString = pregoesString;
        this.tipoPregao = TipoPregaoEnum.PREGAO_STRING;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<PregaoEletronicoResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<PregaoEletronicoResponse> response) {
        this.response = response;
    }

    public TipoPregaoEnum getTipoPregao() {
        return this.tipoPregao;
    }

    public List<PregaoEletronicoModel> getPregoes() {
        return this.pregoes;
    }

    public List<String> getPregoesString() {
        return this.pregoesString;
    }

    public List<CompraDiretaModel> getCompras() {
        return this.compras;
    }

    public void setCompras() {
        this.compras = new ArrayList<CompraDiretaModel>();;
    }

    public void setPregoes(List<PregaoEletronicoModel> pregoes) {
        this.pregoes = pregoes;
    }
}
