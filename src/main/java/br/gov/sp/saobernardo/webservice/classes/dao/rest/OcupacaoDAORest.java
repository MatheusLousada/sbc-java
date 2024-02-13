package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.OcupacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.OcupacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.*;
import br.gov.sp.saobernardo.webservice.classes.responses.OcupacaoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class OcupacaoDAORest extends AbstractDAORest<OcupacaoModel, OcupacaoMapperParametro, OcupacaoResponse> implements OcupacaoDAOInterface {

    public OcupacaoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }
}
