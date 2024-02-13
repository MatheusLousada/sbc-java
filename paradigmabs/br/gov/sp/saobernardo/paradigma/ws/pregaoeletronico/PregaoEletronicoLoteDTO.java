
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PregaoEletronicoLoteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregaoEletronicoLoteDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstPregaoEletronicoLoteLanceDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoLoteLanceDTO" minOccurs="0"/>
 *         &lt;element name="nCdLoteSequencial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nStLote" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdLoteLegado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsLote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PregaoEletronicoLoteDTO", propOrder = {
    "dVlReferencia",
    "lstPregaoEletronicoLoteLanceDTO",
    "nCdLoteSequencial",
    "nStLote",
    "sCdLoteLegado",
    "sDsLote"
})
public class PregaoEletronicoLoteDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlReferencia;
    @XmlElementRef(name = "lstPregaoEletronicoLoteLanceDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> lstPregaoEletronicoLoteLanceDTO;
    protected int nCdLoteSequencial;
    protected int nStLote;
    @XmlElement(required = true, nillable = true)
    protected String sCdLoteLegado;
    @XmlElement(required = true, nillable = true)
    protected String sDsLote;

    /**
     * Gets the value of the dVlReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlReferencia() {
        return dVlReferencia;
    }

    /**
     * Sets the value of the dVlReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlReferencia(BigDecimal value) {
        this.dVlReferencia = value;
    }

    /**
     * Gets the value of the lstPregaoEletronicoLoteLanceDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteLanceDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> getLstPregaoEletronicoLoteLanceDTO() {
        return lstPregaoEletronicoLoteLanceDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoLoteLanceDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteLanceDTO }{@code >}
     *     
     */
    public void setLstPregaoEletronicoLoteLanceDTO(JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> value) {
        this.lstPregaoEletronicoLoteLanceDTO = ((JAXBElement<ArrayOfPregaoEletronicoLoteLanceDTO> ) value);
    }

    /**
     * Gets the value of the nCdLoteSequencial property.
     * 
     */
    public int getNCdLoteSequencial() {
        return nCdLoteSequencial;
    }

    /**
     * Sets the value of the nCdLoteSequencial property.
     * 
     */
    public void setNCdLoteSequencial(int value) {
        this.nCdLoteSequencial = value;
    }

    /**
     * Gets the value of the nStLote property.
     * 
     */
    public int getNStLote() {
        return nStLote;
    }

    /**
     * Sets the value of the nStLote property.
     * 
     */
    public void setNStLote(int value) {
        this.nStLote = value;
    }

    /**
     * Gets the value of the sCdLoteLegado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdLoteLegado() {
        return sCdLoteLegado;
    }

    /**
     * Sets the value of the sCdLoteLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdLoteLegado(String value) {
        this.sCdLoteLegado = value;
    }

    /**
     * Gets the value of the sDsLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsLote() {
        return sDsLote;
    }

    /**
     * Sets the value of the sDsLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsLote(String value) {
        this.sDsLote = value;
    }

}
