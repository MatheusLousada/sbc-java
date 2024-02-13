
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sNrCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nCdEmpresa",
    "sNrCnpj"
})
@XmlRootElement(name = "CriarDeParaFornecedorCasoNaoExista", namespace = "http://tempuri.org/")
public class CriarDeParaFornecedorCasoNaoExista {

    @XmlElement(namespace = "http://tempuri.org/")
    protected Long nCdEmpresa;
    @XmlElementRef(name = "sNrCnpj", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sNrCnpj;

    /**
     * Gets the value of the nCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdEmpresa() {
        return nCdEmpresa;
    }

    /**
     * Sets the value of the nCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdEmpresa(Long value) {
        this.nCdEmpresa = value;
    }

    /**
     * Gets the value of the sNrCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCnpj() {
        return sNrCnpj;
    }

    /**
     * Sets the value of the sNrCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCnpj(JAXBElement<String> value) {
        this.sNrCnpj = ((JAXBElement<String> ) value);
    }

}
