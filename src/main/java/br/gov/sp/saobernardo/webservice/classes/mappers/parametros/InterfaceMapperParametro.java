package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.responses.InterfaceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

/**
 * Interface InterfaceMapperParametro define um contrato para parâmetros utilizados em mappers.
 * Esta interface é genérica e pode ser adaptada para qualquer tipo de resposta que estenda InterfaceResponse.
 *
 * @param <T> O tipo de resposta que estende InterfaceResponse, indicando o tipo de dado que o mapper irá manipular.
 */
public interface InterfaceMapperParametro<T extends InterfaceResponse> {
    
    /**
     * Obtém o contexto de importação associado aos parâmetros do mapper.
     *
     * @return O contexto de importação atual.
     */
    ContextoImportacao getContexto();

    /**
     * Define uma lista de respostas para serem usadas pelo mapper.
     * 
     * @param response Uma lista de respostas do tipo T.
     */
    void setResponse(List<T> response);
    
    /**
     * Obtém a lista de respostas definida anteriormente.
     * 
     * @return Uma lista de respostas do tipo T.
     */
    List<T> getResponse();
}
