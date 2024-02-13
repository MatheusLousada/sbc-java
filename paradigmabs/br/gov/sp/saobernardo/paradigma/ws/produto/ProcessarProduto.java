
package br.gov.sp.saobernardo.paradigma.ws.produto;

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
 *         &lt;element name="lstProduto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoDTO" minOccurs="0"/>
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
    "lstProduto"
})
@XmlRootElement(name = "ProcessarProduto", namespace = "http://tempuri.org/")
public class ProcessarProduto {

    @XmlElementRef(name = "lstProduto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoDTO> lstProduto;

    /**
     * Gets the value of the lstProduto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoDTO> getLstProduto() {
        return lstProduto;
    }

    /**
     * Sets the value of the lstProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}
     *     
     */
    public void setLstProduto(JAXBElement<ArrayOfProdutoDTO> value) {
        this.lstProduto = ((JAXBElement<ArrayOfProdutoDTO> ) value);
    }

}
