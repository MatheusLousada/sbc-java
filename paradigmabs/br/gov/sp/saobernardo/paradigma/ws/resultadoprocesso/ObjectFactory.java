
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso package. 
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

    private final static QName _PProcessoItemResultadoDTOBFlHabilitado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlHabilitado");
    private final static QName _PProcessoItemResultadoDTONCdMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdMarca");
    private final static QName _PProcessoItemResultadoDTOSDsMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsMarca");
    private final static QName _PProcessoItemResultadoDTOSDsModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsModelo");
    private final static QName _PProcessoItemResultadoDTONStLance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nStLance");
    private final static QName _ArrayOfPProcessoResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoResultadoDTO");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfPProcessoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoItemDTO");
    private final static QName _CotacaoIntegracaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CotacaoIntegracaoDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _PProcessoOrdemCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoOrdemCompraDTO");
    private final static QName _ArrayOfPProcessoLiberacaoModalidadeDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoLiberacaoModalidadeDTO");
    private final static QName _ArrayOfPProcessoAnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoAnexoDTO");
    private final static QName _ArrayOfPProcessoLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoLoteDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _PProcessoAnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoAnexoDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _PProcessoLoteResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoLoteResultadoDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6kL");
    private final static QName _PProcessoItemEnderecoRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoItemEnderecoRequisicaoDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfDecisaoCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDecisaoCompraDTO");
    private final static QName _PProcessoLoteDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoLoteDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _PProcessoResultadoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoResultadoIdiomaDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _PProcessoLoteIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoLoteIdiomaDTO");
    private final static QName _PProcessoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoItemEnderecoDTO");
    private final static QName _PProcessoResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoResultadoDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _PProcessoLiberacaoModalidadeDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoLiberacaoModalidadeDTO");
    private final static QName _ArrayOfPProcessoLoteIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoLoteIdiomaDTO");
    private final static QName _IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6kL");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfPProcessoLiberacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoLiberacaoDTO");
    private final static QName _ArrayOfPProcessoItemEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoItemEnderecoDTO");
    private final static QName _ArrayOfPProcessoResultadoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoResultadoIdiomaDTO");
    private final static QName _PProcessoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoItemDTO");
    private final static QName _PProcessoLiberacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoLiberacaoDTO");
    private final static QName _ArrayOfPProcessoLoteResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoLoteResultadoDTO");
    private final static QName _PProcessoItemIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoItemIdiomaDTO");
    private final static QName _ArrayOfPProcessoItemIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoItemIdiomaDTO");
    private final static QName _PProcessoItemResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoItemResultadoDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfPProcessoOrdemCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoOrdemCompraDTO");
    private final static QName _ArrayOfPProcessoItemEnderecoRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoItemEnderecoRequisicaoDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _DecisaoCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DecisaoCompraDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6kL");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfCotacaoIntegracaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCotacaoIntegracaoDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _PProcessoConvidadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoConvidadoDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfPProcessoOrdemCompraRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoOrdemCompraRequisicaoDTO");
    private final static QName _ArrayOfPProcessoItemResultadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoItemResultadoDTO");
    private final static QName _PProcessoOrdemCompraRequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PProcessoOrdemCompraRequisicaoDTO");
    private final static QName _ArrayOfPProcessoConvidadoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPProcessoConvidadoDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PProcessoLoteResultadoDTONCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdMoeda");
    private final static QName _PProcessoLoteResultadoDTONStLoteLance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nStLoteLance");
    private final static QName _PProcessoLoteResultadoDTOSCdFornecedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFornecedor");
    private final static QName _PProcessoLoteResultadoDTOBFlBeneficiarioLei123_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlBeneficiarioLei123");
    private final static QName _ProcessarPProcessoLiberacaoPorModalidadeLstProcessoLiberacaoModalidadeDto_QNAME = new QName("http://tempuri.org/", "lstProcessoLiberacaoModalidadeDto");
    private final static QName _PProcessoResultadoDTONIdAutoEncerramento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdAutoEncerramento");
    private final static QName _PProcessoResultadoDTOBFlAplicaLei123_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAplicaLei123");
    private final static QName _PProcessoResultadoDTOLstPProcessoResultadoIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoResultadoIdioma");
    private final static QName _PProcessoResultadoDTONVlTempoDisputa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlTempoDisputa");
    private final static QName _PProcessoResultadoDTOBFlChatBilateral_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlChatBilateral");
    private final static QName _PProcessoResultadoDTONVlProrrogaCondicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlProrrogaCondicao");
    private final static QName _PProcessoResultadoDTONCdTipoProcesso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipoProcesso");
    private final static QName _PProcessoResultadoDTONIdSuperSimples_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdSuperSimples");
    private final static QName _PProcessoResultadoDTOLstPPProcessoOrdemCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPPProcessoOrdemCompra");
    private final static QName _PProcessoResultadoDTONCdPregaoTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdPregaoTipo");
    private final static QName _PProcessoResultadoDTOLstPProcessoAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoAnexo");
    private final static QName _PProcessoResultadoDTOBFlRequerCRC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlRequerCRC");
    private final static QName _PProcessoResultadoDTOSNrEdital_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrEdital");
    private final static QName _PProcessoResultadoDTONVlProrroga_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nVlProrroga");
    private final static QName _PProcessoResultadoDTOLstPProcessoLote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoLote");
    private final static QName _PProcessoResultadoDTOTDtPublicacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtPublicacao");
    private final static QName _PProcessoResultadoDTOTDtInicialDisputa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtInicialDisputa");
    private final static QName _PProcessoResultadoDTOBFlExigeCapacitacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlExigeCapacitacao");
    private final static QName _PProcessoResultadoDTOBFlObrigarDeclaracaoVendedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlObrigarDeclaracaoVendedor");
    private final static QName _DecisaoCompraDTOSNrCnpjFilial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpjFilial");
    private final static QName _DecisaoCompraDTOSCdRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdRequisicaoEmpresa");
    private final static QName _DecisaoCompraDTOSNrCnpjFornecedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpjFornecedor");
    private final static QName _RetornarPProcessoResultadoResponseRetornarPProcessoResultadoResult_QNAME = new QName("http://tempuri.org/", "RetornarPProcessoResultadoResult");
    private final static QName _PProcessoAnexoDTOSUrlAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sUrlAnexo");
    private final static QName _PesquisarProcessoCanceladoResponsePesquisarProcessoCanceladoResult_QNAME = new QName("http://tempuri.org/", "PesquisarProcessoCanceladoResult");
    private final static QName _PProcessoOrdemCompraDTOSCdGestao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGestao");
    private final static QName _ProcessarPProcessoLiberacaoPorModalidadeResponseProcessarPProcessoLiberacaoPorModalidadeResult_QNAME = new QName("http://tempuri.org/", "ProcessarPProcessoLiberacaoPorModalidadeResult");
    private final static QName _RetornarDecisaoCompraResponseRetornarDecisaoCompraResult_QNAME = new QName("http://tempuri.org/", "RetornarDecisaoCompraResult");
    private final static QName _PProcessoItemEnderecoDTOLstPProcessoItemEnderecoRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoItemEnderecoRequisicao");
    private final static QName _ProcessarPProcessoLiberacaoResponseProcessarPProcessoLiberacaoResult_QNAME = new QName("http://tempuri.org/", "ProcessarPProcessoLiberacaoResult");
    private final static QName _PProcessoLoteDTOLstPProcessoLoteIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoLoteIdioma");
    private final static QName _PProcessoLoteDTOLstPProcessoLoteResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoLoteResultado");
    private final static QName _ProcessarPProcessoLiberacaoLstProcessoLiberacaoDto_QNAME = new QName("http://tempuri.org/", "lstProcessoLiberacaoDto");
    private final static QName _PesquisarProcessoRealizadoResponsePesquisarProcessoRealizadoResult_QNAME = new QName("http://tempuri.org/", "PesquisarProcessoRealizadoResult");
    private final static QName _PProcessoItemDTOLstPProcessoItemIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstPProcessoItemIdioma");
    private final static QName _PProcessoItemDTOSCdPrazoEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdPrazoEntrega");
    private final static QName _PProcessoItemDTONCdLoteSequencial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdLoteSequencial");
    private final static QName _PProcessoItemDTOSCdLoteLegado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLoteLegado");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _PProcessoResultadoIdiomaDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _PProcessoResultadoIdiomaDTOSDsTermo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsTermo");
    private final static QName _PProcessoResultadoIdiomaDTOSDsObjeto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObjeto");
    private final static QName _PProcessoConvidadoDTOSDsJustificativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsJustificativa");
    private final static QName _PesquisarProcessoIniciadoResponsePesquisarProcessoIniciadoResult_QNAME = new QName("http://tempuri.org/", "PesquisarProcessoIniciadoResult");
    private final static QName _CotacaoIntegracaoDTOSCdUsuarioResponsavel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioResponsavel");
    private final static QName _CotacaoIntegracaoDTOSNrCnpj_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpj");
    private final static QName _CotacaoIntegracaoDTOSCdModalidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdModalidade");
    private final static QName _CotacaoIntegracaoDTOSCdProcesso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdProcesso");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoOrdemCompraRequisicaoDTO }
     * 
     */
    public ArrayOfPProcessoOrdemCompraRequisicaoDTO createArrayOfPProcessoOrdemCompraRequisicaoDTO() {
        return new ArrayOfPProcessoOrdemCompraRequisicaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoItemEnderecoDTO }
     * 
     */
    public ArrayOfPProcessoItemEnderecoDTO createArrayOfPProcessoItemEnderecoDTO() {
        return new ArrayOfPProcessoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link PProcessoResultadoDTO }
     * 
     */
    public PProcessoResultadoDTO createPProcessoResultadoDTO() {
        return new PProcessoResultadoDTO();
    }

    /**
     * Create an instance of {@link DecisaoCompraDTO }
     * 
     */
    public DecisaoCompraDTO createDecisaoCompraDTO() {
        return new DecisaoCompraDTO();
    }

    /**
     * Create an instance of {@link PProcessoItemEnderecoRequisicaoDTO }
     * 
     */
    public PProcessoItemEnderecoRequisicaoDTO createPProcessoItemEnderecoRequisicaoDTO() {
        return new PProcessoItemEnderecoRequisicaoDTO();
    }

    /**
     * Create an instance of {@link PProcessoLoteIdiomaDTO }
     * 
     */
    public PProcessoLoteIdiomaDTO createPProcessoLoteIdiomaDTO() {
        return new PProcessoLoteIdiomaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoItemResultadoDTO }
     * 
     */
    public ArrayOfPProcessoItemResultadoDTO createArrayOfPProcessoItemResultadoDTO() {
        return new ArrayOfPProcessoItemResultadoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoItemIdiomaDTO }
     * 
     */
    public ArrayOfPProcessoItemIdiomaDTO createArrayOfPProcessoItemIdiomaDTO() {
        return new ArrayOfPProcessoItemIdiomaDTO();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL createIdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link RetornarPProcessoResultado }
     * 
     */
    public RetornarPProcessoResultado createRetornarPProcessoResultado() {
        return new RetornarPProcessoResultado();
    }

    /**
     * Create an instance of {@link PProcessoOrdemCompraRequisicaoDTO }
     * 
     */
    public PProcessoOrdemCompraRequisicaoDTO createPProcessoOrdemCompraRequisicaoDTO() {
        return new PProcessoOrdemCompraRequisicaoDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoResultadoDTO }
     * 
     */
    public ArrayOfPProcessoResultadoDTO createArrayOfPProcessoResultadoDTO() {
        return new ArrayOfPProcessoResultadoDTO();
    }

    /**
     * Create an instance of {@link PProcessoLiberacaoDTO }
     * 
     */
    public PProcessoLiberacaoDTO createPProcessoLiberacaoDTO() {
        return new PProcessoLiberacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoLoteIdiomaDTO }
     * 
     */
    public ArrayOfPProcessoLoteIdiomaDTO createArrayOfPProcessoLoteIdiomaDTO() {
        return new ArrayOfPProcessoLoteIdiomaDTO();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL createIdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link ProcessarPProcessoLiberacaoPorModalidadeResponse }
     * 
     */
    public ProcessarPProcessoLiberacaoPorModalidadeResponse createProcessarPProcessoLiberacaoPorModalidadeResponse() {
        return new ProcessarPProcessoLiberacaoPorModalidadeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ProcessarPProcessoLiberacaoResponse }
     * 
     */
    public ProcessarPProcessoLiberacaoResponse createProcessarPProcessoLiberacaoResponse() {
        return new ProcessarPProcessoLiberacaoResponse();
    }

    /**
     * Create an instance of {@link PProcessoItemEnderecoDTO }
     * 
     */
    public PProcessoItemEnderecoDTO createPProcessoItemEnderecoDTO() {
        return new PProcessoItemEnderecoDTO();
    }

    /**
     * Create an instance of {@link ProcessarPProcessoLiberacao }
     * 
     */
    public ProcessarPProcessoLiberacao createProcessarPProcessoLiberacao() {
        return new ProcessarPProcessoLiberacao();
    }

    /**
     * Create an instance of {@link PProcessoItemDTO }
     * 
     */
    public PProcessoItemDTO createPProcessoItemDTO() {
        return new PProcessoItemDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link PesquisarProcessoCancelado }
     * 
     */
    public PesquisarProcessoCancelado createPesquisarProcessoCancelado() {
        return new PesquisarProcessoCancelado();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoLiberacaoModalidadeDTO }
     * 
     */
    public ArrayOfPProcessoLiberacaoModalidadeDTO createArrayOfPProcessoLiberacaoModalidadeDTO() {
        return new ArrayOfPProcessoLiberacaoModalidadeDTO();
    }

    /**
     * Create an instance of {@link CotacaoIntegracaoDTO }
     * 
     */
    public CotacaoIntegracaoDTO createCotacaoIntegracaoDTO() {
        return new CotacaoIntegracaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfDecisaoCompraDTO }
     * 
     */
    public ArrayOfDecisaoCompraDTO createArrayOfDecisaoCompraDTO() {
        return new ArrayOfDecisaoCompraDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCotacaoIntegracaoDTO }
     * 
     */
    public ArrayOfCotacaoIntegracaoDTO createArrayOfCotacaoIntegracaoDTO() {
        return new ArrayOfCotacaoIntegracaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoOrdemCompraDTO }
     * 
     */
    public ArrayOfPProcessoOrdemCompraDTO createArrayOfPProcessoOrdemCompraDTO() {
        return new ArrayOfPProcessoOrdemCompraDTO();
    }

    /**
     * Create an instance of {@link PProcessoLoteResultadoDTO }
     * 
     */
    public PProcessoLoteResultadoDTO createPProcessoLoteResultadoDTO() {
        return new PProcessoLoteResultadoDTO();
    }

    /**
     * Create an instance of {@link PesquisarProcessoIniciado }
     * 
     */
    public PesquisarProcessoIniciado createPesquisarProcessoIniciado() {
        return new PesquisarProcessoIniciado();
    }

    /**
     * Create an instance of {@link PProcessoAnexoDTO }
     * 
     */
    public PProcessoAnexoDTO createPProcessoAnexoDTO() {
        return new PProcessoAnexoDTO();
    }

    /**
     * Create an instance of {@link PesquisarProcessoCanceladoResponse }
     * 
     */
    public PesquisarProcessoCanceladoResponse createPesquisarProcessoCanceladoResponse() {
        return new PesquisarProcessoCanceladoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoLoteDTO }
     * 
     */
    public ArrayOfPProcessoLoteDTO createArrayOfPProcessoLoteDTO() {
        return new ArrayOfPProcessoLoteDTO();
    }

    /**
     * Create an instance of {@link PProcessoOrdemCompraDTO }
     * 
     */
    public PProcessoOrdemCompraDTO createPProcessoOrdemCompraDTO() {
        return new PProcessoOrdemCompraDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoItemEnderecoRequisicaoDTO }
     * 
     */
    public ArrayOfPProcessoItemEnderecoRequisicaoDTO createArrayOfPProcessoItemEnderecoRequisicaoDTO() {
        return new ArrayOfPProcessoItemEnderecoRequisicaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoLiberacaoDTO }
     * 
     */
    public ArrayOfPProcessoLiberacaoDTO createArrayOfPProcessoLiberacaoDTO() {
        return new ArrayOfPProcessoLiberacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoConvidadoDTO }
     * 
     */
    public ArrayOfPProcessoConvidadoDTO createArrayOfPProcessoConvidadoDTO() {
        return new ArrayOfPProcessoConvidadoDTO();
    }

    /**
     * Create an instance of {@link PProcessoResultadoIdiomaDTO }
     * 
     */
    public PProcessoResultadoIdiomaDTO createPProcessoResultadoIdiomaDTO() {
        return new PProcessoResultadoIdiomaDTO();
    }

    /**
     * Create an instance of {@link PesquisarProcessoIniciadoResponse }
     * 
     */
    public PesquisarProcessoIniciadoResponse createPesquisarProcessoIniciadoResponse() {
        return new PesquisarProcessoIniciadoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoResultadoIdiomaDTO }
     * 
     */
    public ArrayOfPProcessoResultadoIdiomaDTO createArrayOfPProcessoResultadoIdiomaDTO() {
        return new ArrayOfPProcessoResultadoIdiomaDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link PProcessoItemResultadoDTO }
     * 
     */
    public PProcessoItemResultadoDTO createPProcessoItemResultadoDTO() {
        return new PProcessoItemResultadoDTO();
    }

    /**
     * Create an instance of {@link RetornarDecisaoCompra }
     * 
     */
    public RetornarDecisaoCompra createRetornarDecisaoCompra() {
        return new RetornarDecisaoCompra();
    }

    /**
     * Create an instance of {@link PesquisarProcessoRealizado }
     * 
     */
    public PesquisarProcessoRealizado createPesquisarProcessoRealizado() {
        return new PesquisarProcessoRealizado();
    }

    /**
     * Create an instance of {@link PProcessoLiberacaoModalidadeDTO }
     * 
     */
    public PProcessoLiberacaoModalidadeDTO createPProcessoLiberacaoModalidadeDTO() {
        return new PProcessoLiberacaoModalidadeDTO();
    }

    /**
     * Create an instance of {@link ProcessarPProcessoLiberacaoPorModalidade }
     * 
     */
    public ProcessarPProcessoLiberacaoPorModalidade createProcessarPProcessoLiberacaoPorModalidade() {
        return new ProcessarPProcessoLiberacaoPorModalidade();
    }

    /**
     * Create an instance of {@link RetornarPProcessoResultadoResponse }
     * 
     */
    public RetornarPProcessoResultadoResponse createRetornarPProcessoResultadoResponse() {
        return new RetornarPProcessoResultadoResponse();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL createIdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoItemDTO }
     * 
     */
    public ArrayOfPProcessoItemDTO createArrayOfPProcessoItemDTO() {
        return new ArrayOfPProcessoItemDTO();
    }

    /**
     * Create an instance of {@link RetornarDecisaoCompraResponse }
     * 
     */
    public RetornarDecisaoCompraResponse createRetornarDecisaoCompraResponse() {
        return new RetornarDecisaoCompraResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoAnexoDTO }
     * 
     */
    public ArrayOfPProcessoAnexoDTO createArrayOfPProcessoAnexoDTO() {
        return new ArrayOfPProcessoAnexoDTO();
    }

    /**
     * Create an instance of {@link PProcessoLoteDTO }
     * 
     */
    public PProcessoLoteDTO createPProcessoLoteDTO() {
        return new PProcessoLoteDTO();
    }

    /**
     * Create an instance of {@link PesquisarProcessoRealizadoResponse }
     * 
     */
    public PesquisarProcessoRealizadoResponse createPesquisarProcessoRealizadoResponse() {
        return new PesquisarProcessoRealizadoResponse();
    }

    /**
     * Create an instance of {@link PProcessoConvidadoDTO }
     * 
     */
    public PProcessoConvidadoDTO createPProcessoConvidadoDTO() {
        return new PProcessoConvidadoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPProcessoLoteResultadoDTO }
     * 
     */
    public ArrayOfPProcessoLoteResultadoDTO createArrayOfPProcessoLoteResultadoDTO() {
        return new ArrayOfPProcessoLoteResultadoDTO();
    }

    /**
     * Create an instance of {@link PProcessoItemIdiomaDTO }
     * 
     */
    public PProcessoItemIdiomaDTO createPProcessoItemIdiomaDTO() {
        return new PProcessoItemIdiomaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlHabilitado", scope = PProcessoItemResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoItemResultadoDTOBFlHabilitado(Integer value) {
        return new JAXBElement<Integer>(_PProcessoItemResultadoDTOBFlHabilitado_QNAME, Integer.class, PProcessoItemResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdMarca", scope = PProcessoItemResultadoDTO.class)
    public JAXBElement<Long> createPProcessoItemResultadoDTONCdMarca(Long value) {
        return new JAXBElement<Long>(_PProcessoItemResultadoDTONCdMarca_QNAME, Long.class, PProcessoItemResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMarca", scope = PProcessoItemResultadoDTO.class)
    public JAXBElement<String> createPProcessoItemResultadoDTOSDsMarca(String value) {
        return new JAXBElement<String>(_PProcessoItemResultadoDTOSDsMarca_QNAME, String.class, PProcessoItemResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsModelo", scope = PProcessoItemResultadoDTO.class)
    public JAXBElement<String> createPProcessoItemResultadoDTOSDsModelo(String value) {
        return new JAXBElement<String>(_PProcessoItemResultadoDTOSDsModelo_QNAME, String.class, PProcessoItemResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nStLance", scope = PProcessoItemResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoItemResultadoDTONStLance(Integer value) {
        return new JAXBElement<Integer>(_PProcessoItemResultadoDTONStLance_QNAME, Integer.class, PProcessoItemResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoResultadoDTO")
    public JAXBElement<ArrayOfPProcessoResultadoDTO> createArrayOfPProcessoResultadoDTO(ArrayOfPProcessoResultadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoResultadoDTO>(_ArrayOfPProcessoResultadoDTO_QNAME, ArrayOfPProcessoResultadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoItemDTO")
    public JAXBElement<ArrayOfPProcessoItemDTO> createArrayOfPProcessoItemDTO(ArrayOfPProcessoItemDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemDTO>(_ArrayOfPProcessoItemDTO_QNAME, ArrayOfPProcessoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoIntegracaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CotacaoIntegracaoDTO")
    public JAXBElement<CotacaoIntegracaoDTO> createCotacaoIntegracaoDTO(CotacaoIntegracaoDTO value) {
        return new JAXBElement<CotacaoIntegracaoDTO>(_CotacaoIntegracaoDTO_QNAME, CotacaoIntegracaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoOrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoOrdemCompraDTO")
    public JAXBElement<PProcessoOrdemCompraDTO> createPProcessoOrdemCompraDTO(PProcessoOrdemCompraDTO value) {
        return new JAXBElement<PProcessoOrdemCompraDTO>(_PProcessoOrdemCompraDTO_QNAME, PProcessoOrdemCompraDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoModalidadeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoLiberacaoModalidadeDTO")
    public JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> createArrayOfPProcessoLiberacaoModalidadeDTO(ArrayOfPProcessoLiberacaoModalidadeDTO value) {
        return new JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO>(_ArrayOfPProcessoLiberacaoModalidadeDTO_QNAME, ArrayOfPProcessoLiberacaoModalidadeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoAnexoDTO")
    public JAXBElement<ArrayOfPProcessoAnexoDTO> createArrayOfPProcessoAnexoDTO(ArrayOfPProcessoAnexoDTO value) {
        return new JAXBElement<ArrayOfPProcessoAnexoDTO>(_ArrayOfPProcessoAnexoDTO_QNAME, ArrayOfPProcessoAnexoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoLoteDTO")
    public JAXBElement<ArrayOfPProcessoLoteDTO> createArrayOfPProcessoLoteDTO(ArrayOfPProcessoLoteDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteDTO>(_ArrayOfPProcessoLoteDTO_QNAME, ArrayOfPProcessoLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoAnexoDTO")
    public JAXBElement<PProcessoAnexoDTO> createPProcessoAnexoDTO(PProcessoAnexoDTO value) {
        return new JAXBElement<PProcessoAnexoDTO>(_PProcessoAnexoDTO_QNAME, PProcessoAnexoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoLoteResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoLoteResultadoDTO")
    public JAXBElement<PProcessoLoteResultadoDTO> createPProcessoLoteResultadoDTO(PProcessoLoteResultadoDTO value) {
        return new JAXBElement<PProcessoLoteResultadoDTO>(_PProcessoLoteResultadoDTO_QNAME, PProcessoLoteResultadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL> createIdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL(IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL>(_IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoItemEnderecoRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoItemEnderecoRequisicaoDTO")
    public JAXBElement<PProcessoItemEnderecoRequisicaoDTO> createPProcessoItemEnderecoRequisicaoDTO(PProcessoItemEnderecoRequisicaoDTO value) {
        return new JAXBElement<PProcessoItemEnderecoRequisicaoDTO>(_PProcessoItemEnderecoRequisicaoDTO_QNAME, PProcessoItemEnderecoRequisicaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDecisaoCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDecisaoCompraDTO")
    public JAXBElement<ArrayOfDecisaoCompraDTO> createArrayOfDecisaoCompraDTO(ArrayOfDecisaoCompraDTO value) {
        return new JAXBElement<ArrayOfDecisaoCompraDTO>(_ArrayOfDecisaoCompraDTO_QNAME, ArrayOfDecisaoCompraDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoLoteDTO")
    public JAXBElement<PProcessoLoteDTO> createPProcessoLoteDTO(PProcessoLoteDTO value) {
        return new JAXBElement<PProcessoLoteDTO>(_PProcessoLoteDTO_QNAME, PProcessoLoteDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoResultadoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoResultadoIdiomaDTO")
    public JAXBElement<PProcessoResultadoIdiomaDTO> createPProcessoResultadoIdiomaDTO(PProcessoResultadoIdiomaDTO value) {
        return new JAXBElement<PProcessoResultadoIdiomaDTO>(_PProcessoResultadoIdiomaDTO_QNAME, PProcessoResultadoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", name = "DtoBase")
    public JAXBElement<DtoBase> createDtoBase(DtoBase value) {
        return new JAXBElement<DtoBase>(_DtoBase_QNAME, DtoBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoLoteIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoLoteIdiomaDTO")
    public JAXBElement<PProcessoLoteIdiomaDTO> createPProcessoLoteIdiomaDTO(PProcessoLoteIdiomaDTO value) {
        return new JAXBElement<PProcessoLoteIdiomaDTO>(_PProcessoLoteIdiomaDTO_QNAME, PProcessoLoteIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoItemEnderecoDTO")
    public JAXBElement<PProcessoItemEnderecoDTO> createPProcessoItemEnderecoDTO(PProcessoItemEnderecoDTO value) {
        return new JAXBElement<PProcessoItemEnderecoDTO>(_PProcessoItemEnderecoDTO_QNAME, PProcessoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoResultadoDTO")
    public JAXBElement<PProcessoResultadoDTO> createPProcessoResultadoDTO(PProcessoResultadoDTO value) {
        return new JAXBElement<PProcessoResultadoDTO>(_PProcessoResultadoDTO_QNAME, PProcessoResultadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoLiberacaoModalidadeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoLiberacaoModalidadeDTO")
    public JAXBElement<PProcessoLiberacaoModalidadeDTO> createPProcessoLiberacaoModalidadeDTO(PProcessoLiberacaoModalidadeDTO value) {
        return new JAXBElement<PProcessoLiberacaoModalidadeDTO>(_PProcessoLiberacaoModalidadeDTO_QNAME, PProcessoLiberacaoModalidadeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoLoteIdiomaDTO")
    public JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> createArrayOfPProcessoLoteIdiomaDTO(ArrayOfPProcessoLoteIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteIdiomaDTO>(_ArrayOfPProcessoLoteIdiomaDTO_QNAME, ArrayOfPProcessoLoteIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL> createIdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL(IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL>(_IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfPProcessoItemIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoLiberacaoDTO")
    public JAXBElement<ArrayOfPProcessoLiberacaoDTO> createArrayOfPProcessoLiberacaoDTO(ArrayOfPProcessoLiberacaoDTO value) {
        return new JAXBElement<ArrayOfPProcessoLiberacaoDTO>(_ArrayOfPProcessoLiberacaoDTO_QNAME, ArrayOfPProcessoLiberacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoItemEnderecoDTO")
    public JAXBElement<ArrayOfPProcessoItemEnderecoDTO> createArrayOfPProcessoItemEnderecoDTO(ArrayOfPProcessoItemEnderecoDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemEnderecoDTO>(_ArrayOfPProcessoItemEnderecoDTO_QNAME, ArrayOfPProcessoItemEnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoResultadoIdiomaDTO")
    public JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> createArrayOfPProcessoResultadoIdiomaDTO(ArrayOfPProcessoResultadoIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO>(_ArrayOfPProcessoResultadoIdiomaDTO_QNAME, ArrayOfPProcessoResultadoIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoItemDTO")
    public JAXBElement<PProcessoItemDTO> createPProcessoItemDTO(PProcessoItemDTO value) {
        return new JAXBElement<PProcessoItemDTO>(_PProcessoItemDTO_QNAME, PProcessoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoLiberacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoLiberacaoDTO")
    public JAXBElement<PProcessoLiberacaoDTO> createPProcessoLiberacaoDTO(PProcessoLiberacaoDTO value) {
        return new JAXBElement<PProcessoLiberacaoDTO>(_PProcessoLiberacaoDTO_QNAME, PProcessoLiberacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoLoteResultadoDTO")
    public JAXBElement<ArrayOfPProcessoLoteResultadoDTO> createArrayOfPProcessoLoteResultadoDTO(ArrayOfPProcessoLoteResultadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteResultadoDTO>(_ArrayOfPProcessoLoteResultadoDTO_QNAME, ArrayOfPProcessoLoteResultadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoItemIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoItemIdiomaDTO")
    public JAXBElement<PProcessoItemIdiomaDTO> createPProcessoItemIdiomaDTO(PProcessoItemIdiomaDTO value) {
        return new JAXBElement<PProcessoItemIdiomaDTO>(_PProcessoItemIdiomaDTO_QNAME, PProcessoItemIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoItemIdiomaDTO")
    public JAXBElement<ArrayOfPProcessoItemIdiomaDTO> createArrayOfPProcessoItemIdiomaDTO(ArrayOfPProcessoItemIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemIdiomaDTO>(_ArrayOfPProcessoItemIdiomaDTO_QNAME, ArrayOfPProcessoItemIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoItemResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoItemResultadoDTO")
    public JAXBElement<PProcessoItemResultadoDTO> createPProcessoItemResultadoDTO(PProcessoItemResultadoDTO value) {
        return new JAXBElement<PProcessoItemResultadoDTO>(_PProcessoItemResultadoDTO_QNAME, PProcessoItemResultadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoOrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoOrdemCompraDTO")
    public JAXBElement<ArrayOfPProcessoOrdemCompraDTO> createArrayOfPProcessoOrdemCompraDTO(ArrayOfPProcessoOrdemCompraDTO value) {
        return new JAXBElement<ArrayOfPProcessoOrdemCompraDTO>(_ArrayOfPProcessoOrdemCompraDTO_QNAME, ArrayOfPProcessoOrdemCompraDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemEnderecoRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoItemEnderecoRequisicaoDTO")
    public JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> createArrayOfPProcessoItemEnderecoRequisicaoDTO(ArrayOfPProcessoItemEnderecoRequisicaoDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO>(_ArrayOfPProcessoItemEnderecoRequisicaoDTO_QNAME, ArrayOfPProcessoItemEnderecoRequisicaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisaoCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DecisaoCompraDTO")
    public JAXBElement<DecisaoCompraDTO> createDecisaoCompraDTO(DecisaoCompraDTO value) {
        return new JAXBElement<DecisaoCompraDTO>(_DecisaoCompraDTO_QNAME, DecisaoCompraDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL> createIdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL(IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL>(_IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfPProcessoResultadoIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCotacaoIntegracaoDTO")
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> createArrayOfCotacaoIntegracaoDTO(ArrayOfCotacaoIntegracaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoIntegracaoDTO>(_ArrayOfCotacaoIntegracaoDTO_QNAME, ArrayOfCotacaoIntegracaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoConvidadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoConvidadoDTO")
    public JAXBElement<PProcessoConvidadoDTO> createPProcessoConvidadoDTO(PProcessoConvidadoDTO value) {
        return new JAXBElement<PProcessoConvidadoDTO>(_PProcessoConvidadoDTO_QNAME, PProcessoConvidadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoOrdemCompraRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoOrdemCompraRequisicaoDTO")
    public JAXBElement<ArrayOfPProcessoOrdemCompraRequisicaoDTO> createArrayOfPProcessoOrdemCompraRequisicaoDTO(ArrayOfPProcessoOrdemCompraRequisicaoDTO value) {
        return new JAXBElement<ArrayOfPProcessoOrdemCompraRequisicaoDTO>(_ArrayOfPProcessoOrdemCompraRequisicaoDTO_QNAME, ArrayOfPProcessoOrdemCompraRequisicaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoItemResultadoDTO")
    public JAXBElement<ArrayOfPProcessoItemResultadoDTO> createArrayOfPProcessoItemResultadoDTO(ArrayOfPProcessoItemResultadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemResultadoDTO>(_ArrayOfPProcessoItemResultadoDTO_QNAME, ArrayOfPProcessoItemResultadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PProcessoOrdemCompraRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PProcessoOrdemCompraRequisicaoDTO")
    public JAXBElement<PProcessoOrdemCompraRequisicaoDTO> createPProcessoOrdemCompraRequisicaoDTO(PProcessoOrdemCompraRequisicaoDTO value) {
        return new JAXBElement<PProcessoOrdemCompraRequisicaoDTO>(_PProcessoOrdemCompraRequisicaoDTO_QNAME, PProcessoOrdemCompraRequisicaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoConvidadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPProcessoConvidadoDTO")
    public JAXBElement<ArrayOfPProcessoConvidadoDTO> createArrayOfPProcessoConvidadoDTO(ArrayOfPProcessoConvidadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoConvidadoDTO>(_ArrayOfPProcessoConvidadoDTO_QNAME, ArrayOfPProcessoConvidadoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdMoeda", scope = PProcessoLoteResultadoDTO.class)
    public JAXBElement<Long> createPProcessoLoteResultadoDTONCdMoeda(Long value) {
        return new JAXBElement<Long>(_PProcessoLoteResultadoDTONCdMoeda_QNAME, Long.class, PProcessoLoteResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlHabilitado", scope = PProcessoLoteResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoLoteResultadoDTOBFlHabilitado(Integer value) {
        return new JAXBElement<Integer>(_PProcessoItemResultadoDTOBFlHabilitado_QNAME, Integer.class, PProcessoLoteResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nStLoteLance", scope = PProcessoLoteResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoLoteResultadoDTONStLoteLance(Integer value) {
        return new JAXBElement<Integer>(_PProcessoLoteResultadoDTONStLoteLance_QNAME, Integer.class, PProcessoLoteResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFornecedor", scope = PProcessoLoteResultadoDTO.class)
    public JAXBElement<String> createPProcessoLoteResultadoDTOSCdFornecedor(String value) {
        return new JAXBElement<String>(_PProcessoLoteResultadoDTOSCdFornecedor_QNAME, String.class, PProcessoLoteResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlBeneficiarioLei123", scope = PProcessoLoteResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoLoteResultadoDTOBFlBeneficiarioLei123(Integer value) {
        return new JAXBElement<Integer>(_PProcessoLoteResultadoDTOBFlBeneficiarioLei123_QNAME, Integer.class, PProcessoLoteResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoModalidadeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProcessoLiberacaoModalidadeDto", scope = ProcessarPProcessoLiberacaoPorModalidade.class)
    public JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> createProcessarPProcessoLiberacaoPorModalidadeLstProcessoLiberacaoModalidadeDto(ArrayOfPProcessoLiberacaoModalidadeDTO value) {
        return new JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO>(_ProcessarPProcessoLiberacaoPorModalidadeLstProcessoLiberacaoModalidadeDto_QNAME, ArrayOfPProcessoLiberacaoModalidadeDTO.class, ProcessarPProcessoLiberacaoPorModalidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdAutoEncerramento", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONIdAutoEncerramento(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONIdAutoEncerramento_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAplicaLei123", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTOBFlAplicaLei123(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTOBFlAplicaLei123_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoResultadoIdioma", scope = PProcessoResultadoDTO.class)
    public JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> createPProcessoResultadoDTOLstPProcessoResultadoIdioma(ArrayOfPProcessoResultadoIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO>(_PProcessoResultadoDTOLstPProcessoResultadoIdioma_QNAME, ArrayOfPProcessoResultadoIdiomaDTO.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlTempoDisputa", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONVlTempoDisputa(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONVlTempoDisputa_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlChatBilateral", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTOBFlChatBilateral(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTOBFlChatBilateral_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlProrrogaCondicao", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONVlProrrogaCondicao(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONVlProrrogaCondicao_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipoProcesso", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONCdTipoProcesso(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONCdTipoProcesso_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdSuperSimples", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONIdSuperSimples(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONIdSuperSimples_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoOrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPPProcessoOrdemCompra", scope = PProcessoResultadoDTO.class)
    public JAXBElement<ArrayOfPProcessoOrdemCompraDTO> createPProcessoResultadoDTOLstPPProcessoOrdemCompra(ArrayOfPProcessoOrdemCompraDTO value) {
        return new JAXBElement<ArrayOfPProcessoOrdemCompraDTO>(_PProcessoResultadoDTOLstPPProcessoOrdemCompra_QNAME, ArrayOfPProcessoOrdemCompraDTO.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdPregaoTipo", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONCdPregaoTipo(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONCdPregaoTipo_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoAnexo", scope = PProcessoResultadoDTO.class)
    public JAXBElement<ArrayOfPProcessoAnexoDTO> createPProcessoResultadoDTOLstPProcessoAnexo(ArrayOfPProcessoAnexoDTO value) {
        return new JAXBElement<ArrayOfPProcessoAnexoDTO>(_PProcessoResultadoDTOLstPProcessoAnexo_QNAME, ArrayOfPProcessoAnexoDTO.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlRequerCRC", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTOBFlRequerCRC(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTOBFlRequerCRC_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrEdital", scope = PProcessoResultadoDTO.class)
    public JAXBElement<String> createPProcessoResultadoDTOSNrEdital(String value) {
        return new JAXBElement<String>(_PProcessoResultadoDTOSNrEdital_QNAME, String.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nVlProrroga", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTONVlProrroga(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTONVlProrroga_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoLote", scope = PProcessoResultadoDTO.class)
    public JAXBElement<ArrayOfPProcessoLoteDTO> createPProcessoResultadoDTOLstPProcessoLote(ArrayOfPProcessoLoteDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteDTO>(_PProcessoResultadoDTOLstPProcessoLote_QNAME, ArrayOfPProcessoLoteDTO.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtPublicacao", scope = PProcessoResultadoDTO.class)
    public JAXBElement<XMLGregorianCalendar> createPProcessoResultadoDTOTDtPublicacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PProcessoResultadoDTOTDtPublicacao_QNAME, XMLGregorianCalendar.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtInicialDisputa", scope = PProcessoResultadoDTO.class)
    public JAXBElement<XMLGregorianCalendar> createPProcessoResultadoDTOTDtInicialDisputa(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PProcessoResultadoDTOTDtInicialDisputa_QNAME, XMLGregorianCalendar.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlExigeCapacitacao", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTOBFlExigeCapacitacao(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTOBFlExigeCapacitacao_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlObrigarDeclaracaoVendedor", scope = PProcessoResultadoDTO.class)
    public JAXBElement<Integer> createPProcessoResultadoDTOBFlObrigarDeclaracaoVendedor(Integer value) {
        return new JAXBElement<Integer>(_PProcessoResultadoDTOBFlObrigarDeclaracaoVendedor_QNAME, Integer.class, PProcessoResultadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpjFilial", scope = DecisaoCompraDTO.class)
    public JAXBElement<String> createDecisaoCompraDTOSNrCnpjFilial(String value) {
        return new JAXBElement<String>(_DecisaoCompraDTOSNrCnpjFilial_QNAME, String.class, DecisaoCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRequisicaoEmpresa", scope = DecisaoCompraDTO.class)
    public JAXBElement<String> createDecisaoCompraDTOSCdRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_DecisaoCompraDTOSCdRequisicaoEmpresa_QNAME, String.class, DecisaoCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpjFornecedor", scope = DecisaoCompraDTO.class)
    public JAXBElement<String> createDecisaoCompraDTOSNrCnpjFornecedor(String value) {
        return new JAXBElement<String>(_DecisaoCompraDTOSNrCnpjFornecedor_QNAME, String.class, DecisaoCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarPProcessoResultadoResult", scope = RetornarPProcessoResultadoResponse.class)
    public JAXBElement<ArrayOfPProcessoResultadoDTO> createRetornarPProcessoResultadoResponseRetornarPProcessoResultadoResult(ArrayOfPProcessoResultadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoResultadoDTO>(_RetornarPProcessoResultadoResponseRetornarPProcessoResultadoResult_QNAME, ArrayOfPProcessoResultadoDTO.class, RetornarPProcessoResultadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sUrlAnexo", scope = PProcessoAnexoDTO.class)
    public JAXBElement<String> createPProcessoAnexoDTOSUrlAnexo(String value) {
        return new JAXBElement<String>(_PProcessoAnexoDTOSUrlAnexo_QNAME, String.class, PProcessoAnexoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PesquisarProcessoCanceladoResult", scope = PesquisarProcessoCanceladoResponse.class)
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> createPesquisarProcessoCanceladoResponsePesquisarProcessoCanceladoResult(ArrayOfCotacaoIntegracaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoIntegracaoDTO>(_PesquisarProcessoCanceladoResponsePesquisarProcessoCanceladoResult_QNAME, ArrayOfCotacaoIntegracaoDTO.class, PesquisarProcessoCanceladoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = PProcessoOrdemCompraDTO.class)
    public JAXBElement<String> createPProcessoOrdemCompraDTOSCdGestao(String value) {
        return new JAXBElement<String>(_PProcessoOrdemCompraDTOSCdGestao_QNAME, String.class, PProcessoOrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarPProcessoLiberacaoPorModalidadeResult", scope = ProcessarPProcessoLiberacaoPorModalidadeResponse.class)
    public JAXBElement<RetornoDTO> createProcessarPProcessoLiberacaoPorModalidadeResponseProcessarPProcessoLiberacaoPorModalidadeResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarPProcessoLiberacaoPorModalidadeResponseProcessarPProcessoLiberacaoPorModalidadeResult_QNAME, RetornoDTO.class, ProcessarPProcessoLiberacaoPorModalidadeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDecisaoCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarDecisaoCompraResult", scope = RetornarDecisaoCompraResponse.class)
    public JAXBElement<ArrayOfDecisaoCompraDTO> createRetornarDecisaoCompraResponseRetornarDecisaoCompraResult(ArrayOfDecisaoCompraDTO value) {
        return new JAXBElement<ArrayOfDecisaoCompraDTO>(_RetornarDecisaoCompraResponseRetornarDecisaoCompraResult_QNAME, ArrayOfDecisaoCompraDTO.class, RetornarDecisaoCompraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemEnderecoRequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoItemEnderecoRequisicao", scope = PProcessoItemEnderecoDTO.class)
    public JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> createPProcessoItemEnderecoDTOLstPProcessoItemEnderecoRequisicao(ArrayOfPProcessoItemEnderecoRequisicaoDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO>(_PProcessoItemEnderecoDTOLstPProcessoItemEnderecoRequisicao_QNAME, ArrayOfPProcessoItemEnderecoRequisicaoDTO.class, PProcessoItemEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarPProcessoLiberacaoResult", scope = ProcessarPProcessoLiberacaoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarPProcessoLiberacaoResponseProcessarPProcessoLiberacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarPProcessoLiberacaoResponseProcessarPProcessoLiberacaoResult_QNAME, RetornoDTO.class, ProcessarPProcessoLiberacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoLoteIdioma", scope = PProcessoLoteDTO.class)
    public JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> createPProcessoLoteDTOLstPProcessoLoteIdioma(ArrayOfPProcessoLoteIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteIdiomaDTO>(_PProcessoLoteDTOLstPProcessoLoteIdioma_QNAME, ArrayOfPProcessoLoteIdiomaDTO.class, PProcessoLoteDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteResultadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoLoteResultado", scope = PProcessoLoteDTO.class)
    public JAXBElement<ArrayOfPProcessoLoteResultadoDTO> createPProcessoLoteDTOLstPProcessoLoteResultado(ArrayOfPProcessoLoteResultadoDTO value) {
        return new JAXBElement<ArrayOfPProcessoLoteResultadoDTO>(_PProcessoLoteDTOLstPProcessoLoteResultado_QNAME, ArrayOfPProcessoLoteResultadoDTO.class, PProcessoLoteDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProcessoLiberacaoDto", scope = ProcessarPProcessoLiberacao.class)
    public JAXBElement<ArrayOfPProcessoLiberacaoDTO> createProcessarPProcessoLiberacaoLstProcessoLiberacaoDto(ArrayOfPProcessoLiberacaoDTO value) {
        return new JAXBElement<ArrayOfPProcessoLiberacaoDTO>(_ProcessarPProcessoLiberacaoLstProcessoLiberacaoDto_QNAME, ArrayOfPProcessoLiberacaoDTO.class, ProcessarPProcessoLiberacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PesquisarProcessoRealizadoResult", scope = PesquisarProcessoRealizadoResponse.class)
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> createPesquisarProcessoRealizadoResponsePesquisarProcessoRealizadoResult(ArrayOfCotacaoIntegracaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoIntegracaoDTO>(_PesquisarProcessoRealizadoResponsePesquisarProcessoRealizadoResult_QNAME, ArrayOfCotacaoIntegracaoDTO.class, PesquisarProcessoRealizadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstPProcessoItemIdioma", scope = PProcessoItemDTO.class)
    public JAXBElement<ArrayOfPProcessoItemIdiomaDTO> createPProcessoItemDTOLstPProcessoItemIdioma(ArrayOfPProcessoItemIdiomaDTO value) {
        return new JAXBElement<ArrayOfPProcessoItemIdiomaDTO>(_PProcessoItemDTOLstPProcessoItemIdioma_QNAME, ArrayOfPProcessoItemIdiomaDTO.class, PProcessoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPrazoEntrega", scope = PProcessoItemDTO.class)
    public JAXBElement<String> createPProcessoItemDTOSCdPrazoEntrega(String value) {
        return new JAXBElement<String>(_PProcessoItemDTOSCdPrazoEntrega_QNAME, String.class, PProcessoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdLoteSequencial", scope = PProcessoItemDTO.class)
    public JAXBElement<Integer> createPProcessoItemDTONCdLoteSequencial(Integer value) {
        return new JAXBElement<Integer>(_PProcessoItemDTONCdLoteSequencial_QNAME, Integer.class, PProcessoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdLoteLegado", scope = PProcessoItemDTO.class)
    public JAXBElement<String> createPProcessoItemDTOSCdLoteLegado(String value) {
        return new JAXBElement<String>(_PProcessoItemDTOSCdLoteLegado_QNAME, String.class, PProcessoItemDTO.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = PProcessoResultadoIdiomaDTO.class)
    public JAXBElement<String> createPProcessoResultadoIdiomaDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_PProcessoResultadoIdiomaDTOSDsObservacao_QNAME, String.class, PProcessoResultadoIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsTermo", scope = PProcessoResultadoIdiomaDTO.class)
    public JAXBElement<String> createPProcessoResultadoIdiomaDTOSDsTermo(String value) {
        return new JAXBElement<String>(_PProcessoResultadoIdiomaDTOSDsTermo_QNAME, String.class, PProcessoResultadoIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObjeto", scope = PProcessoResultadoIdiomaDTO.class)
    public JAXBElement<String> createPProcessoResultadoIdiomaDTOSDsObjeto(String value) {
        return new JAXBElement<String>(_PProcessoResultadoIdiomaDTOSDsObjeto_QNAME, String.class, PProcessoResultadoIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlHabilitado", scope = PProcessoConvidadoDTO.class)
    public JAXBElement<Integer> createPProcessoConvidadoDTOBFlHabilitado(Integer value) {
        return new JAXBElement<Integer>(_PProcessoItemResultadoDTOBFlHabilitado_QNAME, Integer.class, PProcessoConvidadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = PProcessoConvidadoDTO.class)
    public JAXBElement<String> createPProcessoConvidadoDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_PProcessoConvidadoDTOSDsJustificativa_QNAME, String.class, PProcessoConvidadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlBeneficiarioLei123", scope = PProcessoConvidadoDTO.class)
    public JAXBElement<Integer> createPProcessoConvidadoDTOBFlBeneficiarioLei123(Integer value) {
        return new JAXBElement<Integer>(_PProcessoLoteResultadoDTOBFlBeneficiarioLei123_QNAME, Integer.class, PProcessoConvidadoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PesquisarProcessoIniciadoResult", scope = PesquisarProcessoIniciadoResponse.class)
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> createPesquisarProcessoIniciadoResponsePesquisarProcessoIniciadoResult(ArrayOfCotacaoIntegracaoDTO value) {
        return new JAXBElement<ArrayOfCotacaoIntegracaoDTO>(_PesquisarProcessoIniciadoResponsePesquisarProcessoIniciadoResult_QNAME, ArrayOfCotacaoIntegracaoDTO.class, PesquisarProcessoIniciadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioResponsavel", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSCdUsuarioResponsavel(String value) {
        return new JAXBElement<String>(_CotacaoIntegracaoDTOSCdUsuarioResponsavel_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRequisicaoEmpresa", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSCdRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_DecisaoCompraDTOSCdRequisicaoEmpresa_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpj", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSNrCnpj(String value) {
        return new JAXBElement<String>(_CotacaoIntegracaoDTOSNrCnpj_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpjFornecedor", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSNrCnpjFornecedor(String value) {
        return new JAXBElement<String>(_DecisaoCompraDTOSNrCnpjFornecedor_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdModalidade", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSCdModalidade(String value) {
        return new JAXBElement<String>(_CotacaoIntegracaoDTOSCdModalidade_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdProcesso", scope = CotacaoIntegracaoDTO.class)
    public JAXBElement<String> createCotacaoIntegracaoDTOSCdProcesso(String value) {
        return new JAXBElement<String>(_CotacaoIntegracaoDTOSCdProcesso_QNAME, String.class, CotacaoIntegracaoDTO.class, value);
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
