
package br.gov.sp.saobernardo.paradigma.ws.aplicacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AplicacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AplicacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdAplicacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsAplicacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AplicacaoDTO", propOrder = {
    "sCdAplicacao",
    "sDsAplicacao"
})
public class AplicacaoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdAplicacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsAplicacao;

    /**
     * Gets the value of the sCdAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAplicacao() {
        return sCdAplicacao;
    }

    /**
     * Sets the value of the sCdAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAplicacao(String value) {
        this.sCdAplicacao = value;
    }

    /**
     * Gets the value of the sDsAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsAplicacao() {
        return sDsAplicacao;
    }

    /**
     * Sets the value of the sDsAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsAplicacao(String value) {
        this.sDsAplicacao = value;
    }

}
