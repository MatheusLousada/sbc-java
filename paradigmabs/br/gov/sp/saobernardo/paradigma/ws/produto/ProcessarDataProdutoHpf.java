
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
 *         &lt;element name="lstProdutoHpf" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoHpfDTO" minOccurs="0"/>
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
    "lstProdutoHpf"
})
@XmlRootElement(name = "ProcessarDataProdutoHpf", namespace = "http://tempuri.org/")
public class ProcessarDataProdutoHpf {

    @XmlElementRef(name = "lstProdutoHpf", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoHpfDTO> lstProdutoHpf;

    /**
     * Gets the value of the lstProdutoHpf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoHpfDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoHpfDTO> getLstProdutoHpf() {
        return lstProdutoHpf;
    }

    /**
     * Sets the value of the lstProdutoHpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoHpfDTO }{@code >}
     *     
     */
    public void setLstProdutoHpf(JAXBElement<ArrayOfProdutoHpfDTO> value) {
        this.lstProdutoHpf = ((JAXBElement<ArrayOfProdutoHpfDTO> ) value);
    }

}
