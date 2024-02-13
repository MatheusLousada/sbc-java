package br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals;

import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.abstracts.AbstractEndpointsLicitar;

/**
 * Classe final BancoEndpoint que estende AbstractEndpointsLicitar.
 * Esta classe é responsável por definir e gerenciar os endpoints específicos para bancos
 * na plataforma LICITAR, utilizando o contexto de importação fornecido.
 */
final public class BancoEndpoint extends AbstractEndpointsLicitar {

    /**
     * Construtor da classe BancoEndpoint.
     *
     * @param contexto ContextoImportacao que contém as configurações e parâmetros do contexto da importação.
     *                 Utilizado para inicializar a classe base AbstractEndpointsLicitar com a plataforma LICITAR.
     */
    public BancoEndpoint(ContextoImportacao contexto) {
        super(contexto);
    }

    /**
     * Implementa o método getEndpoints da classe base para retornar um mapa de endpoints específicos para bancos.
     * Este método utiliza getEndpointsProvider da classe base para obter os endpoints.
     *
     * @return Mapa com pares chave-valor de endpoints específicos para bancos.
     */
    @Override
    public Map<String, String> getEndpoints() {
        return this.getEndpointsProvider();
    }
}
