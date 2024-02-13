
package br.gov.sp.saobernardo.paradigma.ws.wbtdepara;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.wbtdepara package. 
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
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _WbtDeParaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtDeParaDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _EnumTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Integracao", "enumTipoDocumento");
    private final static QName _GerarDeParaMultiploPorEmpresaSCdEmpresa_QNAME = new QName("http://tempuri.org/", "sCdEmpresa");
    private final static QName _GerarDeParaMultiploPorEmpresaSCdDePara_QNAME = new QName("http://tempuri.org/", "sCdDePara");
    private final static QName _GerarDeParaMultiploPorEmpresaSCdMultiEmpresa_QNAME = new QName("http://tempuri.org/", "sCdMultiEmpresa");
    private final static QName _RetornarDeParaErpResponseRetornarDeParaErpResult_QNAME = new QName("http://tempuri.org/", "RetornarDeParaErpResult");
    private final static QName _WbtDeParaDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtDeParaDTOSCdItemOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemOrigem");
    private final static QName _SalvarSCdItemEmpresa_QNAME = new QName("http://tempuri.org/", "sCdItemEmpresa");
    private final static QName _SalvarSCdItemWbc_QNAME = new QName("http://tempuri.org/", "sCdItemWbc");
    private final static QName _RetornarDeParaWbcOWbtDeParaDTO_QNAME = new QName("http://tempuri.org/", "oWbtDeParaDTO");
    private final static QName _RetornarDeParaWbcResponseRetornarDeParaWbcResult_QNAME = new QName("http://tempuri.org/", "RetornarDeParaWbcResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.wbtdepara
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link GerarDeParaMultiploPorEmpresa }
     * 
     */
    public GerarDeParaMultiploPorEmpresa createGerarDeParaMultiploPorEmpresa() {
        return new GerarDeParaMultiploPorEmpresa();
    }

    /**
     * Create an instance of {@link RetornarDeParaErpResponse }
     * 
     */
    public RetornarDeParaErpResponse createRetornarDeParaErpResponse() {
        return new RetornarDeParaErpResponse();
    }

    /**
     * Create an instance of {@link WbtDeParaDTO }
     * 
     */
    public WbtDeParaDTO createWbtDeParaDTO() {
        return new WbtDeParaDTO();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link RetornarDeParaErp }
     * 
     */
    public RetornarDeParaErp createRetornarDeParaErp() {
        return new RetornarDeParaErp();
    }

    /**
     * Create an instance of {@link RetornarDeParaWbc }
     * 
     */
    public RetornarDeParaWbc createRetornarDeParaWbc() {
        return new RetornarDeParaWbc();
    }

    /**
     * Create an instance of {@link SalvarPorEmpresaResponse }
     * 
     */
    public SalvarPorEmpresaResponse createSalvarPorEmpresaResponse() {
        return new SalvarPorEmpresaResponse();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link SalvarPorEmpresa }
     * 
     */
    public SalvarPorEmpresa createSalvarPorEmpresa() {
        return new SalvarPorEmpresa();
    }

    /**
     * Create an instance of {@link GerarDeParaMultiploPorEmpresaResponse }
     * 
     */
    public GerarDeParaMultiploPorEmpresaResponse createGerarDeParaMultiploPorEmpresaResponse() {
        return new GerarDeParaMultiploPorEmpresaResponse();
    }

    /**
     * Create an instance of {@link RetornarDeParaWbcResponse }
     * 
     */
    public RetornarDeParaWbcResponse createRetornarDeParaWbcResponse() {
        return new RetornarDeParaWbcResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtDeParaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WbtDeParaDTO")
    public JAXBElement<WbtDeParaDTO> createWbtDeParaDTO(WbtDeParaDTO value) {
        return new JAXBElement<WbtDeParaDTO>(_WbtDeParaDTO_QNAME, WbtDeParaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumTipoDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Framework.Integracao", name = "enumTipoDocumento")
    public JAXBElement<EnumTipoDocumento> createEnumTipoDocumento(EnumTipoDocumento value) {
        return new JAXBElement<EnumTipoDocumento>(_EnumTipoDocumento_QNAME, EnumTipoDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresa", scope = GerarDeParaMultiploPorEmpresa.class)
    public JAXBElement<String> createGerarDeParaMultiploPorEmpresaSCdEmpresa(String value) {
        return new JAXBElement<String>(_GerarDeParaMultiploPorEmpresaSCdEmpresa_QNAME, String.class, GerarDeParaMultiploPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdDePara", scope = GerarDeParaMultiploPorEmpresa.class)
    public JAXBElement<String> createGerarDeParaMultiploPorEmpresaSCdDePara(String value) {
        return new JAXBElement<String>(_GerarDeParaMultiploPorEmpresaSCdDePara_QNAME, String.class, GerarDeParaMultiploPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdMultiEmpresa", scope = GerarDeParaMultiploPorEmpresa.class)
    public JAXBElement<String> createGerarDeParaMultiploPorEmpresaSCdMultiEmpresa(String value) {
        return new JAXBElement<String>(_GerarDeParaMultiploPorEmpresaSCdMultiEmpresa_QNAME, String.class, GerarDeParaMultiploPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDeParaErpResult", scope = RetornarDeParaErpResponse.class)
    public JAXBElement<String> createRetornarDeParaErpResponseRetornarDeParaErpResult(String value) {
        return new JAXBElement<String>(_RetornarDeParaErpResponseRetornarDeParaErpResult_QNAME, String.class, RetornarDeParaErpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdOrigem", scope = WbtDeParaDTO.class)
    public JAXBElement<String> createWbtDeParaDTOSCdOrigem(String value) {
        return new JAXBElement<String>(_WbtDeParaDTOSCdOrigem_QNAME, String.class, WbtDeParaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemOrigem", scope = WbtDeParaDTO.class)
    public JAXBElement<String> createWbtDeParaDTOSCdItemOrigem(String value) {
        return new JAXBElement<String>(_WbtDeParaDTOSCdItemOrigem_QNAME, String.class, WbtDeParaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdItemEmpresa", scope = Salvar.class)
    public JAXBElement<String> createSalvarSCdItemEmpresa(String value) {
        return new JAXBElement<String>(_SalvarSCdItemEmpresa_QNAME, String.class, Salvar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdItemWbc", scope = Salvar.class)
    public JAXBElement<String> createSalvarSCdItemWbc(String value) {
        return new JAXBElement<String>(_SalvarSCdItemWbc_QNAME, String.class, Salvar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdItemWbc", scope = RetornarDeParaErp.class)
    public JAXBElement<String> createRetornarDeParaErpSCdItemWbc(String value) {
        return new JAXBElement<String>(_SalvarSCdItemWbc_QNAME, String.class, RetornarDeParaErp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtDeParaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "oWbtDeParaDTO", scope = RetornarDeParaWbc.class)
    public JAXBElement<WbtDeParaDTO> createRetornarDeParaWbcOWbtDeParaDTO(WbtDeParaDTO value) {
        return new JAXBElement<WbtDeParaDTO>(_RetornarDeParaWbcOWbtDeParaDTO_QNAME, WbtDeParaDTO.class, RetornarDeParaWbc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresa", scope = SalvarPorEmpresa.class)
    public JAXBElement<String> createSalvarPorEmpresaSCdEmpresa(String value) {
        return new JAXBElement<String>(_GerarDeParaMultiploPorEmpresaSCdEmpresa_QNAME, String.class, SalvarPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdItemEmpresa", scope = SalvarPorEmpresa.class)
    public JAXBElement<String> createSalvarPorEmpresaSCdItemEmpresa(String value) {
        return new JAXBElement<String>(_SalvarSCdItemEmpresa_QNAME, String.class, SalvarPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdItemWbc", scope = SalvarPorEmpresa.class)
    public JAXBElement<String> createSalvarPorEmpresaSCdItemWbc(String value) {
        return new JAXBElement<String>(_SalvarSCdItemWbc_QNAME, String.class, SalvarPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDeParaWbcResult", scope = RetornarDeParaWbcResponse.class)
    public JAXBElement<String> createRetornarDeParaWbcResponseRetornarDeParaWbcResult(String value) {
        return new JAXBElement<String>(_RetornarDeParaWbcResponseRetornarDeParaWbcResult_QNAME, String.class, RetornarDeParaWbcResponse.class, value);
    }

}
