
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

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
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sFlAtivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdDepartamento",
    "sFlAtivo"
})
@XmlRootElement(name = "RetornarCentroCustoPorDepartamento", namespace = "http://tempuri.org/")
public class RetornarCentroCustoPorDepartamento {

    @XmlElementRef(name = "sCdDepartamento", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdDepartamento;
    @XmlElementRef(name = "sFlAtivo", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sFlAtivo;

    /**
     * Gets the value of the sCdDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDepartamento() {
        return sCdDepartamento;
    }

    /**
     * Sets the value of the sCdDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDepartamento(JAXBElement<String> value) {
        this.sCdDepartamento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sFlAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSFlAtivo() {
        return sFlAtivo;
    }

    /**
     * Sets the value of the sFlAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSFlAtivo(JAXBElement<String> value) {
        this.sFlAtivo = ((JAXBElement<String> ) value);
    }

}
