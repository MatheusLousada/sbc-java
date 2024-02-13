
package br.gov.sp.saobernardo.paradigma.ws.empresaproduto;

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
 *         &lt;element name="dto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaProdutoDetalhePesquisaDTO" minOccurs="0"/>
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
    "dto"
})
@XmlRootElement(name = "RemoverEmpresaProduto", namespace = "http://tempuri.org/")
public class RemoverEmpresaProduto {

    @XmlElementRef(name = "dto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<EmpresaProdutoDetalhePesquisaDTO> dto;

    /**
     * Gets the value of the dto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmpresaProdutoDetalhePesquisaDTO }{@code >}
     *     
     */
    public JAXBElement<EmpresaProdutoDetalhePesquisaDTO> getDto() {
        return dto;
    }

    /**
     * Sets the value of the dto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmpresaProdutoDetalhePesquisaDTO }{@code >}
     *     
     */
    public void setDto(JAXBElement<EmpresaProdutoDetalhePesquisaDTO> value) {
        this.dto = ((JAXBElement<EmpresaProdutoDetalhePesquisaDTO> ) value);
    }

}
