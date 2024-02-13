package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.EnderecoModel;

public interface EnderecoDAOInterface {

    public EnderecoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa, Long codigoWBCTipo) throws Exception;
}