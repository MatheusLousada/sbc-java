
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.notafiscal package. 
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

    private final static QName _ArrayOfNotaFiscalFiltroDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalFiltroDTO");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _NotaFiscalItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemTaxaDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _NotaFiscalItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemDTO");
    private final static QName _ArrayOfWbtLogCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogCapaDTO");
    private final static QName _RetornoListaX003CNotaFiscalDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_NotaFiscalDTO_x003E_");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _NotaFiscalDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfNotaFiscalItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemDTO");
    private final static QName _NotaFiscalItemRateioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemRateioDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfNotaFiscalItemRateioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemRateioDTO");
    private final static QName _NotaFiscalFiltroDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalFiltroDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfNotaFiscalItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemTaxaDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _WbtLogCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogCapaDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfNotaFiscalDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalDTO");
    private final static QName _RetornarNotaFiscalFalhaResponseRetornarNotaFiscalFalhaResult_QNAME = new QName("http://tempuri.org/", "RetornarNotaFiscalFalhaResult");
    private final static QName _RetornarNotaFiscalFalhaLstLog_QNAME = new QName("http://tempuri.org/", "lstLog");
    private final static QName _ProcessarNotaFiscalLstNotaFiscal_QNAME = new QName("http://tempuri.org/", "lstNotaFiscal");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _ProcessarNotaFiscalResponseProcessarNotaFiscalResult_QNAME = new QName("http://tempuri.org/", "ProcessarNotaFiscalResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarNotaFiscalRecebidaResponseRetornarNotaFiscalRecebidaResult_QNAME = new QName("http://tempuri.org/", "RetornarNotaFiscalRecebidaResult");
    private final static QName _ConfirmarProcessamentoRetornoNotaFiscalResponseConfirmarProcessamentoRetornoNotaFiscalResult_QNAME = new QName("http://tempuri.org/", "ConfirmarProcessamentoRetornoNotaFiscalResult");
    private final static QName _NotaFiscalItemTaxaDTOSSgTaxa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgTaxa");
    private final static QName _NotaFiscalItemDTOSCdPedidoERP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdPedidoERP");
    private final static QName _NotaFiscalItemDTOSCdUnidadeNegocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUnidadeNegocio");
    private final static QName _NotaFiscalItemDTOSCdCondicaoPagamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCondicaoPagamento");
    private final static QName _NotaFiscalItemDTOSCdCentroCusto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCentroCusto");
    private final static QName _NotaFiscalItemDTOSCdRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdRequisicaoEmpresa");
    private final static QName _NotaFiscalItemDTOSCdEmpresaCompradora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCompradora");
    private final static QName _NotaFiscalItemDTOSCdContaContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContaContabil");
    private final static QName _NotaFiscalItemDTOLstNotaFiscalItemRateioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstNotaFiscalItemRateioDTO");
    private final static QName _NotaFiscalItemDTOSCdItemRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemRequisicaoEmpresa");
    private final static QName _ConfirmarProcessamentoRetornoNotaFiscalLstNotaFiscalFiltroDTO_QNAME = new QName("http://tempuri.org/", "lstNotaFiscalFiltroDTO");
    private final static QName _NotaFiscalFiltroDTOSNrSerie_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrSerie");
    private final static QName _NotaFiscalFiltroDTOSCdEmpresaFornecedora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFornecedora");
    private final static QName _NotaFiscalFiltroDTOSNrNotaFiscal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrNotaFiscal");
    private final static QName _WbtLogCapaDTOLstLogItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstLogItem");
    private final static QName _RetornarNotaFiscalResponseRetornarNotaFiscalResult_QNAME = new QName("http://tempuri.org/", "RetornarNotaFiscalResult");
    private final static QName _NotaFiscalItemRateioDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _NotaFiscalDTONCdTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipo");
    private final static QName _NotaFiscalDTOSCdNatOperacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNatOperacao");
    private final static QName _NotaFiscalDTOSCdEmpresaEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEntregaEndereco");
    private final static QName _NotaFiscalDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _NotaFiscalDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _NotaFiscalDTOSCdEmpresaFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFaturamentoEndereco");
    private final static QName _NotaFiscalDTOSCdChave_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdChave");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.notafiscal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessarNotaFiscalResponse }
     * 
     */
    public ProcessarNotaFiscalResponse createProcessarNotaFiscalResponse() {
        return new ProcessarNotaFiscalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemTaxaDTO }
     * 
     */
    public ArrayOfNotaFiscalItemTaxaDTO createArrayOfNotaFiscalItemTaxaDTO() {
        return new ArrayOfNotaFiscalItemTaxaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link NotaFiscalItemTaxaDTO }
     * 
     */
    public NotaFiscalItemTaxaDTO createNotaFiscalItemTaxaDTO() {
        return new NotaFiscalItemTaxaDTO();
    }

    /**
     * Create an instance of {@link ConfirmarProcessamentoRetornoNotaFiscal }
     * 
     */
    public ConfirmarProcessamentoRetornoNotaFiscal createConfirmarProcessamentoRetornoNotaFiscal() {
        return new ConfirmarProcessamentoRetornoNotaFiscal();
    }

    /**
     * Create an instance of {@link NotaFiscalFiltroDTO }
     * 
     */
    public NotaFiscalFiltroDTO createNotaFiscalFiltroDTO() {
        return new NotaFiscalFiltroDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalRecebida }
     * 
     */
    public RetornarNotaFiscalRecebida createRetornarNotaFiscalRecebida() {
        return new RetornarNotaFiscalRecebida();
    }

    /**
     * Create an instance of {@link WbtLogCapaDTO }
     * 
     */
    public WbtLogCapaDTO createWbtLogCapaDTO() {
        return new WbtLogCapaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalFiltroDTO }
     * 
     */
    public ArrayOfNotaFiscalFiltroDTO createArrayOfNotaFiscalFiltroDTO() {
        return new ArrayOfNotaFiscalFiltroDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CNotaFiscalDTOX003E }
     * 
     */
    public RetornoListaX003CNotaFiscalDTOX003E createRetornoListaX003CNotaFiscalDTOX003E() {
        return new RetornoListaX003CNotaFiscalDTOX003E();
    }

    /**
     * Create an instance of {@link NotaFiscalDTO }
     * 
     */
    public NotaFiscalDTO createNotaFiscalDTO() {
        return new NotaFiscalDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemDTO }
     * 
     */
    public ArrayOfNotaFiscalItemDTO createArrayOfNotaFiscalItemDTO() {
        return new ArrayOfNotaFiscalItemDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalFalha }
     * 
     */
    public RetornarNotaFiscalFalha createRetornarNotaFiscalFalha() {
        return new RetornarNotaFiscalFalha();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalFalhaResponse }
     * 
     */
    public RetornarNotaFiscalFalhaResponse createRetornarNotaFiscalFalhaResponse() {
        return new RetornarNotaFiscalFalhaResponse();
    }

    /**
     * Create an instance of {@link ProcessarNotaFiscal }
     * 
     */
    public ProcessarNotaFiscal createProcessarNotaFiscal() {
        return new ProcessarNotaFiscal();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogCapaDTO }
     * 
     */
    public ArrayOfWbtLogCapaDTO createArrayOfWbtLogCapaDTO() {
        return new ArrayOfWbtLogCapaDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalRecebidaResponse }
     * 
     */
    public RetornarNotaFiscalRecebidaResponse createRetornarNotaFiscalRecebidaResponse() {
        return new RetornarNotaFiscalRecebidaResponse();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalDTO }
     * 
     */
    public ArrayOfNotaFiscalDTO createArrayOfNotaFiscalDTO() {
        return new ArrayOfNotaFiscalDTO();
    }

    /**
     * Create an instance of {@link ConfirmarProcessamentoRetornoNotaFiscalResponse }
     * 
     */
    public ConfirmarProcessamentoRetornoNotaFiscalResponse createConfirmarProcessamentoRetornoNotaFiscalResponse() {
        return new ConfirmarProcessamentoRetornoNotaFiscalResponse();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscal }
     * 
     */
    public RetornarNotaFiscal createRetornarNotaFiscal() {
        return new RetornarNotaFiscal();
    }

    /**
     * Create an instance of {@link NotaFiscalItemDTO }
     * 
     */
    public NotaFiscalItemDTO createNotaFiscalItemDTO() {
        return new NotaFiscalItemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemRateioDTO }
     * 
     */
    public ArrayOfNotaFiscalItemRateioDTO createArrayOfNotaFiscalItemRateioDTO() {
        return new ArrayOfNotaFiscalItemRateioDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalResponse }
     * 
     */
    public RetornarNotaFiscalResponse createRetornarNotaFiscalResponse() {
        return new RetornarNotaFiscalResponse();
    }

    /**
     * Create an instance of {@link NotaFiscalItemRateioDTO }
     * 
     */
    public NotaFiscalItemRateioDTO createNotaFiscalItemRateioDTO() {
        return new NotaFiscalItemRateioDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalFiltroDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalFiltroDTO")
    public JAXBElement<ArrayOfNotaFiscalFiltroDTO> createArrayOfNotaFiscalFiltroDTO(ArrayOfNotaFiscalFiltroDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalFiltroDTO>(_ArrayOfNotaFiscalFiltroDTO_QNAME, ArrayOfNotaFiscalFiltroDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemTaxaDTO")
    public JAXBElement<NotaFiscalItemTaxaDTO> createNotaFiscalItemTaxaDTO(NotaFiscalItemTaxaDTO value) {
        return new JAXBElement<NotaFiscalItemTaxaDTO>(_NotaFiscalItemTaxaDTO_QNAME, NotaFiscalItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemDTO")
    public JAXBElement<NotaFiscalItemDTO> createNotaFiscalItemDTO(NotaFiscalItemDTO value) {
        return new JAXBElement<NotaFiscalItemDTO>(_NotaFiscalItemDTO_QNAME, NotaFiscalItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWbtLogCapaDTO")
    public JAXBElement<ArrayOfWbtLogCapaDTO> createArrayOfWbtLogCapaDTO(ArrayOfWbtLogCapaDTO value) {
        return new JAXBElement<ArrayOfWbtLogCapaDTO>(_ArrayOfWbtLogCapaDTO_QNAME, ArrayOfWbtLogCapaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CNotaFiscalDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_NotaFiscalDTO_x003E_")
    public JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> createRetornoListaX003CNotaFiscalDTOX003E(RetornoListaX003CNotaFiscalDTOX003E value) {
        return new JAXBElement<RetornoListaX003CNotaFiscalDTOX003E>(_RetornoListaX003CNotaFiscalDTOX003E_QNAME, RetornoListaX003CNotaFiscalDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalDTO")
    public JAXBElement<NotaFiscalDTO> createNotaFiscalDTO(NotaFiscalDTO value) {
        return new JAXBElement<NotaFiscalDTO>(_NotaFiscalDTO_QNAME, NotaFiscalDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemDTO")
    public JAXBElement<ArrayOfNotaFiscalItemDTO> createArrayOfNotaFiscalItemDTO(ArrayOfNotaFiscalItemDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemDTO>(_ArrayOfNotaFiscalItemDTO_QNAME, ArrayOfNotaFiscalItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemRateioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemRateioDTO")
    public JAXBElement<NotaFiscalItemRateioDTO> createNotaFiscalItemRateioDTO(NotaFiscalItemRateioDTO value) {
        return new JAXBElement<NotaFiscalItemRateioDTO>(_NotaFiscalItemRateioDTO_QNAME, NotaFiscalItemRateioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemRateioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemRateioDTO")
    public JAXBElement<ArrayOfNotaFiscalItemRateioDTO> createArrayOfNotaFiscalItemRateioDTO(ArrayOfNotaFiscalItemRateioDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemRateioDTO>(_ArrayOfNotaFiscalItemRateioDTO_QNAME, ArrayOfNotaFiscalItemRateioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalFiltroDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalFiltroDTO")
    public JAXBElement<NotaFiscalFiltroDTO> createNotaFiscalFiltroDTO(NotaFiscalFiltroDTO value) {
        return new JAXBElement<NotaFiscalFiltroDTO>(_NotaFiscalFiltroDTO_QNAME, NotaFiscalFiltroDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemTaxaDTO")
    public JAXBElement<ArrayOfNotaFiscalItemTaxaDTO> createArrayOfNotaFiscalItemTaxaDTO(ArrayOfNotaFiscalItemTaxaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemTaxaDTO>(_ArrayOfNotaFiscalItemTaxaDTO_QNAME, ArrayOfNotaFiscalItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WbtLogCapaDTO")
    public JAXBElement<WbtLogCapaDTO> createWbtLogCapaDTO(WbtLogCapaDTO value) {
        return new JAXBElement<WbtLogCapaDTO>(_WbtLogCapaDTO_QNAME, WbtLogCapaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalDTO")
    public JAXBElement<ArrayOfNotaFiscalDTO> createArrayOfNotaFiscalDTO(ArrayOfNotaFiscalDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalDTO>(_ArrayOfNotaFiscalDTO_QNAME, ArrayOfNotaFiscalDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarNotaFiscalFalhaResult", scope = RetornarNotaFiscalFalhaResponse.class)
    public JAXBElement<RetornoDTO> createRetornarNotaFiscalFalhaResponseRetornarNotaFiscalFalhaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_RetornarNotaFiscalFalhaResponseRetornarNotaFiscalFalhaResult_QNAME, RetornoDTO.class, RetornarNotaFiscalFalhaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLog", scope = RetornarNotaFiscalFalha.class)
    public JAXBElement<ArrayOfWbtLogCapaDTO> createRetornarNotaFiscalFalhaLstLog(ArrayOfWbtLogCapaDTO value) {
        return new JAXBElement<ArrayOfWbtLogCapaDTO>(_RetornarNotaFiscalFalhaLstLog_QNAME, ArrayOfWbtLogCapaDTO.class, RetornarNotaFiscalFalha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstNotaFiscal", scope = ProcessarNotaFiscal.class)
    public JAXBElement<ArrayOfNotaFiscalDTO> createProcessarNotaFiscalLstNotaFiscal(ArrayOfNotaFiscalDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalDTO>(_ProcessarNotaFiscalLstNotaFiscal_QNAME, ArrayOfNotaFiscalDTO.class, ProcessarNotaFiscal.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarNotaFiscalResult", scope = ProcessarNotaFiscalResponse.class)
    public JAXBElement<RetornoDTO> createProcessarNotaFiscalResponseProcessarNotaFiscalResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarNotaFiscalResponseProcessarNotaFiscalResult_QNAME, RetornoDTO.class, ProcessarNotaFiscalResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CNotaFiscalDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarNotaFiscalRecebidaResult", scope = RetornarNotaFiscalRecebidaResponse.class)
    public JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> createRetornarNotaFiscalRecebidaResponseRetornarNotaFiscalRecebidaResult(RetornoListaX003CNotaFiscalDTOX003E value) {
        return new JAXBElement<RetornoListaX003CNotaFiscalDTOX003E>(_RetornarNotaFiscalRecebidaResponseRetornarNotaFiscalRecebidaResult_QNAME, RetornoListaX003CNotaFiscalDTOX003E.class, RetornarNotaFiscalRecebidaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmarProcessamentoRetornoNotaFiscalResult", scope = ConfirmarProcessamentoRetornoNotaFiscalResponse.class)
    public JAXBElement<RetornoDTO> createConfirmarProcessamentoRetornoNotaFiscalResponseConfirmarProcessamentoRetornoNotaFiscalResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ConfirmarProcessamentoRetornoNotaFiscalResponseConfirmarProcessamentoRetornoNotaFiscalResult_QNAME, RetornoDTO.class, ConfirmarProcessamentoRetornoNotaFiscalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgTaxa", scope = NotaFiscalItemTaxaDTO.class)
    public JAXBElement<String> createNotaFiscalItemTaxaDTOSSgTaxa(String value) {
        return new JAXBElement<String>(_NotaFiscalItemTaxaDTOSSgTaxa_QNAME, String.class, NotaFiscalItemTaxaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPedidoERP", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdPedidoERP(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdPedidoERP_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeNegocio", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdUnidadeNegocio(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdUnidadeNegocio_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCondicaoPagamento", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdCondicaoPagamento(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdCondicaoPagamento_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCusto", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdCentroCusto(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdCentroCusto_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRequisicaoEmpresa", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdRequisicaoEmpresa_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCompradora", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdEmpresaCompradora(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdEmpresaCompradora_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaContabil", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdContaContabil(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdContaContabil_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemRateioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstNotaFiscalItemRateioDTO", scope = NotaFiscalItemDTO.class)
    public JAXBElement<ArrayOfNotaFiscalItemRateioDTO> createNotaFiscalItemDTOLstNotaFiscalItemRateioDTO(ArrayOfNotaFiscalItemRateioDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemRateioDTO>(_NotaFiscalItemDTOLstNotaFiscalItemRateioDTO_QNAME, ArrayOfNotaFiscalItemRateioDTO.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemRequisicaoEmpresa", scope = NotaFiscalItemDTO.class)
    public JAXBElement<String> createNotaFiscalItemDTOSCdItemRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdItemRequisicaoEmpresa_QNAME, String.class, NotaFiscalItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalFiltroDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstNotaFiscalFiltroDTO", scope = ConfirmarProcessamentoRetornoNotaFiscal.class)
    public JAXBElement<ArrayOfNotaFiscalFiltroDTO> createConfirmarProcessamentoRetornoNotaFiscalLstNotaFiscalFiltroDTO(ArrayOfNotaFiscalFiltroDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalFiltroDTO>(_ConfirmarProcessamentoRetornoNotaFiscalLstNotaFiscalFiltroDTO_QNAME, ArrayOfNotaFiscalFiltroDTO.class, ConfirmarProcessamentoRetornoNotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrSerie", scope = NotaFiscalFiltroDTO.class)
    public JAXBElement<String> createNotaFiscalFiltroDTOSNrSerie(String value) {
        return new JAXBElement<String>(_NotaFiscalFiltroDTOSNrSerie_QNAME, String.class, NotaFiscalFiltroDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFornecedora", scope = NotaFiscalFiltroDTO.class)
    public JAXBElement<String> createNotaFiscalFiltroDTOSCdEmpresaFornecedora(String value) {
        return new JAXBElement<String>(_NotaFiscalFiltroDTOSCdEmpresaFornecedora_QNAME, String.class, NotaFiscalFiltroDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrNotaFiscal", scope = NotaFiscalFiltroDTO.class)
    public JAXBElement<String> createNotaFiscalFiltroDTOSNrNotaFiscal(String value) {
        return new JAXBElement<String>(_NotaFiscalFiltroDTOSNrNotaFiscal_QNAME, String.class, NotaFiscalFiltroDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstLogItem", scope = WbtLogCapaDTO.class)
    public JAXBElement<ArrayOfWbtLogDTO> createWbtLogCapaDTOLstLogItem(ArrayOfWbtLogDTO value) {
        return new JAXBElement<ArrayOfWbtLogDTO>(_WbtLogCapaDTOLstLogItem_QNAME, ArrayOfWbtLogDTO.class, WbtLogCapaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarNotaFiscalResult", scope = RetornarNotaFiscalResponse.class)
    public JAXBElement<ArrayOfNotaFiscalDTO> createRetornarNotaFiscalResponseRetornarNotaFiscalResult(ArrayOfNotaFiscalDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalDTO>(_RetornarNotaFiscalResponseRetornarNotaFiscalResult_QNAME, ArrayOfNotaFiscalDTO.class, RetornarNotaFiscalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = NotaFiscalItemRateioDTO.class)
    public JAXBElement<String> createNotaFiscalItemRateioDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_NotaFiscalItemRateioDTOSCdEmpresa_QNAME, String.class, NotaFiscalItemRateioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCusto", scope = NotaFiscalItemRateioDTO.class)
    public JAXBElement<String> createNotaFiscalItemRateioDTOSCdCentroCusto(String value) {
        return new JAXBElement<String>(_NotaFiscalItemDTOSCdCentroCusto_QNAME, String.class, NotaFiscalItemRateioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipo", scope = NotaFiscalDTO.class)
    public JAXBElement<Long> createNotaFiscalDTONCdTipo(Long value) {
        return new JAXBElement<Long>(_NotaFiscalDTONCdTipo_QNAME, Long.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNatOperacao", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdNatOperacao(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdNatOperacao_QNAME, String.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdEmpresaEntregaEndereco_QNAME, String.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdEntregaEndereco_QNAME, String.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdFaturamentoEndereco_QNAME, String.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, NotaFiscalDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdChave", scope = NotaFiscalDTO.class)
    public JAXBElement<String> createNotaFiscalDTOSCdChave(String value) {
        return new JAXBElement<String>(_NotaFiscalDTOSCdChave_QNAME, String.class, NotaFiscalDTO.class, value);
    }

}
