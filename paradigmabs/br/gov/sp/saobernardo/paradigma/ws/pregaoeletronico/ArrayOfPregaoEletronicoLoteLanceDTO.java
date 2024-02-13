
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPregaoEletronicoLoteLanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPregaoEletronicoLoteLanceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PregaoEletronicoLoteLanceDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PregaoEletronicoLoteLanceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPregaoEletronicoLoteLanceDTO", propOrder = {
    "pregaoEletronicoLoteLanceDTO"
})
public class ArrayOfPregaoEletronicoLoteLanceDTO {

    @XmlElement(name = "PregaoEletronicoLoteLanceDTO", nillable = true)
    protected List<PregaoEletronicoLoteLanceDTO> pregaoEletronicoLoteLanceDTO;

    /**
     * Gets the value of the pregaoEletronicoLoteLanceDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pregaoEletronicoLoteLanceDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPregaoEletronicoLoteLanceDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PregaoEletronicoLoteLanceDTO }
     * 
     * 
     */
    public List<PregaoEletronicoLoteLanceDTO> getPregaoEletronicoLoteLanceDTO() {
        if (pregaoEletronicoLoteLanceDTO == null) {
            pregaoEletronicoLoteLanceDTO = new ArrayList<PregaoEletronicoLoteLanceDTO>();
        }
        return this.pregaoEletronicoLoteLanceDTO;
    }

}
