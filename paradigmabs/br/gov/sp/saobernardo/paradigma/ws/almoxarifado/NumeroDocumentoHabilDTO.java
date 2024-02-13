
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumeroDocumentoHabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumeroDocumentoHabilDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nAnoExercicio" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nCdDocumentoOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdDocumentoHabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeGestora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroDocumentoHabilDTO", propOrder = {
    "nAnoExercicio",
    "nCdDocumentoOrigem",
    "sCdDocumentoHabil",
    "sCdGestao",
    "sCdTipoDocumento",
    "sCdUnidadeGestora"
})
public class NumeroDocumentoHabilDTO
    extends DtoBase
{

    protected Short nAnoExercicio;
    protected Long nCdDocumentoOrigem;
    @XmlElementRef(name = "sCdDocumentoHabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDocumentoHabil;
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElementRef(name = "sCdTipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdTipoDocumento;
    @XmlElementRef(name = "sCdUnidadeGestora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeGestora;

    /**
     * Gets the value of the nAnoExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNAnoExercicio() {
        return nAnoExercicio;
    }

    /**
     * Sets the value of the nAnoExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNAnoExercicio(Short value) {
        this.nAnoExercicio = value;
    }

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
     * Gets the value of the sCdUnidadeGestora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeGestora() {
        return sCdUnidadeGestora;
    }

    /**
     * Sets the value of the sCdUnidadeGestora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeGestora(JAXBElement<String> value) {
        this.sCdUnidadeGestora = ((JAXBElement<String> ) value);
    }

}
