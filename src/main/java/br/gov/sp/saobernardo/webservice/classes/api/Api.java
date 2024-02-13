package br.gov.sp.saobernardo.webservice.classes.api;

import br.gov.sp.saobernardo.webservice.classes.api.abstracts.AbstractEndpoints;
import br.gov.sp.saobernardo.webservice.classes.api.endpoints.DynamicEndpoint;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

/**
 * Classe Api responsável por gerenciar as requisições para diferentes endpoints.
 * Esta classe utiliza um Contexto de Importação e dados de requisição para gerar e processar
 * as requisições para endpoints dinâmicos.
 */
public class Api {
    private final ContextoImportacao ci;
    private final RequestData requestData;

    /**
     * Construtor da classe Api.
     *
     * @param ci ContextoImportacao que contém as configurações e parâmetros do contexto da importação.
     * @param requestData RequestData que contém os dados necessários para fazer a requisição.
     */
    public Api(ContextoImportacao ci, RequestData requestData) {
        this.ci = ci;
        this.requestData = requestData;
    }

    /**
     * Faz uma requisição para o endpoint especificado nos dados de requisição.
     * 
     * @return Uma string com a resposta do endpoint.
     * @throws Exception Se ocorrer um erro durante a geração do endpoint ou na requisição.
     */
    public String makeRequest() throws Exception {
        AbstractEndpoints endpoint = this.generateEndpoint();
        return endpoint.makeApiRequest(this.requestData.getPath(), this.requestData.getStringJson());
    }

    /**
     * Retorna os dados de requisição.
     *
     * @return RequestData com os dados da requisição.
     */
    public RequestData getRequestData() {
        return this.requestData;
    }

    /**
     * Gera um endpoint dinâmico com base no Enum de endpoints.
     *
     * @param endpoint Enum representando o endpoint desejado.
     * @return Um AbstractEndpoints que representa o endpoint dinâmico.
     * @throws Exception Se ocorrer um erro na geração do endpoint.
     */
    private AbstractEndpoints generateEndpointDynamicEndpoint(EndpointsEnum endpoint) throws Exception {
        DynamicEndpoint DynamicEndpoint = new DynamicEndpoint(ci, endpoint, requestData);
        return DynamicEndpoint.generate();
    }

    /**
     * Gera um endpoint com base nos dados de requisição.
     *
     * @return AbstractEndpoints gerado com base no tipo de endpoint especificado nos dados de requisição.
     * @throws Exception Se ocorrer um erro na geração do endpoint.
     */
    private AbstractEndpoints generateEndpoint() throws Exception {
        EndpointsEnum endpoint = this.requestData.getEndpoint();
        AbstractEndpoints generatedClass = this.generateEndpointDynamicEndpoint(endpoint);
        return generatedClass;
    }
}
