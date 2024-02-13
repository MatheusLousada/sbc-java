package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.util.List;
import java.util.ArrayList;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.BancoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.AgenciaModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteFactory;
import br.gov.sp.saobernardo.webservice.classes.modelos.contacorrente.ContaCorrenteModel;
import br.gov.sp.saobernardo.webservice.classes.responses.BancoResponse;
import br.gov.sp.saobernardo.webservice.classes.responses.InterfaceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;

/**
 * BancoMapper é responsável por mapear dados de resposta de serviços web em modelos de domínio de banco.
 * Extende AbstractMapper para realizar operações de mapeamento específicas para bancos.
 */
public class BancoMapper extends AbstractMapper<BancoModel, BancoMapperParametro, BancoResponse> {

    private BancoMapperParametro bancoMapperParametro;
    private BancoResponse responseCasted;
    private TratamentoDeString ts = new TratamentoDeString();

    /**
     * Construtor que inicializa o mapper com os parâmetros específicos para bancos.
     *
     * @param p Parâmetro específico para o mapeador de banco.
     * @throws Exception Se ocorrer um erro na inicialização.
     */
    public BancoMapper(BancoMapperParametro p) throws Exception {
        super(p);
        this.setDados();
    }

    /**
     * Retorna a resposta convertida para o tipo específico de BancoResponse.
     *
     * @return BancoResponse convertido.
     * @throws Exception Se ocorrer um erro na obtenção da resposta.
     */
    @Override
    public BancoResponse getResponseCasted() throws Exception {
        return this.responseCasted;
    }

    /**
     * Converte a resposta genérica para uma específica do tipo BancoResponse e a armazena.
     *
     * @throws Exception Se ocorrer um erro na conversão da resposta.
     */
    @Override
    public void setResponseCasted() throws Exception {
        List<InterfaceResponse> interfaceResponses = new ArrayList<>(this.mapperParametro.getResponse());
        InterfaceResponse castedResponse = super.getCastedAbstract(interfaceResponses);

        super.verificaInstancia(castedResponse);

        this.responseCasted = (BancoResponse) castedResponse;
    }

    /**
     * Configura os dados de BancoModel com base nas respostas obtidas.
     *
     * @throws Exception Se ocorrer um erro na configuração dos dados.
     */
    @Override
    public void setDados() throws Exception {
        super.setStringReflexao("Banco");
        this.bancoMapperParametro = super.getParametro();
        this.setResponseCasted();

        List<BancoResponse> responses = this.mapperParametro.getResponse();
        setBanco(responses);
    }

    /**
     * Lista informações do banco modeladas a partir dos parâmetros e respostas.
     *
     * @return BancoModel com informações do banco.
     * @throws Exception Se ocorrer um erro na listagem dos dados.
     */
    @Override
    public BancoModel listar() throws Exception {
        return this.bancoMapperParametro.getBanco();
    }

    /**
     * Configura as informações do BancoModel com base nas respostas de BancoResponse.
     *
     * @param responses Lista de respostas de BancoResponse.
     */
    private void setBanco(List<BancoResponse> responses) {
        BancoModel banco = this.bancoMapperParametro.getBanco();

        for (BancoResponse response : responses) {
            AgenciaModel agencia = new AgenciaModel(ts.completaComZerosAEsquerda(response.getSCdAgencia(), 4), response.getSCdAgenciaDigito());
            String codigoBanco = ts.completaComZerosAEsquerda(String.valueOf(response.getNCdBanco()), 3);
            ContaCorrenteModel contaCorrente = new ContaCorrenteFactory().fabricaConta(banco, response.getSCdContaCorrente(), response.getSCdAgenciaDigito());

            banco.setCodigoDobanco(codigoBanco);
            banco.setAgencia(agencia);
            banco.setContaCorrente(contaCorrente);
        }

        this.bancoMapperParametro.setBanco(banco);
    }
}
