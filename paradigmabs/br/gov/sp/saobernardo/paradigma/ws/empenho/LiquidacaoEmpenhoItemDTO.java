
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LiquidacaoEmpenhoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiquidacaoEmpenhoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlEstorno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlLiquidado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdEmpresaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrEmpenho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrLiquidacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidacaoEmpenhoItemDTO", propOrder = {
    "dQtItem",
    "dVlDesconto",
    "dVlEstorno",
    "dVlLiquidado",
    "dVlUnitario",
    "sCdEmpresaCliente",
    "sNrEmpenho",
    "sNrItem",
    "sNrLiquidacao",
    "tDtAtualizacao"
})
public class LiquidacaoEmpenhoItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlDesconto;
    @XmlElementRef(name = "dVlEstorno", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlEstorno;
    @XmlElement(required = true)
    protected BigDecimal dVlLiquidado;
    @XmlElement(required = true)
    protected BigDecimal dVlUnitario;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCliente;
    @XmlElement(required = true, nillable = true)
    protected String sNrEmpenho;
    @XmlElement(required = true, nillable = true)
    protected String sNrItem;
    @XmlElement(required = true, nillable = true)
    protected String sNrLiquidacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAtualizacao;

    /**
     * Gets the value of the dQtItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItem() {
        return dQtItem;
    }

    /**
     * Sets the value of the dQtItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItem(BigDecimal value) {
        this.dQtItem = value;
    }

    /**
     * Gets the value of the dVlDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlDesconto() {
        return dVlDesconto;
    }

    /**
     * Sets the value of the dVlDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlDesconto(BigDecimal value) {
        this.dVlDesconto = value;
    }

    /**
     * Gets the value of the dVlEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlEstorno() {
        return dVlEstorno;
    }

    /**
     * Sets the value of the dVlEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlEstorno(JAXBElement<BigDecimal> value) {
        this.dVlEstorno = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dVlLiquidado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlLiquidado() {
        return dVlLiquidado;
    }

    /**
     * Sets the value of the dVlLiquidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlLiquidado(BigDecimal value) {
        this.dVlLiquidado = value;
    }

    /**
     * Gets the value of the dVlUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlUnitario() {
        return dVlUnitario;
    }

    /**
     * Sets the value of the dVlUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlUnitario(BigDecimal value) {
        this.dVlUnitario = value;
    }

    /**
     * Gets the value of the sCdEmpresaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCliente() {
        return sCdEmpresaCliente;
    }

    /**
     * Sets the value of the sCdEmpresaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCliente(String value) {
        this.sCdEmpresaCliente = value;
    }

    /**
     * Gets the value of the sNrEmpenho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrEmpenho() {
        return sNrEmpenho;
    }

    /**
     * Sets the value of the sNrEmpenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrEmpenho(String value) {
        this.sNrEmpenho = value;
    }

    /**
     * Gets the value of the sNrItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrItem() {
        return sNrItem;
    }

    /**
     * Sets the value of the sNrItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrItem(String value) {
        this.sNrItem = value;
    }

    /**
     * Gets the value of the sNrLiquidacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrLiquidacao() {
        return sNrLiquidacao;
    }

    /**
     * Sets the value of the sNrLiquidacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrLiquidacao(String value) {
        this.sNrLiquidacao = value;
    }

    /**
     * Gets the value of the tDtAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAtualizacao() {
        return tDtAtualizacao;
    }

    /**
     * Sets the value of the tDtAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAtualizacao(XMLGregorianCalendar value) {
        this.tDtAtualizacao = value;
    }

}
