
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO">
 *       &lt;sequence>
 *         &lt;element name="bFlPrincipal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdEmpresaEndereco" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdEndereco" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nIdTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaEnderecoDTO", propOrder = {
    "bFlPrincipal",
    "nCdEmpresaEndereco",
    "nCdEndereco",
    "nIdTipo",
    "sCdEstado",
    "sCdPais"
})
public class EmpresaEnderecoDTO
    extends EnderecoDTO
{

    protected Integer bFlPrincipal;
    protected Long nCdEmpresaEndereco;
    protected Long nCdEndereco;
    protected Integer nIdTipo;
    @XmlElementRef(name = "sCdEstado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEstado;
    @XmlElementRef(name = "sCdPais", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPais;

    /**
     * Gets the value of the bFlPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlPrincipal() {
        return bFlPrincipal;
    }

    /**
     * Sets the value of the bFlPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlPrincipal(Integer value) {
        this.bFlPrincipal = value;
    }

    /**
     * Gets the value of the nCdEmpresaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdEmpresaEndereco() {
        return nCdEmpresaEndereco;
    }

    /**
     * Sets the value of the nCdEmpresaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdEmpresaEndereco(Long value) {
        this.nCdEmpresaEndereco = value;
    }

    /**
     * Gets the value of the nCdEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdEndereco() {
        return nCdEndereco;
    }

    /**
     * Sets the value of the nCdEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdEndereco(Long value) {
        this.nCdEndereco = value;
    }

    /**
     * Gets the value of the nIdTipo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdTipo() {
        return nIdTipo;
    }

    /**
     * Sets the value of the nIdTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdTipo(Integer value) {
        this.nIdTipo = value;
    }

    /**
     * Gets the value of the sCdEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEstado() {
        return sCdEstado;
    }

    /**
     * Sets the value of the sCdEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEstado(JAXBElement<String> value) {
        this.sCdEstado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPais() {
        return sCdPais;
    }

    /**
     * Sets the value of the sCdPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPais(JAXBElement<String> value) {
        this.sCdPais = ((JAXBElement<String> ) value);
    }

}
