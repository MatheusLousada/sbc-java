
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WfAlcadaUsuarioPesquisaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WfAlcadaUsuarioPesquisaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstCdAlcada" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/>
 *         &lt;element name="lstCdUsuarioAprovador" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="lstVlAtributo" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="nCdObjeto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfAlcadaUsuarioPesquisaDTO", propOrder = {
    "dVlAlcadaFinal",
    "dVlAlcadaInicial",
    "lstCdAlcada",
    "lstCdUsuarioAprovador",
    "lstVlAtributo",
    "nCdObjeto",
    "sCdEmpresa"
})
public class WfAlcadaUsuarioPesquisaDTO
    extends DtoBase
{

    @XmlElementRef(name = "dVlAlcadaFinal", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlAlcadaFinal;
    @XmlElementRef(name = "dVlAlcadaInicial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlAlcadaInicial;
    @XmlElementRef(name = "lstCdAlcada", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNullableOflong> lstCdAlcada;
    @XmlElementRef(name = "lstCdUsuarioAprovador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> lstCdUsuarioAprovador;
    @XmlElementRef(name = "lstVlAtributo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> lstVlAtributo;
    @XmlElementRef(name = "nCdObjeto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdObjeto;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;

    /**
     * Gets the value of the dVlAlcadaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlAlcadaFinal() {
        return dVlAlcadaFinal;
    }

    /**
     * Sets the value of the dVlAlcadaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlAlcadaFinal(JAXBElement<BigDecimal> value) {
        this.dVlAlcadaFinal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dVlAlcadaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlAlcadaInicial() {
        return dVlAlcadaInicial;
    }

    /**
     * Sets the value of the dVlAlcadaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlAlcadaInicial(JAXBElement<BigDecimal> value) {
        this.dVlAlcadaInicial = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the lstCdAlcada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOflong> getLstCdAlcada() {
        return lstCdAlcada;
    }

    /**
     * Sets the value of the lstCdAlcada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     *     
     */
    public void setLstCdAlcada(JAXBElement<ArrayOfNullableOflong> value) {
        this.lstCdAlcada = ((JAXBElement<ArrayOfNullableOflong> ) value);
    }

    /**
     * Gets the value of the lstCdUsuarioAprovador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLstCdUsuarioAprovador() {
        return lstCdUsuarioAprovador;
    }

    /**
     * Sets the value of the lstCdUsuarioAprovador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLstCdUsuarioAprovador(JAXBElement<ArrayOfstring> value) {
        this.lstCdUsuarioAprovador = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the lstVlAtributo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLstVlAtributo() {
        return lstVlAtributo;
    }

    /**
     * Sets the value of the lstVlAtributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLstVlAtributo(JAXBElement<ArrayOfstring> value) {
        this.lstVlAtributo = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the nCdObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdObjeto() {
        return nCdObjeto;
    }

    /**
     * Sets the value of the nCdObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdObjeto(JAXBElement<Long> value) {
        this.nCdObjeto = ((JAXBElement<Long> ) value);
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

}
