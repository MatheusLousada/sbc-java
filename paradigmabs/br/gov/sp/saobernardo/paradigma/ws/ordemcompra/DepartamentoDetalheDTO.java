
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartamentoDetalheDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartamentoDetalheDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sDsDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartamentoDetalheDTO", propOrder = {
    "sDsDepartamento"
})
public class DepartamentoDetalheDTO
    extends DtoBase
{

    @XmlElementRef(name = "sDsDepartamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsDepartamento;

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

}
