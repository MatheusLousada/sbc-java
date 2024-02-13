package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.BancoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.BancoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.BancoResponse;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals.BancoEndpoint;

public class BancoDAORest extends AbstractDAORest<BancoModel, BancoMapperParametro, BancoResponse> implements BancoDAOInterface {

    private final AbstractEndpointsLicitar endpoint = new BancoEndpoint(super.getContextoImportacao());
    private final String endpointType = "provider";
    private BancoMapperParametro mapperParametro;

    public BancoDAORest() throws Exception {

        super.setParametro(this.mapperParametro);
        super.setRequestData(this.endpoint, this.endpointType);
    }

    public BancoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws Exception {

        super.setBodyCNPJ(Long.toString(codigoWBCEmpresa));
        return super.listar();
    }
}
