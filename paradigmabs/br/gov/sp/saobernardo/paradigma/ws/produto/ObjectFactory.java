
package br.gov.sp.saobernardo.paradigma.ws.produto;

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
 * generated in the br.gov.sp.saobernardo.paradigma.ws.produto package. 
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
    private final static QName _RetornoListaX003CProdutoDTOX003E_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoLista_x003C_ProdutoDTO_x003E_");
    private final static QName _ArrayOfEmpresaCatalogoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfEmpresaCatalogoDTO");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _CatalogoPadraoProdutoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "CatalogoPadraoProdutoDTO");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _EmpresaCatalogoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "EmpresaCatalogoDTO");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfProdutoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProdutoIdiomaDTO");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ProdutoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProdutoDTO");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ProdutoContaContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProdutoContaContabilDTO");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfCatalogoPadraoProdutoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfCatalogoPadraoProdutoDTO");
    private final static QName _UnidadeMedidaDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "UnidadeMedidaDetalheDTO");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfWbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfWbtLogDTO");
    private final static QName _IdiomaDTOOfProdutoIdiomaDTOljhnh6KL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "IdiomaDTOOfProdutoIdiomaDTOljhnh6kL");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfProdutoContaContabilDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProdutoContaContabilDTO");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _RetornoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "RetornoDTO");
    private final static QName _WbtLogDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "WbtLogDTO");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ProdutoHpfDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProdutoHpfDTO");
    private final static QName _DtoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core", "DtoBase");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ProdutoIdiomaDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ProdutoIdiomaDTO");
    private final static QName _ArrayOfProdutoDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProdutoDTO");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _GrupoDespesaTipoDetalheDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "GrupoDespesaTipoDetalheDTO");
    private final static QName _ArrayOfProdutoHpfDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "ArrayOfProdutoHpfDTO");
    private final static QName _GrupoDespesaTipoDetalheDTOSDsGrupoDespesaTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsGrupoDespesaTipo");
    private final static QName _RetornarProdutoSemDeParaResponseRetornarProdutoSemDeParaResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoSemDeParaResult");
    private final static QName _RetornarProdutoPorCodigoSCdProduto_QNAME = new QName("http://tempuri.org/", "sCdProduto");
    private final static QName _RetornarProdutoSCdProdutoErp_QNAME = new QName("http://tempuri.org/", "sCdProdutoErp");
    private final static QName _ProcessarProdutoCodigoDeParaResponseProcessarProdutoCodigoDeParaResult_QNAME = new QName("http://tempuri.org/", "ProcessarProdutoCodigoDeParaResult");
    private final static QName _RetornarProdutoPorCategoriaSCdClasse_QNAME = new QName("http://tempuri.org/", "sCdClasse");
    private final static QName _RetornarProdutoEmContratoPorDescricaoResponseRetornarProdutoEmContratoPorDescricaoResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoEmContratoPorDescricaoResult");
    private final static QName _ProcessarDataProdutoHpfLstProdutoHpf_QNAME = new QName("http://tempuri.org/", "lstProdutoHpf");
    private final static QName _RetornarProdutoResponseRetornarProdutoResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoResult");
    private final static QName _ProdutoDTONCdTipoSituacaoMapDestinacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdTipoSituacaoMapDestinacao");
    private final static QName _ProdutoDTONCdGrupoDespesaTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdGrupoDespesaTipo");
    private final static QName _ProdutoDTOSCdRegraSolicitacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdRegraSolicitacao");
    private final static QName _ProdutoDTOSCdProdutoWBC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdProdutoWBC");
    private final static QName _ProdutoDTOLstEmpresaCatalogo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstEmpresaCatalogo");
    private final static QName _ProdutoDTONSituacaoProduto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nSituacaoProduto");
    private final static QName _ProdutoDTOOGrupoDespesaTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oGrupoDespesaTipo");
    private final static QName _ProdutoDTOLstCatalogoPadrao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstCatalogoPadrao");
    private final static QName _ProdutoDTOOUnidadeMedidaDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "oUnidadeMedidaDetalhe");
    private final static QName _ProdutoDTONCdProdutoTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "nCdProdutoTipo");
    private final static QName _ProdutoDTOLstProdutoIdioma_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstProdutoIdioma");
    private final static QName _ProdutoDTOLstProdutoContaContabil_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "lstProdutoContaContabil");
    private final static QName _ProcessarProdutoLstProduto_QNAME = new QName("http://tempuri.org/", "lstProduto");
    private final static QName _ProcessarProdutoResponseProcessarProdutoResult_QNAME = new QName("http://tempuri.org/", "ProcessarProdutoResult");
    private final static QName _ProcessarDataProdutoHpfResponseProcessarDataProdutoHpfResult_QNAME = new QName("http://tempuri.org/", "ProcessarDataProdutoHpfResult");
    private final static QName _RetornarProdutoPorCategoriaResponseRetornarProdutoPorCategoriaResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoPorCategoriaResult");
    private final static QName _RetornoDTOSNrToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sNrToken");
    private final static QName _WbtLogDTOSCdOrigem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdOrigem");
    private final static QName _WbtLogDTOSCdComplemento2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento2");
    private final static QName _WbtLogDTOSCdComplemento1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sCdComplemento1");
    private final static QName _WbtLogDTOSDsLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsLog");
    private final static QName _ProcessarProdutoCodigoDeParaSCdProdutoWBC_QNAME = new QName("http://tempuri.org/", "sCdProdutoWBC");
    private final static QName _RetornarProdutoPorDescricaoResponseRetornarProdutoPorDescricaoResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoPorDescricaoResult");
    private final static QName _RetornarProdutoSemDeParaSCdEmpresa_QNAME = new QName("http://tempuri.org/", "sCdEmpresa");
    private final static QName _UnidadeMedidaDetalheDTOSSgUnidadeMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sSgUnidadeMedida");
    private final static QName _UnidadeMedidaDetalheDTOSDsUnidadeMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", "sDsUnidadeMedida");
    private final static QName _RetornarProdutoPorCodigoResponseRetornarProdutoPorCodigoResult_QNAME = new QName("http://tempuri.org/", "RetornarProdutoPorCodigoResult");
    private final static QName _RetornarProdutoEmContratoPorDescricaoSDsProduto_QNAME = new QName("http://tempuri.org/", "sDsProduto");
    private final static QName _RetornarProdutoEmContratoPorDescricaoSStProduto_QNAME = new QName("http://tempuri.org/", "sStProduto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.sp.saobernardo.paradigma.ws.produto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrupoDespesaTipoDetalheDTO }
     * 
     */
    public GrupoDespesaTipoDetalheDTO createGrupoDespesaTipoDetalheDTO() {
        return new GrupoDespesaTipoDetalheDTO();
    }

    /**
     * Create an instance of {@link IdiomaDTOOfProdutoIdiomaDTOljhnh6KL }
     * 
     */
    public IdiomaDTOOfProdutoIdiomaDTOljhnh6KL createIdiomaDTOOfProdutoIdiomaDTOljhnh6KL() {
        return new IdiomaDTOOfProdutoIdiomaDTOljhnh6KL();
    }

    /**
     * Create an instance of {@link RetornarProdutoSemDeParaResponse }
     * 
     */
    public RetornarProdutoSemDeParaResponse createRetornarProdutoSemDeParaResponse() {
        return new RetornarProdutoSemDeParaResponse();
    }

    /**
     * Create an instance of {@link ProcessarProdutoCodigoDeParaResponse }
     * 
     */
    public ProcessarProdutoCodigoDeParaResponse createProcessarProdutoCodigoDeParaResponse() {
        return new ProcessarProdutoCodigoDeParaResponse();
    }

    /**
     * Create an instance of {@link RetornarProdutoEmContratoPorDescricaoResponse }
     * 
     */
    public RetornarProdutoEmContratoPorDescricaoResponse createRetornarProdutoEmContratoPorDescricaoResponse() {
        return new RetornarProdutoEmContratoPorDescricaoResponse();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorCategoria }
     * 
     */
    public RetornarProdutoPorCategoria createRetornarProdutoPorCategoria() {
        return new RetornarProdutoPorCategoria();
    }

    /**
     * Create an instance of {@link ProdutoDTO }
     * 
     */
    public ProdutoDTO createProdutoDTO() {
        return new ProdutoDTO();
    }

    /**
     * Create an instance of {@link ProcessarProduto }
     * 
     */
    public ProcessarProduto createProcessarProduto() {
        return new ProcessarProduto();
    }

    /**
     * Create an instance of {@link ProcessarDataProdutoHpfResponse }
     * 
     */
    public ProcessarDataProdutoHpfResponse createProcessarDataProdutoHpfResponse() {
        return new ProcessarDataProdutoHpfResponse();
    }

    /**
     * Create an instance of {@link DtoBase }
     * 
     */
    public DtoBase createDtoBase() {
        return new DtoBase();
    }

    /**
     * Create an instance of {@link ProdutoContaContabilDTO }
     * 
     */
    public ProdutoContaContabilDTO createProdutoContaContabilDTO() {
        return new ProdutoContaContabilDTO();
    }

    /**
     * Create an instance of {@link WbtLogDTO }
     * 
     */
    public WbtLogDTO createWbtLogDTO() {
        return new WbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProdutoIdiomaDTO }
     * 
     */
    public ArrayOfProdutoIdiomaDTO createArrayOfProdutoIdiomaDTO() {
        return new ArrayOfProdutoIdiomaDTO();
    }

    /**
     * Create an instance of {@link CatalogoPadraoProdutoDTO }
     * 
     */
    public CatalogoPadraoProdutoDTO createCatalogoPadraoProdutoDTO() {
        return new CatalogoPadraoProdutoDTO();
    }

    /**
     * Create an instance of {@link RetornarProdutoSemDePara }
     * 
     */
    public RetornarProdutoSemDePara createRetornarProdutoSemDePara() {
        return new RetornarProdutoSemDePara();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorDescricaoResponse }
     * 
     */
    public RetornarProdutoPorDescricaoResponse createRetornarProdutoPorDescricaoResponse() {
        return new RetornarProdutoPorDescricaoResponse();
    }

    /**
     * Create an instance of {@link UnidadeMedidaDetalheDTO }
     * 
     */
    public UnidadeMedidaDetalheDTO createUnidadeMedidaDetalheDTO() {
        return new UnidadeMedidaDetalheDTO();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorCodigoResponse }
     * 
     */
    public RetornarProdutoPorCodigoResponse createRetornarProdutoPorCodigoResponse() {
        return new RetornarProdutoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link RetornarProdutoEmContratoPorDescricao }
     * 
     */
    public RetornarProdutoEmContratoPorDescricao createRetornarProdutoEmContratoPorDescricao() {
        return new RetornarProdutoEmContratoPorDescricao();
    }

    /**
     * Create an instance of {@link ProdutoHpfDTO }
     * 
     */
    public ProdutoHpfDTO createProdutoHpfDTO() {
        return new ProdutoHpfDTO();
    }

    /**
     * Create an instance of {@link ArrayOfCatalogoPadraoProdutoDTO }
     * 
     */
    public ArrayOfCatalogoPadraoProdutoDTO createArrayOfCatalogoPadraoProdutoDTO() {
        return new ArrayOfCatalogoPadraoProdutoDTO();
    }

    /**
     * Create an instance of {@link ArrayOfEmpresaCatalogoDTO }
     * 
     */
    public ArrayOfEmpresaCatalogoDTO createArrayOfEmpresaCatalogoDTO() {
        return new ArrayOfEmpresaCatalogoDTO();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorDescricao }
     * 
     */
    public RetornarProdutoPorDescricao createRetornarProdutoPorDescricao() {
        return new RetornarProdutoPorDescricao();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorCodigo }
     * 
     */
    public RetornarProdutoPorCodigo createRetornarProdutoPorCodigo() {
        return new RetornarProdutoPorCodigo();
    }

    /**
     * Create an instance of {@link RetornoListaX003CProdutoDTOX003E }
     * 
     */
    public RetornoListaX003CProdutoDTOX003E createRetornoListaX003CProdutoDTOX003E() {
        return new RetornoListaX003CProdutoDTOX003E();
    }

    /**
     * Create an instance of {@link RetornarProduto }
     * 
     */
    public RetornarProduto createRetornarProduto() {
        return new RetornarProduto();
    }

    /**
     * Create an instance of {@link EmpresaCatalogoDTO }
     * 
     */
    public EmpresaCatalogoDTO createEmpresaCatalogoDTO() {
        return new EmpresaCatalogoDTO();
    }

    /**
     * Create an instance of {@link ProcessarDataProdutoHpf }
     * 
     */
    public ProcessarDataProdutoHpf createProcessarDataProdutoHpf() {
        return new ProcessarDataProdutoHpf();
    }

    /**
     * Create an instance of {@link RetornarProdutoResponse }
     * 
     */
    public RetornarProdutoResponse createRetornarProdutoResponse() {
        return new RetornarProdutoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProdutoContaContabilDTO }
     * 
     */
    public ArrayOfProdutoContaContabilDTO createArrayOfProdutoContaContabilDTO() {
        return new ArrayOfProdutoContaContabilDTO();
    }

    /**
     * Create an instance of {@link ProcessarProdutoResponse }
     * 
     */
    public ProcessarProdutoResponse createProcessarProdutoResponse() {
        return new ProcessarProdutoResponse();
    }

    /**
     * Create an instance of {@link ProdutoIdiomaDTO }
     * 
     */
    public ProdutoIdiomaDTO createProdutoIdiomaDTO() {
        return new ProdutoIdiomaDTO();
    }

    /**
     * Create an instance of {@link RetornarProdutoPorCategoriaResponse }
     * 
     */
    public RetornarProdutoPorCategoriaResponse createRetornarProdutoPorCategoriaResponse() {
        return new RetornarProdutoPorCategoriaResponse();
    }

    /**
     * Create an instance of {@link RetornoDTO }
     * 
     */
    public RetornoDTO createRetornoDTO() {
        return new RetornoDTO();
    }

    /**
     * Create an instance of {@link ProcessarProdutoCodigoDePara }
     * 
     */
    public ProcessarProdutoCodigoDePara createProcessarProdutoCodigoDePara() {
        return new ProcessarProdutoCodigoDePara();
    }

    /**
     * Create an instance of {@link ArrayOfWbtLogDTO }
     * 
     */
    public ArrayOfWbtLogDTO createArrayOfWbtLogDTO() {
        return new ArrayOfWbtLogDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProdutoHpfDTO }
     * 
     */
    public ArrayOfProdutoHpfDTO createArrayOfProdutoHpfDTO() {
        return new ArrayOfProdutoHpfDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProdutoDTO }
     * 
     */
    public ArrayOfProdutoDTO createArrayOfProdutoDTO() {
        return new ArrayOfProdutoDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "RetornoLista_x003C_ProdutoDTO_x003E_")
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> createRetornoListaX003CProdutoDTOX003E(RetornoListaX003CProdutoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CProdutoDTOX003E>(_RetornoListaX003CProdutoDTOX003E_QNAME, RetornoListaX003CProdutoDTOX003E.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCatalogoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfEmpresaCatalogoDTO")
    public JAXBElement<ArrayOfEmpresaCatalogoDTO> createArrayOfEmpresaCatalogoDTO(ArrayOfEmpresaCatalogoDTO value) {
        return new JAXBElement<ArrayOfEmpresaCatalogoDTO>(_ArrayOfEmpresaCatalogoDTO_QNAME, ArrayOfEmpresaCatalogoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogoPadraoProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "CatalogoPadraoProdutoDTO")
    public JAXBElement<CatalogoPadraoProdutoDTO> createCatalogoPadraoProdutoDTO(CatalogoPadraoProdutoDTO value) {
        return new JAXBElement<CatalogoPadraoProdutoDTO>(_CatalogoPadraoProdutoDTO_QNAME, CatalogoPadraoProdutoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpresaCatalogoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "EmpresaCatalogoDTO")
    public JAXBElement<EmpresaCatalogoDTO> createEmpresaCatalogoDTO(EmpresaCatalogoDTO value) {
        return new JAXBElement<EmpresaCatalogoDTO>(_EmpresaCatalogoDTO_QNAME, EmpresaCatalogoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProdutoIdiomaDTO")
    public JAXBElement<ArrayOfProdutoIdiomaDTO> createArrayOfProdutoIdiomaDTO(ArrayOfProdutoIdiomaDTO value) {
        return new JAXBElement<ArrayOfProdutoIdiomaDTO>(_ArrayOfProdutoIdiomaDTO_QNAME, ArrayOfProdutoIdiomaDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProdutoDTO")
    public JAXBElement<ProdutoDTO> createProdutoDTO(ProdutoDTO value) {
        return new JAXBElement<ProdutoDTO>(_ProdutoDTO_QNAME, ProdutoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProdutoContaContabilDTO")
    public JAXBElement<ProdutoContaContabilDTO> createProdutoContaContabilDTO(ProdutoContaContabilDTO value) {
        return new JAXBElement<ProdutoContaContabilDTO>(_ProdutoContaContabilDTO_QNAME, ProdutoContaContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoPadraoProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfCatalogoPadraoProdutoDTO")
    public JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> createArrayOfCatalogoPadraoProdutoDTO(ArrayOfCatalogoPadraoProdutoDTO value) {
        return new JAXBElement<ArrayOfCatalogoPadraoProdutoDTO>(_ArrayOfCatalogoPadraoProdutoDTO_QNAME, ArrayOfCatalogoPadraoProdutoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomaDTOOfProdutoIdiomaDTOljhnh6KL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "IdiomaDTOOfProdutoIdiomaDTOljhnh6kL")
    public JAXBElement<IdiomaDTOOfProdutoIdiomaDTOljhnh6KL> createIdiomaDTOOfProdutoIdiomaDTOljhnh6KL(IdiomaDTOOfProdutoIdiomaDTOljhnh6KL value) {
        return new JAXBElement<IdiomaDTOOfProdutoIdiomaDTOljhnh6KL>(_IdiomaDTOOfProdutoIdiomaDTOljhnh6KL_QNAME, IdiomaDTOOfProdutoIdiomaDTOljhnh6KL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProdutoContaContabilDTO")
    public JAXBElement<ArrayOfProdutoContaContabilDTO> createArrayOfProdutoContaContabilDTO(ArrayOfProdutoContaContabilDTO value) {
        return new JAXBElement<ArrayOfProdutoContaContabilDTO>(_ArrayOfProdutoContaContabilDTO_QNAME, ArrayOfProdutoContaContabilDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoHpfDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProdutoHpfDTO")
    public JAXBElement<ProdutoHpfDTO> createProdutoHpfDTO(ProdutoHpfDTO value) {
        return new JAXBElement<ProdutoHpfDTO>(_ProdutoHpfDTO_QNAME, ProdutoHpfDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ProdutoIdiomaDTO")
    public JAXBElement<ProdutoIdiomaDTO> createProdutoIdiomaDTO(ProdutoIdiomaDTO value) {
        return new JAXBElement<ProdutoIdiomaDTO>(_ProdutoIdiomaDTO_QNAME, ProdutoIdiomaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProdutoDTO")
    public JAXBElement<ArrayOfProdutoDTO> createArrayOfProdutoDTO(ArrayOfProdutoDTO value) {
        return new JAXBElement<ArrayOfProdutoDTO>(_ArrayOfProdutoDTO_QNAME, ArrayOfProdutoDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoDespesaTipoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "GrupoDespesaTipoDetalheDTO")
    public JAXBElement<GrupoDespesaTipoDetalheDTO> createGrupoDespesaTipoDetalheDTO(GrupoDespesaTipoDetalheDTO value) {
        return new JAXBElement<GrupoDespesaTipoDetalheDTO>(_GrupoDespesaTipoDetalheDTO_QNAME, GrupoDespesaTipoDetalheDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoHpfDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "ArrayOfProdutoHpfDTO")
    public JAXBElement<ArrayOfProdutoHpfDTO> createArrayOfProdutoHpfDTO(ArrayOfProdutoHpfDTO value) {
        return new JAXBElement<ArrayOfProdutoHpfDTO>(_ArrayOfProdutoHpfDTO_QNAME, ArrayOfProdutoHpfDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sDsGrupoDespesaTipo", scope = GrupoDespesaTipoDetalheDTO.class)
    public JAXBElement<String> createGrupoDespesaTipoDetalheDTOSDsGrupoDespesaTipo(String value) {
        return new JAXBElement<String>(_GrupoDespesaTipoDetalheDTOSDsGrupoDespesaTipo_QNAME, String.class, GrupoDespesaTipoDetalheDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoSemDeParaResult", scope = RetornarProdutoSemDeParaResponse.class)
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> createRetornarProdutoSemDeParaResponseRetornarProdutoSemDeParaResult(RetornoListaX003CProdutoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CProdutoDTOX003E>(_RetornarProdutoSemDeParaResponseRetornarProdutoSemDeParaResult_QNAME, RetornoListaX003CProdutoDTOX003E.class, RetornarProdutoSemDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdProduto", scope = RetornarProdutoPorCodigo.class)
    public JAXBElement<String> createRetornarProdutoPorCodigoSCdProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoPorCodigoSCdProduto_QNAME, String.class, RetornarProdutoPorCodigo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdProdutoErp", scope = RetornarProduto.class)
    public JAXBElement<String> createRetornarProdutoSCdProdutoErp(String value) {
        return new JAXBElement<String>(_RetornarProdutoSCdProdutoErp_QNAME, String.class, RetornarProduto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarProdutoCodigoDeParaResult", scope = ProcessarProdutoCodigoDeParaResponse.class)
    public JAXBElement<RetornoDTO> createProcessarProdutoCodigoDeParaResponseProcessarProdutoCodigoDeParaResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarProdutoCodigoDeParaResponseProcessarProdutoCodigoDeParaResult_QNAME, RetornoDTO.class, ProcessarProdutoCodigoDeParaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdClasse", scope = RetornarProdutoPorCategoria.class)
    public JAXBElement<String> createRetornarProdutoPorCategoriaSCdClasse(String value) {
        return new JAXBElement<String>(_RetornarProdutoPorCategoriaSCdClasse_QNAME, String.class, RetornarProdutoPorCategoria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoEmContratoPorDescricaoResult", scope = RetornarProdutoEmContratoPorDescricaoResponse.class)
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> createRetornarProdutoEmContratoPorDescricaoResponseRetornarProdutoEmContratoPorDescricaoResult(RetornoListaX003CProdutoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CProdutoDTOX003E>(_RetornarProdutoEmContratoPorDescricaoResponseRetornarProdutoEmContratoPorDescricaoResult_QNAME, RetornoListaX003CProdutoDTOX003E.class, RetornarProdutoEmContratoPorDescricaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoHpfDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProdutoHpf", scope = ProcessarDataProdutoHpf.class)
    public JAXBElement<ArrayOfProdutoHpfDTO> createProcessarDataProdutoHpfLstProdutoHpf(ArrayOfProdutoHpfDTO value) {
        return new JAXBElement<ArrayOfProdutoHpfDTO>(_ProcessarDataProdutoHpfLstProdutoHpf_QNAME, ArrayOfProdutoHpfDTO.class, ProcessarDataProdutoHpf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoResult", scope = RetornarProdutoResponse.class)
    public JAXBElement<ProdutoDTO> createRetornarProdutoResponseRetornarProdutoResult(ProdutoDTO value) {
        return new JAXBElement<ProdutoDTO>(_RetornarProdutoResponseRetornarProdutoResult_QNAME, ProdutoDTO.class, RetornarProdutoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdTipoSituacaoMapDestinacao", scope = ProdutoDTO.class)
    public JAXBElement<Integer> createProdutoDTONCdTipoSituacaoMapDestinacao(Integer value) {
        return new JAXBElement<Integer>(_ProdutoDTONCdTipoSituacaoMapDestinacao_QNAME, Integer.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdGrupoDespesaTipo", scope = ProdutoDTO.class)
    public JAXBElement<Long> createProdutoDTONCdGrupoDespesaTipo(Long value) {
        return new JAXBElement<Long>(_ProdutoDTONCdGrupoDespesaTipo_QNAME, Long.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdRegraSolicitacao", scope = ProdutoDTO.class)
    public JAXBElement<String> createProdutoDTOSCdRegraSolicitacao(String value) {
        return new JAXBElement<String>(_ProdutoDTOSCdRegraSolicitacao_QNAME, String.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "sCdProdutoWBC", scope = ProdutoDTO.class)
    public JAXBElement<String> createProdutoDTOSCdProdutoWBC(String value) {
        return new JAXBElement<String>(_ProdutoDTOSCdProdutoWBC_QNAME, String.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCatalogoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstEmpresaCatalogo", scope = ProdutoDTO.class)
    public JAXBElement<ArrayOfEmpresaCatalogoDTO> createProdutoDTOLstEmpresaCatalogo(ArrayOfEmpresaCatalogoDTO value) {
        return new JAXBElement<ArrayOfEmpresaCatalogoDTO>(_ProdutoDTOLstEmpresaCatalogo_QNAME, ArrayOfEmpresaCatalogoDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nSituacaoProduto", scope = ProdutoDTO.class)
    public JAXBElement<Long> createProdutoDTONSituacaoProduto(Long value) {
        return new JAXBElement<Long>(_ProdutoDTONSituacaoProduto_QNAME, Long.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrupoDespesaTipoDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oGrupoDespesaTipo", scope = ProdutoDTO.class)
    public JAXBElement<GrupoDespesaTipoDetalheDTO> createProdutoDTOOGrupoDespesaTipo(GrupoDespesaTipoDetalheDTO value) {
        return new JAXBElement<GrupoDespesaTipoDetalheDTO>(_ProdutoDTOOGrupoDespesaTipo_QNAME, GrupoDespesaTipoDetalheDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoPadraoProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstCatalogoPadrao", scope = ProdutoDTO.class)
    public JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> createProdutoDTOLstCatalogoPadrao(ArrayOfCatalogoPadraoProdutoDTO value) {
        return new JAXBElement<ArrayOfCatalogoPadraoProdutoDTO>(_ProdutoDTOLstCatalogoPadrao_QNAME, ArrayOfCatalogoPadraoProdutoDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "oUnidadeMedidaDetalhe", scope = ProdutoDTO.class)
    public JAXBElement<UnidadeMedidaDetalheDTO> createProdutoDTOOUnidadeMedidaDetalhe(UnidadeMedidaDetalheDTO value) {
        return new JAXBElement<UnidadeMedidaDetalheDTO>(_ProdutoDTOOUnidadeMedidaDetalhe_QNAME, UnidadeMedidaDetalheDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "nCdProdutoTipo", scope = ProdutoDTO.class)
    public JAXBElement<Integer> createProdutoDTONCdProdutoTipo(Integer value) {
        return new JAXBElement<Integer>(_ProdutoDTONCdProdutoTipo_QNAME, Integer.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoIdiomaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstProdutoIdioma", scope = ProdutoDTO.class)
    public JAXBElement<ArrayOfProdutoIdiomaDTO> createProdutoDTOLstProdutoIdioma(ArrayOfProdutoIdiomaDTO value) {
        return new JAXBElement<ArrayOfProdutoIdiomaDTO>(_ProdutoDTOLstProdutoIdioma_QNAME, ArrayOfProdutoIdiomaDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoContaContabilDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", name = "lstProdutoContaContabil", scope = ProdutoDTO.class)
    public JAXBElement<ArrayOfProdutoContaContabilDTO> createProdutoDTOLstProdutoContaContabil(ArrayOfProdutoContaContabilDTO value) {
        return new JAXBElement<ArrayOfProdutoContaContabilDTO>(_ProdutoDTOLstProdutoContaContabil_QNAME, ArrayOfProdutoContaContabilDTO.class, ProdutoDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lstProduto", scope = ProcessarProduto.class)
    public JAXBElement<ArrayOfProdutoDTO> createProcessarProdutoLstProduto(ArrayOfProdutoDTO value) {
        return new JAXBElement<ArrayOfProdutoDTO>(_ProcessarProdutoLstProduto_QNAME, ArrayOfProdutoDTO.class, ProcessarProduto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarProdutoResult", scope = ProcessarProdutoResponse.class)
    public JAXBElement<RetornoDTO> createProcessarProdutoResponseProcessarProdutoResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarProdutoResponseProcessarProdutoResult_QNAME, RetornoDTO.class, ProcessarProdutoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessarDataProdutoHpfResult", scope = ProcessarDataProdutoHpfResponse.class)
    public JAXBElement<RetornoDTO> createProcessarDataProdutoHpfResponseProcessarDataProdutoHpfResult(RetornoDTO value) {
        return new JAXBElement<RetornoDTO>(_ProcessarDataProdutoHpfResponseProcessarDataProdutoHpfResult_QNAME, RetornoDTO.class, ProcessarDataProdutoHpfResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoPorCategoriaResult", scope = RetornarProdutoPorCategoriaResponse.class)
    public JAXBElement<ArrayOfProdutoDTO> createRetornarProdutoPorCategoriaResponseRetornarProdutoPorCategoriaResult(ArrayOfProdutoDTO value) {
        return new JAXBElement<ArrayOfProdutoDTO>(_RetornarProdutoPorCategoriaResponseRetornarProdutoPorCategoriaResult_QNAME, ArrayOfProdutoDTO.class, RetornarProdutoPorCategoriaResponse.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdProdutoWBC", scope = ProcessarProdutoCodigoDePara.class)
    public JAXBElement<String> createProcessarProdutoCodigoDeParaSCdProdutoWBC(String value) {
        return new JAXBElement<String>(_ProcessarProdutoCodigoDeParaSCdProdutoWBC_QNAME, String.class, ProcessarProdutoCodigoDePara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdProduto", scope = ProcessarProdutoCodigoDePara.class)
    public JAXBElement<String> createProcessarProdutoCodigoDeParaSCdProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoPorCodigoSCdProduto_QNAME, String.class, ProcessarProdutoCodigoDePara.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoPorDescricaoResult", scope = RetornarProdutoPorDescricaoResponse.class)
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> createRetornarProdutoPorDescricaoResponseRetornarProdutoPorDescricaoResult(RetornoListaX003CProdutoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CProdutoDTOX003E>(_RetornarProdutoPorDescricaoResponseRetornarProdutoPorDescricaoResult_QNAME, RetornoListaX003CProdutoDTOX003E.class, RetornarProdutoPorDescricaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sCdEmpresa", scope = RetornarProdutoSemDePara.class)
    public JAXBElement<String> createRetornarProdutoSemDeParaSCdEmpresa(String value) {
        return new JAXBElement<String>(_RetornarProdutoSemDeParaSCdEmpresa_QNAME, String.class, RetornarProdutoSemDePara.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProdutoPorCodigoResult", scope = RetornarProdutoPorCodigoResponse.class)
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> createRetornarProdutoPorCodigoResponseRetornarProdutoPorCodigoResult(RetornoListaX003CProdutoDTOX003E value) {
        return new JAXBElement<RetornoListaX003CProdutoDTOX003E>(_RetornarProdutoPorCodigoResponseRetornarProdutoPorCodigoResult_QNAME, RetornoListaX003CProdutoDTOX003E.class, RetornarProdutoPorCodigoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sDsProduto", scope = RetornarProdutoEmContratoPorDescricao.class)
    public JAXBElement<String> createRetornarProdutoEmContratoPorDescricaoSDsProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoEmContratoPorDescricaoSDsProduto_QNAME, String.class, RetornarProdutoEmContratoPorDescricao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sStProduto", scope = RetornarProdutoEmContratoPorDescricao.class)
    public JAXBElement<String> createRetornarProdutoEmContratoPorDescricaoSStProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoEmContratoPorDescricaoSStProduto_QNAME, String.class, RetornarProdutoEmContratoPorDescricao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sDsProduto", scope = RetornarProdutoPorDescricao.class)
    public JAXBElement<String> createRetornarProdutoPorDescricaoSDsProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoEmContratoPorDescricaoSDsProduto_QNAME, String.class, RetornarProdutoPorDescricao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sStProduto", scope = RetornarProdutoPorDescricao.class)
    public JAXBElement<String> createRetornarProdutoPorDescricaoSStProduto(String value) {
        return new JAXBElement<String>(_RetornarProdutoEmContratoPorDescricaoSStProduto_QNAME, String.class, RetornarProdutoPorDescricao.class, value);
    }

}
