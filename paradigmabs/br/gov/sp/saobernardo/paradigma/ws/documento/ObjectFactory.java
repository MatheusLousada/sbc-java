
package br.gov.sp.saobernardo.paradigma.ws.documento;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.documento package. 
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

    private final static QName _RetornarDocumentoPorFuncionarioSCdIdentificador_QNAME = new QName("http://tempuri.org/", "sCdIdentificador");
    private final static QName _RetornarDocumentoPorFuncionarioResponseRetornarDocumentoPorFuncionarioResult_QNAME = new QName("http://tempuri.org/", "RetornarDocumentoPorFuncionarioResult");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _TipoContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TipoContatoDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfDocumentoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDocumentoEmpresaDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfDocumentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDocumentoDTO");
    private final static QName _DocumentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DocumentoDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _EmpresaContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaContatoDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfEmpresaContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaContatoDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfTipoContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTipoContatoDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _DocumentoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DocumentoEmpresaDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _EmpresaContatoDTOSDsCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsCargo");
    private final static QName _EmpresaContatoDTOLstDocumentoContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDocumentoContato");
    private final static QName _EmpresaContatoDTOSNrTelefone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefone");
    private final static QName _EmpresaContatoDTOSDsEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsEmail");
    private final static QName _EmpresaContatoDTOSNrCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCelular");
    private final static QName _EmpresaContatoDTOLstTipoContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstTipoContato");
    private final static QName _EmpresaContatoDTOSNrTelefoneDDD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefoneDDD");
    private final static QName _EmpresaContatoDTONCdContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdContato");
    private final static QName _EmpresaContatoDTOSNrRamal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrRamal");
    private final static QName _DocumentoEmpresaDTOLstDocumentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDocumentoDTO");
    private final static QName _DocumentoEmpresaDTOLstEmpresaContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaContatoDTO");
    private final static QName _DocumentoEmpresaDTOLstDocumentoFuncionarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDocumentoFuncionarioDTO");
    private final static QName _RetornarDocumentoResponseRetornarDocumentoResult_QNAME = new QName("http://tempuri.org/", "RetornarDocumentoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.documento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarDocumento }
     * 
     */
    public RetornarDocumento createRetornarDocumento() {
        return new RetornarDocumento();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoEmpresaDTO }
     * 
     */
    public ArrayOfDocumentoEmpresaDTO createArrayOfDocumentoEmpresaDTO() {
        return new ArrayOfDocumentoEmpresaDTO();
    }

    /**
     * Create an instance of {@link DocumentoDTO }
     * 
     */
    public DocumentoDTO createDocumentoDTO() {
        return new DocumentoDTO();
    }

    /**
     * Create an instance of {@link TipoContatoDTO }
     * 
     */
    public TipoContatoDTO createTipoContatoDTO() {
        return new TipoContatoDTO();
    }

    /**
     * Create an instance of {@link RetornarDocumentoPorFuncionarioResponse }
     * 
     */
    public RetornarDocumentoPorFuncionarioResponse createRetornarDocumentoPorFuncionarioResponse() {
        return new RetornarDocumentoPorFuncionarioResponse();
    }

    /**
     * Create an instance of {@link RetornarDocumentoPorFuncionario }
     * 
     */
    public RetornarDocumentoPorFuncionario createRetornarDocumentoPorFuncionario() {
        return new RetornarDocumentoPorFuncionario();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoDTO }
     * 
     */
    public ArrayOfDocumentoDTO createArrayOfDocumentoDTO() {
        return new ArrayOfDocumentoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfTipoContatoDTO }
     * 
     */
    public ArrayOfTipoContatoDTO createArrayOfTipoContatoDTO() {
        return new ArrayOfTipoContatoDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaContatoDTO }
     * 
     */
    public ArrayOfEmpresaContatoDTO createArrayOfEmpresaContatoDTO() {
        return new ArrayOfEmpresaContatoDTO();
    }

    /**
     * Create an instance of {@link EmpresaContatoDTO }
     * 
     */
    public EmpresaContatoDTO createEmpresaContatoDTO() {
        return new EmpresaContatoDTO();
    }

    /**
     * Create an instance of {@link RetornarDocumentoResponse }
     * 
     */
    public RetornarDocumentoResponse createRetornarDocumentoResponse() {
        return new RetornarDocumentoResponse();
    }

    /**
     * Create an instance of {@link DocumentoEmpresaDTO }
     * 
     */
    public DocumentoEmpresaDTO createDocumentoEmpresaDTO() {
        return new DocumentoEmpresaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdIdentificador", scope = RetornarDocumentoPorFuncionario.class)
    public JAXBElement<String> createRetornarDocumentoPorFuncionarioSCdIdentificador(String value) {
        return new JAXBElement<String>(_RetornarDocumentoPorFuncionarioSCdIdentificador_QNAME, String.class, RetornarDocumentoPorFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDocumentoPorFuncionarioResult", scope = RetornarDocumentoPorFuncionarioResponse.class)
    public JAXBElement<ArrayOfEmpresaContatoDTO> createRetornarDocumentoPorFuncionarioResponseRetornarDocumentoPorFuncionarioResult(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_RetornarDocumentoPorFuncionarioResponseRetornarDocumentoPorFuncionarioResult_QNAME, ArrayOfEmpresaContatoDTO.class, RetornarDocumentoPorFuncionarioResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TipoContatoDTO")
    public JAXBElement<TipoContatoDTO> createTipoContatoDTO(TipoContatoDTO value) {
        return new JAXBElement<TipoContatoDTO>(_TipoContatoDTO_QNAME, TipoContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDocumentoEmpresaDTO")
    public JAXBElement<ArrayOfDocumentoEmpresaDTO> createArrayOfDocumentoEmpresaDTO(ArrayOfDocumentoEmpresaDTO value) {
        return new JAXBElement<ArrayOfDocumentoEmpresaDTO>(_ArrayOfDocumentoEmpresaDTO_QNAME, ArrayOfDocumentoEmpresaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDocumentoDTO")
    public JAXBElement<ArrayOfDocumentoDTO> createArrayOfDocumentoDTO(ArrayOfDocumentoDTO value) {
        return new JAXBElement<ArrayOfDocumentoDTO>(_ArrayOfDocumentoDTO_QNAME, ArrayOfDocumentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DocumentoDTO")
    public JAXBElement<DocumentoDTO> createDocumentoDTO(DocumentoDTO value) {
        return new JAXBElement<DocumentoDTO>(_DocumentoDTO_QNAME, DocumentoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaContatoDTO")
    public JAXBElement<EmpresaContatoDTO> createEmpresaContatoDTO(EmpresaContatoDTO value) {
        return new JAXBElement<EmpresaContatoDTO>(_EmpresaContatoDTO_QNAME, EmpresaContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaContatoDTO")
    public JAXBElement<ArrayOfEmpresaContatoDTO> createArrayOfEmpresaContatoDTO(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_ArrayOfEmpresaContatoDTO_QNAME, ArrayOfEmpresaContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTipoContatoDTO")
    public JAXBElement<ArrayOfTipoContatoDTO> createArrayOfTipoContatoDTO(ArrayOfTipoContatoDTO value) {
        return new JAXBElement<ArrayOfTipoContatoDTO>(_ArrayOfTipoContatoDTO_QNAME, ArrayOfTipoContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DocumentoEmpresaDTO")
    public JAXBElement<DocumentoEmpresaDTO> createDocumentoEmpresaDTO(DocumentoEmpresaDTO value) {
        return new JAXBElement<DocumentoEmpresaDTO>(_DocumentoEmpresaDTO_QNAME, DocumentoEmpresaDTO.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsCargo", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSDsCargo(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSDsCargo_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDocumentoContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<ArrayOfDocumentoDTO> createEmpresaContatoDTOLstDocumentoContato(ArrayOfDocumentoDTO value) {
        return new JAXBElement<ArrayOfDocumentoDTO>(_EmpresaContatoDTOLstDocumentoContato_QNAME, ArrayOfDocumentoDTO.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefone", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrTelefone(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrTelefone_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsEmail", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSDsEmail(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSDsEmail_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCelular", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrCelular(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrCelular_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstTipoContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<ArrayOfTipoContatoDTO> createEmpresaContatoDTOLstTipoContato(ArrayOfTipoContatoDTO value) {
        return new JAXBElement<ArrayOfTipoContatoDTO>(_EmpresaContatoDTOLstTipoContato_QNAME, ArrayOfTipoContatoDTO.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefoneDDD", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrTelefoneDDD(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrTelefoneDDD_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<Long> createEmpresaContatoDTONCdContato(Long value) {
        return new JAXBElement<Long>(_EmpresaContatoDTONCdContato_QNAME, Long.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrRamal", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrRamal(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrRamal_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDocumentoDTO", scope = DocumentoEmpresaDTO.class)
    public JAXBElement<ArrayOfDocumentoDTO> createDocumentoEmpresaDTOLstDocumentoDTO(ArrayOfDocumentoDTO value) {
        return new JAXBElement<ArrayOfDocumentoDTO>(_DocumentoEmpresaDTOLstDocumentoDTO_QNAME, ArrayOfDocumentoDTO.class, DocumentoEmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaContatoDTO", scope = DocumentoEmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaContatoDTO> createDocumentoEmpresaDTOLstEmpresaContatoDTO(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_DocumentoEmpresaDTOLstEmpresaContatoDTO_QNAME, ArrayOfEmpresaContatoDTO.class, DocumentoEmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDocumentoFuncionarioDTO", scope = DocumentoEmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaContatoDTO> createDocumentoEmpresaDTOLstDocumentoFuncionarioDTO(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_DocumentoEmpresaDTOLstDocumentoFuncionarioDTO_QNAME, ArrayOfEmpresaContatoDTO.class, DocumentoEmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDocumentoResult", scope = RetornarDocumentoResponse.class)
    public JAXBElement<ArrayOfDocumentoEmpresaDTO> createRetornarDocumentoResponseRetornarDocumentoResult(ArrayOfDocumentoEmpresaDTO value) {
        return new JAXBElement<ArrayOfDocumentoEmpresaDTO>(_RetornarDocumentoResponseRetornarDocumentoResult_QNAME, ArrayOfDocumentoEmpresaDTO.class, RetornarDocumentoResponse.class, value);
    }

}
