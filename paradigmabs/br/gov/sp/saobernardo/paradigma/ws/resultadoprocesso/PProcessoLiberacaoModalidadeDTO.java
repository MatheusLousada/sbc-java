
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PProcessoLiberacaoModalidadeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoLiberacaoModalidadeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdModalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoLiberacaoModalidadeDTO", propOrder = {
    "nCdModalidade",
    "sNrProcessoDisplay"
})
public class PProcessoLiberacaoModalidadeDTO
    extends DtoBase
{

    protected int nCdModalidade;
    @XmlElement(required = true, nillable = true)
    protected String sNrProcessoDisplay;

    /**
     * Gets the value of the nCdModalidade property.
     * 
     */
    public int getNCdModalidade() {
        return nCdModalidade;
    }

    /**
     * Sets the value of the nCdModalidade property.
     * 
     */
    public void setNCdModalidade(int value) {
        this.nCdModalidade = value;
    }

    /**
     * Gets the value of the sNrProcessoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrProcessoDisplay() {
        return sNrProcessoDisplay;
    }

    /**
     * Sets the value of the sNrProcessoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrProcessoDisplay(String value) {
        this.sNrProcessoDisplay = value;
    }

}
