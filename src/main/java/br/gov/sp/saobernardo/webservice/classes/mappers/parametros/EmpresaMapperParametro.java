package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.BancoResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.EmpresaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class EmpresaMapperParametro implements InterfaceMapperParametro<EmpresaResponse> {
    
    private ContextoImportacao contexto;
    private List<String> CNPJs;
    private EmpresaModel empresaResposta;
    private List<EmpresaModel> empresasResposta;
    private EmpresaModel empresa;
    private String cnpj;
    private String emailContato;
    private String nomeEmpresa;
    private String nomeFantasia;
    private long situacao;
    private int beneficiarioLei123;
    private long codigoWBC;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    private List<EmpresaResponse> response;

    public EmpresaMapperParametro(ContextoImportacao contexto) throws Exception {
        this.setDadosGerais(contexto);
    }

    public EmpresaMapperParametro(ContextoImportacao contexto, EmpresaModel empresa) throws Exception {
        this.setDadosGerais(contexto);
        this.empresaResposta = empresa;
    }

    public EmpresaMapperParametro(ContextoImportacao contexto, List<EmpresaModel> empresas) throws Exception {
        this.setDadosGerais(contexto);
        this.empresasResposta = empresas;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    @Override
    public List<EmpresaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<EmpresaResponse> response) {
        this.response = response;
    }

    private void setDadosGerais(ContextoImportacao contexto) {
        this.contexto = contexto;
        this.empresa = new EmpresaModel();
        this.CNPJs = new ArrayList<String>();
    }

    public List<String> getCNPJs() {
        return this.CNPJs;
    }

    public void setCNPJs(List<String> CNPJs) {
        this.CNPJs = CNPJs;
    }

    public EmpresaModel getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailContato() {
        return this.emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getSituacao() {
        return this.situacao;
    }

    public void setSituacao(long situacao) {
        this.situacao = situacao;
    }

    public int getBeneficiarioLei123() {
        return this.beneficiarioLei123;
    }

    public void setBeneficiarioLei123(int beneficiarioLei123) {
        this.beneficiarioLei123 = beneficiarioLei123;
    }

    public long getCodigoWBC() {
        return this.codigoWBC;
    }

    public void setCodigoWBC(long codigoWBC) {
        this.codigoWBC = codigoWBC;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public EmpresaModel getEmpresaResposta() {
        return this.empresaResposta;
    }

    public List<EmpresaModel> getEmpresasResposta() {
        return this.empresasResposta;
    }
    
    public void setEmpresasResposta(List<EmpresaModel> empresasResposta) {
        this.empresasResposta = empresasResposta;
    }
}
