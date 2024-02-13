
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCentroCustoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCentroCustoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentroCustoIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CentroCustoIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCentroCustoIdiomaDTO", propOrder = {
    "centroCustoIdiomaDTO"
})
public class ArrayOfCentroCustoIdiomaDTO {

    @XmlElement(name = "CentroCustoIdiomaDTO", nillable = true)
    protected List<CentroCustoIdiomaDTO> centroCustoIdiomaDTO;

    /**
     * Gets the value of the centroCustoIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centroCustoIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentroCustoIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentroCustoIdiomaDTO }
     * 
     * 
     */
    public List<CentroCustoIdiomaDTO> getCentroCustoIdiomaDTO() {
        if (centroCustoIdiomaDTO == null) {
            centroCustoIdiomaDTO = new ArrayList<CentroCustoIdiomaDTO>();
        }
        return this.centroCustoIdiomaDTO;
    }

}
