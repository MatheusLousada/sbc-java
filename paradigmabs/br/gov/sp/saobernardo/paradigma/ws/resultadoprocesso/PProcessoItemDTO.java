
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
 * <p>Java class for PProcessoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstPProcessoItemEndereco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoItemEnderecoDTO"/>
 *         &lt;element name="lstPProcessoItemIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoItemIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="lstPProcessoItemResultado" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoItemResultadoDTO"/>
 *         &lt;element name="nCdItemSequencial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdLoteSequencial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nStItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItemLegado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdLoteLegado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdPrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioFinalizacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtAdjudicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtFinalizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoItemDTO", propOrder = {
    "dQtItem",
    "dVlReferencia",
    "lstPProcessoItemEndereco",
    "lstPProcessoItemIdioma",
    "lstPProcessoItemResultado",
    "nCdItemSequencial",
    "nCdLoteSequencial",
    "nStItem",
    "sCdClasse",
    "sCdItemLegado",
    "sCdLoteLegado",
    "sCdPrazoEntrega",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sCdUsuarioFinalizacao",
    "sDsItem",
    "sDsObservacao",
    "tDtAdjudicacao",
    "tDtFinalizacao"
})
public class PProcessoItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlReferencia;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPProcessoItemEnderecoDTO lstPProcessoItemEndereco;
    @XmlElementRef(name = "lstPProcessoItemIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoItemIdiomaDTO> lstPProcessoItemIdioma;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPProcessoItemResultadoDTO lstPProcessoItemResultado;
    protected int nCdItemSequencial;
    @XmlElementRef(name = "nCdLoteSequencial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdLoteSequencial;
    protected int nStItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemLegado;
    @XmlElementRef(name = "sCdLoteLegado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdLoteLegado;
    @XmlElementRef(name = "sCdPrazoEntrega", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPrazoEntrega;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioFinalizacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsItem;
    @XmlElement(required = true, nillable = true)
    protected String sDsObservacao;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAdjudicacao;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinalizacao;

    /**
     * Gets the value of the dQtItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItem() {
        return dQtItem;
    }

    /**
     * Sets the value of the dQtItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItem(BigDecimal value) {
        this.dQtItem = value;
    }

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
     * Gets the value of the lstPProcessoItemEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPProcessoItemEnderecoDTO }
     *     
     */
    public ArrayOfPProcessoItemEnderecoDTO getLstPProcessoItemEndereco() {
        return lstPProcessoItemEndereco;
    }

    /**
     * Sets the value of the lstPProcessoItemEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPProcessoItemEnderecoDTO }
     *     
     */
    public void setLstPProcessoItemEndereco(ArrayOfPProcessoItemEnderecoDTO value) {
        this.lstPProcessoItemEndereco = value;
    }

    /**
     * Gets the value of the lstPProcessoItemIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoItemIdiomaDTO> getLstPProcessoItemIdioma() {
        return lstPProcessoItemIdioma;
    }

    /**
     * Sets the value of the lstPProcessoItemIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemIdiomaDTO }{@code >}
     *     
     */
    public void setLstPProcessoItemIdioma(JAXBElement<ArrayOfPProcessoItemIdiomaDTO> value) {
        this.lstPProcessoItemIdioma = ((JAXBElement<ArrayOfPProcessoItemIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the lstPProcessoItemResultado property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPProcessoItemResultadoDTO }
     *     
     */
    public ArrayOfPProcessoItemResultadoDTO getLstPProcessoItemResultado() {
        return lstPProcessoItemResultado;
    }

    /**
     * Sets the value of the lstPProcessoItemResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPProcessoItemResultadoDTO }
     *     
     */
    public void setLstPProcessoItemResultado(ArrayOfPProcessoItemResultadoDTO value) {
        this.lstPProcessoItemResultado = value;
    }

    /**
     * Gets the value of the nCdItemSequencial property.
     * 
     */
    public int getNCdItemSequencial() {
        return nCdItemSequencial;
    }

    /**
     * Sets the value of the nCdItemSequencial property.
     * 
     */
    public void setNCdItemSequencial(int value) {
        this.nCdItemSequencial = value;
    }

    /**
     * Gets the value of the nCdLoteSequencial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdLoteSequencial() {
        return nCdLoteSequencial;
    }

    /**
     * Sets the value of the nCdLoteSequencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdLoteSequencial(JAXBElement<Integer> value) {
        this.nCdLoteSequencial = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nStItem property.
     * 
     */
    public int getNStItem() {
        return nStItem;
    }

    /**
     * Sets the value of the nStItem property.
     * 
     */
    public void setNStItem(int value) {
        this.nStItem = value;
    }

    /**
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdItemLegado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemLegado() {
        return sCdItemLegado;
    }

    /**
     * Sets the value of the sCdItemLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemLegado(String value) {
        this.sCdItemLegado = value;
    }

    /**
     * Gets the value of the sCdLoteLegado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdLoteLegado() {
        return sCdLoteLegado;
    }

    /**
     * Sets the value of the sCdLoteLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdLoteLegado(JAXBElement<String> value) {
        this.sCdLoteLegado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdPrazoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPrazoEntrega() {
        return sCdPrazoEntrega;
    }

    /**
     * Sets the value of the sCdPrazoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPrazoEntrega(JAXBElement<String> value) {
        this.sCdPrazoEntrega = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

    /**
     * Gets the value of the sCdUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeMedida() {
        return sCdUnidadeMedida;
    }

    /**
     * Sets the value of the sCdUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeMedida(String value) {
        this.sCdUnidadeMedida = value;
    }

    /**
     * Gets the value of the sCdUsuarioFinalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioFinalizacao() {
        return sCdUsuarioFinalizacao;
    }

    /**
     * Sets the value of the sCdUsuarioFinalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioFinalizacao(String value) {
        this.sCdUsuarioFinalizacao = value;
    }

    /**
     * Gets the value of the sDsItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsItem() {
        return sDsItem;
    }

    /**
     * Sets the value of the sDsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsItem(String value) {
        this.sDsItem = value;
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsObservacao(String value) {
        this.sDsObservacao = value;
    }

    /**
     * Gets the value of the tDtAdjudicacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAdjudicacao() {
        return tDtAdjudicacao;
    }

    /**
     * Sets the value of the tDtAdjudicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAdjudicacao(XMLGregorianCalendar value) {
        this.tDtAdjudicacao = value;
    }

    /**
     * Gets the value of the tDtFinalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFinalizacao() {
        return tDtFinalizacao;
    }

    /**
     * Sets the value of the tDtFinalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFinalizacao(XMLGregorianCalendar value) {
        this.tDtFinalizacao = value;
    }

}
