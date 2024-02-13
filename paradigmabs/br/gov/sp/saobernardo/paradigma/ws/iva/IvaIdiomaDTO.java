
package br.gov.sp.saobernardo.paradigma.ws.iva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IvaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IvaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfIvaIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsIva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IvaIdiomaDTO", propOrder = {
    "sDsIva"
})
public class IvaIdiomaDTO
    extends IdiomaDTOOfIvaIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsIva;

    /**
     * Gets the value of the sDsIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsIva() {
        return sDsIva;
    }

    /**
     * Sets the value of the sDsIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsIva(String value) {
        this.sDsIva = value;
    }

}
