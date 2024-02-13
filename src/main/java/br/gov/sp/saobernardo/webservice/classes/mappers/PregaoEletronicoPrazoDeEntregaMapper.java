package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoPrazoDeEntregaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;

public class PregaoEletronicoPrazoDeEntregaMapper extends AbstractMapper implements InterfaceMapper<PregaoEletronicoPrazoDeEntregaModel, PregaoEletronicoPrazoDeEntregaMapperParametro> {

    private PregaoEletronicoPrazoDeEntregaMapperParametro pregaoEletronicoPrazoDeEntregaParametro;

    public PregaoEletronicoPrazoDeEntregaMapper(PregaoEletronicoPrazoDeEntregaMapperParametro p) throws Exception {
        this.pregaoEletronicoPrazoDeEntregaParametro = p;
        setDados();
    }

    @Override
    public void setDados() throws SQLException {

        ResultSet resultSet = this.pregaoEletronicoPrazoDeEntregaParametro.getResultSet();
        PregaoEletronicoPrazoDeEntregaModel pregao = this.pregaoEletronicoPrazoDeEntregaParametro.getPregrao();

        while (resultSet.next()) {
            pregao.setCodigo(resultSet.getInt("nCdPrazoEntrega"));
            pregao.setDescricao(resultSet.getString("sDsPrazoEntrega"));
            pregao.setNumeroDeDias(resultSet.getInt("nNrDias"));
        }
        
        resultSet.close();
        this.pregaoEletronicoPrazoDeEntregaParametro.setPregrao(pregao);
    }

    @Override
    public PregaoEletronicoPrazoDeEntregaModel listar() {
        return this.pregaoEletronicoPrazoDeEntregaParametro.getPregrao();
    }
}
