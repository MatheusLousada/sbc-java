
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WfAlcadaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WfAlcadaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdAlcada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdObjeto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sNmAlcada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfAlcadaDTO", propOrder = {
    "nCdAlcada",
    "nCdObjeto",
    "sNmAlcada"
})
public class WfAlcadaDTO
    extends DtoBase
{

    protected long nCdAlcada;
    protected long nCdObjeto;
    @XmlElement(required = true, nillable = true)
    protected String sNmAlcada;

    /**
     * Gets the value of the nCdAlcada property.
     * 
     */
    public long getNCdAlcada() {
        return nCdAlcada;
    }

    /**
     * Sets the value of the nCdAlcada property.
     * 
     */
    public void setNCdAlcada(long value) {
        this.nCdAlcada = value;
    }

    /**
     * Gets the value of the nCdObjeto property.
     * 
     */
    public long getNCdObjeto() {
        return nCdObjeto;
    }

    /**
     * Sets the value of the nCdObjeto property.
     * 
     */
    public void setNCdObjeto(long value) {
        this.nCdObjeto = value;
    }

    /**
     * Gets the value of the sNmAlcada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmAlcada() {
        return sNmAlcada;
    }

    /**
     * Sets the value of the sNmAlcada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmAlcada(String value) {
        this.sNmAlcada = value;
    }

}
