package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.UsuarioModel;

public interface UsuarioDAOInterface {
    UsuarioModel buscaPorCodigo(String codigoWBC) throws Exception;
}