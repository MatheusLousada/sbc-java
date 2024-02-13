
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentroCustoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentroCustoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfCentroCustoIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroCustoIdiomaDTO", propOrder = {
    "sDsCentroCusto"
})
public class CentroCustoIdiomaDTO
    extends IdiomaDTOOfCentroCustoIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsCentroCusto;

    /**
     * Gets the value of the sDsCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCentroCusto() {
        return sDsCentroCusto;
    }

    /**
     * Sets the value of the sDsCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCentroCusto(String value) {
        this.sDsCentroCusto = value;
    }

}
