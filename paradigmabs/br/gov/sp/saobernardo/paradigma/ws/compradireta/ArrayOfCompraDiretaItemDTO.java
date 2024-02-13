
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompraDiretaItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompraDiretaItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompraDiretaItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CompraDiretaItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompraDiretaItemDTO", propOrder = {
    "compraDiretaItemDTO"
})
public class ArrayOfCompraDiretaItemDTO {

    @XmlElement(name = "CompraDiretaItemDTO", nillable = true)
    protected List<CompraDiretaItemDTO> compraDiretaItemDTO;

    /**
     * Gets the value of the compraDiretaItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compraDiretaItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompraDiretaItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompraDiretaItemDTO }
     * 
     * 
     */
    public List<CompraDiretaItemDTO> getCompraDiretaItemDTO() {
        if (compraDiretaItemDTO == null) {
            compraDiretaItemDTO = new ArrayList<CompraDiretaItemDTO>();
        }
        return this.compraDiretaItemDTO;
    }

}
