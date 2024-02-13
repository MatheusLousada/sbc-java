package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class CompraDiretaItemSituacaoResponse implements InterfaceResponse {

    private int nCdSituacao;
    private String sDsSituacao;

    public int getNCdSituacao() {
        return nCdSituacao;
    }

    public String getSDsSituacao() {
        return sDsSituacao;
    }

    public void setNCdSituacao(int nCdSituacao) {
        this.nCdSituacao = nCdSituacao;
    }

    public void setSDsSituacao(String sDsSituacao) {
        this.sDsSituacao = sDsSituacao;
    }

    public static Type getStructure() {
        return CompraDiretaItemSituacaoResponse.class;
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }
}
