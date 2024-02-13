package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

public class ProdutoResponse implements InterfaceResponse {

    private String sCdProdutoEmpresa;
    private String nCdEmpresa;
    private String sDsProduto;
    private String sDsDetalhe;
    private Long nCdClasse;
    private Long nCdUnidadeMedida;

    public String getsCdProdutoEmpresa() {
        return sCdProdutoEmpresa;
    }

    public void setsCdProdutoEmpresa(String sCdProdutoEmpresa) {
        this.sCdProdutoEmpresa = sCdProdutoEmpresa;
    }

    public String getnCdEmpresa() {
        return nCdEmpresa;
    }

    public void setnCdEmpresa(String nCdEmpresa) {
        this.nCdEmpresa = nCdEmpresa;
    }

    public String getsDsProduto() {
        return sDsProduto;
    }

    public void setsDsProduto(String sDsProduto) {
        this.sDsProduto = sDsProduto;
    }

    public String getsDsDetalhe() {
        return sDsDetalhe;
    }

    public void setsDsDetalhe(String sDsDetalhe) {
        this.sDsDetalhe = sDsDetalhe;
    }

    public Long getnCdClasse() {
        return nCdClasse;
    }

    public void setnCdClasse(Long nCdClasse) {
        this.nCdClasse = nCdClasse;
    }

    public Long getnCdUnidadeMedida() {
        return nCdUnidadeMedida;
    }

    public void setnCdUnidadeMedida(Long nCdUnidadeMedida) {
        this.nCdUnidadeMedida = nCdUnidadeMedida;
    }

    public static Type getStructure() {
        return ProdutoResponse.class;
    }

    @Override
    public InterfaceResponse getInterface() {
        return this;
    }
}
