
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WbtLogCapaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbtLogCapaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstLogItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfWbtLogDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbtLogCapaDTO", propOrder = {
    "lstLogItem"
})
public class WbtLogCapaDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstLogItem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWbtLogDTO> lstLogItem;

    /**
     * Gets the value of the lstLogItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWbtLogDTO> getLstLogItem() {
        return lstLogItem;
    }

    /**
     * Sets the value of the lstLogItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWbtLogDTO }{@code >}
     *     
     */
    public void setLstLogItem(JAXBElement<ArrayOfWbtLogDTO> value) {
        this.lstLogItem = ((JAXBElement<ArrayOfWbtLogDTO> ) value);
    }

}
