
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdiomaDTOOfProdutoIdiomaDTOljhnh6kL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdiomaDTOOfProdutoIdiomaDTOljhnh6kL">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdIdioma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdiomaDTOOfProdutoIdiomaDTOljhnh6kL", propOrder = {
    "sCdIdioma"
})
public class IdiomaDTOOfProdutoIdiomaDTOljhnh6KL
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdIdioma;

    /**
     * Gets the value of the sCdIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdIdioma() {
        return sCdIdioma;
    }

    /**
     * Sets the value of the sCdIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdIdioma(String value) {
        this.sCdIdioma = value;
    }

}
