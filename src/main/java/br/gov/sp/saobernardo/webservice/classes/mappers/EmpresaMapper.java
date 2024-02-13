package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.gov.sp.saobernardo.webservice.classes.bodys.BancoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.DocumentoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.EnderecoBody;
import br.gov.sp.saobernardo.webservice.classes.bodys.SocioBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.BancoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.DocumentoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.EnderecoDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.MaterialDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.SocioDAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.EmpresaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.FaxFactory;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.MicroOuPequenoPorte;
import br.gov.sp.saobernardo.webservice.classes.modelos.NumeroTelefonico;
import br.gov.sp.saobernardo.webservice.classes.modelos.SituacaoEmpresa;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.TelefoneFactory;
import br.gov.sp.saobernardo.webservice.classes.responses.EmpresaResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.InterfaceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.BancoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.DocumentoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EnderecoEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.MaterialEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.SocioEndpoint;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

public class EmpresaMapper extends AbstractMapper<EmpresaModel, EmpresaMapperParametro, EmpresaResponse> {

    private EmpresaMapperParametro mapperParametro;
    private String stringReflexao = "Empresa";

    public EmpresaMapper(ContextoImportacao contexto) throws Exception {
        super(new EmpresaMapperParametro(contexto));
        setDados();
    }

    public EmpresaMapper(ContextoImportacao contexto, EmpresaModel empresa) throws Exception {
        super(new EmpresaMapperParametro(contexto, empresa));
        setDados();
    }

    public EmpresaMapper(ContextoImportacao contexto, List<EmpresaModel> empresas) throws Exception {
        super(new EmpresaMapperParametro(contexto, empresas));
        setDados();
    }

    @Override
    public EmpresaResponse getCasted() throws Exception {

        List<EmpresaResponse> responses = this.mapperParametro.getResponse();
        List<InterfaceResponse> interfaceResponses = new ArrayList<>(responses);
        InterfaceResponse castedResponse = super.getCastedAbstract(interfaceResponses, this.stringReflexao);
    
        super.verificaInstancia(castedResponse, this.stringReflexao);
        
        return (EmpresaResponse) castedResponse;
    }

    @Override
    public void setDados() throws Exception {

        ResultSet resultSet = this.mapperParametro.getResultSet();

        while (resultSet.next()) {
            this.setVariaveis();
            this.setDadosContato();
            this.setDadosGerais();
            this.setDadosEndereco();
            this.setDadosBanco();
            this.setDadosMateriais();
            this.setDadosDocumento();
            this.setDadosSocio();

            this.adicionaEmpresa();
        }

        resultSet.close();
    }

    private void setVariaveis() throws SQLException {

        ResultSet resultSet = this.mapperParametro.getResultSet();

        this.mapperParametro.setCnpj(resultSet.getString("sNrCnpj"));
        this.mapperParametro.setEmailContato(resultSet.getString("sDsContatoEmail"));
        this.mapperParametro.setNomeEmpresa(resultSet.getString("sNmEmpresa"));
        this.mapperParametro.setNomeFantasia(resultSet.getString("sNmFantasia"));
        this.mapperParametro.setSituacao(resultSet.getLong("nStEmpresa"));
        this.mapperParametro.setBeneficiarioLei123(resultSet.getInt("nIdSuperSimples"));
        this.mapperParametro.setCodigoWBC(resultSet.getLong("nCdEmpresa"));
        this.mapperParametro.setInscricaoMunicipal(resultSet.getString("sNrInscricaoMunicipal"));
        this.mapperParametro.setInscricaoEstadual(resultSet.getString("sNrInscricaoEstadual"));
    }

    private void setDadosContato() throws SQLException {

        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        ResultSet resultSet = this.mapperParametro.getResultSet();

        TelefoneFactory telefoneFactory = new TelefoneFactory(resultSet.getString("sDsContatoFone"));
        NumeroTelefonico telefone1 = telefoneFactory.getTelefone1();
        if (null != telefone1) {
            empresa.setDdd(telefone1.getDdd());
            empresa.setTelefone1(telefone1.getNumero());
        }
        NumeroTelefonico telefone2 = telefoneFactory.getTelefone2();
        if (null != telefone2) {
            empresa.setTelefone2(telefone2.getNumero());
        }

        FaxFactory faxFactory = new FaxFactory(resultSet.getString("sDsContatoFax"));
        NumeroTelefonico fax = faxFactory.getFax();
        if (null != fax) {
            empresa.setFax(fax.getNumero());
            if (null == empresa.getDdd() && null != fax.getDdd()) {
                empresa.setDdd(fax.getDdd());
            }
        }

        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosGerais() throws SQLException {

        EmpresaModel empresa = this.mapperParametro.getEmpresa();

        empresa.setCodigoEmpresa(String.valueOf(this.mapperParametro.getCodigoWBC()));
        empresa.setCnpj(this.mapperParametro.getCnpj());
        empresa.setCodigoEmpresa(this.mapperParametro.getCnpj());
        empresa.setEmailContato(this.mapperParametro.getEmailContato());
        empresa.setNomeEmpresa(this.mapperParametro.getNomeEmpresa());
        empresa.setNomeFantasia(this.mapperParametro.getNomeFantasia());
        empresa.setSituacao(new SituacaoEmpresa(this.mapperParametro.getSituacao()));
        empresa.setBeneficiarioLei123(this.mapperParametro.getBeneficiarioLei123());
        empresa.setInscricaoMunicipal(this.mapperParametro.getInscricaoMunicipal());
        empresa.setInscricaoEstadual(this.mapperParametro.getInscricaoEstadual());
        empresa.setMicroOuPequenoPorte(new MicroOuPequenoPorte(this.mapperParametro.getBeneficiarioLei123()));

        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosEndereco() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        EnderecoEndpoint enderecoEndpoint = new EnderecoEndpoint(contexto);
        Orgaos orgao = this.mapperParametro.getContexto().getOrgao();
        int organizationId = this.getOrganizationId(orgao);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarEnderecoEmpresa\", \"cnpj\":\"%s\"}", organizationId,empresa.getCnpj());
        EnderecoBody body = new EnderecoBody(bodyString);
        RequestData enderecoRequestData = new RequestData(enderecoEndpoint.getEnum(), enderecoEndpoint.getEndpoint("provider"), body);
        EnderecoDAORest enderecoDAO = new EnderecoDAORest(contexto, enderecoRequestData);
        EnderecoModel endereco = enderecoDAO.listar();

        empresa.setEndereco(endereco);
        empresa.setEnderecoCorrespondencia(endereco);

        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosBanco() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        BancoEndpoint bancoEndpoint = new BancoEndpoint(contexto);
        Orgaos orgao = this.mapperParametro.getContexto().getOrgao();
        int organizationId = this.getOrganizationId(orgao);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarEnderecoEmpresa\", \"cnpj\":\"%s\"}", organizationId,empresa.getCnpj());
        BancoBody body = new BancoBody(bodyString);
        RequestData bancoRequestData = new RequestData(bancoEndpoint.getEnum(), bancoEndpoint.getEndpoint("provider"), body);
        BancoDAORest bancoDAO = new BancoDAORest(contexto, bancoRequestData);
        BancoModel banco = bancoDAO.listar(empresa.getCnpj());

