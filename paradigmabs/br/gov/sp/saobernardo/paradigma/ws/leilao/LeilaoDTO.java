
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 * <p>Java class for LeilaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeilaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlChatBilateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlFaseAnalise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlMostraParticipante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlProrroga" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRestrita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dVlVariacaoMax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlVariacaoMin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstLeilaoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoItemDTO"/>
 *         &lt;element name="lstLeilaoParticipanteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoParticipanteDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdApuracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdEstilo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdLeilao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdTipoNegociacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdVariacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nVlProrroga" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlProrrogaCondicao" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaRequisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdLeilaoErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdLeilaoWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsLeilao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeilaoDTO", propOrder = {
    "bFlChatBilateral",
    "bFlFaseAnalise",
    "bFlMostraParticipante",
    "bFlProrroga",
    "bFlRestrita",
    "bFlTermo",
    "dVlVariacaoMax",
    "dVlVariacaoMin",
    "lstLeilaoItemDTO",
    "lstLeilaoParticipanteDTO",
    "nCdSituacao",
    "nIdApuracao",
    "nIdEstilo",
    "nIdLeilao",
    "nIdTipoNegociacao",
    "nIdVariacao",
    "nVlProrroga",
    "nVlProrrogaCondicao",
    "sCdCondicaoPagamento",
    "sCdEmpresa",
    "sCdEmpresaRequisicao",
    "sCdFrete",
    "sCdLeilaoErp",
    "sCdLeilaoWbc",
    "sCdMoeda",
    "sCdUsuario",
    "sDsLeilao",
    "sDsTermo",
    "tDtCadastro",
    "tDtFinal",
    "tDtInicial"
})
public class LeilaoDTO
    extends DtoBase
{

    protected int bFlChatBilateral;
    protected int bFlFaseAnalise;
    protected int bFlMostraParticipante;
    protected int bFlProrroga;
    protected int bFlRestrita;
    protected int bFlTermo;
    @XmlElement(required = true)
    protected BigDecimal dVlVariacaoMax;
    @XmlElement(required = true)
    protected BigDecimal dVlVariacaoMin;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLeilaoItemDTO lstLeilaoItemDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLeilaoParticipanteDTO lstLeilaoParticipanteDTO;
    protected long nCdSituacao;
    protected int nIdApuracao;
    protected int nIdEstilo;
    protected int nIdLeilao;
    protected int nIdTipoNegociacao;
    protected int nIdVariacao;
    @XmlElement(required = true)
    protected BigDecimal nVlProrroga;
    @XmlElement(required = true)
    protected BigDecimal nVlProrrogaCondicao;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdEmpresaRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaRequisicao;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElementRef(name = "sCdLeilaoErp", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdLeilaoErp;
    @XmlElementRef(name = "sCdLeilaoWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdLeilaoWbc;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsLeilao;
    @XmlElementRef(name = "sDsTermo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsTermo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicial;

    /**
     * Gets the value of the bFlChatBilateral property.
     * 
     */
    public int getBFlChatBilateral() {
        return bFlChatBilateral;
    }

    /**
     * Sets the value of the bFlChatBilateral property.
     * 
     */
    public void setBFlChatBilateral(int value) {
        this.bFlChatBilateral = value;
    }

    /**
     * Gets the value of the bFlFaseAnalise property.
     * 
     */
    public int getBFlFaseAnalise() {
        return bFlFaseAnalise;
    }

    /**
     * Sets the value of the bFlFaseAnalise property.
     * 
     */
    public void setBFlFaseAnalise(int value) {
        this.bFlFaseAnalise = value;
    }

    /**
     * Gets the value of the bFlMostraParticipante property.
     * 
     */
    public int getBFlMostraParticipante() {
        return bFlMostraParticipante;
    }

    /**
     * Sets the value of the bFlMostraParticipante property.
     * 
     */
    public void setBFlMostraParticipante(int value) {
        this.bFlMostraParticipante = value;
    }

    /**
     * Gets the value of the bFlProrroga property.
     * 
     */
    public int getBFlProrroga() {
        return bFlProrroga;
    }

    /**
     * Sets the value of the bFlProrroga property.
     * 
     */
    public void setBFlProrroga(int value) {
        this.bFlProrroga = value;
    }

    /**
     * Gets the value of the bFlRestrita property.
     * 
     */
    public int getBFlRestrita() {
        return bFlRestrita;
    }

    /**
     * Sets the value of the bFlRestrita property.
     * 
     */
    public void setBFlRestrita(int value) {
        this.bFlRestrita = value;
    }

    /**
     * Gets the value of the bFlTermo property.
     * 
     */
    public int getBFlTermo() {
        return bFlTermo;
    }

    /**
     * Sets the value of the bFlTermo property.
     * 
     */
    public void setBFlTermo(int value) {
        this.bFlTermo = value;
    }

    /**
     * Gets the value of the dVlVariacaoMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlVariacaoMax() {
        return dVlVariacaoMax;
    }

    /**
     * Sets the value of the dVlVariacaoMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlVariacaoMax(BigDecimal value) {
        this.dVlVariacaoMax = value;
    }

    /**
     * Gets the value of the dVlVariacaoMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlVariacaoMin() {
        return dVlVariacaoMin;
    }

    /**
     * Sets the value of the dVlVariacaoMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlVariacaoMin(BigDecimal value) {
        this.dVlVariacaoMin = value;
    }

    /**
     * Gets the value of the lstLeilaoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeilaoItemDTO }
     *     
     */
    public ArrayOfLeilaoItemDTO getLstLeilaoItemDTO() {
        return lstLeilaoItemDTO;
    }

    /**
     * Sets the value of the lstLeilaoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeilaoItemDTO }
     *     
     */
    public void setLstLeilaoItemDTO(ArrayOfLeilaoItemDTO value) {
        this.lstLeilaoItemDTO = value;
    }

    /**
     * Gets the value of the lstLeilaoParticipanteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeilaoParticipanteDTO }
     *     
     */
    public ArrayOfLeilaoParticipanteDTO getLstLeilaoParticipanteDTO() {
        return lstLeilaoParticipanteDTO;
    }

    /**
     * Sets the value of the lstLeilaoParticipanteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeilaoParticipanteDTO }
     *     
     */
    public void setLstLeilaoParticipanteDTO(ArrayOfLeilaoParticipanteDTO value) {
        this.lstLeilaoParticipanteDTO = value;
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
     * Gets the value of the nIdApuracao property.
     * 
     */
    public int getNIdApuracao() {
        return nIdApuracao;
    }

    /**
     * Sets the value of the nIdApuracao property.
     * 
     */
    public void setNIdApuracao(int value) {
        this.nIdApuracao = value;
    }

    /**
     * Gets the value of the nIdEstilo property.
     * 
     */
    public int getNIdEstilo() {
        return nIdEstilo;
    }

    /**
     * Sets the value of the nIdEstilo property.
     * 
     */
    public void setNIdEstilo(int value) {
        this.nIdEstilo = value;
    }

    /**
     * Gets the value of the nIdLeilao property.
     * 
     */
    public int getNIdLeilao() {
        return nIdLeilao;
    }

    /**
     * Sets the value of the nIdLeilao property.
     * 
     */
    public void setNIdLeilao(int value) {
        this.nIdLeilao = value;
    }

    /**
     * Gets the value of the nIdTipoNegociacao property.
     * 
     */
    public int getNIdTipoNegociacao() {
        return nIdTipoNegociacao;
    }

    /**
     * Sets the value of the nIdTipoNegociacao property.
     * 
     */
    public void setNIdTipoNegociacao(int value) {
        this.nIdTipoNegociacao = value;
    }

    /**
     * Gets the value of the nIdVariacao property.
     * 
     */
    public int getNIdVariacao() {
        return nIdVariacao;
    }

    /**
     * Sets the value of the nIdVariacao property.
     * 
     */
    public void setNIdVariacao(int value) {
        this.nIdVariacao = value;
    }

    /**
     * Gets the value of the nVlProrroga property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlProrroga() {
        return nVlProrroga;
    }

    /**
     * Sets the value of the nVlProrroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlProrroga(BigDecimal value) {
        this.nVlProrroga = value;
    }

    /**
     * Gets the value of the nVlProrrogaCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlProrrogaCondicao() {
        return nVlProrrogaCondicao;
    }

    /**
     * Sets the value of the nVlProrrogaCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlProrrogaCondicao(BigDecimal value) {
        this.nVlProrrogaCondicao = value;
    }

    /**
     * Gets the value of the sCdCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCondicaoPagamento() {
        return sCdCondicaoPagamento;
    }

    /**
     * Sets the value of the sCdCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCondicaoPagamento(String value) {
        this.sCdCondicaoPagamento = value;
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
     * Gets the value of the sCdEmpresaRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaRequisicao() {
        return sCdEmpresaRequisicao;
    }

    /**
     * Sets the value of the sCdEmpresaRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaRequisicao(JAXBElement<String> value) {
        this.sCdEmpresaRequisicao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdFrete() {
        return sCdFrete;
    }

    /**
     * Sets the value of the sCdFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdFrete(String value) {
        this.sCdFrete = value;
    }

    /**
     * Gets the value of the sCdLeilaoErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdLeilaoErp() {
        return sCdLeilaoErp;
    }

    /**
     * Sets the value of the sCdLeilaoErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdLeilaoErp(JAXBElement<String> value) {
        this.sCdLeilaoErp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdLeilaoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdLeilaoWbc() {
        return sCdLeilaoWbc;
    }

    /**
     * Sets the value of the sCdLeilaoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdLeilaoWbc(JAXBElement<String> value) {
        this.sCdLeilaoWbc = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsLeilao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsLeilao() {
        return sDsLeilao;
    }

    /**
     * Sets the value of the sDsLeilao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsLeilao(String value) {
        this.sDsLeilao = value;
    }

    /**
     * Gets the value of the sDsTermo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsTermo() {
        return sDsTermo;
    }

    /**
     * Sets the value of the sDsTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsTermo(JAXBElement<String> value) {
        this.sDsTermo = ((JAXBElement<String> ) value);
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

}
