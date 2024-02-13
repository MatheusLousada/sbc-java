
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.unidademedida package. 
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

    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _UnidadeMedidaIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UnidadeMedidaIdiomaDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfUnidadeMedidaIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUnidadeMedidaIdiomaDTO");
    private final static QName _IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6kL");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _UnidadeMedidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UnidadeMedidaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _RetornoListaX003CUnidadeMedidaDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_UnidadeMedidaDTO_x003E_");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfUnidadeMedidaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUnidadeMedidaDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ProcessarUnidadeMedidaResponseProcessarUnidadeMedidaResult_QNAME = new QName("http://tempuri.org/", "ProcessarUnidadeMedidaResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _UnidadeMedidaDTOLstUnidadeMedidaIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstUnidadeMedidaIdioma");
    private final static QName _UnidadeMedidaDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _UnidadeMedidaDTOBFlStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlStatus");
    private final static QName _ProcessarUnidadeMedidaLstUnidadeMedida_QNAME = new QName("http://tempuri.org/", "lstUnidadeMedida");
    private final static QName _RetornarUnidadeMedidaResponseRetornarUnidadeMedidaResult_QNAME = new QName("http://tempuri.org/", "RetornarUnidadeMedidaResult");
    private final static QName _RetornarUnidadeMedidaSCdUnidadeMedidaErp_QNAME = new QName("http://tempuri.org/", "sCdUnidadeMedidaErp");
    private final static QName _RetornarUnidadeMedidaAtivaResponseRetornarUnidadeMedidaAtivaResult_QNAME = new QName("http://tempuri.org/", "RetornarUnidadeMedidaAtivaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.unidademedida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessarUnidadeMedidaResponse }
     * 
     */
    public ProcessarUnidadeMedidaResponse createProcessarUnidadeMedidaResponse() {
        return new ProcessarUnidadeMedidaResponse();
    }

    /**
     * Create an instance of {@link RetornarUnidadeMedidaAtiva }
     * 
     */
    public RetornarUnidadeMedidaAtiva createRetornarUnidadeMedidaAtiva() {
        return new RetornarUnidadeMedidaAtiva();
    }

    /**
     * Create an instance of {@link ArrayOfUnidadeMedidaIdiomaDTO }
     * 
     */
    public ArrayOfUnidadeMedidaIdiomaDTO createArrayOfUnidadeMedidaIdiomaDTO() {
        return new ArrayOfUnidadeMedidaIdiomaDTO();
    }

    /**
     * Create an instance of {@link UnidadeMedidaIdiomaDTO }
     * 
     */
    public UnidadeMedidaIdiomaDTO createUnidadeMedidaIdiomaDTO() {
        return new UnidadeMedidaIdiomaDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CUnidadeMedidaDTOX003E }
     * 
     */
    public RetornoListaX003CUnidadeMedidaDTOX003E createRetornoListaX003CUnidadeMedidaDTOX003E() {
        return new RetornoListaX003CUnidadeMedidaDTOX003E();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL createIdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link RetornarUnidadeMedidaResponse }
     * 
     */
    public RetornarUnidadeMedidaResponse createRetornarUnidadeMedidaResponse() {
        return new RetornarUnidadeMedidaResponse();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfUnidadeMedidaDTO }
     * 
     */
    public ArrayOfUnidadeMedidaDTO createArrayOfUnidadeMedidaDTO() {
        return new ArrayOfUnidadeMedidaDTO();
    }

    /**
     * Create an instance of {@link UnidadeMedidaDTO }
     * 
     */
    public UnidadeMedidaDTO createUnidadeMedidaDTO() {
        return new UnidadeMedidaDTO();
    }

    /**
     * Create an instance of {@link ProcessarUnidadeMedida }
     * 
     */
    public ProcessarUnidadeMedida createProcessarUnidadeMedida() {
        return new ProcessarUnidadeMedida();
    }

    /**
     * Create an instance of {@link RetornarUnidadeMedidaAtivaResponse }
     * 
     */
    public RetornarUnidadeMedidaAtivaResponse createRetornarUnidadeMedidaAtivaResponse() {
        return new RetornarUnidadeMedidaAtivaResponse();
    }

    /**
     * Create an instance of {@link RetornarUnidadeMedida }
     * 
     */
    public RetornarUnidadeMedida createRetornarUnidadeMedida() {
        return new RetornarUnidadeMedida();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UnidadeMedidaIdiomaDTO")
    public JAXBElement<UnidadeMedidaIdiomaDTO> createUnidadeMedidaIdiomaDTO(UnidadeMedidaIdiomaDTO value) {
        return new JAXBElement<UnidadeMedidaIdiomaDTO>(_UnidadeMedidaIdiomaDTO_QNAME, UnidadeMedidaIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUnidadeMedidaIdiomaDTO")
    public JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> createArrayOfUnidadeMedidaIdiomaDTO(ArrayOfUnidadeMedidaIdiomaDTO value) {
        return new JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO>(_ArrayOfUnidadeMedidaIdiomaDTO_QNAME, ArrayOfUnidadeMedidaIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL> createIdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL(IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL>(_IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UnidadeMedidaDTO")
    public JAXBElement<UnidadeMedidaDTO> createUnidadeMedidaDTO(UnidadeMedidaDTO value) {
        return new JAXBElement<UnidadeMedidaDTO>(_UnidadeMedidaDTO_QNAME, UnidadeMedidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CUnidadeMedidaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_UnidadeMedidaDTO_x003E_")
    public JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> createRetornoListaX003CUnidadeMedidaDTOX003E(RetornoListaX003CUnidadeMedidaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E>(_RetornoListaX003CUnidadeMedidaDTOX003E_QNAME, RetornoListaX003CUnidadeMedidaDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUnidadeMedidaDTO")
    public JAXBElement<ArrayOfUnidadeMedidaDTO> createArrayOfUnidadeMedidaDTO(ArrayOfUnidadeMedidaDTO value) {
        return new JAXBElement<ArrayOfUnidadeMedidaDTO>(_ArrayOfUnidadeMedidaDTO_QNAME, ArrayOfUnidadeMedidaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarUnidadeMedidaResult", scope = ProcessarUnidadeMedidaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarUnidadeMedidaResponseProcessarUnidadeMedidaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarUnidadeMedidaResponseProcessarUnidadeMedidaResult_QNAME, RetornoDTO.class, ProcessarUnidadeMedidaResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstUnidadeMedidaIdioma", scope = UnidadeMedidaDTO.class)
    public JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> createUnidadeMedidaDTOLstUnidadeMedidaIdioma(ArrayOfUnidadeMedidaIdiomaDTO value) {
        return new JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO>(_UnidadeMedidaDTOLstUnidadeMedidaIdioma_QNAME, ArrayOfUnidadeMedidaIdiomaDTO.class, UnidadeMedidaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = UnidadeMedidaDTO.class)
    public JAXBElement<String> createUnidadeMedidaDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_UnidadeMedidaDTOSCdEmpresa_QNAME, String.class, UnidadeMedidaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlStatus", scope = UnidadeMedidaDTO.class)
    public JAXBElement<Integer> createUnidadeMedidaDTOBFlStatus(Integer value) {
        return new JAXBElement<Integer>(_UnidadeMedidaDTOBFlStatus_QNAME, Integer.class, UnidadeMedidaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstUnidadeMedida", scope = ProcessarUnidadeMedida.class)
    public JAXBElement<ArrayOfUnidadeMedidaDTO> createProcessarUnidadeMedidaLstUnidadeMedida(ArrayOfUnidadeMedidaDTO value) {
        return new JAXBElement<ArrayOfUnidadeMedidaDTO>(_ProcessarUnidadeMedidaLstUnidadeMedida_QNAME, ArrayOfUnidadeMedidaDTO.class, ProcessarUnidadeMedida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarUnidadeMedidaResult", scope = RetornarUnidadeMedidaResponse.class)
    public JAXBElement<UnidadeMedidaDTO> createRetornarUnidadeMedidaResponseRetornarUnidadeMedidaResult(UnidadeMedidaDTO value) {
        return new JAXBElement<UnidadeMedidaDTO>(_RetornarUnidadeMedidaResponseRetornarUnidadeMedidaResult_QNAME, UnidadeMedidaDTO.class, RetornarUnidadeMedidaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdUnidadeMedidaErp", scope = RetornarUnidadeMedida.class)
    public JAXBElement<String> createRetornarUnidadeMedidaSCdUnidadeMedidaErp(String value) {
        return new JAXBElement<String>(_RetornarUnidadeMedidaSCdUnidadeMedidaErp_QNAME, String.class, RetornarUnidadeMedida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CUnidadeMedidaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarUnidadeMedidaAtivaResult", scope = RetornarUnidadeMedidaAtivaResponse.class)
    public JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> createRetornarUnidadeMedidaAtivaResponseRetornarUnidadeMedidaAtivaResult(RetornoListaX003CUnidadeMedidaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E>(_RetornarUnidadeMedidaAtivaResponseRetornarUnidadeMedidaAtivaResult_QNAME, RetornoListaX003CUnidadeMedidaDTOX003E.class, RetornarUnidadeMedidaAtivaResponse.class, value);
    }

}
