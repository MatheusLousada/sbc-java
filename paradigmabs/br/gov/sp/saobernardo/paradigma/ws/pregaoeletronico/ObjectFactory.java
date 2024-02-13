
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico package. 
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

    private final static QName _PregaoEletronicoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoDTO");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfPregaoEletronicoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _HabilitarPregaoEletronicoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "HabilitarPregaoEletronicoDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfPregaoEletronicoPropostaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoPropostaDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _PregaoEletronicoPropostaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoPropostaDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _PregaoEletronicoItemLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoItemLanceDTO");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfPregaoEletronicoLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoLoteDTO");
    private final static QName _ComissaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ComissaoDTO");
    private final static QName _PregaoEletronicoLoteLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoLoteLanceDTO");
    private final static QName _ArrayOfComissaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfComissaoDTO");
    private final static QName _PregaoEletronicoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoItemDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _PregaoEletronicoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoItemEnderecoDTO");
    private final static QName _ArrayOfHabilitarPregaoEletronicoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfHabilitarPregaoEletronicoDTO");
    private final static QName _ArrayOfPregaoEletronicoItemLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoItemLanceDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfPregaoEletronicoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoItemEnderecoDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _PregaoEletronicoLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PregaoEletronicoLoteDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfPregaoEletronicoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoItemDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfPregaoEletronicoLoteLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPregaoEletronicoLoteLanceDTO");
    private final static QName _PregaoEletronicoItemDTOLstPregaoEletronicoPropostaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPregaoEletronicoPropostaDTO");
    private final static QName _PregaoEletronicoItemDTOLstPregaoEletronicoItemLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPregaoEletronicoItemLanceDTO");
    private final static QName _PregaoEletronicoItemDTOSCdLoteLegado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLoteLegado");
    private final static QName _ProcessarPregaoEletronicoLstPregaoEletronicoDTO_QNAME = new QName("http://tempuri.org/", "lstPregaoEletronicoDTO");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _PregaoEletronicoItemLanceDTOSDsMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsMarca");
    private final static QName _PregaoEletronicoItemLanceDTOSDsModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsModelo");
    private final static QName _PregaoEletronicoLoteDTOLstPregaoEletronicoLoteLanceDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPregaoEletronicoLoteLanceDTO");
    private final static QName _PregaoEletronicoDTOLstPregaoEletronicoComissao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPregaoEletronicoComissao");
    private final static QName _PregaoEletronicoDTONIdAutoEncerramento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdAutoEncerramento");
    private final static QName _PregaoEletronicoDTOSDsTermo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsTermo");
    private final static QName _PregaoEletronicoDTONIdAnexoNegociacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdAnexoNegociacao");
    private final static QName _PregaoEletronicoDTOBFlAplicaLei123_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAplicaLei123");
    private final static QName _PregaoEletronicoDTOBFlPermitirLance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlPermitirLance");
    private final static QName _PregaoEletronicoDTONVlTempoDisputa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlTempoDisputa");
    private final static QName _PregaoEletronicoDTOBFlNaturezaObjeto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlNaturezaObjeto");
    private final static QName _PregaoEletronicoDTONVlProrrogaCondicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlProrrogaCondicao");
    private final static QName _PregaoEletronicoDTONCdTipoProcesso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipoProcesso");
    private final static QName _PregaoEletronicoDTOBFlPermiteFornecedorCadastroVencido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlPermiteFornecedorCadastroVencido");
    private final static QName _PregaoEletronicoDTONIdEstilo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdEstilo");
    private final static QName _PregaoEletronicoDTONIdHabilitacaoAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdHabilitacaoAnexo");
    private final static QName _PregaoEletronicoDTOBFlHomologacaoParcial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlHomologacaoParcial");
    private final static QName _PregaoEletronicoDTOBFlMostrarReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlMostrarReferencia");
    private final static QName _PregaoEletronicoDTOLstPregaoEletronicoLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPregaoEletronicoLoteDTO");
    private final static QName _PregaoEletronicoDTOBFlRequerCRC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlRequerCRC");
    private final static QName _PregaoEletronicoDTONVlProrroga_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlProrroga");
    private final static QName _PregaoEletronicoDTOTDtPublicacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtPublicacao");
    private final static QName _PregaoEletronicoDTOBFlObrigarDeclaracaoVendedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlObrigarDeclaracaoVendedor");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _ProcessarPregaoEletronicoResponseProcessarPregaoEletronicoResult_QNAME = new QName("http://tempuri.org/", "ProcessarPregaoEletronicoResult");
    private final static QName _PregaoEletronicoLoteLanceDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _PregaoEletronicoLoteLanceDTOSDsJustificativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsJustificativa");
    private final static QName _PregaoEletronicoLoteLanceDTONNrRanking_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrRanking");
    private final static QName _HabilitarRetornarPregaoEletronicoResponseHabilitarRetornarPregaoEletronicoResult_QNAME = new QName("http://tempuri.org/", "HabilitarRetornarPregaoEletronicoResult");
    private final static QName _PregaoEletronicoPropostaDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _RetornarPregaoEletronicoResponseRetornarPregaoEletronicoResult_QNAME = new QName("http://tempuri.org/", "RetornarPregaoEletronicoResult");
    private final static QName _HabilitarRetornarPregaoEletronicoLstHabilitarPregaoEletronicoDTO_QNAME = new QName("http://tempuri.org/", "lstHabilitarPregaoEletronicoDTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfComissaoDTO }
     * 
     */
    public ArrayOfComissaoDTO createArrayOfComissaoDTO() {
        return new ArrayOfComissaoDTO();
    }

    /**
     * Create an instance of {@link ComissaoDTO }
     * 
     */
    public ComissaoDTO createComissaoDTO() {
        return new ComissaoDTO();
    }

    /**
     * Create an instance of {@link RetornarPregaoEletronico }
     * 
     */
    public RetornarPregaoEletronico createRetornarPregaoEletronico() {
        return new RetornarPregaoEletronico();
    }

    /**
     * Create an instance of {@link PregaoEletronicoLoteDTO }
     * 
     */
    public PregaoEletronicoLoteDTO createPregaoEletronicoLoteDTO() {
        return new PregaoEletronicoLoteDTO();
    }

    /**
     * Create an instance of {@link PregaoEletronicoDTO }
     * 
     */
    public PregaoEletronicoDTO createPregaoEletronicoDTO() {
        return new PregaoEletronicoDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoPropostaDTO }
     * 
     */
    public ArrayOfPregaoEletronicoPropostaDTO createArrayOfPregaoEletronicoPropostaDTO() {
        return new ArrayOfPregaoEletronicoPropostaDTO();
    }

    /**
     * Create an instance of {@link ProcessarPregaoEletronicoResponse }
     * 
     */
    public ProcessarPregaoEletronicoResponse createProcessarPregaoEletronicoResponse() {
        return new ProcessarPregaoEletronicoResponse();
    }

    /**
     * Create an instance of {@link PregaoEletronicoItemEnderecoDTO }
     * 
     */
    public PregaoEletronicoItemEnderecoDTO createPregaoEletronicoItemEnderecoDTO() {
        return new PregaoEletronicoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfHabilitarPregaoEletronicoDTO }
     * 
     */
    public ArrayOfHabilitarPregaoEletronicoDTO createArrayOfHabilitarPregaoEletronicoDTO() {
        return new ArrayOfHabilitarPregaoEletronicoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoItemLanceDTO }
     * 
     */
    public ArrayOfPregaoEletronicoItemLanceDTO createArrayOfPregaoEletronicoItemLanceDTO() {
        return new ArrayOfPregaoEletronicoItemLanceDTO();
    }

    /**
     * Create an instance of {@link HabilitarRetornarPregaoEletronicoResponse }
     * 
     */
    public HabilitarRetornarPregaoEletronicoResponse createHabilitarRetornarPregaoEletronicoResponse() {
        return new HabilitarRetornarPregaoEletronicoResponse();
    }

    /**
     * Create an instance of {@link RetornarPregaoEletronicoResponse }
     * 
     */
    public RetornarPregaoEletronicoResponse createRetornarPregaoEletronicoResponse() {
        return new RetornarPregaoEletronicoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoLoteDTO }
     * 
     */
    public ArrayOfPregaoEletronicoLoteDTO createArrayOfPregaoEletronicoLoteDTO() {
        return new ArrayOfPregaoEletronicoLoteDTO();
    }

    /**
     * Create an instance of {@link HabilitarPregaoEletronicoDTO }
     * 
     */
    public HabilitarPregaoEletronicoDTO createHabilitarPregaoEletronicoDTO() {
        return new HabilitarPregaoEletronicoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoLoteLanceDTO }
     * 
     */
    public ArrayOfPregaoEletronicoLoteLanceDTO createArrayOfPregaoEletronicoLoteLanceDTO() {
        return new ArrayOfPregaoEletronicoLoteLanceDTO();
    }

    /**
     * Create an instance of {@link PregaoEletronicoItemDTO }
     * 
     */
    public PregaoEletronicoItemDTO createPregaoEletronicoItemDTO() {
        return new PregaoEletronicoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarPregaoEletronico }
     * 
     */
    public ProcessarPregaoEletronico createProcessarPregaoEletronico() {
        return new ProcessarPregaoEletronico();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link PregaoEletronicoItemLanceDTO }
     * 
     */
    public PregaoEletronicoItemLanceDTO createPregaoEletronicoItemLanceDTO() {
        return new PregaoEletronicoItemLanceDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoItemEnderecoDTO }
     * 
     */
    public ArrayOfPregaoEletronicoItemEnderecoDTO createArrayOfPregaoEletronicoItemEnderecoDTO() {
        return new ArrayOfPregaoEletronicoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link PregaoEletronicoLoteLanceDTO }
     * 
     */
    public PregaoEletronicoLoteLanceDTO createPregaoEletronicoLoteLanceDTO() {
        return new PregaoEletronicoLoteLanceDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoDTO }
     * 
     */
    public ArrayOfPregaoEletronicoDTO createArrayOfPregaoEletronicoDTO() {
        return new ArrayOfPregaoEletronicoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPregaoEletronicoItemDTO }
     * 
     */
    public ArrayOfPregaoEletronicoItemDTO createArrayOfPregaoEletronicoItemDTO() {
        return new ArrayOfPregaoEletronicoItemDTO();
    }

    /**
     * Create an instance of {@link PregaoEletronicoPropostaDTO }
     * 
     */
    public PregaoEletronicoPropostaDTO createPregaoEletronicoPropostaDTO() {
        return new PregaoEletronicoPropostaDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link HabilitarRetornarPregaoEletronico }
     * 
     */
    public HabilitarRetornarPregaoEletronico createHabilitarRetornarPregaoEletronico() {
        return new HabilitarRetornarPregaoEletronico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoDTO")
    public JAXBElement<PregaoEletronicoDTO> createPregaoEletronicoDTO(PregaoEletronicoDTO value) {
        return new JAXBElement<PregaoEletronicoDTO>(_PregaoEletronicoDTO_QNAME, PregaoEletronicoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoDTO")
    public JAXBElement<ArrayOfPregaoEletronicoDTO> createArrayOfPregaoEletronicoDTO(ArrayOfPregaoEletronicoDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoDTO>(_ArrayOfPregaoEletronicoDTO_QNAME, ArrayOfPregaoEletronicoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HabilitarPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "HabilitarPregaoEletronicoDTO")
    public JAXBElement<HabilitarPregaoEletronicoDTO> createHabilitarPregaoEletronicoDTO(HabilitarPregaoEletronicoDTO value) {
        return new JAXBElement<HabilitarPregaoEletronicoDTO>(_HabilitarPregaoEletronicoDTO_QNAME, HabilitarPregaoEletronicoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoPropostaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoPropostaDTO")
    public JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> createArrayOfPregaoEletronicoPropostaDTO(ArrayOfPregaoEletronicoPropostaDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoPropostaDTO>(_ArrayOfPregaoEletronicoPropostaDTO_QNAME, ArrayOfPregaoEletronicoPropostaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoPropostaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoPropostaDTO")
    public JAXBElement<PregaoEletronicoPropostaDTO> createPregaoEletronicoPropostaDTO(PregaoEletronicoPropostaDTO value) {
        return new JAXBElement<PregaoEletronicoPropostaDTO>(_PregaoEletronicoPropostaDTO_QNAME, PregaoEletronicoPropostaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoItemLanceDTO")
    public JAXBElement<PregaoEletronicoItemLanceDTO> createPregaoEletronicoItemLanceDTO(PregaoEletronicoItemLanceDTO value) {
        return new JAXBElement<PregaoEletronicoItemLanceDTO>(_PregaoEletronicoItemLanceDTO_QNAME, PregaoEletronicoItemLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoLoteDTO")
    public JAXBElement<ArrayOfPregaoEletronicoLoteDTO> createArrayOfPregaoEletronicoLoteDTO(ArrayOfPregaoEletronicoLoteDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoLoteDTO>(_ArrayOfPregaoEletronicoLoteDTO_QNAME, ArrayOfPregaoEletronicoLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoLoteLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoLoteLanceDTO")
    public JAXBElement<PregaoEletronicoLoteLanceDTO> createPregaoEletronicoLoteLanceDTO(PregaoEletronicoLoteLanceDTO value) {
        return new JAXBElement<PregaoEletronicoLoteLanceDTO>(_PregaoEletronicoLoteLanceDTO_QNAME, PregaoEletronicoLoteLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoItemDTO")
    public JAXBElement<PregaoEletronicoItemDTO> createPregaoEletronicoItemDTO(PregaoEletronicoItemDTO value) {
        return new JAXBElement<PregaoEletronicoItemDTO>(_PregaoEletronicoItemDTO_QNAME, PregaoEletronicoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoItemEnderecoDTO")
    public JAXBElement<PregaoEletronicoItemEnderecoDTO> createPregaoEletronicoItemEnderecoDTO(PregaoEletronicoItemEnderecoDTO value) {
        return new JAXBElement<PregaoEletronicoItemEnderecoDTO>(_PregaoEletronicoItemEnderecoDTO_QNAME, PregaoEletronicoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHabilitarPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfHabilitarPregaoEletronicoDTO")
    public JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> createArrayOfHabilitarPregaoEletronicoDTO(ArrayOfHabilitarPregaoEletronicoDTO value) {
        return new JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO>(_ArrayOfHabilitarPregaoEletronicoDTO_QNAME, ArrayOfHabilitarPregaoEletronicoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoItemLanceDTO")
    public JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> createArrayOfPregaoEletronicoItemLanceDTO(ArrayOfPregaoEletronicoItemLanceDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO>(_ArrayOfPregaoEletronicoItemLanceDTO_QNAME, ArrayOfPregaoEletronicoItemLanceDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoItemEnderecoDTO")
    public JAXBElement<ArrayOfPregaoEletronicoItemEnderecoDTO> createArrayOfPregaoEletronicoItemEnderecoDTO(ArrayOfPregaoEletronicoItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoItemEnderecoDTO>(_ArrayOfPregaoEletronicoItemEnderecoDTO_QNAME, ArrayOfPregaoEletronicoItemEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PregaoEletronicoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PregaoEletronicoLoteDTO")
    public JAXBElement<PregaoEletronicoLoteDTO> createPregaoEletronicoLoteDTO(PregaoEletronicoLoteDTO value) {
        return new JAXBElement<PregaoEletronicoLoteDTO>(_PregaoEletronicoLoteDTO_QNAME, PregaoEletronicoLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoItemDTO")
    public JAXBElement<ArrayOfPregaoEletronicoItemDTO> createArrayOfPregaoEletronicoItemDTO(ArrayOfPregaoEletronicoItemDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoItemDTO>(_ArrayOfPregaoEletronicoItemDTO_QNAME, ArrayOfPregaoEletronicoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPregaoEletronicoLoteLanceDTO")
    public JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> createArrayOfPregaoEletronicoLoteLanceDTO(ArrayOfPregaoEletronicoLoteLanceDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO>(_ArrayOfPregaoEletronicoLoteLanceDTO_QNAME, ArrayOfPregaoEletronicoLoteLanceDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoPropostaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPregaoEletronicoPropostaDTO", scope = PregaoEletronicoItemDTO.class)
    public JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> createPregaoEletronicoItemDTOLstPregaoEletronicoPropostaDTO(ArrayOfPregaoEletronicoPropostaDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoPropostaDTO>(_PregaoEletronicoItemDTOLstPregaoEletronicoPropostaDTO_QNAME, ArrayOfPregaoEletronicoPropostaDTO.class, PregaoEletronicoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPregaoEletronicoItemLanceDTO", scope = PregaoEletronicoItemDTO.class)
    public JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> createPregaoEletronicoItemDTOLstPregaoEletronicoItemLanceDTO(ArrayOfPregaoEletronicoItemLanceDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO>(_PregaoEletronicoItemDTOLstPregaoEletronicoItemLanceDTO_QNAME, ArrayOfPregaoEletronicoItemLanceDTO.class, PregaoEletronicoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLoteLegado", scope = PregaoEletronicoItemDTO.class)
    public JAXBElement<String> createPregaoEletronicoItemDTOSCdLoteLegado(String value) {
        return new JAXBElement<String>(_PregaoEletronicoItemDTOSCdLoteLegado_QNAME, String.class, PregaoEletronicoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstPregaoEletronicoDTO", scope = ProcessarPregaoEletronico.class)
    public JAXBElement<ArrayOfPregaoEletronicoDTO> createProcessarPregaoEletronicoLstPregaoEletronicoDTO(ArrayOfPregaoEletronicoDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoDTO>(_ProcessarPregaoEletronicoLstPregaoEletronicoDTO_QNAME, ArrayOfPregaoEletronicoDTO.class, ProcessarPregaoEletronico.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMarca", scope = PregaoEletronicoItemLanceDTO.class)
    public JAXBElement<String> createPregaoEletronicoItemLanceDTOSDsMarca(String value) {
        return new JAXBElement<String>(_PregaoEletronicoItemLanceDTOSDsMarca_QNAME, String.class, PregaoEletronicoItemLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsModelo", scope = PregaoEletronicoItemLanceDTO.class)
    public JAXBElement<String> createPregaoEletronicoItemLanceDTOSDsModelo(String value) {
        return new JAXBElement<String>(_PregaoEletronicoItemLanceDTOSDsModelo_QNAME, String.class, PregaoEletronicoItemLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteLanceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPregaoEletronicoLoteLanceDTO", scope = PregaoEletronicoLoteDTO.class)
    public JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> createPregaoEletronicoLoteDTOLstPregaoEletronicoLoteLanceDTO(ArrayOfPregaoEletronicoLoteLanceDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO>(_PregaoEletronicoLoteDTOLstPregaoEletronicoLoteLanceDTO_QNAME, ArrayOfPregaoEletronicoLoteLanceDTO.class, PregaoEletronicoLoteDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPregaoEletronicoComissao", scope = PregaoEletronicoDTO.class)
    public JAXBElement<ArrayOfComissaoDTO> createPregaoEletronicoDTOLstPregaoEletronicoComissao(ArrayOfComissaoDTO value) {
        return new JAXBElement<ArrayOfComissaoDTO>(_PregaoEletronicoDTOLstPregaoEletronicoComissao_QNAME, ArrayOfComissaoDTO.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdAutoEncerramento", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONIdAutoEncerramento(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONIdAutoEncerramento_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsTermo", scope = PregaoEletronicoDTO.class)
    public JAXBElement<String> createPregaoEletronicoDTOSDsTermo(String value) {
        return new JAXBElement<String>(_PregaoEletronicoDTOSDsTermo_QNAME, String.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdAnexoNegociacao", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONIdAnexoNegociacao(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONIdAnexoNegociacao_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAplicaLei123", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlAplicaLei123(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlAplicaLei123_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlPermitirLance", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlPermitirLance(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlPermitirLance_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlTempoDisputa", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONVlTempoDisputa(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONVlTempoDisputa_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlNaturezaObjeto", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlNaturezaObjeto(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlNaturezaObjeto_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlProrrogaCondicao", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONVlProrrogaCondicao(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONVlProrrogaCondicao_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipoProcesso", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Long> createPregaoEletronicoDTONCdTipoProcesso(Long value) {
        return new JAXBElement<Long>(_PregaoEletronicoDTONCdTipoProcesso_QNAME, Long.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlPermiteFornecedorCadastroVencido", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlPermiteFornecedorCadastroVencido(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlPermiteFornecedorCadastroVencido_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdEstilo", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONIdEstilo(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONIdEstilo_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdHabilitacaoAnexo", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONIdHabilitacaoAnexo(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONIdHabilitacaoAnexo_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlHomologacaoParcial", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlHomologacaoParcial(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlHomologacaoParcial_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlMostrarReferencia", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlMostrarReferencia(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlMostrarReferencia_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPregaoEletronicoLoteDTO", scope = PregaoEletronicoDTO.class)
    public JAXBElement<ArrayOfPregaoEletronicoLoteDTO> createPregaoEletronicoDTOLstPregaoEletronicoLoteDTO(ArrayOfPregaoEletronicoLoteDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoLoteDTO>(_PregaoEletronicoDTOLstPregaoEletronicoLoteDTO_QNAME, ArrayOfPregaoEletronicoLoteDTO.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlRequerCRC", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlRequerCRC(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlRequerCRC_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlProrroga", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTONVlProrroga(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTONVlProrroga_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtPublicacao", scope = PregaoEletronicoDTO.class)
    public JAXBElement<XMLGregorianCalendar> createPregaoEletronicoDTOTDtPublicacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PregaoEletronicoDTOTDtPublicacao_QNAME, XMLGregorianCalendar.class, PregaoEletronicoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlObrigarDeclaracaoVendedor", scope = PregaoEletronicoDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoDTOBFlObrigarDeclaracaoVendedor(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoDTOBFlObrigarDeclaracaoVendedor_QNAME, Integer.class, PregaoEletronicoDTO.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarPregaoEletronicoResult", scope = ProcessarPregaoEletronicoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarPregaoEletronicoResponseProcessarPregaoEletronicoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarPregaoEletronicoResponseProcessarPregaoEletronicoResult_QNAME, RetornoDTO.class, ProcessarPregaoEletronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = PregaoEletronicoLoteLanceDTO.class)
    public JAXBElement<String> createPregaoEletronicoLoteLanceDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_PregaoEletronicoLoteLanceDTOSCdEmpresa_QNAME, String.class, PregaoEletronicoLoteLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = PregaoEletronicoLoteLanceDTO.class)
    public JAXBElement<String> createPregaoEletronicoLoteLanceDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_PregaoEletronicoLoteLanceDTOSDsJustificativa_QNAME, String.class, PregaoEletronicoLoteLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrRanking", scope = PregaoEletronicoLoteLanceDTO.class)
    public JAXBElement<Integer> createPregaoEletronicoLoteLanceDTONNrRanking(Integer value) {
        return new JAXBElement<Integer>(_PregaoEletronicoLoteLanceDTONNrRanking_QNAME, Integer.class, PregaoEletronicoLoteLanceDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HabilitarRetornarPregaoEletronicoResult", scope = HabilitarRetornarPregaoEletronicoResponse.class)
    public JAXBElement<RetornoDTO> createHabilitarRetornarPregaoEletronicoResponseHabilitarRetornarPregaoEletronicoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_HabilitarRetornarPregaoEletronicoResponseHabilitarRetornarPregaoEletronicoResult_QNAME, RetornoDTO.class, HabilitarRetornarPregaoEletronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = PregaoEletronicoPropostaDTO.class)
    public JAXBElement<String> createPregaoEletronicoPropostaDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_PregaoEletronicoPropostaDTOSDsObservacao_QNAME, String.class, PregaoEletronicoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = PregaoEletronicoPropostaDTO.class)
    public JAXBElement<String> createPregaoEletronicoPropostaDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_PregaoEletronicoLoteLanceDTOSCdEmpresa_QNAME, String.class, PregaoEletronicoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = PregaoEletronicoPropostaDTO.class)
    public JAXBElement<String> createPregaoEletronicoPropostaDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_PregaoEletronicoLoteLanceDTOSDsJustificativa_QNAME, String.class, PregaoEletronicoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMarca", scope = PregaoEletronicoPropostaDTO.class)
    public JAXBElement<String> createPregaoEletronicoPropostaDTOSDsMarca(String value) {
        return new JAXBElement<String>(_PregaoEletronicoItemLanceDTOSDsMarca_QNAME, String.class, PregaoEletronicoPropostaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarPregaoEletronicoResult", scope = RetornarPregaoEletronicoResponse.class)
    public JAXBElement<ArrayOfPregaoEletronicoDTO> createRetornarPregaoEletronicoResponseRetornarPregaoEletronicoResult(ArrayOfPregaoEletronicoDTO value) {
        return new JAXBElement<ArrayOfPregaoEletronicoDTO>(_RetornarPregaoEletronicoResponseRetornarPregaoEletronicoResult_QNAME, ArrayOfPregaoEletronicoDTO.class, RetornarPregaoEletronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHabilitarPregaoEletronicoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstHabilitarPregaoEletronicoDTO", scope = HabilitarRetornarPregaoEletronico.class)
    public JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> createHabilitarRetornarPregaoEletronicoLstHabilitarPregaoEletronicoDTO(ArrayOfHabilitarPregaoEletronicoDTO value) {
        return new JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO>(_HabilitarRetornarPregaoEletronicoLstHabilitarPregaoEletronicoDTO_QNAME, ArrayOfHabilitarPregaoEletronicoDTO.class, HabilitarRetornarPregaoEletronico.class, value);
    }

}
