package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.sql.SQLException;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;

public interface CompraDiretaItemSituacaoDAOInterface {

    CompraDiretaItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws SQLException, Exception;
}
