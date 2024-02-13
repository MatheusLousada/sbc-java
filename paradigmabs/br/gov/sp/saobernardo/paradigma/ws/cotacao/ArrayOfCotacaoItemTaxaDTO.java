
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCotacaoItemTaxaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCotacaoItemTaxaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CotacaoItemTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CotacaoItemTaxaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCotacaoItemTaxaDTO", propOrder = {
    "cotacaoItemTaxaDTO"
})
public class ArrayOfCotacaoItemTaxaDTO {

    @XmlElement(name = "CotacaoItemTaxaDTO", nillable = true)
    protected List<CotacaoItemTaxaDTO> cotacaoItemTaxaDTO;

    /**
     * Gets the value of the cotacaoItemTaxaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cotacaoItemTaxaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCotacaoItemTaxaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CotacaoItemTaxaDTO }
     * 
     * 
     */
    public List<CotacaoItemTaxaDTO> getCotacaoItemTaxaDTO() {
        if (cotacaoItemTaxaDTO == null) {
            cotacaoItemTaxaDTO = new ArrayList<CotacaoItemTaxaDTO>();
        }
        return this.cotacaoItemTaxaDTO;
    }

}
