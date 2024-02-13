
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.grupoconta package. 
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
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _GrupoContaIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoContaIdiomaDTO");
    private final static QName _ArrayOfGrupoContaIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfGrupoContaIdiomaDTO");
    private final static QName _GrupoContaEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoContaEmpresaDTO");
    private final static QName _IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfGrupoContaIdiomaDTOljhnh6kL");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfGrupoContaEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfGrupoContaEmpresaDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfGrupoContaFornecedorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfGrupoContaFornecedorDTO");
    private final static QName _GrupoContaFornecedorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoContaFornecedorDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfGrupoContaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfGrupoContaDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _GrupoContaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoContaDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ProcessarGrupoContaEmpresaLstGrupoContaEmpresa_QNAME = new QName("http://tempuri.org/", "lstGrupoContaEmpresa");
    private final static QName _GrupoContaIdiomaDTOSSgGrupoConta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgGrupoConta");
    private final static QName _GrupoContaIdiomaDTOSDsGrupoConta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsGrupoConta");
    private final static QName _ProcessarGrupoContaResponseProcessarGrupoContaResult_QNAME = new QName("http://tempuri.org/", "ProcessarGrupoContaResult");
    private final static QName _GrupoContaDTOLstGrupoContaIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstGrupoContaIdioma");
    private final static QName _GrupoContaFornecedorDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _ProcessarGrupoContaEmpresaResponseProcessarGrupoContaEmpresaResult_QNAME = new QName("http://tempuri.org/", "ProcessarGrupoContaEmpresaResult");
    private final static QName _ProcessarGrupoContaLstGrupoConta_QNAME = new QName("http://tempuri.org/", "lstGrupoConta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.grupoconta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfGrupoContaIdiomaDTO }
     * 
     */
    public ArrayOfGrupoContaIdiomaDTO createArrayOfGrupoContaIdiomaDTO() {
        return new ArrayOfGrupoContaIdiomaDTO();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL createIdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfGrupoContaEmpresaDTO }
     * 
     */
    public ArrayOfGrupoContaEmpresaDTO createArrayOfGrupoContaEmpresaDTO() {
        return new ArrayOfGrupoContaEmpresaDTO();
    }

    /**
     * Create an instance of {@link GrupoContaEmpresaDTO }
     * 
     */
    public GrupoContaEmpresaDTO createGrupoContaEmpresaDTO() {
        return new GrupoContaEmpresaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfGrupoContaFornecedorDTO }
     * 
     */
    public ArrayOfGrupoContaFornecedorDTO createArrayOfGrupoContaFornecedorDTO() {
        return new ArrayOfGrupoContaFornecedorDTO();
    }

    /**
     * Create an instance of {@link ProcessarGrupoContaEmpresaResponse }
     * 
     */
    public ProcessarGrupoContaEmpresaResponse createProcessarGrupoContaEmpresaResponse() {
        return new ProcessarGrupoContaEmpresaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarGrupoContaEmpresa }
     * 
     */
    public ProcessarGrupoContaEmpresa createProcessarGrupoContaEmpresa() {
        return new ProcessarGrupoContaEmpresa();
    }

    /**
     * Create an instance of {@link GrupoContaIdiomaDTO }
     * 
     */
    public GrupoContaIdiomaDTO createGrupoContaIdiomaDTO() {
        return new GrupoContaIdiomaDTO();
    }

    /**
     * Create an instance of {@link ProcessarGrupoContaResponse }
     * 
     */
    public ProcessarGrupoContaResponse createProcessarGrupoContaResponse() {
        return new ProcessarGrupoContaResponse();
    }

    /**
     * Create an instance of {@link GrupoContaDTO }
     * 
     */
    public GrupoContaDTO createGrupoContaDTO() {
        return new GrupoContaDTO();
    }

    /**
     * Create an instance of {@link GrupoContaFornecedorDTO }
     * 
     */
    public GrupoContaFornecedorDTO createGrupoContaFornecedorDTO() {
        return new GrupoContaFornecedorDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarGrupoConta }
     * 
     */
    public ProcessarGrupoConta createProcessarGrupoConta() {
        return new ProcessarGrupoConta();
    }

    /**
     * Create an instance of {@link ArrayOfGrupoContaDTO }
     * 
     */
    public ArrayOfGrupoContaDTO createArrayOfGrupoContaDTO() {
        return new ArrayOfGrupoContaDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoContaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoContaIdiomaDTO")
    public JAXBElement<GrupoContaIdiomaDTO> createGrupoContaIdiomaDTO(GrupoContaIdiomaDTO value) {
        return new JAXBElement<GrupoContaIdiomaDTO>(_GrupoContaIdiomaDTO_QNAME, GrupoContaIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfGrupoContaIdiomaDTO")
    public JAXBElement<ArrayOfGrupoContaIdiomaDTO> createArrayOfGrupoContaIdiomaDTO(ArrayOfGrupoContaIdiomaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaIdiomaDTO>(_ArrayOfGrupoContaIdiomaDTO_QNAME, ArrayOfGrupoContaIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoContaEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoContaEmpresaDTO")
    public JAXBElement<GrupoContaEmpresaDTO> createGrupoContaEmpresaDTO(GrupoContaEmpresaDTO value) {
        return new JAXBElement<GrupoContaEmpresaDTO>(_GrupoContaEmpresaDTO_QNAME, GrupoContaEmpresaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfGrupoContaIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL> createIdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL(IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL>(_IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfGrupoContaEmpresaDTO")
    public JAXBElement<ArrayOfGrupoContaEmpresaDTO> createArrayOfGrupoContaEmpresaDTO(ArrayOfGrupoContaEmpresaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaEmpresaDTO>(_ArrayOfGrupoContaEmpresaDTO_QNAME, ArrayOfGrupoContaEmpresaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaFornecedorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfGrupoContaFornecedorDTO")
    public JAXBElement<ArrayOfGrupoContaFornecedorDTO> createArrayOfGrupoContaFornecedorDTO(ArrayOfGrupoContaFornecedorDTO value) {
        return new JAXBElement<ArrayOfGrupoContaFornecedorDTO>(_ArrayOfGrupoContaFornecedorDTO_QNAME, ArrayOfGrupoContaFornecedorDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoContaFornecedorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoContaFornecedorDTO")
    public JAXBElement<GrupoContaFornecedorDTO> createGrupoContaFornecedorDTO(GrupoContaFornecedorDTO value) {
        return new JAXBElement<GrupoContaFornecedorDTO>(_GrupoContaFornecedorDTO_QNAME, GrupoContaFornecedorDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfGrupoContaDTO")
    public JAXBElement<ArrayOfGrupoContaDTO> createArrayOfGrupoContaDTO(ArrayOfGrupoContaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaDTO>(_ArrayOfGrupoContaDTO_QNAME, ArrayOfGrupoContaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoContaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoContaDTO")
    public JAXBElement<GrupoContaDTO> createGrupoContaDTO(GrupoContaDTO value) {
        return new JAXBElement<GrupoContaDTO>(_GrupoContaDTO_QNAME, GrupoContaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstGrupoContaEmpresa", scope = ProcessarGrupoContaEmpresa.class)
    public JAXBElement<ArrayOfGrupoContaEmpresaDTO> createProcessarGrupoContaEmpresaLstGrupoContaEmpresa(ArrayOfGrupoContaEmpresaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaEmpresaDTO>(_ProcessarGrupoContaEmpresaLstGrupoContaEmpresa_QNAME, ArrayOfGrupoContaEmpresaDTO.class, ProcessarGrupoContaEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgGrupoConta", scope = GrupoContaIdiomaDTO.class)
    public JAXBElement<String> createGrupoContaIdiomaDTOSSgGrupoConta(String value) {
        return new JAXBElement<String>(_GrupoContaIdiomaDTOSSgGrupoConta_QNAME, String.class, GrupoContaIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGrupoConta", scope = GrupoContaIdiomaDTO.class)
    public JAXBElement<String> createGrupoContaIdiomaDTOSDsGrupoConta(String value) {
        return new JAXBElement<String>(_GrupoContaIdiomaDTOSDsGrupoConta_QNAME, String.class, GrupoContaIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarGrupoContaResult", scope = ProcessarGrupoContaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarGrupoContaResponseProcessarGrupoContaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarGrupoContaResponseProcessarGrupoContaResult_QNAME, RetornoDTO.class, ProcessarGrupoContaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgGrupoConta", scope = GrupoContaDTO.class)
    public JAXBElement<String> createGrupoContaDTOSSgGrupoConta(String value) {
        return new JAXBElement<String>(_GrupoContaIdiomaDTOSSgGrupoConta_QNAME, String.class, GrupoContaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstGrupoContaIdioma", scope = GrupoContaDTO.class)
    public JAXBElement<ArrayOfGrupoContaIdiomaDTO> createGrupoContaDTOLstGrupoContaIdioma(ArrayOfGrupoContaIdiomaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaIdiomaDTO>(_GrupoContaDTOLstGrupoContaIdioma_QNAME, ArrayOfGrupoContaIdiomaDTO.class, GrupoContaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = GrupoContaFornecedorDTO.class)
    public JAXBElement<String> createGrupoContaFornecedorDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_GrupoContaFornecedorDTOSCdEmpresa_QNAME, String.class, GrupoContaFornecedorDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarGrupoContaEmpresaResult", scope = ProcessarGrupoContaEmpresaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarGrupoContaEmpresaResponseProcessarGrupoContaEmpresaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarGrupoContaEmpresaResponseProcessarGrupoContaEmpresaResult_QNAME, RetornoDTO.class, ProcessarGrupoContaEmpresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstGrupoConta", scope = ProcessarGrupoConta.class)
    public JAXBElement<ArrayOfGrupoContaDTO> createProcessarGrupoContaLstGrupoConta(ArrayOfGrupoContaDTO value) {
        return new JAXBElement<ArrayOfGrupoContaDTO>(_ProcessarGrupoContaLstGrupoConta_QNAME, ArrayOfGrupoContaDTO.class, ProcessarGrupoConta.class, value);
    }

}
