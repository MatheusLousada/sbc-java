package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.UnidadeDeMedidaModel;
import java.sql.SQLException;

public interface UnidadeDeMedidaDAOInterface {
    UnidadeDeMedidaModel buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException;
}
