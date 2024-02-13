package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import java.sql.SQLException;

public interface PregaoEletronicoItemPropostaDAOInterface {
    PregaoEletronicoItemProposta buscaPeloCodigoDoParadigma(Long codigoWBCItem, Long codigoWBCEmpresa) throws SQLException;
}
