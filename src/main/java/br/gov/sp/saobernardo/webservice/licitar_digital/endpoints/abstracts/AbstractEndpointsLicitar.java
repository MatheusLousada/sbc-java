package br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts;

import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.api.EntidadeTokenMapping;
import br.gov.sp.saobernardo.webservice.classes.api.abstracts.AbstractEndpoints;
import br.gov.sp.saobernardo.webservice.classes.api.enums.AuthenticationTypeEnum;
import br.gov.sp.saobernardo.webservice.classes.api.enums.ContentTypeEnum;
import br.gov.sp.saobernardo.webservice.classes.api.enums.HttpMethodEnum;
import br.gov.sp.saobernardo.webservice.classes.api.enums.PlataformaEnum;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;

/**
 * Classe abstrata que define os endpoints para a plataforma LICITAR.
 * Esta classe estende AbstractEndpoints e é responsável por configurar e gerenciar
 * os endpoints específicos da plataforma LICITAR, incluindo autenticação e detalhes de requisição.
 */
public abstract class AbstractEndpointsLicitar extends AbstractEndpoints {

    /**
     * Método abstrato para obter um mapa de endpoints específicos.
     *
     * @return Mapa com pares chave-valor de endpoints.
     */
    public abstract Map<String, String> getEndpoints();

    /**
     * Construtor que define a plataforma e o contexto de importação.
     *
     * @param contexto ContextoImportacao que contém as configurações e parâmetros do contexto da importação.
     */
    public AbstractEndpointsLicitar(ContextoImportacao contexto) {
        super(PlataformaEnum.LICITAR, contexto);
    }

    /**
     * Obtém o Enum do endpoint correspondente à classe.
     *
     * @return EndpointsEnum correspondente à classe.
     */
    public EndpointsEnum getEnum() {
        EndpointsEnum endpointEnum = EndpointsEnum.valueOf(this.getClass().getSimpleName());
        return endpointEnum;
    }

    /**
     * Retorna a URL do endpoint especificado pelo nome.
     *
     * @param endpointName Nome do endpoint.
     * @return String com a URL do endpoint.
     */
    public String getEndpoint(String endpointName) {
        Map<String, String> endpoints = getEndpoints();
        return endpoints.get(endpointName);
    }

    // Os métodos subsequentes são implementações de métodos abstratos da classe base, 
    // fornecendo detalhes específicos para a plataforma LICITAR.

    @Override
    protected String getUrl() {
        return "http://localhost:8080/";
    }

    @Override
    protected Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", getAuthenticationType() + getAuthenticationToken());
        return headers;
    }

    @Override
    protected String getHttpMethod() {
        return String.valueOf(HttpMethodEnum.POST);
    }

    @Override
    protected String getAuthenticationType() {
        return AuthenticationTypeEnum.BASIC.getType();
    }

    @Override
    protected String getContentType() {
        return ContentTypeEnum.APPLICATION_JSON.getType();
    }

    @Override
    public String getAuthenticationToken() {
        return EntidadeTokenMapping.getTokenForEntidade(getContexto());
    }

    // Métodos protegidos para obter endpoints específicos para processos, produtos e fornecedores.

    protected Map<String, String> getEndpointsProcess() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("process", "api/v1/public/process");
        return endpoints;
    }

    protected Map<String, String> getEndpointsProduct() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("product", "api/v1/public/product");
        return endpoints;
    }

    protected Map<String, String> getEndpointsProvider() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("provider", "api/v1/public/provider");
        return endpoints;
    }
}
