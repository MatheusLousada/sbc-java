
package br.gov.sp.saobernardo.paradigma.ws.departamento;

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
 *         &lt;element name="sDsDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sDsDepartamento",
    "nCdSituacao",
    "nNrPagina"
})
@XmlRootElement(name = "RetornarDepartamentoPorDescricao", namespace = "http://tempuri.org/")
public class RetornarDepartamentoPorDescricao {

    @XmlElementRef(name = "sDsDepartamento", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsDepartamento;
    @XmlElementRef(name = "nCdSituacao", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacao;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nNrPagina;

    /**
     * Gets the value of the sDsDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsDepartamento() {
        return sDsDepartamento;
    }

    /**
     * Sets the value of the sDsDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsDepartamento(JAXBElement<String> value) {
        this.sDsDepartamento = ((JAXBElement<String> ) value);
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
