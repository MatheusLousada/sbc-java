
package br.gov.sp.saobernardo.paradigma.ws.fonterecurso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FonteRecursoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FonteRecursoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdFonteRecurso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsFonteRecurso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FonteRecursoDTO", propOrder = {
    "sCdFonteRecurso",
    "sDsFonteRecurso"
})
public class FonteRecursoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdFonteRecurso;
    @XmlElement(required = true, nillable = true)
    protected String sDsFonteRecurso;

    /**
     * Gets the value of the sCdFonteRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdFonteRecurso() {
        return sCdFonteRecurso;
    }

    /**
     * Sets the value of the sCdFonteRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdFonteRecurso(String value) {
        this.sCdFonteRecurso = value;
    }

    /**
     * Gets the value of the sDsFonteRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsFonteRecurso() {
        return sDsFonteRecurso;
    }

    /**
     * Sets the value of the sDsFonteRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsFonteRecurso(String value) {
        this.sDsFonteRecurso = value;
    }

}
