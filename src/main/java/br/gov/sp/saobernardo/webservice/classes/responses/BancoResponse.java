package br.gov.sp.saobernardo.webservice.classes.responses;

import java.lang.reflect.Type;

/**
 * Classe BancoResponse que implementa a interface InterfaceResponse.
 * Esta classe é responsável por armazenar e gerenciar informações de banco,
 * como códigos de banco, agência e conta corrente, incluindo dígitos verificadores.
 */
public class BancoResponse implements InterfaceResponse {

    private Long nCdBanco;
    private String sCdAgencia;
    private String sCdAgenciaDigito;
    private String sCdContaCorrente;
    private String sCdContaDigito;

    /**
     * Método estático para obter a estrutura da classe BancoResponse.
     * 
     * @return Retorna a classe BancoResponse como um tipo Type.
     */
    public static Type getStructure() {
        return BancoResponse.class;
    }

   /**
     * Implementação do método da interface InterfaceResponse.
     * Retorna a instância atual da classe BancoResponse.
     * 
     * @return A instância atual de InterfaceResponse.
     */
    @Override
    public InterfaceResponse getInterface() {
        return this;
    }

    public Long getNCdBanco() {
        return nCdBanco;
    }

    public String getSCdAgencia() {
        return sCdAgencia;
    }

    public String getSCdAgenciaDigito() {
        return sCdAgenciaDigito;
    }

    public String getSCdContaCorrente() {
        return sCdContaCorrente;
    }

    public String getSCdContaDigito() {
        return sCdContaDigito;
    }

    public void setNCdBanco(Long nCdBanco) {
        this.nCdBanco = nCdBanco;
    }

    public void setSCdAgencia(String sCdAgencia) {
        this.sCdAgencia = sCdAgencia;
    }

    public void setSCdAgenciaDigito(String sCdAgenciaDigito) {
        this.sCdAgenciaDigito = sCdAgenciaDigito;
    }

    public void setSCdContaCorrente(String sCdContaCorrente) {
        this.sCdContaCorrente = sCdContaCorrente;
    }

    public void setSCdContaDigito(String sCdContaDigito) {
        this.sCdContaDigito = sCdContaDigito;
    }
}
