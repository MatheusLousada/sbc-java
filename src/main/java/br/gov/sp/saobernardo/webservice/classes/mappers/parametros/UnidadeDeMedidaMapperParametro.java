package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

public class UnidadeDeMedidaMapperParametro implements InterfaceMapperParametro<UnidadeDeMedidaResponse> {

    private UnidadeDeMedidaModel unidadeDeMedida;
    private List<UnidadeDeMedidaResponse> response;

    public UnidadeDeMedidaMapperParametro(UnidadeDeMedidaModel unidadeDeMedida, ResultSet resultSet) {
        this.unidadeDeMedida = unidadeDeMedida;
        this.resultSet = resultSet;
    }

    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }
    
    @Override
    public List<UnidadeDeMedidaResponse> getResponse() {
        return this.response;
    }

    @Override
    public void setResponse(List<UnidadeDeMedidaResponse> response) {
        this.response = response;
    }

    public UnidadeDeMedidaModel getUnidadeDeMedida() {
        return this.unidadeDeMedida;
    }

    public void setUnidadeDeMedida(UnidadeDeMedidaModel unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }
}
