package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class PregaoEletronicoPrazoDeEntregaResponse implements InterfaceResponse {

    private int nCdPrazoEntrega;
    private String sDsPrazoEntrega;
    private int nNrDias;

    public static Type getStructure() {
        return PregaoEletronicoPrazoDeEntregaResponse.class;
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public int getNCdPrazoEntrega() {
        return nCdPrazoEntrega;
    }

    public void setNCdPrazoEntrega(int nCdPrazoEntrega) {
        this.nCdPrazoEntrega = nCdPrazoEntrega;
    }

    public String getSDsPrazoEntrega() {
        return sDsPrazoEntrega;
    }

    public void setSDsPrazoEntrega(String sDsPrazoEntrega) {
        this.sDsPrazoEntrega = sDsPrazoEntrega;
    }

    public int getNNrDias() {
        return nNrDias;
    }

    public void setNNrDias(int nNrDias) {
        this.nNrDias = nNrDias;
    }
}
