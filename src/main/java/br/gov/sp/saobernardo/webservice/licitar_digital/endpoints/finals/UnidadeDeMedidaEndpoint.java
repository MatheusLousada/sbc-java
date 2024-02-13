package br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals;

import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;

final public class UnidadeDeMedidaEndpoint extends AbstractEndpointsLicitar {

    public UnidadeDeMedidaEndpoint(ContextoImportacao contexto) {
        super(contexto);
    }

    @Override
    public Map<String, String> getEndpoints() {
        return this.getEndpointsProduct();
    }
}
