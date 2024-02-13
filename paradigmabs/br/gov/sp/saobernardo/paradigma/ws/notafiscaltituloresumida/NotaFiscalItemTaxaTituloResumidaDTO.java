
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalItemTaxaTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalItemTaxaTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlTaxa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdTaxa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalItemTaxaTituloResumidaDTO", propOrder = {
    "dVlTaxa",
    "nCdTaxa"
})
public class NotaFiscalItemTaxaTituloResumidaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlTaxa;
    protected long nCdTaxa;

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

}
