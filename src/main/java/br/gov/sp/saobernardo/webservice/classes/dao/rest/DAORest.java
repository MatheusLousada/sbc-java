package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.List;
import br.gov.sp.saobernardo.webservice.classes.api.Api;
import br.gov.sp.saobernardo.webservice.classes.parsers.JsonToArrayParser;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

/**
 * Classe DAORest responsável por gerenciar requisições REST e processar respostas.
 *
 * @param <R> O tipo de resposta que este DAO irá gerar e manipular.
 */
public class DAORest<R> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private Api api;
    private List<R> response;
    private String className;

    /**
     * Construtor que inicializa o DAO com contexto, dados da requisição e nome da classe.
     * Cria uma instância da Api e inicia o processo de resposta.
     *
     * @param contexto O contexto de importação a ser utilizado.
     * @param requestData Dados da requisição, incluindo endpoint e corpo da requisição.
     * @param className O nome da classe usada para a deserialização da resposta.
     * @throws Exception Se ocorrer um erro na criação da Api ou no processamento da resposta.
     */
    public DAORest(ContextoImportacao contexto, RequestData requestData, String className) throws Exception {
        
        this.contexto = contexto;
        this.requestData = requestData;
        this.api = new Api(this.contexto, this.requestData);
        this.className = className;
        
        setResponse();
    }

    /**
     * Retorna a lista de objetos do tipo R como resposta da requisição REST.
     *
     * @return Uma lista de objetos do tipo R.
     */
    public List<R> getResponse() {
        return this.response;
    }

    /**
     * Configura a resposta do DAO após realizar a requisição REST.
     * Usa a classe JsonToArrayParser para deserializar a resposta JSON em uma lista de objetos do tipo R.
     * 
     * @throws Exception Se ocorrer um erro na requisição ou na deserialização.
     */
    private void setResponse() throws Exception {
        try {
            String jsonResponse = this.api.makeRequest();
            this.response = JsonToArrayParser.parse(jsonResponse, this.className, this.getAction());
        } catch (Exception e) {
            System.out.println("error setResponse:");
            System.out.println(e);
            throw e;
        }
    }

    /**
     * Retorna os dados da requisição atual.
     *
     * @return Uma instância de RequestData com as informações da requisição.
     */
    public RequestData getRequestData() {
        return this.requestData;
    }

    /**
     * Obtém a ação do corpo da requisição para uso na deserialização.
     * 
     * @return Uma string representando a ação contida no corpo da requisição.
     */
    private String getAction() {
        return this.getRequestData().getBody().getAction();
    }
}
