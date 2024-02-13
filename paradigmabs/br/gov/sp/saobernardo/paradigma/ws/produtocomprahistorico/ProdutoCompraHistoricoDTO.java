
package br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProdutoCompraHistoricoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoCompraHistoricoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtProdutoCompra" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlProdutoCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdEmpresaCompradora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaFornecedora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtProdutoCompra" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoCompraHistoricoDTO", propOrder = {
    "dQtProdutoCompra",
    "dVlProdutoCompra",
    "sCdEmpresaCompradora",
    "sCdEmpresaFornecedora",
    "sCdProduto",
    "sCdUnidadeMedida",
    "tDtProdutoCompra"
})
public class ProdutoCompraHistoricoDTO
    extends DtoBase
{

    protected BigDecimal dQtProdutoCompra;
    @XmlElement(required = true)
    protected BigDecimal dVlProdutoCompra;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCompradora;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaFornecedora;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtProdutoCompra;

    /**
     * Gets the value of the dQtProdutoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtProdutoCompra() {
        return dQtProdutoCompra;
    }

    /**
     * Sets the value of the dQtProdutoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtProdutoCompra(BigDecimal value) {
        this.dQtProdutoCompra = value;
    }

    /**
     * Gets the value of the dVlProdutoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlProdutoCompra() {
        return dVlProdutoCompra;
    }

    /**
     * Sets the value of the dVlProdutoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlProdutoCompra(BigDecimal value) {
        this.dVlProdutoCompra = value;
    }

    /**
     * Gets the value of the sCdEmpresaCompradora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCompradora() {
        return sCdEmpresaCompradora;
    }

    /**
     * Sets the value of the sCdEmpresaCompradora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCompradora(String value) {
        this.sCdEmpresaCompradora = value;
    }

    /**
     * Gets the value of the sCdEmpresaFornecedora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaFornecedora() {
        return sCdEmpresaFornecedora;
    }

    /**
     * Sets the value of the sCdEmpresaFornecedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaFornecedora(String value) {
        this.sCdEmpresaFornecedora = value;
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
     * Gets the value of the tDtProdutoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtProdutoCompra() {
        return tDtProdutoCompra;
    }

    /**
     * Sets the value of the tDtProdutoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtProdutoCompra(XMLGregorianCalendar value) {
        this.tDtProdutoCompra = value;
    }

}
