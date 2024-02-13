
package br.gov.sp.saobernardo.paradigma.ws.produto;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtConsumoMedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlPeso" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstCatalogoPadrao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCatalogoPadraoProdutoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaCatalogo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaCatalogoDTO" minOccurs="0"/>
 *         &lt;element name="lstProdutoContaContabil" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoContaContabilDTO" minOccurs="0"/>
 *         &lt;element name="lstProdutoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="nCdGrupoDespesaTipo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdProdutoTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdTipoSituacaoMapDestinacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nSituacaoProduto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oGrupoDespesaTipo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}GrupoDespesaTipoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oUnidadeMedidaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeMedidaDetalheDTO" minOccurs="0"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProdutoWBC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdRegraSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsDetalhe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoDTO", propOrder = {
    "dQtConsumoMedio",
    "dVlPeso",
    "lstCatalogoPadrao",
    "lstEmpresaCatalogo",
    "lstProdutoContaContabil",
    "lstProdutoIdioma",
    "nCdGrupoDespesaTipo",
    "nCdProdutoTipo",
    "nCdTipoSituacaoMapDestinacao",
    "nSituacaoProduto",
    "oGrupoDespesaTipo",
    "oUnidadeMedidaDetalhe",
    "sCdClasse",
    "sCdEmpresa",
    "sCdProduto",
    "sCdProdutoWBC",
    "sCdRegraSolicitacao",
    "sCdUnidadeMedida",
    "sDsDetalhe",
    "sDsProduto"
})
public class ProdutoDTO
    extends DtoBase
{

    protected BigDecimal dQtConsumoMedio;
    protected BigDecimal dVlPeso;
    @XmlElementRef(name = "lstCatalogoPadrao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> lstCatalogoPadrao;
    @XmlElementRef(name = "lstEmpresaCatalogo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaCatalogoDTO> lstEmpresaCatalogo;
    @XmlElementRef(name = "lstProdutoContaContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoContaContabilDTO> lstProdutoContaContabil;
    @XmlElementRef(name = "lstProdutoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoIdiomaDTO> lstProdutoIdioma;
    @XmlElementRef(name = "nCdGrupoDespesaTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdGrupoDespesaTipo;
    @XmlElementRef(name = "nCdProdutoTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdProdutoTipo;
    @XmlElementRef(name = "nCdTipoSituacaoMapDestinacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdTipoSituacaoMapDestinacao;
    @XmlElementRef(name = "nSituacaoProduto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nSituacaoProduto;
    @XmlElementRef(name = "oGrupoDespesaTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<GrupoDespesaTipoDetalheDTO> oGrupoDespesaTipo;
    @XmlElementRef(name = "oUnidadeMedidaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UnidadeMedidaDetalheDTO> oUnidadeMedidaDetalhe;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElementRef(name = "sCdProdutoWBC", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdProdutoWBC;
    @XmlElementRef(name = "sCdRegraSolicitacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdRegraSolicitacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsDetalhe;
    @XmlElement(required = true, nillable = true)
    protected String sDsProduto;

    /**
     * Gets the value of the dQtConsumoMedio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtConsumoMedio() {
        return dQtConsumoMedio;
    }

    /**
     * Sets the value of the dQtConsumoMedio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtConsumoMedio(BigDecimal value) {
        this.dQtConsumoMedio = value;
    }

    /**
     * Gets the value of the dVlPeso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlPeso() {
        return dVlPeso;
    }

    /**
     * Sets the value of the dVlPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlPeso(BigDecimal value) {
        this.dVlPeso = value;
    }

    /**
     * Gets the value of the lstCatalogoPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCatalogoPadraoProdutoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> getLstCatalogoPadrao() {
        return lstCatalogoPadrao;
    }

    /**
     * Sets the value of the lstCatalogoPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCatalogoPadraoProdutoDTO }{@code >}
     *     
     */
    public void setLstCatalogoPadrao(JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> value) {
        this.lstCatalogoPadrao = ((JAXBElement<ArrayOfCatalogoPadraoProdutoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCatalogoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaCatalogoDTO> getLstEmpresaCatalogo() {
        return lstEmpresaCatalogo;
    }

    /**
     * Sets the value of the lstEmpresaCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCatalogoDTO }{@code >}
     *     
     */
    public void setLstEmpresaCatalogo(JAXBElement<ArrayOfEmpresaCatalogoDTO> value) {
        this.lstEmpresaCatalogo = ((JAXBElement<ArrayOfEmpresaCatalogoDTO> ) value);
    }

    /**
     * Gets the value of the lstProdutoContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoContaContabilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoContaContabilDTO> getLstProdutoContaContabil() {
        return lstProdutoContaContabil;
    }

    /**
     * Sets the value of the lstProdutoContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoContaContabilDTO }{@code >}
     *     
     */
    public void setLstProdutoContaContabil(JAXBElement<ArrayOfProdutoContaContabilDTO> value) {
        this.lstProdutoContaContabil = ((JAXBElement<ArrayOfProdutoContaContabilDTO> ) value);
    }

    /**
     * Gets the value of the lstProdutoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoIdiomaDTO> getLstProdutoIdioma() {
        return lstProdutoIdioma;
    }

    /**
     * Sets the value of the lstProdutoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoIdiomaDTO }{@code >}
     *     
     */
    public void setLstProdutoIdioma(JAXBElement<ArrayOfProdutoIdiomaDTO> value) {
        this.lstProdutoIdioma = ((JAXBElement<ArrayOfProdutoIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the nCdGrupoDespesaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdGrupoDespesaTipo() {
        return nCdGrupoDespesaTipo;
    }

    /**
     * Sets the value of the nCdGrupoDespesaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdGrupoDespesaTipo(JAXBElement<Long> value) {
        this.nCdGrupoDespesaTipo = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdProdutoTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdProdutoTipo() {
        return nCdProdutoTipo;
    }

    /**
     * Sets the value of the nCdProdutoTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdProdutoTipo(JAXBElement<Integer> value) {
        this.nCdProdutoTipo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nCdTipoSituacaoMapDestinacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdTipoSituacaoMapDestinacao() {
        return nCdTipoSituacaoMapDestinacao;
    }

    /**
     * Sets the value of the nCdTipoSituacaoMapDestinacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdTipoSituacaoMapDestinacao(JAXBElement<Integer> value) {
        this.nCdTipoSituacaoMapDestinacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nSituacaoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNSituacaoProduto() {
        return nSituacaoProduto;
    }

    /**
     * Sets the value of the nSituacaoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNSituacaoProduto(JAXBElement<Long> value) {
        this.nSituacaoProduto = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the oGrupoDespesaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrupoDespesaTipoDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<GrupoDespesaTipoDetalheDTO> getOGrupoDespesaTipo() {
        return oGrupoDespesaTipo;
    }

    /**
     * Sets the value of the oGrupoDespesaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrupoDespesaTipoDetalheDTO }{@code >}
     *     
     */
    public void setOGrupoDespesaTipo(JAXBElement<GrupoDespesaTipoDetalheDTO> value) {
        this.oGrupoDespesaTipo = ((JAXBElement<GrupoDespesaTipoDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oUnidadeMedidaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UnidadeMedidaDetalheDTO> getOUnidadeMedidaDetalhe() {
        return oUnidadeMedidaDetalhe;
    }

    /**
     * Sets the value of the oUnidadeMedidaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}
     *     
     */
    public void setOUnidadeMedidaDetalhe(JAXBElement<UnidadeMedidaDetalheDTO> value) {
        this.oUnidadeMedidaDetalhe = ((JAXBElement<UnidadeMedidaDetalheDTO> ) value);
    }

    /**
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

    /**
     * Gets the value of the sCdProdutoWBC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdProdutoWBC() {
        return sCdProdutoWBC;
    }

    /**
     * Sets the value of the sCdProdutoWBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdProdutoWBC(JAXBElement<String> value) {
        this.sCdProdutoWBC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdRegraSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdRegraSolicitacao() {
        return sCdRegraSolicitacao;
    }

    /**
     * Sets the value of the sCdRegraSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdRegraSolicitacao(JAXBElement<String> value) {
        this.sCdRegraSolicitacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeMedida() {
        return sCdUnidadeMedida;
    }

    /**
     * Sets the value of the sCdUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeMedida(String value) {
        this.sCdUnidadeMedida = value;
    }

    /**
     * Gets the value of the sDsDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsDetalhe() {
        return sDsDetalhe;
    }

    /**
     * Sets the value of the sDsDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsDetalhe(String value) {
        this.sDsDetalhe = value;
    }

    /**
     * Gets the value of the sDsProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProduto() {
        return sDsProduto;
    }

    /**
     * Sets the value of the sDsProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProduto(String value) {
        this.sDsProduto = value;
    }

}
