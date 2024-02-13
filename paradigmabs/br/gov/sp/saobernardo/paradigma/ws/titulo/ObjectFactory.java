
package br.gov.sp.saobernardo.paradigma.ws.titulo;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.titulo package. 
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

    private final static QName _TituloPagamentoDTOSCdAgencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAgencia");
    private final static QName _TituloPagamentoDTONCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdMoeda");
    private final static QName _TituloPagamentoDTOSCdAgenciaDigito_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAgenciaDigito");
    private final static QName _TituloPagamentoDTOSCdBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdBanco");
    private final static QName _TituloPagamentoDTONCdBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdBanco");
    private final static QName _TituloPagamentoDTOSCdContaCorrente_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContaCorrente");
    private final static QName _TituloPagamentoDTOSNrTransacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTransacao");
    private final static QName _TituloPagamentoDTOSCdContaDigito_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContaDigito");
    private final static QName _TituloPagamentoDTOSCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMoeda");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfTituloDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTituloDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfTituloDescontoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTituloDescontoDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfTituloItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTituloItemDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _TituloDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TituloDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _TituloPagamentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TituloPagamentoDTO");
    private final static QName _ArrayOfTituloTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTituloTaxaDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _TituloItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TituloItemDTO");
    private final static QName _TituloDescontoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TituloDescontoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfTituloPagamentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTituloPagamentoDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _TituloTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TituloTaxaDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ProcessarTituloResponseProcessarTituloResult_QNAME = new QName("http://tempuri.org/", "ProcessarTituloResult");
    private final static QName _ProcessarTituloLstTitulo_QNAME = new QName("http://tempuri.org/", "lstTitulo");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _TituloDTOSDsMotivoRetorno_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsMotivoRetorno");
    private final static QName _TituloDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _TituloDTOTDtProtocolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtProtocolo");
    private final static QName _TituloDTOLstTituloTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstTituloTaxaDTO");
    private final static QName _TituloDTOTDtProtocoloComplementar_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtProtocoloComplementar");
    private final static QName _TituloDTOSNrProtocolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrProtocolo");
    private final static QName _TituloDTOSNrProtocoloComplementar_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrProtocoloComplementar");
    private final static QName _TituloDTOTDtEnvioEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtEnvioEvento");
    private final static QName _TituloDTONCdSituacaoSemaforo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdSituacaoSemaforo");
    private final static QName _TituloDTOSDsPasso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsPasso");
    private final static QName _TituloDTOLstTituloDescontoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstTituloDescontoDTO");
    private final static QName _TituloDTOSNrPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrPedido");
    private final static QName _TituloDTONCdSituacaoEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdSituacaoEvento");
    private final static QName _TituloDTOSNrNotaFiscalSerie_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrNotaFiscalSerie");
    private final static QName _TituloDTOSNrContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrContrato");
    private final static QName _TituloDTONNrVersao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrVersao");
    private final static QName _TituloDTOLstTituloPagamentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstTituloPagamentoDTO");
    private final static QName _TituloDTONCdSituacaoOperacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdSituacaoOperacao");
    private final static QName _TituloDTOTDtVencimento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtVencimento");
    private final static QName _TituloDTOSNrNotaFiscal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrNotaFiscal");
    private final static QName _TituloDTONCdSituacaoTitulo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdSituacaoTitulo");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.titulo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessarTitulo }
     * 
     */
    public ProcessarTitulo createProcessarTitulo() {
        return new ProcessarTitulo();
    }

    /**
     * Create an instance of {@link ArrayOfTituloTaxaDTO }
     * 
     */
    public ArrayOfTituloTaxaDTO createArrayOfTituloTaxaDTO() {
        return new ArrayOfTituloTaxaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfTituloItemDTO }
     * 
     */
    public ArrayOfTituloItemDTO createArrayOfTituloItemDTO() {
        return new ArrayOfTituloItemDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link TituloTaxaDTO }
     * 
     */
    public TituloTaxaDTO createTituloTaxaDTO() {
        return new TituloTaxaDTO();
    }

    /**
     * Create an instance of {@link TituloDescontoDTO }
     * 
     */
    public TituloDescontoDTO createTituloDescontoDTO() {
        return new TituloDescontoDTO();
    }

    /**
     * Create an instance of {@link TituloItemDTO }
     * 
     */
    public TituloItemDTO createTituloItemDTO() {
        return new TituloItemDTO();
    }

    /**
     * Create an instance of {@link TituloPagamentoDTO }
     * 
     */
    public TituloPagamentoDTO createTituloPagamentoDTO() {
        return new TituloPagamentoDTO();
    }

    /**
     * Create an instance of {@link ProcessarTituloResponse }
     * 
     */
    public ProcessarTituloResponse createProcessarTituloResponse() {
        return new ProcessarTituloResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTituloDTO }
     * 
     */
    public ArrayOfTituloDTO createArrayOfTituloDTO() {
        return new ArrayOfTituloDTO();
    }

    /**
     * Create an instance of {@link ArrayOfTituloPagamentoDTO }
     * 
     */
    public ArrayOfTituloPagamentoDTO createArrayOfTituloPagamentoDTO() {
        return new ArrayOfTituloPagamentoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link TituloDTO }
     * 
     */
    public TituloDTO createTituloDTO() {
        return new TituloDTO();
    }

    /**
     * Create an instance of {@link ArrayOfTituloDescontoDTO }
     * 
     */
    public ArrayOfTituloDescontoDTO createArrayOfTituloDescontoDTO() {
        return new ArrayOfTituloDescontoDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAgencia", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdAgencia(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdAgencia_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdMoeda", scope = TituloPagamentoDTO.class)
    public JAXBElement<Long> createTituloPagamentoDTONCdMoeda(Long value) {
        return new JAXBElement<Long>(_TituloPagamentoDTONCdMoeda_QNAME, Long.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAgenciaDigito", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdAgenciaDigito(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdAgenciaDigito_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdBanco", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdBanco(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdBanco_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdBanco", scope = TituloPagamentoDTO.class)
    public JAXBElement<Long> createTituloPagamentoDTONCdBanco(Long value) {
        return new JAXBElement<Long>(_TituloPagamentoDTONCdBanco_QNAME, Long.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaCorrente", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdContaCorrente(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdContaCorrente_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTransacao", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSNrTransacao(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSNrTransacao_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaDigito", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdContaDigito(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdContaDigito_QNAME, String.class, TituloPagamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMoeda", scope = TituloPagamentoDTO.class)
    public JAXBElement<String> createTituloPagamentoDTOSCdMoeda(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdMoeda_QNAME, String.class, TituloPagamentoDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTituloDTO")
    public JAXBElement<ArrayOfTituloDTO> createArrayOfTituloDTO(ArrayOfTituloDTO value) {
        return new JAXBElement<ArrayOfTituloDTO>(_ArrayOfTituloDTO_QNAME, ArrayOfTituloDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloDescontoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTituloDescontoDTO")
    public JAXBElement<ArrayOfTituloDescontoDTO> createArrayOfTituloDescontoDTO(ArrayOfTituloDescontoDTO value) {
        return new JAXBElement<ArrayOfTituloDescontoDTO>(_ArrayOfTituloDescontoDTO_QNAME, ArrayOfTituloDescontoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTituloItemDTO")
    public JAXBElement<ArrayOfTituloItemDTO> createArrayOfTituloItemDTO(ArrayOfTituloItemDTO value) {
        return new JAXBElement<ArrayOfTituloItemDTO>(_ArrayOfTituloItemDTO_QNAME, ArrayOfTituloItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TituloDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TituloDTO")
    public JAXBElement<TituloDTO> createTituloDTO(TituloDTO value) {
        return new JAXBElement<TituloDTO>(_TituloDTO_QNAME, TituloDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TituloPagamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TituloPagamentoDTO")
    public JAXBElement<TituloPagamentoDTO> createTituloPagamentoDTO(TituloPagamentoDTO value) {
        return new JAXBElement<TituloPagamentoDTO>(_TituloPagamentoDTO_QNAME, TituloPagamentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTituloTaxaDTO")
    public JAXBElement<ArrayOfTituloTaxaDTO> createArrayOfTituloTaxaDTO(ArrayOfTituloTaxaDTO value) {
        return new JAXBElement<ArrayOfTituloTaxaDTO>(_ArrayOfTituloTaxaDTO_QNAME, ArrayOfTituloTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TituloItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TituloItemDTO")
    public JAXBElement<TituloItemDTO> createTituloItemDTO(TituloItemDTO value) {
        return new JAXBElement<TituloItemDTO>(_TituloItemDTO_QNAME, TituloItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TituloDescontoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TituloDescontoDTO")
    public JAXBElement<TituloDescontoDTO> createTituloDescontoDTO(TituloDescontoDTO value) {
        return new JAXBElement<TituloDescontoDTO>(_TituloDescontoDTO_QNAME, TituloDescontoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloPagamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTituloPagamentoDTO")
    public JAXBElement<ArrayOfTituloPagamentoDTO> createArrayOfTituloPagamentoDTO(ArrayOfTituloPagamentoDTO value) {
        return new JAXBElement<ArrayOfTituloPagamentoDTO>(_ArrayOfTituloPagamentoDTO_QNAME, ArrayOfTituloPagamentoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TituloTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TituloTaxaDTO")
    public JAXBElement<TituloTaxaDTO> createTituloTaxaDTO(TituloTaxaDTO value) {
        return new JAXBElement<TituloTaxaDTO>(_TituloTaxaDTO_QNAME, TituloTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarTituloResult", scope = ProcessarTituloResponse.class)
    public JAXBElement<RetornoDTO> createProcessarTituloResponseProcessarTituloResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarTituloResponseProcessarTituloResult_QNAME, RetornoDTO.class, ProcessarTituloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstTitulo", scope = ProcessarTitulo.class)
    public JAXBElement<ArrayOfTituloDTO> createProcessarTituloLstTitulo(ArrayOfTituloDTO value) {
        return new JAXBElement<ArrayOfTituloDTO>(_ProcessarTituloLstTitulo_QNAME, ArrayOfTituloDTO.class, ProcessarTitulo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMotivoRetorno", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSDsMotivoRetorno(String value) {
        return new JAXBElement<String>(_TituloDTOSDsMotivoRetorno_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_TituloDTOSDsObservacao_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtProtocolo", scope = TituloDTO.class)
    public JAXBElement<XMLGregorianCalendar> createTituloDTOTDtProtocolo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TituloDTOTDtProtocolo_QNAME, XMLGregorianCalendar.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstTituloTaxaDTO", scope = TituloDTO.class)
    public JAXBElement<ArrayOfTituloTaxaDTO> createTituloDTOLstTituloTaxaDTO(ArrayOfTituloTaxaDTO value) {
        return new JAXBElement<ArrayOfTituloTaxaDTO>(_TituloDTOLstTituloTaxaDTO_QNAME, ArrayOfTituloTaxaDTO.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtProtocoloComplementar", scope = TituloDTO.class)
    public JAXBElement<XMLGregorianCalendar> createTituloDTOTDtProtocoloComplementar(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TituloDTOTDtProtocoloComplementar_QNAME, XMLGregorianCalendar.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrProtocolo", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrProtocolo(String value) {
        return new JAXBElement<String>(_TituloDTOSNrProtocolo_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrProtocoloComplementar", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrProtocoloComplementar(String value) {
        return new JAXBElement<String>(_TituloDTOSNrProtocoloComplementar_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtEnvioEvento", scope = TituloDTO.class)
    public JAXBElement<XMLGregorianCalendar> createTituloDTOTDtEnvioEvento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TituloDTOTDtEnvioEvento_QNAME, XMLGregorianCalendar.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdSituacaoSemaforo", scope = TituloDTO.class)
    public JAXBElement<Integer> createTituloDTONCdSituacaoSemaforo(Integer value) {
        return new JAXBElement<Integer>(_TituloDTONCdSituacaoSemaforo_QNAME, Integer.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsPasso", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSDsPasso(String value) {
        return new JAXBElement<String>(_TituloDTOSDsPasso_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloDescontoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstTituloDescontoDTO", scope = TituloDTO.class)
    public JAXBElement<ArrayOfTituloDescontoDTO> createTituloDTOLstTituloDescontoDTO(ArrayOfTituloDescontoDTO value) {
        return new JAXBElement<ArrayOfTituloDescontoDTO>(_TituloDTOLstTituloDescontoDTO_QNAME, ArrayOfTituloDescontoDTO.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrPedido", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrPedido(String value) {
        return new JAXBElement<String>(_TituloDTOSNrPedido_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdSituacaoEvento", scope = TituloDTO.class)
    public JAXBElement<Integer> createTituloDTONCdSituacaoEvento(Integer value) {
        return new JAXBElement<Integer>(_TituloDTONCdSituacaoEvento_QNAME, Integer.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrNotaFiscalSerie", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrNotaFiscalSerie(String value) {
        return new JAXBElement<String>(_TituloDTOSNrNotaFiscalSerie_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrContrato", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrContrato(String value) {
        return new JAXBElement<String>(_TituloDTOSNrContrato_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrVersao", scope = TituloDTO.class)
    public JAXBElement<Integer> createTituloDTONNrVersao(Integer value) {
        return new JAXBElement<Integer>(_TituloDTONNrVersao_QNAME, Integer.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTituloPagamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstTituloPagamentoDTO", scope = TituloDTO.class)
    public JAXBElement<ArrayOfTituloPagamentoDTO> createTituloDTOLstTituloPagamentoDTO(ArrayOfTituloPagamentoDTO value) {
        return new JAXBElement<ArrayOfTituloPagamentoDTO>(_TituloDTOLstTituloPagamentoDTO_QNAME, ArrayOfTituloPagamentoDTO.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdSituacaoOperacao", scope = TituloDTO.class)
    public JAXBElement<Integer> createTituloDTONCdSituacaoOperacao(Integer value) {
        return new JAXBElement<Integer>(_TituloDTONCdSituacaoOperacao_QNAME, Integer.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMoeda", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSCdMoeda(String value) {
        return new JAXBElement<String>(_TituloPagamentoDTOSCdMoeda_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtVencimento", scope = TituloDTO.class)
    public JAXBElement<XMLGregorianCalendar> createTituloDTOTDtVencimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TituloDTOTDtVencimento_QNAME, XMLGregorianCalendar.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrNotaFiscal", scope = TituloDTO.class)
    public JAXBElement<String> createTituloDTOSNrNotaFiscal(String value) {
        return new JAXBElement<String>(_TituloDTOSNrNotaFiscal_QNAME, String.class, TituloDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdSituacaoTitulo", scope = TituloDTO.class)
    public JAXBElement<Integer> createTituloDTONCdSituacaoTitulo(Integer value) {
        return new JAXBElement<Integer>(_TituloDTONCdSituacaoTitulo_QNAME, Integer.class, TituloDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtVencimento", scope = TituloItemDTO.class)
    public JAXBElement<XMLGregorianCalendar> createTituloItemDTOTDtVencimento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TituloDTOTDtVencimento_QNAME, XMLGregorianCalendar.class, TituloItemDTO.class, value);
    }

}
