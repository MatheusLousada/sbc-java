
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventarioMovelItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventarioMovelItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtApurada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dQtMovel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdECApuradoMap" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdEstadoConservacaoMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdInventario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdMovel" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrContagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTombamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventarioMovelItemDTO", propOrder = {
    "dQtApurada",
    "dQtMovel",
    "nCdECApuradoMap",
    "nCdEstadoConservacaoMap",
    "nCdInventario",
    "nCdMovel",
    "nNrContagem",
    "sDsObservacao",
    "sNrTombamento"
})
public class InventarioMovelItemDTO
    extends DtoBase
{

    protected BigDecimal dQtApurada;
    protected BigDecimal dQtMovel;
    protected Long nCdECApuradoMap;
    protected Integer nCdEstadoConservacaoMap;
    protected long nCdInventario;
    protected long nCdMovel;
    protected long nNrContagem;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlElementRef(name = "sNrTombamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTombamento;

    /**
     * Gets the value of the dQtApurada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtApurada() {
        return dQtApurada;
    }

    /**
     * Sets the value of the dQtApurada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtApurada(BigDecimal value) {
        this.dQtApurada = value;
    }

    /**
     * Gets the value of the dQtMovel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtMovel() {
        return dQtMovel;
    }

    /**
     * Sets the value of the dQtMovel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtMovel(BigDecimal value) {
        this.dQtMovel = value;
    }

    /**
     * Gets the value of the nCdECApuradoMap property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdECApuradoMap() {
        return nCdECApuradoMap;
    }

    /**
     * Sets the value of the nCdECApuradoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdECApuradoMap(Long value) {
        this.nCdECApuradoMap = value;
    }

    /**
     * Gets the value of the nCdEstadoConservacaoMap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdEstadoConservacaoMap() {
        return nCdEstadoConservacaoMap;
    }

    /**
     * Sets the value of the nCdEstadoConservacaoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdEstadoConservacaoMap(Integer value) {
        this.nCdEstadoConservacaoMap = value;
    }

    /**
     * Gets the value of the nCdInventario property.
     * 
     */
    public long getNCdInventario() {
        return nCdInventario;
    }

    /**
     * Sets the value of the nCdInventario property.
     * 
     */
    public void setNCdInventario(long value) {
        this.nCdInventario = value;
    }

    /**
     * Gets the value of the nCdMovel property.
     * 
     */
    public long getNCdMovel() {
        return nCdMovel;
    }

    /**
     * Sets the value of the nCdMovel property.
     * 
     */
    public void setNCdMovel(long value) {
        this.nCdMovel = value;
    }

    /**
     * Gets the value of the nNrContagem property.
     * 
     */
    public long getNNrContagem() {
        return nNrContagem;
    }

    /**
     * Sets the value of the nNrContagem property.
     * 
     */
    public void setNNrContagem(long value) {
        this.nNrContagem = value;
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
     * Gets the value of the sNrTombamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTombamento() {
        return sNrTombamento;
    }

    /**
     * Sets the value of the sNrTombamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTombamento(JAXBElement<String> value) {
        this.sNrTombamento = ((JAXBElement<String> ) value);
    }

}
