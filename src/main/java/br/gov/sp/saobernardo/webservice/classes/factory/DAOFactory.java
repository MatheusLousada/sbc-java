package br.gov.sp.saobernardo.webservice.classes.factory;

import java.lang.reflect.Constructor;
import java.sql.Connection;

/**
 * Classe DAOFactory responsável por criar instâncias de DAOs baseados no tipo especificado.
 * Utiliza reflexão para determinar e instanciar a classe DAO apropriada.
 */
public class DAOFactory {

    private Class<?> daoClass;
    private Connection connection;
    private boolean imprimirSQL;
    private String tipoDAO;
    private Object DAOinstance;

    /**
     * Construtor que inicializa a fábrica de DAO com conexão, opção de impressão de SQL e tipo de DAO.
     * Configura a classe DAO a ser instanciada com base no tipo especificado.
     *
     * @param connection Conexão SQL para DAOs que necessitam de uma conexão de banco de dados.
     * @param imprimirSQL Booleano para indicar se as consultas SQL devem ser impressas (usado principalmente para DAOs do tipo 'PARADIGMA').
     * @param tipoDAO Tipo de DAO a ser criado ('REST' ou 'PARADIGMA').
     * @throws Exception Se ocorrer um erro na configuração da classe DAO.
     */
    public DAOFactory(Connection connection, boolean imprimirSQL, String tipoDAO) throws Exception {
        this.tipoDAO = tipoDAO;
        this.setDAOClass();
        this.connection = connection;
        this.imprimirSQL = imprimirSQL;
    }

    /**
     * Construtor para inicializar a fábrica de DAO somente com o tipo de DAO.
     * Configura a classe DAO a ser instanciada sem necessitar de uma conexão de banco de dados.
     *
     * @param tipoDAO Tipo de DAO a ser criado ('REST' ou 'PARADIGMA').
     * @throws Exception Se ocorrer um erro na configuração da classe DAO.
     */
    public DAOFactory(String tipoDAO) throws Exception {
        this.tipoDAO = tipoDAO;
        this.setDAOClass();
    }

    /**
     * Retorna uma instância do DAO criado.
     *
     * @return Uma instância do DAO.
     * @throws Exception Se ocorrer um erro na criação da instância do DAO.
     */
    public Object getDAOInstance() throws Exception {
        return this.DAOinstance;
    }

    /**
     * Cria e configura a instância do DAO com base no tipo de DAO especificado.
     * Utiliza reflexão para criar a instância apropriada.
     * 
     * @throws Exception Se ocorrer um erro na criação da instância do DAO.
     */
    public void setDAOInstace() throws Exception {

        try {

            Object instance = null;
            Constructor<?> constructor;

            switch (this.tipoDAO) {

                case "REST":
                    constructor = daoClass.getConstructor();
                    instance = constructor.newInstance();
                    break;

                case "PARADIGMA":
                    constructor = daoClass.getConstructor();
                    instance = constructor.newInstance(connection, imprimirSQL);
                    break;
            }

            this.DAOinstance = instance;

        } catch (Exception e) {
            System.out.println("Erro ao criar instância do DAO: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Configura a classe DAO com base no tipo de DAO especificado.
     * Determina dinamicamente a classe DAO a ser usada.
     *
     * @throws Exception Se ocorrer um erro na determinação da classe DAO.
     */
    private void setDAOClass() throws Exception {
        
        String className = "br.gov.sp.saobernardo.webservice.classes.dao." + this.tipoDAO + "DAO";
        Class<?> daoClass = Class.forName(className);
        this.daoClass = daoClass;
    }
}
