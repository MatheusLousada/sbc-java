
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida package. 
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
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _NotaFiscalTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalTituloResumidaDTO");
    private final static QName _ArrayOfNotaFiscalItemRateioTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemRateioTituloResumidaDTO");
    private final static QName _NotaFiscalItemRateioTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemRateioTituloResumidaDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfNotaFiscalTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalTituloResumidaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfNotaFiscalItemTaxaTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemTaxaTituloResumidaDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _NotaFiscalItemTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemTituloResumidaDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _NotaFiscalItemTaxaTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NotaFiscalItemTaxaTituloResumidaDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfNotaFiscalItemTituloResumidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNotaFiscalItemTituloResumidaDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _RetornarNotaFiscalResponseRetornarNotaFiscalResult_QNAME = new QName("http://tempuri.org/", "RetornarNotaFiscalResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotaFiscalItemRateioTituloResumidaDTO }
     * 
     */
    public NotaFiscalItemRateioTituloResumidaDTO createNotaFiscalItemRateioTituloResumidaDTO() {
        return new NotaFiscalItemRateioTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemTaxaTituloResumidaDTO }
     * 
     */
    public ArrayOfNotaFiscalItemTaxaTituloResumidaDTO createArrayOfNotaFiscalItemTaxaTituloResumidaDTO() {
        return new ArrayOfNotaFiscalItemTaxaTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscalResponse }
     * 
     */
    public RetornarNotaFiscalResponse createRetornarNotaFiscalResponse() {
        return new RetornarNotaFiscalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemTituloResumidaDTO }
     * 
     */
    public ArrayOfNotaFiscalItemTituloResumidaDTO createArrayOfNotaFiscalItemTituloResumidaDTO() {
        return new ArrayOfNotaFiscalItemTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link NotaFiscalTituloResumidaDTO }
     * 
     */
    public NotaFiscalTituloResumidaDTO createNotaFiscalTituloResumidaDTO() {
        return new NotaFiscalTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link NotaFiscalItemTaxaTituloResumidaDTO }
     * 
     */
    public NotaFiscalItemTaxaTituloResumidaDTO createNotaFiscalItemTaxaTituloResumidaDTO() {
        return new NotaFiscalItemTaxaTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link RetornarNotaFiscal }
     * 
     */
    public RetornarNotaFiscal createRetornarNotaFiscal() {
        return new RetornarNotaFiscal();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalItemRateioTituloResumidaDTO }
     * 
     */
    public ArrayOfNotaFiscalItemRateioTituloResumidaDTO createArrayOfNotaFiscalItemRateioTituloResumidaDTO() {
        return new ArrayOfNotaFiscalItemRateioTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscalTituloResumidaDTO }
     * 
     */
    public ArrayOfNotaFiscalTituloResumidaDTO createArrayOfNotaFiscalTituloResumidaDTO() {
        return new ArrayOfNotaFiscalTituloResumidaDTO();
    }

    /**
     * Create an instance of {@link NotaFiscalItemTituloResumidaDTO }
     * 
     */
    public NotaFiscalItemTituloResumidaDTO createNotaFiscalItemTituloResumidaDTO() {
        return new NotaFiscalItemTituloResumidaDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalTituloResumidaDTO")
    public JAXBElement<NotaFiscalTituloResumidaDTO> createNotaFiscalTituloResumidaDTO(NotaFiscalTituloResumidaDTO value) {
        return new JAXBElement<NotaFiscalTituloResumidaDTO>(_NotaFiscalTituloResumidaDTO_QNAME, NotaFiscalTituloResumidaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemRateioTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemRateioTituloResumidaDTO")
    public JAXBElement<ArrayOfNotaFiscalItemRateioTituloResumidaDTO> createArrayOfNotaFiscalItemRateioTituloResumidaDTO(ArrayOfNotaFiscalItemRateioTituloResumidaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemRateioTituloResumidaDTO>(_ArrayOfNotaFiscalItemRateioTituloResumidaDTO_QNAME, ArrayOfNotaFiscalItemRateioTituloResumidaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemRateioTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemRateioTituloResumidaDTO")
    public JAXBElement<NotaFiscalItemRateioTituloResumidaDTO> createNotaFiscalItemRateioTituloResumidaDTO(NotaFiscalItemRateioTituloResumidaDTO value) {
        return new JAXBElement<NotaFiscalItemRateioTituloResumidaDTO>(_NotaFiscalItemRateioTituloResumidaDTO_QNAME, NotaFiscalItemRateioTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalTituloResumidaDTO")
    public JAXBElement<ArrayOfNotaFiscalTituloResumidaDTO> createArrayOfNotaFiscalTituloResumidaDTO(ArrayOfNotaFiscalTituloResumidaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalTituloResumidaDTO>(_ArrayOfNotaFiscalTituloResumidaDTO_QNAME, ArrayOfNotaFiscalTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemTaxaTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemTaxaTituloResumidaDTO")
    public JAXBElement<ArrayOfNotaFiscalItemTaxaTituloResumidaDTO> createArrayOfNotaFiscalItemTaxaTituloResumidaDTO(ArrayOfNotaFiscalItemTaxaTituloResumidaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemTaxaTituloResumidaDTO>(_ArrayOfNotaFiscalItemTaxaTituloResumidaDTO_QNAME, ArrayOfNotaFiscalItemTaxaTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemTituloResumidaDTO")
    public JAXBElement<NotaFiscalItemTituloResumidaDTO> createNotaFiscalItemTituloResumidaDTO(NotaFiscalItemTituloResumidaDTO value) {
        return new JAXBElement<NotaFiscalItemTituloResumidaDTO>(_NotaFiscalItemTituloResumidaDTO_QNAME, NotaFiscalItemTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscalItemTaxaTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NotaFiscalItemTaxaTituloResumidaDTO")
    public JAXBElement<NotaFiscalItemTaxaTituloResumidaDTO> createNotaFiscalItemTaxaTituloResumidaDTO(NotaFiscalItemTaxaTituloResumidaDTO value) {
        return new JAXBElement<NotaFiscalItemTaxaTituloResumidaDTO>(_NotaFiscalItemTaxaTituloResumidaDTO_QNAME, NotaFiscalItemTaxaTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNotaFiscalItemTituloResumidaDTO")
    public JAXBElement<ArrayOfNotaFiscalItemTituloResumidaDTO> createArrayOfNotaFiscalItemTituloResumidaDTO(ArrayOfNotaFiscalItemTituloResumidaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalItemTituloResumidaDTO>(_ArrayOfNotaFiscalItemTituloResumidaDTO_QNAME, ArrayOfNotaFiscalItemTituloResumidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalTituloResumidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarNotaFiscalResult", scope = RetornarNotaFiscalResponse.class)
    public JAXBElement<ArrayOfNotaFiscalTituloResumidaDTO> createRetornarNotaFiscalResponseRetornarNotaFiscalResult(ArrayOfNotaFiscalTituloResumidaDTO value) {
        return new JAXBElement<ArrayOfNotaFiscalTituloResumidaDTO>(_RetornarNotaFiscalResponseRetornarNotaFiscalResult_QNAME, ArrayOfNotaFiscalTituloResumidaDTO.class, RetornarNotaFiscalResponse.class, value);
    }

}
