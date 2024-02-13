package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;

public interface PregaoEletronicoPrazoDeEntregaDAOInterface {
    
    public PregaoEletronicoPrazoDeEntregaModel buscaPeloCodigoDoParadigma(Long codigoWBC) throws Exception;
}