package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.factory.ResponseFactory;
import br.gov.sp.saobernardo.webservice.classes.responses.InterfaceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;

/**
 * Classe abstrata AbstractMapper que implementa InterfaceMapper.
 * Responsável por mapear e processar dados entre diferentes formatos.
 *
 * @param <T> Tipo de dado de entrada.
 * @param <P> Tipo de parâmetro de mapeamento.
 * @param <R> Tipo de dado de resposta.
 */
public abstract class AbstractMapper<T, P, R> implements InterfaceMapper<T, P> {

    protected String stringReflexao;
    protected P mapperParametro;

    /**
     * Construtor que inicializa o mapper com um parâmetro específico.
     *
     * @param p O parâmetro de mapeamento a ser utilizado.
     * @throws Exception Se ocorrer um erro durante a inicialização.
     */
    public AbstractMapper(P p) throws Exception {
        this.mapperParametro = p;
        setDados();
    }

    /**
     * Método abstrato para obter o objeto mapeado em seu tipo específico.
     *
     * @return Um objeto do tipo R.
     * @throws Exception Se ocorrer um erro no mapeamento.
     */
    public abstract R getResponseCasted() throws Exception;

    /**
     * Método abstrato para obter o objeto mapeado em seu tipo específico.
     *
     * @return Um objeto do tipo R.
     * @throws Exception Se ocorrer um erro no mapeamento.
     */
    public abstract void setResponseCasted() throws Exception;

    /**
     * Obtém uma resposta castada de uma lista de respostas.
     * Verifica se a resposta é uma instância da classe esperada.
     *
     * @param responses Lista de respostas InterfaceResponse.
     * @return Uma resposta InterfaceResponse castada.
     */
    protected InterfaceResponse getCastedAbstract(List<? extends InterfaceResponse> responses) {
        for (InterfaceResponse response : responses) {
            try {
                if (ResponseFactory.createResponse(this.stringReflexao).getClass().isInstance(response)) {
                    return (InterfaceResponse) response;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Obtém o ID da organização com base no parâmetro de mapeamento.
     *
     * @return O ID da organização.
     */
    protected int getOrganizationId() {
        Orgaos orgao = ((ContextoImportacao) mapperParametro).getOrgao();
        return Buscador.getOrganizationId(orgao);
    }

    /**
     * Retorna o parâmetro de mapeamento atual.
     *
     * @return O parâmetro de mapeamento P.
     */
    protected P getParametro() {
        return this.mapperParametro;
    }

    /**
     * Define a string de reflexão usada para criar respostas.
     *
     * @param stringReflexao A string de reflexão a ser utilizada.
     */
    protected void setStringReflexao(String stringReflexao) {
        this.stringReflexao = stringReflexao;
    }

        /**
     * Cria um objeto RequestData com base em um endpoint e um caminho específico.
     *
     * @param endpoint O endpoint enum a ser utilizado.
     * @param path O caminho para o endpoint.
     * @return Uma instância de RequestData.
     */
    protected RequestData createRequestData(EndpointsEnum endpoint, String path) {
        return new RequestData(endpoint, path);
    }

    /**
     * Verifica se a resposta castada é uma instância da classe esperada.
     *
     * @param castedResponse A resposta castada a ser verificada.
     * @throws ClassNotFoundException Se a classe de resposta esperada não for encontrada.
     */
    protected void verificaInstancia(InterfaceResponse castedResponse) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(this.stringReflexao);
        if (!clazz.isInstance(castedResponse)) {
            throw new ClassCastException("O objeto retornado não é uma instância da classe " + this.stringReflexao + "Response");
        }
    }
}
