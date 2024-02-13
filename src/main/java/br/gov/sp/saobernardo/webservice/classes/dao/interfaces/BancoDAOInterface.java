package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;

/**
 * Interface BancoDAOInterface para operações DAO relacionadas a entidades bancárias.
 * Esta interface define um contrato para classes DAO que manipulam dados de bancos,
 * especificamente para a busca de informações bancárias com base em um código de empresa.
 */
public interface BancoDAOInterface {

    /**
     * Método para buscar um BancoModel usando o código de uma empresa Paradigma.
     * Este método é destinado a ser implementado por classes DAO que necessitam
     * recuperar informações bancárias específicas com base em um código de empresa fornecido.
     *
     * @param codigoWBCEmpresa O código da empresa Paradigma para a busca.
     * @return BancoModel contendo as informações bancárias correspondentes ao código fornecido.
     * @throws Exception Se ocorrer um erro durante a busca.
     */
    public BancoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws Exception;
}
