
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.ordemcompra package. 
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
    private final static QName _NaturezaDespesaDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "NaturezaDespesaDetalheDTO");
    private final static QName _ArrayOfOrdemCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfOrdemCompraDTO");
    private final static QName _CriterioDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CriterioDetalheDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DepartamentoDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "DepartamentoDetalheDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _OrdemCompraConsumoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "OrdemCompraConsumoDTO");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfRequisicaoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfRequisicaoEmpresaDTO");
    private final static QName _RequisicaoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RequisicaoIdiomaDTO");
    private final static QName _AnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AnexoDTO");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _RequisicaoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RequisicaoEmpresaDTO");
    private final static QName _ArrayOfRequisicaoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfRequisicaoIdiomaDTO");
    private final static QName _UnidadeMedidaDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UnidadeMedidaDetalheDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _ArrayOfAnexoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfAnexoDTO");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _RequisicaoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RequisicaoDTO");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _OrdemCompraDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "OrdemCompraDTO");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _RetornoListaX003COrdemCompraDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_OrdemCompraDTO_x003E_");
    private final static QName _OrdemCompraTipoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "OrdemCompraTipoDTO");
    private final static QName _OrdemCompraItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "OrdemCompraItemDTO");
    private final static QName _EmpresaDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaDetalheDTO");
    private final static QName _ArrayOfOrdemCompraConsumoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfOrdemCompraConsumoDTO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _UsuarioDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UsuarioDetalheDTO");
    private final static QName _ContaContabilDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ContaContabilDetalheDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AlmoxarifadoDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AlmoxarifadoDetalheDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CentroCustoDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CentroCustoDetalheDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _AplicacaoDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "AplicacaoDetalheDTO");
    private final static QName _ArrayOfOrdemCompraItemDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfOrdemCompraItemDTO");
    private final static QName _PrioridadeDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "PrioridadeDetalheDTO");
    private final static QName _ArrayOfOrdemCompraTipoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfOrdemCompraTipoDTO");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _EnderecoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EnderecoDTO");
    private final static QName _IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfRequisicaoIdiomaDTOljhnh6kL");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _RetornoListaX003COrdemCompraConsumoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _MarcaDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "MarcaDetalheDTO");
    private final static QName _RetornoListaX003COrdemCompraTipoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_OrdemCompraTipoDTO_x003E_");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _RetornarOrdemCompraConsumoResponseRetornarOrdemCompraConsumoResult_QNAME = new QName("http://tempuri.org/", "RetornarOrdemCompraConsumoResult");
    private final static QName _EnderecoDTOSDsComplemento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsComplemento");
    private final static QName _AplicacaoDetalheDTOSDsAplicacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAplicacao");
    private final static QName _AnexoDTOSNmArquivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmArquivo");
    private final static QName _AnexoDTOSDsAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAnexo");
    private final static QName _MarcaDetalheDTOSDsMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsMarca");
    private final static QName _NaturezaDespesaDetalheDTOSDsNaturezaDespesa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsNaturezaDespesa");
    private final static QName _RetornarOrdemCompraSCdOrdemCompraEmpresa_QNAME = new QName("http://tempuri.org/", "sCdOrdemCompraEmpresa");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _WbtLogDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _RetornarOrdemCompraResponseRetornarOrdemCompraResult_QNAME = new QName("http://tempuri.org/", "RetornarOrdemCompraResult");
    private final static QName _CentroCustoDetalheDTOSDsCentroCusto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsCentroCusto");
    private final static QName _CriterioDetalheDTOSNrCriterio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCriterio");
    private final static QName _CriterioDetalheDTOSDsCriterio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsCriterio");
    private final static QName _UsuarioDetalheDTOSNrCnpjEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrCnpjEmpresa");
    private final static QName _UsuarioDetalheDTOSNmUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmUsuario");
    private final static QName _DepartamentoDetalheDTOSDsDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsDepartamento");
    private final static QName _ProcessarOrdemCompraResponseProcessarOrdemCompraResult_QNAME = new QName("http://tempuri.org/", "ProcessarOrdemCompraResult");
    private final static QName _OrdemCompraDTOSCdDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdDepartamento");
    private final static QName _OrdemCompraDTOSCdGestao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGestao");
    private final static QName _OrdemCompraDTOODepartamentoDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oDepartamentoDetalhe");
    private final static QName _OrdemCompraDTOSCdEmpresaEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaEntregaEndereco");
    private final static QName _OrdemCompraDTOLstOrdemCompraItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstOrdemCompraItem");
    private final static QName _OrdemCompraDTOSCdEntregaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEntregaEndereco");
    private final static QName _OrdemCompraDTOSCdFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFaturamentoEndereco");
    private final static QName _OrdemCompraDTONCdCriterioPlanejamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdCriterioPlanejamento");
    private final static QName _OrdemCompraDTOSCdEmpresaFaturamentoEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaFaturamentoEndereco");
    private final static QName _OrdemCompraDTOOUsuarioCompradorDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUsuarioCompradorDetalhe");
    private final static QName _OrdemCompraDTONCdClassificacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdClassificacao");
    private final static QName _OrdemCompraDTOSCdAlmoxarifado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdAlmoxarifado");
    private final static QName _OrdemCompraDTOOUsuarioResponsavelDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUsuarioResponsavelDetalhe");
    private final static QName _OrdemCompraDTOBFlLiberaRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "bFlLiberaRequisicao");
    private final static QName _OrdemCompraDTOOEnderecoEntregaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oEnderecoEntregaDetalhe");
    private final static QName _OrdemCompraDTOSCdUsuarioComprador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUsuarioComprador");
    private final static QName _OrdemCompraDTOOAplicacaoDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oAplicacaoDetalhe");
    private final static QName _OrdemCompraDTOOPrioridadeDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oPrioridadeDetalhe");
    private final static QName _OrdemCompraDTOSCdEmpresaCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdEmpresaCobrancaEndereco");
    private final static QName _OrdemCompraDTOOEnderecoFaturamentoDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oEnderecoFaturamentoDetalhe");
    private final static QName _OrdemCompraDTOSCdContaContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdContaContabil");
    private final static QName _OrdemCompraDTOOEmpresaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oEmpresaDetalhe");
    private final static QName _OrdemCompraDTOOEnderecoCobrancaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oEnderecoCobrancaDetalhe");
    private final static QName _OrdemCompraDTOOAlmoxarifadoDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oAlmoxarifadoDetalhe");
    private final static QName _OrdemCompraDTOSCdCentroCusto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCentroCusto");
    private final static QName _OrdemCompraDTOSCdCobrancaEndereco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdCobrancaEndereco");
    private final static QName _OrdemCompraDTOOCentroCustoDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oCentroCustoDetalhe");
    private final static QName _OrdemCompraDTONCdModalidade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdModalidade");
    private final static QName _ContaContabilDetalheDTOSDsContaContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsContaContabil");
    private final static QName _AlmoxarifadoDetalheDTOSDsAlmoxarifado_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsAlmoxarifado");
    private final static QName _RequisicaoDTOOCriterioDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oCriterioDetalhe");
    private final static QName _RequisicaoDTOSDsObservacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacao");
    private final static QName _RequisicaoDTOSCdFonteRecurso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdFonteRecurso");
    private final static QName _RequisicaoDTOLstRequisicaoEmpresaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstRequisicaoEmpresaDTO");
    private final static QName _RequisicaoDTODVlReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "dVlReferencia");
    private final static QName _RequisicaoDTOOUnidadeMedidaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUnidadeMedidaDetalhe");
    private final static QName _RequisicaoDTOSCdUnidadeNegocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdUnidadeNegocio");
    private final static QName _RequisicaoDTONIdTipoRequisicao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nIdTipoRequisicao");
    private final static QName _RequisicaoDTOOContaContabilDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oContaContabilDetalhe");
    private final static QName _RequisicaoDTOONaturezaDespesaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oNaturezaDespesaDetalhe");
    private final static QName _RequisicaoDTOLstRequisicaoIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstRequisicaoIdioma");
    private final static QName _RequisicaoDTOSDsObservacaoInterna_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsObservacaoInterna");
    private final static QName _RequisicaoDTONCdMoeda_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdMoeda");
    private final static QName _RequisicaoDTONCdMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdMarca");
    private final static QName _RequisicaoDTOSDsDetalheCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsDetalheCliente");
    private final static QName _RequisicaoDTOLstAnexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstAnexo");
    private final static QName _RequisicaoDTOSCdGrupoCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdGrupoCompra");
    private final static QName _RequisicaoDTOSCdNaturezaDespesa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdNaturezaDespesa");
    private final static QName _RequisicaoDTOOMarcaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oMarcaDetalhe");
    private final static QName _RetornarOrdemCompraTipoResponseRetornarOrdemCompraTipoResult_QNAME = new QName("http://tempuri.org/", "RetornarOrdemCompraTipoResult");
    private final static QName _EmpresaDetalheDTOSNmEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNmEmpresa");
    private final static QName _PrioridadeDetalheDTOSDsPrioridade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsPrioridade");
    private final static QName _UnidadeMedidaDetalheDTOSSgUnidadeMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgUnidadeMedida");
    private final static QName _UnidadeMedidaDetalheDTOSDsUnidadeMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUnidadeMedida");
    private final static QName _RequisicaoIdiomaDTOSDsJustificativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsJustificativa");
    private final static QName _ProcessarOrdemCompraLstOrdemCompra_QNAME = new QName("http://tempuri.org/", "lstOrdemCompra");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.ordemcompra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL createIdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompraConsumoResponse }
     * 
     */
    public RetornarOrdemCompraConsumoResponse createRetornarOrdemCompraConsumoResponse() {
        return new RetornarOrdemCompraConsumoResponse();
    }

    /**
     * Create an instance of {@link EnderecoDTO }
     * 
     */
    public EnderecoDTO createEnderecoDTO() {
        return new EnderecoDTO();
    }

    /**
     * Create an instance of {@link AnexoDTO }
     * 
     */
    public AnexoDTO createAnexoDTO() {
        return new AnexoDTO();
    }

    /**
     * Create an instance of {@link AplicacaoDetalheDTO }
     * 
     */
    public AplicacaoDetalheDTO createAplicacaoDetalheDTO() {
        return new AplicacaoDetalheDTO();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link MarcaDetalheDTO }
     * 
     */
    public MarcaDetalheDTO createMarcaDetalheDTO() {
        return new MarcaDetalheDTO();
    }

    /**
     * Create an instance of {@link NaturezaDespesaDetalheDTO }
     * 
     */
    public NaturezaDespesaDetalheDTO createNaturezaDespesaDetalheDTO() {
        return new NaturezaDespesaDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003COrdemCompraDTOX003E }
     * 
     */
    public RetornoListaX003COrdemCompraDTOX003E createRetornoListaX003COrdemCompraDTOX003E() {
        return new RetornoListaX003COrdemCompraDTOX003E();
    }

    /**
     * Create an instance of {@link OrdemCompraConsumoDTO }
     * 
     */
    public OrdemCompraConsumoDTO createOrdemCompraConsumoDTO() {
        return new OrdemCompraConsumoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrdemCompraConsumoDTO }
     * 
     */
    public ArrayOfOrdemCompraConsumoDTO createArrayOfOrdemCompraConsumoDTO() {
        return new ArrayOfOrdemCompraConsumoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrdemCompraDTO }
     * 
     */
    public ArrayOfOrdemCompraDTO createArrayOfOrdemCompraDTO() {
        return new ArrayOfOrdemCompraDTO();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompra }
     * 
     */
    public RetornarOrdemCompra createRetornarOrdemCompra() {
        return new RetornarOrdemCompra();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompraTipo }
     * 
     */
    public RetornarOrdemCompraTipo createRetornarOrdemCompraTipo() {
        return new RetornarOrdemCompraTipo();
    }

    /**
     * Create an instance of {@link RequisicaoEmpresaDTO }
     * 
     */
    public RequisicaoEmpresaDTO createRequisicaoEmpresaDTO() {
        return new RequisicaoEmpresaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfAnexoDTO }
     * 
     */
    public ArrayOfAnexoDTO createArrayOfAnexoDTO() {
        return new ArrayOfAnexoDTO();
    }

    /**
     * Create an instance of {@link CentroCustoDetalheDTO }
     * 
     */
    public CentroCustoDetalheDTO createCentroCustoDetalheDTO() {
        return new CentroCustoDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompraResponse }
     * 
     */
    public RetornarOrdemCompraResponse createRetornarOrdemCompraResponse() {
        return new RetornarOrdemCompraResponse();
    }

    /**
     * Create an instance of {@link CriterioDetalheDTO }
     * 
     */
    public CriterioDetalheDTO createCriterioDetalheDTO() {
        return new CriterioDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003COrdemCompraTipoDTOX003E }
     * 
     */
    public RetornoListaX003COrdemCompraTipoDTOX003E createRetornoListaX003COrdemCompraTipoDTOX003E() {
        return new RetornoListaX003COrdemCompraTipoDTOX003E();
    }

    /**
     * Create an instance of {@link OrdemCompraItemDTO }
     * 
     */
    public OrdemCompraItemDTO createOrdemCompraItemDTO() {
        return new OrdemCompraItemDTO();
    }

    /**
     * Create an instance of {@link OrdemCompraTipoDTO }
     * 
     */
    public OrdemCompraTipoDTO createOrdemCompraTipoDTO() {
        return new OrdemCompraTipoDTO();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link UsuarioDetalheDTO }
     * 
     */
    public UsuarioDetalheDTO createUsuarioDetalheDTO() {
        return new UsuarioDetalheDTO();
    }

    /**
     * Create an instance of {@link DepartamentoDetalheDTO }
     * 
     */
    public DepartamentoDetalheDTO createDepartamentoDetalheDTO() {
        return new DepartamentoDetalheDTO();
    }

    /**
     * Create an instance of {@link ProcessarOrdemCompraResponse }
     * 
     */
    public ProcessarOrdemCompraResponse createProcessarOrdemCompraResponse() {
        return new ProcessarOrdemCompraResponse();
    }

    /**
     * Create an instance of {@link OrdemCompraDTO }
     * 
     */
    public OrdemCompraDTO createOrdemCompraDTO() {
        return new OrdemCompraDTO();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ContaContabilDetalheDTO }
     * 
     */
    public ContaContabilDetalheDTO createContaContabilDetalheDTO() {
        return new ContaContabilDetalheDTO();
    }

    /**
     * Create an instance of {@link AlmoxarifadoDetalheDTO }
     * 
     */
    public AlmoxarifadoDetalheDTO createAlmoxarifadoDetalheDTO() {
        return new AlmoxarifadoDetalheDTO();
    }

    /**
     * Create an instance of {@link RequisicaoDTO }
     * 
     */
    public RequisicaoDTO createRequisicaoDTO() {
        return new RequisicaoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrdemCompraItemDTO }
     * 
     */
    public ArrayOfOrdemCompraItemDTO createArrayOfOrdemCompraItemDTO() {
        return new ArrayOfOrdemCompraItemDTO();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompraTipoResponse }
     * 
     */
    public RetornarOrdemCompraTipoResponse createRetornarOrdemCompraTipoResponse() {
        return new RetornarOrdemCompraTipoResponse();
    }

    /**
     * Create an instance of {@link RetornarOrdemCompraConsumo }
     * 
     */
    public RetornarOrdemCompraConsumo createRetornarOrdemCompraConsumo() {
        return new RetornarOrdemCompraConsumo();
    }

    /**
     * Create an instance of {@link EmpresaDetalheDTO }
     * 
     */
    public EmpresaDetalheDTO createEmpresaDetalheDTO() {
        return new EmpresaDetalheDTO();
    }

    /**
     * Create an instance of {@link PrioridadeDetalheDTO }
     * 
     */
    public PrioridadeDetalheDTO createPrioridadeDetalheDTO() {
        return new PrioridadeDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornoListaX003COrdemCompraConsumoDTOX003E }
     * 
     */
    public RetornoListaX003COrdemCompraConsumoDTOX003E createRetornoListaX003COrdemCompraConsumoDTOX003E() {
        return new RetornoListaX003COrdemCompraConsumoDTOX003E();
    }

    /**
     * Create an instance of {@link ArrayOfRequisicaoIdiomaDTO }
     * 
     */
    public ArrayOfRequisicaoIdiomaDTO createArrayOfRequisicaoIdiomaDTO() {
        return new ArrayOfRequisicaoIdiomaDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrdemCompraTipoDTO }
     * 
     */
    public ArrayOfOrdemCompraTipoDTO createArrayOfOrdemCompraTipoDTO() {
        return new ArrayOfOrdemCompraTipoDTO();
    }

    /**
     * Create an instance of {@link RequisicaoIdiomaDTO }
     * 
     */
    public RequisicaoIdiomaDTO createRequisicaoIdiomaDTO() {
        return new RequisicaoIdiomaDTO();
    }

    /**
     * Create an instance of {@link UnidadeMedidaDetalheDTO }
     * 
     */
    public UnidadeMedidaDetalheDTO createUnidadeMedidaDetalheDTO() {
        return new UnidadeMedidaDetalheDTO();
    }

    /**
     * Create an instance of {@link ArrayOfRequisicaoEmpresaDTO }
     * 
     */
    public ArrayOfRequisicaoEmpresaDTO createArrayOfRequisicaoEmpresaDTO() {
        return new ArrayOfRequisicaoEmpresaDTO();
    }

    /**
     * Create an instance of {@link ProcessarOrdemCompra }
     * 
     */
    public ProcessarOrdemCompra createProcessarOrdemCompra() {
        return new ProcessarOrdemCompra();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturezaDespesaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "NaturezaDespesaDetalheDTO")
    public JAXBElement<NaturezaDespesaDetalheDTO> createNaturezaDespesaDetalheDTO(NaturezaDespesaDetalheDTO value) {
        return new JAXBElement<NaturezaDespesaDetalheDTO>(_NaturezaDespesaDetalheDTO_QNAME, NaturezaDespesaDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfOrdemCompraDTO")
    public JAXBElement<ArrayOfOrdemCompraDTO> createArrayOfOrdemCompraDTO(ArrayOfOrdemCompraDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraDTO>(_ArrayOfOrdemCompraDTO_QNAME, ArrayOfOrdemCompraDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CriterioDetalheDTO")
    public JAXBElement<CriterioDetalheDTO> createCriterioDetalheDTO(CriterioDetalheDTO value) {
        return new JAXBElement<CriterioDetalheDTO>(_CriterioDetalheDTO_QNAME, CriterioDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartamentoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "DepartamentoDetalheDTO")
    public JAXBElement<DepartamentoDetalheDTO> createDepartamentoDetalheDTO(DepartamentoDetalheDTO value) {
        return new JAXBElement<DepartamentoDetalheDTO>(_DepartamentoDetalheDTO_QNAME, DepartamentoDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdemCompraConsumoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "OrdemCompraConsumoDTO")
    public JAXBElement<OrdemCompraConsumoDTO> createOrdemCompraConsumoDTO(OrdemCompraConsumoDTO value) {
        return new JAXBElement<OrdemCompraConsumoDTO>(_OrdemCompraConsumoDTO_QNAME, OrdemCompraConsumoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfRequisicaoEmpresaDTO")
    public JAXBElement<ArrayOfRequisicaoEmpresaDTO> createArrayOfRequisicaoEmpresaDTO(ArrayOfRequisicaoEmpresaDTO value) {
        return new JAXBElement<ArrayOfRequisicaoEmpresaDTO>(_ArrayOfRequisicaoEmpresaDTO_QNAME, ArrayOfRequisicaoEmpresaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequisicaoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RequisicaoIdiomaDTO")
    public JAXBElement<RequisicaoIdiomaDTO> createRequisicaoIdiomaDTO(RequisicaoIdiomaDTO value) {
        return new JAXBElement<RequisicaoIdiomaDTO>(_RequisicaoIdiomaDTO_QNAME, RequisicaoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequisicaoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RequisicaoEmpresaDTO")
    public JAXBElement<RequisicaoEmpresaDTO> createRequisicaoEmpresaDTO(RequisicaoEmpresaDTO value) {
        return new JAXBElement<RequisicaoEmpresaDTO>(_RequisicaoEmpresaDTO_QNAME, RequisicaoEmpresaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfRequisicaoIdiomaDTO")
    public JAXBElement<ArrayOfRequisicaoIdiomaDTO> createArrayOfRequisicaoIdiomaDTO(ArrayOfRequisicaoIdiomaDTO value) {
        return new JAXBElement<ArrayOfRequisicaoIdiomaDTO>(_ArrayOfRequisicaoIdiomaDTO_QNAME, ArrayOfRequisicaoIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "UnidadeMedidaDetalheDTO")
    public JAXBElement<UnidadeMedidaDetalheDTO> createUnidadeMedidaDetalheDTO(UnidadeMedidaDetalheDTO value) {
        return new JAXBElement<UnidadeMedidaDetalheDTO>(_UnidadeMedidaDetalheDTO_QNAME, UnidadeMedidaDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfAnexoDTO")
    public JAXBElement<ArrayOfAnexoDTO> createArrayOfAnexoDTO(ArrayOfAnexoDTO value) {
        return new JAXBElement<ArrayOfAnexoDTO>(_ArrayOfAnexoDTO_QNAME, ArrayOfAnexoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequisicaoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RequisicaoDTO")
    public JAXBElement<RequisicaoDTO> createRequisicaoDTO(RequisicaoDTO value) {
        return new JAXBElement<RequisicaoDTO>(_RequisicaoDTO_QNAME, RequisicaoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "OrdemCompraDTO")
    public JAXBElement<OrdemCompraDTO> createOrdemCompraDTO(OrdemCompraDTO value) {
        return new JAXBElement<OrdemCompraDTO>(_OrdemCompraDTO_QNAME, OrdemCompraDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_OrdemCompraDTO_x003E_")
    public JAXBElement<RetornoListaX003COrdemCompraDTOX003E> createRetornoListaX003COrdemCompraDTOX003E(RetornoListaX003COrdemCompraDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraDTOX003E>(_RetornoListaX003COrdemCompraDTOX003E_QNAME, RetornoListaX003COrdemCompraDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdemCompraTipoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "OrdemCompraTipoDTO")
    public JAXBElement<OrdemCompraTipoDTO> createOrdemCompraTipoDTO(OrdemCompraTipoDTO value) {
        return new JAXBElement<OrdemCompraTipoDTO>(_OrdemCompraTipoDTO_QNAME, OrdemCompraTipoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdemCompraItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "OrdemCompraItemDTO")
    public JAXBElement<OrdemCompraItemDTO> createOrdemCompraItemDTO(OrdemCompraItemDTO value) {
        return new JAXBElement<OrdemCompraItemDTO>(_OrdemCompraItemDTO_QNAME, OrdemCompraItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaDetalheDTO")
    public JAXBElement<EmpresaDetalheDTO> createEmpresaDetalheDTO(EmpresaDetalheDTO value) {
        return new JAXBElement<EmpresaDetalheDTO>(_EmpresaDetalheDTO_QNAME, EmpresaDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraConsumoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfOrdemCompraConsumoDTO")
    public JAXBElement<ArrayOfOrdemCompraConsumoDTO> createArrayOfOrdemCompraConsumoDTO(ArrayOfOrdemCompraConsumoDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraConsumoDTO>(_ArrayOfOrdemCompraConsumoDTO_QNAME, ArrayOfOrdemCompraConsumoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaContabilDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ContaContabilDetalheDTO")
    public JAXBElement<ContaContabilDetalheDTO> createContaContabilDetalheDTO(ContaContabilDetalheDTO value) {
        return new JAXBElement<ContaContabilDetalheDTO>(_ContaContabilDetalheDTO_QNAME, ContaContabilDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AlmoxarifadoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AlmoxarifadoDetalheDTO")
    public JAXBElement<AlmoxarifadoDetalheDTO> createAlmoxarifadoDetalheDTO(AlmoxarifadoDetalheDTO value) {
        return new JAXBElement<AlmoxarifadoDetalheDTO>(_AlmoxarifadoDetalheDTO_QNAME, AlmoxarifadoDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CentroCustoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CentroCustoDetalheDTO")
    public JAXBElement<CentroCustoDetalheDTO> createCentroCustoDetalheDTO(CentroCustoDetalheDTO value) {
        return new JAXBElement<CentroCustoDetalheDTO>(_CentroCustoDetalheDTO_QNAME, CentroCustoDetalheDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicacaoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "AplicacaoDetalheDTO")
    public JAXBElement<AplicacaoDetalheDTO> createAplicacaoDetalheDTO(AplicacaoDetalheDTO value) {
        return new JAXBElement<AplicacaoDetalheDTO>(_AplicacaoDetalheDTO_QNAME, AplicacaoDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfOrdemCompraItemDTO")
    public JAXBElement<ArrayOfOrdemCompraItemDTO> createArrayOfOrdemCompraItemDTO(ArrayOfOrdemCompraItemDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraItemDTO>(_ArrayOfOrdemCompraItemDTO_QNAME, ArrayOfOrdemCompraItemDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrioridadeDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "PrioridadeDetalheDTO")
    public JAXBElement<PrioridadeDetalheDTO> createPrioridadeDetalheDTO(PrioridadeDetalheDTO value) {
        return new JAXBElement<PrioridadeDetalheDTO>(_PrioridadeDetalheDTO_QNAME, PrioridadeDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraTipoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfOrdemCompraTipoDTO")
    public JAXBElement<ArrayOfOrdemCompraTipoDTO> createArrayOfOrdemCompraTipoDTO(ArrayOfOrdemCompraTipoDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraTipoDTO>(_ArrayOfOrdemCompraTipoDTO_QNAME, ArrayOfOrdemCompraTipoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EnderecoDTO")
    public JAXBElement<EnderecoDTO> createEnderecoDTO(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_EnderecoDTO_QNAME, EnderecoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfRequisicaoIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL> createIdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL(IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL>(_IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfRequisicaoIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraConsumoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_")
    public JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> createRetornoListaX003COrdemCompraConsumoDTOX003E(RetornoListaX003COrdemCompraConsumoDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E>(_RetornoListaX003COrdemCompraConsumoDTOX003E_QNAME, RetornoListaX003COrdemCompraConsumoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MarcaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "MarcaDetalheDTO")
    public JAXBElement<MarcaDetalheDTO> createMarcaDetalheDTO(MarcaDetalheDTO value) {
        return new JAXBElement<MarcaDetalheDTO>(_MarcaDetalheDTO_QNAME, MarcaDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraTipoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_OrdemCompraTipoDTO_x003E_")
    public JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> createRetornoListaX003COrdemCompraTipoDTOX003E(RetornoListaX003COrdemCompraTipoDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E>(_RetornoListaX003COrdemCompraTipoDTOX003E_QNAME, RetornoListaX003COrdemCompraTipoDTOX003E.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraConsumoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarOrdemCompraConsumoResult", scope = RetornarOrdemCompraConsumoResponse.class)
    public JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> createRetornarOrdemCompraConsumoResponseRetornarOrdemCompraConsumoResult(RetornoListaX003COrdemCompraConsumoDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E>(_RetornarOrdemCompraConsumoResponseRetornarOrdemCompraConsumoResult_QNAME, RetornoListaX003COrdemCompraConsumoDTOX003E.class, RetornarOrdemCompraConsumoResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAplicacao", scope = AplicacaoDetalheDTO.class)
    public JAXBElement<String> createAplicacaoDetalheDTOSDsAplicacao(String value) {
        return new JAXBElement<String>(_AplicacaoDetalheDTOSDsAplicacao_QNAME, String.class, AplicacaoDetalheDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsMarca", scope = MarcaDetalheDTO.class)
    public JAXBElement<String> createMarcaDetalheDTOSDsMarca(String value) {
        return new JAXBElement<String>(_MarcaDetalheDTOSDsMarca_QNAME, String.class, MarcaDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsNaturezaDespesa", scope = NaturezaDespesaDetalheDTO.class)
    public JAXBElement<String> createNaturezaDespesaDetalheDTOSDsNaturezaDespesa(String value) {
        return new JAXBElement<String>(_NaturezaDespesaDetalheDTOSDsNaturezaDespesa_QNAME, String.class, NaturezaDespesaDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdOrdemCompraEmpresa", scope = RetornarOrdemCompra.class)
    public JAXBElement<String> createRetornarOrdemCompraSCdOrdemCompraEmpresa(String value) {
        return new JAXBElement<String>(_RetornarOrdemCompraSCdOrdemCompraEmpresa_QNAME, String.class, RetornarOrdemCompra.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarOrdemCompraResult", scope = RetornarOrdemCompraResponse.class)
    public JAXBElement<RetornoListaX003COrdemCompraDTOX003E> createRetornarOrdemCompraResponseRetornarOrdemCompraResult(RetornoListaX003COrdemCompraDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraDTOX003E>(_RetornarOrdemCompraResponseRetornarOrdemCompraResult_QNAME, RetornoListaX003COrdemCompraDTOX003E.class, RetornarOrdemCompraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsCentroCusto", scope = CentroCustoDetalheDTO.class)
    public JAXBElement<String> createCentroCustoDetalheDTOSDsCentroCusto(String value) {
        return new JAXBElement<String>(_CentroCustoDetalheDTOSDsCentroCusto_QNAME, String.class, CentroCustoDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNrCriterio", scope = CriterioDetalheDTO.class)
    public JAXBElement<String> createCriterioDetalheDTOSNrCriterio(String value) {
        return new JAXBElement<String>(_CriterioDetalheDTOSNrCriterio_QNAME, String.class, CriterioDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsCriterio", scope = CriterioDetalheDTO.class)
    public JAXBElement<String> createCriterioDetalheDTOSDsCriterio(String value) {
        return new JAXBElement<String>(_CriterioDetalheDTOSDsCriterio_QNAME, String.class, CriterioDetalheDTO.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsDepartamento", scope = DepartamentoDetalheDTO.class)
    public JAXBElement<String> createDepartamentoDetalheDTOSDsDepartamento(String value) {
        return new JAXBElement<String>(_DepartamentoDetalheDTOSDsDepartamento_QNAME, String.class, DepartamentoDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarOrdemCompraResult", scope = ProcessarOrdemCompraResponse.class)
    public JAXBElement<RetornoDTO> createProcessarOrdemCompraResponseProcessarOrdemCompraResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarOrdemCompraResponseProcessarOrdemCompraResult_QNAME, RetornoDTO.class, ProcessarOrdemCompraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDepartamento", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdDepartamento(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdDepartamento_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGestao", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdGestao(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdGestao_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartamentoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oDepartamentoDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<DepartamentoDetalheDTO> createOrdemCompraDTOODepartamentoDetalhe(DepartamentoDetalheDTO value) {
        return new JAXBElement<DepartamentoDetalheDTO>(_OrdemCompraDTOODepartamentoDetalhe_QNAME, DepartamentoDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaEntregaEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraItemDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstOrdemCompraItem", scope = OrdemCompraDTO.class)
    public JAXBElement<ArrayOfOrdemCompraItemDTO> createOrdemCompraDTOLstOrdemCompraItem(ArrayOfOrdemCompraItemDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraItemDTO>(_OrdemCompraDTOLstOrdemCompraItem_QNAME, ArrayOfOrdemCompraItemDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEntregaEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdFaturamentoEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdCriterioPlanejamento", scope = OrdemCompraDTO.class)
    public JAXBElement<Long> createOrdemCompraDTONCdCriterioPlanejamento(Long value) {
        return new JAXBElement<Long>(_OrdemCompraDTONCdCriterioPlanejamento_QNAME, Long.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUsuarioCompradorDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<UsuarioDetalheDTO> createOrdemCompraDTOOUsuarioCompradorDetalhe(UsuarioDetalheDTO value) {
        return new JAXBElement<UsuarioDetalheDTO>(_OrdemCompraDTOOUsuarioCompradorDetalhe_QNAME, UsuarioDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdClassificacao", scope = OrdemCompraDTO.class)
    public JAXBElement<Long> createOrdemCompraDTONCdClassificacao(Long value) {
        return new JAXBElement<Long>(_OrdemCompraDTONCdClassificacao_QNAME, Long.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdAlmoxarifado", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdAlmoxarifado(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdAlmoxarifado_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUsuarioResponsavelDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<UsuarioDetalheDTO> createOrdemCompraDTOOUsuarioResponsavelDetalhe(UsuarioDetalheDTO value) {
        return new JAXBElement<UsuarioDetalheDTO>(_OrdemCompraDTOOUsuarioResponsavelDetalhe_QNAME, UsuarioDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "bFlLiberaRequisicao", scope = OrdemCompraDTO.class)
    public JAXBElement<Long> createOrdemCompraDTOBFlLiberaRequisicao(Long value) {
        return new JAXBElement<Long>(_OrdemCompraDTOBFlLiberaRequisicao_QNAME, Long.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oEnderecoEntregaDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<EnderecoDTO> createOrdemCompraDTOOEnderecoEntregaDetalhe(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_OrdemCompraDTOOEnderecoEntregaDetalhe_QNAME, EnderecoDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioComprador", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdUsuarioComprador(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdUsuarioComprador_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicacaoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oAplicacaoDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<AplicacaoDetalheDTO> createOrdemCompraDTOOAplicacaoDetalhe(AplicacaoDetalheDTO value) {
        return new JAXBElement<AplicacaoDetalheDTO>(_OrdemCompraDTOOAplicacaoDetalhe_QNAME, AplicacaoDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrioridadeDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oPrioridadeDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<PrioridadeDetalheDTO> createOrdemCompraDTOOPrioridadeDetalhe(PrioridadeDetalheDTO value) {
        return new JAXBElement<PrioridadeDetalheDTO>(_OrdemCompraDTOOPrioridadeDetalhe_QNAME, PrioridadeDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCobrancaEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdEmpresaCobrancaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaCobrancaEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oEnderecoFaturamentoDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<EnderecoDTO> createOrdemCompraDTOOEnderecoFaturamentoDetalhe(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_OrdemCompraDTOOEnderecoFaturamentoDetalhe_QNAME, EnderecoDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaContabil", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdContaContabil(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdContaContabil_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oEmpresaDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<EmpresaDetalheDTO> createOrdemCompraDTOOEmpresaDetalhe(EmpresaDetalheDTO value) {
        return new JAXBElement<EmpresaDetalheDTO>(_OrdemCompraDTOOEmpresaDetalhe_QNAME, EmpresaDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oEnderecoCobrancaDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<EnderecoDTO> createOrdemCompraDTOOEnderecoCobrancaDetalhe(EnderecoDTO value) {
        return new JAXBElement<EnderecoDTO>(_OrdemCompraDTOOEnderecoCobrancaDetalhe_QNAME, EnderecoDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlmoxarifadoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oAlmoxarifadoDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<AlmoxarifadoDetalheDTO> createOrdemCompraDTOOAlmoxarifadoDetalhe(AlmoxarifadoDetalheDTO value) {
        return new JAXBElement<AlmoxarifadoDetalheDTO>(_OrdemCompraDTOOAlmoxarifadoDetalhe_QNAME, AlmoxarifadoDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCusto", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdCentroCusto(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdCentroCusto_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = OrdemCompraDTO.class)
    public JAXBElement<String> createOrdemCompraDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdCobrancaEndereco_QNAME, String.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentroCustoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oCentroCustoDetalhe", scope = OrdemCompraDTO.class)
    public JAXBElement<CentroCustoDetalheDTO> createOrdemCompraDTOOCentroCustoDetalhe(CentroCustoDetalheDTO value) {
        return new JAXBElement<CentroCustoDetalheDTO>(_OrdemCompraDTOOCentroCustoDetalhe_QNAME, CentroCustoDetalheDTO.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdModalidade", scope = OrdemCompraDTO.class)
    public JAXBElement<Long> createOrdemCompraDTONCdModalidade(Long value) {
        return new JAXBElement<Long>(_OrdemCompraDTONCdModalidade_QNAME, Long.class, OrdemCompraDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsContaContabil", scope = ContaContabilDetalheDTO.class)
    public JAXBElement<String> createContaContabilDetalheDTOSDsContaContabil(String value) {
        return new JAXBElement<String>(_ContaContabilDetalheDTOSDsContaContabil_QNAME, String.class, ContaContabilDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAlmoxarifado", scope = AlmoxarifadoDetalheDTO.class)
    public JAXBElement<String> createAlmoxarifadoDetalheDTOSDsAlmoxarifado(String value) {
        return new JAXBElement<String>(_AlmoxarifadoDetalheDTOSDsAlmoxarifado_QNAME, String.class, AlmoxarifadoDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterioDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oCriterioDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<CriterioDetalheDTO> createRequisicaoDTOOCriterioDetalhe(CriterioDetalheDTO value) {
        return new JAXBElement<CriterioDetalheDTO>(_RequisicaoDTOOCriterioDetalhe_QNAME, CriterioDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSDsObservacao_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdDepartamento", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdDepartamento(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdDepartamento_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFonteRecurso", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdFonteRecurso(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSCdFonteRecurso_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaEntregaEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdEmpresaEntregaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaEntregaEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoEmpresaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstRequisicaoEmpresaDTO", scope = RequisicaoDTO.class)
    public JAXBElement<ArrayOfRequisicaoEmpresaDTO> createRequisicaoDTOLstRequisicaoEmpresaDTO(ArrayOfRequisicaoEmpresaDTO value) {
        return new JAXBElement<ArrayOfRequisicaoEmpresaDTO>(_RequisicaoDTOLstRequisicaoEmpresaDTO_QNAME, ArrayOfRequisicaoEmpresaDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "dVlReferencia", scope = RequisicaoDTO.class)
    public JAXBElement<BigDecimal> createRequisicaoDTODVlReferencia(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisicaoDTODVlReferencia_QNAME, BigDecimal.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEntregaEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdEntregaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEntregaEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdFaturamentoEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdFaturamentoEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUnidadeMedidaDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<UnidadeMedidaDetalheDTO> createRequisicaoDTOOUnidadeMedidaDetalhe(UnidadeMedidaDetalheDTO value) {
        return new JAXBElement<UnidadeMedidaDetalheDTO>(_RequisicaoDTOOUnidadeMedidaDetalhe_QNAME, UnidadeMedidaDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaFaturamentoEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdEmpresaFaturamentoEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaFaturamentoEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUnidadeNegocio", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdUnidadeNegocio(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSCdUnidadeNegocio_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdUsuarioComprador", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdUsuarioComprador(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdUsuarioComprador_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicacaoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oAplicacaoDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<AplicacaoDetalheDTO> createRequisicaoDTOOAplicacaoDetalhe(AplicacaoDetalheDTO value) {
        return new JAXBElement<AplicacaoDetalheDTO>(_OrdemCompraDTOOAplicacaoDetalhe_QNAME, AplicacaoDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nIdTipoRequisicao", scope = RequisicaoDTO.class)
    public JAXBElement<Integer> createRequisicaoDTONIdTipoRequisicao(Integer value) {
        return new JAXBElement<Integer>(_RequisicaoDTONIdTipoRequisicao_QNAME, Integer.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaContabilDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oContaContabilDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<ContaContabilDetalheDTO> createRequisicaoDTOOContaContabilDetalhe(ContaContabilDetalheDTO value) {
        return new JAXBElement<ContaContabilDetalheDTO>(_RequisicaoDTOOContaContabilDetalhe_QNAME, ContaContabilDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturezaDespesaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oNaturezaDespesaDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<NaturezaDespesaDetalheDTO> createRequisicaoDTOONaturezaDespesaDetalhe(NaturezaDespesaDetalheDTO value) {
        return new JAXBElement<NaturezaDespesaDetalheDTO>(_RequisicaoDTOONaturezaDespesaDetalhe_QNAME, NaturezaDespesaDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstRequisicaoIdioma", scope = RequisicaoDTO.class)
    public JAXBElement<ArrayOfRequisicaoIdiomaDTO> createRequisicaoDTOLstRequisicaoIdioma(ArrayOfRequisicaoIdiomaDTO value) {
        return new JAXBElement<ArrayOfRequisicaoIdiomaDTO>(_RequisicaoDTOLstRequisicaoIdioma_QNAME, ArrayOfRequisicaoIdiomaDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacaoInterna", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSDsObservacaoInterna(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSDsObservacaoInterna_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdMoeda", scope = RequisicaoDTO.class)
    public JAXBElement<Long> createRequisicaoDTONCdMoeda(Long value) {
        return new JAXBElement<Long>(_RequisicaoDTONCdMoeda_QNAME, Long.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdEmpresaCobrancaEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdEmpresaCobrancaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdEmpresaCobrancaEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdMarca", scope = RequisicaoDTO.class)
    public JAXBElement<Long> createRequisicaoDTONCdMarca(Long value) {
        return new JAXBElement<Long>(_RequisicaoDTONCdMarca_QNAME, Long.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsDetalheCliente", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSDsDetalheCliente(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSDsDetalheCliente_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstAnexo", scope = RequisicaoDTO.class)
    public JAXBElement<ArrayOfAnexoDTO> createRequisicaoDTOLstAnexo(ArrayOfAnexoDTO value) {
        return new JAXBElement<ArrayOfAnexoDTO>(_RequisicaoDTOLstAnexo_QNAME, ArrayOfAnexoDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdContaContabil", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdContaContabil(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdContaContabil_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdGrupoCompra", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdGrupoCompra(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSCdGrupoCompra_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdNaturezaDespesa", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdNaturezaDespesa(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSCdNaturezaDespesa_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarcaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oMarcaDetalhe", scope = RequisicaoDTO.class)
    public JAXBElement<MarcaDetalheDTO> createRequisicaoDTOOMarcaDetalhe(MarcaDetalheDTO value) {
        return new JAXBElement<MarcaDetalheDTO>(_RequisicaoDTOOMarcaDetalhe_QNAME, MarcaDetalheDTO.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCentroCusto", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdCentroCusto(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdCentroCusto_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdCobrancaEndereco", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSCdCobrancaEndereco(String value) {
        return new JAXBElement<String>(_OrdemCompraDTOSCdCobrancaEndereco_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsAnexo", scope = RequisicaoDTO.class)
    public JAXBElement<String> createRequisicaoDTOSDsAnexo(String value) {
        return new JAXBElement<String>(_AnexoDTOSDsAnexo_QNAME, String.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdModalidade", scope = RequisicaoDTO.class)
    public JAXBElement<Long> createRequisicaoDTONCdModalidade(Long value) {
        return new JAXBElement<Long>(_OrdemCompraDTONCdModalidade_QNAME, Long.class, RequisicaoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraTipoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarOrdemCompraTipoResult", scope = RetornarOrdemCompraTipoResponse.class)
    public JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> createRetornarOrdemCompraTipoResponseRetornarOrdemCompraTipoResult(RetornoListaX003COrdemCompraTipoDTOX003E value) {
        return new JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E>(_RetornarOrdemCompraTipoResponseRetornarOrdemCompraTipoResult_QNAME, RetornoListaX003COrdemCompraTipoDTOX003E.class, RetornarOrdemCompraTipoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sNmEmpresa", scope = EmpresaDetalheDTO.class)
    public JAXBElement<String> createEmpresaDetalheDTOSNmEmpresa(String value) {
        return new JAXBElement<String>(_EmpresaDetalheDTOSNmEmpresa_QNAME, String.class, EmpresaDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsPrioridade", scope = PrioridadeDetalheDTO.class)
    public JAXBElement<String> createPrioridadeDetalheDTOSDsPrioridade(String value) {
        return new JAXBElement<String>(_PrioridadeDetalheDTOSDsPrioridade_QNAME, String.class, PrioridadeDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sSgUnidadeMedida", scope = UnidadeMedidaDetalheDTO.class)
    public JAXBElement<String> createUnidadeMedidaDetalheDTOSSgUnidadeMedida(String value) {
        return new JAXBElement<String>(_UnidadeMedidaDetalheDTOSSgUnidadeMedida_QNAME, String.class, UnidadeMedidaDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsUnidadeMedida", scope = UnidadeMedidaDetalheDTO.class)
    public JAXBElement<String> createUnidadeMedidaDetalheDTOSDsUnidadeMedida(String value) {
        return new JAXBElement<String>(_UnidadeMedidaDetalheDTOSDsUnidadeMedida_QNAME, String.class, UnidadeMedidaDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsObservacao", scope = RequisicaoIdiomaDTO.class)
    public JAXBElement<String> createRequisicaoIdiomaDTOSDsObservacao(String value) {
        return new JAXBElement<String>(_RequisicaoDTOSDsObservacao_QNAME, String.class, RequisicaoIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsJustificativa", scope = RequisicaoIdiomaDTO.class)
    public JAXBElement<String> createRequisicaoIdiomaDTOSDsJustificativa(String value) {
        return new JAXBElement<String>(_RequisicaoIdiomaDTOSDsJustificativa_QNAME, String.class, RequisicaoIdiomaDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstOrdemCompra", scope = ProcessarOrdemCompra.class)
    public JAXBElement<ArrayOfOrdemCompraDTO> createProcessarOrdemCompraLstOrdemCompra(ArrayOfOrdemCompraDTO value) {
        return new JAXBElement<ArrayOfOrdemCompraDTO>(_ProcessarOrdemCompraLstOrdemCompra_QNAME, ArrayOfOrdemCompraDTO.class, ProcessarOrdemCompra.class, value);
    }

}
