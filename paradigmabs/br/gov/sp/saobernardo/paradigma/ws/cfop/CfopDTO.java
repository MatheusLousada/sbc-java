
package br.gov.sp.saobernardo.paradigma.ws.cfop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CfopDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CfopDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdCfop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsOperacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CfopDTO", propOrder = {
    "sCdCfop",
    "sDsOperacao"
})
public class CfopDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdCfop;
    @XmlElement(required = true, nillable = true)
    protected String sDsOperacao;

    /**
     * Gets the value of the sCdCfop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCfop() {
        return sCdCfop;
    }

    /**
     * Sets the value of the sCdCfop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCfop(String value) {
        this.sCdCfop = value;
    }

    /**
     * Gets the value of the sDsOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsOperacao() {
        return sDsOperacao;
    }

    /**
     * Sets the value of the sDsOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsOperacao(String value) {
        this.sDsOperacao = value;
    }

}
