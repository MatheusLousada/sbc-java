
package br.gov.sp.saobernardo.paradigma.ws.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgenciaBancoExclusaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgenciaBancoExclusaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdBanco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgenciaBancoExclusaoDTO", propOrder = {
    "sCdAgencia",
    "sCdBanco"
})
public class AgenciaBancoExclusaoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdAgencia;
    @XmlElement(required = true, nillable = true)
    protected String sCdBanco;

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
     * Gets the value of the sCdBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdBanco() {
        return sCdBanco;
    }

    /**
     * Sets the value of the sCdBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdBanco(String value) {
        this.sCdBanco = value;
    }

}
