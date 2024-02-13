package br.gov.sp.saobernardo.webservice.classes.factory;

import br.gov.sp.saobernardo.webservice.classes.api.abstracts.AbstractEndpoints;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.enums.EndpointsEnum;

import java.lang.reflect.Constructor;

/**
 * A classe EndpointFactory é responsável por criar instâncias de endpoints específicos 
 * em um serviço web. Utiliza técnicas de reflexão para carregar e instanciar dinamicamente as classes.
 */
public class EndpointFactory {

    private final ClassLoader classLoader;

    /**
     * Constrói uma instância de EndpointFactory com um classLoader específico.
     *
     * @param classLoader O ClassLoader usado para carregar classes de endpoints.
     */
    public EndpointFactory(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    /**
     * Cria uma instância de um endpoint baseado no Enum fornecido e no contexto de importação.
     * 
     * @param endpoint O tipo de endpoint a ser criado, conforme definido no enum EndpointsEnum.
     * @param ci O contexto de importação utilizado para criar o endpoint.
     * @return Uma instância de AbstractEndpoints correspondente ao tipo de endpoint solicitado.
     * @throws Exception Se a classe do endpoint não for encontrada ou não for uma subclasse de AbstractEndpoints.
     */
    public AbstractEndpoints createEndpoint(EndpointsEnum endpoint, ContextoImportacao ci) throws Exception {
        
        String className = "br.gov.sp.saobernardo.webservice.licitar_digital.endpoints.finals." + endpoint.name();

        try {
            Class<?> clazz = Class.forName(className, true, classLoader);

            // Verifica se a classe carregada é uma subclasse de AbstractEndpoints.
            if (!AbstractEndpoints.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("A classe " + className + " não é um AbstractEndpoints");
            }

            // Cria uma nova instância do endpoint usando o construtor que aceita ContextoImportacao.
            Constructor<?> constructor = clazz.getConstructor(ContextoImportacao.class);
            return (AbstractEndpoints) constructor.newInstance(ci);

        } catch (ClassNotFoundException e) {
            // Lança uma exceção se a classe do endpoint não for encontrada.
            throw new IllegalArgumentException("Classe não encontrada: " + className, e);
        }
    }
}
