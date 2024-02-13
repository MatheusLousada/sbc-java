package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;

public interface CategoriaDAOInterface {
    
    public CategoriaModel buscaPeloCodigoDoParadigma(Long nCdProduto) throws Exception;
}
