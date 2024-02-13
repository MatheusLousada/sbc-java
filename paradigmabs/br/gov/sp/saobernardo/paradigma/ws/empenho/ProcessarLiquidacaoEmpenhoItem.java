
package br.gov.sp.saobernardo.paradigma.ws.empenho;

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
 *         &lt;element name="lstLiquidacaoEmpenhoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLiquidacaoEmpenhoItemDTO" minOccurs="0"/>
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
    "lstLiquidacaoEmpenhoItemDTO"
})
@XmlRootElement(name = "ProcessarLiquidacaoEmpenhoItem", namespace = "http://tempuri.org/")
public class ProcessarLiquidacaoEmpenhoItem {

    @XmlElementRef(name = "lstLiquidacaoEmpenhoItemDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> lstLiquidacaoEmpenhoItemDTO;

    /**
     * Gets the value of the lstLiquidacaoEmpenhoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoItemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> getLstLiquidacaoEmpenhoItemDTO() {
        return lstLiquidacaoEmpenhoItemDTO;
    }

    /**
     * Sets the value of the lstLiquidacaoEmpenhoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLiquidacaoEmpenhoItemDTO }{@code >}
     *     
     */
    public void setLstLiquidacaoEmpenhoItemDTO(JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> value) {
        this.lstLiquidacaoEmpenhoItemDTO = ((JAXBElement<ArrayOfLiquidacaoEmpenhoItemDTO> ) value);
    }

}
