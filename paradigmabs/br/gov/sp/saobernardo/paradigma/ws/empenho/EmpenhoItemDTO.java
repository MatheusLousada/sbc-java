
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpenhoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpenhoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nIdTipoRegistro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpenhoItemDTO", propOrder = {
    "nIdTipoRegistro",
    "sCdNaturezaDespesa",
    "tDtAtualizacao"
})
public class EmpenhoItemDTO
    extends DtoBase
{

    @XmlElementRef(name = "nIdTipoRegistro", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoRegistro;
    @XmlElementRef(name = "sCdNaturezaDespesa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNaturezaDespesa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAtualizacao;

    /**
     * Gets the value of the nIdTipoRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoRegistro() {
        return nIdTipoRegistro;
    }

    /**
     * Sets the value of the nIdTipoRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoRegistro(JAXBElement<Integer> value) {
        this.nIdTipoRegistro = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNaturezaDespesa() {
        return sCdNaturezaDespesa;
    }

    /**
     * Sets the value of the sCdNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNaturezaDespesa(JAXBElement<String> value) {
        this.sCdNaturezaDespesa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAtualizacao() {
        return tDtAtualizacao;
    }

    /**
     * Sets the value of the tDtAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAtualizacao(XMLGregorianCalendar value) {
        this.tDtAtualizacao = value;
    }

}
