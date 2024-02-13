package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.UnidadeDeMedidaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;

public class UnidadeDeMedidaMapper extends AbstractMapper implements InterfaceMapper<UnidadeDeMedidaModel, UnidadeDeMedidaMapperParametro> {

    private UnidadeDeMedidaMapperParametro unidadeDeMedidaMapperParametro;

    public UnidadeDeMedidaMapper(UnidadeDeMedidaMapperParametro p) throws Exception {
        this.unidadeDeMedidaMapperParametro = p;
        setDados();
    }

    @Override
    public void setDados() throws Exception {

        ResultSet resultSet = this.unidadeDeMedidaMapperParametro.getResultSet();
        UnidadeDeMedidaModel unidadeDeMedida = this.unidadeDeMedidaMapperParametro.getUnidadeDeMedida();
        
        while (resultSet.next()) {

            final String sDsUnidadeMedida = resultSet.getString("sDsUnidadeMedida");
            final String sSgUnidadeMedida = resultSet.getString("sSgUnidadeMedida");

            unidadeDeMedida.setCodigo(unidadeDeMedida.getCodigo());
            unidadeDeMedida.setDescricao(sDsUnidadeMedida);
            unidadeDeMedida.setSigla(sSgUnidadeMedida);
        }

        resultSet.close();
        this.unidadeDeMedidaMapperParametro.setUnidadeDeMedida(unidadeDeMedida);
    }

    public ResultSet getResultSet() {
        return this.unidadeDeMedidaMapperParametro.getResultSet();
    }

    @Override
    public UnidadeDeMedidaModel listar() throws Exception {
        return this.unidadeDeMedidaMapperParametro.getUnidadeDeMedida();
    }
}
