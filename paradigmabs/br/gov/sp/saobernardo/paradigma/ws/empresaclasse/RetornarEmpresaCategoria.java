
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sCdEmpresaErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sCdEmpresaErp"
})
@XmlRootElement(name = "RetornarEmpresaCategoria")
public class RetornarEmpresaCategoria {

    @XmlElementRef(name = "sCdEmpresaErp", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaErp;

    /**
     * Gets the value of the sCdEmpresaErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaErp() {
        return sCdEmpresaErp;
    }

    /**
     * Sets the value of the sCdEmpresaErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaErp(JAXBElement<String> value) {
        this.sCdEmpresaErp = ((JAXBElement<String> ) value);
    }

}
