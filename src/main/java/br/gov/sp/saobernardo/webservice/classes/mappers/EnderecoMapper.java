package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.EnderecoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;

public class EnderecoMapper extends AbstractMapper<EnderecoModel, EnderecoMapperParametro, EnderecoResponse> {

    private EnderecoMapperParametro enderecoMapperParametro;

    public EnderecoMapper(EnderecoMapperParametro p) throws Exception {
        this.enderecoMapperParametro = p;
        setDados();
    }

    @Override
    public void setDados() throws SQLException {

        ResultSet resultSet = this.enderecoMapperParametro.getResultSet();
        EnderecoModel endereco = this.enderecoMapperParametro.getEndereco();

        while (resultSet.next()) {
            endereco.setBairro(resultSet.getString("sNmBairro"));
            endereco.setNumero(resultSet.getString("sNrEndereco"));
            endereco.setCep(resultSet.getString("sCdCep"));
            endereco.setCidade(resultSet.getString("nCdCidade"));
            endereco.setDescricao(resultSet.getString("sDsEndereco"));
            endereco.setComplemento(resultSet.getString("sDsComplemento"));
            endereco.setSiglaPais(resultSet.getString("sCdPais"));
            endereco.setTipoEndereco(resultSet.getLong("tipoEndereco"));
            endereco.setUf(resultSet.getString("sCdEstado"));
        }

        resultSet.close();
    }

    @Override
    public EnderecoModel listar() {
        return this.enderecoMapperParametro.getEndereco();
    }
}
