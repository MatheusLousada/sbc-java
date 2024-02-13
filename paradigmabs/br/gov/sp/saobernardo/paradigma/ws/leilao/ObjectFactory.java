
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.leilao package. 
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

    private final static QName _ArrayOfProcessoLeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProcessoLeilaoDTO");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfConfirmacaoNegociacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfConfirmacaoNegociacaoItemDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _LeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoDTO");
    private final static QName _LeilaoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoItemEnderecoDTO");
    private final static QName _ArrayOfConfirmacaoNegociacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfConfirmacaoNegociacaoDTO");
    private final static QName _ConfirmacaoNegociacaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ConfirmacaoNegociacaoItemDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfLeilaoLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoLanceDTO");
    private final static QName _LeilaoLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoLanceDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfLeilaoParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoParticipanteDTO");
    private final static QName _ArrayOfLeilaoItemParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoItemParticipanteDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfLeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _ProcessoLeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProcessoLeilaoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _LeilaoParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoParticipanteDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _LeilaoItemParticipanteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoItemParticipanteDTO");
    private final static QName _LeilaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LeilaoItemDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfLeilaoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoItemDTO");
    private final static QName _ConfirmacaoNegociacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ConfirmacaoNegociacaoDTO");
    private final static QName _ArrayOfLeilaoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLeilaoItemEnderecoDTO");
    private final static QName _LeilaoItemEnderecoDTOSCdEmpresaCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCobrancaEndereco");
    private final static QName _LeilaoItemEnderecoDTOSCdCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCobrancaEndereco");
    private final static QName _LeilaoItemEnderecoDTOSCdEmpresaEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEntregaEndereco");
    private final static QName _LeilaoItemEnderecoDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _LeilaoItemEnderecoDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _LeilaoItemEnderecoDTOSCdEmpresaFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFaturamentoEndereco");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _ProcessarLeilaoLstLeilao_QNAME = new QName("http://tempuri.org/", "lstLeilao");
    private final static QName _RetornarLeilaoResponseRetornarLeilaoResult_QNAME = new QName("http://tempuri.org/", "RetornarLeilaoResult");
    private final static QName _LeilaoItemDTOSCdCondicaoPagamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCondicaoPagamento");
    private final static QName _LeilaoItemDTOSCdItemWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemWbc");
    private final static QName _ProcessarLeilaoResponseProcessarLeilaoResult_QNAME = new QName("http://tempuri.org/", "ProcessarLeilaoResult");
    private final static QName _LeilaoLanceDTOSDsMotivoDesclassificado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsMotivoDesclassificado");
    private final static QName _HabilitarRetornarLeilaoLstConfirmacaoNegociacaoDTO_QNAME = new QName("http://tempuri.org/", "lstConfirmacaoNegociacaoDTO");
    private final static QName _LeilaoDTOSCdEmpresaRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaRequisicao");
    private final static QName _LeilaoDTOSDsTermo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsTermo");
    private final static QName _LeilaoDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _LeilaoDTOSCdLeilaoErp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLeilaoErp");
    private final static QName _LeilaoDTOSCdLeilaoWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLeilaoWbc");
    private final static QName _ProcessoLeilaoDTOSCdLeilaoWBC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLeilaoWBC");
    private final static QName _HabilitarRetornarLeilaoResponseHabilitarRetornarLeilaoResult_QNAME = new QName("http://tempuri.org/", "HabilitarRetornarLeilaoResult");
    private final static QName _RetornarLeilaoComEmpresaSemDeParaResponseRetornarLeilaoComEmpresaSemDeParaResult_QNAME = new QName("http://tempuri.org/", "RetornarLeilaoComEmpresaSemDeParaResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.leilao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProcessoLeilaoDTO }
     * 
     */
    public ArrayOfProcessoLeilaoDTO createArrayOfProcessoLeilaoDTO() {
        return new ArrayOfProcessoLeilaoDTO();
    }

    /**
     * Create an instance of {@link ProcessarLeilaoResponse }
     * 
     */
    public ProcessarLeilaoResponse createProcessarLeilaoResponse() {
        return new ProcessarLeilaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoParticipanteDTO }
     * 
     */
    public ArrayOfLeilaoParticipanteDTO createArrayOfLeilaoParticipanteDTO() {
        return new ArrayOfLeilaoParticipanteDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarLeilao }
     * 
     */
    public HabilitarRetornarLeilao createHabilitarRetornarLeilao() {
        return new HabilitarRetornarLeilao();
    }

    /**
     * Create an instance of {@link ConfirmacaoNegociacaoDTO }
     * 
     */
    public ConfirmacaoNegociacaoDTO createConfirmacaoNegociacaoDTO() {
        return new ConfirmacaoNegociacaoDTO();
    }

    /**
     * Create an instance of {@link ProcessoLeilaoDTO }
     * 
     */
    public ProcessoLeilaoDTO createProcessoLeilaoDTO() {
        return new ProcessoLeilaoDTO();
    }

    /**
     * Create an instance of {@link RetornarLeilaoComEmpresaSemDePara }
     * 
     */
    public RetornarLeilaoComEmpresaSemDePara createRetornarLeilaoComEmpresaSemDePara() {
        return new RetornarLeilaoComEmpresaSemDePara();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link RetornarLeilao }
     * 
     */
    public RetornarLeilao createRetornarLeilao() {
        return new RetornarLeilao();
    }

    /**
     * Create an instance of {@link LeilaoParticipanteDTO }
     * 
     */
    public LeilaoParticipanteDTO createLeilaoParticipanteDTO() {
        return new LeilaoParticipanteDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoItemParticipanteDTO }
     * 
     */
    public ArrayOfLeilaoItemParticipanteDTO createArrayOfLeilaoItemParticipanteDTO() {
        return new ArrayOfLeilaoItemParticipanteDTO();
    }

    /**
     * Create an instance of {@link ArrayOfConfirmacaoNegociacaoItemDTO }
     * 
     */
    public ArrayOfConfirmacaoNegociacaoItemDTO createArrayOfConfirmacaoNegociacaoItemDTO() {
        return new ArrayOfConfirmacaoNegociacaoItemDTO();
    }

    /**
     * Create an instance of {@link LeilaoItemEnderecoDTO }
     * 
     */
    public LeilaoItemEnderecoDTO createLeilaoItemEnderecoDTO() {
        return new LeilaoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoLanceDTO }
     * 
     */
    public ArrayOfLeilaoLanceDTO createArrayOfLeilaoLanceDTO() {
        return new ArrayOfLeilaoLanceDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoItemEnderecoDTO }
     * 
     */
    public ArrayOfLeilaoItemEnderecoDTO createArrayOfLeilaoItemEnderecoDTO() {
        return new ArrayOfLeilaoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ProcessarLeilao }
     * 
     */
    public ProcessarLeilao createProcessarLeilao() {
        return new ProcessarLeilao();
    }

    /**
     * Create an instance of {@link ConfirmacaoNegociacaoItemDTO }
     * 
     */
    public ConfirmacaoNegociacaoItemDTO createConfirmacaoNegociacaoItemDTO() {
        return new ConfirmacaoNegociacaoItemDTO();
    }

    /**
     * Create an instance of {@link RetornarLeilaoResponse }
     * 
     */
    public RetornarLeilaoResponse createRetornarLeilaoResponse() {
        return new RetornarLeilaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConfirmacaoNegociacaoDTO }
     * 
     */
    public ArrayOfConfirmacaoNegociacaoDTO createArrayOfConfirmacaoNegociacaoDTO() {
        return new ArrayOfConfirmacaoNegociacaoDTO();
    }

    /**
     * Create an instance of {@link LeilaoItemDTO }
     * 
     */
    public LeilaoItemDTO createLeilaoItemDTO() {
        return new LeilaoItemDTO();
    }

    /**
     * Create an instance of {@link LeilaoLanceDTO }
     * 
     */
    public LeilaoLanceDTO createLeilaoLanceDTO() {
        return new LeilaoLanceDTO();
    }

    /**
     * Create an instance of {@link LeilaoDTO }
     * 
     */
    public LeilaoDTO createLeilaoDTO() {
        return new LeilaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoItemDTO }
     * 
     */
    public ArrayOfLeilaoItemDTO createArrayOfLeilaoItemDTO() {
        return new ArrayOfLeilaoItemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLeilaoDTO }
     * 
     */
    public ArrayOfLeilaoDTO createArrayOfLeilaoDTO() {
        return new ArrayOfLeilaoDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarLeilaoResponse }
     * 
     */
    public HabilitarRetornarLeilaoResponse createHabilitarRetornarLeilaoResponse() {
        return new HabilitarRetornarLeilaoResponse();
    }

    /**
     * Create an instance of {@link RetornarLeilaoComEmpresaSemDeParaResponse }
     * 
     */
    public RetornarLeilaoComEmpresaSemDeParaResponse createRetornarLeilaoComEmpresaSemDeParaResponse() {
        return new RetornarLeilaoComEmpresaSemDeParaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link LeilaoItemParticipanteDTO }
     * 
     */
    public LeilaoItemParticipanteDTO createLeilaoItemParticipanteDTO() {
        return new LeilaoItemParticipanteDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProcessoLeilaoDTO")
    public JAXBElement<ArrayOfProcessoLeilaoDTO> createArrayOfProcessoLeilaoDTO(ArrayOfProcessoLeilaoDTO value) {
        return new JAXBElement<ArrayOfProcessoLeilaoDTO>(_ArrayOfProcessoLeilaoDTO_QNAME, ArrayOfProcessoLeilaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfConfirmacaoNegociacaoItemDTO")
    public JAXBElement<ArrayOfConfirmacaoNegociacaoItemDTO> createArrayOfConfirmacaoNegociacaoItemDTO(ArrayOfConfirmacaoNegociacaoItemDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoItemDTO>(_ArrayOfConfirmacaoNegociacaoItemDTO_QNAME, ArrayOfConfirmacaoNegociacaoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoDTO")
    public JAXBElement<LeilaoDTO> createLeilaoDTO(LeilaoDTO value) {
        return new JAXBElement<LeilaoDTO>(_LeilaoDTO_QNAME, LeilaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoItemEnderecoDTO")
    public JAXBElement<LeilaoItemEnderecoDTO> createLeilaoItemEnderecoDTO(LeilaoItemEnderecoDTO value) {
        return new JAXBElement<LeilaoItemEnderecoDTO>(_LeilaoItemEnderecoDTO_QNAME, LeilaoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfConfirmacaoNegociacaoDTO")
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createArrayOfConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_ArrayOfConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmacaoNegociacaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ConfirmacaoNegociacaoItemDTO")
    public JAXBElement<ConfirmacaoNegociacaoItemDTO> createConfirmacaoNegociacaoItemDTO(ConfirmacaoNegociacaoItemDTO value) {
        return new JAXBElement<ConfirmacaoNegociacaoItemDTO>(_ConfirmacaoNegociacaoItemDTO_QNAME, ConfirmacaoNegociacaoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoLanceDTO")
    public JAXBElement<ArrayOfLeilaoLanceDTO> createArrayOfLeilaoLanceDTO(ArrayOfLeilaoLanceDTO value) {
        return new JAXBElement<ArrayOfLeilaoLanceDTO>(_ArrayOfLeilaoLanceDTO_QNAME, ArrayOfLeilaoLanceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoLanceDTO")
    public JAXBElement<LeilaoLanceDTO> createLeilaoLanceDTO(LeilaoLanceDTO value) {
        return new JAXBElement<LeilaoLanceDTO>(_LeilaoLanceDTO_QNAME, LeilaoLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoParticipanteDTO")
    public JAXBElement<ArrayOfLeilaoParticipanteDTO> createArrayOfLeilaoParticipanteDTO(ArrayOfLeilaoParticipanteDTO value) {
        return new JAXBElement<ArrayOfLeilaoParticipanteDTO>(_ArrayOfLeilaoParticipanteDTO_QNAME, ArrayOfLeilaoParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoItemParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoItemParticipanteDTO")
    public JAXBElement<ArrayOfLeilaoItemParticipanteDTO> createArrayOfLeilaoItemParticipanteDTO(ArrayOfLeilaoItemParticipanteDTO value) {
        return new JAXBElement<ArrayOfLeilaoItemParticipanteDTO>(_ArrayOfLeilaoItemParticipanteDTO_QNAME, ArrayOfLeilaoItemParticipanteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoDTO")
    public JAXBElement<ArrayOfLeilaoDTO> createArrayOfLeilaoDTO(ArrayOfLeilaoDTO value) {
        return new JAXBElement<ArrayOfLeilaoDTO>(_ArrayOfLeilaoDTO_QNAME, ArrayOfLeilaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessoLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProcessoLeilaoDTO")
    public JAXBElement<ProcessoLeilaoDTO> createProcessoLeilaoDTO(ProcessoLeilaoDTO value) {
        return new JAXBElement<ProcessoLeilaoDTO>(_ProcessoLeilaoDTO_QNAME, ProcessoLeilaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoParticipanteDTO")
    public JAXBElement<LeilaoParticipanteDTO> createLeilaoParticipanteDTO(LeilaoParticipanteDTO value) {
        return new JAXBElement<LeilaoParticipanteDTO>(_LeilaoParticipanteDTO_QNAME, LeilaoParticipanteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoItemParticipanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoItemParticipanteDTO")
    public JAXBElement<LeilaoItemParticipanteDTO> createLeilaoItemParticipanteDTO(LeilaoItemParticipanteDTO value) {
        return new JAXBElement<LeilaoItemParticipanteDTO>(_LeilaoItemParticipanteDTO_QNAME, LeilaoItemParticipanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeilaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LeilaoItemDTO")
    public JAXBElement<LeilaoItemDTO> createLeilaoItemDTO(LeilaoItemDTO value) {
        return new JAXBElement<LeilaoItemDTO>(_LeilaoItemDTO_QNAME, LeilaoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoItemDTO")
    public JAXBElement<ArrayOfLeilaoItemDTO> createArrayOfLeilaoItemDTO(ArrayOfLeilaoItemDTO value) {
        return new JAXBElement<ArrayOfLeilaoItemDTO>(_ArrayOfLeilaoItemDTO_QNAME, ArrayOfLeilaoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ConfirmacaoNegociacaoDTO")
    public JAXBElement<ConfirmacaoNegociacaoDTO> createConfirmacaoNegociacaoDTO(ConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ConfirmacaoNegociacaoDTO>(_ConfirmacaoNegociacaoDTO_QNAME, ConfirmacaoNegociacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLeilaoItemEnderecoDTO")
    public JAXBElement<ArrayOfLeilaoItemEnderecoDTO> createArrayOfLeilaoItemEnderecoDTO(ArrayOfLeilaoItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfLeilaoItemEnderecoDTO>(_ArrayOfLeilaoItemEnderecoDTO_QNAME, ArrayOfLeilaoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCobrancaEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdEmpresaCobrancaEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdEmpresaCobrancaEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdCobrancaEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdEmpresaEntregaEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdEntregaEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdFaturamentoEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = LeilaoItemEnderecoDTO.class)
    public JAXBElement<String> createLeilaoItemEnderecoDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_LeilaoItemEnderecoDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, LeilaoItemEnderecoDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLeilao", scope = ProcessarLeilao.class)
    public JAXBElement<ArrayOfLeilaoDTO> createProcessarLeilaoLstLeilao(ArrayOfLeilaoDTO value) {
        return new JAXBElement<ArrayOfLeilaoDTO>(_ProcessarLeilaoLstLeilao_QNAME, ArrayOfLeilaoDTO.class, ProcessarLeilao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarLeilaoResult", scope = RetornarLeilaoResponse.class)
    public JAXBElement<ArrayOfLeilaoDTO> createRetornarLeilaoResponseRetornarLeilaoResult(ArrayOfLeilaoDTO value) {
        return new JAXBElement<ArrayOfLeilaoDTO>(_RetornarLeilaoResponseRetornarLeilaoResult_QNAME, ArrayOfLeilaoDTO.class, RetornarLeilaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCondicaoPagamento", scope = LeilaoItemDTO.class)
    public JAXBElement<String> createLeilaoItemDTOSCdCondicaoPagamento(String value) {
        return new JAXBElement<String>(_LeilaoItemDTOSCdCondicaoPagamento_QNAME, String.class, LeilaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemWbc", scope = LeilaoItemDTO.class)
    public JAXBElement<String> createLeilaoItemDTOSCdItemWbc(String value) {
        return new JAXBElement<String>(_LeilaoItemDTOSCdItemWbc_QNAME, String.class, LeilaoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarLeilaoResult", scope = ProcessarLeilaoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarLeilaoResponseProcessarLeilaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarLeilaoResponseProcessarLeilaoResult_QNAME, RetornoDTO.class, ProcessarLeilaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMotivoDesclassificado", scope = LeilaoLanceDTO.class)
    public JAXBElement<String> createLeilaoLanceDTOSDsMotivoDesclassificado(String value) {
        return new JAXBElement<String>(_LeilaoLanceDTOSDsMotivoDesclassificado_QNAME, String.class, LeilaoLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstConfirmacaoNegociacaoDTO", scope = HabilitarRetornarLeilao.class)
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> createHabilitarRetornarLeilaoLstConfirmacaoNegociacaoDTO(ArrayOfConfirmacaoNegociacaoDTO value) {
        return new JAXBElement<ArrayOfConfirmacaoNegociacaoDTO>(_HabilitarRetornarLeilaoLstConfirmacaoNegociacaoDTO_QNAME, ArrayOfConfirmacaoNegociacaoDTO.class, HabilitarRetornarLeilao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaRequisicao", scope = LeilaoDTO.class)
    public JAXBElement<String> createLeilaoDTOSCdEmpresaRequisicao(String value) {
        return new JAXBElement<String>(_LeilaoDTOSCdEmpresaRequisicao_QNAME, String.class, LeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsTermo", scope = LeilaoDTO.class)
    public JAXBElement<String> createLeilaoDTOSDsTermo(String value) {
        return new JAXBElement<String>(_LeilaoDTOSDsTermo_QNAME, String.class, LeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = LeilaoDTO.class)
    public JAXBElement<String> createLeilaoDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_LeilaoDTOSCdEmpresa_QNAME, String.class, LeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLeilaoErp", scope = LeilaoDTO.class)
    public JAXBElement<String> createLeilaoDTOSCdLeilaoErp(String value) {
        return new JAXBElement<String>(_LeilaoDTOSCdLeilaoErp_QNAME, String.class, LeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLeilaoWbc", scope = LeilaoDTO.class)
    public JAXBElement<String> createLeilaoDTOSCdLeilaoWbc(String value) {
        return new JAXBElement<String>(_LeilaoDTOSCdLeilaoWbc_QNAME, String.class, LeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLeilaoWBC", scope = ProcessoLeilaoDTO.class)
    public JAXBElement<String> createProcessoLeilaoDTOSCdLeilaoWBC(String value) {
        return new JAXBElement<String>(_ProcessoLeilaoDTOSCdLeilaoWBC_QNAME, String.class, ProcessoLeilaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HabilitarRetornarLeilaoResult", scope = HabilitarRetornarLeilaoResponse.class)
    public JAXBElement<RetornoDTO> createHabilitarRetornarLeilaoResponseHabilitarRetornarLeilaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_HabilitarRetornarLeilaoResponseHabilitarRetornarLeilaoResult_QNAME, RetornoDTO.class, HabilitarRetornarLeilaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarLeilaoComEmpresaSemDeParaResult", scope = RetornarLeilaoComEmpresaSemDeParaResponse.class)
    public JAXBElement<ArrayOfProcessoLeilaoDTO> createRetornarLeilaoComEmpresaSemDeParaResponseRetornarLeilaoComEmpresaSemDeParaResult(ArrayOfProcessoLeilaoDTO value) {
        return new JAXBElement<ArrayOfProcessoLeilaoDTO>(_RetornarLeilaoComEmpresaSemDeParaResponseRetornarLeilaoComEmpresaSemDeParaResult_QNAME, ArrayOfProcessoLeilaoDTO.class, RetornarLeilaoComEmpresaSemDeParaResponse.class, value);
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

}
