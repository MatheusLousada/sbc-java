
package br.gov.sp.saobernardo.paradigma.ws.departamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartamentoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartamentoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfDepartamentoIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartamentoIdiomaDTO", propOrder = {
    "sDsDepartamento"
})
public class DepartamentoIdiomaDTO
    extends IdiomaDTOOfDepartamentoIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsDepartamento;

    /**
     * Gets the value of the sDsDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsDepartamento() {
        return sDsDepartamento;
    }

    /**
     * Sets the value of the sDsDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsDepartamento(String value) {
        this.sDsDepartamento = value;
    }

}
