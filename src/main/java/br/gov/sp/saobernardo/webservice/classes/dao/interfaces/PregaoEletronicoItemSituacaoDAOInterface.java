package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemSituacao;
import java.sql.SQLException;

public interface PregaoEletronicoItemSituacaoDAOInterface {
    PregaoEletronicoItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException;
}
