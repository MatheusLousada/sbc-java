
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExcluirDocumentoOrigemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcluirDocumentoOrigemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdDocumentoOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdRecDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdDocumentoHabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sVlAnoExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtEstorno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcluirDocumentoOrigemDTO", propOrder = {
    "nCdDocumentoOrigem",
    "nCdRecDocumento",
    "sCdDocumentoHabil",
    "sCdEmpresa",
    "sCdGestao",
    "sCdTipoDocumento",
    "sDsJustificativa",
    "sVlAnoExercicio",
    "tDtEstorno"
})
public class ExcluirDocumentoOrigemDTO
    extends DtoBase
{

    protected Long nCdDocumentoOrigem;
    protected Long nCdRecDocumento;
    @XmlElementRef(name = "sCdDocumentoHabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDocumentoHabil;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElementRef(name = "sCdTipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdTipoDocumento;
    @XmlElementRef(name = "sDsJustificativa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsJustificativa;
    @XmlElementRef(name = "sVlAnoExercicio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sVlAnoExercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEstorno;

    /**
     * Gets the value of the nCdDocumentoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdDocumentoOrigem() {
        return nCdDocumentoOrigem;
    }

    /**
     * Sets the value of the nCdDocumentoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdDocumentoOrigem(Long value) {
        this.nCdDocumentoOrigem = value;
    }

    /**
     * Gets the value of the nCdRecDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdRecDocumento() {
        return nCdRecDocumento;
    }

    /**
     * Sets the value of the nCdRecDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdRecDocumento(Long value) {
        this.nCdRecDocumento = value;
    }

    /**
     * Gets the value of the sCdDocumentoHabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDocumentoHabil() {
        return sCdDocumentoHabil;
    }

    /**
     * Sets the value of the sCdDocumentoHabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDocumentoHabil(JAXBElement<String> value) {
        this.sCdDocumentoHabil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresa(JAXBElement<String> value) {
        this.sCdEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGestao() {
        return sCdGestao;
    }

    /**
     * Sets the value of the sCdGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGestao(JAXBElement<String> value) {
        this.sCdGestao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdTipoDocumento() {
        return sCdTipoDocumento;
    }

    /**
     * Sets the value of the sCdTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdTipoDocumento(JAXBElement<String> value) {
        this.sCdTipoDocumento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsJustificativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsJustificativa() {
        return sDsJustificativa;
    }

    /**
     * Sets the value of the sDsJustificativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsJustificativa(JAXBElement<String> value) {
        this.sDsJustificativa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sVlAnoExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSVlAnoExercicio() {
        return sVlAnoExercicio;
    }

    /**
     * Sets the value of the sVlAnoExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSVlAnoExercicio(JAXBElement<String> value) {
        this.sVlAnoExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEstorno() {
        return tDtEstorno;
    }

    /**
     * Sets the value of the tDtEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEstorno(XMLGregorianCalendar value) {
        this.tDtEstorno = value;
    }

}
