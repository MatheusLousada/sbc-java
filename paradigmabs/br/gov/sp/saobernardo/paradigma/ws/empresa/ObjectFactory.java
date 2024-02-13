
package br.gov.sp.saobernardo.paradigma.ws.empresa;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.empresa package. 
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

    private final static QName _ProcessarEmpresaAvaliacaoResponseProcessarEmpresaAvaliacaoResult_QNAME = new QName("http://tempuri.org/", "ProcessarEmpresaAvaliacaoResult");
    private final static QName _RetornarEmpresaIntegracaoFalhaLstLog_QNAME = new QName("http://tempuri.org/", "lstLog");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _TipoContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "TipoContatoDTO");
    private final static QName _ArrayOfEmpresaEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaEnderecoDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfEmpresaClasseDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaClasseDTO");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _EmpresaBloqueioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaBloqueioDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfEmpresaBancoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaBancoDTO");
    private final static QName _DocumentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DocumentoDTO");
    private final static QName _EmpresaRepresentanteSocioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaRepresentanteSocioDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _EmpresaContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaContatoDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfFornecedorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfFornecedorDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ProcessoLeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProcessoLeilaoDTO");
    private final static QName _EmpresaEnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaEnderecoDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _EmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaDTO");
    private final static QName _ArrayOfProcessoLeilaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProcessoLeilaoDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfCrcHistoricoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCrcHistoricoDTO");
    private final static QName _ArrayOfEmpresaBloqueioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaBloqueioDTO");
    private final static QName _EmpresaBancoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaBancoDTO");
    private final static QName _ProcessoCotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProcessoCotacaoDTO");
    private final static QName _ArrayOfWbtLogCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogCapaDTO");
    private final static QName _EmpresaAvaliacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaAvaliacaoDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfProcessoCotacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProcessoCotacaoDTO");
    private final static QName _ArrayOfEmpresaRepresentanteSocioDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaRepresentanteSocioDTO");
    private final static QName _FornecedorDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "FornecedorDTO");
    private final static QName _RetornoListaX003CEmpresaDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_EmpresaDTO_x003E_");
    private final static QName _CrcHistoricoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CrcHistoricoDTO");
    private final static QName _ArrayOfEmpresaAvaliacaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaAvaliacaoDTO");
    private final static QName _ArrayOfDocumentoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfDocumentoDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfEmpresaContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaContatoDTO");
    private final static QName _EnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EnderecoDTO");
    private final static QName _ArrayOfEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfTipoContatoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfTipoContatoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _WbtLogCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogCapaDTO");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _EmpresaClasseDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaClasseDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _EmpresaAvaliacaoDTOSNrDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrDocumento");
    private final static QName _EmpresaAvaliacaoDTOSCdUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuario");
    private final static QName _RetornarEmpresaParticipanteResponseRetornarEmpresaParticipanteResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaParticipanteResult");
    private final static QName _EnderecoDTOSDsComplemento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsComplemento");
    private final static QName _RetornarEmpresaVerificacaoDeparaResponseRetornarEmpresaVerificacaoDeparaResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaVerificacaoDeparaResult");
    private final static QName _EmpresaBancoDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _EmpresaBancoDTONCdTipoConta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipoConta");
    private final static QName _EmpresaBancoDTOSCdPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdPais");
    private final static QName _EmpresaBancoDTOSNmTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmTitular");
    private final static QName _RetornarEmpresaCompradoraPorNomeResponseRetornarEmpresaCompradoraPorNomeResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaCompradoraPorNomeResult");
    private final static QName _RetornarEmpresaPorCodigoWBCResponseRetornarEmpresaPorCodigoWBCResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaPorCodigoWBCResult");
    private final static QName _RetornarEmpresaIntegracaoLstUsuarioHomologador_QNAME = new QName("http://tempuri.org/", "lstUsuarioHomologador");
    private final static QName _RetornarEmpresaIntegracaoSNrCnpj_QNAME = new QName("http://tempuri.org/", "sNrCnpj");
    private final static QName _RetornarEmpresaIntegracaoSCdEmpresaErp_QNAME = new QName("http://tempuri.org/", "sCdEmpresaErp");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _EmpresaRepresentanteSocioDTOSNrTelefone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefone");
    private final static QName _EmpresaRepresentanteSocioDTOSNrTelefoneDDD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrTelefoneDDD");
    private final static QName _EmpresaRepresentanteSocioDTOSDsEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsEndereco");
    private final static QName _RetornarEmpresaVencedoraSemDeParaResponseRetornarEmpresaVencedoraSemDeParaResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaVencedoraSemDeParaResult");
    private final static QName _RetornarFornecedorIntegracaoResponseRetornarFornecedorIntegracaoResult_QNAME = new QName("http://tempuri.org/", "RetornarFornecedorIntegracaoResult");
    private final static QName _RetornarEmpresaCotacaoResponseRetornarEmpresaCotacaoResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaCotacaoResult");
    private final static QName _FornecedorDTOSDsContatoDDD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsContatoDDD");
    private final static QName _FornecedorDTOLstEmpresaEnderecoInstitucional_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaEnderecoInstitucional");
    private final static QName _FornecedorDTOLstEmpresaEnderecoEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaEnderecoEntrega");
    private final static QName _FornecedorDTOLstEmpresaBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaBanco");
    private final static QName _FornecedorDTOSNrCnpj_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpj");
    private final static QName _FornecedorDTOSDsContatoFone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsContatoFone");
    private final static QName _FornecedorDTOLstEmpresaEnderecoCobranca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaEnderecoCobranca");
    private final static QName _FornecedorDTOSNrInscricaoEstadual_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrInscricaoEstadual");
    private final static QName _RetornarEmpresaIntegracaoFalhaResponseRetornarEmpresaIntegracaoFalhaResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaIntegracaoFalhaResult");
    private final static QName _EmpresaContatoDTOSDsCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsCargo");
    private final static QName _EmpresaContatoDTOLstDocumentoContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDocumentoContato");
    private final static QName _EmpresaContatoDTOSDsEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsEmail");
    private final static QName _EmpresaContatoDTOSNrCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCelular");
    private final static QName _EmpresaContatoDTOLstTipoContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstTipoContato");
    private final static QName _EmpresaContatoDTONCdContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdContato");
    private final static QName _EmpresaContatoDTOSNrRamal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrRamal");
    private final static QName _RetornarEmpresaCotacaoLstProcessoCotacaoDTO_QNAME = new QName("http://tempuri.org/", "lstProcessoCotacaoDTO");
    private final static QName _RetornarEmpresaSemDeParaResponseRetornarEmpresaSemDeParaResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaSemDeParaResult");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _RetornarEmpresaCompradoraPorNomeNCdSituacao_QNAME = new QName("http://tempuri.org/", "nCdSituacao");
    private final static QName _RetornarEmpresaCompradoraPorNomeSNmEmpresa_QNAME = new QName("http://tempuri.org/", "sNmEmpresa");
    private final static QName _RetornarEmpresaPorCnpjCnpj_QNAME = new QName("http://tempuri.org/", "Cnpj");
    private final static QName _ProcessoLeilaoDTOSCdLeilaoWBC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdLeilaoWBC");
    private final static QName _EmpresaDTOBFlAtividadeComercial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAtividadeComercial");
    private final static QName _EmpresaDTODVlPatrimonioLiquido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlPatrimonioLiquido");
    private final static QName _EmpresaDTOBFlAtividadeIndustrial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAtividadeIndustrial");
    private final static QName _EmpresaDTOSNrEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrEndereco");
    private final static QName _EmpresaDTOTDtIntegralizacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtIntegralizacao");
    private final static QName _EmpresaDTOSCdCnae_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCnae");
    private final static QName _EmpresaDTOSNrFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrFax");
    private final static QName _EmpresaDTOTDtCadastro_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtCadastro");
    private final static QName _EmpresaDTONNrNotaAvaliacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrNotaAvaliacao");
    private final static QName _EmpresaDTOSCdAtividadeMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAtividadeMap");
    private final static QName _EmpresaDTOTDtInicioAtividade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtInicioAtividade");
    private final static QName _EmpresaDTOBFlAreaInfluencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAreaInfluencia");
    private final static QName _EmpresaDTOSCdUsarioHomologador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsarioHomologador");
    private final static QName _EmpresaDTONIdTipoPessoa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoPessoa");
    private final static QName _EmpresaDTOSDsEnderecoComplemento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsEnderecoComplemento");
    private final static QName _EmpresaDTOSNmApelido_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmApelido");
    private final static QName _EmpresaDTOSNrInscricaoMunicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrInscricaoMunicial");
    private final static QName _EmpresaDTOSDsEmailContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsEmailContato");
    private final static QName _EmpresaDTOSNrCnpjMatriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpjMatriz");
    private final static QName _EmpresaDTODVlCapitalIntegralizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlCapitalIntegralizado");
    private final static QName _EmpresaDTOLstEmpresaEnderecoFaturamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaEnderecoFaturamento");
    private final static QName _EmpresaDTOBFlAssinaturaDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAssinaturaDigital");
    private final static QName _EmpresaDTOSNrInscricaoMunicipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrInscricaoMunicipal");
    private final static QName _EmpresaDTONIdSuperSimples_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdSuperSimples");
    private final static QName _EmpresaDTONNrAutoAvaliacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrAutoAvaliacao");
    private final static QName _EmpresaDTOSSgGrupoConta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgGrupoConta");
    private final static QName _EmpresaDTOSCdNaturezaJuridica_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNaturezaJuridica");
    private final static QName _EmpresaDTOLstDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstDocumento");
    private final static QName _EmpresaDTODVlCapitalSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlCapitalSocial");
    private final static QName _EmpresaDTOSCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMoeda");
    private final static QName _EmpresaDTOBFlAtividadeServico_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAtividadeServico");
    private final static QName _EmpresaDTOLstEmpresaContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaContato");
    private final static QName _EmpresaDTOLstEmpresaRepresentanteSocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaRepresentanteSocio");
    private final static QName _EmpresaDTOSDsUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUrl");
    private final static QName _EmpresaDTOBFlAssinaturaEletronica_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlAssinaturaEletronica");
    private final static QName _EmpresaDTOSCdEmpresaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCliente");
    private final static QName _EmpresaDTOSNmContato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmContato");
    private final static QName _EmpresaDTOSCdEmpresaEnvio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEnvio");
    private final static QName _EmpresaDTONCdEmpresaWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdEmpresaWbc");
    private final static QName _EmpresaDTOTDtValidadeCadastro_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "tDtValidadeCadastro");
    private final static QName _EmpresaDTOLstEmpresaClasse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaClasse");
    private final static QName _ProcessarEmpresaResponseProcessarEmpresaResult_QNAME = new QName("http://tempuri.org/", "ProcessarEmpresaResult");
    private final static QName _ProcessarEmpresaBloqueioLstEmpresaBloqueio_QNAME = new QName("http://tempuri.org/", "lstEmpresaBloqueio");
    private final static QName _RetornarEmpresaResponseRetornarEmpresaResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaResult");
    private final static QName _RetornarEmpresaLeilaoLstProcessoLeilaoDTO_QNAME = new QName("http://tempuri.org/", "lstProcessoLeilaoDTO");
    private final static QName _ProcessarEmpresaLstEmpresa_QNAME = new QName("http://tempuri.org/", "lstEmpresa");
    private final static QName _RetornarEmpresaIntegracaoResponseRetornarEmpresaIntegracaoResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaIntegracaoResult");
    private final static QName _CriarDeParaFornecedorCasoNaoExistaResponseCriarDeParaFornecedorCasoNaoExistaResult_QNAME = new QName("http://tempuri.org/", "CriarDeParaFornecedorCasoNaoExistaResult");
    private final static QName _ProcessarEmpresaBloqueioResponseProcessarEmpresaBloqueioResult_QNAME = new QName("http://tempuri.org/", "ProcessarEmpresaBloqueioResult");
    private final static QName _EmpresaEnderecoDTOSCdEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEstado");
    private final static QName _RetornarEmpresaPorCnpjResponseRetornarEmpresaPorCnpjResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaPorCnpjResult");
    private final static QName _RetornarEmpresaLeilaoResponseRetornarEmpresaLeilaoResult_QNAME = new QName("http://tempuri.org/", "RetornarEmpresaLeilaoResult");
    private final static QName _WbtLogCapaDTOLstLogItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstLogItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.empresa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessarEmpresaAvaliacaoResponse }
     * 
     */
    public ProcessarEmpresaAvaliacaoResponse createProcessarEmpresaAvaliacaoResponse() {
        return new ProcessarEmpresaAvaliacaoResponse();
    }

    /**
     * Create an instance of {@link EmpresaAvaliacaoDTO }
     * 
     */
    public EmpresaAvaliacaoDTO createEmpresaAvaliacaoDTO() {
        return new EmpresaAvaliacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaBloqueioDTO }
     * 
     */
    public ArrayOfEmpresaBloqueioDTO createArrayOfEmpresaBloqueioDTO() {
        return new ArrayOfEmpresaBloqueioDTO();
    }

    /**
     * Create an instance of {@link EnderecoDTO }
     * 
     */
    public EnderecoDTO createEnderecoDTO() {
        return new EnderecoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaAvaliacaoDTO }
     * 
     */
    public ArrayOfEmpresaAvaliacaoDTO createArrayOfEmpresaAvaliacaoDTO() {
        return new ArrayOfEmpresaAvaliacaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfFornecedorDTO }
     * 
     */
    public ArrayOfFornecedorDTO createArrayOfFornecedorDTO() {
        return new ArrayOfFornecedorDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaIntegracao }
     * 
     */
    public RetornarEmpresaIntegracao createRetornarEmpresaIntegracao() {
        return new RetornarEmpresaIntegracao();
    }

    /**
     * Create an instance of {@link RetornarEmpresaCompradoraPorNomeResponse }
     * 
     */
    public RetornarEmpresaCompradoraPorNomeResponse createRetornarEmpresaCompradoraPorNomeResponse() {
        return new RetornarEmpresaCompradoraPorNomeResponse();
    }

    /**
     * Create an instance of {@link EmpresaBloqueioDTO }
     * 
     */
    public EmpresaBloqueioDTO createEmpresaBloqueioDTO() {
        return new EmpresaBloqueioDTO();
    }

    /**
     * Create an instance of {@link EmpresaClasseDTO }
     * 
     */
    public EmpresaClasseDTO createEmpresaClasseDTO() {
        return new EmpresaClasseDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link RetornarFornecedorIntegracaoResponse }
     * 
     */
    public RetornarFornecedorIntegracaoResponse createRetornarFornecedorIntegracaoResponse() {
        return new RetornarFornecedorIntegracaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProcessoCotacaoDTO }
     * 
     */
    public ArrayOfProcessoCotacaoDTO createArrayOfProcessoCotacaoDTO() {
        return new ArrayOfProcessoCotacaoDTO();
    }

    /**
     * Create an instance of {@link CrcHistoricoDTO }
     * 
     */
    public CrcHistoricoDTO createCrcHistoricoDTO() {
        return new CrcHistoricoDTO();
    }

    /**
     * Create an instance of {@link FornecedorDTO }
     * 
     */
    public FornecedorDTO createFornecedorDTO() {
        return new FornecedorDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaIntegracaoFalhaResponse }
     * 
     */
    public RetornarEmpresaIntegracaoFalhaResponse createRetornarEmpresaIntegracaoFalhaResponse() {
        return new RetornarEmpresaIntegracaoFalhaResponse();
    }

    /**
     * Create an instance of {@link EmpresaContatoDTO }
     * 
     */
    public EmpresaContatoDTO createEmpresaContatoDTO() {
        return new EmpresaContatoDTO();
    }

    /**
     * Create an instance of {@link DocumentoDTO }
     * 
     */
    public DocumentoDTO createDocumentoDTO() {
        return new DocumentoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaSemDeParaResponse }
     * 
     */
    public RetornarEmpresaSemDeParaResponse createRetornarEmpresaSemDeParaResponse() {
        return new RetornarEmpresaSemDeParaResponse();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresa }
     * 
     */
    public RetornarEmpresa createRetornarEmpresa() {
        return new RetornarEmpresa();
    }

    /**
     * Create an instance of {@link RetornarEmpresaCompradoraPorNome }
     * 
     */
    public RetornarEmpresaCompradoraPorNome createRetornarEmpresaCompradoraPorNome() {
        return new RetornarEmpresaCompradoraPorNome();
    }

    /**
     * Create an instance of {@link RetornarEmpresaPorCnpj }
     * 
     */
    public RetornarEmpresaPorCnpj createRetornarEmpresaPorCnpj() {
        return new RetornarEmpresaPorCnpj();
    }

    /**
     * Create an instance of {@link ProcessarEmpresaResponse }
     * 
     */
    public ProcessarEmpresaResponse createProcessarEmpresaResponse() {
        return new ProcessarEmpresaResponse();
    }

    /**
     * Create an instance of {@link CriarDeParaFornecedorCasoNaoExista }
     * 
     */
    public CriarDeParaFornecedorCasoNaoExista createCriarDeParaFornecedorCasoNaoExista() {
        return new CriarDeParaFornecedorCasoNaoExista();
    }

    /**
     * Create an instance of {@link RetornoListaX003CEmpresaDTOX003E }
     * 
     */
    public RetornoListaX003CEmpresaDTOX003E createRetornoListaX003CEmpresaDTOX003E() {
        return new RetornoListaX003CEmpresaDTOX003E();
    }

    /**
     * Create an instance of {@link ProcessarEmpresaAvaliacao }
     * 
     */
    public ProcessarEmpresaAvaliacao createProcessarEmpresaAvaliacao() {
        return new ProcessarEmpresaAvaliacao();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogCapaDTO }
     * 
     */
    public ArrayOfWbtLogCapaDTO createArrayOfWbtLogCapaDTO() {
        return new ArrayOfWbtLogCapaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfTipoContatoDTO }
     * 
     */
    public ArrayOfTipoContatoDTO createArrayOfTipoContatoDTO() {
        return new ArrayOfTipoContatoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaBancoDTO }
     * 
     */
    public ArrayOfEmpresaBancoDTO createArrayOfEmpresaBancoDTO() {
        return new ArrayOfEmpresaBancoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaIntegracaoResponse }
     * 
     */
    public RetornarEmpresaIntegracaoResponse createRetornarEmpresaIntegracaoResponse() {
        return new RetornarEmpresaIntegracaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaRepresentanteSocioDTO }
     * 
     */
    public ArrayOfEmpresaRepresentanteSocioDTO createArrayOfEmpresaRepresentanteSocioDTO() {
        return new ArrayOfEmpresaRepresentanteSocioDTO();
    }

    /**
     * Create an instance of {@link EmpresaEnderecoDTO }
     * 
     */
    public EmpresaEnderecoDTO createEmpresaEnderecoDTO() {
        return new EmpresaEnderecoDTO();
    }

    /**
     * Create an instance of {@link WbtLogCapaDTO }
     * 
     */
    public WbtLogCapaDTO createWbtLogCapaDTO() {
        return new WbtLogCapaDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaIntegracaoFalha }
     * 
     */
    public RetornarEmpresaIntegracaoFalha createRetornarEmpresaIntegracaoFalha() {
        return new RetornarEmpresaIntegracaoFalha();
    }

    /**
     * Create an instance of {@link RetornarEmpresaParticipanteResponse }
     * 
     */
    public RetornarEmpresaParticipanteResponse createRetornarEmpresaParticipanteResponse() {
        return new RetornarEmpresaParticipanteResponse();
    }

    /**
     * Create an instance of {@link RetornarEmpresaVerificacaoDeparaResponse }
     * 
     */
    public RetornarEmpresaVerificacaoDeparaResponse createRetornarEmpresaVerificacaoDeparaResponse() {
        return new RetornarEmpresaVerificacaoDeparaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaClasseDTO }
     * 
     */
    public ArrayOfEmpresaClasseDTO createArrayOfEmpresaClasseDTO() {
        return new ArrayOfEmpresaClasseDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaEnderecoDTO }
     * 
     */
    public ArrayOfEmpresaEnderecoDTO createArrayOfEmpresaEnderecoDTO() {
        return new ArrayOfEmpresaEnderecoDTO();
    }

    /**
     * Create an instance of {@link EmpresaBancoDTO }
     * 
     */
    public EmpresaBancoDTO createEmpresaBancoDTO() {
        return new EmpresaBancoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaVencedoraSemDePara }
     * 
     */
    public RetornarEmpresaVencedoraSemDePara createRetornarEmpresaVencedoraSemDePara() {
        return new RetornarEmpresaVencedoraSemDePara();
    }

    /**
     * Create an instance of {@link ArrayOfProcessoLeilaoDTO }
     * 
     */
    public ArrayOfProcessoLeilaoDTO createArrayOfProcessoLeilaoDTO() {
        return new ArrayOfProcessoLeilaoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaPorCodigoWBCResponse }
     * 
     */
    public RetornarEmpresaPorCodigoWBCResponse createRetornarEmpresaPorCodigoWBCResponse() {
        return new RetornarEmpresaPorCodigoWBCResponse();
    }

    /**
     * Create an instance of {@link RetornarFornecedorIntegracao }
     * 
     */
    public RetornarFornecedorIntegracao createRetornarFornecedorIntegracao() {
        return new RetornarFornecedorIntegracao();
    }

    /**
     * Create an instance of {@link EmpresaRepresentanteSocioDTO }
     * 
     */
    public EmpresaRepresentanteSocioDTO createEmpresaRepresentanteSocioDTO() {
        return new EmpresaRepresentanteSocioDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaVencedoraSemDeParaResponse }
     * 
     */
    public RetornarEmpresaVencedoraSemDeParaResponse createRetornarEmpresaVencedoraSemDeParaResponse() {
        return new RetornarEmpresaVencedoraSemDeParaResponse();
    }

    /**
     * Create an instance of {@link RetornarEmpresaCotacaoResponse }
     * 
     */
    public RetornarEmpresaCotacaoResponse createRetornarEmpresaCotacaoResponse() {
        return new RetornarEmpresaCotacaoResponse();
    }

    /**
     * Create an instance of {@link RetornarEmpresaCotacao }
     * 
     */
    public RetornarEmpresaCotacao createRetornarEmpresaCotacao() {
        return new RetornarEmpresaCotacao();
    }

    /**
     * Create an instance of {@link ArrayOfCrcHistoricoDTO }
     * 
     */
    public ArrayOfCrcHistoricoDTO createArrayOfCrcHistoricoDTO() {
        return new ArrayOfCrcHistoricoDTO();
    }

    /**
     * Create an instance of {@link ProcessoLeilaoDTO }
     * 
     */
    public ProcessoLeilaoDTO createProcessoLeilaoDTO() {
        return new ProcessoLeilaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link EmpresaDTO }
     * 
     */
    public EmpresaDTO createEmpresaDTO() {
        return new EmpresaDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaPorCodigoWBC }
     * 
     */
    public RetornarEmpresaPorCodigoWBC createRetornarEmpresaPorCodigoWBC() {
        return new RetornarEmpresaPorCodigoWBC();
    }

    /**
     * Create an instance of {@link ProcessoCotacaoDTO }
     * 
     */
    public ProcessoCotacaoDTO createProcessoCotacaoDTO() {
        return new ProcessoCotacaoDTO();
    }

    /**
     * Create an instance of {@link ProcessarEmpresaBloqueio }
     * 
     */
    public ProcessarEmpresaBloqueio createProcessarEmpresaBloqueio() {
        return new ProcessarEmpresaBloqueio();
    }

    /**
     * Create an instance of {@link RetornarEmpresaResponse }
     * 
     */
    public RetornarEmpresaResponse createRetornarEmpresaResponse() {
        return new RetornarEmpresaResponse();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaContatoDTO }
     * 
     */
    public ArrayOfEmpresaContatoDTO createArrayOfEmpresaContatoDTO() {
        return new ArrayOfEmpresaContatoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaLeilao }
     * 
     */
    public RetornarEmpresaLeilao createRetornarEmpresaLeilao() {
        return new RetornarEmpresaLeilao();
    }

    /**
     * Create an instance of {@link ProcessarEmpresa }
     * 
     */
    public ProcessarEmpresa createProcessarEmpresa() {
        return new ProcessarEmpresa();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaDTO }
     * 
     */
    public ArrayOfEmpresaDTO createArrayOfEmpresaDTO() {
        return new ArrayOfEmpresaDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaVerificacaoDepara }
     * 
     */
    public RetornarEmpresaVerificacaoDepara createRetornarEmpresaVerificacaoDepara() {
        return new RetornarEmpresaVerificacaoDepara();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoDTO }
     * 
     */
    public ArrayOfDocumentoDTO createArrayOfDocumentoDTO() {
        return new ArrayOfDocumentoDTO();
    }

    /**
     * Create an instance of {@link CriarDeParaFornecedorCasoNaoExistaResponse }
     * 
     */
    public CriarDeParaFornecedorCasoNaoExistaResponse createCriarDeParaFornecedorCasoNaoExistaResponse() {
        return new CriarDeParaFornecedorCasoNaoExistaResponse();
    }

    /**
     * Create an instance of {@link ProcessarEmpresaBloqueioResponse }
     * 
     */
    public ProcessarEmpresaBloqueioResponse createProcessarEmpresaBloqueioResponse() {
        return new ProcessarEmpresaBloqueioResponse();
    }

    /**
     * Create an instance of {@link RetornarEmpresaPorCnpjResponse }
     * 
     */
    public RetornarEmpresaPorCnpjResponse createRetornarEmpresaPorCnpjResponse() {
        return new RetornarEmpresaPorCnpjResponse();
    }

    /**
     * Create an instance of {@link RetornarEmpresaParticipante }
     * 
     */
    public RetornarEmpresaParticipante createRetornarEmpresaParticipante() {
        return new RetornarEmpresaParticipante();
    }

    /**
     * Create an instance of {@link RetornarEmpresaSemDePara }
     * 
     */
    public RetornarEmpresaSemDePara createRetornarEmpresaSemDePara() {
        return new RetornarEmpresaSemDePara();
    }

    /**
     * Create an instance of {@link TipoContatoDTO }
     * 
     */
    public TipoContatoDTO createTipoContatoDTO() {
        return new TipoContatoDTO();
    }

    /**
     * Create an instance of {@link RetornarEmpresaLeilaoResponse }
     * 
     */
    public RetornarEmpresaLeilaoResponse createRetornarEmpresaLeilaoResponse() {
        return new RetornarEmpresaLeilaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEmpresaAvaliacaoResult", scope = ProcessarEmpresaAvaliacaoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEmpresaAvaliacaoResponseProcessarEmpresaAvaliacaoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEmpresaAvaliacaoResponseProcessarEmpresaAvaliacaoResult_QNAME, RetornoDTO.class, ProcessarEmpresaAvaliacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLog", scope = RetornarEmpresaIntegracaoFalha.class)
    public JAXBElement<ArrayOfWbtLogCapaDTO> createRetornarEmpresaIntegracaoFalhaLstLog(ArrayOfWbtLogCapaDTO value) {
        return new JAXBElement<ArrayOfWbtLogCapaDTO>(_RetornarEmpresaIntegracaoFalhaLstLog_QNAME, ArrayOfWbtLogCapaDTO.class, RetornarEmpresaIntegracaoFalha.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "TipoContatoDTO")
    public JAXBElement<TipoContatoDTO> createTipoContatoDTO(TipoContatoDTO value) {
        return new JAXBElement<TipoContatoDTO>(_TipoContatoDTO_QNAME, TipoContatoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaEnderecoDTO")
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createArrayOfEmpresaEnderecoDTO(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_ArrayOfEmpresaEnderecoDTO_QNAME, ArrayOfEmpresaEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaClasseDTO")
    public JAXBElement<ArrayOfEmpresaClasseDTO> createArrayOfEmpresaClasseDTO(ArrayOfEmpresaClasseDTO value) {
        return new JAXBElement<ArrayOfEmpresaClasseDTO>(_ArrayOfEmpresaClasseDTO_QNAME, ArrayOfEmpresaClasseDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaBloqueioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaBloqueioDTO")
    public JAXBElement<EmpresaBloqueioDTO> createEmpresaBloqueioDTO(EmpresaBloqueioDTO value) {
        return new JAXBElement<EmpresaBloqueioDTO>(_EmpresaBloqueioDTO_QNAME, EmpresaBloqueioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaBancoDTO")
    public JAXBElement<ArrayOfEmpresaBancoDTO> createArrayOfEmpresaBancoDTO(ArrayOfEmpresaBancoDTO value) {
        return new JAXBElement<ArrayOfEmpresaBancoDTO>(_ArrayOfEmpresaBancoDTO_QNAME, ArrayOfEmpresaBancoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DocumentoDTO")
    public JAXBElement<DocumentoDTO> createDocumentoDTO(DocumentoDTO value) {
        return new JAXBElement<DocumentoDTO>(_DocumentoDTO_QNAME, DocumentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaRepresentanteSocioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaRepresentanteSocioDTO")
    public JAXBElement<EmpresaRepresentanteSocioDTO> createEmpresaRepresentanteSocioDTO(EmpresaRepresentanteSocioDTO value) {
        return new JAXBElement<EmpresaRepresentanteSocioDTO>(_EmpresaRepresentanteSocioDTO_QNAME, EmpresaRepresentanteSocioDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaContatoDTO")
    public JAXBElement<EmpresaContatoDTO> createEmpresaContatoDTO(EmpresaContatoDTO value) {
        return new JAXBElement<EmpresaContatoDTO>(_EmpresaContatoDTO_QNAME, EmpresaContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFornecedorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfFornecedorDTO")
    public JAXBElement<ArrayOfFornecedorDTO> createArrayOfFornecedorDTO(ArrayOfFornecedorDTO value) {
        return new JAXBElement<ArrayOfFornecedorDTO>(_ArrayOfFornecedorDTO_QNAME, ArrayOfFornecedorDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessoLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProcessoLeilaoDTO")
    public JAXBElement<ProcessoLeilaoDTO> createProcessoLeilaoDTO(ProcessoLeilaoDTO value) {
        return new JAXBElement<ProcessoLeilaoDTO>(_ProcessoLeilaoDTO_QNAME, ProcessoLeilaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaEnderecoDTO")
    public JAXBElement<EmpresaEnderecoDTO> createEmpresaEnderecoDTO(EmpresaEnderecoDTO value) {
        return new JAXBElement<EmpresaEnderecoDTO>(_EmpresaEnderecoDTO_QNAME, EmpresaEnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaDTO")
    public JAXBElement<EmpresaDTO> createEmpresaDTO(EmpresaDTO value) {
        return new JAXBElement<EmpresaDTO>(_EmpresaDTO_QNAME, EmpresaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrcHistoricoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCrcHistoricoDTO")
    public JAXBElement<ArrayOfCrcHistoricoDTO> createArrayOfCrcHistoricoDTO(ArrayOfCrcHistoricoDTO value) {
        return new JAXBElement<ArrayOfCrcHistoricoDTO>(_ArrayOfCrcHistoricoDTO_QNAME, ArrayOfCrcHistoricoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBloqueioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaBloqueioDTO")
    public JAXBElement<ArrayOfEmpresaBloqueioDTO> createArrayOfEmpresaBloqueioDTO(ArrayOfEmpresaBloqueioDTO value) {
        return new JAXBElement<ArrayOfEmpresaBloqueioDTO>(_ArrayOfEmpresaBloqueioDTO_QNAME, ArrayOfEmpresaBloqueioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaBancoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaBancoDTO")
    public JAXBElement<EmpresaBancoDTO> createEmpresaBancoDTO(EmpresaBancoDTO value) {
        return new JAXBElement<EmpresaBancoDTO>(_EmpresaBancoDTO_QNAME, EmpresaBancoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProcessoCotacaoDTO")
    public JAXBElement<ProcessoCotacaoDTO> createProcessoCotacaoDTO(ProcessoCotacaoDTO value) {
        return new JAXBElement<ProcessoCotacaoDTO>(_ProcessoCotacaoDTO_QNAME, ProcessoCotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfWbtLogCapaDTO")
    public JAXBElement<ArrayOfWbtLogCapaDTO> createArrayOfWbtLogCapaDTO(ArrayOfWbtLogCapaDTO value) {
        return new JAXBElement<ArrayOfWbtLogCapaDTO>(_ArrayOfWbtLogCapaDTO_QNAME, ArrayOfWbtLogCapaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaAvaliacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaAvaliacaoDTO")
    public JAXBElement<EmpresaAvaliacaoDTO> createEmpresaAvaliacaoDTO(EmpresaAvaliacaoDTO value) {
        return new JAXBElement<EmpresaAvaliacaoDTO>(_EmpresaAvaliacaoDTO_QNAME, EmpresaAvaliacaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProcessoCotacaoDTO")
    public JAXBElement<ArrayOfProcessoCotacaoDTO> createArrayOfProcessoCotacaoDTO(ArrayOfProcessoCotacaoDTO value) {
        return new JAXBElement<ArrayOfProcessoCotacaoDTO>(_ArrayOfProcessoCotacaoDTO_QNAME, ArrayOfProcessoCotacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaRepresentanteSocioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaRepresentanteSocioDTO")
    public JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> createArrayOfEmpresaRepresentanteSocioDTO(ArrayOfEmpresaRepresentanteSocioDTO value) {
        return new JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO>(_ArrayOfEmpresaRepresentanteSocioDTO_QNAME, ArrayOfEmpresaRepresentanteSocioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornecedorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "FornecedorDTO")
    public JAXBElement<FornecedorDTO> createFornecedorDTO(FornecedorDTO value) {
        return new JAXBElement<FornecedorDTO>(_FornecedorDTO_QNAME, FornecedorDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CEmpresaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_EmpresaDTO_x003E_")
    public JAXBElement<RetornoListaX003CEmpresaDTOX003E> createRetornoListaX003CEmpresaDTOX003E(RetornoListaX003CEmpresaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CEmpresaDTOX003E>(_RetornoListaX003CEmpresaDTOX003E_QNAME, RetornoListaX003CEmpresaDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrcHistoricoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CrcHistoricoDTO")
    public JAXBElement<CrcHistoricoDTO> createCrcHistoricoDTO(CrcHistoricoDTO value) {
        return new JAXBElement<CrcHistoricoDTO>(_CrcHistoricoDTO_QNAME, CrcHistoricoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaAvaliacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaAvaliacaoDTO")
    public JAXBElement<ArrayOfEmpresaAvaliacaoDTO> createArrayOfEmpresaAvaliacaoDTO(ArrayOfEmpresaAvaliacaoDTO value) {
        return new JAXBElement<ArrayOfEmpresaAvaliacaoDTO>(_ArrayOfEmpresaAvaliacaoDTO_QNAME, ArrayOfEmpresaAvaliacaoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfDocumentoDTO")
    public JAXBElement<ArrayOfDocumentoDTO> createArrayOfDocumentoDTO(ArrayOfDocumentoDTO value) {
        return new JAXBElement<ArrayOfDocumentoDTO>(_ArrayOfDocumentoDTO_QNAME, ArrayOfDocumentoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaContatoDTO")
    public JAXBElement<ArrayOfEmpresaContatoDTO> createArrayOfEmpresaContatoDTO(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_ArrayOfEmpresaContatoDTO_QNAME, ArrayOfEmpresaContatoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EnderecoDTO")
    public JAXBElement<EnderecoDTO> createEnderecoDTO(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_EnderecoDTO_QNAME, EnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaDTO")
    public JAXBElement<ArrayOfEmpresaDTO> createArrayOfEmpresaDTO(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_ArrayOfEmpresaDTO_QNAME, ArrayOfEmpresaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfTipoContatoDTO")
    public JAXBElement<ArrayOfTipoContatoDTO> createArrayOfTipoContatoDTO(ArrayOfTipoContatoDTO value) {
        return new JAXBElement<ArrayOfTipoContatoDTO>(_ArrayOfTipoContatoDTO_QNAME, ArrayOfTipoContatoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WbtLogCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "WbtLogCapaDTO")
    public JAXBElement<WbtLogCapaDTO> createWbtLogCapaDTO(WbtLogCapaDTO value) {
        return new JAXBElement<WbtLogCapaDTO>(_WbtLogCapaDTO_QNAME, WbtLogCapaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaClasseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaClasseDTO")
    public JAXBElement<EmpresaClasseDTO> createEmpresaClasseDTO(EmpresaClasseDTO value) {
        return new JAXBElement<EmpresaClasseDTO>(_EmpresaClasseDTO_QNAME, EmpresaClasseDTO.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrDocumento", scope = EmpresaAvaliacaoDTO.class)
    public JAXBElement<String> createEmpresaAvaliacaoDTOSNrDocumento(String value) {
        return new JAXBElement<String>(_EmpresaAvaliacaoDTOSNrDocumento_QNAME, String.class, EmpresaAvaliacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuario", scope = EmpresaAvaliacaoDTO.class)
    public JAXBElement<String> createEmpresaAvaliacaoDTOSCdUsuario(String value) {
        return new JAXBElement<String>(_EmpresaAvaliacaoDTOSCdUsuario_QNAME, String.class, EmpresaAvaliacaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaParticipanteResult", scope = RetornarEmpresaParticipanteResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaParticipanteResponseRetornarEmpresaParticipanteResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaParticipanteResponseRetornarEmpresaParticipanteResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaParticipanteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsComplemento", scope = EnderecoDTO.class)
    public JAXBElement<String> createEnderecoDTOSDsComplemento(String value) {
        return new JAXBElement<String>(_EnderecoDTOSDsComplemento_QNAME, String.class, EnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaVerificacaoDeparaResult", scope = RetornarEmpresaVerificacaoDeparaResponse.class)
    public JAXBElement<EmpresaDTO> createRetornarEmpresaVerificacaoDeparaResponseRetornarEmpresaVerificacaoDeparaResult(EmpresaDTO value) {
        return new JAXBElement<EmpresaDTO>(_RetornarEmpresaVerificacaoDeparaResponseRetornarEmpresaVerificacaoDeparaResult_QNAME, EmpresaDTO.class, RetornarEmpresaVerificacaoDeparaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = EmpresaBancoDTO.class)
    public JAXBElement<String> createEmpresaBancoDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSCdEmpresa_QNAME, String.class, EmpresaBancoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipoConta", scope = EmpresaBancoDTO.class)
    public JAXBElement<Integer> createEmpresaBancoDTONCdTipoConta(Integer value) {
        return new JAXBElement<Integer>(_EmpresaBancoDTONCdTipoConta_QNAME, Integer.class, EmpresaBancoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPais", scope = EmpresaBancoDTO.class)
    public JAXBElement<String> createEmpresaBancoDTOSCdPais(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSCdPais_QNAME, String.class, EmpresaBancoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmTitular", scope = EmpresaBancoDTO.class)
    public JAXBElement<String> createEmpresaBancoDTOSNmTitular(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSNmTitular_QNAME, String.class, EmpresaBancoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CEmpresaDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaCompradoraPorNomeResult", scope = RetornarEmpresaCompradoraPorNomeResponse.class)
    public JAXBElement<RetornoListaX003CEmpresaDTOX003E> createRetornarEmpresaCompradoraPorNomeResponseRetornarEmpresaCompradoraPorNomeResult(RetornoListaX003CEmpresaDTOX003E value) {
        return new JAXBElement<RetornoListaX003CEmpresaDTOX003E>(_RetornarEmpresaCompradoraPorNomeResponseRetornarEmpresaCompradoraPorNomeResult_QNAME, RetornoListaX003CEmpresaDTOX003E.class, RetornarEmpresaCompradoraPorNomeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaPorCodigoWBCResult", scope = RetornarEmpresaPorCodigoWBCResponse.class)
    public JAXBElement<EmpresaDTO> createRetornarEmpresaPorCodigoWBCResponseRetornarEmpresaPorCodigoWBCResult(EmpresaDTO value) {
        return new JAXBElement<EmpresaDTO>(_RetornarEmpresaPorCodigoWBCResponseRetornarEmpresaPorCodigoWBCResult_QNAME, EmpresaDTO.class, RetornarEmpresaPorCodigoWBCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstUsuarioHomologador", scope = RetornarEmpresaIntegracao.class)
    public JAXBElement<ArrayOfstring> createRetornarEmpresaIntegracaoLstUsuarioHomologador(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RetornarEmpresaIntegracaoLstUsuarioHomologador_QNAME, ArrayOfstring.class, RetornarEmpresaIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sNrCnpj", scope = RetornarEmpresaIntegracao.class)
    public JAXBElement<String> createRetornarEmpresaIntegracaoSNrCnpj(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSNrCnpj_QNAME, String.class, RetornarEmpresaIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresaErp", scope = RetornarEmpresaIntegracao.class)
    public JAXBElement<String> createRetornarEmpresaIntegracaoSCdEmpresaErp(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSCdEmpresaErp_QNAME, String.class, RetornarEmpresaIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = EmpresaBloqueioDTO.class)
    public JAXBElement<String> createEmpresaBloqueioDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSCdEmpresa_QNAME, String.class, EmpresaBloqueioDTO.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefone", scope = EmpresaRepresentanteSocioDTO.class)
    public JAXBElement<String> createEmpresaRepresentanteSocioDTOSNrTelefone(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefone_QNAME, String.class, EmpresaRepresentanteSocioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefoneDDD", scope = EmpresaRepresentanteSocioDTO.class)
    public JAXBElement<String> createEmpresaRepresentanteSocioDTOSNrTelefoneDDD(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefoneDDD_QNAME, String.class, EmpresaRepresentanteSocioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsEndereco", scope = EmpresaRepresentanteSocioDTO.class)
    public JAXBElement<String> createEmpresaRepresentanteSocioDTOSDsEndereco(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSDsEndereco_QNAME, String.class, EmpresaRepresentanteSocioDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaVencedoraSemDeParaResult", scope = RetornarEmpresaVencedoraSemDeParaResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaVencedoraSemDeParaResponseRetornarEmpresaVencedoraSemDeParaResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaVencedoraSemDeParaResponseRetornarEmpresaVencedoraSemDeParaResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaVencedoraSemDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFornecedorDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarFornecedorIntegracaoResult", scope = RetornarFornecedorIntegracaoResponse.class)
    public JAXBElement<ArrayOfFornecedorDTO> createRetornarFornecedorIntegracaoResponseRetornarFornecedorIntegracaoResult(ArrayOfFornecedorDTO value) {
        return new JAXBElement<ArrayOfFornecedorDTO>(_RetornarFornecedorIntegracaoResponseRetornarFornecedorIntegracaoResult_QNAME, ArrayOfFornecedorDTO.class, RetornarFornecedorIntegracaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaCotacaoResult", scope = RetornarEmpresaCotacaoResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaCotacaoResponseRetornarEmpresaCotacaoResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaCotacaoResponseRetornarEmpresaCotacaoResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaCotacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsContatoDDD", scope = FornecedorDTO.class)
    public JAXBElement<String> createFornecedorDTOSDsContatoDDD(String value) {
        return new JAXBElement<String>(_FornecedorDTOSDsContatoDDD_QNAME, String.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoInstitucional", scope = FornecedorDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createFornecedorDTOLstEmpresaEnderecoInstitucional(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoInstitucional_QNAME, ArrayOfEmpresaEnderecoDTO.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoEntrega", scope = FornecedorDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createFornecedorDTOLstEmpresaEnderecoEntrega(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoEntrega_QNAME, ArrayOfEmpresaEnderecoDTO.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaBanco", scope = FornecedorDTO.class)
    public JAXBElement<ArrayOfEmpresaBancoDTO> createFornecedorDTOLstEmpresaBanco(ArrayOfEmpresaBancoDTO value) {
        return new JAXBElement<ArrayOfEmpresaBancoDTO>(_FornecedorDTOLstEmpresaBanco_QNAME, ArrayOfEmpresaBancoDTO.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpj", scope = FornecedorDTO.class)
    public JAXBElement<String> createFornecedorDTOSNrCnpj(String value) {
        return new JAXBElement<String>(_FornecedorDTOSNrCnpj_QNAME, String.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsContatoFone", scope = FornecedorDTO.class)
    public JAXBElement<String> createFornecedorDTOSDsContatoFone(String value) {
        return new JAXBElement<String>(_FornecedorDTOSDsContatoFone_QNAME, String.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoCobranca", scope = FornecedorDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createFornecedorDTOLstEmpresaEnderecoCobranca(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoCobranca_QNAME, ArrayOfEmpresaEnderecoDTO.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPais", scope = FornecedorDTO.class)
    public JAXBElement<String> createFornecedorDTOSCdPais(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSCdPais_QNAME, String.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrInscricaoEstadual", scope = FornecedorDTO.class)
    public JAXBElement<String> createFornecedorDTOSNrInscricaoEstadual(String value) {
        return new JAXBElement<String>(_FornecedorDTOSNrInscricaoEstadual_QNAME, String.class, FornecedorDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaIntegracaoFalhaResult", scope = RetornarEmpresaIntegracaoFalhaResponse.class)
    public JAXBElement<RetornoDTO> createRetornarEmpresaIntegracaoFalhaResponseRetornarEmpresaIntegracaoFalhaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_RetornarEmpresaIntegracaoFalhaResponseRetornarEmpresaIntegracaoFalhaResult_QNAME, RetornoDTO.class, RetornarEmpresaIntegracaoFalhaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsCargo", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSDsCargo(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSDsCargo_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDocumentoContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<ArrayOfDocumentoDTO> createEmpresaContatoDTOLstDocumentoContato(ArrayOfDocumentoDTO value) {
        return new JAXBElement<ArrayOfDocumentoDTO>(_EmpresaContatoDTOLstDocumentoContato_QNAME, ArrayOfDocumentoDTO.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefone", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrTelefone(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefone_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsEmail", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSDsEmail(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSDsEmail_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCelular", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrCelular(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrCelular_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstTipoContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<ArrayOfTipoContatoDTO> createEmpresaContatoDTOLstTipoContato(ArrayOfTipoContatoDTO value) {
        return new JAXBElement<ArrayOfTipoContatoDTO>(_EmpresaContatoDTOLstTipoContato_QNAME, ArrayOfTipoContatoDTO.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefoneDDD", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrTelefoneDDD(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefoneDDD_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdContato", scope = EmpresaContatoDTO.class)
    public JAXBElement<Long> createEmpresaContatoDTONCdContato(Long value) {
        return new JAXBElement<Long>(_EmpresaContatoDTONCdContato_QNAME, Long.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrRamal", scope = EmpresaContatoDTO.class)
    public JAXBElement<String> createEmpresaContatoDTOSNrRamal(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrRamal_QNAME, String.class, EmpresaContatoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProcessoCotacaoDTO", scope = RetornarEmpresaCotacao.class)
    public JAXBElement<ArrayOfProcessoCotacaoDTO> createRetornarEmpresaCotacaoLstProcessoCotacaoDTO(ArrayOfProcessoCotacaoDTO value) {
        return new JAXBElement<ArrayOfProcessoCotacaoDTO>(_RetornarEmpresaCotacaoLstProcessoCotacaoDTO_QNAME, ArrayOfProcessoCotacaoDTO.class, RetornarEmpresaCotacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaSemDeParaResult", scope = RetornarEmpresaSemDeParaResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaSemDeParaResponseRetornarEmpresaSemDeParaResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaSemDeParaResponseRetornarEmpresaSemDeParaResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaSemDeParaResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresaErp", scope = RetornarEmpresa.class)
    public JAXBElement<String> createRetornarEmpresaSCdEmpresaErp(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSCdEmpresaErp_QNAME, String.class, RetornarEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nCdSituacao", scope = RetornarEmpresaCompradoraPorNome.class)
    public JAXBElement<Integer> createRetornarEmpresaCompradoraPorNomeNCdSituacao(Integer value) {
        return new JAXBElement<Integer>(_RetornarEmpresaCompradoraPorNomeNCdSituacao_QNAME, Integer.class, RetornarEmpresaCompradoraPorNome.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sNmEmpresa", scope = RetornarEmpresaCompradoraPorNome.class)
    public JAXBElement<String> createRetornarEmpresaCompradoraPorNomeSNmEmpresa(String value) {
        return new JAXBElement<String>(_RetornarEmpresaCompradoraPorNomeSNmEmpresa_QNAME, String.class, RetornarEmpresaCompradoraPorNome.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cnpj", scope = RetornarEmpresaPorCnpj.class)
    public JAXBElement<String> createRetornarEmpresaPorCnpjCnpj(String value) {
        return new JAXBElement<String>(_RetornarEmpresaPorCnpjCnpj_QNAME, String.class, RetornarEmpresaPorCnpj.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoInstitucional", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createEmpresaDTOLstEmpresaEnderecoInstitucional(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoInstitucional_QNAME, ArrayOfEmpresaEnderecoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAtividadeComercial", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAtividadeComercial(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAtividadeComercial_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlPatrimonioLiquido", scope = EmpresaDTO.class)
    public JAXBElement<BigDecimal> createEmpresaDTODVlPatrimonioLiquido(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpresaDTODVlPatrimonioLiquido_QNAME, BigDecimal.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAtividadeIndustrial", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAtividadeIndustrial(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAtividadeIndustrial_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrEndereco", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrEndereco(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNrEndereco_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtIntegralizacao", scope = EmpresaDTO.class)
    public JAXBElement<XMLGregorianCalendar> createEmpresaDTOTDtIntegralizacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpresaDTOTDtIntegralizacao_QNAME, XMLGregorianCalendar.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCnae", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdCnae(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdCnae_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrFax", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrFax(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNrFax_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtCadastro", scope = EmpresaDTO.class)
    public JAXBElement<XMLGregorianCalendar> createEmpresaDTOTDtCadastro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpresaDTOTDtCadastro_QNAME, XMLGregorianCalendar.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrInscricaoEstadual", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrInscricaoEstadual(String value) {
        return new JAXBElement<String>(_FornecedorDTOSNrInscricaoEstadual_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrNotaAvaliacao", scope = EmpresaDTO.class)
    public JAXBElement<BigDecimal> createEmpresaDTONNrNotaAvaliacao(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpresaDTONNrNotaAvaliacao_QNAME, BigDecimal.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAtividadeMap", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdAtividadeMap(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdAtividadeMap_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaBanco", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaBancoDTO> createEmpresaDTOLstEmpresaBanco(ArrayOfEmpresaBancoDTO value) {
        return new JAXBElement<ArrayOfEmpresaBancoDTO>(_FornecedorDTOLstEmpresaBanco_QNAME, ArrayOfEmpresaBancoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtInicioAtividade", scope = EmpresaDTO.class)
    public JAXBElement<XMLGregorianCalendar> createEmpresaDTOTDtInicioAtividade(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpresaDTOTDtInicioAtividade_QNAME, XMLGregorianCalendar.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAreaInfluencia", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAreaInfluencia(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAreaInfluencia_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsarioHomologador", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdUsarioHomologador(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdUsarioHomologador_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoPessoa", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTONIdTipoPessoa(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTONIdTipoPessoa_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCelular", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrCelular(String value) {
        return new JAXBElement<String>(_EmpresaContatoDTOSNrCelular_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsEnderecoComplemento", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSDsEnderecoComplemento(String value) {
        return new JAXBElement<String>(_EmpresaDTOSDsEnderecoComplemento_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmApelido", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNmApelido(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNmApelido_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrInscricaoMunicial", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrInscricaoMunicial(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNrInscricaoMunicial_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsEmailContato", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSDsEmailContato(String value) {
        return new JAXBElement<String>(_EmpresaDTOSDsEmailContato_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCnpjMatriz", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrCnpjMatriz(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNrCnpjMatriz_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlCapitalIntegralizado", scope = EmpresaDTO.class)
    public JAXBElement<BigDecimal> createEmpresaDTODVlCapitalIntegralizado(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpresaDTODVlCapitalIntegralizado_QNAME, BigDecimal.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoFaturamento", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createEmpresaDTOLstEmpresaEnderecoFaturamento(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_EmpresaDTOLstEmpresaEnderecoFaturamento_QNAME, ArrayOfEmpresaEnderecoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAssinaturaDigital", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAssinaturaDigital(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAssinaturaDigital_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrInscricaoMunicipal", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrInscricaoMunicipal(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNrInscricaoMunicipal_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdSuperSimples", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTONIdSuperSimples(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTONIdSuperSimples_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrAutoAvaliacao", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTONNrAutoAvaliacao(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTONNrAutoAvaliacao_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgGrupoConta", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSSgGrupoConta(String value) {
        return new JAXBElement<String>(_EmpresaDTOSSgGrupoConta_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNaturezaJuridica", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdNaturezaJuridica(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdNaturezaJuridica_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefoneDDD", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrTelefoneDDD(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefoneDDD_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrcHistoricoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstDocumento", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfCrcHistoricoDTO> createEmpresaDTOLstDocumento(ArrayOfCrcHistoricoDTO value) {
        return new JAXBElement<ArrayOfCrcHistoricoDTO>(_EmpresaDTOLstDocumento_QNAME, ArrayOfCrcHistoricoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlCapitalSocial", scope = EmpresaDTO.class)
    public JAXBElement<BigDecimal> createEmpresaDTODVlCapitalSocial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpresaDTODVlCapitalSocial_QNAME, BigDecimal.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMoeda", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdMoeda(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdMoeda_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAtividadeServico", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAtividadeServico(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAtividadeServico_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaContato", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaContatoDTO> createEmpresaDTOLstEmpresaContato(ArrayOfEmpresaContatoDTO value) {
        return new JAXBElement<ArrayOfEmpresaContatoDTO>(_EmpresaDTOLstEmpresaContato_QNAME, ArrayOfEmpresaContatoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaRepresentanteSocioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaRepresentanteSocio", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> createEmpresaDTOLstEmpresaRepresentanteSocio(ArrayOfEmpresaRepresentanteSocioDTO value) {
        return new JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO>(_EmpresaDTOLstEmpresaRepresentanteSocio_QNAME, ArrayOfEmpresaRepresentanteSocioDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoEntrega", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createEmpresaDTOLstEmpresaEnderecoEntrega(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoEntrega_QNAME, ArrayOfEmpresaEnderecoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUrl", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSDsUrl(String value) {
        return new JAXBElement<String>(_EmpresaDTOSDsUrl_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlAssinaturaEletronica", scope = EmpresaDTO.class)
    public JAXBElement<Integer> createEmpresaDTOBFlAssinaturaEletronica(Integer value) {
        return new JAXBElement<Integer>(_EmpresaDTOBFlAssinaturaEletronica_QNAME, Integer.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCliente", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdEmpresaCliente(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdEmpresaCliente_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmContato", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNmContato(String value) {
        return new JAXBElement<String>(_EmpresaDTOSNmContato_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrTelefone", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSNrTelefone(String value) {
        return new JAXBElement<String>(_EmpresaRepresentanteSocioDTOSNrTelefone_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEnvio", scope = EmpresaDTO.class)
    public JAXBElement<String> createEmpresaDTOSCdEmpresaEnvio(String value) {
        return new JAXBElement<String>(_EmpresaDTOSCdEmpresaEnvio_QNAME, String.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaEnderecoCobranca", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> createEmpresaDTOLstEmpresaEnderecoCobranca(ArrayOfEmpresaEnderecoDTO value) {
        return new JAXBElement<ArrayOfEmpresaEnderecoDTO>(_FornecedorDTOLstEmpresaEnderecoCobranca_QNAME, ArrayOfEmpresaEnderecoDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdEmpresaWbc", scope = EmpresaDTO.class)
    public JAXBElement<Long> createEmpresaDTONCdEmpresaWbc(Long value) {
        return new JAXBElement<Long>(_EmpresaDTONCdEmpresaWbc_QNAME, Long.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "tDtValidadeCadastro", scope = EmpresaDTO.class)
    public JAXBElement<XMLGregorianCalendar> createEmpresaDTOTDtValidadeCadastro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpresaDTOTDtValidadeCadastro_QNAME, XMLGregorianCalendar.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaClasse", scope = EmpresaDTO.class)
    public JAXBElement<ArrayOfEmpresaClasseDTO> createEmpresaDTOLstEmpresaClasse(ArrayOfEmpresaClasseDTO value) {
        return new JAXBElement<ArrayOfEmpresaClasseDTO>(_EmpresaDTOLstEmpresaClasse_QNAME, ArrayOfEmpresaClasseDTO.class, EmpresaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEmpresaResult", scope = ProcessarEmpresaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEmpresaResponseProcessarEmpresaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEmpresaResponseProcessarEmpresaResult_QNAME, RetornoDTO.class, ProcessarEmpresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBloqueioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpresaBloqueio", scope = ProcessarEmpresaBloqueio.class)
    public JAXBElement<ArrayOfEmpresaBloqueioDTO> createProcessarEmpresaBloqueioLstEmpresaBloqueio(ArrayOfEmpresaBloqueioDTO value) {
        return new JAXBElement<ArrayOfEmpresaBloqueioDTO>(_ProcessarEmpresaBloqueioLstEmpresaBloqueio_QNAME, ArrayOfEmpresaBloqueioDTO.class, ProcessarEmpresaBloqueio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaResult", scope = RetornarEmpresaResponse.class)
    public JAXBElement<EmpresaDTO> createRetornarEmpresaResponseRetornarEmpresaResult(EmpresaDTO value) {
        return new JAXBElement<EmpresaDTO>(_RetornarEmpresaResponseRetornarEmpresaResult_QNAME, EmpresaDTO.class, RetornarEmpresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProcessoLeilaoDTO", scope = RetornarEmpresaLeilao.class)
    public JAXBElement<ArrayOfProcessoLeilaoDTO> createRetornarEmpresaLeilaoLstProcessoLeilaoDTO(ArrayOfProcessoLeilaoDTO value) {
        return new JAXBElement<ArrayOfProcessoLeilaoDTO>(_RetornarEmpresaLeilaoLstProcessoLeilaoDTO_QNAME, ArrayOfProcessoLeilaoDTO.class, RetornarEmpresaLeilao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sNrCnpj", scope = CriarDeParaFornecedorCasoNaoExista.class)
    public JAXBElement<String> createCriarDeParaFornecedorCasoNaoExistaSNrCnpj(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSNrCnpj_QNAME, String.class, CriarDeParaFornecedorCasoNaoExista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpresa", scope = ProcessarEmpresa.class)
    public JAXBElement<ArrayOfEmpresaDTO> createProcessarEmpresaLstEmpresa(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_ProcessarEmpresaLstEmpresa_QNAME, ArrayOfEmpresaDTO.class, ProcessarEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaAvaliacaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpresa", scope = ProcessarEmpresaAvaliacao.class)
    public JAXBElement<ArrayOfEmpresaAvaliacaoDTO> createProcessarEmpresaAvaliacaoLstEmpresa(ArrayOfEmpresaAvaliacaoDTO value) {
        return new JAXBElement<ArrayOfEmpresaAvaliacaoDTO>(_ProcessarEmpresaLstEmpresa_QNAME, ArrayOfEmpresaAvaliacaoDTO.class, ProcessarEmpresaAvaliacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaIntegracaoResult", scope = RetornarEmpresaIntegracaoResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaIntegracaoResponseRetornarEmpresaIntegracaoResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaIntegracaoResponseRetornarEmpresaIntegracaoResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaIntegracaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sNrCnpj", scope = RetornarEmpresaVerificacaoDepara.class)
    public JAXBElement<String> createRetornarEmpresaVerificacaoDeparaSNrCnpj(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSNrCnpj_QNAME, String.class, RetornarEmpresaVerificacaoDepara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresaErp", scope = RetornarEmpresaVerificacaoDepara.class)
    public JAXBElement<String> createRetornarEmpresaVerificacaoDeparaSCdEmpresaErp(String value) {
        return new JAXBElement<String>(_RetornarEmpresaIntegracaoSCdEmpresaErp_QNAME, String.class, RetornarEmpresaVerificacaoDepara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CriarDeParaFornecedorCasoNaoExistaResult", scope = CriarDeParaFornecedorCasoNaoExistaResponse.class)
    public JAXBElement<RetornoDTO> createCriarDeParaFornecedorCasoNaoExistaResponseCriarDeParaFornecedorCasoNaoExistaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_CriarDeParaFornecedorCasoNaoExistaResponseCriarDeParaFornecedorCasoNaoExistaResult_QNAME, RetornoDTO.class, CriarDeParaFornecedorCasoNaoExistaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEmpresaBloqueioResult", scope = ProcessarEmpresaBloqueioResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEmpresaBloqueioResponseProcessarEmpresaBloqueioResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEmpresaBloqueioResponseProcessarEmpresaBloqueioResult_QNAME, RetornoDTO.class, ProcessarEmpresaBloqueioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPais", scope = EmpresaEnderecoDTO.class)
    public JAXBElement<String> createEmpresaEnderecoDTOSCdPais(String value) {
        return new JAXBElement<String>(_EmpresaBancoDTOSCdPais_QNAME, String.class, EmpresaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEstado", scope = EmpresaEnderecoDTO.class)
    public JAXBElement<String> createEmpresaEnderecoDTOSCdEstado(String value) {
        return new JAXBElement<String>(_EmpresaEnderecoDTOSCdEstado_QNAME, String.class, EmpresaEnderecoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaPorCnpjResult", scope = RetornarEmpresaPorCnpjResponse.class)
    public JAXBElement<EmpresaDTO> createRetornarEmpresaPorCnpjResponseRetornarEmpresaPorCnpjResult(EmpresaDTO value) {
        return new JAXBElement<EmpresaDTO>(_RetornarEmpresaPorCnpjResponseRetornarEmpresaPorCnpjResult_QNAME, EmpresaDTO.class, RetornarEmpresaPorCnpjResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarEmpresaLeilaoResult", scope = RetornarEmpresaLeilaoResponse.class)
    public JAXBElement<ArrayOfEmpresaDTO> createRetornarEmpresaLeilaoResponseRetornarEmpresaLeilaoResult(ArrayOfEmpresaDTO value) {
        return new JAXBElement<ArrayOfEmpresaDTO>(_RetornarEmpresaLeilaoResponseRetornarEmpresaLeilaoResult_QNAME, ArrayOfEmpresaDTO.class, RetornarEmpresaLeilaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstLogItem", scope = WbtLogCapaDTO.class)
    public JAXBElement<ArrayOfWbtLogDTO> createWbtLogCapaDTOLstLogItem(ArrayOfWbtLogDTO value) {
        return new JAXBElement<ArrayOfWbtLogDTO>(_WbtLogCapaDTOLstLogItem_QNAME, ArrayOfWbtLogDTO.class, WbtLogCapaDTO.class, value);
    }

}
