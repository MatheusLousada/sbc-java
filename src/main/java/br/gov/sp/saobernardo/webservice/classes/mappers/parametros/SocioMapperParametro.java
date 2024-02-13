package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.sql.ResultSet;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.classes.responses.ProdutoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class SocioMapperParametro implements InterfaceMapperParametro<SocioResponse> {

    private ContextoImportacao contexto;
    private List<SocioModel> socios;
    private List<SocioResponse> response;

    public SocioMapperParametro(ContextoImportacao contexto, List<SocioModel> socios) {
        this.contexto = contexto;
        this.socios = socios;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }
    
    @Override
    public List<SocioResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<SocioResponse> response) {
        this.response = response;
    }

    public List<SocioModel> getSocios() {
        return this.socios;
    }

    public void setSocios(List<SocioModel> socios) {
        this.socios = socios;
    }
}
