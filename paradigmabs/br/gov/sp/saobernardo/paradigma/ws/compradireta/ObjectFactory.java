
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.compradireta package. 
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
    private final static QName _HabilitarCompraDiretaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "HabilitarCompraDiretaDTO");
    private final static QName _CompraDiretaItemLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaItemLanceDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _CompraDiretaItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaItemTaxaDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CompraDiretaItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaItemDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _CompraDiretaItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaItemEnderecoDTO");
    private final static QName _ArrayOfCompraDiretaItemLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaItemLanceDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfHabilitarCompraDiretaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfHabilitarCompraDiretaDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _CompraDiretaLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaLoteDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ComissaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ComissaoDTO");
    private final static QName _ArrayOfComissaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfComissaoDTO");
    private final static QName _ArrayOfCompraDiretaLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaLoteDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfCompraDiretaItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaItemTaxaDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _ArrayOfCompraDiretaItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaItemDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfCompraDiretaItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaItemEnderecoDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfCompraDiretaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCompraDiretaDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _CompraDiretaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CompraDiretaDTO");
    private final static QName _CompraDiretaItemDTOLstCompraDiretaItemTaxa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCompraDiretaItemTaxa");
    private final static QName _CompraDiretaItemDTOSCdItemLegado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemLegado");
    private final static QName _CompraDiretaItemDTOSCdLoteLegado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLoteLegado");
    private final static QName _CompraDiretaItemDTOLstCompraDiretaItemLance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCompraDiretaItemLance");
    private final static QName _HabilitarRetornarCompraDiretaLstCompraDiretaHabilitar_QNAME = new QName("http://tempuri.org/", "lstCompraDiretaHabilitar");
    private final static QName _HabilitarCompraDiretaDTOSNrEdital_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrEdital");
    private final static QName _CompraDiretaItemLanceDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _ProcessarCompraDiretaResponseProcessarCompraDiretaResult_QNAME = new QName("http://tempuri.org/", "ProcessarCompraDiretaResult");
    private final static QName _HabilitarRetornarCompraDiretaResponseHabilitarRetornarCompraDiretaResult_QNAME = new QName("http://tempuri.org/", "HabilitarRetornarCompraDiretaResult");
    private final static QName _CompraDiretaDTOSDsTermo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsTermo");
    private final static QName _CompraDiretaDTONIdTipoLanceInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoLanceInicial");
    private final static QName _CompraDiretaDTOLstCompraDiretaLote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCompraDiretaLote");
    private final static QName _CompraDiretaDTOBFlPermitirLance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlPermitirLance");
    private final static QName _CompraDiretaDTOSDsObservacoes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacoes");
    private final static QName _CompraDiretaDTONCdTipoCompraDireta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipoCompraDireta");
    private final static QName _CompraDiretaDTOTDtPublicacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtPublicacao");
    private final static QName _CompraDiretaDTOLstCompraDiretaComissao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCompraDiretaComissao");
    private final static QName _CompraDiretaDTOBFlObrigarDeclaracaoVendedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlObrigarDeclaracaoVendedor");
    private final static QName _RetornarCompraDiretaResponseRetornarCompraDiretaResult_QNAME = new QName("http://tempuri.org/", "RetornarCompraDiretaResult");
    private final static QName _ProcessarCompraDiretaLstCompraDireta_QNAME = new QName("http://tempuri.org/", "lstCompraDireta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.compradireta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HabilitarCompraDiretaDTO }
     * 
     */
    public HabilitarCompraDiretaDTO createHabilitarCompraDiretaDTO() {
        return new HabilitarCompraDiretaDTO();
    }

    /**
     * Create an instance of {@link RetornarCompraDireta }
     * 
     */
    public RetornarCompraDireta createRetornarCompraDireta() {
        return new RetornarCompraDireta();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfComissaoDTO }
     * 
     */
    public ArrayOfComissaoDTO createArrayOfComissaoDTO() {
        return new ArrayOfComissaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfHabilitarCompraDiretaDTO }
     * 
     */
    public ArrayOfHabilitarCompraDiretaDTO createArrayOfHabilitarCompraDiretaDTO() {
        return new ArrayOfHabilitarCompraDiretaDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCompraDireta }
     * 
     */
    public HabilitarRetornarCompraDireta createHabilitarRetornarCompraDireta() {
        return new HabilitarRetornarCompraDireta();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaItemTaxaDTO }
     * 
     */
    public ArrayOfCompraDiretaItemTaxaDTO createArrayOfCompraDiretaItemTaxaDTO() {
        return new ArrayOfCompraDiretaItemTaxaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaItemDTO }
     * 
     */
    public ArrayOfCompraDiretaItemDTO createArrayOfCompraDiretaItemDTO() {
        return new ArrayOfCompraDiretaItemDTO();
    }

    /**
     * Create an instance of {@link ComissaoDTO }
     * 
     */
    public ComissaoDTO createComissaoDTO() {
        return new ComissaoDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarCompraDiretaResponse }
     * 
     */
    public HabilitarRetornarCompraDiretaResponse createHabilitarRetornarCompraDiretaResponse() {
        return new HabilitarRetornarCompraDiretaResponse();
    }

    /**
     * Create an instance of {@link RetornarCompraDiretaResponse }
     * 
     */
    public RetornarCompraDiretaResponse createRetornarCompraDiretaResponse() {
        return new RetornarCompraDiretaResponse();
    }

    /**
     * Create an instance of {@link CompraDiretaLoteDTO }
     * 
     */
    public CompraDiretaLoteDTO createCompraDiretaLoteDTO() {
        return new CompraDiretaLoteDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaDTO }
     * 
     */
    public ArrayOfCompraDiretaDTO createArrayOfCompraDiretaDTO() {
        return new ArrayOfCompraDiretaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaItemEnderecoDTO }
     * 
     */
    public ArrayOfCompraDiretaItemEnderecoDTO createArrayOfCompraDiretaItemEnderecoDTO() {
        return new ArrayOfCompraDiretaItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link CompraDiretaItemLanceDTO }
     * 
     */
    public CompraDiretaItemLanceDTO createCompraDiretaItemLanceDTO() {
        return new CompraDiretaItemLanceDTO();
    }

    /**
     * Create an instance of {@link ProcessarCompraDiretaResponse }
     * 
     */
    public ProcessarCompraDiretaResponse createProcessarCompraDiretaResponse() {
        return new ProcessarCompraDiretaResponse();
    }

    /**
     * Create an instance of {@link ProcessarCompraDireta }
     * 
     */
    public ProcessarCompraDireta createProcessarCompraDireta() {
        return new ProcessarCompraDireta();
    }

    /**
     * Create an instance of {@link CompraDiretaDTO }
     * 
     */
    public CompraDiretaDTO createCompraDiretaDTO() {
        return new CompraDiretaDTO();
    }

    /**
     * Create an instance of {@link CompraDiretaItemTaxaDTO }
     * 
     */
    public CompraDiretaItemTaxaDTO createCompraDiretaItemTaxaDTO() {
        return new CompraDiretaItemTaxaDTO();
    }

    /**
     * Create an instance of {@link CompraDiretaItemDTO }
     * 
     */
    public CompraDiretaItemDTO createCompraDiretaItemDTO() {
        return new CompraDiretaItemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaLoteDTO }
     * 
     */
    public ArrayOfCompraDiretaLoteDTO createArrayOfCompraDiretaLoteDTO() {
        return new ArrayOfCompraDiretaLoteDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfCompraDiretaItemLanceDTO }
     * 
     */
    public ArrayOfCompraDiretaItemLanceDTO createArrayOfCompraDiretaItemLanceDTO() {
        return new ArrayOfCompraDiretaItemLanceDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link CompraDiretaItemEnderecoDTO }
     * 
     */
    public CompraDiretaItemEnderecoDTO createCompraDiretaItemEnderecoDTO() {
        return new CompraDiretaItemEnderecoDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HabilitarCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "HabilitarCompraDiretaDTO")
    public JAXBElement<HabilitarCompraDiretaDTO> createHabilitarCompraDiretaDTO(HabilitarCompraDiretaDTO value) {
        return new JAXBElement<HabilitarCompraDiretaDTO>(_HabilitarCompraDiretaDTO_QNAME, HabilitarCompraDiretaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaItemLanceDTO")
    public JAXBElement<CompraDiretaItemLanceDTO> createCompraDiretaItemLanceDTO(CompraDiretaItemLanceDTO value) {
        return new JAXBElement<CompraDiretaItemLanceDTO>(_CompraDiretaItemLanceDTO_QNAME, CompraDiretaItemLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaItemTaxaDTO")
    public JAXBElement<CompraDiretaItemTaxaDTO> createCompraDiretaItemTaxaDTO(CompraDiretaItemTaxaDTO value) {
        return new JAXBElement<CompraDiretaItemTaxaDTO>(_CompraDiretaItemTaxaDTO_QNAME, CompraDiretaItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaItemDTO")
    public JAXBElement<CompraDiretaItemDTO> createCompraDiretaItemDTO(CompraDiretaItemDTO value) {
        return new JAXBElement<CompraDiretaItemDTO>(_CompraDiretaItemDTO_QNAME, CompraDiretaItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaItemEnderecoDTO")
    public JAXBElement<CompraDiretaItemEnderecoDTO> createCompraDiretaItemEnderecoDTO(CompraDiretaItemEnderecoDTO value) {
        return new JAXBElement<CompraDiretaItemEnderecoDTO>(_CompraDiretaItemEnderecoDTO_QNAME, CompraDiretaItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaItemLanceDTO")
    public JAXBElement<ArrayOfCompraDiretaItemLanceDTO> createArrayOfCompraDiretaItemLanceDTO(ArrayOfCompraDiretaItemLanceDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemLanceDTO>(_ArrayOfCompraDiretaItemLanceDTO_QNAME, ArrayOfCompraDiretaItemLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHabilitarCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfHabilitarCompraDiretaDTO")
    public JAXBElement<ArrayOfHabilitarCompraDiretaDTO> createArrayOfHabilitarCompraDiretaDTO(ArrayOfHabilitarCompraDiretaDTO value) {
        return new JAXBElement<ArrayOfHabilitarCompraDiretaDTO>(_ArrayOfHabilitarCompraDiretaDTO_QNAME, ArrayOfHabilitarCompraDiretaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaLoteDTO")
    public JAXBElement<CompraDiretaLoteDTO> createCompraDiretaLoteDTO(CompraDiretaLoteDTO value) {
        return new JAXBElement<CompraDiretaLoteDTO>(_CompraDiretaLoteDTO_QNAME, CompraDiretaLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ComissaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ComissaoDTO")
    public JAXBElement<ComissaoDTO> createComissaoDTO(ComissaoDTO value) {
        return new JAXBElement<ComissaoDTO>(_ComissaoDTO_QNAME, ComissaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfComissaoDTO")
    public JAXBElement<ArrayOfComissaoDTO> createArrayOfComissaoDTO(ArrayOfComissaoDTO value) {
        return new JAXBElement<ArrayOfComissaoDTO>(_ArrayOfComissaoDTO_QNAME, ArrayOfComissaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaLoteDTO")
    public JAXBElement<ArrayOfCompraDiretaLoteDTO> createArrayOfCompraDiretaLoteDTO(ArrayOfCompraDiretaLoteDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaLoteDTO>(_ArrayOfCompraDiretaLoteDTO_QNAME, ArrayOfCompraDiretaLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaItemTaxaDTO")
    public JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> createArrayOfCompraDiretaItemTaxaDTO(ArrayOfCompraDiretaItemTaxaDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemTaxaDTO>(_ArrayOfCompraDiretaItemTaxaDTO_QNAME, ArrayOfCompraDiretaItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaItemDTO")
    public JAXBElement<ArrayOfCompraDiretaItemDTO> createArrayOfCompraDiretaItemDTO(ArrayOfCompraDiretaItemDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemDTO>(_ArrayOfCompraDiretaItemDTO_QNAME, ArrayOfCompraDiretaItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaItemEnderecoDTO")
    public JAXBElement<ArrayOfCompraDiretaItemEnderecoDTO> createArrayOfCompraDiretaItemEnderecoDTO(ArrayOfCompraDiretaItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemEnderecoDTO>(_ArrayOfCompraDiretaItemEnderecoDTO_QNAME, ArrayOfCompraDiretaItemEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCompraDiretaDTO")
    public JAXBElement<ArrayOfCompraDiretaDTO> createArrayOfCompraDiretaDTO(ArrayOfCompraDiretaDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaDTO>(_ArrayOfCompraDiretaDTO_QNAME, ArrayOfCompraDiretaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CompraDiretaDTO")
    public JAXBElement<CompraDiretaDTO> createCompraDiretaDTO(CompraDiretaDTO value) {
        return new JAXBElement<CompraDiretaDTO>(_CompraDiretaDTO_QNAME, CompraDiretaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCompraDiretaItemTaxa", scope = CompraDiretaItemDTO.class)
    public JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> createCompraDiretaItemDTOLstCompraDiretaItemTaxa(ArrayOfCompraDiretaItemTaxaDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemTaxaDTO>(_CompraDiretaItemDTOLstCompraDiretaItemTaxa_QNAME, ArrayOfCompraDiretaItemTaxaDTO.class, CompraDiretaItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemLegado", scope = CompraDiretaItemDTO.class)
    public JAXBElement<String> createCompraDiretaItemDTOSCdItemLegado(String value) {
        return new JAXBElement<String>(_CompraDiretaItemDTOSCdItemLegado_QNAME, String.class, CompraDiretaItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLoteLegado", scope = CompraDiretaItemDTO.class)
    public JAXBElement<String> createCompraDiretaItemDTOSCdLoteLegado(String value) {
        return new JAXBElement<String>(_CompraDiretaItemDTOSCdLoteLegado_QNAME, String.class, CompraDiretaItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCompraDiretaItemLance", scope = CompraDiretaItemDTO.class)
    public JAXBElement<ArrayOfCompraDiretaItemLanceDTO> createCompraDiretaItemDTOLstCompraDiretaItemLance(ArrayOfCompraDiretaItemLanceDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaItemLanceDTO>(_CompraDiretaItemDTOLstCompraDiretaItemLance_QNAME, ArrayOfCompraDiretaItemLanceDTO.class, CompraDiretaItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHabilitarCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCompraDiretaHabilitar", scope = HabilitarRetornarCompraDireta.class)
    public JAXBElement<ArrayOfHabilitarCompraDiretaDTO> createHabilitarRetornarCompraDiretaLstCompraDiretaHabilitar(ArrayOfHabilitarCompraDiretaDTO value) {
        return new JAXBElement<ArrayOfHabilitarCompraDiretaDTO>(_HabilitarRetornarCompraDiretaLstCompraDiretaHabilitar_QNAME, ArrayOfHabilitarCompraDiretaDTO.class, HabilitarRetornarCompraDireta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrEdital", scope = HabilitarCompraDiretaDTO.class)
    public JAXBElement<String> createHabilitarCompraDiretaDTOSNrEdital(String value) {
        return new JAXBElement<String>(_HabilitarCompraDiretaDTOSNrEdital_QNAME, String.class, HabilitarCompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = CompraDiretaItemLanceDTO.class)
    public JAXBElement<String> createCompraDiretaItemLanceDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_CompraDiretaItemLanceDTOSCdEmpresa_QNAME, String.class, CompraDiretaItemLanceDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarCompraDiretaResult", scope = ProcessarCompraDiretaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarCompraDiretaResponseProcessarCompraDiretaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarCompraDiretaResponseProcessarCompraDiretaResult_QNAME, RetornoDTO.class, ProcessarCompraDiretaResponse.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HabilitarRetornarCompraDiretaResult", scope = HabilitarRetornarCompraDiretaResponse.class)
    public JAXBElement<RetornoDTO> createHabilitarRetornarCompraDiretaResponseHabilitarRetornarCompraDiretaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_HabilitarRetornarCompraDiretaResponseHabilitarRetornarCompraDiretaResult_QNAME, RetornoDTO.class, HabilitarRetornarCompraDiretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsTermo", scope = CompraDiretaDTO.class)
    public JAXBElement<String> createCompraDiretaDTOSDsTermo(String value) {
        return new JAXBElement<String>(_CompraDiretaDTOSDsTermo_QNAME, String.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoLanceInicial", scope = CompraDiretaDTO.class)
    public JAXBElement<Integer> createCompraDiretaDTONIdTipoLanceInicial(Integer value) {
        return new JAXBElement<Integer>(_CompraDiretaDTONIdTipoLanceInicial_QNAME, Integer.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCompraDiretaLote", scope = CompraDiretaDTO.class)
    public JAXBElement<ArrayOfCompraDiretaLoteDTO> createCompraDiretaDTOLstCompraDiretaLote(ArrayOfCompraDiretaLoteDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaLoteDTO>(_CompraDiretaDTOLstCompraDiretaLote_QNAME, ArrayOfCompraDiretaLoteDTO.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlPermitirLance", scope = CompraDiretaDTO.class)
    public JAXBElement<Integer> createCompraDiretaDTOBFlPermitirLance(Integer value) {
        return new JAXBElement<Integer>(_CompraDiretaDTOBFlPermitirLance_QNAME, Integer.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacoes", scope = CompraDiretaDTO.class)
    public JAXBElement<String> createCompraDiretaDTOSDsObservacoes(String value) {
        return new JAXBElement<String>(_CompraDiretaDTOSDsObservacoes_QNAME, String.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipoCompraDireta", scope = CompraDiretaDTO.class)
    public JAXBElement<Long> createCompraDiretaDTONCdTipoCompraDireta(Long value) {
        return new JAXBElement<Long>(_CompraDiretaDTONCdTipoCompraDireta_QNAME, Long.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrEdital", scope = CompraDiretaDTO.class)
    public JAXBElement<String> createCompraDiretaDTOSNrEdital(String value) {
        return new JAXBElement<String>(_HabilitarCompraDiretaDTOSNrEdital_QNAME, String.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtPublicacao", scope = CompraDiretaDTO.class)
    public JAXBElement<XMLGregorianCalendar> createCompraDiretaDTOTDtPublicacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompraDiretaDTOTDtPublicacao_QNAME, XMLGregorianCalendar.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCompraDiretaComissao", scope = CompraDiretaDTO.class)
    public JAXBElement<ArrayOfComissaoDTO> createCompraDiretaDTOLstCompraDiretaComissao(ArrayOfComissaoDTO value) {
        return new JAXBElement<ArrayOfComissaoDTO>(_CompraDiretaDTOLstCompraDiretaComissao_QNAME, ArrayOfComissaoDTO.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlObrigarDeclaracaoVendedor", scope = CompraDiretaDTO.class)
    public JAXBElement<Integer> createCompraDiretaDTOBFlObrigarDeclaracaoVendedor(Integer value) {
        return new JAXBElement<Integer>(_CompraDiretaDTOBFlObrigarDeclaracaoVendedor_QNAME, Integer.class, CompraDiretaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarCompraDiretaResult", scope = RetornarCompraDiretaResponse.class)
    public JAXBElement<ArrayOfCompraDiretaDTO> createRetornarCompraDiretaResponseRetornarCompraDiretaResult(ArrayOfCompraDiretaDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaDTO>(_RetornarCompraDiretaResponseRetornarCompraDiretaResult_QNAME, ArrayOfCompraDiretaDTO.class, RetornarCompraDiretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCompraDireta", scope = ProcessarCompraDireta.class)
    public JAXBElement<ArrayOfCompraDiretaDTO> createProcessarCompraDiretaLstCompraDireta(ArrayOfCompraDiretaDTO value) {
        return new JAXBElement<ArrayOfCompraDiretaDTO>(_ProcessarCompraDiretaLstCompraDireta_QNAME, ArrayOfCompraDiretaDTO.class, ProcessarCompraDireta.class, value);
    }

}
