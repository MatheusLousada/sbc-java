package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.DocumentoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.DocumentoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.*;
import br.gov.sp.saobernardo.webservice.classes.responses.DocumentoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class DocumentoDAORest extends AbstractDAORest<Certificado, DocumentoMapperParametro, DocumentoResponse> implements DocumentoDAOInterface {

    public DocumentoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    @Override
    public CertidaoNegTributosMunicipaisMobi buscaCertidaoNegTributosMunicipaisMobi(Long codigoWBCEmpresa) throws Exception {
        CertidaoNegTributosMunicipaisMobi certidao = new CertidaoNegTributosMunicipaisMobi();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    @Override
    public CertidaoNegTributosEstaduais buscaCertidaoNegTributosEstaduais(Long codigoWBCEmpresa) throws Exception {
        CertidaoNegTributosEstaduais certidao = new CertidaoNegTributosEstaduais();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    @Override
    public CertidaoNegTributosFederais buscaCertidaoNegTributosFederais(Long codigoWBCEmpresa) throws Exception {
        CertidaoNegTributosFederais certidao = new CertidaoNegTributosFederais();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    @Override
    public CertidaoNegDebitosTrabalhistas buscaCertidaoNegDebitosTrabalhistas(Long codigoWBCEmpresa) throws Exception {
        CertidaoNegDebitosTrabalhistas certidao = new CertidaoNegDebitosTrabalhistas();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    @Override
    public CertidaoNegFalenciaEConcordata buscaCertidaoNegFalenciaEConcordata(Long codigoWBCEmpresa) throws Exception {
        CertidaoNegFalenciaEConcordata certidao = new CertidaoNegFalenciaEConcordata();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    @Override
    public CertidaoDeRegularidadeDoFGTS buscaCertidaoRegularidadeDoGets(Long codigoWBCEmpresa) throws Exception {
        CertidaoDeRegularidadeDoFGTS certidao = new CertidaoDeRegularidadeDoFGTS();
        certidao.setDataDeValidade(getDataValidade());
        return certidao;
    }

    private String getDataValidade() throws Exception {
        // Aqui você precisa implementar a lógica para obter a data de validade
        return null;
    }
}
