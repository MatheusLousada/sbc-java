package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoDeRegularidadeDoFGTS;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegDebitosTrabalhistas;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegFalenciaEConcordata;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosEstaduais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosFederais;
import br.gov.sp.saobernardo.webservice.classes.modelos.CertidaoNegTributosMunicipaisMobi;

public interface DocumentoDAOInterface {

    CertidaoNegTributosMunicipaisMobi buscaCertidaoNegTributosMunicipaisMobi(Long codigoWBCEmpresa) throws Exception;

    CertidaoNegTributosEstaduais buscaCertidaoNegTributosEstaduais(Long codigoWBCEmpresa) throws Exception;

    CertidaoNegTributosFederais buscaCertidaoNegTributosFederais(Long codigoWBCEmpresa) throws Exception;

    CertidaoNegDebitosTrabalhistas buscaCertidaoNegDebitosTrabalhistas(Long codigoWBCEmpresa) throws Exception;

    CertidaoNegFalenciaEConcordata buscaCertidaoNegFalenciaEConcordata(Long codigoWBCEmpresa) throws Exception;

    CertidaoDeRegularidadeDoFGTS buscaCertidaoRegularidadeDoGets(Long codigoWBCEmpresa) throws Exception;
}
