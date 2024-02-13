
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpresaUnidadeNegocioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaUnidadeNegocioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdSituacaoMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFimValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicioValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaUnidadeNegocioDTO", propOrder = {
    "nCdSituacaoMap",
    "sCdEmpresa",
    "tDtFimValidade",
    "tDtInicioValidade"
})
public class EmpresaUnidadeNegocioDTO
    extends DtoBase
{

    protected int nCdSituacaoMap;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFimValidade;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicioValidade;

    /**
     * Gets the value of the nCdSituacaoMap property.
     * 
     */
    public int getNCdSituacaoMap() {
        return nCdSituacaoMap;
    }

    /**
     * Sets the value of the nCdSituacaoMap property.
     * 
     */
    public void setNCdSituacaoMap(int value) {
        this.nCdSituacaoMap = value;
    }

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

    /**
     * Gets the value of the tDtFimValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFimValidade() {
        return tDtFimValidade;
    }

    /**
     * Sets the value of the tDtFimValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFimValidade(XMLGregorianCalendar value) {
        this.tDtFimValidade = value;
    }

    /**
     * Gets the value of the tDtInicioValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicioValidade() {
        return tDtInicioValidade;
    }

    /**
     * Sets the value of the tDtInicioValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicioValidade(XMLGregorianCalendar value) {
        this.tDtInicioValidade = value;
    }

}
