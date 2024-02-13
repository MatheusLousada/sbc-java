
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PProcessoLoteIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoLoteIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsLote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoLoteIdiomaDTO", propOrder = {
    "sDsLote"
})
public class PProcessoLoteIdiomaDTO
    extends IdiomaDTOOfPProcessoLoteIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsLote;

    /**
     * Gets the value of the sDsLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsLote() {
        return sDsLote;
    }

    /**
     * Sets the value of the sDsLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsLote(String value) {
        this.sDsLote = value;
    }

}
