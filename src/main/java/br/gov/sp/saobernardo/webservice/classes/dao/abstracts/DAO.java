package br.gov.sp.saobernardo.webservice.classes.dao.abstracts;

import java.sql.Connection;
import br.gov.sp.saobernardo.webservice.classes.factory.DAOFactory;

/**
 * Classe DAO que atua como uma fábrica para criar instâncias de DAOs específicos.
 * Suporta a criação de DAOs para diferentes tipos de persistência, como REST ou PARADIGMA.
 */
public class DAO {
    
    private Object dao;
    private DAOFactory daoFactory;

    /**
     * Construtor que inicializa um DAO com base no tipo especificado.
     * Suporta a criação de DAOs de tipo 'REST' e 'PARADIGMA'.
     *
     * @param connection Conexão SQL para DAOs que requerem conexão com banco de dados.
     * @param imprimirSQL Flag booleana para indicar se as consultas SQL devem ser impressas (usado para DAOs tipo 'PARADIGMA').
     * @param tipoDAO O tipo de DAO a ser criado ('REST' ou 'PARADIGMA').
     * @throws Exception Se ocorrer um erro durante a criação do DAO.
     */
    public DAO(Connection connection, boolean imprimirSQL, String tipoDAO) throws Exception {
        switch (tipoDAO) {
            case "REST":
                this.daoFactory = new DAOFactory(tipoDAO);
                break;
            case "PARADIGMA":
                this.daoFactory = new DAOFactory(connection, imprimirSQL, tipoDAO);
                break;
        }
        this.setDAO(this.daoFactory.getDAOInstance());
    }

    /**
     * Define o objeto DAO.
     * Este método é privado pois a instância do DAO é configurada internamente na classe.
     *
     * @param dao O objeto DAO a ser definido.
     */
    private void setDAO(Object dao) {
        this.dao = dao;
    }

    /**
     * Retorna o objeto DAO.
     * Este método é protegido, permitindo acesso às subclasses.
     *
     * @return O objeto DAO atual.
     */
    protected Object getDAO() {
        return this.dao;
    }
}
