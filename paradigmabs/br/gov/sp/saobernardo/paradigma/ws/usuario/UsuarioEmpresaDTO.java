
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsuarioEmpresaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioEmpresaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioEmpresaDTO", propOrder = {
    "sCdEmpresa"
})
public class UsuarioEmpresaDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

}
