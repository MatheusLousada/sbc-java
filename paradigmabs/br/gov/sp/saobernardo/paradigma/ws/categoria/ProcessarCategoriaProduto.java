
package br.gov.sp.saobernardo.paradigma.ws.categoria;

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
 *         &lt;element name="lstCategoria" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCategoriaDTO" minOccurs="0"/>
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
    "lstCategoria"
})
@XmlRootElement(name = "ProcessarCategoriaProduto", namespace = "http://tempuri.org/")
public class ProcessarCategoriaProduto {

    @XmlElementRef(name = "lstCategoria", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCategoriaDTO> lstCategoria;

    /**
     * Gets the value of the lstCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoriaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCategoriaDTO> getLstCategoria() {
        return lstCategoria;
    }

    /**
     * Sets the value of the lstCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoriaDTO }{@code >}
     *     
     */
    public void setLstCategoria(JAXBElement<ArrayOfCategoriaDTO> value) {
        this.lstCategoria = ((JAXBElement<ArrayOfCategoriaDTO> ) value);
    }

}
