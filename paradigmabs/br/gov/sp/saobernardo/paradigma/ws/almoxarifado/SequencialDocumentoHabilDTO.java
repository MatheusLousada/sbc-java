
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequencialDocumentoHabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequencialDocumentoHabilDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdDocumentoOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdRecDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequencialDocumentoHabilDTO", propOrder = {
    "nCdDocumentoOrigem",
    "nCdRecDocumento"
})
public class SequencialDocumentoHabilDTO
    extends DtoBase
{

    protected Long nCdDocumentoOrigem;
    protected Long nCdRecDocumento;

    /**
     * Gets the value of the nCdDocumentoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdDocumentoOrigem() {
        return nCdDocumentoOrigem;
    }

    /**
     * Sets the value of the nCdDocumentoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdDocumentoOrigem(Long value) {
        this.nCdDocumentoOrigem = value;
    }

    /**
     * Gets the value of the nCdRecDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdRecDocumento() {
        return nCdRecDocumento;
    }

    /**
     * Sets the value of the nCdRecDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdRecDocumento(Long value) {
        this.nCdRecDocumento = value;
    }

}
