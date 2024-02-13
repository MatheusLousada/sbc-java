package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class CompraDiretaItemLanceResponse implements InterfaceResponse {

    private String nCdEmpresa;
    private String tDtLance;
    private int nNrRanking;
    private BigDecimal dVlLance;
    private int nStLance;
    private String sDsJustificativa;
    private int bFlVencedor;
    private String sDsMarca;
    private String sDsModelo;
    private String sNrRegistro;
    private String sDsFabricante;
    private String sDsEmbalagem;

    public String getNCdEmpresa() {
        return nCdEmpresa;
    }

    public String getTDtLance() {
        return tDtLance;
    }

    public int getNNrRanking() {
        return nNrRanking;
    }

    public BigDecimal getDVlLance() {
        return dVlLance;
    }

    public int getNStLance() {
        return nStLance;
    }

    public String getSDsJustificativa() {
        return sDsJustificativa;
    }

    public int getBFlVencedor() {
        return bFlVencedor;
    }

    public String getSDsMarca() {
        return sDsMarca;
    }

    public String getSDsModelo() {
        return sDsModelo;
    }

    public String getSNrRegistro() {
        return sNrRegistro;
    }

    public String getSDsFabricante() {
        return sDsFabricante;
    }

    public String getSDsEmbalagem() {
        return sDsEmbalagem;
    }

    public void setNCdEmpresa(String nCdEmpresa) {
        this.nCdEmpresa = nCdEmpresa;
    }

    public void setTDtLance(String tDtLance) {
        this.tDtLance = tDtLance;
    }

    public void setNNrRanking(int nNrRanking) {
        this.nNrRanking = nNrRanking;
    }

    public void setDVlLance(BigDecimal dVlLance) {
        this.dVlLance = dVlLance;
    }

    public void setNStLance(int nStLance) {
        this.nStLance = nStLance;
    }

    public void setSDsJustificativa(String sDsJustificativa) {
        this.sDsJustificativa = sDsJustificativa;
    }

    public void setBFlVencedor(int bFlVencedor) {
        this.bFlVencedor = bFlVencedor;
    }

    public void setSDsMarca(String sDsMarca) {
        this.sDsMarca = sDsMarca;
    }

    public void setSDsModelo(String sDsModelo) {
        this.sDsModelo = sDsModelo;
    }

    public void setSNrRegistro(String sNrRegistro) {
        this.sNrRegistro = sNrRegistro;
    }

    public void setSDsFabricante(String sDsFabricante) {
        this.sDsFabricante = sDsFabricante;
    }

    public void setSDsEmbalagem(String sDsEmbalagem) {
        this.sDsEmbalagem = sDsEmbalagem;
    }

    public static Type getStructure() {
        return CompraDiretaItemLanceResponse.class;
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }
}
