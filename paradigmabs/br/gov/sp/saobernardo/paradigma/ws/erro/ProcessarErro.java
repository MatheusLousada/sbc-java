
package br.gov.sp.saobernardo.paradigma.ws.erro;

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
 *         &lt;element name="nCdOperacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sDsLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsLogDetalhado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nCdOperacao",
    "sDsLog",
    "sDsLogDetalhado"
})
@XmlRootElement(name = "ProcessarErro")
public class ProcessarErro {

    protected Integer nCdOperacao;
    @XmlElementRef(name = "sDsLog", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsLog;
    @XmlElementRef(name = "sDsLogDetalhado", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsLogDetalhado;

    /**
     * Gets the value of the nCdOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdOperacao() {
        return nCdOperacao;
    }

    /**
     * Sets the value of the nCdOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdOperacao(Integer value) {
        this.nCdOperacao = value;
    }

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

}
