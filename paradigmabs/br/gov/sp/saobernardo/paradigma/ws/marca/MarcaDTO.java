
package br.gov.sp.saobernardo.paradigma.ws.marca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarcaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarcaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdMarca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMarca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarcaDTO", propOrder = {
    "sCdMarca",
    "sDsMarca"
})
public class MarcaDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdMarca;
    @XmlElement(required = true, nillable = true)
    protected String sDsMarca;

    /**
     * Gets the value of the sCdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMarca() {
        return sCdMarca;
    }

    /**
     * Sets the value of the sCdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMarca(String value) {
        this.sCdMarca = value;
    }

    /**
     * Gets the value of the sDsMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsMarca() {
        return sDsMarca;
    }

    /**
     * Sets the value of the sDsMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsMarca(String value) {
        this.sDsMarca = value;
    }

}
