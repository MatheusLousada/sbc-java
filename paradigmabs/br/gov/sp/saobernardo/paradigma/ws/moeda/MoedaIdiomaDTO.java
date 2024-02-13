
package br.gov.sp.saobernardo.paradigma.ws.moeda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoedaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoedaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfMoedaIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoedaIdiomaDTO", propOrder = {
    "sDsMoeda"
})
public class MoedaIdiomaDTO
    extends IdiomaDTOOfMoedaIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsMoeda;

    /**
     * Gets the value of the sDsMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsMoeda() {
        return sDsMoeda;
    }

    /**
     * Sets the value of the sDsMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsMoeda(String value) {
        this.sDsMoeda = value;
    }

}
