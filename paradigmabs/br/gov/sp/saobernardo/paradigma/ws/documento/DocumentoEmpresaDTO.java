
package br.gov.sp.saobernardo.paradigma.ws.documento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentoEmpresaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoEmpresaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstDocumentoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDocumentoDTO" minOccurs="0"/>
 *         &lt;element name="lstDocumentoFuncionarioDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaContatoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaContatoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaContatoDTO" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoEmpresaDTO", propOrder = {
    "lstDocumentoDTO",
    "lstDocumentoFuncionarioDTO",
    "lstEmpresaContatoDTO",
    "nCdSituacao",
    "sCdEmpresa"
})
public class DocumentoEmpresaDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstDocumentoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocumentoDTO> lstDocumentoDTO;
    @XmlElementRef(name = "lstDocumentoFuncionarioDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaContatoDTO> lstDocumentoFuncionarioDTO;
    @XmlElementRef(name = "lstEmpresaContatoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaContatoDTO> lstEmpresaContatoDTO;
    protected long nCdSituacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;

    /**
     * Gets the value of the lstDocumentoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentoDTO> getLstDocumentoDTO() {
        return lstDocumentoDTO;
    }

    /**
     * Sets the value of the lstDocumentoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}
     *     
     */
    public void setLstDocumentoDTO(JAXBElement<ArrayOfDocumentoDTO> value) {
        this.lstDocumentoDTO = ((JAXBElement<ArrayOfDocumentoDTO> ) value);
    }

    /**
     * Gets the value of the lstDocumentoFuncionarioDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaContatoDTO> getLstDocumentoFuncionarioDTO() {
        return lstDocumentoFuncionarioDTO;
    }

    /**
     * Sets the value of the lstDocumentoFuncionarioDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public void setLstDocumentoFuncionarioDTO(JAXBElement<ArrayOfEmpresaContatoDTO> value) {
        this.lstDocumentoFuncionarioDTO = ((JAXBElement<ArrayOfEmpresaContatoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaContatoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaContatoDTO> getLstEmpresaContatoDTO() {
        return lstEmpresaContatoDTO;
    }

    /**
     * Sets the value of the lstEmpresaContatoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public void setLstEmpresaContatoDTO(JAXBElement<ArrayOfEmpresaContatoDTO> value) {
        this.lstEmpresaContatoDTO = ((JAXBElement<ArrayOfEmpresaContatoDTO> ) value);
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     */
    public long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     */
    public void setNCdSituacao(long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

}
