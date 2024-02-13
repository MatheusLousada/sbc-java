
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCondicaoPagamentoIdimaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCondicaoPagamentoIdimaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CondicaoPagamentoIdimaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CondicaoPagamentoIdimaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCondicaoPagamentoIdimaDTO", propOrder = {
    "condicaoPagamentoIdimaDTO"
})
public class ArrayOfCondicaoPagamentoIdimaDTO {

    @XmlElement(name = "CondicaoPagamentoIdimaDTO", nillable = true)
    protected List<CondicaoPagamentoIdimaDTO> condicaoPagamentoIdimaDTO;

    /**
     * Gets the value of the condicaoPagamentoIdimaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condicaoPagamentoIdimaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondicaoPagamentoIdimaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CondicaoPagamentoIdimaDTO }
     * 
     * 
     */
    public List<CondicaoPagamentoIdimaDTO> getCondicaoPagamentoIdimaDTO() {
        if (condicaoPagamentoIdimaDTO == null) {
            condicaoPagamentoIdimaDTO = new ArrayList<CondicaoPagamentoIdimaDTO>();
        }
        return this.condicaoPagamentoIdimaDTO;
    }

}
