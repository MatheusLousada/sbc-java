
package br.gov.sp.saobernardo.paradigma.ws.wbtdepara;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumTipoDocumento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTipoDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DePara"/>
 *     &lt;enumeration value="Empresa"/>
 *     &lt;enumeration value="Produto"/>
 *     &lt;enumeration value="Classe"/>
 *     &lt;enumeration value="UnidadeDeMedida"/>
 *     &lt;enumeration value="Pedido"/>
 *     &lt;enumeration value="Endereco"/>
 *     &lt;enumeration value="NotaFiscal"/>
 *     &lt;enumeration value="Cotacao"/>
 *     &lt;enumeration value="Moeda"/>
 *     &lt;enumeration value="TipoFrete"/>
 *     &lt;enumeration value="Usuario"/>
 *     &lt;enumeration value="CondicaoPagamento"/>
 *     &lt;enumeration value="Pais"/>
 *     &lt;enumeration value="GrupoDespesa"/>
 *     &lt;enumeration value="TipoGrupoDespesa"/>
 *     &lt;enumeration value="UnidadeFuncional"/>
 *     &lt;enumeration value="Departamento"/>
 *     &lt;enumeration value="Requisicao"/>
 *     &lt;enumeration value="PedidoPortal"/>
 *     &lt;enumeration value="PrazoEntrega"/>
 *     &lt;enumeration value="Fornecedor"/>
 *     &lt;enumeration value="UnidadeCompradora"/>
 *     &lt;enumeration value="Banco"/>
 *     &lt;enumeration value="Cidade"/>
 *     &lt;enumeration value="OfertaCompra"/>
 *     &lt;enumeration value="Marcas"/>
 *     &lt;enumeration value="MarcasProduto"/>
 *     &lt;enumeration value="Crc"/>
 *     &lt;enumeration value="Empenho"/>
 *     &lt;enumeration value="FatorPerda"/>
 *     &lt;enumeration value="PLD"/>
 *     &lt;enumeration value="SAP"/>
 *     &lt;enumeration value="Visão"/>
 *     &lt;enumeration value="IntegraçãoDefault"/>
 *     &lt;enumeration value="TipoContato"/>
 *     &lt;enumeration value="CNAE"/>
 *     &lt;enumeration value="Estado"/>
 *     &lt;enumeration value="NaturezaJuridica"/>
 *     &lt;enumeration value="FonteRecurso"/>
 *     &lt;enumeration value="UnidadeNegocio"/>
 *     &lt;enumeration value="ClasseFornecedor"/>
 *     &lt;enumeration value="UsuarioAprovador"/>
 *     &lt;enumeration value="PregaoEletronico"/>
 *     &lt;enumeration value="CompraDireta"/>
 *     &lt;enumeration value="Convite"/>
 *     &lt;enumeration value="PregaoPresencial"/>
 *     &lt;enumeration value="BancoPreco"/>
 *     &lt;enumeration value="Leilao"/>
 *     &lt;enumeration value="Centro_de_custo"/>
 *     &lt;enumeration value="Conta_contabil"/>
 *     &lt;enumeration value="Almoxarifado"/>
 *     &lt;enumeration value="Almoxarifado_doca"/>
 *     &lt;enumeration value="Contrato"/>
 *     &lt;enumeration value="Titulo_financeiro"/>
 *     &lt;enumeration value="Cfop"/>
 *     &lt;enumeration value="GrupoSistema"/>
 *     &lt;enumeration value="AreaCliente"/>
 *     &lt;enumeration value="NaturezaDespesa"/>
 *     &lt;enumeration value="Gestao"/>
 *     &lt;enumeration value="GrupoConta"/>
 *     &lt;enumeration value="GrupoCompra"/>
 *     &lt;enumeration value="MoedaCotacao"/>
 *     &lt;enumeration value="IVA"/>
 *     &lt;enumeration value="PProcessoResultado"/>
 *     &lt;enumeration value="OrdemCompra"/>
 *     &lt;enumeration value="WfAtividade"/>
 *     &lt;enumeration value="Patrimonio"/>
 *     &lt;enumeration value="ProdutoRegra"/>
 *     &lt;enumeration value="CatalogoPadrao"/>
 *     &lt;enumeration value="Capa"/>
 *     &lt;enumeration value="Pergunta"/>
 *     &lt;enumeration value="Alternativa"/>
 *     &lt;enumeration value="Performance"/>
 *     &lt;enumeration value="SituacaoGeral"/>
 *     &lt;enumeration value="Comunicado"/>
 *     &lt;enumeration value="Projeto"/>
 *     &lt;enumeration value="TipoLoja"/>
 *     &lt;enumeration value="ModeloLoja"/>
 *     &lt;enumeration value="PadraoArquitetura"/>
 *     &lt;enumeration value="Conteudo_Comunicados"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumTipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Framework.Integracao")
