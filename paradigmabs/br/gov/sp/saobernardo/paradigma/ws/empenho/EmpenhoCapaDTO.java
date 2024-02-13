
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpenhoCapaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpenhoCapaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PedidoDTO">
 *       &lt;sequence>
 *         &lt;element name="lstEmpenhoItemCapaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpenhoItemCapaDTO"/>
 *         &lt;element name="nCdSituacaoEmpenho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oEmpenhoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpenhoDTO"/>
 *         &lt;element name="sCdOrdemCompraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpenhoCapaDTO", propOrder = {
    "lstEmpenhoItemCapaDTO",
    "nCdSituacaoEmpenho",
    "oEmpenhoDTO",
    "sCdOrdemCompraEmpresa"
})
public class EmpenhoCapaDTO
    extends PedidoDTO
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfEmpenhoItemCapaDTO lstEmpenhoItemCapaDTO;
    protected Integer nCdSituacaoEmpenho;
    @XmlElement(required = true, nillable = true)
    protected EmpenhoDTO oEmpenhoDTO;
    @XmlElementRef(name = "sCdOrdemCompraEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdOrdemCompraEmpresa;

    /**
     * Gets the value of the lstEmpenhoItemCapaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmpenhoItemCapaDTO }
     *     
     */
    public ArrayOfEmpenhoItemCapaDTO getLstEmpenhoItemCapaDTO() {
        return lstEmpenhoItemCapaDTO;
    }

    /**
     * Sets the value of the lstEmpenhoItemCapaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmpenhoItemCapaDTO }
     *     
     */
    public void setLstEmpenhoItemCapaDTO(ArrayOfEmpenhoItemCapaDTO value) {
        this.lstEmpenhoItemCapaDTO = value;
    }

    /**
     * Gets the value of the nCdSituacaoEmpenho property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdSituacaoEmpenho() {
        return nCdSituacaoEmpenho;
    }

    /**
     * Sets the value of the nCdSituacaoEmpenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdSituacaoEmpenho(Integer value) {
        this.nCdSituacaoEmpenho = value;
    }

    /**
     * Gets the value of the oEmpenhoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link EmpenhoDTO }
     *     
     */
    public EmpenhoDTO getOEmpenhoDTO() {
        return oEmpenhoDTO;
    }

    /**
     * Sets the value of the oEmpenhoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpenhoDTO }
     *     
     */
    public void setOEmpenhoDTO(EmpenhoDTO value) {
        this.oEmpenhoDTO = value;
    }

    /**
     * Gets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdOrdemCompraEmpresa() {
        return sCdOrdemCompraEmpresa;
    }

    /**
     * Sets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdOrdemCompraEmpresa(JAXBElement<String> value) {
        this.sCdOrdemCompraEmpresa = ((JAXBElement<String> ) value);
    }

}
