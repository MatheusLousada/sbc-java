
package br.gov.sp.saobernardo.paradigma.ws.titulo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TituloDescontoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TituloDescontoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdDesconto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsDesconto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloDescontoDTO", propOrder = {
    "dVlDesconto",
    "sCdDesconto",
    "sDsDesconto"
})
public class TituloDescontoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlDesconto;
    @XmlElement(required = true, nillable = true)
    protected String sCdDesconto;
    @XmlElement(required = true, nillable = true)
    protected String sDsDesconto;

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
     * Gets the value of the sCdDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdDesconto() {
        return sCdDesconto;
    }

    /**
     * Sets the value of the sCdDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdDesconto(String value) {
        this.sCdDesconto = value;
    }

    /**
     * Gets the value of the sDsDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsDesconto() {
        return sDsDesconto;
    }

    /**
     * Sets the value of the sDsDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsDesconto(String value) {
        this.sDsDesconto = value;
    }

}
