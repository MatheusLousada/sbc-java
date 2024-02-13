
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.almoxarifado package. 
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

    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _AlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AlmoxarifadoDTO");
    private final static QName _AtestoDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AtestoDocumentoHabilDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfAmxKardexDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAmxKardexDTO");
    private final static QName _SequencialDocumentoOrigemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "SequencialDocumentoOrigemDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_DadosContabeisAlmoxarifadoDTO_x003E_");
    private final static QName _SequencialDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "SequencialDocumentoHabilDTO");
    private final static QName _ArrayOfDadosContabeisAlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDadosContabeisAlmoxarifadoDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfAlmoxarifadoDocaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAlmoxarifadoDocaDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _AlmoxarifadoDocaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AlmoxarifadoDocaDTO");
    private final static QName _AmxKardexFiltroDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AmxKardexFiltroDTO");
    private final static QName _ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO");
    private final static QName _DadosContabeisAlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DadosContabeisAlmoxarifadoDTO");
    private final static QName _ArrayOfAlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAlmoxarifadoDTO");
    private final static QName _ArrayOfExcluirDocumentoOrigemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfExcluirDocumentoOrigemDTO");
    private final static QName _NumeroDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NumeroDocumentoHabilDTO");
    private final static QName _DocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DocumentoHabilDTO");
    private final static QName _ExcluirDocumentoOrigemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ExcluirDocumentoOrigemDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AmxKardexDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AmxKardexDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _NumeroDocumentoContabilAlmoxarifadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NumeroDocumentoContabilAlmoxarifadoDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _RetornoListaX003CDocumentoHabilDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_DocumentoHabilDTO_x003E_");
    private final static QName _RetornoListaX003CAmxKardexDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_AmxKardexDTO_x003E_");
    private final static QName _ArrayOfNumeroDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfNumeroDocumentoHabilDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _RetornoListaX003CAtestoDocumentoHabilDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_AtestoDocumentoHabilDTO_x003E_");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDocumentoHabilDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfRetornoAtestoDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfRetornoAtestoDocumentoHabilDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _RetornoListaX003CAlmoxarifadoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_AlmoxarifadoDTO_x003E_");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfSequencialDocumentoOrigemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfSequencialDocumentoOrigemDTO");
    private final static QName _ArrayOfAtestoDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAtestoDocumentoHabilDTO");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _RetornoListaX003CExcluirDocumentoOrigemDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_ExcluirDocumentoOrigemDTO_x003E_");
    private final static QName _RetornoAtestoDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoAtestoDocumentoHabilDTO");
    private final static QName _ArrayOfSequencialDocumentoHabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfSequencialDocumentoHabilDTO");
    private final static QName _ProcessarAlmoxarifadoLstAlmoxarifado_QNAME = new QName("http://tempuri.org/", "lstAlmoxarifado");
    private final static QName _RetornarAlmoxarifadoResponseRetornarAlmoxarifadoResult_QNAME = new QName("http://tempuri.org/", "RetornarAlmoxarifadoResult");
    private final static QName _ConfirmarProcessamentoMovimentacaoResponseConfirmarProcessamentoMovimentacaoResult_QNAME = new QName("http://tempuri.org/", "ConfirmarProcessamentoMovimentacaoResult");
    private final static QName _ProcessarSequencialDocumentoOrigemResponseProcessarSequencialDocumentoOrigemResult_QNAME = new QName("http://tempuri.org/", "ProcessarSequencialDocumentoOrigemResult");
    private final static QName _AlmoxarifadoDTOLstAlmoxarifadoDoca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstAlmoxarifadoDoca");
    private final static QName _AlmoxarifadoDTOSCdUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuario");
    private final static QName _AlmoxarifadoDTOSSgAlmoxarifado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgAlmoxarifado");
    private final static QName _RetornarAcaoContabilResponseRetornarAcaoContabilResult_QNAME = new QName("http://tempuri.org/", "RetornarAcaoContabilResult");
    private final static QName _ProcessaNumeroDocumentoHabilResponseProcessaNumeroDocumentoHabilResult_QNAME = new QName("http://tempuri.org/", "ProcessaNumeroDocumentoHabilResult");
    private final static QName _ProcessarNumeroDocumentoContabilAlmoxarifadoResponseProcessarNumeroDocumentoContabilAlmoxarifadoResult_QNAME = new QName("http://tempuri.org/", "ProcessarNumeroDocumentoContabilAlmoxarifadoResult");
    private final static QName _RetornarMovimentacaoResponseRetornarMovimentacaoResult_QNAME = new QName("http://tempuri.org/", "RetornarMovimentacaoResult");
    private final static QName _DocumentoHabilDTOSVlAnoExercicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sVlAnoExercicio");
    private final static QName _DocumentoHabilDTOSCdCnpjCpf_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCnpjCpf");
    private final static QName _DocumentoHabilDTOSNrSerie_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrSerie");
    private final static QName _DocumentoHabilDTOSNrDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrDocumento");
    private final static QName _DocumentoHabilDTOSCdGestao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGestao");
    private final static QName _DocumentoHabilDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _DocumentoHabilDTOSCdTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdTipoDocumento");
    private final static QName _DocumentoHabilDTONCdRecDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdRecDocumento");
    private final static QName _RetornarExcluirDocumentoOrigemResponseRetornarExcluirDocumentoOrigemResult_QNAME = new QName("http://tempuri.org/", "RetornarExcluirDocumentoOrigemResult");
    private final static QName _ProcessarAtestoDocumentoHabilResponseProcessarAtestoDocumentoHabilResult_QNAME = new QName("http://tempuri.org/", "ProcessarAtestoDocumentoHabilResult");
    private final static QName _AtestoDocumentoHabilDTOSCdDocumentoHabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDocumentoHabil");
    private final static QName _AtestoDocumentoHabilDTOSCdUnidadeGestora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUnidadeGestora");
    private final static QName _RetornarDocumentoHabilResponseRetornarDocumentoHabilResult_QNAME = new QName("http://tempuri.org/", "RetornarDocumentoHabilResult");
    private final static QName _ProcessarExcluirDocumentoOrigemResponseProcessarExcluirDocumentoOrigemResult_QNAME = new QName("http://tempuri.org/", "ProcessarExcluirDocumentoOrigemResult");
    private final static QName _NumeroDocumentoContabilAlmoxarifadoDTOSCdDocumentoContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDocumentoContabil");
    private final static QName _ProcessarNumeroDocumentoContabilAlmoxarifadoLstNumeroDocumentoContabilDTO_QNAME = new QName("http://tempuri.org/", "lstNumeroDocumentoContabilDTO");
    private final static QName _ProcessarExcluirDocumentoOrigemLstSequencialDocumentoOrigemDTO_QNAME = new QName("http://tempuri.org/", "lstSequencialDocumentoOrigemDTO");
    private final static QName _AlmoxarifadoDocaDTOSCdAlmoxarifadoDoca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAlmoxarifadoDoca");
    private final static QName _AlmoxarifadoDocaDTOSDsAlmoxarifadoDoca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAlmoxarifadoDoca");
    private final static QName _ProcessarSequencialDocumentoOrigemLstSequencialDocumentoHabilDTO_QNAME = new QName("http://tempuri.org/", "lstSequencialDocumentoHabilDTO");
    private final static QName _ProcessarAtestoDocumentoHabilLstAtestoDocumentoHabilDTO_QNAME = new QName("http://tempuri.org/", "lstAtestoDocumentoHabilDTO");
    private final static QName _RetornarAtestoDocumentoHabilResponseRetornarAtestoDocumentoHabilResult_QNAME = new QName("http://tempuri.org/", "RetornarAtestoDocumentoHabilResult");
    private final static QName _ConfirmarProcessamentoMovimentacaoLstCdKardec_QNAME = new QName("http://tempuri.org/", "lstCdKardec");
    private final static QName _ProcessaNumeroDocumentoHabilLstNumeroDocumentoHabilDTO_QNAME = new QName("http://tempuri.org/", "lstNumeroDocumentoHabilDTO");
    private final static QName _ExcluirDocumentoOrigemDTOSDsJustificativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsJustificativa");
    private final static QName _ProcessarAlmoxarifadoResponseProcessarAlmoxarifadoResult_QNAME = new QName("http://tempuri.org/", "ProcessarAlmoxarifadoResult");
    private final static QName _RetornarMovimentacaoOAmxKardexFiltroDTO_QNAME = new QName("http://tempuri.org/", "oAmxKardexFiltroDTO");
    private final static QName _DadosContabeisAlmoxarifadoDTOSDsAcaoContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAcaoContabil");
    private final static QName _DadosContabeisAlmoxarifadoDTOSCdCategoria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCategoria");
    private final static QName _DadosContabeisAlmoxarifadoDTOSDsGestaoOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsGestaoOrigem");
    private final static QName _DadosContabeisAlmoxarifadoDTOSDsUgOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUgOrigem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.almoxarifado
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarAlmoxarifadoResponse }
     * 
     */
    public RetornarAlmoxarifadoResponse createRetornarAlmoxarifadoResponse() {
        return new RetornarAlmoxarifadoResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link AlmoxarifadoDTO }
     * 
     */
    public AlmoxarifadoDTO createAlmoxarifadoDTO() {
        return new AlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link RetornarAcaoContabilResponse }
     * 
     */
    public RetornarAcaoContabilResponse createRetornarAcaoContabilResponse() {
        return new RetornarAcaoContabilResponse();
    }

    /**
     * Create an instance of {@link ProcessaNumeroDocumentoHabilResponse }
     * 
     */
    public ProcessaNumeroDocumentoHabilResponse createProcessaNumeroDocumentoHabilResponse() {
        return new ProcessaNumeroDocumentoHabilResponse();
    }

    /**
     * Create an instance of {@link ProcessarNumeroDocumentoContabilAlmoxarifadoResponse }
     * 
     */
    public ProcessarNumeroDocumentoContabilAlmoxarifadoResponse createProcessarNumeroDocumentoContabilAlmoxarifadoResponse() {
        return new ProcessarNumeroDocumentoContabilAlmoxarifadoResponse();
    }

    /**
     * Create an instance of {@link RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E }
     * 
     */
    public RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E createRetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E() {
        return new RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E();
    }

    /**
     * Create an instance of {@link ArrayOfNumeroDocumentoHabilDTO }
     * 
     */
    public ArrayOfNumeroDocumentoHabilDTO createArrayOfNumeroDocumentoHabilDTO() {
        return new ArrayOfNumeroDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link AtestoDocumentoHabilDTO }
     * 
     */
    public AtestoDocumentoHabilDTO createAtestoDocumentoHabilDTO() {
        return new AtestoDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfRetornoAtestoDocumentoHabilDTO }
     * 
     */
    public ArrayOfRetornoAtestoDocumentoHabilDTO createArrayOfRetornoAtestoDocumentoHabilDTO() {
        return new ArrayOfRetornoAtestoDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link RetornarExcluirDocumentoOrigem }
     * 
     */
    public RetornarExcluirDocumentoOrigem createRetornarExcluirDocumentoOrigem() {
        return new RetornarExcluirDocumentoOrigem();
    }

    /**
     * Create an instance of {@link ProcessarExcluirDocumentoOrigemResponse }
     * 
     */
    public ProcessarExcluirDocumentoOrigemResponse createProcessarExcluirDocumentoOrigemResponse() {
        return new ProcessarExcluirDocumentoOrigemResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSequencialDocumentoHabilDTO }
     * 
     */
    public ArrayOfSequencialDocumentoHabilDTO createArrayOfSequencialDocumentoHabilDTO() {
        return new ArrayOfSequencialDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoHabilDTO }
     * 
     */
    public ArrayOfDocumentoHabilDTO createArrayOfDocumentoHabilDTO() {
        return new ArrayOfDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfAlmoxarifadoDocaDTO }
     * 
     */
    public ArrayOfAlmoxarifadoDocaDTO createArrayOfAlmoxarifadoDocaDTO() {
        return new ArrayOfAlmoxarifadoDocaDTO();
    }

    /**
     * Create an instance of {@link NumeroDocumentoHabilDTO }
     * 
     */
    public NumeroDocumentoHabilDTO createNumeroDocumentoHabilDTO() {
        return new NumeroDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link NumeroDocumentoContabilAlmoxarifadoDTO }
     * 
     */
    public NumeroDocumentoContabilAlmoxarifadoDTO createNumeroDocumentoContabilAlmoxarifadoDTO() {
        return new NumeroDocumentoContabilAlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003CExcluirDocumentoOrigemDTOX003E }
     * 
     */
    public RetornoListaX003CExcluirDocumentoOrigemDTOX003E createRetornoListaX003CExcluirDocumentoOrigemDTOX003E() {
        return new RetornoListaX003CExcluirDocumentoOrigemDTOX003E();
    }

    /**
     * Create an instance of {@link RetornoAtestoDocumentoHabilDTO }
     * 
     */
    public RetornoAtestoDocumentoHabilDTO createRetornoAtestoDocumentoHabilDTO() {
        return new RetornoAtestoDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ProcessarNumeroDocumentoContabilAlmoxarifado }
     * 
     */
    public ProcessarNumeroDocumentoContabilAlmoxarifado createProcessarNumeroDocumentoContabilAlmoxarifado() {
        return new ProcessarNumeroDocumentoContabilAlmoxarifado();
    }

    /**
     * Create an instance of {@link ProcessarExcluirDocumentoOrigem }
     * 
     */
    public ProcessarExcluirDocumentoOrigem createProcessarExcluirDocumentoOrigem() {
        return new ProcessarExcluirDocumentoOrigem();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarSequencialDocumentoOrigem }
     * 
     */
    public ProcessarSequencialDocumentoOrigem createProcessarSequencialDocumentoOrigem() {
        return new ProcessarSequencialDocumentoOrigem();
    }

    /**
     * Create an instance of {@link AlmoxarifadoDocaDTO }
     * 
     */
    public AlmoxarifadoDocaDTO createAlmoxarifadoDocaDTO() {
        return new AlmoxarifadoDocaDTO();
    }

    /**
     * Create an instance of {@link ConfirmarProcessamentoMovimentacao }
     * 
     */
    public ConfirmarProcessamentoMovimentacao createConfirmarProcessamentoMovimentacao() {
        return new ConfirmarProcessamentoMovimentacao();
    }

    /**
     * Create an instance of {@link ProcessaNumeroDocumentoHabil }
     * 
     */
    public ProcessaNumeroDocumentoHabil createProcessaNumeroDocumentoHabil() {
        return new ProcessaNumeroDocumentoHabil();
    }

    /**
     * Create an instance of {@link SequencialDocumentoHabilDTO }
     * 
     */
    public SequencialDocumentoHabilDTO createSequencialDocumentoHabilDTO() {
        return new SequencialDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link RetornarAcaoContabil }
     * 
     */
    public RetornarAcaoContabil createRetornarAcaoContabil() {
        return new RetornarAcaoContabil();
    }

    /**
     * Create an instance of {@link RetornoListaX003CAtestoDocumentoHabilDTOX003E }
     * 
     */
    public RetornoListaX003CAtestoDocumentoHabilDTOX003E createRetornoListaX003CAtestoDocumentoHabilDTOX003E() {
        return new RetornoListaX003CAtestoDocumentoHabilDTOX003E();
    }

    /**
     * Create an instance of {@link RetornarDocumentoHabil }
     * 
     */
    public RetornarDocumentoHabil createRetornarDocumentoHabil() {
        return new RetornarDocumentoHabil();
    }

    /**
     * Create an instance of {@link ProcessarAlmoxarifado }
     * 
     */
    public ProcessarAlmoxarifado createProcessarAlmoxarifado() {
        return new ProcessarAlmoxarifado();
    }

    /**
     * Create an instance of {@link ArrayOfSequencialDocumentoOrigemDTO }
     * 
     */
    public ArrayOfSequencialDocumentoOrigemDTO createArrayOfSequencialDocumentoOrigemDTO() {
        return new ArrayOfSequencialDocumentoOrigemDTO();
    }

    /**
     * Create an instance of {@link ConfirmarProcessamentoMovimentacaoResponse }
     * 
     */
    public ConfirmarProcessamentoMovimentacaoResponse createConfirmarProcessamentoMovimentacaoResponse() {
        return new ConfirmarProcessamentoMovimentacaoResponse();
    }

    /**
     * Create an instance of {@link ProcessarSequencialDocumentoOrigemResponse }
     * 
     */
    public ProcessarSequencialDocumentoOrigemResponse createProcessarSequencialDocumentoOrigemResponse() {
        return new ProcessarSequencialDocumentoOrigemResponse();
    }

    /**
     * Create an instance of {@link RetornoListaX003CAlmoxarifadoDTOX003E }
     * 
     */
    public RetornoListaX003CAlmoxarifadoDTOX003E createRetornoListaX003CAlmoxarifadoDTOX003E() {
        return new RetornoListaX003CAlmoxarifadoDTOX003E();
    }

    /**
     * Create an instance of {@link RetornarMovimentacaoResponse }
     * 
     */
    public RetornarMovimentacaoResponse createRetornarMovimentacaoResponse() {
        return new RetornarMovimentacaoResponse();
    }

    /**
     * Create an instance of {@link SequencialDocumentoOrigemDTO }
     * 
     */
    public SequencialDocumentoOrigemDTO createSequencialDocumentoOrigemDTO() {
        return new SequencialDocumentoOrigemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO }
     * 
     */
    public ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO createArrayOfNumeroDocumentoContabilAlmoxarifadoDTO() {
        return new ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link DocumentoHabilDTO }
     * 
     */
    public DocumentoHabilDTO createDocumentoHabilDTO() {
        return new DocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfAmxKardexDTO }
     * 
     */
    public ArrayOfAmxKardexDTO createArrayOfAmxKardexDTO() {
        return new ArrayOfAmxKardexDTO();
    }

    /**
     * Create an instance of {@link AmxKardexFiltroDTO }
     * 
     */
    public AmxKardexFiltroDTO createAmxKardexFiltroDTO() {
        return new AmxKardexFiltroDTO();
    }

    /**
     * Create an instance of {@link RetornarExcluirDocumentoOrigemResponse }
     * 
     */
    public RetornarExcluirDocumentoOrigemResponse createRetornarExcluirDocumentoOrigemResponse() {
        return new RetornarExcluirDocumentoOrigemResponse();
    }

    /**
     * Create an instance of {@link ProcessarAtestoDocumentoHabilResponse }
     * 
     */
    public ProcessarAtestoDocumentoHabilResponse createProcessarAtestoDocumentoHabilResponse() {
        return new ProcessarAtestoDocumentoHabilResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAlmoxarifadoDTO }
     * 
     */
    public ArrayOfAlmoxarifadoDTO createArrayOfAlmoxarifadoDTO() {
        return new ArrayOfAlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link RetornarDocumentoHabilResponse }
     * 
     */
    public RetornarDocumentoHabilResponse createRetornarDocumentoHabilResponse() {
        return new RetornarDocumentoHabilResponse();
    }

    /**
     * Create an instance of {@link AmxKardexDTO }
     * 
     */
    public AmxKardexDTO createAmxKardexDTO() {
        return new AmxKardexDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link RetornarAlmoxarifado }
     * 
     */
    public RetornarAlmoxarifado createRetornarAlmoxarifado() {
        return new RetornarAlmoxarifado();
    }

    /**
     * Create an instance of {@link RetornarAtestoDocumentoHabil }
     * 
     */
    public RetornarAtestoDocumentoHabil createRetornarAtestoDocumentoHabil() {
        return new RetornarAtestoDocumentoHabil();
    }

    /**
     * Create an instance of {@link RetornoListaX003CDocumentoHabilDTOX003E }
     * 
     */
    public RetornoListaX003CDocumentoHabilDTOX003E createRetornoListaX003CDocumentoHabilDTOX003E() {
        return new RetornoListaX003CDocumentoHabilDTOX003E();
    }

    /**
     * Create an instance of {@link ArrayOfAtestoDocumentoHabilDTO }
     * 
     */
    public ArrayOfAtestoDocumentoHabilDTO createArrayOfAtestoDocumentoHabilDTO() {
        return new ArrayOfAtestoDocumentoHabilDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDadosContabeisAlmoxarifadoDTO }
     * 
     */
    public ArrayOfDadosContabeisAlmoxarifadoDTO createArrayOfDadosContabeisAlmoxarifadoDTO() {
        return new ArrayOfDadosContabeisAlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link ProcessarAtestoDocumentoHabil }
     * 
     */
    public ProcessarAtestoDocumentoHabil createProcessarAtestoDocumentoHabil() {
        return new ProcessarAtestoDocumentoHabil();
    }

    /**
     * Create an instance of {@link RetornarAtestoDocumentoHabilResponse }
     * 
     */
    public RetornarAtestoDocumentoHabilResponse createRetornarAtestoDocumentoHabilResponse() {
        return new RetornarAtestoDocumentoHabilResponse();
    }

    /**
     * Create an instance of {@link ExcluirDocumentoOrigemDTO }
     * 
     */
    public ExcluirDocumentoOrigemDTO createExcluirDocumentoOrigemDTO() {
        return new ExcluirDocumentoOrigemDTO();
    }

    /**
     * Create an instance of {@link ProcessarAlmoxarifadoResponse }
     * 
     */
    public ProcessarAlmoxarifadoResponse createProcessarAlmoxarifadoResponse() {
        return new ProcessarAlmoxarifadoResponse();
    }

    /**
     * Create an instance of {@link RetornarMovimentacao }
     * 
     */
    public RetornarMovimentacao createRetornarMovimentacao() {
        return new RetornarMovimentacao();
    }

    /**
     * Create an instance of {@link RetornoListaX003CAmxKardexDTOX003E }
     * 
     */
    public RetornoListaX003CAmxKardexDTOX003E createRetornoListaX003CAmxKardexDTOX003E() {
        return new RetornoListaX003CAmxKardexDTOX003E();
    }

    /**
     * Create an instance of {@link ArrayOfExcluirDocumentoOrigemDTO }
     * 
     */
    public ArrayOfExcluirDocumentoOrigemDTO createArrayOfExcluirDocumentoOrigemDTO() {
        return new ArrayOfExcluirDocumentoOrigemDTO();
    }

    /**
     * Create an instance of {@link DadosContabeisAlmoxarifadoDTO }
     * 
     */
    public DadosContabeisAlmoxarifadoDTO createDadosContabeisAlmoxarifadoDTO() {
        return new DadosContabeisAlmoxarifadoDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AlmoxarifadoDTO")
    public JAXBElement<AlmoxarifadoDTO> createAlmoxarifadoDTO(AlmoxarifadoDTO value) {
        return new JAXBElement<AlmoxarifadoDTO>(_AlmoxarifadoDTO_QNAME, AlmoxarifadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtestoDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AtestoDocumentoHabilDTO")
    public JAXBElement<AtestoDocumentoHabilDTO> createAtestoDocumentoHabilDTO(AtestoDocumentoHabilDTO value) {
        return new JAXBElement<AtestoDocumentoHabilDTO>(_AtestoDocumentoHabilDTO_QNAME, AtestoDocumentoHabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAmxKardexDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAmxKardexDTO")
    public JAXBElement<ArrayOfAmxKardexDTO> createArrayOfAmxKardexDTO(ArrayOfAmxKardexDTO value) {
        return new JAXBElement<ArrayOfAmxKardexDTO>(_ArrayOfAmxKardexDTO_QNAME, ArrayOfAmxKardexDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencialDocumentoOrigemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "SequencialDocumentoOrigemDTO")
    public JAXBElement<SequencialDocumentoOrigemDTO> createSequencialDocumentoOrigemDTO(SequencialDocumentoOrigemDTO value) {
        return new JAXBElement<SequencialDocumentoOrigemDTO>(_SequencialDocumentoOrigemDTO_QNAME, SequencialDocumentoOrigemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_DadosContabeisAlmoxarifadoDTO_x003E_")
    public JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> createRetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E(RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E>(_RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E_QNAME, RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencialDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "SequencialDocumentoHabilDTO")
    public JAXBElement<SequencialDocumentoHabilDTO> createSequencialDocumentoHabilDTO(SequencialDocumentoHabilDTO value) {
        return new JAXBElement<SequencialDocumentoHabilDTO>(_SequencialDocumentoHabilDTO_QNAME, SequencialDocumentoHabilDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosContabeisAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDadosContabeisAlmoxarifadoDTO")
    public JAXBElement<ArrayOfDadosContabeisAlmoxarifadoDTO> createArrayOfDadosContabeisAlmoxarifadoDTO(ArrayOfDadosContabeisAlmoxarifadoDTO value) {
        return new JAXBElement<ArrayOfDadosContabeisAlmoxarifadoDTO>(_ArrayOfDadosContabeisAlmoxarifadoDTO_QNAME, ArrayOfDadosContabeisAlmoxarifadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDocaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAlmoxarifadoDocaDTO")
    public JAXBElement<ArrayOfAlmoxarifadoDocaDTO> createArrayOfAlmoxarifadoDocaDTO(ArrayOfAlmoxarifadoDocaDTO value) {
        return new JAXBElement<ArrayOfAlmoxarifadoDocaDTO>(_ArrayOfAlmoxarifadoDocaDTO_QNAME, ArrayOfAlmoxarifadoDocaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AlmoxarifadoDocaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AlmoxarifadoDocaDTO")
    public JAXBElement<AlmoxarifadoDocaDTO> createAlmoxarifadoDocaDTO(AlmoxarifadoDocaDTO value) {
        return new JAXBElement<AlmoxarifadoDocaDTO>(_AlmoxarifadoDocaDTO_QNAME, AlmoxarifadoDocaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmxKardexFiltroDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AmxKardexFiltroDTO")
    public JAXBElement<AmxKardexFiltroDTO> createAmxKardexFiltroDTO(AmxKardexFiltroDTO value) {
        return new JAXBElement<AmxKardexFiltroDTO>(_AmxKardexFiltroDTO_QNAME, AmxKardexFiltroDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO")
    public JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> createArrayOfNumeroDocumentoContabilAlmoxarifadoDTO(ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO>(_ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO_QNAME, ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosContabeisAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DadosContabeisAlmoxarifadoDTO")
    public JAXBElement<DadosContabeisAlmoxarifadoDTO> createDadosContabeisAlmoxarifadoDTO(DadosContabeisAlmoxarifadoDTO value) {
        return new JAXBElement<DadosContabeisAlmoxarifadoDTO>(_DadosContabeisAlmoxarifadoDTO_QNAME, DadosContabeisAlmoxarifadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAlmoxarifadoDTO")
    public JAXBElement<ArrayOfAlmoxarifadoDTO> createArrayOfAlmoxarifadoDTO(ArrayOfAlmoxarifadoDTO value) {
        return new JAXBElement<ArrayOfAlmoxarifadoDTO>(_ArrayOfAlmoxarifadoDTO_QNAME, ArrayOfAlmoxarifadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExcluirDocumentoOrigemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfExcluirDocumentoOrigemDTO")
    public JAXBElement<ArrayOfExcluirDocumentoOrigemDTO> createArrayOfExcluirDocumentoOrigemDTO(ArrayOfExcluirDocumentoOrigemDTO value) {
        return new JAXBElement<ArrayOfExcluirDocumentoOrigemDTO>(_ArrayOfExcluirDocumentoOrigemDTO_QNAME, ArrayOfExcluirDocumentoOrigemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NumeroDocumentoHabilDTO")
    public JAXBElement<NumeroDocumentoHabilDTO> createNumeroDocumentoHabilDTO(NumeroDocumentoHabilDTO value) {
        return new JAXBElement<NumeroDocumentoHabilDTO>(_NumeroDocumentoHabilDTO_QNAME, NumeroDocumentoHabilDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DocumentoHabilDTO")
    public JAXBElement<DocumentoHabilDTO> createDocumentoHabilDTO(DocumentoHabilDTO value) {
        return new JAXBElement<DocumentoHabilDTO>(_DocumentoHabilDTO_QNAME, DocumentoHabilDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirDocumentoOrigemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ExcluirDocumentoOrigemDTO")
    public JAXBElement<ExcluirDocumentoOrigemDTO> createExcluirDocumentoOrigemDTO(ExcluirDocumentoOrigemDTO value) {
        return new JAXBElement<ExcluirDocumentoOrigemDTO>(_ExcluirDocumentoOrigemDTO_QNAME, ExcluirDocumentoOrigemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AmxKardexDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AmxKardexDTO")
    public JAXBElement<AmxKardexDTO> createAmxKardexDTO(AmxKardexDTO value) {
        return new JAXBElement<AmxKardexDTO>(_AmxKardexDTO_QNAME, AmxKardexDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroDocumentoContabilAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NumeroDocumentoContabilAlmoxarifadoDTO")
    public JAXBElement<NumeroDocumentoContabilAlmoxarifadoDTO> createNumeroDocumentoContabilAlmoxarifadoDTO(NumeroDocumentoContabilAlmoxarifadoDTO value) {
        return new JAXBElement<NumeroDocumentoContabilAlmoxarifadoDTO>(_NumeroDocumentoContabilAlmoxarifadoDTO_QNAME, NumeroDocumentoContabilAlmoxarifadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDocumentoHabilDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_DocumentoHabilDTO_x003E_")
    public JAXBElement<RetornoListaX003CDocumentoHabilDTOX003E> createRetornoListaX003CDocumentoHabilDTOX003E(RetornoListaX003CDocumentoHabilDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDocumentoHabilDTOX003E>(_RetornoListaX003CDocumentoHabilDTOX003E_QNAME, RetornoListaX003CDocumentoHabilDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAmxKardexDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_AmxKardexDTO_x003E_")
    public JAXBElement<RetornoListaX003CAmxKardexDTOX003E> createRetornoListaX003CAmxKardexDTOX003E(RetornoListaX003CAmxKardexDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAmxKardexDTOX003E>(_RetornoListaX003CAmxKardexDTOX003E_QNAME, RetornoListaX003CAmxKardexDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfNumeroDocumentoHabilDTO")
    public JAXBElement<ArrayOfNumeroDocumentoHabilDTO> createArrayOfNumeroDocumentoHabilDTO(ArrayOfNumeroDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoHabilDTO>(_ArrayOfNumeroDocumentoHabilDTO_QNAME, ArrayOfNumeroDocumentoHabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAtestoDocumentoHabilDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_AtestoDocumentoHabilDTO_x003E_")
    public JAXBElement<RetornoListaX003CAtestoDocumentoHabilDTOX003E> createRetornoListaX003CAtestoDocumentoHabilDTOX003E(RetornoListaX003CAtestoDocumentoHabilDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAtestoDocumentoHabilDTOX003E>(_RetornoListaX003CAtestoDocumentoHabilDTOX003E_QNAME, RetornoListaX003CAtestoDocumentoHabilDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDocumentoHabilDTO")
    public JAXBElement<ArrayOfDocumentoHabilDTO> createArrayOfDocumentoHabilDTO(ArrayOfDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfDocumentoHabilDTO>(_ArrayOfDocumentoHabilDTO_QNAME, ArrayOfDocumentoHabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetornoAtestoDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfRetornoAtestoDocumentoHabilDTO")
    public JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> createArrayOfRetornoAtestoDocumentoHabilDTO(ArrayOfRetornoAtestoDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO>(_ArrayOfRetornoAtestoDocumentoHabilDTO_QNAME, ArrayOfRetornoAtestoDocumentoHabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAlmoxarifadoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_AlmoxarifadoDTO_x003E_")
    public JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> createRetornoListaX003CAlmoxarifadoDTOX003E(RetornoListaX003CAlmoxarifadoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E>(_RetornoListaX003CAlmoxarifadoDTOX003E_QNAME, RetornoListaX003CAlmoxarifadoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoOrigemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfSequencialDocumentoOrigemDTO")
    public JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> createArrayOfSequencialDocumentoOrigemDTO(ArrayOfSequencialDocumentoOrigemDTO value) {
        return new JAXBElement<ArrayOfSequencialDocumentoOrigemDTO>(_ArrayOfSequencialDocumentoOrigemDTO_QNAME, ArrayOfSequencialDocumentoOrigemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAtestoDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAtestoDocumentoHabilDTO")
    public JAXBElement<ArrayOfAtestoDocumentoHabilDTO> createArrayOfAtestoDocumentoHabilDTO(ArrayOfAtestoDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfAtestoDocumentoHabilDTO>(_ArrayOfAtestoDocumentoHabilDTO_QNAME, ArrayOfAtestoDocumentoHabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CExcluirDocumentoOrigemDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_ExcluirDocumentoOrigemDTO_x003E_")
    public JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> createRetornoListaX003CExcluirDocumentoOrigemDTOX003E(RetornoListaX003CExcluirDocumentoOrigemDTOX003E value) {
        return new JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E>(_RetornoListaX003CExcluirDocumentoOrigemDTOX003E_QNAME, RetornoListaX003CExcluirDocumentoOrigemDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoAtestoDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoAtestoDocumentoHabilDTO")
    public JAXBElement<RetornoAtestoDocumentoHabilDTO> createRetornoAtestoDocumentoHabilDTO(RetornoAtestoDocumentoHabilDTO value) {
        return new JAXBElement<RetornoAtestoDocumentoHabilDTO>(_RetornoAtestoDocumentoHabilDTO_QNAME, RetornoAtestoDocumentoHabilDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfSequencialDocumentoHabilDTO")
    public JAXBElement<ArrayOfSequencialDocumentoHabilDTO> createArrayOfSequencialDocumentoHabilDTO(ArrayOfSequencialDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfSequencialDocumentoHabilDTO>(_ArrayOfSequencialDocumentoHabilDTO_QNAME, ArrayOfSequencialDocumentoHabilDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstAlmoxarifado", scope = ProcessarAlmoxarifado.class)
    public JAXBElement<ArrayOfAlmoxarifadoDTO> createProcessarAlmoxarifadoLstAlmoxarifado(ArrayOfAlmoxarifadoDTO value) {
        return new JAXBElement<ArrayOfAlmoxarifadoDTO>(_ProcessarAlmoxarifadoLstAlmoxarifado_QNAME, ArrayOfAlmoxarifadoDTO.class, ProcessarAlmoxarifado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAlmoxarifadoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarAlmoxarifadoResult", scope = RetornarAlmoxarifadoResponse.class)
    public JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> createRetornarAlmoxarifadoResponseRetornarAlmoxarifadoResult(RetornoListaX003CAlmoxarifadoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E>(_RetornarAlmoxarifadoResponseRetornarAlmoxarifadoResult_QNAME, RetornoListaX003CAlmoxarifadoDTOX003E.class, RetornarAlmoxarifadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmarProcessamentoMovimentacaoResult", scope = ConfirmarProcessamentoMovimentacaoResponse.class)
    public JAXBElement<RetornoDTO> createConfirmarProcessamentoMovimentacaoResponseConfirmarProcessamentoMovimentacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ConfirmarProcessamentoMovimentacaoResponseConfirmarProcessamentoMovimentacaoResult_QNAME, RetornoDTO.class, ConfirmarProcessamentoMovimentacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarSequencialDocumentoOrigemResult", scope = ProcessarSequencialDocumentoOrigemResponse.class)
    public JAXBElement<RetornoDTO> createProcessarSequencialDocumentoOrigemResponseProcessarSequencialDocumentoOrigemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarSequencialDocumentoOrigemResponseProcessarSequencialDocumentoOrigemResult_QNAME, RetornoDTO.class, ProcessarSequencialDocumentoOrigemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDocaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstAlmoxarifadoDoca", scope = AlmoxarifadoDTO.class)
    public JAXBElement<ArrayOfAlmoxarifadoDocaDTO> createAlmoxarifadoDTOLstAlmoxarifadoDoca(ArrayOfAlmoxarifadoDocaDTO value) {
        return new JAXBElement<ArrayOfAlmoxarifadoDocaDTO>(_AlmoxarifadoDTOLstAlmoxarifadoDoca_QNAME, ArrayOfAlmoxarifadoDocaDTO.class, AlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuario", scope = AlmoxarifadoDTO.class)
    public JAXBElement<String> createAlmoxarifadoDTOSCdUsuario(String value) {
        return new JAXBElement<String>(_AlmoxarifadoDTOSCdUsuario_QNAME, String.class, AlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgAlmoxarifado", scope = AlmoxarifadoDTO.class)
    public JAXBElement<String> createAlmoxarifadoDTOSSgAlmoxarifado(String value) {
        return new JAXBElement<String>(_AlmoxarifadoDTOSSgAlmoxarifado_QNAME, String.class, AlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarAcaoContabilResult", scope = RetornarAcaoContabilResponse.class)
    public JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> createRetornarAcaoContabilResponseRetornarAcaoContabilResult(RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E>(_RetornarAcaoContabilResponseRetornarAcaoContabilResult_QNAME, RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E.class, RetornarAcaoContabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessaNumeroDocumentoHabilResult", scope = ProcessaNumeroDocumentoHabilResponse.class)
    public JAXBElement<RetornoDTO> createProcessaNumeroDocumentoHabilResponseProcessaNumeroDocumentoHabilResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessaNumeroDocumentoHabilResponseProcessaNumeroDocumentoHabilResult_QNAME, RetornoDTO.class, ProcessaNumeroDocumentoHabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarNumeroDocumentoContabilAlmoxarifadoResult", scope = ProcessarNumeroDocumentoContabilAlmoxarifadoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarNumeroDocumentoContabilAlmoxarifadoResponseProcessarNumeroDocumentoContabilAlmoxarifadoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarNumeroDocumentoContabilAlmoxarifadoResponseProcessarNumeroDocumentoContabilAlmoxarifadoResult_QNAME, RetornoDTO.class, ProcessarNumeroDocumentoContabilAlmoxarifadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAmxKardexDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarMovimentacaoResult", scope = RetornarMovimentacaoResponse.class)
    public JAXBElement<RetornoListaX003CAmxKardexDTOX003E> createRetornarMovimentacaoResponseRetornarMovimentacaoResult(RetornoListaX003CAmxKardexDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAmxKardexDTOX003E>(_RetornarMovimentacaoResponseRetornarMovimentacaoResult_QNAME, RetornoListaX003CAmxKardexDTOX003E.class, RetornarMovimentacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sVlAnoExercicio", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSVlAnoExercicio(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSVlAnoExercicio_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCnpjCpf", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSCdCnpjCpf(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdCnpjCpf_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrSerie", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSNrSerie(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSNrSerie_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrDocumento", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSNrDocumento(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSNrDocumento_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSCdGestao(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdGestao_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdEmpresa_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTipoDocumento", scope = DocumentoHabilDTO.class)
    public JAXBElement<String> createDocumentoHabilDTOSCdTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdTipoDocumento_QNAME, String.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdRecDocumento", scope = DocumentoHabilDTO.class)
    public JAXBElement<Long> createDocumentoHabilDTONCdRecDocumento(Long value) {
        return new JAXBElement<Long>(_DocumentoHabilDTONCdRecDocumento_QNAME, Long.class, DocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CExcluirDocumentoOrigemDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarExcluirDocumentoOrigemResult", scope = RetornarExcluirDocumentoOrigemResponse.class)
    public JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> createRetornarExcluirDocumentoOrigemResponseRetornarExcluirDocumentoOrigemResult(RetornoListaX003CExcluirDocumentoOrigemDTOX003E value) {
        return new JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E>(_RetornarExcluirDocumentoOrigemResponseRetornarExcluirDocumentoOrigemResult_QNAME, RetornoListaX003CExcluirDocumentoOrigemDTOX003E.class, RetornarExcluirDocumentoOrigemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarAtestoDocumentoHabilResult", scope = ProcessarAtestoDocumentoHabilResponse.class)
    public JAXBElement<RetornoDTO> createProcessarAtestoDocumentoHabilResponseProcessarAtestoDocumentoHabilResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarAtestoDocumentoHabilResponseProcessarAtestoDocumentoHabilResult_QNAME, RetornoDTO.class, ProcessarAtestoDocumentoHabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = AtestoDocumentoHabilDTO.class)
    public JAXBElement<String> createAtestoDocumentoHabilDTOSCdGestao(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdGestao_QNAME, String.class, AtestoDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumentoHabil", scope = AtestoDocumentoHabilDTO.class)
    public JAXBElement<String> createAtestoDocumentoHabilDTOSCdDocumentoHabil(String value) {
        return new JAXBElement<String>(_AtestoDocumentoHabilDTOSCdDocumentoHabil_QNAME, String.class, AtestoDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeGestora", scope = AtestoDocumentoHabilDTO.class)
    public JAXBElement<String> createAtestoDocumentoHabilDTOSCdUnidadeGestora(String value) {
        return new JAXBElement<String>(_AtestoDocumentoHabilDTOSCdUnidadeGestora_QNAME, String.class, AtestoDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CDocumentoHabilDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDocumentoHabilResult", scope = RetornarDocumentoHabilResponse.class)
    public JAXBElement<RetornoListaX003CDocumentoHabilDTOX003E> createRetornarDocumentoHabilResponseRetornarDocumentoHabilResult(RetornoListaX003CDocumentoHabilDTOX003E value) {
        return new JAXBElement<RetornoListaX003CDocumentoHabilDTOX003E>(_RetornarDocumentoHabilResponseRetornarDocumentoHabilResult_QNAME, RetornoListaX003CDocumentoHabilDTOX003E.class, RetornarDocumentoHabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarExcluirDocumentoOrigemResult", scope = ProcessarExcluirDocumentoOrigemResponse.class)
    public JAXBElement<RetornoDTO> createProcessarExcluirDocumentoOrigemResponseProcessarExcluirDocumentoOrigemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarExcluirDocumentoOrigemResponseProcessarExcluirDocumentoOrigemResult_QNAME, RetornoDTO.class, ProcessarExcluirDocumentoOrigemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = NumeroDocumentoHabilDTO.class)
    public JAXBElement<String> createNumeroDocumentoHabilDTOSCdGestao(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdGestao_QNAME, String.class, NumeroDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumentoHabil", scope = NumeroDocumentoHabilDTO.class)
    public JAXBElement<String> createNumeroDocumentoHabilDTOSCdDocumentoHabil(String value) {
        return new JAXBElement<String>(_AtestoDocumentoHabilDTOSCdDocumentoHabil_QNAME, String.class, NumeroDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTipoDocumento", scope = NumeroDocumentoHabilDTO.class)
    public JAXBElement<String> createNumeroDocumentoHabilDTOSCdTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdTipoDocumento_QNAME, String.class, NumeroDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeGestora", scope = NumeroDocumentoHabilDTO.class)
    public JAXBElement<String> createNumeroDocumentoHabilDTOSCdUnidadeGestora(String value) {
        return new JAXBElement<String>(_AtestoDocumentoHabilDTOSCdUnidadeGestora_QNAME, String.class, NumeroDocumentoHabilDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumentoContabil", scope = NumeroDocumentoContabilAlmoxarifadoDTO.class)
    public JAXBElement<String> createNumeroDocumentoContabilAlmoxarifadoDTOSCdDocumentoContabil(String value) {
        return new JAXBElement<String>(_NumeroDocumentoContabilAlmoxarifadoDTOSCdDocumentoContabil_QNAME, String.class, NumeroDocumentoContabilAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstNumeroDocumentoContabilDTO", scope = ProcessarNumeroDocumentoContabilAlmoxarifado.class)
    public JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> createProcessarNumeroDocumentoContabilAlmoxarifadoLstNumeroDocumentoContabilDTO(ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO>(_ProcessarNumeroDocumentoContabilAlmoxarifadoLstNumeroDocumentoContabilDTO_QNAME, ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO.class, ProcessarNumeroDocumentoContabilAlmoxarifado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoOrigemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstSequencialDocumentoOrigemDTO", scope = ProcessarExcluirDocumentoOrigem.class)
    public JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> createProcessarExcluirDocumentoOrigemLstSequencialDocumentoOrigemDTO(ArrayOfSequencialDocumentoOrigemDTO value) {
        return new JAXBElement<ArrayOfSequencialDocumentoOrigemDTO>(_ProcessarExcluirDocumentoOrigemLstSequencialDocumentoOrigemDTO_QNAME, ArrayOfSequencialDocumentoOrigemDTO.class, ProcessarExcluirDocumentoOrigem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAlmoxarifadoDoca", scope = AlmoxarifadoDocaDTO.class)
    public JAXBElement<String> createAlmoxarifadoDocaDTOSCdAlmoxarifadoDoca(String value) {
        return new JAXBElement<String>(_AlmoxarifadoDocaDTOSCdAlmoxarifadoDoca_QNAME, String.class, AlmoxarifadoDocaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAlmoxarifadoDoca", scope = AlmoxarifadoDocaDTO.class)
    public JAXBElement<String> createAlmoxarifadoDocaDTOSDsAlmoxarifadoDoca(String value) {
        return new JAXBElement<String>(_AlmoxarifadoDocaDTOSDsAlmoxarifadoDoca_QNAME, String.class, AlmoxarifadoDocaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstSequencialDocumentoHabilDTO", scope = ProcessarSequencialDocumentoOrigem.class)
    public JAXBElement<ArrayOfSequencialDocumentoHabilDTO> createProcessarSequencialDocumentoOrigemLstSequencialDocumentoHabilDTO(ArrayOfSequencialDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfSequencialDocumentoHabilDTO>(_ProcessarSequencialDocumentoOrigemLstSequencialDocumentoHabilDTO_QNAME, ArrayOfSequencialDocumentoHabilDTO.class, ProcessarSequencialDocumentoOrigem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetornoAtestoDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstAtestoDocumentoHabilDTO", scope = ProcessarAtestoDocumentoHabil.class)
    public JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> createProcessarAtestoDocumentoHabilLstAtestoDocumentoHabilDTO(ArrayOfRetornoAtestoDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO>(_ProcessarAtestoDocumentoHabilLstAtestoDocumentoHabilDTO_QNAME, ArrayOfRetornoAtestoDocumentoHabilDTO.class, ProcessarAtestoDocumentoHabil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CAtestoDocumentoHabilDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarAtestoDocumentoHabilResult", scope = RetornarAtestoDocumentoHabilResponse.class)
    public JAXBElement<RetornoListaX003CAtestoDocumentoHabilDTOX003E> createRetornarAtestoDocumentoHabilResponseRetornarAtestoDocumentoHabilResult(RetornoListaX003CAtestoDocumentoHabilDTOX003E value) {
        return new JAXBElement<RetornoListaX003CAtestoDocumentoHabilDTOX003E>(_RetornarAtestoDocumentoHabilResponseRetornarAtestoDocumentoHabilResult_QNAME, RetornoListaX003CAtestoDocumentoHabilDTOX003E.class, RetornarAtestoDocumentoHabilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstCdKardec", scope = ConfirmarProcessamentoMovimentacao.class)
    public JAXBElement<ArrayOflong> createConfirmarProcessamentoMovimentacaoLstCdKardec(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ConfirmarProcessamentoMovimentacaoLstCdKardec_QNAME, ArrayOflong.class, ConfirmarProcessamentoMovimentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoHabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstNumeroDocumentoHabilDTO", scope = ProcessaNumeroDocumentoHabil.class)
    public JAXBElement<ArrayOfNumeroDocumentoHabilDTO> createProcessaNumeroDocumentoHabilLstNumeroDocumentoHabilDTO(ArrayOfNumeroDocumentoHabilDTO value) {
        return new JAXBElement<ArrayOfNumeroDocumentoHabilDTO>(_ProcessaNumeroDocumentoHabilLstNumeroDocumentoHabilDTO_QNAME, ArrayOfNumeroDocumentoHabilDTO.class, ProcessaNumeroDocumentoHabil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sVlAnoExercicio", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSVlAnoExercicio(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSVlAnoExercicio_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSCdGestao(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdGestao_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdEmpresa_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumentoHabil", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSCdDocumentoHabil(String value) {
        return new JAXBElement<String>(_AtestoDocumentoHabilDTOSCdDocumentoHabil_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTipoDocumento", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSCdTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdTipoDocumento_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = ExcluirDocumentoOrigemDTO.class)
    public JAXBElement<String> createExcluirDocumentoOrigemDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_ExcluirDocumentoOrigemDTOSDsJustificativa_QNAME, String.class, ExcluirDocumentoOrigemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarAlmoxarifadoResult", scope = ProcessarAlmoxarifadoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarAlmoxarifadoResponseProcessarAlmoxarifadoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarAlmoxarifadoResponseProcessarAlmoxarifadoResult_QNAME, RetornoDTO.class, ProcessarAlmoxarifadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmxKardexFiltroDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "oAmxKardexFiltroDTO", scope = RetornarMovimentacao.class)
    public JAXBElement<AmxKardexFiltroDTO> createRetornarMovimentacaoOAmxKardexFiltroDTO(AmxKardexFiltroDTO value) {
        return new JAXBElement<AmxKardexFiltroDTO>(_RetornarMovimentacaoOAmxKardexFiltroDTO_QNAME, AmxKardexFiltroDTO.class, RetornarMovimentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sVlAnoExercicio", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSVlAnoExercicio(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSVlAnoExercicio_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSCdGestao(String value) {
        return new JAXBElement<String>(_DocumentoHabilDTOSCdGestao_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAcaoContabil", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSDsAcaoContabil(String value) {
        return new JAXBElement<String>(_DadosContabeisAlmoxarifadoDTOSDsAcaoContabil_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCategoria", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSCdCategoria(String value) {
        return new JAXBElement<String>(_DadosContabeisAlmoxarifadoDTOSCdCategoria_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGestaoOrigem", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSDsGestaoOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisAlmoxarifadoDTOSDsGestaoOrigem_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUgOrigem", scope = DadosContabeisAlmoxarifadoDTO.class)
    public JAXBElement<String> createDadosContabeisAlmoxarifadoDTOSDsUgOrigem(String value) {
        return new JAXBElement<String>(_DadosContabeisAlmoxarifadoDTOSDsUgOrigem_QNAME, String.class, DadosContabeisAlmoxarifadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrToken", scope = RetornoDTO.class)
    public JAXBElement<String> createRetornoDTOSNrToken(String value) {
        return new JAXBElement<String>(_WbtLogDTOSNrToken_QNAME, String.class, RetornoDTO.class, value);
    }

}
