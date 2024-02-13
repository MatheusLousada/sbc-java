
package br.gov.sp.saobernardo.paradigma.ws.contrato;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.contrato package. 
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
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ContratoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContratoItemTaxaDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ContratoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContratoDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfContratoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfContratoItemEnderecoDTO");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ContratoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContratoItemEnderecoDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ContratoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContratoItemDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfContratoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfContratoItemDTO");
    private final static QName _ContratoPesquisaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContratoPesquisaDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfContratoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfContratoDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfContratoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfContratoItemTaxaDTO");
    private final static QName _RetornarContratoPorCompradorItemResponseRetornarContratoPorCompradorItemResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorCompradorItemResult");
    private final static QName _ContratoItemEnderecoDTOSCdEmpresaCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCobrancaEndereco");
    private final static QName _ContratoItemEnderecoDTOSCdCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCobrancaEndereco");
    private final static QName _ContratoItemEnderecoDTOSCdEmpresaEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEntregaEndereco");
    private final static QName _ContratoItemEnderecoDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _ContratoItemEnderecoDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _ContratoItemEnderecoDTOSCdEmpresaFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFaturamentoEndereco");
    private final static QName _RetornarContratoCotacaoResponseRetornarContratoCotacaoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoCotacaoResult");
    private final static QName _RetornarContratoPorItemSCdProduto_QNAME = new QName("http://tempuri.org/", "sCdProduto");
    private final static QName _ContratoDTOSCdUsuarioGestor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioGestor");
    private final static QName _ContratoDTOSCdDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDepartamento");
    private final static QName _ContratoDTOSCdContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContrato");
    private final static QName _ContratoDTOSDsAuditoria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAuditoria");
    private final static QName _ContratoDTOSCdContratoErp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContratoErp");
    private final static QName _ContratoDTOSCdNegociacaoWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNegociacaoWbc");
    private final static QName _ContratoDTOSCdUsuarioCriador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioCriador");
    private final static QName _ContratoDTOSCdContratoErpPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContratoErpPai");
    private final static QName _ContratoDTOSCdTransportadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdTransportadora");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _RetornarContratoPorFornecedorSCdEmpresaFornecedor_QNAME = new QName("http://tempuri.org/", "sCdEmpresaFornecedor");
    private final static QName _RetornarContratoLeilaoResponseRetornarContratoLeilaoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoLeilaoResult");
    private final static QName _RetornarContratoAtivoResponseRetornarContratoAtivoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoAtivoResult");
    private final static QName _RetornarContratoEncerradoResponseRetornarContratoEncerradoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoEncerradoResult");
    private final static QName _ContratoItemDTOSCdIva_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdIva");
    private final static QName _ContratoItemDTOSCdItemErp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemErp");
    private final static QName _ContratoItemDTOSCdMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMarca");
    private final static QName _ContratoItemDTOSDsObservacoes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacoes");
    private final static QName _ContratoItemDTOSCdItemWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemWbc");
    private final static QName _ContratoItemDTOSCdItemPaiErp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemPaiErp");
    private final static QName _ContratoItemDTOSCdGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGarantia");
    private final static QName _ProcessarContratoResponseProcessarContratoResult_QNAME = new QName("http://tempuri.org/", "ProcessarContratoResult");
    private final static QName _RetornarContratoPorFornecedorResponseRetornarContratoPorFornecedorResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorFornecedorResult");
    private final static QName _RetornarContratoPorTermoAditivoResponseRetornarContratoPorTermoAditivoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorTermoAditivoResult");
    private final static QName _RetornarContratoPorItemResponseRetornarContratoPorItemResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorItemResult");
    private final static QName _RetornarContratoPorCompradorItemOContratoPesquisaDTO_QNAME = new QName("http://tempuri.org/", "oContratoPesquisaDTO");
    private final static QName _RetornarContratoPorCompradorResponseRetornarContratoPorCompradorResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorCompradorResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarContratoPorFornecedorItemResponseRetornarContratoPorFornecedorItemResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoPorFornecedorItemResult");
    private final static QName _RetornarContratoRescindidoResponseRetornarContratoRescindidoResult_QNAME = new QName("http://tempuri.org/", "RetornarContratoRescindidoResult");
    private final static QName _RetornarCodigoContratoSequenciaResponseRetornarCodigoContratoSequenciaResult_QNAME = new QName("http://tempuri.org/", "RetornarCodigoContratoSequenciaResult");
    private final static QName _ProcessarContratoLstContrato_QNAME = new QName("http://tempuri.org/", "lstContrato");
    private final static QName _RetornarContratoPorCompradorSCdEmpresaContratante_QNAME = new QName("http://tempuri.org/", "sCdEmpresaContratante");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.contrato
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarCodigoContratoSequencia }
     * 
     */
    public RetornarCodigoContratoSequencia createRetornarCodigoContratoSequencia() {
        return new RetornarCodigoContratoSequencia();
    }

    /**
     * Create an instance of {@link RetornarContratoPorCompradorItemResponse }
     * 
     */
    public RetornarContratoPorCompradorItemResponse createRetornarContratoPorCompradorItemResponse() {
        return new RetornarContratoPorCompradorItemResponse();
    }

    /**
     * Create an instance of {@link ContratoItemEnderecoDTO }
     * 
     */
    public ContratoItemEnderecoDTO createContratoItemEnderecoDTO() {
        return new ContratoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ContratoPesquisaDTO }
     * 
     */
    public ContratoPesquisaDTO createContratoPesquisaDTO() {
        return new ContratoPesquisaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoCotacaoResponse }
     * 
     */
    public RetornarContratoCotacaoResponse createRetornarContratoCotacaoResponse() {
        return new RetornarContratoCotacaoResponse();
    }

    /**
     * Create an instance of {@link ContratoDTO }
     * 
     */
    public ContratoDTO createContratoDTO() {
        return new ContratoDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoPorItem }
     * 
     */
    public RetornarContratoPorItem createRetornarContratoPorItem() {
        return new RetornarContratoPorItem();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoPorFornecedor }
     * 
     */
    public RetornarContratoPorFornecedor createRetornarContratoPorFornecedor() {
        return new RetornarContratoPorFornecedor();
    }

    /**
     * Create an instance of {@link RetornarContratoRescindido }
     * 
     */
    public RetornarContratoRescindido createRetornarContratoRescindido() {
        return new RetornarContratoRescindido();
    }

    /**
     * Create an instance of {@link RetornarContratoAtivoResponse }
     * 
     */
    public RetornarContratoAtivoResponse createRetornarContratoAtivoResponse() {
        return new RetornarContratoAtivoResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoLeilaoResponse }
     * 
     */
    public RetornarContratoLeilaoResponse createRetornarContratoLeilaoResponse() {
        return new RetornarContratoLeilaoResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoAtivo }
     * 
     */
    public RetornarContratoAtivo createRetornarContratoAtivo() {
        return new RetornarContratoAtivo();
    }

    /**
     * Create an instance of {@link RetornarContratoEncerradoResponse }
     * 
     */
    public RetornarContratoEncerradoResponse createRetornarContratoEncerradoResponse() {
        return new RetornarContratoEncerradoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContratoItemTaxaDTO }
     * 
     */
    public ArrayOfContratoItemTaxaDTO createArrayOfContratoItemTaxaDTO() {
        return new ArrayOfContratoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoPorTermoAditivo }
     * 
     */
    public RetornarContratoPorTermoAditivo createRetornarContratoPorTermoAditivo() {
        return new RetornarContratoPorTermoAditivo();
    }

    /**
     * Create an instance of {@link ContratoItemDTO }
     * 
     */
    public ContratoItemDTO createContratoItemDTO() {
        return new ContratoItemDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link RetornarContratoCotacao }
     * 
     */
    public RetornarContratoCotacao createRetornarContratoCotacao() {
        return new RetornarContratoCotacao();
    }

    /**
     * Create an instance of {@link RetornarContratoPorTermoAditivoResponse }
     * 
     */
    public RetornarContratoPorTermoAditivoResponse createRetornarContratoPorTermoAditivoResponse() {
        return new RetornarContratoPorTermoAditivoResponse();
    }

    /**
     * Create an instance of {@link ProcessarContratoResponse }
     * 
     */
    public ProcessarContratoResponse createProcessarContratoResponse() {
        return new ProcessarContratoResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoPorFornecedorResponse }
     * 
     */
    public RetornarContratoPorFornecedorResponse createRetornarContratoPorFornecedorResponse() {
        return new RetornarContratoPorFornecedorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContratoDTO }
     * 
     */
    public ArrayOfContratoDTO createArrayOfContratoDTO() {
        return new ArrayOfContratoDTO();
    }

    /**
     * Create an instance of {@link ContratoItemTaxaDTO }
     * 
     */
    public ContratoItemTaxaDTO createContratoItemTaxaDTO() {
        return new ContratoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoPorItemResponse }
     * 
     */
    public RetornarContratoPorItemResponse createRetornarContratoPorItemResponse() {
        return new RetornarContratoPorItemResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoEncerrado }
     * 
     */
    public RetornarContratoEncerrado createRetornarContratoEncerrado() {
        return new RetornarContratoEncerrado();
    }

    /**
     * Create an instance of {@link RetornarContratoPorCompradorItem }
     * 
     */
    public RetornarContratoPorCompradorItem createRetornarContratoPorCompradorItem() {
        return new RetornarContratoPorCompradorItem();
    }

    /**
     * Create an instance of {@link RetornarContratoPorCompradorResponse }
     * 
     */
    public RetornarContratoPorCompradorResponse createRetornarContratoPorCompradorResponse() {
        return new RetornarContratoPorCompradorResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoLeilao }
     * 
     */
    public RetornarContratoLeilao createRetornarContratoLeilao() {
        return new RetornarContratoLeilao();
    }

    /**
     * Create an instance of {@link ArrayOfContratoItemEnderecoDTO }
     * 
     */
    public ArrayOfContratoItemEnderecoDTO createArrayOfContratoItemEnderecoDTO() {
        return new ArrayOfContratoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornarContratoPorFornecedorItemResponse }
     * 
     */
    public RetornarContratoPorFornecedorItemResponse createRetornarContratoPorFornecedorItemResponse() {
        return new RetornarContratoPorFornecedorItemResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoRescindidoResponse }
     * 
     */
    public RetornarContratoRescindidoResponse createRetornarContratoRescindidoResponse() {
        return new RetornarContratoRescindidoResponse();
    }

    /**
     * Create an instance of {@link RetornarCodigoContratoSequenciaResponse }
     * 
     */
    public RetornarCodigoContratoSequenciaResponse createRetornarCodigoContratoSequenciaResponse() {
        return new RetornarCodigoContratoSequenciaResponse();
    }

    /**
     * Create an instance of {@link RetornarContratoPorFornecedorItem }
     * 
     */
    public RetornarContratoPorFornecedorItem createRetornarContratoPorFornecedorItem() {
        return new RetornarContratoPorFornecedorItem();
    }

    /**
     * Create an instance of {@link ArrayOfContratoItemDTO }
     * 
     */
    public ArrayOfContratoItemDTO createArrayOfContratoItemDTO() {
        return new ArrayOfContratoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarContrato }
     * 
     */
    public ProcessarContrato createProcessarContrato() {
        return new ProcessarContrato();
    }

    /**
     * Create an instance of {@link RetornarContratoPorComprador }
     * 
     */
    public RetornarContratoPorComprador createRetornarContratoPorComprador() {
        return new RetornarContratoPorComprador();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContratoItemTaxaDTO")
    public JAXBElement<ContratoItemTaxaDTO> createContratoItemTaxaDTO(ContratoItemTaxaDTO value) {
        return new JAXBElement<ContratoItemTaxaDTO>(_ContratoItemTaxaDTO_QNAME, ContratoItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContratoDTO")
    public JAXBElement<ContratoDTO> createContratoDTO(ContratoDTO value) {
        return new JAXBElement<ContratoDTO>(_ContratoDTO_QNAME, ContratoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfContratoItemEnderecoDTO")
    public JAXBElement<ArrayOfContratoItemEnderecoDTO> createArrayOfContratoItemEnderecoDTO(ArrayOfContratoItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfContratoItemEnderecoDTO>(_ArrayOfContratoItemEnderecoDTO_QNAME, ArrayOfContratoItemEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContratoItemEnderecoDTO")
    public JAXBElement<ContratoItemEnderecoDTO> createContratoItemEnderecoDTO(ContratoItemEnderecoDTO value) {
        return new JAXBElement<ContratoItemEnderecoDTO>(_ContratoItemEnderecoDTO_QNAME, ContratoItemEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWbtLogDTO")
    public JAXBElement<ArrayOfWbtLogDTO> createArrayOfWbtLogDTO(ArrayOfWbtLogDTO value) {
        return new JAXBElement<ArrayOfWbtLogDTO>(_ArrayOfWbtLogDTO_QNAME, ArrayOfWbtLogDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContratoItemDTO")
    public JAXBElement<ContratoItemDTO> createContratoItemDTO(ContratoItemDTO value) {
        return new JAXBElement<ContratoItemDTO>(_ContratoItemDTO_QNAME, ContratoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WbtLogDTO")
    public JAXBElement<WbtLogDTO> createWbtLogDTO(WbtLogDTO value) {
        return new JAXBElement<WbtLogDTO>(_WbtLogDTO_QNAME, WbtLogDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfContratoItemDTO")
    public JAXBElement<ArrayOfContratoItemDTO> createArrayOfContratoItemDTO(ArrayOfContratoItemDTO value) {
        return new JAXBElement<ArrayOfContratoItemDTO>(_ArrayOfContratoItemDTO_QNAME, ArrayOfContratoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoPesquisaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContratoPesquisaDTO")
    public JAXBElement<ContratoPesquisaDTO> createContratoPesquisaDTO(ContratoPesquisaDTO value) {
        return new JAXBElement<ContratoPesquisaDTO>(_ContratoPesquisaDTO_QNAME, ContratoPesquisaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfContratoDTO")
    public JAXBElement<ArrayOfContratoDTO> createArrayOfContratoDTO(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_ArrayOfContratoDTO_QNAME, ArrayOfContratoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfContratoItemTaxaDTO")
    public JAXBElement<ArrayOfContratoItemTaxaDTO> createArrayOfContratoItemTaxaDTO(ArrayOfContratoItemTaxaDTO value) {
        return new JAXBElement<ArrayOfContratoItemTaxaDTO>(_ArrayOfContratoItemTaxaDTO_QNAME, ArrayOfContratoItemTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorCompradorItemResult", scope = RetornarContratoPorCompradorItemResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorCompradorItemResponseRetornarContratoPorCompradorItemResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorCompradorItemResponseRetornarContratoPorCompradorItemResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorCompradorItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCobrancaEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdEmpresaCobrancaEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdEmpresaCobrancaEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdCobrancaEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdEmpresaEntregaEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdEntregaEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdFaturamentoEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = ContratoItemEnderecoDTO.class)
    public JAXBElement<String> createContratoItemEnderecoDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_ContratoItemEnderecoDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, ContratoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoCotacaoResult", scope = RetornarContratoCotacaoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoCotacaoResponseRetornarContratoCotacaoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoCotacaoResponseRetornarContratoCotacaoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdProduto", scope = RetornarContratoPorItem.class)
    public JAXBElement<String> createRetornarContratoPorItemSCdProduto(String value) {
        return new JAXBElement<String>(_RetornarContratoPorItemSCdProduto_QNAME, String.class, RetornarContratoPorItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioGestor", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdUsuarioGestor(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdUsuarioGestor_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDepartamento", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdDepartamento(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdDepartamento_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContrato", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdContrato(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdContrato_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAuditoria", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSDsAuditoria(String value) {
        return new JAXBElement<String>(_ContratoDTOSDsAuditoria_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContratoErp", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdContratoErp(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdContratoErp_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNegociacaoWbc", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdNegociacaoWbc(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdNegociacaoWbc_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioCriador", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdUsuarioCriador(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdUsuarioCriador_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContratoErpPai", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdContratoErpPai(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdContratoErpPai_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTransportadora", scope = ContratoDTO.class)
    public JAXBElement<String> createContratoDTOSCdTransportadora(String value) {
        return new JAXBElement<String>(_ContratoDTOSCdTransportadora_QNAME, String.class, ContratoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrToken", scope = RetornoDTO.class)
    public JAXBElement<String> createRetornoDTOSNrToken(String value) {
        return new JAXBElement<String>(_RetornoDTOSNrToken_QNAME, String.class, RetornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresaFornecedor", scope = RetornarContratoPorFornecedor.class)
    public JAXBElement<String> createRetornarContratoPorFornecedorSCdEmpresaFornecedor(String value) {
        return new JAXBElement<String>(_RetornarContratoPorFornecedorSCdEmpresaFornecedor_QNAME, String.class, RetornarContratoPorFornecedor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoLeilaoResult", scope = RetornarContratoLeilaoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoLeilaoResponseRetornarContratoLeilaoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoLeilaoResponseRetornarContratoLeilaoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoLeilaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoAtivoResult", scope = RetornarContratoAtivoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoAtivoResponseRetornarContratoAtivoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoAtivoResponseRetornarContratoAtivoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoAtivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoEncerradoResult", scope = RetornarContratoEncerradoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoEncerradoResponseRetornarContratoEncerradoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoEncerradoResponseRetornarContratoEncerradoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoEncerradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdIva", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdIva(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdIva_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemErp", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdItemErp(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdItemErp_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMarca", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdMarca(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdMarca_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacoes", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSDsObservacoes(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSDsObservacoes_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemWbc", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdItemWbc(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdItemWbc_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemPaiErp", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdItemPaiErp(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdItemPaiErp_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGarantia", scope = ContratoItemDTO.class)
    public JAXBElement<String> createContratoItemDTOSCdGarantia(String value) {
        return new JAXBElement<String>(_ContratoItemDTOSCdGarantia_QNAME, String.class, ContratoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarContratoResult", scope = ProcessarContratoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarContratoResponseProcessarContratoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarContratoResponseProcessarContratoResult_QNAME, RetornoDTO.class, ProcessarContratoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorFornecedorResult", scope = RetornarContratoPorFornecedorResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorFornecedorResponseRetornarContratoPorFornecedorResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorFornecedorResponseRetornarContratoPorFornecedorResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorFornecedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorTermoAditivoResult", scope = RetornarContratoPorTermoAditivoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorTermoAditivoResponseRetornarContratoPorTermoAditivoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorTermoAditivoResponseRetornarContratoPorTermoAditivoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorTermoAditivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorItemResult", scope = RetornarContratoPorItemResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorItemResponseRetornarContratoPorItemResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorItemResponseRetornarContratoPorItemResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoPesquisaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "oContratoPesquisaDTO", scope = RetornarContratoPorCompradorItem.class)
    public JAXBElement<ContratoPesquisaDTO> createRetornarContratoPorCompradorItemOContratoPesquisaDTO(ContratoPesquisaDTO value) {
        return new JAXBElement<ContratoPesquisaDTO>(_RetornarContratoPorCompradorItemOContratoPesquisaDTO_QNAME, ContratoPesquisaDTO.class, RetornarContratoPorCompradorItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorCompradorResult", scope = RetornarContratoPorCompradorResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorCompradorResponseRetornarContratoPorCompradorResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorCompradorResponseRetornarContratoPorCompradorResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorCompradorResponse.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdComplemento2", scope = WbtLogDTO.class)
    public JAXBElement<String> createWbtLogDTOSCdComplemento2(String value) {
        return new JAXBElement<String>(_WbtLogDTOSCdComplemento2_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdComplemento1", scope = WbtLogDTO.class)
    public JAXBElement<String> createWbtLogDTOSCdComplemento1(String value) {
        return new JAXBElement<String>(_WbtLogDTOSCdComplemento1_QNAME, String.class, WbtLogDTO.class, value);
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
        return new JAXBElement<String>(_RetornoDTOSNrToken_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoPorFornecedorItemResult", scope = RetornarContratoPorFornecedorItemResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoPorFornecedorItemResponseRetornarContratoPorFornecedorItemResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoPorFornecedorItemResponseRetornarContratoPorFornecedorItemResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoPorFornecedorItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarContratoRescindidoResult", scope = RetornarContratoRescindidoResponse.class)
    public JAXBElement<ArrayOfContratoDTO> createRetornarContratoRescindidoResponseRetornarContratoRescindidoResult(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_RetornarContratoRescindidoResponseRetornarContratoRescindidoResult_QNAME, ArrayOfContratoDTO.class, RetornarContratoRescindidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCodigoContratoSequenciaResult", scope = RetornarCodigoContratoSequenciaResponse.class)
    public JAXBElement<String> createRetornarCodigoContratoSequenciaResponseRetornarCodigoContratoSequenciaResult(String value) {
        return new JAXBElement<String>(_RetornarCodigoContratoSequenciaResponseRetornarCodigoContratoSequenciaResult_QNAME, String.class, RetornarCodigoContratoSequenciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContratoPesquisaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "oContratoPesquisaDTO", scope = RetornarContratoPorFornecedorItem.class)
    public JAXBElement<ContratoPesquisaDTO> createRetornarContratoPorFornecedorItemOContratoPesquisaDTO(ContratoPesquisaDTO value) {
        return new JAXBElement<ContratoPesquisaDTO>(_RetornarContratoPorCompradorItemOContratoPesquisaDTO_QNAME, ContratoPesquisaDTO.class, RetornarContratoPorFornecedorItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstContrato", scope = ProcessarContrato.class)
    public JAXBElement<ArrayOfContratoDTO> createProcessarContratoLstContrato(ArrayOfContratoDTO value) {
        return new JAXBElement<ArrayOfContratoDTO>(_ProcessarContratoLstContrato_QNAME, ArrayOfContratoDTO.class, ProcessarContrato.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresaContratante", scope = RetornarContratoPorComprador.class)
    public JAXBElement<String> createRetornarContratoPorCompradorSCdEmpresaContratante(String value) {
        return new JAXBElement<String>(_RetornarContratoPorCompradorSCdEmpresaContratante_QNAME, String.class, RetornarContratoPorComprador.class, value);
    }

}
