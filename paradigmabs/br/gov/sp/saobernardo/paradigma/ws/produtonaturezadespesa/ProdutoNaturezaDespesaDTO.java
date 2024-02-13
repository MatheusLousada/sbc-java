
package br.gov.sp.saobernardo.paradigma.ws.produtonaturezadespesa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoNaturezaDespesaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoNaturezaDespesaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoNaturezaDespesaDTO", propOrder = {
    "sCdNaturezaDespesa",
    "sCdProduto"
})
public class ProdutoNaturezaDespesaDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdNaturezaDespesa;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;

    /**
     * Gets the value of the sCdNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdNaturezaDespesa() {
        return sCdNaturezaDespesa;
    }

    /**
     * Sets the value of the sCdNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdNaturezaDespesa(String value) {
        this.sCdNaturezaDespesa = value;
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

}
