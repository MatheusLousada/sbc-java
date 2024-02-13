
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.sp.saobernardo.paradigma.ws.cotacao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _CotacaoMoedaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoMoedaDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _CotacaoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoItemEnderecoDTO");
    private final static QName _ArrayOfCotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoDTO");
    private final static QName _PropostaEntregaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PropostaEntregaDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfConfirmacaoNegociacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfConfirmacaoNegociacaoItemDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfCotacaoItemParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoItemParticipanteDTO");
    private final static QName _ArrayOfCotacaoParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoParticipanteDTO");
    private final static QName _ArrayOfConfirmacaoNegociacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfConfirmacaoNegociacaoDTO");
    private final static QName _ConfirmacaoNegociacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ConfirmacaoNegociacaoItemDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _CotacaoPropostaEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoPropostaEnderecoDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfPropostaRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPropostaRequisicaoDTO");
    private final static QName _ArrayOfCotacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoItemDTO");
    private final static QName _ArrayOfCotacaoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoItemTaxaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _CotacaoPropostaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoPropostaDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfCotacaoMoedaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoMoedaDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _CotacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoItemDTO");
    private final static QName _ArrayOfCotacaoPropostaEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoPropostaEnderecoDTO");
    private final static QName _ConfirmacaoNegociacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ConfirmacaoNegociacaoDTO");
    private final static QName _CotacaoItemParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoItemParticipanteDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfCotacaoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoItemEnderecoDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CotacaoPropostaTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoPropostaTaxaDTO");
    private final static QName _ProcessoCotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProcessoCotacaoDTO");
    private final static QName _ArrayOfProcessoCotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProcessoCotacaoDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfPropostaEntregaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPropostaEntregaDTO");
    private final static QName _CotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoDTO");
    private final static QName _ArrayOfCotacaoPropostaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoPropostaDTO");
    private final static QName _ArrayOfCotacaoPropostaTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoPropostaTaxaDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _PropostaRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PropostaRequisicaoDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _CotacaoParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoParticipanteDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _CotacaoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoItemTaxaDTO");
    private final static QName _RetornarCotacaoResponseRetornarCotacaoResult_QNAME = new QName("http://tempuri.org/", "RetornarCotacaoResult");
    private final static QName _RetornarCotacaoOrcamentoResponseRetornarCotacaoOrcamentoResult_QNAME = new QName("http://tempuri.org/", "RetornarCotacaoOrcamentoResult");
    private final static QName _HabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO_QNAME = new QName("http://tempuri.org/", "lstConfirmacaoNegociacaoDTO");
    private final static QName _ReabrirCotacaoResponseReabrirCotacaoResult_QNAME = new QName("http://tempuri.org/", "ReabrirCotacaoResult");
    private final static QName _RetornarCotacaoComEmpresaSemDeParaResponseRetornarCotacaoComEmpresaSemDeParaResult_QNAME = new QName("http://tempuri.org/", "RetornarCotacaoComEmpresaSemDeParaResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _CotacaoItemEnderecoDTOSCdCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCobrancaEndereco");
    private final static QName _CotacaoItemEnderecoDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _CotacaoItemEnderecoDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _CotacaoItemEnderecoDTOSCdItemRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemRequisicaoEmpresa");
    private final static QName _ProcessarCotacaoResponseProcessarCotacaoResult_QNAME = new QName("http://tempuri.org/", "ProcessarCotacaoResult");
    private final static QName _ReabrirCotacaoItemResponseReabrirCotacaoItemResult_QNAME = new QName("http://tempuri.org/", "ReabrirCotacaoItemResult");
    private final static QName _HabilitarRetornarCotacaoItemResponseHabilitarRetornarCotacaoItemResult_QNAME = new QName("http://tempuri.org/", "HabilitarRetornarCotacaoItemResult");
    private final static QName _HabilitarRetornarCotacaoResponseHabilitarRetornarCotacaoResult_QNAME = new QName("http://tempuri.org/", "HabilitarRetornarCotacaoResult");
    private final static QName _CotacaoPropostaDTOSCdIva_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdIva");
    private final static QName _CotacaoPropostaDTOSCdNmb_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNmb");
    private final static QName _PropostaRequisicaoDTOSNmTransportadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmTransportadora");
    private final static QName _PropostaRequisicaoDTOSCdRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdRequisicaoEmpresa");
    private final static QName _PropostaRequisicaoDTOSCdTransportadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdTransportadora");
    private final static QName _PropostaRequisicaoDTOLstPropostaEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPropostaEntrega");
    private final static QName _CotacaoMoedaDTOSCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMoeda");
    private final static QName _CotacaoDTOSCdEmpresaRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaRequisicao");
    private final static QName _CotacaoDTOSCdCotacaoWbcPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCotacaoWbcPai");
    private final static QName _CotacaoDTOSCdCotacaoWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCotacaoWbc");
    private final static QName _CotacaoItemDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _CotacaoItemDTOSCdItemWbcPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemWbcPai");
    private final static QName _CotacaoItemDTOSCdMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMarca");
    private final static QName _CotacaoItemDTOSCdCotacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCotacao");
    private final static QName _CotacaoItemDTOSCdItemWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemWbc");
    private final static QName _RetornarCotacaoItemResponseRetornarCotacaoItemResult_QNAME = new QName("http://tempuri.org/", "RetornarCotacaoItemResult");
    private final static QName _ProcessarCotacaoLstCotacao_QNAME = new QName("http://tempuri.org/", "lstCotacao");
    private final static QName _CotacaoPropostaEnderecoDTOSCdUnidadeFornecimento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUnidadeFornecimento");
    private final static QName _CotacaoPropostaEnderecoDTODQtPorUnidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dQtPorUnidade");
    private final static QName _CotacaoPropostaEnderecoDTODQtUnidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dQtUnidade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.cotacao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarCotacaoResponse }
     * 
     */
    public RetornarCotacaoResponse createRetornarCotacaoResponse() {
        return new RetornarCotacaoResponse();
    }

    /**
     * Create an instance of {@link RetornarCotacaoOrcamentoResponse }
     * 
     */
    public RetornarCotacaoOrcamentoResponse createRetornarCotacaoOrcamentoResponse() {
        return new RetornarCotacaoOrcamentoResponse();
    }

    /**
     * Create an instance of {@link ReabrirCotacaoResponse }
     * 
     */
    public ReabrirCotacaoResponse createReabrirCotacaoResponse() {
        return new ReabrirCotacaoResponse();
    }

    /**
     * Create an instance of {@link RetornarCotacaoComEmpresaSemDeParaResponse }
     * 
     */
    public RetornarCotacaoComEmpresaSemDeParaResponse createRetornarCotacaoComEmpresaSemDeParaResponse() {
        return new RetornarCotacaoComEmpresaSemDeParaResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link CotacaoItemEnderecoDTO }
     * 
     */
    public CotacaoItemEnderecoDTO createCotacaoItemEnderecoDTO() {
        return new CotacaoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoPropostaTaxaDTO }
     * 
     */
    public ArrayOfCotacaoPropostaTaxaDTO createArrayOfCotacaoPropostaTaxaDTO() {
        return new ArrayOfCotacaoPropostaTaxaDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link PropostaEntregaDTO }
     * 
     */
    public PropostaEntregaDTO createPropostaEntregaDTO() {
        return new PropostaEntregaDTO();
    }

    /**
     * Create an instance of {@link ProcessarCotacaoResponse }
     * 
     */
    public ProcessarCotacaoResponse createProcessarCotacaoResponse() {
        return new ProcessarCotacaoResponse();
    }

    /**
     * Create an instance of {@link CotacaoParticipanteDTO }
     * 
     */
    public CotacaoParticipanteDTO createCotacaoParticipanteDTO() {
        return new CotacaoParticipanteDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoMoedaDTO }
     * 
     */
    public ArrayOfCotacaoMoedaDTO createArrayOfCotacaoMoedaDTO() {
        return new ArrayOfCotacaoMoedaDTO();
    }

    /**
     * Create an instance of {@link RetornarCotacaoComEmpresaSemDePara }
     * 
     */
    public RetornarCotacaoComEmpresaSemDePara createRetornarCotacaoComEmpresaSemDePara() {
        return new RetornarCotacaoComEmpresaSemDePara();
    }

    /**
     * Create an instance of {@link ReabrirCotacao }
     * 
     */
    public ReabrirCotacao createReabrirCotacao() {
        return new ReabrirCotacao();
    }

    /**
     * Create an instance of {@link ArrayOfConfirmacaoNegociacaoItemDTO }
     * 
     */
    public ArrayOfConfirmacaoNegociacaoItemDTO createArrayOfConfirmacaoNegociacaoItemDTO() {
        return new ArrayOfConfirmacaoNegociacaoItemDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCotacaoResponse }
     * 
     */
    public HabilitarRetornarCotacaoResponse createHabilitarRetornarCotacaoResponse() {
        return new HabilitarRetornarCotacaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConfirmacaoNegociacaoDTO }
     * 
     */
    public ArrayOfConfirmacaoNegociacaoDTO createArrayOfConfirmacaoNegociacaoDTO() {
        return new ArrayOfConfirmacaoNegociacaoDTO();
    }

    /**
     * Create an instance of {@link RetornarCotacaoItem }
     * 
     */
    public RetornarCotacaoItem createRetornarCotacaoItem() {
        return new RetornarCotacaoItem();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link RetornarCotacaoItemResponse }
     * 
     */
    public RetornarCotacaoItemResponse createRetornarCotacaoItemResponse() {
        return new RetornarCotacaoItemResponse();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCotacaoItem }
     * 
     */
    public HabilitarRetornarCotacaoItem createHabilitarRetornarCotacaoItem() {
        return new HabilitarRetornarCotacaoItem();
    }

    /**
     * Create an instance of {@link ConfirmacaoNegociacaoItemDTO }
     * 
     */
    public ConfirmacaoNegociacaoItemDTO createConfirmacaoNegociacaoItemDTO() {
        return new ConfirmacaoNegociacaoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarCotacao }
     * 
     */
    public ProcessarCotacao createProcessarCotacao() {
        return new ProcessarCotacao();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoItemParticipanteDTO }
     * 
     */
    public ArrayOfCotacaoItemParticipanteDTO createArrayOfCotacaoItemParticipanteDTO() {
        return new ArrayOfCotacaoItemParticipanteDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoParticipanteDTO }
     * 
     */
    public ArrayOfCotacaoParticipanteDTO createArrayOfCotacaoParticipanteDTO() {
        return new ArrayOfCotacaoParticipanteDTO();
    }

    /**
     * Create an instance of {@link CotacaoPropostaEnderecoDTO }
     * 
     */
    public CotacaoPropostaEnderecoDTO createCotacaoPropostaEnderecoDTO() {
        return new CotacaoPropostaEnderecoDTO();
    }

    /**
     * Create an instance of {@link ReabrirCotacaoItem }
     * 
     */
    public ReabrirCotacaoItem createReabrirCotacaoItem() {
        return new ReabrirCotacaoItem();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoDTO }
     * 
     */
    public ArrayOfCotacaoDTO createArrayOfCotacaoDTO() {
        return new ArrayOfCotacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPropostaRequisicaoDTO }
     * 
     */
    public ArrayOfPropostaRequisicaoDTO createArrayOfPropostaRequisicaoDTO() {
        return new ArrayOfPropostaRequisicaoDTO();
    }

    /**
     * Create an instance of {@link RetornarCotacaoOrcamento }
     * 
     */
    public RetornarCotacaoOrcamento createRetornarCotacaoOrcamento() {
        return new RetornarCotacaoOrcamento();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoItemEnderecoDTO }
     * 
     */
    public ArrayOfCotacaoItemEnderecoDTO createArrayOfCotacaoItemEnderecoDTO() {
        return new ArrayOfCotacaoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCotacao }
     * 
     */
    public HabilitarRetornarCotacao createHabilitarRetornarCotacao() {
        return new HabilitarRetornarCotacao();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoPropostaEnderecoDTO }
     * 
     */
    public ArrayOfCotacaoPropostaEnderecoDTO createArrayOfCotacaoPropostaEnderecoDTO() {
        return new ArrayOfCotacaoPropostaEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoItemDTO }
     * 
     */
    public ArrayOfCotacaoItemDTO createArrayOfCotacaoItemDTO() {
        return new ArrayOfCotacaoItemDTO();
    }

    /**
     * Create an instance of {@link ReabrirCotacaoItemResponse }
     * 
     */
    public ReabrirCotacaoItemResponse createReabrirCotacaoItemResponse() {
        return new ReabrirCotacaoItemResponse();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCotacaoItemResponse }
     * 
     */
    public HabilitarRetornarCotacaoItemResponse createHabilitarRetornarCotacaoItemResponse() {
        return new HabilitarRetornarCotacaoItemResponse();
    }

    /**
     * Create an instance of {@link CotacaoPropostaTaxaDTO }
     * 
     */
    public CotacaoPropostaTaxaDTO createCotacaoPropostaTaxaDTO() {
        return new CotacaoPropostaTaxaDTO();
    }

    /**
     * Create an instance of {@link RetornarCotacao }
     * 
     */
    public RetornarCotacao createRetornarCotacao() {
        return new RetornarCotacao();
    }

    /**
     * Create an instance of {@link CotacaoPropostaDTO }
     * 
     */
    public CotacaoPropostaDTO createCotacaoPropostaDTO() {
        return new CotacaoPropostaDTO();
    }

    /**
     * Create an instance of {@link PropostaRequisicaoDTO }
     * 
     */
    public PropostaRequisicaoDTO createPropostaRequisicaoDTO() {
        return new PropostaRequisicaoDTO();
    }

    /**
     * Create an instance of {@link CotacaoMoedaDTO }
     * 
     */
    public CotacaoMoedaDTO createCotacaoMoedaDTO() {
        return new CotacaoMoedaDTO();
    }

    /**
     * Create an instance of {@link CotacaoDTO }
     * 
     */
    public CotacaoDTO createCotacaoDTO() {
        return new CotacaoDTO();
    }

    /**
     * Create an instance of {@link CotacaoItemTaxaDTO }
     * 
     */
    public CotacaoItemTaxaDTO createCotacaoItemTaxaDTO() {
        return new CotacaoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link CotacaoItemParticipanteDTO }
     * 
     */
    public CotacaoItemParticipanteDTO createCotacaoItemParticipanteDTO() {
        return new CotacaoItemParticipanteDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPropostaEntregaDTO }
     * 
     */
    public ArrayOfPropostaEntregaDTO createArrayOfPropostaEntregaDTO() {
        return new ArrayOfPropostaEntregaDTO();
    }

    /**
     * Create an instance of {@link CotacaoItemDTO }
     * 
     */
    public CotacaoItemDTO createCotacaoItemDTO() {
        return new CotacaoItemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProcessoCotacaoDTO }
     * 
     */
    public ArrayOfProcessoCotacaoDTO createArrayOfProcessoCotacaoDTO() {
        return new ArrayOfProcessoCotacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessoCotacaoDTO }
     * 
     */
    public ProcessoCotacaoDTO createProcessoCotacaoDTO() {
        return new ProcessoCotacaoDTO();
    }

    /**
     * Create an instance of {@link ConfirmacaoNegociacaoDTO }
     * 
     */
    public ConfirmacaoNegociacaoDTO createConfirmacaoNegociacaoDTO() {
        return new ConfirmacaoNegociacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoPropostaDTO }
     * 
     */
    public ArrayOfCotacaoPropostaDTO createArrayOfCotacaoPropostaDTO() {
        return new ArrayOfCotacaoPropostaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoItemTaxaDTO }
     * 
     */
    public ArrayOfCotacaoItemTaxaDTO createArrayOfCotacaoItemTaxaDTO() {
        return new ArrayOfCotacaoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoMoedaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoMoedaDTO")
    public JAXBElement<CotacaoMoedaDTO> createCotacaoMoedaDTO(CotacaoMoedaDTO value) {
        return new JAXBElement<CotacaoMoedaDTO>(_CotacaoMoedaDTO_QNAME, CotacaoMoedaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoItemEnderecoDTO")
    public JAXBElement<CotacaoItemEnderecoDTO> createCotacaoItemEnderecoDTO(CotacaoItemEnderecoDTO value) {
        return new JAXBElement<CotacaoItemEnderecoDTO>(_CotacaoItemEnderecoDTO_QNAME, CotacaoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoDTO")
    public JAXBElement<ArrayOfCotacaoDTO> createArrayOfCotacaoDTO(ArrayOfCotacaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoDTO>(_ArrayOfCotacaoDTO_QNAME, ArrayOfCotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropostaEntregaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PropostaEntregaDTO")
    public JAXBElement<PropostaEntregaDTO> createPropostaEntregaDTO(PropostaEntregaDTO value) {
        return new JAXBElement<PropostaEntregaDTO>(_PropostaEntregaDTO_QNAME, PropostaEntregaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfConfirmacaoNegociacaoItemDTO")
    public JAXBElement<ArrayOfConfirmacaoNegociacaoItemDTO> createArrayOfConfirmacaoNegociacaoItemDTO(ArrayOfConfirmacaoNegociacaoItemDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoItemDTO>(_ArrayOfConfirmacaoNegociacaoItemDTO_QNAME, ArrayOfConfirmacaoNegociacaoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoItemParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoItemParticipanteDTO")
    public JAXBElement<ArrayOfCotacaoItemParticipanteDTO> createArrayOfCotacaoItemParticipanteDTO(ArrayOfCotacaoItemParticipanteDTO value) {
        return new JAXBElement<ArrayOfCotacaoItemParticipanteDTO>(_ArrayOfCotacaoItemParticipanteDTO_QNAME, ArrayOfCotacaoItemParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoParticipanteDTO")
    public JAXBElement<ArrayOfCotacaoParticipanteDTO> createArrayOfCotacaoParticipanteDTO(ArrayOfCotacaoParticipanteDTO value) {
        return new JAXBElement<ArrayOfCotacaoParticipanteDTO>(_ArrayOfCotacaoParticipanteDTO_QNAME, ArrayOfCotacaoParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfConfirmacaoNegociacaoDTO")
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createArrayOfConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_ArrayOfConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmacaoNegociacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ConfirmacaoNegociacaoItemDTO")
    public JAXBElement<ConfirmacaoNegociacaoItemDTO> createConfirmacaoNegociacaoItemDTO(ConfirmacaoNegociacaoItemDTO value) {
        return new JAXBElement<ConfirmacaoNegociacaoItemDTO>(_ConfirmacaoNegociacaoItemDTO_QNAME, ConfirmacaoNegociacaoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoPropostaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoPropostaEnderecoDTO")
    public JAXBElement<CotacaoPropostaEnderecoDTO> createCotacaoPropostaEnderecoDTO(CotacaoPropostaEnderecoDTO value) {
        return new JAXBElement<CotacaoPropostaEnderecoDTO>(_CotacaoPropostaEnderecoDTO_QNAME, CotacaoPropostaEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWbtLogDTO")
    public JAXBElement<ArrayOfWbtLogDTO> createArrayOfWbtLogDTO(ArrayOfWbtLogDTO value) {
        return new JAXBElement<ArrayOfWbtLogDTO>(_ArrayOfWbtLogDTO_QNAME, ArrayOfWbtLogDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropostaRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPropostaRequisicaoDTO")
    public JAXBElement<ArrayOfPropostaRequisicaoDTO> createArrayOfPropostaRequisicaoDTO(ArrayOfPropostaRequisicaoDTO value) {
        return new JAXBElement<ArrayOfPropostaRequisicaoDTO>(_ArrayOfPropostaRequisicaoDTO_QNAME, ArrayOfPropostaRequisicaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoItemDTO")
    public JAXBElement<ArrayOfCotacaoItemDTO> createArrayOfCotacaoItemDTO(ArrayOfCotacaoItemDTO value) {
        return new JAXBElement<ArrayOfCotacaoItemDTO>(_ArrayOfCotacaoItemDTO_QNAME, ArrayOfCotacaoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoItemTaxaDTO")
    public JAXBElement<ArrayOfCotacaoItemTaxaDTO> createArrayOfCotacaoItemTaxaDTO(ArrayOfCotacaoItemTaxaDTO value) {
        return new JAXBElement<ArrayOfCotacaoItemTaxaDTO>(_ArrayOfCotacaoItemTaxaDTO_QNAME, ArrayOfCotacaoItemTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoPropostaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoPropostaDTO")
    public JAXBElement<CotacaoPropostaDTO> createCotacaoPropostaDTO(CotacaoPropostaDTO value) {
        return new JAXBElement<CotacaoPropostaDTO>(_CotacaoPropostaDTO_QNAME, CotacaoPropostaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoMoedaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoMoedaDTO")
    public JAXBElement<ArrayOfCotacaoMoedaDTO> createArrayOfCotacaoMoedaDTO(ArrayOfCotacaoMoedaDTO value) {
        return new JAXBElement<ArrayOfCotacaoMoedaDTO>(_ArrayOfCotacaoMoedaDTO_QNAME, ArrayOfCotacaoMoedaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", name = "DtoBase")
    public JAXBElement<DtoBase> createDtoBase(DtoBase value) {
        return new JAXBElement<DtoBase>(_DtoBase_QNAME, DtoBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoItemDTO")
    public JAXBElement<CotacaoItemDTO> createCotacaoItemDTO(CotacaoItemDTO value) {
        return new JAXBElement<CotacaoItemDTO>(_CotacaoItemDTO_QNAME, CotacaoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoPropostaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoPropostaEnderecoDTO")
    public JAXBElement<ArrayOfCotacaoPropostaEnderecoDTO> createArrayOfCotacaoPropostaEnderecoDTO(ArrayOfCotacaoPropostaEnderecoDTO value) {
        return new JAXBElement<ArrayOfCotacaoPropostaEnderecoDTO>(_ArrayOfCotacaoPropostaEnderecoDTO_QNAME, ArrayOfCotacaoPropostaEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ConfirmacaoNegociacaoDTO")
    public JAXBElement<ConfirmacaoNegociacaoDTO> createConfirmacaoNegociacaoDTO(ConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ConfirmacaoNegociacaoDTO>(_ConfirmacaoNegociacaoDTO_QNAME, ConfirmacaoNegociacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoItemParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoItemParticipanteDTO")
    public JAXBElement<CotacaoItemParticipanteDTO> createCotacaoItemParticipanteDTO(CotacaoItemParticipanteDTO value) {
        return new JAXBElement<CotacaoItemParticipanteDTO>(_CotacaoItemParticipanteDTO_QNAME, CotacaoItemParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoItemEnderecoDTO")
    public JAXBElement<ArrayOfCotacaoItemEnderecoDTO> createArrayOfCotacaoItemEnderecoDTO(ArrayOfCotacaoItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfCotacaoItemEnderecoDTO>(_ArrayOfCotacaoItemEnderecoDTO_QNAME, ArrayOfCotacaoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoPropostaTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoPropostaTaxaDTO")
    public JAXBElement<CotacaoPropostaTaxaDTO> createCotacaoPropostaTaxaDTO(CotacaoPropostaTaxaDTO value) {
        return new JAXBElement<CotacaoPropostaTaxaDTO>(_CotacaoPropostaTaxaDTO_QNAME, CotacaoPropostaTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProcessoCotacaoDTO")
    public JAXBElement<ProcessoCotacaoDTO> createProcessoCotacaoDTO(ProcessoCotacaoDTO value) {
        return new JAXBElement<ProcessoCotacaoDTO>(_ProcessoCotacaoDTO_QNAME, ProcessoCotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProcessoCotacaoDTO")
    public JAXBElement<ArrayOfProcessoCotacaoDTO> createArrayOfProcessoCotacaoDTO(ArrayOfProcessoCotacaoDTO value) {
        return new JAXBElement<ArrayOfProcessoCotacaoDTO>(_ArrayOfProcessoCotacaoDTO_QNAME, ArrayOfProcessoCotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropostaEntregaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPropostaEntregaDTO")
    public JAXBElement<ArrayOfPropostaEntregaDTO> createArrayOfPropostaEntregaDTO(ArrayOfPropostaEntregaDTO value) {
        return new JAXBElement<ArrayOfPropostaEntregaDTO>(_ArrayOfPropostaEntregaDTO_QNAME, ArrayOfPropostaEntregaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoDTO")
    public JAXBElement<CotacaoDTO> createCotacaoDTO(CotacaoDTO value) {
        return new JAXBElement<CotacaoDTO>(_CotacaoDTO_QNAME, CotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoPropostaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoPropostaDTO")
    public JAXBElement<ArrayOfCotacaoPropostaDTO> createArrayOfCotacaoPropostaDTO(ArrayOfCotacaoPropostaDTO value) {
        return new JAXBElement<ArrayOfCotacaoPropostaDTO>(_ArrayOfCotacaoPropostaDTO_QNAME, ArrayOfCotacaoPropostaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoPropostaTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoPropostaTaxaDTO")
    public JAXBElement<ArrayOfCotacaoPropostaTaxaDTO> createArrayOfCotacaoPropostaTaxaDTO(ArrayOfCotacaoPropostaTaxaDTO value) {
        return new JAXBElement<ArrayOfCotacaoPropostaTaxaDTO>(_ArrayOfCotacaoPropostaTaxaDTO_QNAME, ArrayOfCotacaoPropostaTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropostaRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PropostaRequisicaoDTO")
    public JAXBElement<PropostaRequisicaoDTO> createPropostaRequisicaoDTO(PropostaRequisicaoDTO value) {
        return new JAXBElement<PropostaRequisicaoDTO>(_PropostaRequisicaoDTO_QNAME, PropostaRequisicaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WbtLogDTO")
    public JAXBElement<WbtLogDTO> createWbtLogDTO(WbtLogDTO value) {
        return new JAXBElement<WbtLogDTO>(_WbtLogDTO_QNAME, WbtLogDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoDTO")
    public JAXBElement<RetornoDTO> createRetornoDTO(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_RetornoDTO_QNAME, RetornoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoParticipanteDTO")
    public JAXBElement<CotacaoParticipanteDTO> createCotacaoParticipanteDTO(CotacaoParticipanteDTO value) {
        return new JAXBElement<CotacaoParticipanteDTO>(_CotacaoParticipanteDTO_QNAME, CotacaoParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoItemTaxaDTO")
    public JAXBElement<CotacaoItemTaxaDTO> createCotacaoItemTaxaDTO(CotacaoItemTaxaDTO value) {
        return new JAXBElement<CotacaoItemTaxaDTO>(_CotacaoItemTaxaDTO_QNAME, CotacaoItemTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCotacaoResult", scope = RetornarCotacaoResponse.class)
    public JAXBElement<ArrayOfCotacaoDTO> createRetornarCotacaoResponseRetornarCotacaoResult(ArrayOfCotacaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoDTO>(_RetornarCotacaoResponseRetornarCotacaoResult_QNAME, ArrayOfCotacaoDTO.class, RetornarCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCotacaoOrcamentoResult", scope = RetornarCotacaoOrcamentoResponse.class)
    public JAXBElement<ArrayOfCotacaoDTO> createRetornarCotacaoOrcamentoResponseRetornarCotacaoOrcamentoResult(ArrayOfCotacaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoDTO>(_RetornarCotacaoOrcamentoResponseRetornarCotacaoOrcamentoResult_QNAME, ArrayOfCotacaoDTO.class, RetornarCotacaoOrcamentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstConfirmacaoNegociacaoDTO", scope = HabilitarRetornarCotacao.class)
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createHabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_HabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, HabilitarRetornarCotacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReabrirCotacaoResult", scope = ReabrirCotacaoResponse.class)
    public JAXBElement<RetornoDTO> createReabrirCotacaoResponseReabrirCotacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ReabrirCotacaoResponseReabrirCotacaoResult_QNAME, RetornoDTO.class, ReabrirCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCotacaoComEmpresaSemDeParaResult", scope = RetornarCotacaoComEmpresaSemDeParaResponse.class)
    public JAXBElement<ArrayOfProcessoCotacaoDTO> createRetornarCotacaoComEmpresaSemDeParaResponseRetornarCotacaoComEmpresaSemDeParaResult(ArrayOfProcessoCotacaoDTO value) {
        return new JAXBElement<ArrayOfProcessoCotacaoDTO>(_RetornarCotacaoComEmpresaSemDeParaResponseRetornarCotacaoComEmpresaSemDeParaResult_QNAME, ArrayOfProcessoCotacaoDTO.class, RetornarCotacaoComEmpresaSemDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdOrigem", scope = WbtLogDTO.class)
    public JAXBElement<String> createWbtLogDTOSCdOrigem(String value) {
        return new JAXBElement<String>(_WbtLogDTOSCdOrigem_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsLog", scope = WbtLogDTO.class)
    public JAXBElement<String> createWbtLogDTOSDsLog(String value) {
        return new JAXBElement<String>(_WbtLogDTOSDsLog_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrToken", scope = WbtLogDTO.class)
    public JAXBElement<String> createWbtLogDTOSNrToken(String value) {
        return new JAXBElement<String>(_WbtLogDTOSNrToken_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = CotacaoItemEnderecoDTO.class)
    public JAXBElement<String> createCotacaoItemEnderecoDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_CotacaoItemEnderecoDTOSCdCobrancaEndereco_QNAME, String.class, CotacaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = CotacaoItemEnderecoDTO.class)
    public JAXBElement<String> createCotacaoItemEnderecoDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_CotacaoItemEnderecoDTOSCdEntregaEndereco_QNAME, String.class, CotacaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = CotacaoItemEnderecoDTO.class)
    public JAXBElement<String> createCotacaoItemEnderecoDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_CotacaoItemEnderecoDTOSCdFaturamentoEndereco_QNAME, String.class, CotacaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemRequisicaoEmpresa", scope = CotacaoItemEnderecoDTO.class)
    public JAXBElement<String> createCotacaoItemEnderecoDTOSCdItemRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_CotacaoItemEnderecoDTOSCdItemRequisicaoEmpresa_QNAME, String.class, CotacaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemRequisicaoEmpresa", scope = PropostaEntregaDTO.class)
    public JAXBElement<String> createPropostaEntregaDTOSCdItemRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_CotacaoItemEnderecoDTOSCdItemRequisicaoEmpresa_QNAME, String.class, PropostaEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrToken", scope = RetornoDTO.class)
    public JAXBElement<String> createRetornoDTOSNrToken(String value) {
        return new JAXBElement<String>(_WbtLogDTOSNrToken_QNAME, String.class, RetornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarCotacaoResult", scope = ProcessarCotacaoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarCotacaoResponseProcessarCotacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarCotacaoResponseProcessarCotacaoResult_QNAME, RetornoDTO.class, ProcessarCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReabrirCotacaoItemResult", scope = ReabrirCotacaoItemResponse.class)
    public JAXBElement<RetornoDTO> createReabrirCotacaoItemResponseReabrirCotacaoItemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ReabrirCotacaoItemResponseReabrirCotacaoItemResult_QNAME, RetornoDTO.class, ReabrirCotacaoItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstConfirmacaoNegociacaoDTO", scope = ReabrirCotacao.class)
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createReabrirCotacaoLstConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_HabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, ReabrirCotacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HabilitarRetornarCotacaoItemResult", scope = HabilitarRetornarCotacaoItemResponse.class)
    public JAXBElement<RetornoDTO> createHabilitarRetornarCotacaoItemResponseHabilitarRetornarCotacaoItemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_HabilitarRetornarCotacaoItemResponseHabilitarRetornarCotacaoItemResult_QNAME, RetornoDTO.class, HabilitarRetornarCotacaoItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HabilitarRetornarCotacaoResult", scope = HabilitarRetornarCotacaoResponse.class)
    public JAXBElement<RetornoDTO> createHabilitarRetornarCotacaoResponseHabilitarRetornarCotacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_HabilitarRetornarCotacaoResponseHabilitarRetornarCotacaoResult_QNAME, RetornoDTO.class, HabilitarRetornarCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdIva", scope = CotacaoPropostaDTO.class)
    public JAXBElement<String> createCotacaoPropostaDTOSCdIva(String value) {
        return new JAXBElement<String>(_CotacaoPropostaDTOSCdIva_QNAME, String.class, CotacaoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNmb", scope = CotacaoPropostaDTO.class)
    public JAXBElement<String> createCotacaoPropostaDTOSCdNmb(String value) {
        return new JAXBElement<String>(_CotacaoPropostaDTOSCdNmb_QNAME, String.class, CotacaoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmTransportadora", scope = PropostaRequisicaoDTO.class)
    public JAXBElement<String> createPropostaRequisicaoDTOSNmTransportadora(String value) {
        return new JAXBElement<String>(_PropostaRequisicaoDTOSNmTransportadora_QNAME, String.class, PropostaRequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRequisicaoEmpresa", scope = PropostaRequisicaoDTO.class)
    public JAXBElement<String> createPropostaRequisicaoDTOSCdRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_PropostaRequisicaoDTOSCdRequisicaoEmpresa_QNAME, String.class, PropostaRequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTransportadora", scope = PropostaRequisicaoDTO.class)
    public JAXBElement<String> createPropostaRequisicaoDTOSCdTransportadora(String value) {
        return new JAXBElement<String>(_PropostaRequisicaoDTOSCdTransportadora_QNAME, String.class, PropostaRequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropostaEntregaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPropostaEntrega", scope = PropostaRequisicaoDTO.class)
    public JAXBElement<ArrayOfPropostaEntregaDTO> createPropostaRequisicaoDTOLstPropostaEntrega(ArrayOfPropostaEntregaDTO value) {
        return new JAXBElement<ArrayOfPropostaEntregaDTO>(_PropostaRequisicaoDTOLstPropostaEntrega_QNAME, ArrayOfPropostaEntregaDTO.class, PropostaRequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMoeda", scope = CotacaoMoedaDTO.class)
    public JAXBElement<String> createCotacaoMoedaDTOSCdMoeda(String value) {
        return new JAXBElement<String>(_CotacaoMoedaDTOSCdMoeda_QNAME, String.class, CotacaoMoedaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaRequisicao", scope = CotacaoDTO.class)
    public JAXBElement<String> createCotacaoDTOSCdEmpresaRequisicao(String value) {
        return new JAXBElement<String>(_CotacaoDTOSCdEmpresaRequisicao_QNAME, String.class, CotacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCotacaoWbcPai", scope = CotacaoDTO.class)
    public JAXBElement<String> createCotacaoDTOSCdCotacaoWbcPai(String value) {
        return new JAXBElement<String>(_CotacaoDTOSCdCotacaoWbcPai_QNAME, String.class, CotacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCotacaoWbc", scope = CotacaoDTO.class)
    public JAXBElement<String> createCotacaoDTOSCdCotacaoWbc(String value) {
        return new JAXBElement<String>(_CotacaoDTOSCdCotacaoWbc_QNAME, String.class, CotacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = CotacaoItemDTO.class)
    public JAXBElement<String> createCotacaoItemDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_CotacaoItemDTOSDsObservacao_QNAME, String.class, CotacaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemWbcPai", scope = CotacaoItemDTO.class)
    public JAXBElement<String> createCotacaoItemDTOSCdItemWbcPai(String value) {
        return new JAXBElement<String>(_CotacaoItemDTOSCdItemWbcPai_QNAME, String.class, CotacaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMarca", scope = CotacaoItemDTO.class)
    public JAXBElement<String> createCotacaoItemDTOSCdMarca(String value) {
        return new JAXBElement<String>(_CotacaoItemDTOSCdMarca_QNAME, String.class, CotacaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCotacao", scope = CotacaoItemDTO.class)
    public JAXBElement<String> createCotacaoItemDTOSCdCotacao(String value) {
        return new JAXBElement<String>(_CotacaoItemDTOSCdCotacao_QNAME, String.class, CotacaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemWbc", scope = CotacaoItemDTO.class)
    public JAXBElement<String> createCotacaoItemDTOSCdItemWbc(String value) {
        return new JAXBElement<String>(_CotacaoItemDTOSCdItemWbc_QNAME, String.class, CotacaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCotacaoItemResult", scope = RetornarCotacaoItemResponse.class)
    public JAXBElement<ArrayOfCotacaoDTO> createRetornarCotacaoItemResponseRetornarCotacaoItemResult(ArrayOfCotacaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoDTO>(_RetornarCotacaoItemResponseRetornarCotacaoItemResult_QNAME, ArrayOfCotacaoDTO.class, RetornarCotacaoItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstConfirmacaoNegociacaoDTO", scope = HabilitarRetornarCotacaoItem.class)
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createHabilitarRetornarCotacaoItemLstConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_HabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, HabilitarRetornarCotacaoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCotacao", scope = ProcessarCotacao.class)
    public JAXBElement<ArrayOfCotacaoDTO> createProcessarCotacaoLstCotacao(ArrayOfCotacaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoDTO>(_ProcessarCotacaoLstCotacao_QNAME, ArrayOfCotacaoDTO.class, ProcessarCotacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmTransportadora", scope = CotacaoPropostaEnderecoDTO.class)
    public JAXBElement<String> createCotacaoPropostaEnderecoDTOSNmTransportadora(String value) {
        return new JAXBElement<String>(_PropostaRequisicaoDTOSNmTransportadora_QNAME, String.class, CotacaoPropostaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeFornecimento", scope = CotacaoPropostaEnderecoDTO.class)
    public JAXBElement<String> createCotacaoPropostaEnderecoDTOSCdUnidadeFornecimento(String value) {
        return new JAXBElement<String>(_CotacaoPropostaEnderecoDTOSCdUnidadeFornecimento_QNAME, String.class, CotacaoPropostaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dQtPorUnidade", scope = CotacaoPropostaEnderecoDTO.class)
    public JAXBElement<BigDecimal> createCotacaoPropostaEnderecoDTODQtPorUnidade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CotacaoPropostaEnderecoDTODQtPorUnidade_QNAME, BigDecimal.class, CotacaoPropostaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dQtUnidade", scope = CotacaoPropostaEnderecoDTO.class)
    public JAXBElement<BigDecimal> createCotacaoPropostaEnderecoDTODQtUnidade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CotacaoPropostaEnderecoDTODQtUnidade_QNAME, BigDecimal.class, CotacaoPropostaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstConfirmacaoNegociacaoDTO", scope = ReabrirCotacaoItem.class)
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createReabrirCotacaoItemLstConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_HabilitarRetornarCotacaoLstConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, ReabrirCotacaoItem.class, value);
    }

}