@XmlEnum
public enum EnumTipoDocumento {

    @XmlEnumValue("DePara")
    DE_PARA("DePara"),
    @XmlEnumValue("Empresa")
    EMPRESA("Empresa"),
    @XmlEnumValue("Produto")
    PRODUTO("Produto"),
    @XmlEnumValue("Classe")
    CLASSE("Classe"),
    @XmlEnumValue("UnidadeDeMedida")
    UNIDADE_DE_MEDIDA("UnidadeDeMedida"),
    @XmlEnumValue("Pedido")
    PEDIDO("Pedido"),
    @XmlEnumValue("Endereco")
    ENDERECO("Endereco"),
    @XmlEnumValue("NotaFiscal")
    NOTA_FISCAL("NotaFiscal"),
    @XmlEnumValue("Cotacao")
    COTACAO("Cotacao"),
    @XmlEnumValue("Moeda")
    MOEDA("Moeda"),
    @XmlEnumValue("TipoFrete")
    TIPO_FRETE("TipoFrete"),
    @XmlEnumValue("Usuario")
    USUARIO("Usuario"),
    @XmlEnumValue("CondicaoPagamento")
    CONDICAO_PAGAMENTO("CondicaoPagamento"),
    @XmlEnumValue("Pais")
    PAIS("Pais"),
    @XmlEnumValue("GrupoDespesa")
    GRUPO_DESPESA("GrupoDespesa"),
    @XmlEnumValue("TipoGrupoDespesa")
    TIPO_GRUPO_DESPESA("TipoGrupoDespesa"),
    @XmlEnumValue("UnidadeFuncional")
    UNIDADE_FUNCIONAL("UnidadeFuncional"),
    @XmlEnumValue("Departamento")
    DEPARTAMENTO("Departamento"),
    @XmlEnumValue("Requisicao")
    REQUISICAO("Requisicao"),
    @XmlEnumValue("PedidoPortal")
    PEDIDO_PORTAL("PedidoPortal"),
    @XmlEnumValue("PrazoEntrega")
    PRAZO_ENTREGA("PrazoEntrega"),
    @XmlEnumValue("Fornecedor")
    FORNECEDOR("Fornecedor"),
    @XmlEnumValue("UnidadeCompradora")
    UNIDADE_COMPRADORA("UnidadeCompradora"),
    @XmlEnumValue("Banco")
    BANCO("Banco"),
    @XmlEnumValue("Cidade")
    CIDADE("Cidade"),
    @XmlEnumValue("OfertaCompra")
    OFERTA_COMPRA("OfertaCompra"),
    @XmlEnumValue("Marcas")
    MARCAS("Marcas"),
    @XmlEnumValue("MarcasProduto")
    MARCAS_PRODUTO("MarcasProduto"),
    @XmlEnumValue("Crc")
    CRC("Crc"),
    @XmlEnumValue("Empenho")
    EMPENHO("Empenho"),
    @XmlEnumValue("FatorPerda")
    FATOR_PERDA("FatorPerda"),
    PLD("PLD"),
    SAP("SAP"),
    @XmlEnumValue("Vis\u00e3o")
    VISÃO("Vis\u00e3o"),
    @XmlEnumValue("Integra\u00e7\u00e3oDefault")
    INTEGRAÇÃO_DEFAULT("Integra\u00e7\u00e3oDefault"),
    @XmlEnumValue("TipoContato")
    TIPO_CONTATO("TipoContato"),
    CNAE("CNAE"),
    @XmlEnumValue("Estado")
    ESTADO("Estado"),
    @XmlEnumValue("NaturezaJuridica")
    NATUREZA_JURIDICA("NaturezaJuridica"),
    @XmlEnumValue("FonteRecurso")
    FONTE_RECURSO("FonteRecurso"),
    @XmlEnumValue("UnidadeNegocio")
    UNIDADE_NEGOCIO("UnidadeNegocio"),
    @XmlEnumValue("ClasseFornecedor")
    CLASSE_FORNECEDOR("ClasseFornecedor"),
    @XmlEnumValue("UsuarioAprovador")
    USUARIO_APROVADOR("UsuarioAprovador"),
    @XmlEnumValue("PregaoEletronico")
    PREGAO_ELETRONICO("PregaoEletronico"),
    @XmlEnumValue("CompraDireta")
    COMPRA_DIRETA("CompraDireta"),
    @XmlEnumValue("Convite")
    CONVITE("Convite"),
    @XmlEnumValue("PregaoPresencial")
    PREGAO_PRESENCIAL("PregaoPresencial"),
    @XmlEnumValue("BancoPreco")
    BANCO_PRECO("BancoPreco"),
    @XmlEnumValue("Leilao")
    LEILAO("Leilao"),
    @XmlEnumValue("Centro_de_custo")
    CENTRO_DE_CUSTO("Centro_de_custo"),
    @XmlEnumValue("Conta_contabil")
    CONTA_CONTABIL("Conta_contabil"),
    @XmlEnumValue("Almoxarifado")
    ALMOXARIFADO("Almoxarifado"),
    @XmlEnumValue("Almoxarifado_doca")
    ALMOXARIFADO_DOCA("Almoxarifado_doca"),
    @XmlEnumValue("Contrato")
    CONTRATO("Contrato"),
    @XmlEnumValue("Titulo_financeiro")
    TITULO_FINANCEIRO("Titulo_financeiro"),
    @XmlEnumValue("Cfop")
    CFOP("Cfop"),
    @XmlEnumValue("GrupoSistema")
    GRUPO_SISTEMA("GrupoSistema"),
    @XmlEnumValue("AreaCliente")
    AREA_CLIENTE("AreaCliente"),
    @XmlEnumValue("NaturezaDespesa")
    NATUREZA_DESPESA("NaturezaDespesa"),
    @XmlEnumValue("Gestao")
    GESTAO("Gestao"),
    @XmlEnumValue("GrupoConta")
    GRUPO_CONTA("GrupoConta"),
    @XmlEnumValue("GrupoCompra")
    GRUPO_COMPRA("GrupoCompra"),
    @XmlEnumValue("MoedaCotacao")
    MOEDA_COTACAO("MoedaCotacao"),
    IVA("IVA"),
    @XmlEnumValue("PProcessoResultado")
    P_PROCESSO_RESULTADO("PProcessoResultado"),
    @XmlEnumValue("OrdemCompra")
    ORDEM_COMPRA("OrdemCompra"),
    @XmlEnumValue("WfAtividade")
    WF_ATIVIDADE("WfAtividade"),
    @XmlEnumValue("Patrimonio")
    PATRIMONIO("Patrimonio"),
    @XmlEnumValue("ProdutoRegra")
    PRODUTO_REGRA("ProdutoRegra"),
    @XmlEnumValue("CatalogoPadrao")
    CATALOGO_PADRAO("CatalogoPadrao"),
    @XmlEnumValue("Capa")
    CAPA("Capa"),
    @XmlEnumValue("Pergunta")
    PERGUNTA("Pergunta"),
    @XmlEnumValue("Alternativa")
    ALTERNATIVA("Alternativa"),
    @XmlEnumValue("Performance")
    PERFORMANCE("Performance"),
    @XmlEnumValue("SituacaoGeral")
    SITUACAO_GERAL("SituacaoGeral"),
    @XmlEnumValue("Comunicado")
    COMUNICADO("Comunicado"),
    @XmlEnumValue("Projeto")
    PROJETO("Projeto"),
    @XmlEnumValue("TipoLoja")
    TIPO_LOJA("TipoLoja"),
    @XmlEnumValue("ModeloLoja")
    MODELO_LOJA("ModeloLoja"),
    @XmlEnumValue("PadraoArquitetura")
    PADRAO_ARQUITETURA("PadraoArquitetura"),
    @XmlEnumValue("Conteudo_Comunicados")
    CONTEUDO_COMUNICADOS("Conteudo_Comunicados");
    private final String value;

    EnumTipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTipoDocumento fromValue(String v) {
        for (EnumTipoDocumento c: EnumTipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
