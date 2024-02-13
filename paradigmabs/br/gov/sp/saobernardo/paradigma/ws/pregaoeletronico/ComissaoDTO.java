
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComissaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComissaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nIdPerfil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComissaoDTO", propOrder = {
    "nIdPerfil",
    "sCdUsuario"
})
public class ComissaoDTO
    extends DtoBase
{

    protected int nIdPerfil;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;

    /**
     * Gets the value of the nIdPerfil property.
     * 
     */
    public int getNIdPerfil() {
        return nIdPerfil;
    }

    /**
     * Sets the value of the nIdPerfil property.
     * 
     */
    public void setNIdPerfil(int value) {
        this.nIdPerfil = value;
    }

    /**
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuario(String value) {
        this.sCdUsuario = value;
    }

}
