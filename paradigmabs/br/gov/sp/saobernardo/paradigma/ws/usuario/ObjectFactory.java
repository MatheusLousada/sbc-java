
package br.gov.sp.saobernardo.paradigma.ws.usuario;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.usuario package. 
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
    private final static QName _ArrayOfPerfilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPerfilDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfUsuarioCentroCustoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUsuarioCentroCustoDTO");
    private final static QName _UsuarioSituacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioSituacaoDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfUsuarioSituacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUsuarioSituacaoDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _UsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioDTO");
    private final static QName _ArrayOfGrupoUsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfGrupoUsuarioDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _UsuarioCentroCustoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioCentroCustoDTO");
    private final static QName _GrupoUsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoUsuarioDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfUsuarioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUsuarioDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _UsuarioEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioEmpresaDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _PerfilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PerfilDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfUsuarioEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfUsuarioEmpresaDTO");
    private final static QName _RetornoListaX003CUsuarioDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_UsuarioDTO_x003E_");
    private final static QName _UsuarioDTOLstUsuarioEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstUsuarioEmpresa");
    private final static QName _UsuarioDTOSCdDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDepartamento");
    private final static QName _UsuarioDTOSNrTelefone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefone");
    private final static QName _UsuarioDTOLstUsuarioCentroCusto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstUsuarioCentroCusto");
    private final static QName _UsuarioDTOLstIdPerfil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstIdPerfil");
    private final static QName _UsuarioDTOLstGrupoUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstGrupoUsuario");
    private final static QName _UsuarioDTOSNrTelefoneDDD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefoneDDD");
    private final static QName _UsuarioDTOSCdUsuarioEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioEmpresa");
    private final static QName _UsuarioDTOSNrCPF_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCPF");
    private final static QName _UsuarioDTOLstIdPerfis_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstIdPerfis");
    private final static QName _UsuarioDTONIdRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdRepresentante");
    private final static QName _RetornarUsuarioPorEmpresaSCdEmpresa_QNAME = new QName("http://tempuri.org/", "sCdEmpresa");
    private final static QName _ProcessarUsuarioSituacaoResponseProcessarUsuarioSituacaoResult_QNAME = new QName("http://tempuri.org/", "ProcessarUsuarioSituacaoResult");
    private final static QName _ProcessarUsuarioLstUsuario_QNAME = new QName("http://tempuri.org/", "lstUsuario");
    private final static QName _UsuarioSituacaoDTOSCdUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuario");
    private final static QName _RetornarUsuarioSCdUsuario_QNAME = new QName("http://tempuri.org/", "sCdUsuario");
    private final static QName _RetornarUsuarioCompradorSLstCdStUsuario_QNAME = new QName("http://tempuri.org/", "sLstCdStUsuario");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _RetornarUsuarioResponseRetornarUsuarioResult_QNAME = new QName("http://tempuri.org/", "RetornarUsuarioResult");
    private final static QName _RetornarUsuarioPorEmpresaResponseRetornarUsuarioPorEmpresaResult_QNAME = new QName("http://tempuri.org/", "RetornarUsuarioPorEmpresaResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarUsuarioCompradorResponseRetornarUsuarioCompradorResult_QNAME = new QName("http://tempuri.org/", "RetornarUsuarioCompradorResult");
    private final static QName _ProcessarUsuarioSituacaoLstSituacaoUsuario_QNAME = new QName("http://tempuri.org/", "lstSituacaoUsuario");
    private final static QName _ProcessarUsuarioResponseProcessarUsuarioResult_QNAME = new QName("http://tempuri.org/", "ProcessarUsuarioResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessarUsuario }
     * 
     */
    public ProcessarUsuario createProcessarUsuario() {
        return new ProcessarUsuario();
    }

    /**
     * Create an instance of {@link ProcessarUsuarioSituacaoResponse }
     * 
     */
    public ProcessarUsuarioSituacaoResponse createProcessarUsuarioSituacaoResponse() {
        return new ProcessarUsuarioSituacaoResponse();
    }

    /**
     * Create an instance of {@link UsuarioSituacaoDTO }
     * 
     */
    public UsuarioSituacaoDTO createUsuarioSituacaoDTO() {
        return new UsuarioSituacaoDTO();
    }

    /**
     * Create an instance of {@link RetornarUsuarioComprador }
     * 
     */
    public RetornarUsuarioComprador createRetornarUsuarioComprador() {
        return new RetornarUsuarioComprador();
    }

    /**
     * Create an instance of {@link ArrayOfUsuarioCentroCustoDTO }
     * 
     */
    public ArrayOfUsuarioCentroCustoDTO createArrayOfUsuarioCentroCustoDTO() {
        return new ArrayOfUsuarioCentroCustoDTO();
    }

    /**
     * Create an instance of {@link UsuarioEmpresaDTO }
     * 
     */
    public UsuarioEmpresaDTO createUsuarioEmpresaDTO() {
        return new UsuarioEmpresaDTO();
    }

    /**
     * Create an instance of {@link RetornarUsuarioPorEmpresaResponse }
     * 
     */
    public RetornarUsuarioPorEmpresaResponse createRetornarUsuarioPorEmpresaResponse() {
        return new RetornarUsuarioPorEmpresaResponse();
    }

    /**
     * Create an instance of {@link RetornarUsuarioCompradorResponse }
     * 
     */
    public RetornarUsuarioCompradorResponse createRetornarUsuarioCompradorResponse() {
        return new RetornarUsuarioCompradorResponse();
    }

    /**
     * Create an instance of {@link ProcessarUsuarioResponse }
     * 
     */
    public ProcessarUsuarioResponse createProcessarUsuarioResponse() {
        return new ProcessarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfUsuarioEmpresaDTO }
     * 
     */
    public ArrayOfUsuarioEmpresaDTO createArrayOfUsuarioEmpresaDTO() {
        return new ArrayOfUsuarioEmpresaDTO();
    }

    /**
     * Create an instance of {@link UsuarioCentroCustoDTO }
     * 
     */
    public UsuarioCentroCustoDTO createUsuarioCentroCustoDTO() {
        return new UsuarioCentroCustoDTO();
    }

    /**
     * Create an instance of {@link RetornarUsuarioPorEmpresa }
     * 
     */
    public RetornarUsuarioPorEmpresa createRetornarUsuarioPorEmpresa() {
        return new RetornarUsuarioPorEmpresa();
    }

    /**
     * Create an instance of {@link UsuarioDTO }
     * 
     */
    public UsuarioDTO createUsuarioDTO() {
        return new UsuarioDTO();
    }

    /**
     * Create an instance of {@link ArrayOfGrupoUsuarioDTO }
     * 
     */
    public ArrayOfGrupoUsuarioDTO createArrayOfGrupoUsuarioDTO() {
        return new ArrayOfGrupoUsuarioDTO();
    }

    /**
     * Create an instance of {@link PerfilDTO }
     * 
     */
    public PerfilDTO createPerfilDTO() {
        return new PerfilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfUsuarioSituacaoDTO }
     * 
     */
    public ArrayOfUsuarioSituacaoDTO createArrayOfUsuarioSituacaoDTO() {
        return new ArrayOfUsuarioSituacaoDTO();
    }

    /**
     * Create an instance of {@link RetornarUsuario }
     * 
     */
    public RetornarUsuario createRetornarUsuario() {
        return new RetornarUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfUsuarioDTO }
     * 
     */
    public ArrayOfUsuarioDTO createArrayOfUsuarioDTO() {
        return new ArrayOfUsuarioDTO();
    }

    /**
     * Create an instance of {@link GrupoUsuarioDTO }
     * 
     */
    public GrupoUsuarioDTO createGrupoUsuarioDTO() {
        return new GrupoUsuarioDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CUsuarioDTOX003E }
     * 
     */
    public RetornoListaX003CUsuarioDTOX003E createRetornoListaX003CUsuarioDTOX003E() {
        return new RetornoListaX003CUsuarioDTOX003E();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link RetornarUsuarioResponse }
     * 
     */
    public RetornarUsuarioResponse createRetornarUsuarioResponse() {
        return new RetornarUsuarioResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarUsuarioSituacao }
     * 
     */
    public ProcessarUsuarioSituacao createProcessarUsuarioSituacao() {
        return new ProcessarUsuarioSituacao();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPerfilDTO }
     * 
     */
    public ArrayOfPerfilDTO createArrayOfPerfilDTO() {
        return new ArrayOfPerfilDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPerfilDTO")
    public JAXBElement<ArrayOfPerfilDTO> createArrayOfPerfilDTO(ArrayOfPerfilDTO value) {
        return new JAXBElement<ArrayOfPerfilDTO>(_ArrayOfPerfilDTO_QNAME, ArrayOfPerfilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUsuarioCentroCustoDTO")
    public JAXBElement<ArrayOfUsuarioCentroCustoDTO> createArrayOfUsuarioCentroCustoDTO(ArrayOfUsuarioCentroCustoDTO value) {
        return new JAXBElement<ArrayOfUsuarioCentroCustoDTO>(_ArrayOfUsuarioCentroCustoDTO_QNAME, ArrayOfUsuarioCentroCustoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSituacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UsuarioSituacaoDTO")
    public JAXBElement<UsuarioSituacaoDTO> createUsuarioSituacaoDTO(UsuarioSituacaoDTO value) {
        return new JAXBElement<UsuarioSituacaoDTO>(_UsuarioSituacaoDTO_QNAME, UsuarioSituacaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioSituacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUsuarioSituacaoDTO")
    public JAXBElement<ArrayOfUsuarioSituacaoDTO> createArrayOfUsuarioSituacaoDTO(ArrayOfUsuarioSituacaoDTO value) {
        return new JAXBElement<ArrayOfUsuarioSituacaoDTO>(_ArrayOfUsuarioSituacaoDTO_QNAME, ArrayOfUsuarioSituacaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UsuarioDTO")
    public JAXBElement<UsuarioDTO> createUsuarioDTO(UsuarioDTO value) {
        return new JAXBElement<UsuarioDTO>(_UsuarioDTO_QNAME, UsuarioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfGrupoUsuarioDTO")
    public JAXBElement<ArrayOfGrupoUsuarioDTO> createArrayOfGrupoUsuarioDTO(ArrayOfGrupoUsuarioDTO value) {
        return new JAXBElement<ArrayOfGrupoUsuarioDTO>(_ArrayOfGrupoUsuarioDTO_QNAME, ArrayOfGrupoUsuarioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UsuarioCentroCustoDTO")
    public JAXBElement<UsuarioCentroCustoDTO> createUsuarioCentroCustoDTO(UsuarioCentroCustoDTO value) {
        return new JAXBElement<UsuarioCentroCustoDTO>(_UsuarioCentroCustoDTO_QNAME, UsuarioCentroCustoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoUsuarioDTO")
    public JAXBElement<GrupoUsuarioDTO> createGrupoUsuarioDTO(GrupoUsuarioDTO value) {
        return new JAXBElement<GrupoUsuarioDTO>(_GrupoUsuarioDTO_QNAME, GrupoUsuarioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUsuarioDTO")
    public JAXBElement<ArrayOfUsuarioDTO> createArrayOfUsuarioDTO(ArrayOfUsuarioDTO value) {
        return new JAXBElement<ArrayOfUsuarioDTO>(_ArrayOfUsuarioDTO_QNAME, ArrayOfUsuarioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UsuarioEmpresaDTO")
    public JAXBElement<UsuarioEmpresaDTO> createUsuarioEmpresaDTO(UsuarioEmpresaDTO value) {
        return new JAXBElement<UsuarioEmpresaDTO>(_UsuarioEmpresaDTO_QNAME, UsuarioEmpresaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PerfilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PerfilDTO")
    public JAXBElement<PerfilDTO> createPerfilDTO(PerfilDTO value) {
        return new JAXBElement<PerfilDTO>(_PerfilDTO_QNAME, PerfilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfUsuarioEmpresaDTO")
    public JAXBElement<ArrayOfUsuarioEmpresaDTO> createArrayOfUsuarioEmpresaDTO(ArrayOfUsuarioEmpresaDTO value) {
        return new JAXBElement<ArrayOfUsuarioEmpresaDTO>(_ArrayOfUsuarioEmpresaDTO_QNAME, ArrayOfUsuarioEmpresaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CUsuarioDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_UsuarioDTO_x003E_")
    public JAXBElement<RetornoListaX003CUsuarioDTOX003E> createRetornoListaX003CUsuarioDTOX003E(RetornoListaX003CUsuarioDTOX003E value) {
        return new JAXBElement<RetornoListaX003CUsuarioDTOX003E>(_RetornoListaX003CUsuarioDTOX003E_QNAME, RetornoListaX003CUsuarioDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstUsuarioEmpresa", scope = UsuarioDTO.class)
    public JAXBElement<ArrayOfUsuarioEmpresaDTO> createUsuarioDTOLstUsuarioEmpresa(ArrayOfUsuarioEmpresaDTO value) {
        return new JAXBElement<ArrayOfUsuarioEmpresaDTO>(_UsuarioDTOLstUsuarioEmpresa_QNAME, ArrayOfUsuarioEmpresaDTO.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDepartamento", scope = UsuarioDTO.class)
    public JAXBElement<String> createUsuarioDTOSCdDepartamento(String value) {
        return new JAXBElement<String>(_UsuarioDTOSCdDepartamento_QNAME, String.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefone", scope = UsuarioDTO.class)
    public JAXBElement<String> createUsuarioDTOSNrTelefone(String value) {
        return new JAXBElement<String>(_UsuarioDTOSNrTelefone_QNAME, String.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioCentroCustoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstUsuarioCentroCusto", scope = UsuarioDTO.class)
    public JAXBElement<ArrayOfUsuarioCentroCustoDTO> createUsuarioDTOLstUsuarioCentroCusto(ArrayOfUsuarioCentroCustoDTO value) {
        return new JAXBElement<ArrayOfUsuarioCentroCustoDTO>(_UsuarioDTOLstUsuarioCentroCusto_QNAME, ArrayOfUsuarioCentroCustoDTO.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstIdPerfil", scope = UsuarioDTO.class)
    public JAXBElement<ArrayOfint> createUsuarioDTOLstIdPerfil(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_UsuarioDTOLstIdPerfil_QNAME, ArrayOfint.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrupoUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstGrupoUsuario", scope = UsuarioDTO.class)
    public JAXBElement<ArrayOfGrupoUsuarioDTO> createUsuarioDTOLstGrupoUsuario(ArrayOfGrupoUsuarioDTO value) {
        return new JAXBElement<ArrayOfGrupoUsuarioDTO>(_UsuarioDTOLstGrupoUsuario_QNAME, ArrayOfGrupoUsuarioDTO.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefoneDDD", scope = UsuarioDTO.class)
    public JAXBElement<String> createUsuarioDTOSNrTelefoneDDD(String value) {
        return new JAXBElement<String>(_UsuarioDTOSNrTelefoneDDD_QNAME, String.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioEmpresa", scope = UsuarioDTO.class)
    public JAXBElement<String> createUsuarioDTOSCdUsuarioEmpresa(String value) {
        return new JAXBElement<String>(_UsuarioDTOSCdUsuarioEmpresa_QNAME, String.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCPF", scope = UsuarioDTO.class)
    public JAXBElement<String> createUsuarioDTOSNrCPF(String value) {
        return new JAXBElement<String>(_UsuarioDTOSNrCPF_QNAME, String.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerfilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstIdPerfis", scope = UsuarioDTO.class)
    public JAXBElement<ArrayOfPerfilDTO> createUsuarioDTOLstIdPerfis(ArrayOfPerfilDTO value) {
        return new JAXBElement<ArrayOfPerfilDTO>(_UsuarioDTOLstIdPerfis_QNAME, ArrayOfPerfilDTO.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdRepresentante", scope = UsuarioDTO.class)
    public JAXBElement<Integer> createUsuarioDTONIdRepresentante(Integer value) {
        return new JAXBElement<Integer>(_UsuarioDTONIdRepresentante_QNAME, Integer.class, UsuarioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresa", scope = RetornarUsuarioPorEmpresa.class)
    public JAXBElement<String> createRetornarUsuarioPorEmpresaSCdEmpresa(String value) {
        return new JAXBElement<String>(_RetornarUsuarioPorEmpresaSCdEmpresa_QNAME, String.class, RetornarUsuarioPorEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarUsuarioSituacaoResult", scope = ProcessarUsuarioSituacaoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarUsuarioSituacaoResponseProcessarUsuarioSituacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarUsuarioSituacaoResponseProcessarUsuarioSituacaoResult_QNAME, RetornoDTO.class, ProcessarUsuarioSituacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstUsuario", scope = ProcessarUsuario.class)
    public JAXBElement<ArrayOfUsuarioDTO> createProcessarUsuarioLstUsuario(ArrayOfUsuarioDTO value) {
        return new JAXBElement<ArrayOfUsuarioDTO>(_ProcessarUsuarioLstUsuario_QNAME, ArrayOfUsuarioDTO.class, ProcessarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuario", scope = UsuarioSituacaoDTO.class)
    public JAXBElement<String> createUsuarioSituacaoDTOSCdUsuario(String value) {
        return new JAXBElement<String>(_UsuarioSituacaoDTOSCdUsuario_QNAME, String.class, UsuarioSituacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdUsuario", scope = RetornarUsuario.class)
    public JAXBElement<String> createRetornarUsuarioSCdUsuario(String value) {
        return new JAXBElement<String>(_RetornarUsuarioSCdUsuario_QNAME, String.class, RetornarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresa", scope = RetornarUsuarioComprador.class)
    public JAXBElement<String> createRetornarUsuarioCompradorSCdEmpresa(String value) {
        return new JAXBElement<String>(_RetornarUsuarioPorEmpresaSCdEmpresa_QNAME, String.class, RetornarUsuarioComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sLstCdStUsuario", scope = RetornarUsuarioComprador.class)
    public JAXBElement<String> createRetornarUsuarioCompradorSLstCdStUsuario(String value) {
        return new JAXBElement<String>(_RetornarUsuarioCompradorSLstCdStUsuario_QNAME, String.class, RetornarUsuarioComprador.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarUsuarioResult", scope = RetornarUsuarioResponse.class)
    public JAXBElement<UsuarioDTO> createRetornarUsuarioResponseRetornarUsuarioResult(UsuarioDTO value) {
        return new JAXBElement<UsuarioDTO>(_RetornarUsuarioResponseRetornarUsuarioResult_QNAME, UsuarioDTO.class, RetornarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CUsuarioDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarUsuarioPorEmpresaResult", scope = RetornarUsuarioPorEmpresaResponse.class)
    public JAXBElement<RetornoListaX003CUsuarioDTOX003E> createRetornarUsuarioPorEmpresaResponseRetornarUsuarioPorEmpresaResult(RetornoListaX003CUsuarioDTOX003E value) {
        return new JAXBElement<RetornoListaX003CUsuarioDTOX003E>(_RetornarUsuarioPorEmpresaResponseRetornarUsuarioPorEmpresaResult_QNAME, RetornoListaX003CUsuarioDTOX003E.class, RetornarUsuarioPorEmpresaResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CUsuarioDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarUsuarioCompradorResult", scope = RetornarUsuarioCompradorResponse.class)
    public JAXBElement<RetornoListaX003CUsuarioDTOX003E> createRetornarUsuarioCompradorResponseRetornarUsuarioCompradorResult(RetornoListaX003CUsuarioDTOX003E value) {
        return new JAXBElement<RetornoListaX003CUsuarioDTOX003E>(_RetornarUsuarioCompradorResponseRetornarUsuarioCompradorResult_QNAME, RetornoListaX003CUsuarioDTOX003E.class, RetornarUsuarioCompradorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuarioSituacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstSituacaoUsuario", scope = ProcessarUsuarioSituacao.class)
    public JAXBElement<ArrayOfUsuarioSituacaoDTO> createProcessarUsuarioSituacaoLstSituacaoUsuario(ArrayOfUsuarioSituacaoDTO value) {
        return new JAXBElement<ArrayOfUsuarioSituacaoDTO>(_ProcessarUsuarioSituacaoLstSituacaoUsuario_QNAME, ArrayOfUsuarioSituacaoDTO.class, ProcessarUsuarioSituacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarUsuarioResult", scope = ProcessarUsuarioResponse.class)
    public JAXBElement<RetornoDTO> createProcessarUsuarioResponseProcessarUsuarioResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarUsuarioResponseProcessarUsuarioResult_QNAME, RetornoDTO.class, ProcessarUsuarioResponse.class, value);
    }

}
