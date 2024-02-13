
package br.gov.sp.saobernardo.paradigma.ws.wfatividade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WfAtividadeAprovacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WfAtividadeAprovacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdAtividade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdObjeto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdChaveObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsAssunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfAtividadeAprovacaoDTO", propOrder = {
    "nCdAtividade",
    "nCdObjeto",
    "sCdChaveObjeto",
    "sCdUsuario",
    "sDsAssunto",
    "tDtCadastro"
})
public class WfAtividadeAprovacaoDTO
    extends DtoBase
{

    protected long nCdAtividade;
    protected long nCdObjeto;
    @XmlElement(required = true, nillable = true)
    protected String sCdChaveObjeto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsAssunto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;

    /**
     * Gets the value of the nCdAtividade property.
     * 
     */
    public long getNCdAtividade() {
        return nCdAtividade;
    }

    /**
     * Sets the value of the nCdAtividade property.
     * 
     */
    public void setNCdAtividade(long value) {
        this.nCdAtividade = value;
    }

    /**
     * Gets the value of the nCdObjeto property.
     * 
     */
    public long getNCdObjeto() {
        return nCdObjeto;
    }

    /**
     * Sets the value of the nCdObjeto property.
     * 
     */
    public void setNCdObjeto(long value) {
        this.nCdObjeto = value;
    }

    /**
     * Gets the value of the sCdChaveObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdChaveObjeto() {
        return sCdChaveObjeto;
    }

    /**
     * Sets the value of the sCdChaveObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdChaveObjeto(String value) {
        this.sCdChaveObjeto = value;
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

    /**
     * Gets the value of the sDsAssunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsAssunto() {
        return sDsAssunto;
    }

    /**
     * Sets the value of the sDsAssunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsAssunto(String value) {
        this.sDsAssunto = value;
    }

    /**
     * Gets the value of the tDtCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCadastro() {
        return tDtCadastro;
    }

    /**
     * Sets the value of the tDtCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCadastro(XMLGregorianCalendar value) {
        this.tDtCadastro = value;
    }

}
