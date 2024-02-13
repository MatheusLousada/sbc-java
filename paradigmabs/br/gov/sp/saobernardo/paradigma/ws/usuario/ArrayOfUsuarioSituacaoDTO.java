
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUsuarioSituacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUsuarioSituacaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioSituacaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UsuarioSituacaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUsuarioSituacaoDTO", propOrder = {
    "usuarioSituacaoDTO"
})
public class ArrayOfUsuarioSituacaoDTO {

    @XmlElement(name = "UsuarioSituacaoDTO", nillable = true)
    protected List<UsuarioSituacaoDTO> usuarioSituacaoDTO;

    /**
     * Gets the value of the usuarioSituacaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarioSituacaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarioSituacaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioSituacaoDTO }
     * 
     * 
     */
    public List<UsuarioSituacaoDTO> getUsuarioSituacaoDTO() {
        if (usuarioSituacaoDTO == null) {
            usuarioSituacaoDTO = new ArrayList<UsuarioSituacaoDTO>();
        }
        return this.usuarioSituacaoDTO;
    }

}
