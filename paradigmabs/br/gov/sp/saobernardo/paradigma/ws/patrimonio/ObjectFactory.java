
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.patrimonio package. 
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
    private final static QName _InventarioMovelDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "InventarioMovelDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _RetornoListaX003CInventarioMovelDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_InventarioMovelDTO_x003E_");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _DadosContabeisEstornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DadosContabeisEstornoDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _RetornoListaX003CDadosContabeisEstornoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_DadosContabeisEstornoDTO_x003E_");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DadosContabeisDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DadosContabeisDTO");
    private final static QName _ArrayOfNumeroDocumentoContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNumeroDocumentoContabilDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _RetornoListaX003CDadosContabeisDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_DadosContabeisDTO_x003E_");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _NumeroDocumentoContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NumeroDocumentoContabilDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfDadosContabeisEstornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDadosContabeisEstornoDTO");
    private final static QName _ArrayOfInventarioMovelItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfInventarioMovelItemDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfDadosContabeisDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDadosContabeisDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _InventarioMovelItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "InventarioMovelItemDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfInventarioMovelDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfInventarioMovelDTO");
    private final static QName _RetornarInventarioMovelSCdInventarioSelecionado_QNAME = new QName("http://tempuri.org/", "sCdInventarioSelecionado");
    private final static QName _DadosContabeisEstornoDTOSVlAnoExercicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sVlAnoExercicio");
    private final static QName _DadosContabeisEstornoDTOSDsJustificativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsJustificativa");
    private final static QName _DadosContabeisEstornoDTOSCdDocumentoContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDocumentoContabil");
    private final static QName _DadosContabeisEstornoDTOSDsGestaoOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsGestaoOrigem");
    private final static QName _DadosContabeisEstornoDTOSDsUgOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUgOrigem");
    private final static QName _ProcessarNumeroDocumentoContabilResponseProcessarNumeroDocumentoContabilResult_QNAME = new QName("http://tempuri.org/", "ProcessarNumeroDocumentoContabilResult");
    private final static QName _RetornaDadosContabeisImovelResponseRetornaDadosContabeisImovelResult_QNAME = new QName("http://tempuri.org/", "RetornaDadosContabeisImovelResult");
    private final static QName _DadosContabeisDTOSDtExercicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDtExercicio");
    private final static QName _DadosContabeisDTOSDsUgDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUgDestino");
    private final static QName _DadosContabeisDTOSDsGestaoDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsGestaoDestino");
    private final static QName _DadosContabeisDTOSDsAcaoContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAcaoContabil");
    private final static QName _DadosContabeisDTOSCdCategoria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCategoria");
    private final static QName _ProcessarMudancaResponsavelSCdUsuaioErp_QNAME = new QName("http://tempuri.org/", "sCdUsuaioErp");
    private final static QName _ProcessarInventarioMovelLstIventarioMovelDTO_QNAME = new QName("http://tempuri.org/", "lstIventarioMovelDTO");
    private final static QName _RetornarInventarioMovelResponseRetornarInventarioMovelResult_QNAME = new QName("http://tempuri.org/", "RetornarInventarioMovelResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _RetornaDadosContabeisMovelResponseRetornaDadosContabeisMovelResult_QNAME = new QName("http://tempuri.org/", "RetornaDadosContabeisMovelResult");
    private final static QName _InventarioMovelItemDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _InventarioMovelItemDTOSNrTombamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTombamento");
    private final static QName _ProcessarNumeroDocumentoContabilLstNumeroDocumentoContabilDTO_QNAME = new QName("http://tempuri.org/", "lstNumeroDocumentoContabilDTO");
    private final static QName _InventarioMovelDTOLstInventarioItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstInventarioItem");
    private final static QName _InventarioMovelDTOSDsInventario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsInventario");
    private final static QName _ProcessarMudancaResponsavelResponseProcessarMudancaResponsavelResult_QNAME = new QName("http://tempuri.org/", "ProcessarMudancaResponsavelResult");
    private final static QName _RetornaDadosContabeisEstornoResponseRetornaDadosContabeisEstornoResult_QNAME = new QName("http://tempuri.org/", "RetornaDadosContabeisEstornoResult");
    private final static QName _ProcessarInventarioMovelResponseProcessarInventarioMovelResult_QNAME = new QName("http://tempuri.org/", "ProcessarInventarioMovelResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.patrimonio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisMovel }
     * 
     */
    public RetornaDadosContabeisMovel createRetornaDadosContabeisMovel() {
        return new RetornaDadosContabeisMovel();
    }

    /**
     * Create an instance of {@link ArrayOfDadosContabeisDTO }
     * 
     */
    public ArrayOfDadosContabeisDTO createArrayOfDadosContabeisDTO() {
        return new ArrayOfDadosContabeisDTO();
    }

    /**
     * Create an instance of {@link DadosContabeisEstornoDTO }
     * 
     */
    public DadosContabeisEstornoDTO createDadosContabeisEstornoDTO() {
        return new DadosContabeisEstornoDTO();
    }

    /**
     * Create an instance of {@link ProcessarNumeroDocumentoContabilResponse }
     * 
     */
    public ProcessarNumeroDocumentoContabilResponse createProcessarNumeroDocumentoContabilResponse() {
        return new ProcessarNumeroDocumentoContabilResponse();
    }

    /**
     * Create an instance of {@link RetornoListaX003CInventarioMovelDTOX003E }
     * 
     */
    public RetornoListaX003CInventarioMovelDTOX003E createRetornoListaX003CInventarioMovelDTOX003E() {
        return new RetornoListaX003CInventarioMovelDTOX003E();
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisEstorno }
     * 
     */
    public RetornaDadosContabeisEstorno createRetornaDadosContabeisEstorno() {
        return new RetornaDadosContabeisEstorno();
    }

    /**
     * Create an instance of {@link ProcessarMudancaResponsavel }
     * 
     */
    public ProcessarMudancaResponsavel createProcessarMudancaResponsavel() {
        return new ProcessarMudancaResponsavel();
    }

    /**
     * Create an instance of {@link DadosContabeisDTO }
     * 
     */
    public DadosContabeisDTO createDadosContabeisDTO() {
        return new DadosContabeisDTO();
    }

    /**
     * Create an instance of {@link ArrayOfInventarioMovelDTO }
     * 
     */
    public ArrayOfInventarioMovelDTO createArrayOfInventarioMovelDTO() {
        return new ArrayOfInventarioMovelDTO();
    }

    /**
     * Create an instance of {@link RetornarInventarioMovelResponse }
     * 
     */
    public RetornarInventarioMovelResponse createRetornarInventarioMovelResponse() {
        return new RetornarInventarioMovelResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link InventarioMovelItemDTO }
     * 
     */
    public InventarioMovelItemDTO createInventarioMovelItemDTO() {
        return new InventarioMovelItemDTO();
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisMovelResponse }
     * 
     */
    public RetornaDadosContabeisMovelResponse createRetornaDadosContabeisMovelResponse() {
        return new RetornaDadosContabeisMovelResponse();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisImovel }
     * 
     */
    public RetornaDadosContabeisImovel createRetornaDadosContabeisImovel() {
        return new RetornaDadosContabeisImovel();
    }

    /**
     * Create an instance of {@link ProcessarMudancaResponsavelResponse }
     * 
     */
    public ProcessarMudancaResponsavelResponse createProcessarMudancaResponsavelResponse() {
        return new ProcessarMudancaResponsavelResponse();
    }

    /**
     * Create an instance of {@link InventarioMovelDTO }
     * 
     */
    public InventarioMovelDTO createInventarioMovelDTO() {
        return new InventarioMovelDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDadosContabeisEstornoDTO }
     * 
     */
    public ArrayOfDadosContabeisEstornoDTO createArrayOfDadosContabeisEstornoDTO() {
        return new ArrayOfDadosContabeisEstornoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNumeroDocumentoContabilDTO }
     * 
     */
    public ArrayOfNumeroDocumentoContabilDTO createArrayOfNumeroDocumentoContabilDTO() {
        return new ArrayOfNumeroDocumentoContabilDTO();
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisEstornoResponse }
     * 
     */
    public RetornaDadosContabeisEstornoResponse createRetornaDadosContabeisEstornoResponse() {
        return new RetornaDadosContabeisEstornoResponse();
    }

    /**
     * Create an instance of {@link RetornarInventarioMovel }
     * 
     */
    public RetornarInventarioMovel createRetornarInventarioMovel() {
        return new RetornarInventarioMovel();
    }

    /**
     * Create an instance of {@link NumeroDocumentoContabilDTO }
     * 
     */
    public NumeroDocumentoContabilDTO createNumeroDocumentoContabilDTO() {
        return new NumeroDocumentoContabilDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link RetornaDadosContabeisImovelResponse }
     * 
     */
    public RetornaDadosContabeisImovelResponse createRetornaDadosContabeisImovelResponse() {
        return new RetornaDadosContabeisImovelResponse();
    }

    /**
     * Create an instance of {@link ProcessarInventarioMovel }
     * 
     */
    public ProcessarInventarioMovel createProcessarInventarioMovel() {
        return new ProcessarInventarioMovel();
    }

    /**
     * Create an instance of {@link RetornoListaX003CDadosContabeisEstornoDTOX003E }
     * 
     */
    public RetornoListaX003CDadosContabeisEstornoDTOX003E createRetornoListaX003CDadosContabeisEstornoDTOX003E() {
        return new RetornoListaX003CDadosContabeisEstornoDTOX003E();
    }

    /**
     * Create an instance of {@link RetornoListaX003CDadosContabeisDTOX003E }
     * 
     */
    public RetornoListaX003CDadosContabeisDTOX003E createRetornoListaX003CDadosContabeisDTOX003E() {
        return new RetornoListaX003CDadosContabeisDTOX003E();
    }

    /**
     * Create an instance of {@link ProcessarNumeroDocumentoContabil }
     * 
     */
    public ProcessarNumeroDocumentoContabil createProcessarNumeroDocumentoContabil() {
        return new ProcessarNumeroDocumentoContabil();
    }

    /**
     * Create an instance of {@link ArrayOfInventarioMovelItemDTO }
     * 
     */
    public ArrayOfInventarioMovelItemDTO createArrayOfInventarioMovelItemDTO() {
        return new ArrayOfInventarioMovelItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarInventarioMovelResponse }
     * 
     */
    public ProcessarInventarioMovelResponse createProcessarInventarioMovelResponse() {
        return new ProcessarInventarioMovelResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InventarioMovelDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "InventarioMovelDTO")
    public JAXBElement<InventarioMovelDTO> createInventarioMovelDTO(InventarioMovelDTO value) {
        return new JAXBElement<InventarioMovelDTO>(_InventarioMovelDTO_QNAME, InventarioMovelDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CInventarioMovelDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_InventarioMovelDTO_x003E_")
    public JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> createRetornoListaX003CInventarioMovelDTOX003E(RetornoListaX003CInventarioMovelDTOX003E value) {
        return new JAXBElement<RetornoListaX003CInventarioMovelDTOX003E>(_RetornoListaX003CInventarioMovelDTOX003E_QNAME, RetornoListaX003CInventarioMovelDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosContabeisEstornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DadosContabeisEstornoDTO")
    public JAXBElement<DadosContabeisEstornoDTO> createDadosContabeisEstornoDTO(DadosContabeisEstornoDTO value) {
        return new JAXBElement<DadosContabeisEstornoDTO>(_DadosContabeisEstornoDTO_QNAME, DadosContabeisEstornoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisEstornoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_DadosContabeisEstornoDTO_x003E_")
    public JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> createRetornoListaX003CDadosContabeisEstornoDTOX003E(RetornoListaX003CDadosContabeisEstornoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E>(_RetornoListaX003CDadosContabeisEstornoDTOX003E_QNAME, RetornoListaX003CDadosContabeisEstornoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosContabeisDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DadosContabeisDTO")
    public JAXBElement<DadosContabeisDTO> createDadosContabeisDTO(DadosContabeisDTO value) {
        return new JAXBElement<DadosContabeisDTO>(_DadosContabeisDTO_QNAME, DadosContabeisDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNumeroDocumentoContabilDTO")
    public JAXBElement<ArrayOfNumeroDocumentoContabilDTO> createArrayOfNumeroDocumentoContabilDTO(ArrayOfNumeroDocumentoContabilDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoContabilDTO>(_ArrayOfNumeroDocumentoContabilDTO_QNAME, ArrayOfNumeroDocumentoContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_DadosContabeisDTO_x003E_")
    public JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> createRetornoListaX003CDadosContabeisDTOX003E(RetornoListaX003CDadosContabeisDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisDTOX003E>(_RetornoListaX003CDadosContabeisDTOX003E_QNAME, RetornoListaX003CDadosContabeisDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroDocumentoContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NumeroDocumentoContabilDTO")
    public JAXBElement<NumeroDocumentoContabilDTO> createNumeroDocumentoContabilDTO(NumeroDocumentoContabilDTO value) {
        return new JAXBElement<NumeroDocumentoContabilDTO>(_NumeroDocumentoContabilDTO_QNAME, NumeroDocumentoContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosContabeisEstornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDadosContabeisEstornoDTO")
    public JAXBElement<ArrayOfDadosContabeisEstornoDTO> createArrayOfDadosContabeisEstornoDTO(ArrayOfDadosContabeisEstornoDTO value) {
        return new JAXBElement<ArrayOfDadosContabeisEstornoDTO>(_ArrayOfDadosContabeisEstornoDTO_QNAME, ArrayOfDadosContabeisEstornoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfInventarioMovelItemDTO")
    public JAXBElement<ArrayOfInventarioMovelItemDTO> createArrayOfInventarioMovelItemDTO(ArrayOfInventarioMovelItemDTO value) {
        return new JAXBElement<ArrayOfInventarioMovelItemDTO>(_ArrayOfInventarioMovelItemDTO_QNAME, ArrayOfInventarioMovelItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosContabeisDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDadosContabeisDTO")
    public JAXBElement<ArrayOfDadosContabeisDTO> createArrayOfDadosContabeisDTO(ArrayOfDadosContabeisDTO value) {
        return new JAXBElement<ArrayOfDadosContabeisDTO>(_ArrayOfDadosContabeisDTO_QNAME, ArrayOfDadosContabeisDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InventarioMovelItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "InventarioMovelItemDTO")
    public JAXBElement<InventarioMovelItemDTO> createInventarioMovelItemDTO(InventarioMovelItemDTO value) {
        return new JAXBElement<InventarioMovelItemDTO>(_InventarioMovelItemDTO_QNAME, InventarioMovelItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfInventarioMovelDTO")
    public JAXBElement<ArrayOfInventarioMovelDTO> createArrayOfInventarioMovelDTO(ArrayOfInventarioMovelDTO value) {
        return new JAXBElement<ArrayOfInventarioMovelDTO>(_ArrayOfInventarioMovelDTO_QNAME, ArrayOfInventarioMovelDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdInventarioSelecionado", scope = RetornarInventarioMovel.class)
    public JAXBElement<String> createRetornarInventarioMovelSCdInventarioSelecionado(String value) {
        return new JAXBElement<String>(_RetornarInventarioMovelSCdInventarioSelecionado_QNAME, String.class, RetornarInventarioMovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sVlAnoExercicio", scope = DadosContabeisEstornoDTO.class)
    public JAXBElement<String> createDadosContabeisEstornoDTOSVlAnoExercicio(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSVlAnoExercicio_QNAME, String.class, DadosContabeisEstornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = DadosContabeisEstornoDTO.class)
    public JAXBElement<String> createDadosContabeisEstornoDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSDsJustificativa_QNAME, String.class, DadosContabeisEstornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumentoContabil", scope = DadosContabeisEstornoDTO.class)
    public JAXBElement<String> createDadosContabeisEstornoDTOSCdDocumentoContabil(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSCdDocumentoContabil_QNAME, String.class, DadosContabeisEstornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGestaoOrigem", scope = DadosContabeisEstornoDTO.class)
    public JAXBElement<String> createDadosContabeisEstornoDTOSDsGestaoOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSDsGestaoOrigem_QNAME, String.class, DadosContabeisEstornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUgOrigem", scope = DadosContabeisEstornoDTO.class)
    public JAXBElement<String> createDadosContabeisEstornoDTOSDsUgOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSDsUgOrigem_QNAME, String.class, DadosContabeisEstornoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarNumeroDocumentoContabilResult", scope = ProcessarNumeroDocumentoContabilResponse.class)
    public JAXBElement<RetornoDTO> createProcessarNumeroDocumentoContabilResponseProcessarNumeroDocumentoContabilResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarNumeroDocumentoContabilResponseProcessarNumeroDocumentoContabilResult_QNAME, RetornoDTO.class, ProcessarNumeroDocumentoContabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornaDadosContabeisImovelResult", scope = RetornaDadosContabeisImovelResponse.class)
    public JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> createRetornaDadosContabeisImovelResponseRetornaDadosContabeisImovelResult(RetornoListaX003CDadosContabeisDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisDTOX003E>(_RetornaDadosContabeisImovelResponseRetornaDadosContabeisImovelResult_QNAME, RetornoListaX003CDadosContabeisDTOX003E.class, RetornaDadosContabeisImovelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDtExercicio", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDtExercicio(String value) {
        return new JAXBElement<String>(_DadosContabeisDTOSDtExercicio_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUgDestino", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDsUgDestino(String value) {
        return new JAXBElement<String>(_DadosContabeisDTOSDsUgDestino_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGestaoDestino", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDsGestaoDestino(String value) {
        return new JAXBElement<String>(_DadosContabeisDTOSDsGestaoDestino_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAcaoContabil", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDsAcaoContabil(String value) {
        return new JAXBElement<String>(_DadosContabeisDTOSDsAcaoContabil_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCategoria", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSCdCategoria(String value) {
        return new JAXBElement<String>(_DadosContabeisDTOSCdCategoria_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGestaoOrigem", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDsGestaoOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSDsGestaoOrigem_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUgOrigem", scope = DadosContabeisDTO.class)
    public JAXBElement<String> createDadosContabeisDTOSDsUgOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisEstornoDTOSDsUgOrigem_QNAME, String.class, DadosContabeisDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdUsuaioErp", scope = ProcessarMudancaResponsavel.class)
    public JAXBElement<String> createProcessarMudancaResponsavelSCdUsuaioErp(String value) {
        return new JAXBElement<String>(_ProcessarMudancaResponsavelSCdUsuaioErp_QNAME, String.class, ProcessarMudancaResponsavel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstIventarioMovelDTO", scope = ProcessarInventarioMovel.class)
    public JAXBElement<ArrayOfInventarioMovelDTO> createProcessarInventarioMovelLstIventarioMovelDTO(ArrayOfInventarioMovelDTO value) {
        return new JAXBElement<ArrayOfInventarioMovelDTO>(_ProcessarInventarioMovelLstIventarioMovelDTO_QNAME, ArrayOfInventarioMovelDTO.class, ProcessarInventarioMovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CInventarioMovelDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarInventarioMovelResult", scope = RetornarInventarioMovelResponse.class)
    public JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> createRetornarInventarioMovelResponseRetornarInventarioMovelResult(RetornoListaX003CInventarioMovelDTOX003E value) {
        return new JAXBElement<RetornoListaX003CInventarioMovelDTOX003E>(_RetornarInventarioMovelResponseRetornarInventarioMovelResult_QNAME, RetornoListaX003CInventarioMovelDTOX003E.class, RetornarInventarioMovelResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornaDadosContabeisMovelResult", scope = RetornaDadosContabeisMovelResponse.class)
    public JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> createRetornaDadosContabeisMovelResponseRetornaDadosContabeisMovelResult(RetornoListaX003CDadosContabeisDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisDTOX003E>(_RetornaDadosContabeisMovelResponseRetornaDadosContabeisMovelResult_QNAME, RetornoListaX003CDadosContabeisDTOX003E.class, RetornaDadosContabeisMovelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = InventarioMovelItemDTO.class)
    public JAXBElement<String> createInventarioMovelItemDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_InventarioMovelItemDTOSDsObservacao_QNAME, String.class, InventarioMovelItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTombamento", scope = InventarioMovelItemDTO.class)
    public JAXBElement<String> createInventarioMovelItemDTOSNrTombamento(String value) {
        return new JAXBElement<String>(_InventarioMovelItemDTOSNrTombamento_QNAME, String.class, InventarioMovelItemDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstNumeroDocumentoContabilDTO", scope = ProcessarNumeroDocumentoContabil.class)
    public JAXBElement<ArrayOfNumeroDocumentoContabilDTO> createProcessarNumeroDocumentoContabilLstNumeroDocumentoContabilDTO(ArrayOfNumeroDocumentoContabilDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoContabilDTO>(_ProcessarNumeroDocumentoContabilLstNumeroDocumentoContabilDTO_QNAME, ArrayOfNumeroDocumentoContabilDTO.class, ProcessarNumeroDocumentoContabil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstInventarioItem", scope = InventarioMovelDTO.class)
    public JAXBElement<ArrayOfInventarioMovelItemDTO> createInventarioMovelDTOLstInventarioItem(ArrayOfInventarioMovelItemDTO value) {
        return new JAXBElement<ArrayOfInventarioMovelItemDTO>(_InventarioMovelDTOLstInventarioItem_QNAME, ArrayOfInventarioMovelItemDTO.class, InventarioMovelDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsInventario", scope = InventarioMovelDTO.class)
    public JAXBElement<String> createInventarioMovelDTOSDsInventario(String value) {
        return new JAXBElement<String>(_InventarioMovelDTOSDsInventario_QNAME, String.class, InventarioMovelDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarMudancaResponsavelResult", scope = ProcessarMudancaResponsavelResponse.class)
    public JAXBElement<RetornoDTO> createProcessarMudancaResponsavelResponseProcessarMudancaResponsavelResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarMudancaResponsavelResponseProcessarMudancaResponsavelResult_QNAME, RetornoDTO.class, ProcessarMudancaResponsavelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisEstornoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornaDadosContabeisEstornoResult", scope = RetornaDadosContabeisEstornoResponse.class)
    public JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> createRetornaDadosContabeisEstornoResponseRetornaDadosContabeisEstornoResult(RetornoListaX003CDadosContabeisEstornoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E>(_RetornaDadosContabeisEstornoResponseRetornaDadosContabeisEstornoResult_QNAME, RetornoListaX003CDadosContabeisEstornoDTOX003E.class, RetornaDadosContabeisEstornoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarInventarioMovelResult", scope = ProcessarInventarioMovelResponse.class)
    public JAXBElement<RetornoDTO> createProcessarInventarioMovelResponseProcessarInventarioMovelResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarInventarioMovelResponseProcessarInventarioMovelResult_QNAME, RetornoDTO.class, ProcessarInventarioMovelResponse.class, value);
    }

}
