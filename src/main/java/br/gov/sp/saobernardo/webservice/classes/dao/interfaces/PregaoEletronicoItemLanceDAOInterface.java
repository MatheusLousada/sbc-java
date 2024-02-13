package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import java.util.List;

public interface PregaoEletronicoItemLanceDAOInterface {
    List<PregaoEletronicoItemLanceModel> buscaPeloCodigoDoParadigma(Long codigoWBCPregao, Long codigoWBCItem) throws Exception;
}