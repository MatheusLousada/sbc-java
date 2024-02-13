
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CotacaoMoedaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoMoedaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlIndice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nNrCasasDecimais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtCotacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoMoedaDTO", propOrder = {
    "bFlAtivo",
    "dVlIndice",
    "nCdSituacao",
    "nNrCasasDecimais",
    "sCdMoeda",
    "tDtCotacao"
})
public class CotacaoMoedaDTO
    extends DtoBase
{

    protected Integer bFlAtivo;
    protected BigDecimal dVlIndice;
    protected Long nCdSituacao;
    protected Integer nNrCasasDecimais;
    @XmlElementRef(name = "sCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoeda;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCotacao;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlAtivo(Integer value) {
        this.bFlAtivo = value;
    }

    /**
     * Gets the value of the dVlIndice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlIndice() {
        return dVlIndice;
    }

    /**
     * Sets the value of the dVlIndice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlIndice(BigDecimal value) {
        this.dVlIndice = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdSituacao(Long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nNrCasasDecimais property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNNrCasasDecimais() {
        return nNrCasasDecimais;
    }

    /**
     * Sets the value of the nNrCasasDecimais property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNNrCasasDecimais(Integer value) {
        this.nNrCasasDecimais = value;
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoeda(JAXBElement<String> value) {
        this.sCdMoeda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCotacao() {
        return tDtCotacao;
    }

    /**
     * Sets the value of the tDtCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCotacao(XMLGregorianCalendar value) {
        this.tDtCotacao = value;
    }

}
