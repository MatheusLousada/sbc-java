
package br.gov.sp.saobernardo.paradigma.ws.contacontabil;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.contacontabil package. 
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
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ContaContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContaContabilDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfContaContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfContaContabilDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _ContaContabilDTOBFlAtivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAtivo");
    private final static QName _ContaContabilDTOSCdContaContabilPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContaContabilPai");
    private final static QName _ProcessarContaContabilResponseProcessarContaContabilResult_QNAME = new QName("http://tempuri.org/", "ProcessarContaContabilResult");
    private final static QName _ProcessarContaContabilLstContaContabil_QNAME = new QName("http://tempuri.org/", "lstContaContabil");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.contacontabil
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ContaContabilDTO }
     * 
     */
    public ContaContabilDTO createContaContabilDTO() {
        return new ContaContabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfContaContabilDTO }
     * 
     */
    public ArrayOfContaContabilDTO createArrayOfContaContabilDTO() {
        return new ArrayOfContaContabilDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ProcessarContaContabilResponse }
     * 
     */
    public ProcessarContaContabilResponse createProcessarContaContabilResponse() {
        return new ProcessarContaContabilResponse();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ProcessarContaContabil }
     * 
     */
    public ProcessarContaContabil createProcessarContaContabil() {
        return new ProcessarContaContabil();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContaContabilDTO")
    public JAXBElement<ContaContabilDTO> createContaContabilDTO(ContaContabilDTO value) {
        return new JAXBElement<ContaContabilDTO>(_ContaContabilDTO_QNAME, ContaContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfContaContabilDTO")
    public JAXBElement<ArrayOfContaContabilDTO> createArrayOfContaContabilDTO(ArrayOfContaContabilDTO value) {
        return new JAXBElement<ArrayOfContaContabilDTO>(_ArrayOfContaContabilDTO_QNAME, ArrayOfContaContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", name = "DtoBase")
    public JAXBElement<DtoBase> createDtoBase(DtoBase value) {
        return new JAXBElement<DtoBase>(_DtoBase_QNAME, DtoBase.class, null, value);
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
        return new JAXBElement<String>(_WbtLogDTOSNrToken_QNAME, String.class, WbtLogDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAtivo", scope = ContaContabilDTO.class)
    public JAXBElement<Integer> createContaContabilDTOBFlAtivo(Integer value) {
        return new JAXBElement<Integer>(_ContaContabilDTOBFlAtivo_QNAME, Integer.class, ContaContabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaContabilPai", scope = ContaContabilDTO.class)
    public JAXBElement<String> createContaContabilDTOSCdContaContabilPai(String value) {
        return new JAXBElement<String>(_ContaContabilDTOSCdContaContabilPai_QNAME, String.class, ContaContabilDTO.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarContaContabilResult", scope = ProcessarContaContabilResponse.class)
    public JAXBElement<RetornoDTO> createProcessarContaContabilResponseProcessarContaContabilResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarContaContabilResponseProcessarContaContabilResult_QNAME, RetornoDTO.class, ProcessarContaContabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstContaContabil", scope = ProcessarContaContabil.class)
    public JAXBElement<ArrayOfContaContabilDTO> createProcessarContaContabilLstContaContabil(ArrayOfContaContabilDTO value) {
        return new JAXBElement<ArrayOfContaContabilDTO>(_ProcessarContaContabilLstContaContabil_QNAME, ArrayOfContaContabilDTO.class, ProcessarContaContabil.class, value);
    }

}
