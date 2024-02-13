package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.EmpresaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.EmpresaMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.EmpresaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.*;
import br.gov.sp.saobernardo.webservice.classes.responses.EmpresaResponse;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.EmpresaEndpoint;

public class EmpresaDAORest extends AbstractDAORest<EmpresaModel, EmpresaMapperParametro, EmpresaResponse> implements EmpresaDAOInterface {

    private final AbstractEndpointsLicitar endpoint = new EmpresaEndpoint(super.getContextoImportacao());
    private final String endpointType = "provider";
    private List<EmpresaModel> empresas = new ArrayList<EmpresaModel>();
    private EmpresaMapper empresaMapper = new EmpresaMapper(super.getContextoImportacao(), this.empresas);
    private List<String> listaCnpjs = new ArrayList<>();
    private EmpresaMapperParametro mapperParametro;

    public EmpresaDAORest() throws Exception {

        super.setParametro(this.mapperParametro);
        super.setRequestData(this.endpoint, this.endpointType);
    }

    @Override
    public List<EmpresaModel> buscaTodasEmpresasAlteradasRecentemente() throws Exception {
        return this.getDadosEmpresas();
    }

    @Override
    public List<EmpresaModel> buscaTodasEmpresas() throws Exception {
        return this.getDadosEmpresas();
    }

    @Override
    public List<EmpresaModel> buscaDadosCadastraisDeEmpresas() throws Exception {
        return this.getDadosEmpresas();
    }

    @Override
    public List<EmpresaModel> buscaDadosCadastraisDeNovasEmpresas() throws Exception {
        return this.getDadosEmpresas();
    }

    @Override
    public EmpresaModel buscaPeloCnpj(String cnpj) throws Exception {
        return this.getDadosEmpresa();
    }

    @Override
    public EmpresaModel buscaNovoPeloCnpj(String cnpj) throws Exception {
        return this.getDadosEmpresa();
    }

    @Override
    public EmpresaModel buscaPeloCodigoDaParadigma(Long codigoWBC) throws Exception {

        super.setBodyCNPJ(Long.toString(codigoWBC));
        return this.getDadosEmpresa();
    }

    @Override
    public List<String> listaCnpj() throws Exception {

        this.setListaCNPJ();
        return this.listaCnpjs;
    }

    private void setListaCNPJ() throws Exception {

        List<String> listaCnpjs = new ArrayList<>();
        for (EmpresaModel empresa : this.getDadosEmpresas()) {
            listaCnpjs.add(empresa.getCnpj());
        }

        this.listaCnpjs = listaCnpjs;
    }

    private List<EmpresaModel> getDadosEmpresas() throws Exception {
        return empresaMapper.listarTodos();
    }

    private EmpresaModel getDadosEmpresa() throws Exception {
        
        EmpresaModel empresa = new EmpresaModel();
        EmpresaMapper empresaMapper = new EmpresaMapper(contexto, empresa);
        return empresaMapper.listar();
    }

    @Override
    public String toString() {
        return "EmpresaDAORest{" +
                "contexto=" + contexto +
                ", requestData=" + requestData +
                '}';
    }
}
