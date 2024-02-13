package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.util.List;

/**
 * Interface genérica InterfaceMapper para mapeamento de dados.
 * Esta interface é projetada para fornecer um modelo para mapeamento de dados
 * entre diferentes tipos de objetos.
 *
 * @param <I> O tipo de dado de entrada que será mapeado.
 * @param <P> O tipo de dado de saída resultante do mapeamento.
 */
public interface InterfaceMapper<I, P> {
    
    /**
     * Método para configurar os dados antes do processo de mapeamento.
     * Este método deve ser implementado pelas classes que utilizam a InterfaceMapper
     * para definir como os dados de entrada são preparados ou validados.
     *
     * @throws Exception Se ocorrer um erro na configuração dos dados.
     */
    void setDados() throws Exception;

    /**
     * Método padrão para listar um único objeto do tipo de entrada.
     * Este método oferece uma operação de listagem padrão, podendo ser sobrescrito
     * pelas classes implementadoras para fornecer uma funcionalidade específica.
     *
     * @return Um objeto do tipo I.
     * @throws Exception Se ocorrer um erro durante a listagem.
     * @throws UnsupportedOperationException Se o método não for implementado.
     */
    default I listar() throws Exception {
        throw new UnsupportedOperationException("Método listar() não implementado");
    }

    /**
     * Método padrão para listar todos os objetos do tipo de entrada.
     * Semelhante ao método listar(), este método pode ser sobrescrito pelas classes
     * implementadoras para realizar uma listagem completa dos objetos.
     *
     * @return Uma lista de objetos do tipo I.
     * @throws Exception Se ocorrer um erro durante a listagem.
     * @throws UnsupportedOperationException Se o método não for implementado.
     */
    default List<I> listarTodos() throws Exception {
        throw new UnsupportedOperationException("Método listarTodos() não implementado");
    }
}
