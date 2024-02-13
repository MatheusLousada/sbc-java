
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PregaoEletronicoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregaoEletronicoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstPregaoEletronicoItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoItemEnderecoDTO"/>
 *         &lt;element name="lstPregaoEletronicoItemLanceDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoItemLanceDTO" minOccurs="0"/>
 *         &lt;element name="lstPregaoEletronicoPropostaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoPropostaDTO" minOccurs="0"/>
 *         &lt;element name="nCdItemSequencial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nStItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItemLegado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdLoteLegado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PregaoEletronicoItemDTO", propOrder = {
    "dQtItem",
    "dVlReferencia",
    "lstPregaoEletronicoItemEnderecoDTO",
    "lstPregaoEletronicoItemLanceDTO",
    "lstPregaoEletronicoPropostaDTO",
    "nCdItemSequencial",
    "nStItem",
    "sCdClasse",
    "sCdItemLegado",
    "sCdLoteLegado",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sDsItem"
})
public class PregaoEletronicoItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlReferencia;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPregaoEletronicoItemEnderecoDTO lstPregaoEletronicoItemEnderecoDTO;
    @XmlElementRef(name = "lstPregaoEletronicoItemLanceDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> lstPregaoEletronicoItemLanceDTO;
    @XmlElementRef(name = "lstPregaoEletronicoPropostaDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> lstPregaoEletronicoPropostaDTO;
    protected int nCdItemSequencial;
    protected int nStItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemLegado;
    @XmlElementRef(name = "sCdLoteLegado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdLoteLegado;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsItem;

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
     * Gets the value of the lstPregaoEletronicoItemEnderecoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPregaoEletronicoItemEnderecoDTO }
     *     
     */
    public ArrayOfPregaoEletronicoItemEnderecoDTO getLstPregaoEletronicoItemEnderecoDTO() {
        return lstPregaoEletronicoItemEnderecoDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoItemEnderecoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPregaoEletronicoItemEnderecoDTO }
     *     
     */
    public void setLstPregaoEletronicoItemEnderecoDTO(ArrayOfPregaoEletronicoItemEnderecoDTO value) {
        this.lstPregaoEletronicoItemEnderecoDTO = value;
    }

    /**
     * Gets the value of the lstPregaoEletronicoItemLanceDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemLanceDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> getLstPregaoEletronicoItemLanceDTO() {
        return lstPregaoEletronicoItemLanceDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoItemLanceDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoItemLanceDTO }{@code >}
     *     
     */
    public void setLstPregaoEletronicoItemLanceDTO(JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> value) {
        this.lstPregaoEletronicoItemLanceDTO = ((JAXBElement<ArrayOfPregaoEletronicoItemLanceDTO> ) value);
    }

    /**
     * Gets the value of the lstPregaoEletronicoPropostaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoPropostaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> getLstPregaoEletronicoPropostaDTO() {
        return lstPregaoEletronicoPropostaDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoPropostaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoPropostaDTO }{@code >}
     *     
     */
    public void setLstPregaoEletronicoPropostaDTO(JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> value) {
        this.lstPregaoEletronicoPropostaDTO = ((JAXBElement<ArrayOfPregaoEletronicoPropostaDTO> ) value);
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

}
