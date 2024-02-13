
package br.gov.sp.saobernardo.paradigma.ws.departamento;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.departamento package. 
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
    private final static QName _RetornarDepartamentoPorDescricaoResponseRetornarDepartamentoPorDescricaoResult_QNAME = new QName("http://tempuri.org/", "RetornarDepartamentoPorDescricaoResult");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _RetornoListaX003CDepartamentoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_DepartamentoDTO_x003E_");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfDepartamentoIdiomaDTOljhnh6kL");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfDepartamentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDepartamentoDTO");
    private final static QName _DepartamentoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DepartamentoEmpresaDTO");
    private final static QName _ArrayOfDepartamentoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDepartamentoIdiomaDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _DepartamentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DepartamentoDTO");
    private final static QName _DepartamentoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DepartamentoIdiomaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfDepartamentoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDepartamentoEmpresaDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _DepartamentoDTOSCdDepartamentoPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDepartamentoPai");
    private final static QName _DepartamentoDTOSCdDeptoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDeptoEmpresa");
    private final static QName _DepartamentoDTOLstDepartamentoIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDepartamentoIdioma");
    private final static QName _ProcessarDepartamentoResponseProcessarDepartamentoResult_QNAME = new QName("http://tempuri.org/", "ProcessarDepartamentoResult");
    private final static QName _ProcessarInativarDepartamentoDeParaLstDepartamentoInativarDTO_QNAME = new QName("http://tempuri.org/", "lstDepartamentoInativarDTO");
    private final static QName _DepartamentoEmpresaDTOBFlStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlStatus");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarDepartamentoResponseRetornarDepartamentoResult_QNAME = new QName("http://tempuri.org/", "RetornarDepartamentoResult");
    private final static QName _RetornarDepartamentoPorDescricaoNCdSituacao_QNAME = new QName("http://tempuri.org/", "nCdSituacao");
    private final static QName _RetornarDepartamentoPorDescricaoSDsDepartamento_QNAME = new QName("http://tempuri.org/", "sDsDepartamento");
    private final static QName _ProcessarInativarDepartamentoDeParaResponseProcessarInativarDepartamentoDeParaResult_QNAME = new QName("http://tempuri.org/", "ProcessarInativarDepartamentoDeParaResult");
    private final static QName _ProcessarDepartamentoLstDepartamento_QNAME = new QName("http://tempuri.org/", "lstDepartamento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.departamento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link RetornarDepartamentoPorDescricaoResponse }
     * 
     */
    public RetornarDepartamentoPorDescricaoResponse createRetornarDepartamentoPorDescricaoResponse() {
        return new RetornarDepartamentoPorDescricaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDepartamentoEmpresaDTO }
     * 
     */
    public ArrayOfDepartamentoEmpresaDTO createArrayOfDepartamentoEmpresaDTO() {
        return new ArrayOfDepartamentoEmpresaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDepartamentoIdiomaDTO }
     * 
     */
    public ArrayOfDepartamentoIdiomaDTO createArrayOfDepartamentoIdiomaDTO() {
        return new ArrayOfDepartamentoIdiomaDTO();
    }

    /**
     * Create an instance of {@link ProcessarDepartamentoResponse }
     * 
     */
    public ProcessarDepartamentoResponse createProcessarDepartamentoResponse() {
        return new ProcessarDepartamentoResponse();
    }

    /**
     * Create an instance of {@link RetornoListaX003CDepartamentoDTOX003E }
     * 
     */
    public RetornoListaX003CDepartamentoDTOX003E createRetornoListaX003CDepartamentoDTOX003E() {
        return new RetornoListaX003CDepartamentoDTOX003E();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ProcessarInativarDepartamentoDePara }
     * 
     */
    public ProcessarInativarDepartamentoDePara createProcessarInativarDepartamentoDePara() {
        return new ProcessarInativarDepartamentoDePara();
    }

    /**
     * Create an instance of {@link RetornarDepartamentoPorDescricao }
     * 
     */
    public RetornarDepartamentoPorDescricao createRetornarDepartamentoPorDescricao() {
        return new RetornarDepartamentoPorDescricao();
    }

    /**
     * Create an instance of {@link RetornarDepartamentoResponse }
     * 
     */
    public RetornarDepartamentoResponse createRetornarDepartamentoResponse() {
        return new RetornarDepartamentoResponse();
    }

    /**
     * Create an instance of {@link ProcessarInativarDepartamentoDeParaResponse }
     * 
     */
    public ProcessarInativarDepartamentoDeParaResponse createProcessarInativarDepartamentoDeParaResponse() {
        return new ProcessarInativarDepartamentoDeParaResponse();
    }

    /**
     * Create an instance of {@link DepartamentoIdiomaDTO }
     * 
     */
    public DepartamentoIdiomaDTO createDepartamentoIdiomaDTO() {
        return new DepartamentoIdiomaDTO();
    }

    /**
     * Create an instance of {@link RetornarDepartamento }
     * 
     */
    public RetornarDepartamento createRetornarDepartamento() {
        return new RetornarDepartamento();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL createIdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link DepartamentoDTO }
     * 
     */
    public DepartamentoDTO createDepartamentoDTO() {
        return new DepartamentoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link DepartamentoEmpresaDTO }
     * 
     */
    public DepartamentoEmpresaDTO createDepartamentoEmpresaDTO() {
        return new DepartamentoEmpresaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDepartamentoDTO }
     * 
     */
    public ArrayOfDepartamentoDTO createArrayOfDepartamentoDTO() {
        return new ArrayOfDepartamentoDTO();
    }

    /**
     * Create an instance of {@link ProcessarDepartamento }
     * 
     */
    public ProcessarDepartamento createProcessarDepartamento() {
        return new ProcessarDepartamento();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDepartamentoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDepartamentoPorDescricaoResult", scope = RetornarDepartamentoPorDescricaoResponse.class)
    public JAXBElement<RetornoListaX003CDepartamentoDTOX003E> createRetornarDepartamentoPorDescricaoResponseRetornarDepartamentoPorDescricaoResult(RetornoListaX003CDepartamentoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDepartamentoDTOX003E>(_RetornarDepartamentoPorDescricaoResponseRetornarDepartamentoPorDescricaoResult_QNAME, RetornoListaX003CDepartamentoDTOX003E.class, RetornarDepartamentoPorDescricaoResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDepartamentoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_DepartamentoDTO_x003E_")
    public JAXBElement<RetornoListaX003CDepartamentoDTOX003E> createRetornoListaX003CDepartamentoDTOX003E(RetornoListaX003CDepartamentoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDepartamentoDTOX003E>(_RetornoListaX003CDepartamentoDTOX003E_QNAME, RetornoListaX003CDepartamentoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfDepartamentoIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL> createIdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL(IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL>(_IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDepartamentoDTO")
    public JAXBElement<ArrayOfDepartamentoDTO> createArrayOfDepartamentoDTO(ArrayOfDepartamentoDTO value) {
        return new JAXBElement<ArrayOfDepartamentoDTO>(_ArrayOfDepartamentoDTO_QNAME, ArrayOfDepartamentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartamentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DepartamentoEmpresaDTO")
    public JAXBElement<DepartamentoEmpresaDTO> createDepartamentoEmpresaDTO(DepartamentoEmpresaDTO value) {
        return new JAXBElement<DepartamentoEmpresaDTO>(_DepartamentoEmpresaDTO_QNAME, DepartamentoEmpresaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDepartamentoIdiomaDTO")
    public JAXBElement<ArrayOfDepartamentoIdiomaDTO> createArrayOfDepartamentoIdiomaDTO(ArrayOfDepartamentoIdiomaDTO value) {
        return new JAXBElement<ArrayOfDepartamentoIdiomaDTO>(_ArrayOfDepartamentoIdiomaDTO_QNAME, ArrayOfDepartamentoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DepartamentoDTO")
    public JAXBElement<DepartamentoDTO> createDepartamentoDTO(DepartamentoDTO value) {
        return new JAXBElement<DepartamentoDTO>(_DepartamentoDTO_QNAME, DepartamentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartamentoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DepartamentoIdiomaDTO")
    public JAXBElement<DepartamentoIdiomaDTO> createDepartamentoIdiomaDTO(DepartamentoIdiomaDTO value) {
        return new JAXBElement<DepartamentoIdiomaDTO>(_DepartamentoIdiomaDTO_QNAME, DepartamentoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDepartamentoEmpresaDTO")
    public JAXBElement<ArrayOfDepartamentoEmpresaDTO> createArrayOfDepartamentoEmpresaDTO(ArrayOfDepartamentoEmpresaDTO value) {
        return new JAXBElement<ArrayOfDepartamentoEmpresaDTO>(_ArrayOfDepartamentoEmpresaDTO_QNAME, ArrayOfDepartamentoEmpresaDTO.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDepartamentoPai", scope = DepartamentoDTO.class)
    public JAXBElement<String> createDepartamentoDTOSCdDepartamentoPai(String value) {
        return new JAXBElement<String>(_DepartamentoDTOSCdDepartamentoPai_QNAME, String.class, DepartamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDeptoEmpresa", scope = DepartamentoDTO.class)
    public JAXBElement<String> createDepartamentoDTOSCdDeptoEmpresa(String value) {
        return new JAXBElement<String>(_DepartamentoDTOSCdDeptoEmpresa_QNAME, String.class, DepartamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDepartamentoIdioma", scope = DepartamentoDTO.class)
    public JAXBElement<ArrayOfDepartamentoIdiomaDTO> createDepartamentoDTOLstDepartamentoIdioma(ArrayOfDepartamentoIdiomaDTO value) {
        return new JAXBElement<ArrayOfDepartamentoIdiomaDTO>(_DepartamentoDTOLstDepartamentoIdioma_QNAME, ArrayOfDepartamentoIdiomaDTO.class, DepartamentoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarDepartamentoResult", scope = ProcessarDepartamentoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarDepartamentoResponseProcessarDepartamentoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarDepartamentoResponseProcessarDepartamentoResult_QNAME, RetornoDTO.class, ProcessarDepartamentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstDepartamentoInativarDTO", scope = ProcessarInativarDepartamentoDePara.class)
    public JAXBElement<ArrayOfDepartamentoEmpresaDTO> createProcessarInativarDepartamentoDeParaLstDepartamentoInativarDTO(ArrayOfDepartamentoEmpresaDTO value) {
        return new JAXBElement<ArrayOfDepartamentoEmpresaDTO>(_ProcessarInativarDepartamentoDeParaLstDepartamentoInativarDTO_QNAME, ArrayOfDepartamentoEmpresaDTO.class, ProcessarInativarDepartamentoDePara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlStatus", scope = DepartamentoEmpresaDTO.class)
    public JAXBElement<Integer> createDepartamentoEmpresaDTOBFlStatus(Integer value) {
        return new JAXBElement<Integer>(_DepartamentoEmpresaDTOBFlStatus_QNAME, Integer.class, DepartamentoEmpresaDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDepartamentoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDepartamentoResult", scope = RetornarDepartamentoResponse.class)
    public JAXBElement<RetornoListaX003CDepartamentoDTOX003E> createRetornarDepartamentoResponseRetornarDepartamentoResult(RetornoListaX003CDepartamentoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDepartamentoDTOX003E>(_RetornarDepartamentoResponseRetornarDepartamentoResult_QNAME, RetornoListaX003CDepartamentoDTOX003E.class, RetornarDepartamentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nCdSituacao", scope = RetornarDepartamentoPorDescricao.class)
    public JAXBElement<Integer> createRetornarDepartamentoPorDescricaoNCdSituacao(Integer value) {
        return new JAXBElement<Integer>(_RetornarDepartamentoPorDescricaoNCdSituacao_QNAME, Integer.class, RetornarDepartamentoPorDescricao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sDsDepartamento", scope = RetornarDepartamentoPorDescricao.class)
    public JAXBElement<String> createRetornarDepartamentoPorDescricaoSDsDepartamento(String value) {
        return new JAXBElement<String>(_RetornarDepartamentoPorDescricaoSDsDepartamento_QNAME, String.class, RetornarDepartamentoPorDescricao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarInativarDepartamentoDeParaResult", scope = ProcessarInativarDepartamentoDeParaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarInativarDepartamentoDeParaResponseProcessarInativarDepartamentoDeParaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarInativarDepartamentoDeParaResponseProcessarInativarDepartamentoDeParaResult_QNAME, RetornoDTO.class, ProcessarInativarDepartamentoDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstDepartamento", scope = ProcessarDepartamento.class)
    public JAXBElement<ArrayOfDepartamentoDTO> createProcessarDepartamentoLstDepartamento(ArrayOfDepartamentoDTO value) {
        return new JAXBElement<ArrayOfDepartamentoDTO>(_ProcessarDepartamentoLstDepartamento_QNAME, ArrayOfDepartamentoDTO.class, ProcessarDepartamento.class, value);
    }

}
