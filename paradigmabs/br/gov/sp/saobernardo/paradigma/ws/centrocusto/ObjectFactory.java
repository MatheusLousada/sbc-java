
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.centrocusto package. 
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
    private final static QName _CentroCustoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CentroCustoDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfCentroCustoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCentroCustoIdiomaDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _RetornoListaX003CCentroCustoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_CentroCustoDTO_x003E_");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _CentroCustoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CentroCustoIdiomaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfCentroCustoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCentroCustoDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfCentroCustoIdiomaDTOljhnh6kL");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ProcessarCentroCustoLstCentroCusto_QNAME = new QName("http://tempuri.org/", "lstCentroCusto");
    private final static QName _ProcessarInativarCentroCustoDeParaResponseProcessarInativarCentroCustoDeParaResult_QNAME = new QName("http://tempuri.org/", "ProcessarInativarCentroCustoDeParaResult");
    private final static QName _CentroCustoDTOBFlAtivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAtivo");
    private final static QName _CentroCustoDTOLstCentroCustoIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCentroCustoIdioma");
    private final static QName _CentroCustoDTOSCdCentroCustoPai_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCentroCustoPai");
    private final static QName _ProcessarCentroCustoResponseProcessarCentroCustoResult_QNAME = new QName("http://tempuri.org/", "ProcessarCentroCustoResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _ProcessarInativarCentroCustoDeParaLstCentroCustoInativarDTO_QNAME = new QName("http://tempuri.org/", "lstCentroCustoInativarDTO");
    private final static QName _RetornarCentroCustoPorDepartamentoSCdDepartamento_QNAME = new QName("http://tempuri.org/", "sCdDepartamento");
    private final static QName _RetornarCentroCustoPorDepartamentoSFlAtivo_QNAME = new QName("http://tempuri.org/", "sFlAtivo");
    private final static QName _RetornarCentroCustoPorDepartamentoResponseRetornarCentroCustoPorDepartamentoResult_QNAME = new QName("http://tempuri.org/", "RetornarCentroCustoPorDepartamentoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.centrocusto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link CentroCustoIdiomaDTO }
     * 
     */
    public CentroCustoIdiomaDTO createCentroCustoIdiomaDTO() {
        return new CentroCustoIdiomaDTO();
    }

    /**
     * Create an instance of {@link ProcessarInativarCentroCustoDeParaResponse }
     * 
     */
    public ProcessarInativarCentroCustoDeParaResponse createProcessarInativarCentroCustoDeParaResponse() {
        return new ProcessarInativarCentroCustoDeParaResponse();
    }

    /**
     * Create an instance of {@link CentroCustoDTO }
     * 
     */
    public CentroCustoDTO createCentroCustoDTO() {
        return new CentroCustoDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CCentroCustoDTOX003E }
     * 
     */
    public RetornoListaX003CCentroCustoDTOX003E createRetornoListaX003CCentroCustoDTOX003E() {
        return new RetornoListaX003CCentroCustoDTOX003E();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link RetornarCentroCustoPorDepartamento }
     * 
     */
    public RetornarCentroCustoPorDepartamento createRetornarCentroCustoPorDepartamento() {
        return new RetornarCentroCustoPorDepartamento();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfCentroCustoIdiomaDTO }
     * 
     */
    public ArrayOfCentroCustoIdiomaDTO createArrayOfCentroCustoIdiomaDTO() {
        return new ArrayOfCentroCustoIdiomaDTO();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL createIdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link ProcessarCentroCusto }
     * 
     */
    public ProcessarCentroCusto createProcessarCentroCusto() {
        return new ProcessarCentroCusto();
    }

    /**
     * Create an instance of {@link ProcessarCentroCustoResponse }
     * 
     */
    public ProcessarCentroCustoResponse createProcessarCentroCustoResponse() {
        return new ProcessarCentroCustoResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarInativarCentroCustoDePara }
     * 
     */
    public ProcessarInativarCentroCustoDePara createProcessarInativarCentroCustoDePara() {
        return new ProcessarInativarCentroCustoDePara();
    }

    /**
     * Create an instance of {@link RetornarCentroCustoPorDepartamentoResponse }
     * 
     */
    public RetornarCentroCustoPorDepartamentoResponse createRetornarCentroCustoPorDepartamentoResponse() {
        return new RetornarCentroCustoPorDepartamentoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCentroCustoDTO }
     * 
     */
    public ArrayOfCentroCustoDTO createArrayOfCentroCustoDTO() {
        return new ArrayOfCentroCustoDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CentroCustoDTO")
    public JAXBElement<CentroCustoDTO> createCentroCustoDTO(CentroCustoDTO value) {
        return new JAXBElement<CentroCustoDTO>(_CentroCustoDTO_QNAME, CentroCustoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCentroCustoIdiomaDTO")
    public JAXBElement<ArrayOfCentroCustoIdiomaDTO> createArrayOfCentroCustoIdiomaDTO(ArrayOfCentroCustoIdiomaDTO value) {
        return new JAXBElement<ArrayOfCentroCustoIdiomaDTO>(_ArrayOfCentroCustoIdiomaDTO_QNAME, ArrayOfCentroCustoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CCentroCustoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_CentroCustoDTO_x003E_")
    public JAXBElement<RetornoListaX003CCentroCustoDTOX003E> createRetornoListaX003CCentroCustoDTOX003E(RetornoListaX003CCentroCustoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CCentroCustoDTOX003E>(_RetornoListaX003CCentroCustoDTOX003E_QNAME, RetornoListaX003CCentroCustoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CentroCustoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CentroCustoIdiomaDTO")
    public JAXBElement<CentroCustoIdiomaDTO> createCentroCustoIdiomaDTO(CentroCustoIdiomaDTO value) {
        return new JAXBElement<CentroCustoIdiomaDTO>(_CentroCustoIdiomaDTO_QNAME, CentroCustoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCentroCustoDTO")
    public JAXBElement<ArrayOfCentroCustoDTO> createArrayOfCentroCustoDTO(ArrayOfCentroCustoDTO value) {
        return new JAXBElement<ArrayOfCentroCustoDTO>(_ArrayOfCentroCustoDTO_QNAME, ArrayOfCentroCustoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfCentroCustoIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL> createIdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL(IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL>(_IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCentroCusto", scope = ProcessarCentroCusto.class)
    public JAXBElement<ArrayOfCentroCustoDTO> createProcessarCentroCustoLstCentroCusto(ArrayOfCentroCustoDTO value) {
        return new JAXBElement<ArrayOfCentroCustoDTO>(_ProcessarCentroCustoLstCentroCusto_QNAME, ArrayOfCentroCustoDTO.class, ProcessarCentroCusto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarInativarCentroCustoDeParaResult", scope = ProcessarInativarCentroCustoDeParaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarInativarCentroCustoDeParaResponseProcessarInativarCentroCustoDeParaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarInativarCentroCustoDeParaResponseProcessarInativarCentroCustoDeParaResult_QNAME, RetornoDTO.class, ProcessarInativarCentroCustoDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAtivo", scope = CentroCustoDTO.class)
    public JAXBElement<Integer> createCentroCustoDTOBFlAtivo(Integer value) {
        return new JAXBElement<Integer>(_CentroCustoDTOBFlAtivo_QNAME, Integer.class, CentroCustoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCentroCustoIdioma", scope = CentroCustoDTO.class)
    public JAXBElement<ArrayOfCentroCustoIdiomaDTO> createCentroCustoDTOLstCentroCustoIdioma(ArrayOfCentroCustoIdiomaDTO value) {
        return new JAXBElement<ArrayOfCentroCustoIdiomaDTO>(_CentroCustoDTOLstCentroCustoIdioma_QNAME, ArrayOfCentroCustoIdiomaDTO.class, CentroCustoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCustoPai", scope = CentroCustoDTO.class)
    public JAXBElement<String> createCentroCustoDTOSCdCentroCustoPai(String value) {
        return new JAXBElement<String>(_CentroCustoDTOSCdCentroCustoPai_QNAME, String.class, CentroCustoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarCentroCustoResult", scope = ProcessarCentroCustoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarCentroCustoResponseProcessarCentroCustoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarCentroCustoResponseProcessarCentroCustoResult_QNAME, RetornoDTO.class, ProcessarCentroCustoResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrToken", scope = RetornoDTO.class)
    public JAXBElement<String> createRetornoDTOSNrToken(String value) {
        return new JAXBElement<String>(_WbtLogDTOSNrToken_QNAME, String.class, RetornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCentroCustoInativarDTO", scope = ProcessarInativarCentroCustoDePara.class)
    public JAXBElement<ArrayOfCentroCustoDTO> createProcessarInativarCentroCustoDeParaLstCentroCustoInativarDTO(ArrayOfCentroCustoDTO value) {
        return new JAXBElement<ArrayOfCentroCustoDTO>(_ProcessarInativarCentroCustoDeParaLstCentroCustoInativarDTO_QNAME, ArrayOfCentroCustoDTO.class, ProcessarInativarCentroCustoDePara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdDepartamento", scope = RetornarCentroCustoPorDepartamento.class)
    public JAXBElement<String> createRetornarCentroCustoPorDepartamentoSCdDepartamento(String value) {
        return new JAXBElement<String>(_RetornarCentroCustoPorDepartamentoSCdDepartamento_QNAME, String.class, RetornarCentroCustoPorDepartamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sFlAtivo", scope = RetornarCentroCustoPorDepartamento.class)
    public JAXBElement<String> createRetornarCentroCustoPorDepartamentoSFlAtivo(String value) {
        return new JAXBElement<String>(_RetornarCentroCustoPorDepartamentoSFlAtivo_QNAME, String.class, RetornarCentroCustoPorDepartamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CCentroCustoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCentroCustoPorDepartamentoResult", scope = RetornarCentroCustoPorDepartamentoResponse.class)
    public JAXBElement<RetornoListaX003CCentroCustoDTOX003E> createRetornarCentroCustoPorDepartamentoResponseRetornarCentroCustoPorDepartamentoResult(RetornoListaX003CCentroCustoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CCentroCustoDTOX003E>(_RetornarCentroCustoPorDepartamentoResponseRetornarCentroCustoPorDepartamentoResult_QNAME, RetornoListaX003CCentroCustoDTOX003E.class, RetornarCentroCustoPorDepartamentoResponse.class, value);
    }

}
