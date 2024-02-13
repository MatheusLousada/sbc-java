
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DadosContabeisDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosContabeisDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlacaoContabil" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdOperacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsAcaoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsGestaoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsGestaoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUgDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUgOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDtExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtFato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosContabeisDTO", propOrder = {
    "dVlacaoContabil",
    "nCdOperacao",
    "sCdCategoria",
    "sDsAcaoContabil",
    "sDsGestaoDestino",
    "sDsGestaoOrigem",
    "sDsUgDestino",
    "sDsUgOrigem",
    "sDtExercicio",
    "tDtFato"
})
public class DadosContabeisDTO
    extends DtoBase
{

    protected BigDecimal dVlacaoContabil;
    protected Long nCdOperacao;
    @XmlElementRef(name = "sCdCategoria", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCategoria;
    @XmlElementRef(name = "sDsAcaoContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsAcaoContabil;
    @XmlElementRef(name = "sDsGestaoDestino", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGestaoDestino;
    @XmlElementRef(name = "sDsGestaoOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGestaoOrigem;
    @XmlElementRef(name = "sDsUgDestino", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUgDestino;
    @XmlElementRef(name = "sDsUgOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUgOrigem;
    @XmlElementRef(name = "sDtExercicio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDtExercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFato;

    /**
     * Gets the value of the dVlacaoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlacaoContabil() {
        return dVlacaoContabil;
    }

    /**
     * Sets the value of the dVlacaoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlacaoContabil(BigDecimal value) {
        this.dVlacaoContabil = value;
    }

    /**
     * Gets the value of the nCdOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdOperacao() {
        return nCdOperacao;
    }

    /**
     * Sets the value of the nCdOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdOperacao(Long value) {
        this.nCdOperacao = value;
    }

    /**
     * Gets the value of the sCdCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCategoria() {
        return sCdCategoria;
    }

    /**
     * Sets the value of the sCdCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCategoria(JAXBElement<String> value) {
        this.sCdCategoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsAcaoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsAcaoContabil() {
        return sDsAcaoContabil;
    }

    /**
     * Sets the value of the sDsAcaoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsAcaoContabil(JAXBElement<String> value) {
        this.sDsAcaoContabil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsGestaoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGestaoDestino() {
        return sDsGestaoDestino;
    }

    /**
     * Sets the value of the sDsGestaoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGestaoDestino(JAXBElement<String> value) {
        this.sDsGestaoDestino = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsGestaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGestaoOrigem() {
        return sDsGestaoOrigem;
    }

    /**
     * Sets the value of the sDsGestaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGestaoOrigem(JAXBElement<String> value) {
        this.sDsGestaoOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsUgDestino property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsUgDestino() {
        return sDsUgDestino;
    }

    /**
     * Sets the value of the sDsUgDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsUgDestino(JAXBElement<String> value) {
        this.sDsUgDestino = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsUgOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsUgOrigem() {
        return sDsUgOrigem;
    }

    /**
     * Sets the value of the sDsUgOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsUgOrigem(JAXBElement<String> value) {
        this.sDsUgOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDtExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDtExercicio() {
        return sDtExercicio;
    }

    /**
     * Sets the value of the sDtExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDtExercicio(JAXBElement<String> value) {
        this.sDtExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtFato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFato() {
        return tDtFato;
    }

    /**
     * Sets the value of the tDtFato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFato(XMLGregorianCalendar value) {
        this.tDtFato = value;
    }

}
