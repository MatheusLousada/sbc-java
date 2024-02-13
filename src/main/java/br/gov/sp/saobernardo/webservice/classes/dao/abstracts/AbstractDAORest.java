package br.gov.sp.saobernardo.webservice.classes.dao.abstracts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.bodys.AbstractBody;
import br.gov.sp.saobernardo.webservice.classes.dao.rest.DAORest;
import br.gov.sp.saobernardo.webservice.classes.mappers.InterfaceMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.InterfaceMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

/**
 * Classe abstrata para criar e gerenciar DAOs REST genéricos.
 * Fornece métodos para configuração de parâmetros, request data, e operações de
 * listagem.
 * Utiliza reflexão para criar instâncias de mapeadores e classes relacionadas.
 *
 * @param <I> Tipo genérico para a entrada.
 * @param <P> Tipo genérico para o parâmetro que estende
 *            InterfaceMapperParametro.
 * @param <T> Tipo genérico para a saída.
 */
public abstract class AbstractDAORest<I, P extends InterfaceMapperParametro, T> {

    protected ContextoImportacao contexto;
    protected RequestData requestData;
    protected DAORest<T> dao;
    protected P parametro;
    protected String mapperClassName;
    protected Class<?> mapperClass;

    /**
     * Construtor padrão que pode lançar exceção.
     */
    public AbstractDAORest() throws Exception {
    }

    /**
     * Construtor que inicializa o contexto e os dados de requisição.
     *
     * @param contexto    Contexto de importação a ser utilizado.
     * @param requestData Dados da requisição.
     * @throws Exception Se ocorrer algum erro durante a inicialização.
     */
    public AbstractDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        this.contexto = contexto;
        this.requestData = requestData;
    }

    protected void setParametro(P parametro) throws Exception {
        this.parametro = parametro;
        this.mapperClassName = this.parametro.getClass().getSimpleName().replace("Parametro", "");
        this.mapperClass = Class.forName("br.gov.sp.saobernardo.webservice.classes.mappers." + this.mapperClassName);
        this.dao = new DAORest(this.contexto, this.requestData,
                this.parametro.getClass().getSimpleName().replace("MapperParametro", ""));
    }

    protected void setRequestData(AbstractEndpointsLicitar e, String endpointString) throws Exception {
        this.requestData = this.getRequestDataInstance(e, endpointString);
    }

    private RequestData getRequestDataInstance(AbstractEndpointsLicitar endpoint, String endpointString)
            throws Exception {
        return new RequestData(endpoint.getEnum(), endpoint.getEndpoint(endpointString));
    }

    public ContextoImportacao getContextoImportacao() {
        return this.contexto;
    }

    public P getParametro() {
        return this.parametro;
    }

    protected I listar() throws Exception {
        InterfaceMapper<I, P> mapper = createMapperInstance();
        return mapper.listar();
    }

    protected List<I> listarTodos() throws Exception {
        InterfaceMapper<I, P> mapper = createMapperInstance();
        return mapper.listarTodos();
    }

    protected DAORest<T> getDaoRest() throws Exception {
        return this.dao;
    }

    protected RequestData getRequestData() throws Exception {
        return this.requestData;
    }

    protected void setResponse() throws Exception {
        List<T> response = this.getDaoRest().getResponse();
        this.parametro.setResponse(response);
    }

    protected void updateBodyJson(String json) throws Exception {
        AbstractBody body = this.getRequestData().getBody();
        body.updateJson(json);
    }

    protected void setBodyCNPJ(String codigo) throws Exception {

        String cnpj = Buscador.getCnpj(codigo);
        String json = String.format("{\"cnpj\":\"%s\"}", cnpj);

        this.updateBodyJson(json);
        this.setResponse();
    }

    /**
     * Cria uma instância do InterfaceMapper usando reflexão.
     * 
     * @return Uma instância de InterfaceMapper.
     * @throws Exception Se ocorrer um erro de reflexão ou de invocação.
     */
    private InterfaceMapper<I, P> createMapperInstance() throws Exception {

        try {

            Constructor<?> constructor = this.mapperClass.getDeclaredConstructor(this.parametro.getClass());
            return (InterfaceMapper<I, P>) constructor.newInstance(this.parametro);

        } catch (InvocationTargetException e) {

            Throwable targetException = e.getTargetException();
            System.out.println("Erro ao invocar método: " + targetException.getMessage());
            targetException.printStackTrace();
            throw new Exception(targetException);

        } catch (Exception e) {

            System.out.println("Erro ao criar instância do mapper: " + e.getMessage());
            e.printStackTrace();
            throw e;

        }
    }
}
