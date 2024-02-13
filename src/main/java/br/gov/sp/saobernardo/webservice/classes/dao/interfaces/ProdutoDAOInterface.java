package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;

public interface ProdutoDAOInterface {
    ProdutoModel buscaProdutoPeloCodigoParadigma(Long nCdProduto) throws Exception;
}
