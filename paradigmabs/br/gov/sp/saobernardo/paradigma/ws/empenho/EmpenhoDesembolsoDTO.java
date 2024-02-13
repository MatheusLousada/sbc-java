
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpenhoDesembolsoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpenhoDesembolsoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlAtualizado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlOriginal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdEmpenho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrExercicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrMes" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpenhoDesembolsoDTO", propOrder = {
    "dVlAtualizado",
    "dVlOriginal",
    "nCdEmpenho",
    "nNrExercicio",
    "nNrMes"
})
public class EmpenhoDesembolsoDTO
    extends DtoBase
{

    @XmlElementRef(name = "dVlAtualizado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlAtualizado;
    @XmlElement(required = true)
    protected BigDecimal dVlOriginal;
    protected int nCdEmpenho;
    protected int nNrExercicio;
    protected short nNrMes;

    /**
     * Gets the value of the dVlAtualizado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlAtualizado() {
        return dVlAtualizado;
    }

    /**
     * Sets the value of the dVlAtualizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlAtualizado(JAXBElement<BigDecimal> value) {
        this.dVlAtualizado = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dVlOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlOriginal() {
        return dVlOriginal;
    }

    /**
     * Sets the value of the dVlOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlOriginal(BigDecimal value) {
        this.dVlOriginal = value;
    }

    /**
     * Gets the value of the nCdEmpenho property.
     * 
     */
    public int getNCdEmpenho() {
        return nCdEmpenho;
    }

    /**
     * Sets the value of the nCdEmpenho property.
     * 
     */
    public void setNCdEmpenho(int value) {
        this.nCdEmpenho = value;
    }

    /**
     * Gets the value of the nNrExercicio property.
     * 
     */
    public int getNNrExercicio() {
        return nNrExercicio;
    }

    /**
     * Sets the value of the nNrExercicio property.
     * 
     */
    public void setNNrExercicio(int value) {
        this.nNrExercicio = value;
    }

    /**
     * Gets the value of the nNrMes property.
     * 
     */
    public short getNNrMes() {
        return nNrMes;
    }

    /**
     * Sets the value of the nNrMes property.
     * 
     */
    public void setNNrMes(short value) {
        this.nNrMes = value;
    }

}
