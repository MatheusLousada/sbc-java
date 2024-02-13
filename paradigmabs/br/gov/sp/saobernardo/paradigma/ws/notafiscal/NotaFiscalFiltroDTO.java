
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalFiltroDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalFiltroDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdEmpresaFornecedora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalFiltroDTO", propOrder = {
    "sCdEmpresaFornecedora",
    "sNrNotaFiscal",
    "sNrSerie"
})
public class NotaFiscalFiltroDTO
    extends DtoBase
{

    @XmlElementRef(name = "sCdEmpresaFornecedora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaFornecedora;
    @XmlElementRef(name = "sNrNotaFiscal", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrNotaFiscal;
    @XmlElementRef(name = "sNrSerie", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrSerie;

    /**
     * Gets the value of the sCdEmpresaFornecedora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaFornecedora() {
        return sCdEmpresaFornecedora;
    }

    /**
     * Sets the value of the sCdEmpresaFornecedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaFornecedora(JAXBElement<String> value) {
        this.sCdEmpresaFornecedora = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrNotaFiscal() {
        return sNrNotaFiscal;
    }

    /**
     * Sets the value of the sNrNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrNotaFiscal(JAXBElement<String> value) {
        this.sNrNotaFiscal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrSerie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrSerie() {
        return sNrSerie;
    }

    /**
     * Sets the value of the sNrSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrSerie(JAXBElement<String> value) {
        this.sNrSerie = ((JAXBElement<String> ) value);
    }

}
