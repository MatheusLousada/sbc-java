
package br.gov.sp.saobernardo.paradigma.ws.grupocompra;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGrupoCompraIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGrupoCompraIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrupoCompraIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}GrupoCompraIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGrupoCompraIdiomaDTO", propOrder = {
    "grupoCompraIdiomaDTO"
})
public class ArrayOfGrupoCompraIdiomaDTO {

    @XmlElement(name = "GrupoCompraIdiomaDTO", nillable = true)
    protected List<GrupoCompraIdiomaDTO> grupoCompraIdiomaDTO;

    /**
     * Gets the value of the grupoCompraIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupoCompraIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupoCompraIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoCompraIdiomaDTO }
     * 
     * 
     */
    public List<GrupoCompraIdiomaDTO> getGrupoCompraIdiomaDTO() {
        if (grupoCompraIdiomaDTO == null) {
            grupoCompraIdiomaDTO = new ArrayList<GrupoCompraIdiomaDTO>();
        }
        return this.grupoCompraIdiomaDTO;
    }

}
