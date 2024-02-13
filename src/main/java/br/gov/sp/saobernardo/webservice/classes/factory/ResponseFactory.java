package br.gov.sp.saobernardo.webservice.classes.factory;

import br.gov.sp.saobernardo.webservice.classes.responses.InterfaceResponse;

/**
 * A classe ResponseFactory é responsável por criar instâncias de respostas para serviços web.
 * Ela usa reflexão para instanciar dinamicamente classes de resposta baseadas em uma string fornecida.
 */
public class ResponseFactory {

    /**
     * Cria uma instância de InterfaceResponse com base no nome da classe fornecido.
     * Este método usa reflexão para carregar e instanciar a classe de resposta.
     *
     * @param typeResponse O nome completo da classe de resposta a ser instanciada.
     * @return Uma instância de InterfaceResponse.
     * @throws Exception Se a classe não for encontrada ou não for uma subclasse de InterfaceResponse.
     */
    public static InterfaceResponse createResponse(String typeResponse) throws Exception {
        try {
            // Carrega a classe usando o nome fornecido.
            Class<?> clazz = Class.forName(typeResponse);

            // Verifica se a classe é uma implementação de InterfaceResponse.
            if (!InterfaceResponse.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("A classe " + typeResponse + " não é um InterfaceResponse");
            }

            // Cria uma nova instância da classe de resposta.
            return (InterfaceResponse) clazz.newInstance();

        } catch (ClassNotFoundException e) {
            // Lança uma exceção se a classe não for encontrada.
            throw new IllegalArgumentException("Classe não encontrada: " + typeResponse, e);
        }
    }
}
