
package br.gov.sp.saobernardo.paradigma.ws.wbtlog;

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
 *         &lt;element name="sDsLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsLogDetalhado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sDsLog",
    "sDsLogDetalhado",
    "sNrToken",
    "sCdOrigem"
})
@XmlRootElement(name = "ProcessarErroLog")
public class ProcessarErroLog {

    @XmlElementRef(name = "sDsLog", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsLog;
    @XmlElementRef(name = "sDsLogDetalhado", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsLogDetalhado;
    @XmlElementRef(name = "sNrToken", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sNrToken;
    @XmlElementRef(name = "sCdOrigem", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdOrigem;

    /**
     * Gets the value of the sDsLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsLog() {
        return sDsLog;
    }

    /**
     * Sets the value of the sDsLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsLog(JAXBElement<String> value) {
        this.sDsLog = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsLogDetalhado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsLogDetalhado() {
        return sDsLogDetalhado;
    }

    /**
     * Sets the value of the sDsLogDetalhado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsLogDetalhado(JAXBElement<String> value) {
        this.sDsLogDetalhado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrToken() {
        return sNrToken;
    }

    /**
     * Sets the value of the sNrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrToken(JAXBElement<String> value) {
        this.sNrToken = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdOrigem() {
        return sCdOrigem;
    }

    /**
     * Sets the value of the sCdOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdOrigem(JAXBElement<String> value) {
        this.sCdOrigem = ((JAXBElement<String> ) value);
    }

}
