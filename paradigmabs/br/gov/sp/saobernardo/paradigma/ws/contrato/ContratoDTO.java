
package br.gov.sp.saobernardo.paradigma.ws.contrato;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContratoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContratoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlPrazoIndeterminado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRenovacaoAuto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlContrato" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstContratoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContratoItemDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoOrigem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrDiasAvisoFim" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrDiasAvisoPedido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrDiasAvisoRescisao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrDuracao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContratoErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContratoErpPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContratoWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaContratada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaContratante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNegociacaoWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdTransportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioCriador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioGestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsAuditoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtAssinatuta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtReajuste" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtRescisao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContratoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", propOrder = {
    "bFlPrazoIndeterminado",
    "bFlRenovacaoAuto",
    "dVlContrato",
    "lstContratoItemDTO",
    "nCdSituacao",
    "nCdTipo",
    "nIdTipo",
    "nIdTipoOrigem",
    "nNrDiasAvisoFim",
    "nNrDiasAvisoPedido",
    "nNrDiasAvisoRescisao",
    "nNrDuracao",
    "sCdContrato",
    "sCdContratoErp",
    "sCdContratoErpPai",
    "sCdContratoWbc",
    "sCdDepartamento",
    "sCdEmpresaContratada",
    "sCdEmpresaContratante",
    "sCdMoeda",
    "sCdNegociacaoWbc",
    "sCdTransportadora",
    "sCdUsuario",
    "sCdUsuarioCriador",
    "sCdUsuarioGestor",
    "sDsAuditoria",
    "sDsContrato",
    "sDsObjeto",
    "tDtAssinatuta",
    "tDtCadastro",
    "tDtFinal",
    "tDtInicial",
    "tDtReajuste",
    "tDtRescisao"
})
public class ContratoDTO
    extends DtoBase
{

    protected int bFlPrazoIndeterminado;
    protected Integer bFlRenovacaoAuto;
    @XmlElement(required = true)
    protected BigDecimal dVlContrato;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfContratoItemDTO lstContratoItemDTO;
    protected long nCdSituacao;
    protected long nCdTipo;
    protected Integer nIdTipo;
    protected int nIdTipoOrigem;
    protected long nNrDiasAvisoFim;
    protected long nNrDiasAvisoPedido;
    protected long nNrDiasAvisoRescisao;
    protected long nNrDuracao;
    @XmlElementRef(name = "sCdContrato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContrato;
    @XmlElementRef(name = "sCdContratoErp", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContratoErp;
    @XmlElementRef(name = "sCdContratoErpPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContratoErpPai;
    @XmlElement(required = true, nillable = true)
    protected String sCdContratoWbc;
    @XmlElementRef(name = "sCdDepartamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDepartamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaContratada;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaContratante;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElementRef(name = "sCdNegociacaoWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNegociacaoWbc;
    @XmlElementRef(name = "sCdTransportadora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdTransportadora;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElementRef(name = "sCdUsuarioCriador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioCriador;
    @XmlElementRef(name = "sCdUsuarioGestor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioGestor;
    @XmlElementRef(name = "sDsAuditoria", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsAuditoria;
    @XmlElement(required = true, nillable = true)
    protected String sDsContrato;
    @XmlElement(required = true, nillable = true)
    protected String sDsObjeto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAssinatuta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtReajuste;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtRescisao;

    /**
     * Gets the value of the bFlPrazoIndeterminado property.
     * 
     */
    public int getBFlPrazoIndeterminado() {
        return bFlPrazoIndeterminado;
    }

    /**
     * Sets the value of the bFlPrazoIndeterminado property.
     * 
     */
    public void setBFlPrazoIndeterminado(int value) {
        this.bFlPrazoIndeterminado = value;
    }

    /**
     * Gets the value of the bFlRenovacaoAuto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlRenovacaoAuto() {
        return bFlRenovacaoAuto;
    }

    /**
     * Sets the value of the bFlRenovacaoAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlRenovacaoAuto(Integer value) {
        this.bFlRenovacaoAuto = value;
    }

    /**
     * Gets the value of the dVlContrato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlContrato() {
        return dVlContrato;
    }

    /**
     * Sets the value of the dVlContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlContrato(BigDecimal value) {
        this.dVlContrato = value;
    }

    /**
     * Gets the value of the lstContratoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContratoItemDTO }
     *     
     */
    public ArrayOfContratoItemDTO getLstContratoItemDTO() {
        return lstContratoItemDTO;
    }

    /**
     * Sets the value of the lstContratoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContratoItemDTO }
     *     
     */
    public void setLstContratoItemDTO(ArrayOfContratoItemDTO value) {
        this.lstContratoItemDTO = value;
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
     * Gets the value of the nCdTipo property.
     * 
     */
    public long getNCdTipo() {
        return nCdTipo;
    }

    /**
     * Sets the value of the nCdTipo property.
     * 
     */
    public void setNCdTipo(long value) {
        this.nCdTipo = value;
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
     * Gets the value of the nIdTipoOrigem property.
     * 
     */
    public int getNIdTipoOrigem() {
        return nIdTipoOrigem;
    }

    /**
     * Sets the value of the nIdTipoOrigem property.
     * 
     */
    public void setNIdTipoOrigem(int value) {
        this.nIdTipoOrigem = value;
    }

    /**
     * Gets the value of the nNrDiasAvisoFim property.
     * 
     */
    public long getNNrDiasAvisoFim() {
        return nNrDiasAvisoFim;
    }

    /**
     * Sets the value of the nNrDiasAvisoFim property.
     * 
     */
    public void setNNrDiasAvisoFim(long value) {
        this.nNrDiasAvisoFim = value;
    }

    /**
     * Gets the value of the nNrDiasAvisoPedido property.
     * 
     */
    public long getNNrDiasAvisoPedido() {
        return nNrDiasAvisoPedido;
    }

    /**
     * Sets the value of the nNrDiasAvisoPedido property.
     * 
     */
    public void setNNrDiasAvisoPedido(long value) {
        this.nNrDiasAvisoPedido = value;
    }

    /**
     * Gets the value of the nNrDiasAvisoRescisao property.
     * 
     */
    public long getNNrDiasAvisoRescisao() {
        return nNrDiasAvisoRescisao;
    }

    /**
     * Sets the value of the nNrDiasAvisoRescisao property.
     * 
     */
    public void setNNrDiasAvisoRescisao(long value) {
        this.nNrDiasAvisoRescisao = value;
    }

    /**
     * Gets the value of the nNrDuracao property.
     * 
     */
    public long getNNrDuracao() {
        return nNrDuracao;
    }

    /**
     * Sets the value of the nNrDuracao property.
     * 
     */
    public void setNNrDuracao(long value) {
        this.nNrDuracao = value;
    }

    /**
     * Gets the value of the sCdContrato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContrato() {
        return sCdContrato;
    }

    /**
     * Sets the value of the sCdContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContrato(JAXBElement<String> value) {
        this.sCdContrato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContratoErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContratoErp() {
        return sCdContratoErp;
    }

    /**
     * Sets the value of the sCdContratoErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContratoErp(JAXBElement<String> value) {
        this.sCdContratoErp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContratoErpPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContratoErpPai() {
        return sCdContratoErpPai;
    }

    /**
     * Sets the value of the sCdContratoErpPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContratoErpPai(JAXBElement<String> value) {
        this.sCdContratoErpPai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContratoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContratoWbc() {
        return sCdContratoWbc;
    }

    /**
     * Sets the value of the sCdContratoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContratoWbc(String value) {
        this.sCdContratoWbc = value;
    }

    /**
     * Gets the value of the sCdDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDepartamento() {
        return sCdDepartamento;
    }

    /**
     * Sets the value of the sCdDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDepartamento(JAXBElement<String> value) {
        this.sCdDepartamento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaContratada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaContratada() {
        return sCdEmpresaContratada;
    }

    /**
     * Sets the value of the sCdEmpresaContratada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaContratada(String value) {
        this.sCdEmpresaContratada = value;
    }

    /**
     * Gets the value of the sCdEmpresaContratante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaContratante() {
        return sCdEmpresaContratante;
    }

    /**
     * Sets the value of the sCdEmpresaContratante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaContratante(String value) {
        this.sCdEmpresaContratante = value;
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMoeda(String value) {
        this.sCdMoeda = value;
    }

    /**
     * Gets the value of the sCdNegociacaoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNegociacaoWbc() {
        return sCdNegociacaoWbc;
    }

    /**
     * Sets the value of the sCdNegociacaoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNegociacaoWbc(JAXBElement<String> value) {
        this.sCdNegociacaoWbc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdTransportadora() {
        return sCdTransportadora;
    }

    /**
     * Sets the value of the sCdTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdTransportadora(JAXBElement<String> value) {
        this.sCdTransportadora = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuario(String value) {
        this.sCdUsuario = value;
    }

    /**
     * Gets the value of the sCdUsuarioCriador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioCriador() {
        return sCdUsuarioCriador;
    }

    /**
     * Sets the value of the sCdUsuarioCriador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioCriador(JAXBElement<String> value) {
        this.sCdUsuarioCriador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsuarioGestor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioGestor() {
        return sCdUsuarioGestor;
    }

    /**
     * Sets the value of the sCdUsuarioGestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioGestor(JAXBElement<String> value) {
        this.sCdUsuarioGestor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsAuditoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsAuditoria() {
        return sDsAuditoria;
    }

    /**
     * Sets the value of the sDsAuditoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsAuditoria(JAXBElement<String> value) {
        this.sDsAuditoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsContrato() {
        return sDsContrato;
    }

    /**
     * Sets the value of the sDsContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsContrato(String value) {
        this.sDsContrato = value;
    }

    /**
     * Gets the value of the sDsObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsObjeto() {
        return sDsObjeto;
    }

    /**
     * Sets the value of the sDsObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsObjeto(String value) {
        this.sDsObjeto = value;
    }

    /**
     * Gets the value of the tDtAssinatuta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAssinatuta() {
        return tDtAssinatuta;
    }

    /**
     * Sets the value of the tDtAssinatuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAssinatuta(XMLGregorianCalendar value) {
        this.tDtAssinatuta = value;
    }

    /**
     * Gets the value of the tDtCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCadastro() {
        return tDtCadastro;
    }

    /**
     * Sets the value of the tDtCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCadastro(XMLGregorianCalendar value) {
        this.tDtCadastro = value;
    }

    /**
     * Gets the value of the tDtFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFinal() {
        return tDtFinal;
    }

    /**
     * Sets the value of the tDtFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFinal(XMLGregorianCalendar value) {
        this.tDtFinal = value;
    }

    /**
     * Gets the value of the tDtInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicial() {
        return tDtInicial;
    }

    /**
     * Sets the value of the tDtInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicial(XMLGregorianCalendar value) {
        this.tDtInicial = value;
    }

    /**
     * Gets the value of the tDtReajuste property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtReajuste() {
        return tDtReajuste;
    }

    /**
     * Sets the value of the tDtReajuste property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtReajuste(XMLGregorianCalendar value) {
        this.tDtReajuste = value;
    }

    /**
     * Gets the value of the tDtRescisao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtRescisao() {
        return tDtRescisao;
    }

    /**
     * Sets the value of the tDtRescisao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtRescisao(XMLGregorianCalendar value) {
        this.tDtRescisao = value;
    }

}
