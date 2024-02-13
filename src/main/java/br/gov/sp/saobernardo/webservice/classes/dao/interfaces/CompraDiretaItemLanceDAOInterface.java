package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;

public interface CompraDiretaItemLanceDAOInterface {
    
    List<CompraDiretaItemLanceModel> buscaPeloCodigoDoParadigma(Long codigoWBCCompraDireta, Long codigoWBCItem) throws Exception;
}