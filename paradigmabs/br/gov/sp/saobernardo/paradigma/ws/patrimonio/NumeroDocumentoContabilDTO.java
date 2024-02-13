
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumeroDocumentoContabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumeroDocumentoContabilDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdOperacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdDocumentoContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroDocumentoContabilDTO", propOrder = {
    "nCdOperacao",
    "sCdDocumentoContabil"
})
public class NumeroDocumentoContabilDTO
    extends DtoBase
{

    protected long nCdOperacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdDocumentoContabil;

    /**
     * Gets the value of the nCdOperacao property.
     * 
     */
    public long getNCdOperacao() {
        return nCdOperacao;
    }

    /**
     * Sets the value of the nCdOperacao property.
     * 
     */
    public void setNCdOperacao(long value) {
        this.nCdOperacao = value;
    }

    /**
     * Gets the value of the sCdDocumentoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdDocumentoContabil() {
        return sCdDocumentoContabil;
    }

    /**
     * Sets the value of the sCdDocumentoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdDocumentoContabil(String value) {
        this.sCdDocumentoContabil = value;
    }

}
