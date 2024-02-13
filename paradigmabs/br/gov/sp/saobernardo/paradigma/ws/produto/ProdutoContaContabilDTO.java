
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoContaContabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoContaContabilDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoContaContabilDTO", propOrder = {
    "sCdContaContabil"
})
public class ProdutoContaContabilDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdContaContabil;

    /**
     * Gets the value of the sCdContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaContabil() {
        return sCdContaContabil;
    }

    /**
     * Sets the value of the sCdContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaContabil(String value) {
        this.sCdContaContabil = value;
    }

}
