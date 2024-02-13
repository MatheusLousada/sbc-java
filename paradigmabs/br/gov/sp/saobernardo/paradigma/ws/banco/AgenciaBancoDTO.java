
package br.gov.sp.saobernardo.paradigma.ws.banco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgenciaBancoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgenciaBancoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdAgenciaBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sNmAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgenciaBancoDTO", propOrder = {
    "sCdAgencia",
    "sCdAgenciaBanco",
    "sNmAgencia"
})
public class AgenciaBancoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdAgencia;
    @XmlElementRef(name = "sCdAgenciaBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> sCdAgenciaBanco;
    @XmlElementRef(name = "sNmAgencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmAgencia;

    /**
     * Gets the value of the sCdAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAgencia() {
        return sCdAgencia;
    }

    /**
     * Sets the value of the sCdAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAgencia(String value) {
        this.sCdAgencia = value;
    }

    /**
     * Gets the value of the sCdAgenciaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSCdAgenciaBanco() {
        return sCdAgenciaBanco;
    }

    /**
     * Sets the value of the sCdAgenciaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSCdAgenciaBanco(JAXBElement<Integer> value) {
        this.sCdAgenciaBanco = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sNmAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmAgencia() {
        return sNmAgencia;
    }

    /**
     * Sets the value of the sNmAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmAgencia(JAXBElement<String> value) {
        this.sNmAgencia = ((JAXBElement<String> ) value);
    }

}
