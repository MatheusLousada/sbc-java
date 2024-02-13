
package br.gov.sp.saobernardo.paradigma.ws.prioridade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrioridadeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrioridadeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdPrioridade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsPrioridade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrioridadeDTO", propOrder = {
    "bFlAtivo",
    "sCdPrioridade",
    "sDsPrioridade"
})
public class PrioridadeDTO
    extends DtoBase
{

    protected int bFlAtivo;
    @XmlElement(required = true, nillable = true)
    protected String sCdPrioridade;
    @XmlElement(required = true, nillable = true)
    protected String sDsPrioridade;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     */
    public int getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     */
    public void setBFlAtivo(int value) {
        this.bFlAtivo = value;
    }

    /**
     * Gets the value of the sCdPrioridade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdPrioridade() {
        return sCdPrioridade;
    }

    /**
     * Sets the value of the sCdPrioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdPrioridade(String value) {
        this.sCdPrioridade = value;
    }

    /**
     * Gets the value of the sDsPrioridade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsPrioridade() {
        return sDsPrioridade;
    }

    /**
     * Sets the value of the sDsPrioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsPrioridade(String value) {
        this.sDsPrioridade = value;
    }

}
