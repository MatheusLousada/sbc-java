package br.gov.sp.saobernardo.webservice.classes.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.gov.sp.saobernardo.webservice.classes.mappers.InterfaceMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.InterfaceMapperParametro;

/**
 * A classe MapperFactory é responsável por criar instâncias de mappers.
 * Esses mappers são usados para converter ou mapear dados de uma forma para outra.
 * 
 * @param <I> Tipo de entrada que o mapper irá processar.
 * @param <P> Tipo do parâmetro que será usado pelo mapper, deve estender InterfaceMapperParametro.
 */
public class MapperFactory<I, P extends InterfaceMapperParametro> {

    private final Class<? extends InterfaceMapper<I, P>> mapperClass;
    private final P parametro;

    /**
     * Constrói uma instância de MapperFactory.
     *
     * @param mapperClass A classe do mapper a ser instanciada, deve implementar InterfaceMapper.
     * @param parametro O parâmetro necessário para a construção do mapper.
     */
    public MapperFactory(Class<? extends InterfaceMapper<I, P>> mapperClass, P parametro) {
        this.mapperClass = mapperClass;
        this.parametro = parametro;
    }

    /**
     * Cria uma instância do mapper especificado.
     * 
     * @return Uma instância do mapper.
     * @throws Exception Se ocorrer algum erro na criação da instância do mapper.
     */
    public InterfaceMapper<I, P> createMapperInstance() throws Exception {

        try {
            // Tenta criar uma nova instância do mapper usando reflexão.
            Constructor<? extends InterfaceMapper<I, P>> constructor = mapperClass.getDeclaredConstructor(parametro.getClass());
            return constructor.newInstance(parametro);

        } catch (InvocationTargetException e) {
            // Captura exceções lançadas pelo método invocado e as propaga.
            Throwable targetException = e.getTargetException();
            System.out.println("Erro ao invocar método: " + targetException.getMessage());
            targetException.printStackTrace();
            throw new Exception(targetException);

        } catch (Exception e) {
            // Captura e propaga qualquer outra exceção que possa ocorrer.
            System.out.println("Erro ao criar instância do mapper: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
