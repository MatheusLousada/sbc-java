
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DadosContabeisAlmoxarifadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosContabeisAlmoxarifadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlAcaoContabil" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdKardex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsAcaoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsGestaoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUgOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sVlAnoExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DadosContabeisAlmoxarifadoDTO", propOrder = {
    "dVlAcaoContabil",
    "nCdKardex",
    "sCdCategoria",
    "sCdGestao",
    "sDsAcaoContabil",
    "sDsGestaoOrigem",
    "sDsUgOrigem",
    "sVlAnoExercicio",
    "tDtFato"
})
public class DadosContabeisAlmoxarifadoDTO
    extends DtoBase
{

    protected BigDecimal dVlAcaoContabil;
    protected Integer nCdKardex;
    @XmlElementRef(name = "sCdCategoria", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCategoria;
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElementRef(name = "sDsAcaoContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsAcaoContabil;
    @XmlElementRef(name = "sDsGestaoOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGestaoOrigem;
    @XmlElementRef(name = "sDsUgOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUgOrigem;
    @XmlElementRef(name = "sVlAnoExercicio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sVlAnoExercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFato;

    /**
     * Gets the value of the dVlAcaoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAcaoContabil() {
        return dVlAcaoContabil;
    }

    /**
     * Sets the value of the dVlAcaoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAcaoContabil(BigDecimal value) {
        this.dVlAcaoContabil = value;
    }

    /**
     * Gets the value of the nCdKardex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdKardex() {
        return nCdKardex;
    }

    /**
     * Sets the value of the nCdKardex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdKardex(Integer value) {
        this.nCdKardex = value;
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