        empresa.setBanco(banco);
        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosMateriais() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        MaterialEndpoint materialEndpoint = new MaterialEndpoint(contexto);
        Orgaos orgao = this.mapperParametro.getContexto().getOrgao();
        int organizationId = this.getOrganizationId(orgao);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarMateriaisEmpresa\"}", organizationId);
        DocumentoBody body = new DocumentoBody(bodyString);
        body.setJson(bodyString);
        RequestData materialRequestData = new RequestData(materialEndpoint.getEnum(), materialEndpoint.getEndpoint("provider"), body);
        MaterialDAORest materialDAO = new MaterialDAORest(contexto, materialRequestData);
        List<MaterialModel> materiais = materialDAO.listarMateriaisEmpresa(empresa.getCnpj());

        empresa.setMateriais(materiais);

        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosDocumento() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        DocumentoEndpoint documentoEndpoint = new DocumentoEndpoint(contexto);
        Orgaos orgao = this.mapperParametro.getContexto().getOrgao();
        int organizationId = this.getOrganizationId(orgao);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarDocumentosEmpresa\"}", organizationId);
        DocumentoBody body = new DocumentoBody(bodyString);
        body.setJson(bodyString);
        RequestData documentoRequestData = new RequestData(documentoEndpoint.getEnum(), documentoEndpoint.getEndpoint("provider"), body);
        DocumentoDAORest documentoDAO = new DocumentoDAORest(contexto, documentoRequestData);

        empresa.setCertidaoNegTributosMunicipaisMobi(documentoDAO.listarCertidaoNegTributosMunicipaisMobi());
        empresa.setCertidaoNegTributosEstaduais(documentoDAO.listarCertidaoNegTributosEstaduais());
        empresa.setCertidaoNegTributosFederais(documentoDAO.listarCertidaoNegTributosFederais());
        empresa.setCertidaoNegDebitosTrabalhistas(documentoDAO.listarCertidaoNegDebitosTrabalhistas());
        empresa.setCertidaoNegFalenciaEConcordata(documentoDAO.listarCertidaoNegFalenciaEConcordata());

        this.mapperParametro.setEmpresa(empresa);
    }

    private void setDadosSocio() throws Exception {

        ContextoImportacao contexto = this.mapperParametro.getContexto();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();
        SocioEndpoint socioEndpoint = new SocioEndpoint(contexto);
        Orgaos orgao = this.mapperParametro.getContexto().getOrgao();
        int organizationId = this.getOrganizationId(orgao);
        String bodyString = String.format("{\"organizationId\":%d, \"action\":\"listarSociosEmpresa\"}", organizationId);
        SocioBody body = new SocioBody("listarSociosEmpresa");
        body.setJson(bodyString);
        RequestData socioRequestData = new RequestData(socioEndpoint.getEnum(), socioEndpoint.getEndpoint("provider"), body);
        SocioDAORest socioDAO = new SocioDAORest(contexto, socioRequestData);
        List<SocioModel> socios = socioDAO.listarSociosEmpresa();

        empresa.setSocios(socios);

        this.mapperParametro.setEmpresa(empresa);
    }

    private void adicionaEmpresa() {
        List<EmpresaModel> empresasResposta = this.mapperParametro.getEmpresasResposta();
        EmpresaModel empresa = this.mapperParametro.getEmpresa();

        empresasResposta.add(empresa);

        this.mapperParametro.setEmpresasResposta(empresasResposta);
    }

    public void setCNPJs() throws Exception {

        ResultSet resultSet = this.mapperParametro.getResultSet();
        List<String> CNPJs = this.mapperParametro.getCNPJs();

        while (resultSet.next()) {
            CNPJs.add(resultSet.getString("sNrCnpj"));
        }

        resultSet.close();
        this.mapperParametro.setCNPJs(CNPJs);
    }

    @Override
    public EmpresaModel listar() {
        return this.mapperParametro.getEmpresaResposta();
    }

    @Override
    public List<EmpresaModel> listarTodos() {
        return this.mapperParametro.getEmpresasResposta();
    }
}
