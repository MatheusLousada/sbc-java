
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnidadeNegocioCentroCustoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidadeNegocioCentroCustoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadeNegocioCentroCustoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeNegocioCentroCustoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidadeNegocioCentroCustoDTO", propOrder = {
    "unidadeNegocioCentroCustoDTO"
})
public class ArrayOfUnidadeNegocioCentroCustoDTO {

    @XmlElement(name = "UnidadeNegocioCentroCustoDTO", nillable = true)
    protected List<UnidadeNegocioCentroCustoDTO> unidadeNegocioCentroCustoDTO;

    /**
     * Gets the value of the unidadeNegocioCentroCustoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadeNegocioCentroCustoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadeNegocioCentroCustoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadeNegocioCentroCustoDTO }
     * 
     * 
     */
    public List<UnidadeNegocioCentroCustoDTO> getUnidadeNegocioCentroCustoDTO() {
        if (unidadeNegocioCentroCustoDTO == null) {
            unidadeNegocioCentroCustoDTO = new ArrayList<UnidadeNegocioCentroCustoDTO>();
        }
        return this.unidadeNegocioCentroCustoDTO;
    }

}
