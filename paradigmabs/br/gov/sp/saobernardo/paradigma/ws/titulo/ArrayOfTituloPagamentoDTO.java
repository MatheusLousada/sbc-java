
package br.gov.sp.saobernardo.paradigma.ws.titulo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTituloPagamentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTituloPagamentoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TituloPagamentoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}TituloPagamentoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTituloPagamentoDTO", propOrder = {
    "tituloPagamentoDTO"
})
public class ArrayOfTituloPagamentoDTO {

    @XmlElement(name = "TituloPagamentoDTO", nillable = true)
    protected List<TituloPagamentoDTO> tituloPagamentoDTO;

    /**
     * Gets the value of the tituloPagamentoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tituloPagamentoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTituloPagamentoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TituloPagamentoDTO }
     * 
     * 
     */
    public List<TituloPagamentoDTO> getTituloPagamentoDTO() {
        if (tituloPagamentoDTO == null) {
            tituloPagamentoDTO = new ArrayList<TituloPagamentoDTO>();
        }
        return this.tituloPagamentoDTO;
    }

}
