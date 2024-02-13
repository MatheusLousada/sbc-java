
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalItemTaxaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalItemTaxaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlTaxa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdTaxa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sSgTaxa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalItemTaxaDTO", propOrder = {
    "dVlTaxa",
    "nCdTaxa",
    "sSgTaxa"
})
public class NotaFiscalItemTaxaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlTaxa;
    protected long nCdTaxa;
    @XmlElementRef(name = "sSgTaxa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgTaxa;

    /**
     * Gets the value of the dVlTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTaxa() {
        return dVlTaxa;
    }

    /**
     * Sets the value of the dVlTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTaxa(BigDecimal value) {
        this.dVlTaxa = value;
    }

    /**
     * Gets the value of the nCdTaxa property.
     * 
     */
    public long getNCdTaxa() {
        return nCdTaxa;
    }

    /**
     * Sets the value of the nCdTaxa property.
     * 
     */
    public void setNCdTaxa(long value) {
        this.nCdTaxa = value;
    }

    /**
     * Gets the value of the sSgTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgTaxa() {
        return sSgTaxa;
    }

    /**
     * Sets the value of the sSgTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgTaxa(JAXBElement<String> value) {
        this.sSgTaxa = ((JAXBElement<String> ) value);
    }

}
