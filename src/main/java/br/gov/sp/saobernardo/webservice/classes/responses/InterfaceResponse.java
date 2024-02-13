package br.gov.sp.saobernardo.webservice.classes.responses;

/**
 * Interface InterfaceResponse representa uma resposta genérica para serviços web.
 * Esta interface define métodos para obter uma instância de uma resposta de interface
 */
public interface InterfaceResponse {

    /**
     * Método para obter uma instância de InterfaceResponse.
     * Este método é destinado a fornecer acesso a uma implementação específica da interface de resposta.
     *
     * @return Uma instância de InterfaceResponse.
     */
    public InterfaceResponse getInterface();
}
