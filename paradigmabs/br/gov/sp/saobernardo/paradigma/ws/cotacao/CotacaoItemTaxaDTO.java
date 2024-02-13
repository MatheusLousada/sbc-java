
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CotacaoItemTaxaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoItemTaxaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlIncluso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "CotacaoItemTaxaDTO", propOrder = {
    "bFlIncluso",
    "nCdItem",
    "nCdTaxa"
})
public class CotacaoItemTaxaDTO
    extends DtoBase
{

    protected long bFlIncluso;
    protected Long nCdItem;
    protected long nCdTaxa;

    /**
     * Gets the value of the bFlIncluso property.
     * 
     */
    public long getBFlIncluso() {
        return bFlIncluso;
    }

    /**
     * Sets the value of the bFlIncluso property.
     * 
     */
    public void setBFlIncluso(long value) {
        this.bFlIncluso = value;
    }

    /**
     * Gets the value of the nCdItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdItem() {
        return nCdItem;
    }

    /**
     * Sets the value of the nCdItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdItem(Long value) {
        this.nCdItem = value;
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
