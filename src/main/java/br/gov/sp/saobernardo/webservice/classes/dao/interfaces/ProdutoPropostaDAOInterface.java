package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.proposta.PropostaModel;
import java.util.List;

public interface ProdutoPropostaDAOInterface {

    List<String> buscaCNPJsDeProcesso(String codigoProcesso) throws Exception;

    List<PropostaModel> buscaPropostasDeCNPJ(String codigoProcesso, String cnpj) throws Exception;
}
