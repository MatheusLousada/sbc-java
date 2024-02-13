
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGrupoUsuarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGrupoUsuarioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrupoUsuarioDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}GrupoUsuarioDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGrupoUsuarioDTO", propOrder = {
    "grupoUsuarioDTO"
})
public class ArrayOfGrupoUsuarioDTO {

    @XmlElement(name = "GrupoUsuarioDTO", nillable = true)
    protected List<GrupoUsuarioDTO> grupoUsuarioDTO;

    /**
     * Gets the value of the grupoUsuarioDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupoUsuarioDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupoUsuarioDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoUsuarioDTO }
     * 
     * 
     */
    public List<GrupoUsuarioDTO> getGrupoUsuarioDTO() {
        if (grupoUsuarioDTO == null) {
            grupoUsuarioDTO = new ArrayList<GrupoUsuarioDTO>();
        }
        return this.grupoUsuarioDTO;
    }

}
