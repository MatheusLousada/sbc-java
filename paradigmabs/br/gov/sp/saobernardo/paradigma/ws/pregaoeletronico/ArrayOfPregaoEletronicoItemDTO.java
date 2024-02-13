
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPregaoEletronicoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPregaoEletronicoItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PregaoEletronicoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PregaoEletronicoItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPregaoEletronicoItemDTO", propOrder = {
    "pregaoEletronicoItemDTO"
})
public class ArrayOfPregaoEletronicoItemDTO {

    @XmlElement(name = "PregaoEletronicoItemDTO", nillable = true)
    protected List<PregaoEletronicoItemDTO> pregaoEletronicoItemDTO;

    /**
     * Gets the value of the pregaoEletronicoItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pregaoEletronicoItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPregaoEletronicoItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PregaoEletronicoItemDTO }
     * 
     * 
     */
    public List<PregaoEletronicoItemDTO> getPregaoEletronicoItemDTO() {
        if (pregaoEletronicoItemDTO == null) {
            pregaoEletronicoItemDTO = new ArrayList<PregaoEletronicoItemDTO>();
        }
        return this.pregaoEletronicoItemDTO;
    }

}
