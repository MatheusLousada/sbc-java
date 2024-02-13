package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.SocioMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;

public class SocioMapper extends AbstractMapper implements InterfaceMapper<SocioModel, SocioMapperParametro> {

    private SocioMapperParametro socioMapperParametro;

    public SocioMapper(SocioMapperParametro p) throws Exception {
        this.socioMapperParametro = p;
        setDados();
    }

    public void setDados() throws SQLException {

        ResultSet resultSet = this.socioMapperParametro.getResultSet();
        List<SocioModel> socios = new ArrayList<SocioModel>();

        while (resultSet.next()) {
            SocioModel socio = new SocioModel(resultSet.getString("sNrCPF"), resultSet.getString("sNmUsuarioTipo"), resultSet.getString("sNmUsuario"), resultSet.getString("sDsEmail"));
            socios.add(socio);
        }

        this.socioMapperParametro.setSocios(socios);
    }

    public ResultSet getResultSet() {
        return this.socioMapperParametro.getResultSet();
    }

    @Override
    public List<SocioModel> listarTodos() throws Exception {
        return this.socioMapperParametro.getSocios();
    }
}
