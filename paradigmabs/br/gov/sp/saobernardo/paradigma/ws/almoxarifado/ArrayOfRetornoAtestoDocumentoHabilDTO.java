
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRetornoAtestoDocumentoHabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetornoAtestoDocumentoHabilDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetornoAtestoDocumentoHabilDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoAtestoDocumentoHabilDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetornoAtestoDocumentoHabilDTO", propOrder = {
    "retornoAtestoDocumentoHabilDTO"
})
public class ArrayOfRetornoAtestoDocumentoHabilDTO {

    @XmlElement(name = "RetornoAtestoDocumentoHabilDTO", nillable = true)
    protected List<RetornoAtestoDocumentoHabilDTO> retornoAtestoDocumentoHabilDTO;

    /**
     * Gets the value of the retornoAtestoDocumentoHabilDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoAtestoDocumentoHabilDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoAtestoDocumentoHabilDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetornoAtestoDocumentoHabilDTO }
     * 
     * 
     */
    public List<RetornoAtestoDocumentoHabilDTO> getRetornoAtestoDocumentoHabilDTO() {
        if (retornoAtestoDocumentoHabilDTO == null) {
            retornoAtestoDocumentoHabilDTO = new ArrayList<RetornoAtestoDocumentoHabilDTO>();
        }
        return this.retornoAtestoDocumentoHabilDTO;
    }

}
