
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeMedidaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeMedidaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeMedidaIdiomaDTO", propOrder = {
    "sDsUnidadeMedida",
    "sSgUnidadeMedida"
})
public class UnidadeMedidaIdiomaDTO
    extends IdiomaDTOOfUnidadeMedidaIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sSgUnidadeMedida;

    /**
     * Gets the value of the sDsUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsUnidadeMedida() {
        return sDsUnidadeMedida;
    }

    /**
     * Sets the value of the sDsUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsUnidadeMedida(String value) {
        this.sDsUnidadeMedida = value;
    }

    /**
     * Gets the value of the sSgUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgUnidadeMedida() {
        return sSgUnidadeMedida;
    }

    /**
     * Sets the value of the sSgUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgUnidadeMedida(String value) {
        this.sSgUnidadeMedida = value;
    }

}
