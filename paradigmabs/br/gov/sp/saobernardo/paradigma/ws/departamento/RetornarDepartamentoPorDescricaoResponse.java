
package br.gov.sp.saobernardo.paradigma.ws.departamento;

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
 *         &lt;element name="RetornarDepartamentoPorDescricaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_DepartamentoDTO_x003E_" minOccurs="0"/>
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
    "retornarDepartamentoPorDescricaoResult"
})
@XmlRootElement(name = "RetornarDepartamentoPorDescricaoResponse", namespace = "http://tempuri.org/")
public class RetornarDepartamentoPorDescricaoResponse {

    @XmlElementRef(name = "RetornarDepartamentoPorDescricaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CDepartamentoDTOX003E> retornarDepartamentoPorDescricaoResult;

    /**
     * Gets the value of the retornarDepartamentoPorDescricaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDepartamentoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CDepartamentoDTOX003E> getRetornarDepartamentoPorDescricaoResult() {
        return retornarDepartamentoPorDescricaoResult;
    }

    /**
     * Sets the value of the retornarDepartamentoPorDescricaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDepartamentoDTOX003E }{@code >}
     *     
     */
    public void setRetornarDepartamentoPorDescricaoResult(JAXBElement<RetornoListaX003CDepartamentoDTOX003E> value) {
        this.retornarDepartamentoPorDescricaoResult = ((JAXBElement<RetornoListaX003CDepartamentoDTOX003E> ) value);
    }

}
