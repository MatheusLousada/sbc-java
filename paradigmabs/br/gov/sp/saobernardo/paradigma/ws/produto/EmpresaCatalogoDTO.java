
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaCatalogoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaCatalogoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdEmpresaCatalogo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaCatalogoDTO", propOrder = {
    "sCdEmpresaCatalogo"
})
public class EmpresaCatalogoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCatalogo;

    /**
     * Gets the value of the sCdEmpresaCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCatalogo() {
        return sCdEmpresaCatalogo;
    }

    /**
     * Sets the value of the sCdEmpresaCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCatalogo(String value) {
        this.sCdEmpresaCatalogo = value;
    }

}
