
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
 *         &lt;element name="sNmEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrPagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sNmEmpresa",
    "nCdSituacao",
    "nNrPagina"
})
@XmlRootElement(name = "RetornarEmpresaCompradoraPorNome", namespace = "http://tempuri.org/")
public class RetornarEmpresaCompradoraPorNome {

    @XmlElementRef(name = "sNmEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sNmEmpresa;
    @XmlElementRef(name = "nCdSituacao", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacao;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nNrPagina;

    /**
     * Gets the value of the sNmEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmEmpresa() {
        return sNmEmpresa;
    }

    /**
     * Sets the value of the sNmEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmEmpresa(JAXBElement<String> value) {
        this.sNmEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdSituacao(JAXBElement<Integer> value) {
        this.nCdSituacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNNrPagina() {
        return nNrPagina;
    }

    /**
     * Sets the value of the nNrPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNNrPagina(Integer value) {
        this.nNrPagina = value;
    }

}
