
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PregaoEletronicoPropostaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregaoEletronicoPropostaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dQtProposta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlProposta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PregaoEletronicoPropostaDTO", propOrder = {
    "bFlVencedor",
    "dQtProposta",
    "dVlProposta",
    "sCdEmpresa",
    "sDsJustificativa",
    "sDsMarca",
    "sDsObservacao",
    "tDtProposta"
})
public class PregaoEletronicoPropostaDTO
    extends DtoBase
{

    protected Integer bFlVencedor;
    protected BigDecimal dQtProposta;
    protected BigDecimal dVlProposta;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sDsJustificativa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsJustificativa;
    @XmlElementRef(name = "sDsMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMarca;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtProposta;

    /**
     * Gets the value of the bFlVencedor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlVencedor(Integer value) {
        this.bFlVencedor = value;
    }

    /**
     * Gets the value of the dQtProposta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtProposta() {
        return dQtProposta;
    }

    /**
     * Sets the value of the dQtProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtProposta(BigDecimal value) {
        this.dQtProposta = value;
    }

    /**
     * Gets the value of the dVlProposta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlProposta() {
        return dVlProposta;
    }

    /**
     * Sets the value of the dVlProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlProposta(BigDecimal value) {
        this.dVlProposta = value;
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
     * Gets the value of the sDsMarca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMarca() {
        return sDsMarca;
    }

    /**
     * Sets the value of the sDsMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMarca(JAXBElement<String> value) {
        this.sDsMarca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacao(JAXBElement<String> value) {
        this.sDsObservacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtProposta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtProposta() {
        return tDtProposta;
    }

    /**
     * Sets the value of the tDtProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtProposta(XMLGregorianCalendar value) {
        this.tDtProposta = value;
    }

}
