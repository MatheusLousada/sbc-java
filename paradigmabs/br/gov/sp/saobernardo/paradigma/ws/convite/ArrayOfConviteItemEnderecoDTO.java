
package br.gov.sp.saobernardo.paradigma.ws.convite;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConviteItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConviteItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConviteItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ConviteItemEnderecoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConviteItemEnderecoDTO", propOrder = {
    "conviteItemEnderecoDTO"
})
public class ArrayOfConviteItemEnderecoDTO {

    @XmlElement(name = "ConviteItemEnderecoDTO", nillable = true)
    protected List<ConviteItemEnderecoDTO> conviteItemEnderecoDTO;

    /**
     * Gets the value of the conviteItemEnderecoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conviteItemEnderecoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConviteItemEnderecoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConviteItemEnderecoDTO }
     * 
     * 
     */
    public List<ConviteItemEnderecoDTO> getConviteItemEnderecoDTO() {
        if (conviteItemEnderecoDTO == null) {
            conviteItemEnderecoDTO = new ArrayList<ConviteItemEnderecoDTO>();
        }
        return this.conviteItemEnderecoDTO;
    }

}
