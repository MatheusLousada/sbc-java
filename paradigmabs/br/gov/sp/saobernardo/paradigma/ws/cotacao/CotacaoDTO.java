
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CotacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlPermissaoEmpresaClic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlRestrita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlVisivelClic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lstCotacaoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoItemDTO"/>
 *         &lt;element name="lstCotacaoMoedaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoMoedaDTO" minOccurs="0"/>
 *         &lt;element name="lstCotacaoParticipanteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoParticipanteDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipoNegociacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdCotacaoERP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCotacaoWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCotacaoWbcPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaRequisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsCotacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "CotacaoDTO", propOrder = {
    "bFlPermissaoEmpresaClic",
    "bFlRestrita",
    "bFlTermo",
    "bFlVisivelClic",
    "lstCotacaoItemDTO",
    "lstCotacaoMoedaDTO",
    "lstCotacaoParticipanteDTO",
    "nCdSituacao",
    "nIdTipoNegociacao",
    "sCdCotacaoERP",
    "sCdCotacaoWbc",
    "sCdCotacaoWbcPai",
    "sCdEmpresa",
    "sCdEmpresaRequisicao",
    "sCdFrete",
    "sCdMoeda",
    "sCdUsuario",
    "sDsCotacao",
    "sDsTermo",
    "tDtCadastro",
    "tDtFinal",
    "tDtInicial"
})
public class CotacaoDTO
    extends DtoBase
{

    protected Integer bFlPermissaoEmpresaClic;
    protected int bFlRestrita;
    protected int bFlTermo;
    protected Integer bFlVisivelClic;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoItemDTO lstCotacaoItemDTO;
    protected ArrayOfCotacaoMoedaDTO lstCotacaoMoedaDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoParticipanteDTO lstCotacaoParticipanteDTO;
    protected long nCdSituacao;
    protected int nIdTipoNegociacao;
    protected String sCdCotacaoERP;
    @XmlElementRef(name = "sCdCotacaoWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCotacaoWbc;
    @XmlElementRef(name = "sCdCotacaoWbcPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCotacaoWbcPai;
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdEmpresaRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaRequisicao;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsCotacao;
    protected String sDsTermo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicial;

    /**
     * Gets the value of the bFlPermissaoEmpresaClic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlPermissaoEmpresaClic() {
        return bFlPermissaoEmpresaClic;
    }

    /**
     * Sets the value of the bFlPermissaoEmpresaClic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlPermissaoEmpresaClic(Integer value) {
        this.bFlPermissaoEmpresaClic = value;
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
     * Gets the value of the bFlVisivelClic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlVisivelClic() {
        return bFlVisivelClic;
    }

    /**
     * Sets the value of the bFlVisivelClic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlVisivelClic(Integer value) {
        this.bFlVisivelClic = value;
    }

    /**
     * Gets the value of the lstCotacaoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoItemDTO }
     *     
     */
    public ArrayOfCotacaoItemDTO getLstCotacaoItemDTO() {
        return lstCotacaoItemDTO;
    }

    /**
     * Sets the value of the lstCotacaoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoItemDTO }
     *     
     */
    public void setLstCotacaoItemDTO(ArrayOfCotacaoItemDTO value) {
        this.lstCotacaoItemDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoMoedaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoMoedaDTO }
     *     
     */
    public ArrayOfCotacaoMoedaDTO getLstCotacaoMoedaDTO() {
        return lstCotacaoMoedaDTO;
    }

    /**
     * Sets the value of the lstCotacaoMoedaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoMoedaDTO }
     *     
     */
    public void setLstCotacaoMoedaDTO(ArrayOfCotacaoMoedaDTO value) {
        this.lstCotacaoMoedaDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoParticipanteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoParticipanteDTO }
     *     
     */
    public ArrayOfCotacaoParticipanteDTO getLstCotacaoParticipanteDTO() {
        return lstCotacaoParticipanteDTO;
    }

    /**
     * Sets the value of the lstCotacaoParticipanteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoParticipanteDTO }
     *     
     */
    public void setLstCotacaoParticipanteDTO(ArrayOfCotacaoParticipanteDTO value) {
        this.lstCotacaoParticipanteDTO = value;
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
     * Gets the value of the sCdCotacaoERP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCotacaoERP() {
        return sCdCotacaoERP;
    }

    /**
     * Sets the value of the sCdCotacaoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCotacaoERP(String value) {
        this.sCdCotacaoERP = value;
    }

    /**
     * Gets the value of the sCdCotacaoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCotacaoWbc() {
        return sCdCotacaoWbc;
    }

    /**
     * Sets the value of the sCdCotacaoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCotacaoWbc(JAXBElement<String> value) {
        this.sCdCotacaoWbc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdCotacaoWbcPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCotacaoWbcPai() {
        return sCdCotacaoWbcPai;
    }

    /**
     * Sets the value of the sCdCotacaoWbcPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCotacaoWbcPai(JAXBElement<String> value) {
        this.sCdCotacaoWbcPai = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCotacao() {
        return sDsCotacao;
    }

    /**
     * Sets the value of the sDsCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCotacao(String value) {
        this.sDsCotacao = value;
    }

    /**
     * Gets the value of the sDsTermo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsTermo() {
        return sDsTermo;
    }

    /**
     * Sets the value of the sDsTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsTermo(String value) {
        this.sDsTermo = value;
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
