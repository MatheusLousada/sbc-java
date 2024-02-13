package br.gov.sp.saobernardo.webservice.classes.api.abstracts;

import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.api.connections.ApiConnection;
import br.gov.sp.saobernardo.webservice.classes.api.enums.PlataformaEnum;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;

/**
 * Classe abstrata AbstractEndpoints que define a estrutura básica para os endpoints.
 * Esta classe é uma extensão de ApiConnection e fornece um framework para a criação
 * de endpoints específicos em diferentes plataformas.
 */
public abstract class AbstractEndpoints extends ApiConnection {

    private final PlataformaEnum plataforma;
    private final ContextoImportacao contexto;

    /**
     * Construtor da classe AbstractEndpoints.
     *
     * @param plataforma PlataformaEnum, a plataforma para a qual o endpoint está sendo criado.
     * @param contexto ContextoImportacao, o contexto atual de importação.
     */
    public AbstractEndpoints(PlataformaEnum plataforma, ContextoImportacao contexto) {
        this.plataforma = plataforma;
        this.contexto = contexto;
    }

    /**
     * Retorna a plataforma do endpoint.
     *
     * @return PlataformaEnum, a plataforma do endpoint.
     */
    public PlataformaEnum getPlataforma() {
        return plataforma;
    }

    /**
     * Retorna o contexto de importação.
     *
     * @return ContextoImportacao, o contexto atual de importação.
     */
    public ContextoImportacao getContexto() {
        return contexto;
    }

    protected abstract String getUrl();

    protected abstract Map<String, String> getHeaders();

    protected abstract String getAuthenticationToken();

    protected abstract String getHttpMethod();

    protected abstract String getAuthenticationType();

    protected abstract String getContentType();

    /**
     * Faz uma requisição para a API usando as informações fornecidas pela classe concreta.
     * 
     * @param path O caminho para o recurso na API.
     * @param body O corpo da requisição.
     * @return Uma string com a resposta da requisição.
     */
    public String makeApiRequest(String path, String body) {
        String url = this.getUrl();

        // Adiciona o caminho ao URL para endpoints do tipo AbstractEndpointsLicitar.
        if (this instanceof AbstractEndpointsLicitar) {
            url += path;
        }

        Map<String, String> headers = getHeaders();
        String httpMethod = getHttpMethod();
        String contentType = getContentType();

        return makeRequest(url, httpMethod, headers, contentType, body);
    }
}
