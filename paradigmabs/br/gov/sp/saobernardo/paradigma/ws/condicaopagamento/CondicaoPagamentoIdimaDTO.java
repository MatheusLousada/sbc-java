
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicaoPagamentoIdimaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicaoPagamentoIdimaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfCondicaoPagamentoIdimaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoPagamentoIdimaDTO", propOrder = {
    "sDsCondicaoPagamento"
})
public class CondicaoPagamentoIdimaDTO
    extends IdiomaDTOOfCondicaoPagamentoIdimaDTOljhnh6KL
{

    @XmlElement(required = true, nillable = true)
    protected String sDsCondicaoPagamento;

    /**
     * Gets the value of the sDsCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCondicaoPagamento() {
        return sDsCondicaoPagamento;
    }

    /**
     * Sets the value of the sDsCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCondicaoPagamento(String value) {
        this.sDsCondicaoPagamento = value;
    }

}
