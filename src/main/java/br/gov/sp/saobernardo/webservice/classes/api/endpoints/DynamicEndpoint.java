package br.gov.sp.saobernardo.webservice.classes.api.endpoints;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.gov.sp.saobernardo.webservice.classes.api.abstracts.AbstractEndpoints;
import br.gov.sp.saobernardo.webservice.classes.factory.EndpointFactory;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

/**
 * Classe DynamicEndpoint responsável pela criação dinâmica de instâncias de endpoints.
 * Utiliza a reflexão Java para instanciar endpoints com base em valores de enumeração,
 * proporcionando flexibilidade e desacoplamento no processo de criação de endpoints.
 */
public class DynamicEndpoint {

    private ContextoImportacao ci;
    private EndpointsEnum endpoint;
    private RequestData requestData;
    private String endpointString;
    private Object instance;

    /**
     * Constrói uma instância de DynamicEndpoint com o contexto de importação,
     * o tipo de endpoint (enum) e os dados da requisição.
     *
     * @param ci ContextoImportacao, o contexto de importação atual.
     * @param endpoint EndpointsEnum, o tipo de endpoint a ser instanciado.
     * @param requestData RequestData, os dados necessários para a requisição.
     * @throws Exception Se ocorrer um erro na criação da instância do endpoint.
     */
    public DynamicEndpoint(ContextoImportacao ci, EndpointsEnum endpoint, RequestData requestData) throws Exception {
        this.ci = ci;
        this.endpoint = endpoint;
        this.endpointString = endpoint.toString();
        this.requestData = requestData;
        this.instance = createInstance();
    }

    /**
     * Cria uma instância do endpoint especificado usando reflexão.
     *
     * @return Uma instância do endpoint.
     * @throws Exception Se ocorrer um erro durante a criação da instância.
     */
    private Object createInstance() throws Exception {
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();
            Class<?> clazz = Class.forName("br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals." + endpointString, true, classLoader);
            Constructor<?> constructor = clazz.getConstructor(ContextoImportacao.class);
            return constructor.newInstance(ci);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Erro ao criar instância da classe: " + endpointString, e);
        }
    }

    /**
     * Retorna a instância do endpoint criado.
     *
     * @return A instância do endpoint.
     */
    public Object getInstance() {
        return instance;
    }

    /**
     * Gera um endpoint usando a fábrica de endpoints.
     * 
     * @return AbstractEndpoints, uma instância do endpoint gerado.
     * @throws Exception Se ocorrer um erro durante a geração do endpoint.
     */
    public AbstractEndpoints generate() throws Exception {
        try {
            EndpointFactory endpointFactory = new EndpointFactory(this.getClass().getClassLoader());
            return endpointFactory.createEndpoint(endpoint, ci);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Erro ao gerar endpoint: " + endpoint.name(), e);
        }
    }
}
