package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.sql.SQLException;

import br.gov.sp.saobernardo.webservice.classes.modelos.OcupacaoModel;

public interface OcupacaoDAOInterface {

    OcupacaoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws SQLException;
}
