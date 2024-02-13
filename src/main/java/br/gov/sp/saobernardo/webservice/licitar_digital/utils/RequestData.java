package br.gov.sp.saobernardo.webservice.licitar_digital.utils;

import br.gov.sp.saobernardo.webservice.classes.bodys.AbstractBody;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;

/**
 * Classe RequestData para armazenar e gerenciar dados de uma requisição.
 * Esta classe mantém informações sobre o endpoint, o caminho (path) da requisição e o corpo (body) da mesma,
 * oferecendo métodos para definir e obter esses dados.
 */
public class RequestData {
    
    private EndpointsEnum endpoint;
    private String path;
    private AbstractBody body;

    /**
     * Construtor da classe RequestData.
     *
     * @param endpoint EndpointsEnum representando o endpoint para a requisição.
     * @param path String representando o caminho da requisição.
     */
    public RequestData(EndpointsEnum endpoint, String path) {
        this.setEndpoint(endpoint);
        this.setPath(path);
    }

    /**
     * Retorna o endpoint da requisição.
     *
     * @return EndpointsEnum representando o endpoint.
     */
    public EndpointsEnum getEndpoint() {
        return endpoint;
    }

    /**
     * Define o endpoint da requisição.
     *
     * @param endpoint EndpointsEnum para definir o endpoint da requisição.
     */
    private void setEndpoint(EndpointsEnum endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Retorna o caminho (path) da requisição.
     *
     * @return String representando o caminho da requisição.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Define o caminho (path) da requisição.
     *
     * @param path String representando o caminho a ser definido para a requisição.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Retorna o corpo (body) da requisição.
     *
     * @return AbstractBody representando o corpo da requisição.
     */
    public AbstractBody getBody() {
        return this.body;
    }

    /**
     * Define o corpo (body) da requisição.
     *
     * @param body AbstractBody representando o corpo a ser definido para a requisição.
     */
    public void setBody(AbstractBody body) {
        this.body = body;
    }

    /**
     * Retorna a representação JSON do corpo da requisição como String.
     *
     * @return String representando o JSON do corpo da requisição.
     */
    public String getStringJson() {
        return this.getBody().getJson().toString();
    }
}
