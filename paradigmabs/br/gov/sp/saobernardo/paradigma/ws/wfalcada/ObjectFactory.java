
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.wfalcada package. 
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
    private final static QName _RetornarAlcadaUsuarioResponseRetornarAlcadaUsuarioResult_QNAME = new QName("http://tempuri.org/", "RetornarAlcadaUsuarioResult");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _UsuarioDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioDetalheDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _WfAlcadaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WfAlcadaDTO");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfNullableOflong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    private final static QName _WfAlcadaUsuarioPesquisaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WfAlcadaUsuarioPesquisaDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _RetornoListaX003CWfAlcadaUsuarioDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_WfAlcadaUsuarioDTO_x003E_");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _RetornoListaX003CWfAlcadaDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_WfAlcadaDTO_x003E_");
    private final static QName _ArrayOfWfAlcadaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWfAlcadaDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WfAlcadaUsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WfAlcadaUsuarioDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfWfAlcadaUsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWfAlcadaUsuarioDTO");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarAlcadaLstCdObjeto_QNAME = new QName("http://tempuri.org/", "lstCdObjeto");
    private final static QName _RetornarAlcadaResponseRetornarAlcadaResult_QNAME = new QName("http://tempuri.org/", "RetornarAlcadaResult");
    private final static QName _UsuarioDetalheDTOSNrCnpjEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpjEmpresa");
    private final static QName _UsuarioDetalheDTOSNmUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmUsuario");
    private final static QName _WfAlcadaUsuarioDTOOUsuarioDetalheSubstituto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUsuarioDetalheSubstituto");
    private final static QName _WfAlcadaUsuarioDTOOUsuarioDetalheAprovador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUsuarioDetalheAprovador");
    private final static QName _RetornarAlcadaUsuarioWfAlcadaUsuarioPesquisaDTO_QNAME = new QName("http://tempuri.org/", "wfAlcadaUsuarioPesquisaDTO");
    private final static QName _WfAlcadaUsuarioPesquisaDTODVlAlcadaFinal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlAlcadaFinal");
    private final static QName _WfAlcadaUsuarioPesquisaDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _WfAlcadaUsuarioPesquisaDTOLstVlAtributo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstVlAtributo");
    private final static QName _WfAlcadaUsuarioPesquisaDTOLstCdUsuarioAprovador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCdUsuarioAprovador");
    private final static QName _WfAlcadaUsuarioPesquisaDTONCdObjeto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdObjeto");
    private final static QName _WfAlcadaUsuarioPesquisaDTOLstCdAlcada_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCdAlcada");
    private final static QName _WfAlcadaUsuarioPesquisaDTODVlAlcadaInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlAlcadaInicial");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.wfalcada
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
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWfAlcadaDTO }
     * 
     */
    public ArrayOfWfAlcadaDTO createArrayOfWfAlcadaDTO() {
        return new ArrayOfWfAlcadaDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfNullableOflong }
     * 
     */
    public ArrayOfNullableOflong createArrayOfNullableOflong() {
        return new ArrayOfNullableOflong();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CWfAlcadaUsuarioDTOX003E }
     * 
     */
    public RetornoListaX003CWfAlcadaUsuarioDTOX003E createRetornoListaX003CWfAlcadaUsuarioDTOX003E() {
        return new RetornoListaX003CWfAlcadaUsuarioDTOX003E();
    }

    /**
     * Create an instance of {@link WfAlcadaUsuarioDTO }
     * 
     */
    public WfAlcadaUsuarioDTO createWfAlcadaUsuarioDTO() {
        return new WfAlcadaUsuarioDTO();
    }

    /**
     * Create an instance of {@link WfAlcadaUsuarioPesquisaDTO }
     * 
     */
    public WfAlcadaUsuarioPesquisaDTO createWfAlcadaUsuarioPesquisaDTO() {
        return new WfAlcadaUsuarioPesquisaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link RetornarAlcadaUsuarioResponse }
     * 
     */
    public RetornarAlcadaUsuarioResponse createRetornarAlcadaUsuarioResponse() {
        return new RetornarAlcadaUsuarioResponse();
    }

    /**
     * Create an instance of {@link RetornoListaX003CWfAlcadaDTOX003E }
     * 
     */
    public RetornoListaX003CWfAlcadaDTOX003E createRetornoListaX003CWfAlcadaDTOX003E() {
        return new RetornoListaX003CWfAlcadaDTOX003E();
    }

    /**
     * Create an instance of {@link RetornarAlcada }
     * 
     */
    public RetornarAlcada createRetornarAlcada() {
        return new RetornarAlcada();
    }

    /**
     * Create an instance of {@link WfAlcadaDTO }
     * 
     */
    public WfAlcadaDTO createWfAlcadaDTO() {
        return new WfAlcadaDTO();
    }

    /**
     * Create an instance of {@link RetornarAlcadaResponse }
     * 
     */
    public RetornarAlcadaResponse createRetornarAlcadaResponse() {
        return new RetornarAlcadaResponse();
    }

    /**
     * Create an instance of {@link UsuarioDetalheDTO }
     * 
     */
    public UsuarioDetalheDTO createUsuarioDetalheDTO() {
        return new UsuarioDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornarAlcadaUsuario }
     * 
     */
    public RetornarAlcadaUsuario createRetornarAlcadaUsuario() {
        return new RetornarAlcadaUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfWfAlcadaUsuarioDTO }
     * 
     */
    public ArrayOfWfAlcadaUsuarioDTO createArrayOfWfAlcadaUsuarioDTO() {
        return new ArrayOfWfAlcadaUsuarioDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaUsuarioDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarAlcadaUsuarioResult", scope = RetornarAlcadaUsuarioResponse.class)
    public JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> createRetornarAlcadaUsuarioResponseRetornarAlcadaUsuarioResult(RetornoListaX003CWfAlcadaUsuarioDTOX003E value) {
        return new JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E>(_RetornarAlcadaUsuarioResponseRetornarAlcadaUsuarioResult_QNAME, RetornoListaX003CWfAlcadaUsuarioDTOX003E.class, RetornarAlcadaUsuarioResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UsuarioDetalheDTO")
    public JAXBElement<UsuarioDetalheDTO> createUsuarioDetalheDTO(UsuarioDetalheDTO value) {
        return new JAXBElement<UsuarioDetalheDTO>(_UsuarioDetalheDTO_QNAME, UsuarioDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WfAlcadaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WfAlcadaDTO")
    public JAXBElement<WfAlcadaDTO> createWfAlcadaDTO(WfAlcadaDTO value) {
        return new JAXBElement<WfAlcadaDTO>(_WfAlcadaDTO_QNAME, WfAlcadaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ArrayOfNullableOflong")
    public JAXBElement<ArrayOfNullableOflong> createArrayOfNullableOflong(ArrayOfNullableOflong value) {
        return new JAXBElement<ArrayOfNullableOflong>(_ArrayOfNullableOflong_QNAME, ArrayOfNullableOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfAlcadaUsuarioPesquisaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WfAlcadaUsuarioPesquisaDTO")
    public JAXBElement<WfAlcadaUsuarioPesquisaDTO> createWfAlcadaUsuarioPesquisaDTO(WfAlcadaUsuarioPesquisaDTO value) {
        return new JAXBElement<WfAlcadaUsuarioPesquisaDTO>(_WfAlcadaUsuarioPesquisaDTO_QNAME, WfAlcadaUsuarioPesquisaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaUsuarioDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_WfAlcadaUsuarioDTO_x003E_")
    public JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> createRetornoListaX003CWfAlcadaUsuarioDTOX003E(RetornoListaX003CWfAlcadaUsuarioDTOX003E value) {
        return new JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E>(_RetornoListaX003CWfAlcadaUsuarioDTOX003E_QNAME, RetornoListaX003CWfAlcadaUsuarioDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_WfAlcadaDTO_x003E_")
    public JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> createRetornoListaX003CWfAlcadaDTOX003E(RetornoListaX003CWfAlcadaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CWfAlcadaDTOX003E>(_RetornoListaX003CWfAlcadaDTOX003E_QNAME, RetornoListaX003CWfAlcadaDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWfAlcadaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWfAlcadaDTO")
    public JAXBElement<ArrayOfWfAlcadaDTO> createArrayOfWfAlcadaDTO(ArrayOfWfAlcadaDTO value) {
        return new JAXBElement<ArrayOfWfAlcadaDTO>(_ArrayOfWfAlcadaDTO_QNAME, ArrayOfWfAlcadaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WfAlcadaUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WfAlcadaUsuarioDTO")
    public JAXBElement<WfAlcadaUsuarioDTO> createWfAlcadaUsuarioDTO(WfAlcadaUsuarioDTO value) {
        return new JAXBElement<WfAlcadaUsuarioDTO>(_WfAlcadaUsuarioDTO_QNAME, WfAlcadaUsuarioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWfAlcadaUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWfAlcadaUsuarioDTO")
    public JAXBElement<ArrayOfWfAlcadaUsuarioDTO> createArrayOfWfAlcadaUsuarioDTO(ArrayOfWfAlcadaUsuarioDTO value) {
        return new JAXBElement<ArrayOfWfAlcadaUsuarioDTO>(_ArrayOfWfAlcadaUsuarioDTO_QNAME, ArrayOfWfAlcadaUsuarioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCdObjeto", scope = RetornarAlcada.class)
    public JAXBElement<ArrayOflong> createRetornarAlcadaLstCdObjeto(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetornarAlcadaLstCdObjeto_QNAME, ArrayOflong.class, RetornarAlcada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarAlcadaResult", scope = RetornarAlcadaResponse.class)
    public JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> createRetornarAlcadaResponseRetornarAlcadaResult(RetornoListaX003CWfAlcadaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CWfAlcadaDTOX003E>(_RetornarAlcadaResponseRetornarAlcadaResult_QNAME, RetornoListaX003CWfAlcadaDTOX003E.class, RetornarAlcadaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpjEmpresa", scope = UsuarioDetalheDTO.class)
    public JAXBElement<String> createUsuarioDetalheDTOSNrCnpjEmpresa(String value) {
        return new JAXBElement<String>(_UsuarioDetalheDTOSNrCnpjEmpresa_QNAME, String.class, UsuarioDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmUsuario", scope = UsuarioDetalheDTO.class)
    public JAXBElement<String> createUsuarioDetalheDTOSNmUsuario(String value) {
        return new JAXBElement<String>(_UsuarioDetalheDTOSNmUsuario_QNAME, String.class, UsuarioDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUsuarioDetalheSubstituto", scope = WfAlcadaUsuarioDTO.class)
    public JAXBElement<UsuarioDetalheDTO> createWfAlcadaUsuarioDTOOUsuarioDetalheSubstituto(UsuarioDetalheDTO value) {
        return new JAXBElement<UsuarioDetalheDTO>(_WfAlcadaUsuarioDTOOUsuarioDetalheSubstituto_QNAME, UsuarioDetalheDTO.class, WfAlcadaUsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUsuarioDetalheAprovador", scope = WfAlcadaUsuarioDTO.class)
    public JAXBElement<UsuarioDetalheDTO> createWfAlcadaUsuarioDTOOUsuarioDetalheAprovador(UsuarioDetalheDTO value) {
        return new JAXBElement<UsuarioDetalheDTO>(_WfAlcadaUsuarioDTOOUsuarioDetalheAprovador_QNAME, UsuarioDetalheDTO.class, WfAlcadaUsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfAlcadaUsuarioPesquisaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wfAlcadaUsuarioPesquisaDTO", scope = RetornarAlcadaUsuario.class)
    public JAXBElement<WfAlcadaUsuarioPesquisaDTO> createRetornarAlcadaUsuarioWfAlcadaUsuarioPesquisaDTO(WfAlcadaUsuarioPesquisaDTO value) {
        return new JAXBElement<WfAlcadaUsuarioPesquisaDTO>(_RetornarAlcadaUsuarioWfAlcadaUsuarioPesquisaDTO_QNAME, WfAlcadaUsuarioPesquisaDTO.class, RetornarAlcadaUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlAlcadaFinal", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<BigDecimal> createWfAlcadaUsuarioPesquisaDTODVlAlcadaFinal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WfAlcadaUsuarioPesquisaDTODVlAlcadaFinal_QNAME, BigDecimal.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<String> createWfAlcadaUsuarioPesquisaDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_WfAlcadaUsuarioPesquisaDTOSCdEmpresa_QNAME, String.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstVlAtributo", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<ArrayOfstring> createWfAlcadaUsuarioPesquisaDTOLstVlAtributo(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WfAlcadaUsuarioPesquisaDTOLstVlAtributo_QNAME, ArrayOfstring.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCdUsuarioAprovador", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<ArrayOfstring> createWfAlcadaUsuarioPesquisaDTOLstCdUsuarioAprovador(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WfAlcadaUsuarioPesquisaDTOLstCdUsuarioAprovador_QNAME, ArrayOfstring.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdObjeto", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<Long> createWfAlcadaUsuarioPesquisaDTONCdObjeto(Long value) {
        return new JAXBElement<Long>(_WfAlcadaUsuarioPesquisaDTONCdObjeto_QNAME, Long.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCdAlcada", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<ArrayOfNullableOflong> createWfAlcadaUsuarioPesquisaDTOLstCdAlcada(ArrayOfNullableOflong value) {
        return new JAXBElement<ArrayOfNullableOflong>(_WfAlcadaUsuarioPesquisaDTOLstCdAlcada_QNAME, ArrayOfNullableOflong.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlAlcadaInicial", scope = WfAlcadaUsuarioPesquisaDTO.class)
    public JAXBElement<BigDecimal> createWfAlcadaUsuarioPesquisaDTODVlAlcadaInicial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WfAlcadaUsuarioPesquisaDTODVlAlcadaInicial_QNAME, BigDecimal.class, WfAlcadaUsuarioPesquisaDTO.class, value);
    }

}
