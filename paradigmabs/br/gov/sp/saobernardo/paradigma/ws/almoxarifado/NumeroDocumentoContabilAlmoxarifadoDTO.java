
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumeroDocumentoContabilAlmoxarifadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumeroDocumentoContabilAlmoxarifadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdKardex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdDocumentoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroDocumentoContabilAlmoxarifadoDTO", propOrder = {
    "nCdKardex",
    "sCdDocumentoContabil"
})
public class NumeroDocumentoContabilAlmoxarifadoDTO
    extends DtoBase
{

    protected Integer nCdKardex;
    @XmlElementRef(name = "sCdDocumentoContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDocumentoContabil;

    /**
     * Gets the value of the nCdKardex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdKardex() {
        return nCdKardex;
    }

    /**
     * Sets the value of the nCdKardex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdKardex(Integer value) {
        this.nCdKardex = value;
    }

    /**
     * Gets the value of the sCdDocumentoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDocumentoContabil() {
        return sCdDocumentoContabil;
    }

    /**
     * Sets the value of the sCdDocumentoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDocumentoContabil(JAXBElement<String> value) {
        this.sCdDocumentoContabil = ((JAXBElement<String> ) value);
    }

}
