
package br.gov.sp.saobernardo.paradigma.ws.documento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlIsento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdDocumentoWBC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtVencimentoFatorExterno" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoDTO", propOrder = {
    "bFlAtivo",
    "bFlIsento",
    "sCdDocumentoWBC",
    "tDtVencimento",
    "tDtVencimentoFatorExterno"
})
public class DocumentoDTO
    extends DtoBase
{

    protected int bFlAtivo;
    protected int bFlIsento;
    @XmlElement(required = true, nillable = true)
    protected String sCdDocumentoWBC;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtVencimento;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtVencimentoFatorExterno;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     */
    public int getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     */
    public void setBFlAtivo(int value) {
        this.bFlAtivo = value;
    }

    /**
     * Gets the value of the bFlIsento property.
     * 
     */
    public int getBFlIsento() {
        return bFlIsento;
    }

    /**
     * Sets the value of the bFlIsento property.
     * 
     */
    public void setBFlIsento(int value) {
        this.bFlIsento = value;
    }

    /**
     * Gets the value of the sCdDocumentoWBC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdDocumentoWBC() {
        return sCdDocumentoWBC;
    }

    /**
     * Sets the value of the sCdDocumentoWBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdDocumentoWBC(String value) {
        this.sCdDocumentoWBC = value;
    }

    /**
     * Gets the value of the tDtVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtVencimento() {
        return tDtVencimento;
    }

    /**
     * Sets the value of the tDtVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtVencimento(XMLGregorianCalendar value) {
        this.tDtVencimento = value;
    }

    /**
     * Gets the value of the tDtVencimentoFatorExterno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtVencimentoFatorExterno() {
        return tDtVencimentoFatorExterno;
    }

    /**
     * Sets the value of the tDtVencimentoFatorExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtVencimentoFatorExterno(XMLGregorianCalendar value) {
        this.tDtVencimentoFatorExterno = value;
    }

}
