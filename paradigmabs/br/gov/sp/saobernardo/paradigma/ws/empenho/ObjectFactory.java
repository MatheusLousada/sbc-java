
package br.gov.sp.saobernardo.paradigma.ws.empenho;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.empenho package. 
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
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _LiquidacaoEmpenhoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LiquidacaoEmpenhoDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfPedidoItemEntregaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPedidoItemEntregaDTO");
    private final static QName _EmpenhoCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpenhoCapaDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _PedidoItemEntregaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PedidoItemEntregaDTO");
    private final static QName _ArrayOfEmpenhoDesembolsoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpenhoDesembolsoDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _EmpenhoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpenhoItemDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _EmpenhoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpenhoDTO");
    private final static QName _AnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AnexoDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfPedidoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPedidoItemTaxaDTO");
    private final static QName _PedidoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PedidoItemDTO");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfEmpenhoItemCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpenhoItemCapaDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfPedidoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfPedidoItemDTO");
    private final static QName _PedidoItemTaxaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PedidoItemTaxaDTO");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfAnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAnexoDTO");
    private final static QName _ArrayOfLiquidacaoEmpenhoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLiquidacaoEmpenhoDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _EnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EnderecoDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _EmpenhoItemCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpenhoItemCapaDTO");
    private final static QName _EmpenhoDesembolsoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpenhoDesembolsoDTO");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _PedidoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PedidoDTO");
    private final static QName _ArrayOfEmpenhoCapaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpenhoCapaDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _LiquidacaoEmpenhoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "LiquidacaoEmpenhoItemDTO");
    private final static QName _ArrayOfLiquidacaoEmpenhoItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfLiquidacaoEmpenhoItemDTO");
    private final static QName _EmpenhoCapaDTOSCdOrdemCompraEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrdemCompraEmpresa");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _PedidoItemDTOSCdUsuarioResponsavel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioResponsavel");
    private final static QName _PedidoItemDTOSCdIva_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdIva");
    private final static QName _PedidoItemDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _PedidoItemDTOSCdItemOrigemEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemOrigemEmpresa");
    private final static QName _PedidoItemDTOSCdOrigemEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigemEmpresa");
    private final static QName _PedidoItemDTOSCdNbm_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNbm");
    private final static QName _PedidoItemDTOSCdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresa");
    private final static QName _PedidoItemDTODPcDesconto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dPcDesconto");
    private final static QName _PedidoItemDTOLstAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstAnexo");
    private final static QName _PedidoItemDTOSCdItemEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemEmpresa");
    private final static QName _PedidoItemDTOSCdItemWbc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemWbc");
    private final static QName _ProcessarDesembolsoEmpenhoLstEmpenhoDesembolsoDTO_QNAME = new QName("http://tempuri.org/", "lstEmpenhoDesembolsoDTO");
    private final static QName _EmpenhoDesembolsoDTODVlAtualizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlAtualizado");
    private final static QName _ProcessarEmpenhoResponseProcessarEmpenhoResult_QNAME = new QName("http://tempuri.org/", "ProcessarEmpenhoResult");
    private final static QName _PedidoDTOSCdPedidoWBC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdPedidoWBC");
    private final static QName _PedidoDTOSCdUsuarioProgramador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioProgramador");
    private final static QName _PedidoDTOSDsPedidoAuditoria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsPedidoAuditoria");
    private final static QName _PedidoDTOSCdFonteRecurso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFonteRecurso");
    private final static QName _PedidoDTOSDsObservacoes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacoes");
    private final static QName _PedidoDTOSCdGrupoCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGrupoCompra");
    private final static QName _PedidoDTOSNrRgPesquisador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrRgPesquisador");
    private final static QName _PedidoDTOSCdCentroCusto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCentroCusto");
    private final static QName _PedidoDTONNrVersao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrVersao");
    private final static QName _PedidoDTOSNrProjeto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrProjeto");
    private final static QName _PedidoDTOSCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdMoeda");
    private final static QName _PedidoDTOSCdTransportadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdTransportadora");
    private final static QName _ProcessarLiquidacaoEmpenhoResponseProcessarLiquidacaoEmpenhoResult_QNAME = new QName("http://tempuri.org/", "ProcessarLiquidacaoEmpenhoResult");
    private final static QName _EmpenhoDTONIdTipoDespesaMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoDespesaMap");
    private final static QName _EmpenhoDTOSCdGestao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGestao");
    private final static QName _EmpenhoDTOSCdContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContrato");
    private final static QName _EmpenhoDTOSDsLocalEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLocalEntrega");
    private final static QName _EmpenhoDTONIdTipoLicitacaoMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoLicitacaoMap");
    private final static QName _EmpenhoDTOSCdNaturezaDespesa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNaturezaDespesa");
    private final static QName _EmpenhoDTONIdTipoCredor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoCredor");
    private final static QName _EmpenhoDTOSCdEmpresaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCliente");
    private final static QName _EmpenhoDTOSCdDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDocumento");
    private final static QName _EmpenhoDTOSNrSolicitacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrSolicitacao");
    private final static QName _EmpenhoDTONCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdOrigem");
    private final static QName _EmpenhoDTONIdModalidadeEmpenhoMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdModalidadeEmpenhoMap");
    private final static QName _EmpenhoDTONNrExercicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nNrExercicio");
    private final static QName _EmpenhoDTOSCdProgramaTrabalho_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdProgramaTrabalho");
    private final static QName _PedidoItemEntregaDTODQtItemRealizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dQtItemRealizado");
    private final static QName _PedidoItemEntregaDTOSCdEmpresaCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCobrancaEndereco");
    private final static QName _PedidoItemEntregaDTOSCdRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdRequisicaoEmpresa");
    private final static QName _PedidoItemEntregaDTOOEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oEntregaEndereco");
    private final static QName _PedidoItemEntregaDTODQtUnidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dQtUnidade");
    private final static QName _PedidoItemEntregaDTOSCdEmpresaEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEntregaEndereco");
    private final static QName _PedidoItemEntregaDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _PedidoItemEntregaDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _PedidoItemEntregaDTOSCdEmpresaFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFaturamentoEndereco");
    private final static QName _PedidoItemEntregaDTOOCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oCobrancaEndereco");
    private final static QName _PedidoItemEntregaDTOSCdAlmoxarifado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAlmoxarifado");
    private final static QName _PedidoItemEntregaDTOSCdUnidadeFornecimento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUnidadeFornecimento");
    private final static QName _PedidoItemEntregaDTODQtPorUnidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dQtPorUnidade");
    private final static QName _PedidoItemEntregaDTOOFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oFaturamentoEndereco");
    private final static QName _PedidoItemEntregaDTOSCdAlmoxarifadoDoca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAlmoxarifadoDoca");
    private final static QName _PedidoItemEntregaDTOSCdItemEntregaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemEntregaEmpresa");
    private final static QName _PedidoItemEntregaDTOSCdCentroCustoRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCentroCustoRequisicao");
    private final static QName _PedidoItemEntregaDTOSCdCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCobrancaEndereco");
    private final static QName _PedidoItemEntregaDTOSCdItemRequisicaoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdItemRequisicaoEmpresa");
    private final static QName _AnexoDTOSNmArquivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmArquivo");
    private final static QName _AnexoDTOSDsAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAnexo");
    private final static QName _ProcessarEstornoEmpenhoItemResponseProcessarEstornoEmpenhoItemResult_QNAME = new QName("http://tempuri.org/", "ProcessarEstornoEmpenhoItemResult");
    private final static QName _ProcessarLiquidacaoEmpenhoItemResponseProcessarLiquidacaoEmpenhoItemResult_QNAME = new QName("http://tempuri.org/", "ProcessarLiquidacaoEmpenhoItemResult");
    private final static QName _ProcessarEmpenhoItemLstEmpenhoItemCapaDto_QNAME = new QName("http://tempuri.org/", "lstEmpenhoItemCapaDto");
    private final static QName _EnderecoDTOSDsComplemento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsComplemento");
    private final static QName _ProcessarDesembolsoEmpenhoResponseProcessarDesembolsoEmpenhoResult_QNAME = new QName("http://tempuri.org/", "ProcessarDesembolsoEmpenhoResult");
    private final static QName _ProcessarEmpenhoLstEmpenhoCapa_QNAME = new QName("http://tempuri.org/", "lstEmpenhoCapa");
    private final static QName _ProcessarEstornoEmpenhoLstLiquidacaoEmpenhoDTO_QNAME = new QName("http://tempuri.org/", "lstLiquidacaoEmpenhoDTO");
    private final static QName _EmpenhoItemDTONIdTipoRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoRegistro");
    private final static QName _ProcessarEmpenhoItemResponseProcessarEmpenhoItemResult_QNAME = new QName("http://tempuri.org/", "ProcessarEmpenhoItemResult");
    private final static QName _LiquidacaoEmpenhoItemDTODVlEstorno_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlEstorno");
    private final static QName _ProcessarEstornoEmpenhoResponseProcessarEstornoEmpenhoResult_QNAME = new QName("http://tempuri.org/", "ProcessarEstornoEmpenhoResult");
    private final static QName _ProcessarEstornoEmpenhoItemLstLiquidacaoEmpenhoItemDTO_QNAME = new QName("http://tempuri.org/", "lstLiquidacaoEmpenhoItemDTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.empenho
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpenhoCapaDTO }
     * 
     */
    public EmpenhoCapaDTO createEmpenhoCapaDTO() {
        return new EmpenhoCapaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPedidoItemDTO }
     * 
     */
    public ArrayOfPedidoItemDTO createArrayOfPedidoItemDTO() {
        return new ArrayOfPedidoItemDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPedidoItemTaxaDTO }
     * 
     */
    public ArrayOfPedidoItemTaxaDTO createArrayOfPedidoItemTaxaDTO() {
        return new ArrayOfPedidoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link PedidoItemDTO }
     * 
     */
    public PedidoItemDTO createPedidoItemDTO() {
        return new PedidoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarDesembolsoEmpenho }
     * 
     */
    public ProcessarDesembolsoEmpenho createProcessarDesembolsoEmpenho() {
        return new ProcessarDesembolsoEmpenho();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ArrayOfLiquidacaoEmpenhoItemDTO }
     * 
     */
    public ArrayOfLiquidacaoEmpenhoItemDTO createArrayOfLiquidacaoEmpenhoItemDTO() {
        return new ArrayOfLiquidacaoEmpenhoItemDTO();
    }

    /**
     * Create an instance of {@link EmpenhoDesembolsoDTO }
     * 
     */
    public EmpenhoDesembolsoDTO createEmpenhoDesembolsoDTO() {
        return new EmpenhoDesembolsoDTO();
    }

    /**
     * Create an instance of {@link ProcessarEmpenhoResponse }
     * 
     */
    public ProcessarEmpenhoResponse createProcessarEmpenhoResponse() {
        return new ProcessarEmpenhoResponse();
    }

    /**
     * Create an instance of {@link PedidoDTO }
     * 
     */
    public PedidoDTO createPedidoDTO() {
        return new PedidoDTO();
    }

    /**
     * Create an instance of {@link PedidoItemTaxaDTO }
     * 
     */
    public PedidoItemTaxaDTO createPedidoItemTaxaDTO() {
        return new PedidoItemTaxaDTO();
    }

    /**
     * Create an instance of {@link LiquidacaoEmpenhoDTO }
     * 
     */
    public LiquidacaoEmpenhoDTO createLiquidacaoEmpenhoDTO() {
        return new LiquidacaoEmpenhoDTO();
    }

    /**
     * Create an instance of {@link EmpenhoDTO }
     * 
     */
    public EmpenhoDTO createEmpenhoDTO() {
        return new EmpenhoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfPedidoItemEntregaDTO }
     * 
     */
    public ArrayOfPedidoItemEntregaDTO createArrayOfPedidoItemEntregaDTO() {
        return new ArrayOfPedidoItemEntregaDTO();
    }

    /**
     * Create an instance of {@link PedidoItemEntregaDTO }
     * 
     */
    public PedidoItemEntregaDTO createPedidoItemEntregaDTO() {
        return new PedidoItemEntregaDTO();
    }

    /**
     * Create an instance of {@link ProcessarLiquidacaoEmpenhoResponse }
     * 
     */
    public ProcessarLiquidacaoEmpenhoResponse createProcessarLiquidacaoEmpenhoResponse() {
        return new ProcessarLiquidacaoEmpenhoResponse();
    }

    /**
     * Create an instance of {@link AnexoDTO }
     * 
     */
    public AnexoDTO createAnexoDTO() {
        return new AnexoDTO();
    }

    /**
     * Create an instance of {@link ProcessarEstornoEmpenhoItemResponse }
     * 
     */
    public ProcessarEstornoEmpenhoItemResponse createProcessarEstornoEmpenhoItemResponse() {
        return new ProcessarEstornoEmpenhoItemResponse();
    }

    /**
     * Create an instance of {@link ProcessarLiquidacaoEmpenhoItemResponse }
     * 
     */
    public ProcessarLiquidacaoEmpenhoItemResponse createProcessarLiquidacaoEmpenhoItemResponse() {
        return new ProcessarLiquidacaoEmpenhoItemResponse();
    }

    /**
     * Create an instance of {@link ProcessarEmpenhoItem }
     * 
     */
    public ProcessarEmpenhoItem createProcessarEmpenhoItem() {
        return new ProcessarEmpenhoItem();
    }

    /**
     * Create an instance of {@link ArrayOfEmpenhoDesembolsoDTO }
     * 
     */
    public ArrayOfEmpenhoDesembolsoDTO createArrayOfEmpenhoDesembolsoDTO() {
        return new ArrayOfEmpenhoDesembolsoDTO();
    }

    /**
     * Create an instance of {@link EnderecoDTO }
     * 
     */
    public EnderecoDTO createEnderecoDTO() {
        return new EnderecoDTO();
    }

    /**
     * Create an instance of {@link ProcessarDesembolsoEmpenhoResponse }
     * 
     */
    public ProcessarDesembolsoEmpenhoResponse createProcessarDesembolsoEmpenhoResponse() {
        return new ProcessarDesembolsoEmpenhoResponse();
    }

    /**
     * Create an instance of {@link ProcessarEmpenho }
     * 
     */
    public ProcessarEmpenho createProcessarEmpenho() {
        return new ProcessarEmpenho();
    }

    /**
     * Create an instance of {@link ProcessarEstornoEmpenho }
     * 
     */
    public ProcessarEstornoEmpenho createProcessarEstornoEmpenho() {
        return new ProcessarEstornoEmpenho();
    }

    /**
     * Create an instance of {@link ArrayOfEmpenhoCapaDTO }
     * 
     */
    public ArrayOfEmpenhoCapaDTO createArrayOfEmpenhoCapaDTO() {
        return new ArrayOfEmpenhoCapaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfAnexoDTO }
     * 
     */
    public ArrayOfAnexoDTO createArrayOfAnexoDTO() {
        return new ArrayOfAnexoDTO();
    }

    /**
     * Create an instance of {@link EmpenhoItemDTO }
     * 
     */
    public EmpenhoItemDTO createEmpenhoItemDTO() {
        return new EmpenhoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarEmpenhoItemResponse }
     * 
     */
    public ProcessarEmpenhoItemResponse createProcessarEmpenhoItemResponse() {
        return new ProcessarEmpenhoItemResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmpenhoItemCapaDTO }
     * 
     */
    public ArrayOfEmpenhoItemCapaDTO createArrayOfEmpenhoItemCapaDTO() {
        return new ArrayOfEmpenhoItemCapaDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfLiquidacaoEmpenhoDTO }
     * 
     */
    public ArrayOfLiquidacaoEmpenhoDTO createArrayOfLiquidacaoEmpenhoDTO() {
        return new ArrayOfLiquidacaoEmpenhoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link LiquidacaoEmpenhoItemDTO }
     * 
     */
    public LiquidacaoEmpenhoItemDTO createLiquidacaoEmpenhoItemDTO() {
        return new LiquidacaoEmpenhoItemDTO();
    }

    /**
     * Create an instance of {@link ProcessarLiquidacaoEmpenho }
     * 
     */
    public ProcessarLiquidacaoEmpenho createProcessarLiquidacaoEmpenho() {
        return new ProcessarLiquidacaoEmpenho();
    }

    /**
     * Create an instance of {@link ProcessarEstornoEmpenhoResponse }
     * 
     */
    public ProcessarEstornoEmpenhoResponse createProcessarEstornoEmpenhoResponse() {
        return new ProcessarEstornoEmpenhoResponse();
    }

    /**
     * Create an instance of {@link EmpenhoItemCapaDTO }
     * 
     */
    public EmpenhoItemCapaDTO createEmpenhoItemCapaDTO() {
        return new EmpenhoItemCapaDTO();
    }

    /**
     * Create an instance of {@link ProcessarEstornoEmpenhoItem }
     * 
     */
    public ProcessarEstornoEmpenhoItem createProcessarEstornoEmpenhoItem() {
        return new ProcessarEstornoEmpenhoItem();
    }

    /**
     * Create an instance of {@link ProcessarLiquidacaoEmpenhoItem }
     * 
     */
    public ProcessarLiquidacaoEmpenhoItem createProcessarLiquidacaoEmpenhoItem() {
        return new ProcessarLiquidacaoEmpenhoItem();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidacaoEmpenhoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LiquidacaoEmpenhoDTO")
    public JAXBElement<LiquidacaoEmpenhoDTO> createLiquidacaoEmpenhoDTO(LiquidacaoEmpenhoDTO value) {
        return new JAXBElement<LiquidacaoEmpenhoDTO>(_LiquidacaoEmpenhoDTO_QNAME, LiquidacaoEmpenhoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPedidoItemEntregaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPedidoItemEntregaDTO")
    public JAXBElement<ArrayOfPedidoItemEntregaDTO> createArrayOfPedidoItemEntregaDTO(ArrayOfPedidoItemEntregaDTO value) {
        return new JAXBElement<ArrayOfPedidoItemEntregaDTO>(_ArrayOfPedidoItemEntregaDTO_QNAME, ArrayOfPedidoItemEntregaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpenhoCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpenhoCapaDTO")
    public JAXBElement<EmpenhoCapaDTO> createEmpenhoCapaDTO(EmpenhoCapaDTO value) {
        return new JAXBElement<EmpenhoCapaDTO>(_EmpenhoCapaDTO_QNAME, EmpenhoCapaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoItemEntregaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PedidoItemEntregaDTO")
    public JAXBElement<PedidoItemEntregaDTO> createPedidoItemEntregaDTO(PedidoItemEntregaDTO value) {
        return new JAXBElement<PedidoItemEntregaDTO>(_PedidoItemEntregaDTO_QNAME, PedidoItemEntregaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoDesembolsoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpenhoDesembolsoDTO")
    public JAXBElement<ArrayOfEmpenhoDesembolsoDTO> createArrayOfEmpenhoDesembolsoDTO(ArrayOfEmpenhoDesembolsoDTO value) {
        return new JAXBElement<ArrayOfEmpenhoDesembolsoDTO>(_ArrayOfEmpenhoDesembolsoDTO_QNAME, ArrayOfEmpenhoDesembolsoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpenhoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpenhoItemDTO")
    public JAXBElement<EmpenhoItemDTO> createEmpenhoItemDTO(EmpenhoItemDTO value) {
        return new JAXBElement<EmpenhoItemDTO>(_EmpenhoItemDTO_QNAME, EmpenhoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpenhoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpenhoDTO")
    public JAXBElement<EmpenhoDTO> createEmpenhoDTO(EmpenhoDTO value) {
        return new JAXBElement<EmpenhoDTO>(_EmpenhoDTO_QNAME, EmpenhoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AnexoDTO")
    public JAXBElement<AnexoDTO> createAnexoDTO(AnexoDTO value) {
        return new JAXBElement<AnexoDTO>(_AnexoDTO_QNAME, AnexoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPedidoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPedidoItemTaxaDTO")
    public JAXBElement<ArrayOfPedidoItemTaxaDTO> createArrayOfPedidoItemTaxaDTO(ArrayOfPedidoItemTaxaDTO value) {
        return new JAXBElement<ArrayOfPedidoItemTaxaDTO>(_ArrayOfPedidoItemTaxaDTO_QNAME, ArrayOfPedidoItemTaxaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PedidoItemDTO")
    public JAXBElement<PedidoItemDTO> createPedidoItemDTO(PedidoItemDTO value) {
        return new JAXBElement<PedidoItemDTO>(_PedidoItemDTO_QNAME, PedidoItemDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoItemCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpenhoItemCapaDTO")
    public JAXBElement<ArrayOfEmpenhoItemCapaDTO> createArrayOfEmpenhoItemCapaDTO(ArrayOfEmpenhoItemCapaDTO value) {
        return new JAXBElement<ArrayOfEmpenhoItemCapaDTO>(_ArrayOfEmpenhoItemCapaDTO_QNAME, ArrayOfEmpenhoItemCapaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPedidoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfPedidoItemDTO")
    public JAXBElement<ArrayOfPedidoItemDTO> createArrayOfPedidoItemDTO(ArrayOfPedidoItemDTO value) {
        return new JAXBElement<ArrayOfPedidoItemDTO>(_ArrayOfPedidoItemDTO_QNAME, ArrayOfPedidoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoItemTaxaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PedidoItemTaxaDTO")
    public JAXBElement<PedidoItemTaxaDTO> createPedidoItemTaxaDTO(PedidoItemTaxaDTO value) {
        return new JAXBElement<PedidoItemTaxaDTO>(_PedidoItemTaxaDTO_QNAME, PedidoItemTaxaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAnexoDTO")
    public JAXBElement<ArrayOfAnexoDTO> createArrayOfAnexoDTO(ArrayOfAnexoDTO value) {
        return new JAXBElement<ArrayOfAnexoDTO>(_ArrayOfAnexoDTO_QNAME, ArrayOfAnexoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLiquidacaoEmpenhoDTO")
    public JAXBElement<ArrayOfLiquidacaoEmpenhoDTO> createArrayOfLiquidacaoEmpenhoDTO(ArrayOfLiquidacaoEmpenhoDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoDTO>(_ArrayOfLiquidacaoEmpenhoDTO_QNAME, ArrayOfLiquidacaoEmpenhoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EnderecoDTO")
    public JAXBElement<EnderecoDTO> createEnderecoDTO(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_EnderecoDTO_QNAME, EnderecoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpenhoItemCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpenhoItemCapaDTO")
    public JAXBElement<EmpenhoItemCapaDTO> createEmpenhoItemCapaDTO(EmpenhoItemCapaDTO value) {
        return new JAXBElement<EmpenhoItemCapaDTO>(_EmpenhoItemCapaDTO_QNAME, EmpenhoItemCapaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpenhoDesembolsoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpenhoDesembolsoDTO")
    public JAXBElement<EmpenhoDesembolsoDTO> createEmpenhoDesembolsoDTO(EmpenhoDesembolsoDTO value) {
        return new JAXBElement<EmpenhoDesembolsoDTO>(_EmpenhoDesembolsoDTO_QNAME, EmpenhoDesembolsoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PedidoDTO")
    public JAXBElement<PedidoDTO> createPedidoDTO(PedidoDTO value) {
        return new JAXBElement<PedidoDTO>(_PedidoDTO_QNAME, PedidoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpenhoCapaDTO")
    public JAXBElement<ArrayOfEmpenhoCapaDTO> createArrayOfEmpenhoCapaDTO(ArrayOfEmpenhoCapaDTO value) {
        return new JAXBElement<ArrayOfEmpenhoCapaDTO>(_ArrayOfEmpenhoCapaDTO_QNAME, ArrayOfEmpenhoCapaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidacaoEmpenhoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "LiquidacaoEmpenhoItemDTO")
    public JAXBElement<LiquidacaoEmpenhoItemDTO> createLiquidacaoEmpenhoItemDTO(LiquidacaoEmpenhoItemDTO value) {
        return new JAXBElement<LiquidacaoEmpenhoItemDTO>(_LiquidacaoEmpenhoItemDTO_QNAME, LiquidacaoEmpenhoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfLiquidacaoEmpenhoItemDTO")
    public JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> createArrayOfLiquidacaoEmpenhoItemDTO(ArrayOfLiquidacaoEmpenhoItemDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO>(_ArrayOfLiquidacaoEmpenhoItemDTO_QNAME, ArrayOfLiquidacaoEmpenhoItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdOrdemCompraEmpresa", scope = EmpenhoCapaDTO.class)
    public JAXBElement<String> createEmpenhoCapaDTOSCdOrdemCompraEmpresa(String value) {
        return new JAXBElement<String>(_EmpenhoCapaDTOSCdOrdemCompraEmpresa_QNAME, String.class, EmpenhoCapaDTO.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioResponsavel", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdUsuarioResponsavel(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdUsuarioResponsavel_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdIva", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdIva(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdIva_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSDsObservacao_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemOrigemEmpresa", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdItemOrigemEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdItemOrigemEmpresa_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdOrigemEmpresa", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdOrigemEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdOrigemEmpresa_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNbm", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdNbm(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdNbm_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresa", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdEmpresa_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dPcDesconto", scope = PedidoItemDTO.class)
    public JAXBElement<BigDecimal> createPedidoItemDTODPcDesconto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PedidoItemDTODPcDesconto_QNAME, BigDecimal.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstAnexo", scope = PedidoItemDTO.class)
    public JAXBElement<ArrayOfAnexoDTO> createPedidoItemDTOLstAnexo(ArrayOfAnexoDTO value) {
        return new JAXBElement<ArrayOfAnexoDTO>(_PedidoItemDTOLstAnexo_QNAME, ArrayOfAnexoDTO.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemEmpresa", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdItemEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdItemEmpresa_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemWbc", scope = PedidoItemDTO.class)
    public JAXBElement<String> createPedidoItemDTOSCdItemWbc(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSCdItemWbc_QNAME, String.class, PedidoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoDesembolsoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpenhoDesembolsoDTO", scope = ProcessarDesembolsoEmpenho.class)
    public JAXBElement<ArrayOfEmpenhoDesembolsoDTO> createProcessarDesembolsoEmpenhoLstEmpenhoDesembolsoDTO(ArrayOfEmpenhoDesembolsoDTO value) {
        return new JAXBElement<ArrayOfEmpenhoDesembolsoDTO>(_ProcessarDesembolsoEmpenhoLstEmpenhoDesembolsoDTO_QNAME, ArrayOfEmpenhoDesembolsoDTO.class, ProcessarDesembolsoEmpenho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlAtualizado", scope = EmpenhoDesembolsoDTO.class)
    public JAXBElement<BigDecimal> createEmpenhoDesembolsoDTODVlAtualizado(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpenhoDesembolsoDTODVlAtualizado_QNAME, BigDecimal.class, EmpenhoDesembolsoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEmpenhoResult", scope = ProcessarEmpenhoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEmpenhoResponseProcessarEmpenhoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEmpenhoResponseProcessarEmpenhoResult_QNAME, RetornoDTO.class, ProcessarEmpenhoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdPedidoWBC", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdPedidoWBC(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdPedidoWBC_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioProgramador", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdUsuarioProgramador(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdUsuarioProgramador_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsPedidoAuditoria", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSDsPedidoAuditoria(String value) {
        return new JAXBElement<String>(_PedidoDTOSDsPedidoAuditoria_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstAnexo", scope = PedidoDTO.class)
    public JAXBElement<ArrayOfAnexoDTO> createPedidoDTOLstAnexo(ArrayOfAnexoDTO value) {
        return new JAXBElement<ArrayOfAnexoDTO>(_PedidoItemDTOLstAnexo_QNAME, ArrayOfAnexoDTO.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFonteRecurso", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdFonteRecurso(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdFonteRecurso_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacoes", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSDsObservacoes(String value) {
        return new JAXBElement<String>(_PedidoDTOSDsObservacoes_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGrupoCompra", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdGrupoCompra(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdGrupoCompra_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrRgPesquisador", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSNrRgPesquisador(String value) {
        return new JAXBElement<String>(_PedidoDTOSNrRgPesquisador_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCusto", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdCentroCusto(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdCentroCusto_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrVersao", scope = PedidoDTO.class)
    public JAXBElement<Integer> createPedidoDTONNrVersao(Integer value) {
        return new JAXBElement<Integer>(_PedidoDTONNrVersao_QNAME, Integer.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrProjeto", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSNrProjeto(String value) {
        return new JAXBElement<String>(_PedidoDTOSNrProjeto_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdMoeda", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdMoeda(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdMoeda_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdTransportadora", scope = PedidoDTO.class)
    public JAXBElement<String> createPedidoDTOSCdTransportadora(String value) {
        return new JAXBElement<String>(_PedidoDTOSCdTransportadora_QNAME, String.class, PedidoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = LiquidacaoEmpenhoDTO.class)
    public JAXBElement<String> createLiquidacaoEmpenhoDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSDsObservacao_QNAME, String.class, LiquidacaoEmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarLiquidacaoEmpenhoResult", scope = ProcessarLiquidacaoEmpenhoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarLiquidacaoEmpenhoResponseProcessarLiquidacaoEmpenhoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarLiquidacaoEmpenhoResponseProcessarLiquidacaoEmpenhoResult_QNAME, RetornoDTO.class, ProcessarLiquidacaoEmpenhoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_PedidoItemDTOSDsObservacao_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoDespesaMap", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONIdTipoDespesaMap(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONIdTipoDespesaMap_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdGestao(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdGestao_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContrato", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdContrato(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdContrato_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsLocalEntrega", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSDsLocalEntrega(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSDsLocalEntrega_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoLicitacaoMap", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONIdTipoLicitacaoMap(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONIdTipoLicitacaoMap_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNaturezaDespesa", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdNaturezaDespesa(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdNaturezaDespesa_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoCredor", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONIdTipoCredor(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONIdTipoCredor_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCliente", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdEmpresaCliente(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdEmpresaCliente_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDocumento", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdDocumento(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdDocumento_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrSolicitacao", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSNrSolicitacao(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSNrSolicitacao_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdOrigem", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONCdOrigem(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONCdOrigem_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdModalidadeEmpenhoMap", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONIdModalidadeEmpenhoMap(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONIdModalidadeEmpenhoMap_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nNrExercicio", scope = EmpenhoDTO.class)
    public JAXBElement<Integer> createEmpenhoDTONNrExercicio(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoDTONNrExercicio_QNAME, Integer.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdProgramaTrabalho", scope = EmpenhoDTO.class)
    public JAXBElement<String> createEmpenhoDTOSCdProgramaTrabalho(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdProgramaTrabalho_QNAME, String.class, EmpenhoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dQtItemRealizado", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<BigDecimal> createPedidoItemEntregaDTODQtItemRealizado(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PedidoItemEntregaDTODQtItemRealizado_QNAME, BigDecimal.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCobrancaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdEmpresaCobrancaEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdEmpresaCobrancaEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRequisicaoEmpresa", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdRequisicaoEmpresa_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oEntregaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<EnderecoDTO> createPedidoItemEntregaDTOOEntregaEndereco(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_PedidoItemEntregaDTOOEntregaEndereco_QNAME, EnderecoDTO.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dQtUnidade", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<BigDecimal> createPedidoItemEntregaDTODQtUnidade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PedidoItemEntregaDTODQtUnidade_QNAME, BigDecimal.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdEmpresaEntregaEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdEntregaEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdFaturamentoEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oCobrancaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<EnderecoDTO> createPedidoItemEntregaDTOOCobrancaEndereco(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_PedidoItemEntregaDTOOCobrancaEndereco_QNAME, EnderecoDTO.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAlmoxarifado", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdAlmoxarifado(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdAlmoxarifado_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeFornecimento", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdUnidadeFornecimento(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdUnidadeFornecimento_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dQtPorUnidade", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<BigDecimal> createPedidoItemEntregaDTODQtPorUnidade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PedidoItemEntregaDTODQtPorUnidade_QNAME, BigDecimal.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oFaturamentoEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<EnderecoDTO> createPedidoItemEntregaDTOOFaturamentoEndereco(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_PedidoItemEntregaDTOOFaturamentoEndereco_QNAME, EnderecoDTO.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAlmoxarifadoDoca", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdAlmoxarifadoDoca(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdAlmoxarifadoDoca_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemEntregaEmpresa", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdItemEntregaEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdItemEntregaEmpresa_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCustoRequisicao", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdCentroCustoRequisicao(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdCentroCustoRequisicao_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdCobrancaEndereco_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdItemRequisicaoEmpresa", scope = PedidoItemEntregaDTO.class)
    public JAXBElement<String> createPedidoItemEntregaDTOSCdItemRequisicaoEmpresa(String value) {
        return new JAXBElement<String>(_PedidoItemEntregaDTOSCdItemRequisicaoEmpresa_QNAME, String.class, PedidoItemEntregaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmArquivo", scope = AnexoDTO.class)
    public JAXBElement<String> createAnexoDTOSNmArquivo(String value) {
        return new JAXBElement<String>(_AnexoDTOSNmArquivo_QNAME, String.class, AnexoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAnexo", scope = AnexoDTO.class)
    public JAXBElement<String> createAnexoDTOSDsAnexo(String value) {
        return new JAXBElement<String>(_AnexoDTOSDsAnexo_QNAME, String.class, AnexoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEstornoEmpenhoItemResult", scope = ProcessarEstornoEmpenhoItemResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEstornoEmpenhoItemResponseProcessarEstornoEmpenhoItemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEstornoEmpenhoItemResponseProcessarEstornoEmpenhoItemResult_QNAME, RetornoDTO.class, ProcessarEstornoEmpenhoItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarLiquidacaoEmpenhoItemResult", scope = ProcessarLiquidacaoEmpenhoItemResponse.class)
    public JAXBElement<RetornoDTO> createProcessarLiquidacaoEmpenhoItemResponseProcessarLiquidacaoEmpenhoItemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarLiquidacaoEmpenhoItemResponseProcessarLiquidacaoEmpenhoItemResult_QNAME, RetornoDTO.class, ProcessarLiquidacaoEmpenhoItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoItemCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpenhoItemCapaDto", scope = ProcessarEmpenhoItem.class)
    public JAXBElement<ArrayOfEmpenhoItemCapaDTO> createProcessarEmpenhoItemLstEmpenhoItemCapaDto(ArrayOfEmpenhoItemCapaDTO value) {
        return new JAXBElement<ArrayOfEmpenhoItemCapaDTO>(_ProcessarEmpenhoItemLstEmpenhoItemCapaDto_QNAME, ArrayOfEmpenhoItemCapaDTO.class, ProcessarEmpenhoItem.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarDesembolsoEmpenhoResult", scope = ProcessarDesembolsoEmpenhoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarDesembolsoEmpenhoResponseProcessarDesembolsoEmpenhoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarDesembolsoEmpenhoResponseProcessarDesembolsoEmpenhoResult_QNAME, RetornoDTO.class, ProcessarDesembolsoEmpenhoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoCapaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstEmpenhoCapa", scope = ProcessarEmpenho.class)
    public JAXBElement<ArrayOfEmpenhoCapaDTO> createProcessarEmpenhoLstEmpenhoCapa(ArrayOfEmpenhoCapaDTO value) {
        return new JAXBElement<ArrayOfEmpenhoCapaDTO>(_ProcessarEmpenhoLstEmpenhoCapa_QNAME, ArrayOfEmpenhoCapaDTO.class, ProcessarEmpenho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLiquidacaoEmpenhoDTO", scope = ProcessarEstornoEmpenho.class)
    public JAXBElement<ArrayOfLiquidacaoEmpenhoDTO> createProcessarEstornoEmpenhoLstLiquidacaoEmpenhoDTO(ArrayOfLiquidacaoEmpenhoDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoDTO>(_ProcessarEstornoEmpenhoLstLiquidacaoEmpenhoDTO_QNAME, ArrayOfLiquidacaoEmpenhoDTO.class, ProcessarEstornoEmpenho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNaturezaDespesa", scope = EmpenhoItemDTO.class)
    public JAXBElement<String> createEmpenhoItemDTOSCdNaturezaDespesa(String value) {
        return new JAXBElement<String>(_EmpenhoDTOSCdNaturezaDespesa_QNAME, String.class, EmpenhoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoRegistro", scope = EmpenhoItemDTO.class)
    public JAXBElement<Integer> createEmpenhoItemDTONIdTipoRegistro(Integer value) {
        return new JAXBElement<Integer>(_EmpenhoItemDTONIdTipoRegistro_QNAME, Integer.class, EmpenhoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEmpenhoItemResult", scope = ProcessarEmpenhoItemResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEmpenhoItemResponseProcessarEmpenhoItemResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEmpenhoItemResponseProcessarEmpenhoItemResult_QNAME, RetornoDTO.class, ProcessarEmpenhoItemResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlEstorno", scope = LiquidacaoEmpenhoItemDTO.class)
    public JAXBElement<BigDecimal> createLiquidacaoEmpenhoItemDTODVlEstorno(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LiquidacaoEmpenhoItemDTODVlEstorno_QNAME, BigDecimal.class, LiquidacaoEmpenhoItemDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLiquidacaoEmpenhoDTO", scope = ProcessarLiquidacaoEmpenho.class)
    public JAXBElement<ArrayOfLiquidacaoEmpenhoDTO> createProcessarLiquidacaoEmpenhoLstLiquidacaoEmpenhoDTO(ArrayOfLiquidacaoEmpenhoDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoDTO>(_ProcessarEstornoEmpenhoLstLiquidacaoEmpenhoDTO_QNAME, ArrayOfLiquidacaoEmpenhoDTO.class, ProcessarLiquidacaoEmpenho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarEstornoEmpenhoResult", scope = ProcessarEstornoEmpenhoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarEstornoEmpenhoResponseProcessarEstornoEmpenhoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarEstornoEmpenhoResponseProcessarEstornoEmpenhoResult_QNAME, RetornoDTO.class, ProcessarEstornoEmpenhoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLiquidacaoEmpenhoItemDTO", scope = ProcessarEstornoEmpenhoItem.class)
    public JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> createProcessarEstornoEmpenhoItemLstLiquidacaoEmpenhoItemDTO(ArrayOfLiquidacaoEmpenhoItemDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO>(_ProcessarEstornoEmpenhoItemLstLiquidacaoEmpenhoItemDTO_QNAME, ArrayOfLiquidacaoEmpenhoItemDTO.class, ProcessarEstornoEmpenhoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstLiquidacaoEmpenhoItemDTO", scope = ProcessarLiquidacaoEmpenhoItem.class)
    public JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> createProcessarLiquidacaoEmpenhoItemLstLiquidacaoEmpenhoItemDTO(ArrayOfLiquidacaoEmpenhoItemDTO value) {
        return new JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO>(_ProcessarEstornoEmpenhoItemLstLiquidacaoEmpenhoItemDTO_QNAME, ArrayOfLiquidacaoEmpenhoItemDTO.class, ProcessarLiquidacaoEmpenhoItem.class, value);
    }

}
