
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

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
 *         &lt;element name="nQtRegistros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdTipoOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdOrdemCompraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nQtRegistros",
    "nCdTipoOrdemCompra",
    "nCdOrdemCompra",
    "sCdOrdemCompraEmpresa"
})
@XmlRootElement(name = "RetornarOrdemCompra", namespace = "http://tempuri.org/")
public class RetornarOrdemCompra {

    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nQtRegistros;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nCdTipoOrdemCompra;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nCdOrdemCompra;
    @XmlElementRef(name = "sCdOrdemCompraEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdOrdemCompraEmpresa;

    /**
     * Gets the value of the nQtRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNQtRegistros() {
        return nQtRegistros;
    }

    /**
     * Sets the value of the nQtRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNQtRegistros(Integer value) {
        this.nQtRegistros = value;
    }

    /**
     * Gets the value of the nCdTipoOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdTipoOrdemCompra() {
        return nCdTipoOrdemCompra;
    }

    /**
     * Sets the value of the nCdTipoOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdTipoOrdemCompra(Integer value) {
        this.nCdTipoOrdemCompra = value;
    }

    /**
     * Gets the value of the nCdOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdOrdemCompra() {
        return nCdOrdemCompra;
    }

    /**
     * Sets the value of the nCdOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdOrdemCompra(Integer value) {
        this.nCdOrdemCompra = value;
    }

    /**
     * Gets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdOrdemCompraEmpresa() {
        return sCdOrdemCompraEmpresa;
    }

    /**
     * Sets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdOrdemCompraEmpresa(JAXBElement<String> value) {
        this.sCdOrdemCompraEmpresa = ((JAXBElement<String> ) value);
    }

}
