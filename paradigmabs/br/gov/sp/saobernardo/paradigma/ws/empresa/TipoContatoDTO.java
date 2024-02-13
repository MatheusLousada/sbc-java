
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoContatoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoContatoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdTipoContato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsTipoContato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoContatoDTO", propOrder = {
    "sCdTipoContato",
    "sDsTipoContato"
})
public class TipoContatoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdTipoContato;
    @XmlElement(required = true, nillable = true)
    protected String sDsTipoContato;

    /**
     * Gets the value of the sCdTipoContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdTipoContato() {
        return sCdTipoContato;
    }

    /**
     * Sets the value of the sCdTipoContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdTipoContato(String value) {
        this.sCdTipoContato = value;
    }

    /**
     * Gets the value of the sDsTipoContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsTipoContato() {
        return sDsTipoContato;
    }

    /**
     * Sets the value of the sDsTipoContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsTipoContato(String value) {
        this.sDsTipoContato = value;
    }

}
