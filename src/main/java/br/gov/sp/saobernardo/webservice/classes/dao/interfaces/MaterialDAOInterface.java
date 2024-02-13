package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import java.util.List;

public interface MaterialDAOInterface {
    List<MaterialModel> buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws Exception;
}