package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import java.sql.SQLException;
import java.util.List;

public interface SocioDAOInterface {
    List<SocioModel> buscaSocios(Long codigoWBCEmpresa) throws SQLException;
}
