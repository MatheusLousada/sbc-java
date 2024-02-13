package br.gov.sp.saobernardo.webservice.classes.mappers.parametros;

import java.util.List;

import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.BancoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;

/**
 * Classe BancoMapperParametro que implementa a interface InterfaceMapperParametro
 * para o mapeamento de parâmetros em operações relacionadas a bancos.
 * Esta classe é responsável por gerenciar a conversão e o mapeamento de dados
 * entre BancoModel e BancoResponse.
 *
 * @param contexto Contexto de importação utilizado nas operações.
 * @param requestData Dados de requisição envolvidos no mapeamento.
 * @param banco Modelo de dados de banco que será mapeado.
 * @param response Lista de respostas BancoResponse resultantes do mapeamento.
 */
public class BancoMapperParametro implements InterfaceMapperParametro<BancoResponse> {

    private ContextoImportacao contexto;
    private RequestData requestData;
    private BancoModel banco;
    private List<BancoResponse> response;

    /**
     * Construtor para inicializar o mapeador com contexto, dados de requisição e modelo de banco.
     * 
     * @param contexto Contexto de importação utilizado.
     * @param requestData Dados de requisição.
     * @param banco Modelo de Banco para o mapeamento.
     */
    public BancoMapperParametro(ContextoImportacao contexto, RequestData requestData, BancoModel banco) {
        this.contexto = contexto;
        this.requestData = requestData;
        this.banco = banco;
    }

    /**
     * Retorna o contexto de importação atual.
     *
     * @return O contexto de importação.
     */
    @Override
    public ContextoImportacao getContexto() {
        return this.contexto;
    }

    /**
     * Retorna a lista de respostas do tipo BancoResponse.
     *
     * @return Uma lista de respostas BancoResponse.
     */
    @Override
    public List<BancoResponse> getResponse() {
        return this.response;
    }

    /**
     * Define a lista de respostas do tipo BancoResponse.
     *
     * @param response A lista de respostas BancoResponse a ser definida.
     */
    @Override
    public void setResponse(List<BancoResponse> response) {
        this.response = response;
    }

    /**
     * Retorna os dados de requisição atuais.
     *
     * @return Os dados de requisição.
     */
    public RequestData getRequestData() {
        return this.requestData;
    }

    /**
     * Retorna o modelo de banco atual.
     *
     * @return O modelo de Banco.
     */
    public BancoModel getBanco() {
        return this.banco;
    }

    /**
     * Define o modelo de banco.
     *
     * @param banco O modelo de Banco a ser definido.
     */
    public void setBanco(BancoModel banco) {
        this.banco = banco;
    }
}
