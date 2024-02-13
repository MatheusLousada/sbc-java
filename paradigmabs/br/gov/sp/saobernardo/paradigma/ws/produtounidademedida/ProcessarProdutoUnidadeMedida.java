
package br.gov.sp.saobernardo.paradigma.ws.produtounidademedida;

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
 *         &lt;element name="lstProdutoUnidadeMedida" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoUnidadeMedidaDTO" minOccurs="0"/>
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
    "lstProdutoUnidadeMedida"
})
@XmlRootElement(name = "ProcessarProdutoUnidadeMedida", namespace = "http://tempuri.org/")
public class ProcessarProdutoUnidadeMedida {

    @XmlElementRef(name = "lstProdutoUnidadeMedida", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoUnidadeMedidaDTO> lstProdutoUnidadeMedida;

    /**
     * Gets the value of the lstProdutoUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoUnidadeMedidaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoUnidadeMedidaDTO> getLstProdutoUnidadeMedida() {
        return lstProdutoUnidadeMedida;
    }

    /**
     * Sets the value of the lstProdutoUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoUnidadeMedidaDTO }{@code >}
     *     
     */
    public void setLstProdutoUnidadeMedida(JAXBElement<ArrayOfProdutoUnidadeMedidaDTO> value) {
        this.lstProdutoUnidadeMedida = ((JAXBElement<ArrayOfProdutoUnidadeMedidaDTO> ) value);
    }

}
