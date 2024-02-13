
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequencialDocumentoOrigemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequencialDocumentoOrigemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
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
@XmlType(name = "SequencialDocumentoOrigemDTO", propOrder = {
    "nCdRecDocumento"
})
public class SequencialDocumentoOrigemDTO
    extends DtoBase
{

    protected Long nCdRecDocumento;

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
