
package br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico;

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
 *         &lt;element name="lstProdutoCompraHistorico" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoCompraHistoricoDTO" minOccurs="0"/>
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
    "lstProdutoCompraHistorico"
})
@XmlRootElement(name = "ProcessarUltimaCompraHistorico", namespace = "http://tempuri.org/")
public class ProcessarUltimaCompraHistorico {

    @XmlElementRef(name = "lstProdutoCompraHistorico", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoCompraHistoricoDTO> lstProdutoCompraHistorico;

    /**
     * Gets the value of the lstProdutoCompraHistorico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoCompraHistoricoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoCompraHistoricoDTO> getLstProdutoCompraHistorico() {
        return lstProdutoCompraHistorico;
    }

    /**
     * Sets the value of the lstProdutoCompraHistorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoCompraHistoricoDTO }{@code >}
     *     
     */
    public void setLstProdutoCompraHistorico(JAXBElement<ArrayOfProdutoCompraHistoricoDTO> value) {
        this.lstProdutoCompraHistorico = ((JAXBElement<ArrayOfProdutoCompraHistoricoDTO> ) value);
    }

}
