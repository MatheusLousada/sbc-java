
package br.gov.sp.saobernardo.paradigma.ws.categoria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoriaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfCategoriaIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaIdiomaDTO", propOrder = {
    "sDsClasse"
})
public class CategoriaIdiomaDTO
    extends IdiomaDTOOfCategoriaIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsClasse;

    /**
     * Gets the value of the sDsClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsClasse() {
        return sDsClasse;
    }

    /**
     * Sets the value of the sDsClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsClasse(String value) {
        this.sDsClasse = value;
    }

}
