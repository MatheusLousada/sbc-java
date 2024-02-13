
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfProdutoIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsDetalhe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoIdiomaDTO", propOrder = {
    "sDsDetalhe",
    "sDsProduto"
})
public class ProdutoIdiomaDTO
    extends IdiomaDTOOfProdutoIdiomaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsDetalhe;
    @XmlElement(required = true, nillable = true)
    protected String sDsProduto;

    /**
     * Gets the value of the sDsDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsDetalhe() {
        return sDsDetalhe;
    }

    /**
     * Sets the value of the sDsDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsDetalhe(String value) {
        this.sDsDetalhe = value;
    }

    /**
     * Gets the value of the sDsProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProduto() {
        return sDsProduto;
    }

    /**
     * Sets the value of the sDsProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProduto(String value) {
        this.sDsProduto = value;
    }

}
