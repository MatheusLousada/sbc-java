
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogoPadraoProdutoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogoPadraoProdutoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdCatalogoPadrao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoPadraoProdutoDTO", propOrder = {
    "sCdCatalogoPadrao"
})
public class CatalogoPadraoProdutoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdCatalogoPadrao;

    /**
     * Gets the value of the sCdCatalogoPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCatalogoPadrao() {
        return sCdCatalogoPadrao;
    }

    /**
     * Sets the value of the sCdCatalogoPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCatalogoPadrao(String value) {
        this.sCdCatalogoPadrao = value;
    }

}
