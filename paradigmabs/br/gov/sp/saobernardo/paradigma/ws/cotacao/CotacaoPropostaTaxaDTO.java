
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CotacaoPropostaTaxaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoPropostaTaxaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlIncluso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dPcTaxa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "CotacaoPropostaTaxaDTO", propOrder = {
    "bFlIncluso",
    "dPcTaxa",
    "nCdTaxa"
})
public class CotacaoPropostaTaxaDTO
    extends DtoBase
{

    protected int bFlIncluso;
    @XmlElement(required = true)
    protected BigDecimal dPcTaxa;
    protected long nCdTaxa;

    /**
     * Gets the value of the bFlIncluso property.
     * 
     */
    public int getBFlIncluso() {
        return bFlIncluso;
    }

    /**
     * Sets the value of the bFlIncluso property.
     * 
     */
    public void setBFlIncluso(int value) {
        this.bFlIncluso = value;
    }

    /**
     * Gets the value of the dPcTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDPcTaxa() {
        return dPcTaxa;
    }

    /**
     * Sets the value of the dPcTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDPcTaxa(BigDecimal value) {
        this.dPcTaxa = value;
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
