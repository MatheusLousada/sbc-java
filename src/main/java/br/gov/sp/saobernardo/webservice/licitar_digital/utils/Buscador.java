package br.gov.sp.saobernardo.webservice.licitar_digital.utils;

import br.gov.sp.saobernardo.webservice.classes.modelos.ProdutoModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Faculdade;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Orgaos;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.Prefeitura;
import br.gov.sp.saobernardo.webservice.orcom.model.orgaos.SbcPrev;

/**
 * Classe utilitária Buscador para operações de busca e recuperação de informações.
 * Esta classe fornece métodos estáticos para buscar CNPJ, ProdutoModel, ContextoImportacao, entre outros.
 * Os dados retornados por esses métodos atualmente estão mockados (simulados).
 */
public class Buscador {

    /**
     * Retorna um CNPJ mockado com base no código da empresa.
     * 
     * @param codigoEmpresa String representando o código da empresa.
     * @return CNPJ mockado como String.
     */
    public static String getCnpj(String codigoEmpresa) {
        String cnpjEncontrado = "00.000.000/0001-00";
        return cnpjEncontrado;
    }

    /**
     * Retorna um CNPJ mockado com base no código da empresa.
     * 
     * @param codigoEmpresa int representando o código da empresa.
     * @return CNPJ mockado como String.
     */
    public static String getCnpj(int codigoEmpresa) {
        String cnpjEncontrado = "00.000.000/0001-00";
        return cnpjEncontrado;
    }

    /**
     * Retorna um ProdutoModel mockado com base no código do produto.
     * 
     * @param nCdProduto Long representando o código do produto.
     * @return ProdutoModel mockado.
     */
    public static ProdutoModel getProduto(Long nCdProduto) {
        ProdutoModel produto = new ProdutoModel();
        return produto;
    }

    /**
     * Retorna uma string vazia representando um DAO mockado.
     * 
     * @return String vazia.
     */
    public static String getDAO() {
        return "";
    }

    /**
     * Retorna um ContextoImportacao mockado.
     * 
     * @return ContextoImportacao mockado.
     */
    public static ContextoImportacao getContextoImportacao() {
        return "";
    }

    /**
     * Retorna um ID de organização com base no tipo de órgão.
     * 
     * @param orgao Orgaos representando o tipo de órgão.
     * @return int representando o ID da organização.
     */
    public static int getOrganizationId(Orgaos orgao) {
        int organizationId = 0;

        switch (orgao.getDescricao()) {
            case Faculdade.NOME:
                organizationId = 1;
                break;
            case Prefeitura.NOME:
                organizationId = 2;
                break;
            case SbcPrev.NOME:
                organizationId = 3;
                break;
            default:
                break;
        }

        return organizationId;
    }
}
