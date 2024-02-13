
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PProcessoOrdemCompraDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoOrdemCompraDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstPProcessoOrdemCompraRequisicao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoOrdemCompraRequisicaoDTO"/>
 *         &lt;element name="nCdClassificacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdModalidade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdOrdemCompraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoOrdemCompraDTO", propOrder = {
    "lstPProcessoOrdemCompraRequisicao",
    "nCdClassificacao",
    "nCdModalidade",
    "nCdTipoOrdemCompra",
    "sCdComprador",
    "sCdGestao",
    "sCdOrdemCompraEmpresa",
    "sDsOrdemCompra",
    "tDtEmissao"
})
public class PProcessoOrdemCompraDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPProcessoOrdemCompraRequisicaoDTO lstPProcessoOrdemCompraRequisicao;
    protected long nCdClassificacao;
    protected long nCdModalidade;
    protected long nCdTipoOrdemCompra;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElement(required = true, nillable = true)
    protected String sCdOrdemCompraEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsOrdemCompra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;

    /**
     * Gets the value of the lstPProcessoOrdemCompraRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPProcessoOrdemCompraRequisicaoDTO }
     *     
     */
    public ArrayOfPProcessoOrdemCompraRequisicaoDTO getLstPProcessoOrdemCompraRequisicao() {
        return lstPProcessoOrdemCompraRequisicao;
    }

    /**
     * Sets the value of the lstPProcessoOrdemCompraRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPProcessoOrdemCompraRequisicaoDTO }
     *     
     */
    public void setLstPProcessoOrdemCompraRequisicao(ArrayOfPProcessoOrdemCompraRequisicaoDTO value) {
        this.lstPProcessoOrdemCompraRequisicao = value;
    }

    /**
     * Gets the value of the nCdClassificacao property.
     * 
     */
    public long getNCdClassificacao() {
        return nCdClassificacao;
    }

    /**
     * Sets the value of the nCdClassificacao property.
     * 
     */
    public void setNCdClassificacao(long value) {
        this.nCdClassificacao = value;
    }

    /**
     * Gets the value of the nCdModalidade property.
     * 
     */
    public long getNCdModalidade() {
        return nCdModalidade;
    }

    /**
     * Sets the value of the nCdModalidade property.
     * 
     */
    public void setNCdModalidade(long value) {
        this.nCdModalidade = value;
    }

    /**
     * Gets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public long getNCdTipoOrdemCompra() {
        return nCdTipoOrdemCompra;
    }

    /**
     * Sets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public void setNCdTipoOrdemCompra(long value) {
        this.nCdTipoOrdemCompra = value;
    }

    /**
     * Gets the value of the sCdComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdComprador() {
        return sCdComprador;
    }

    /**
     * Sets the value of the sCdComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdComprador(String value) {
        this.sCdComprador = value;
    }

    /**
     * Gets the value of the sCdGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGestao() {
        return sCdGestao;
    }

    /**
     * Sets the value of the sCdGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGestao(JAXBElement<String> value) {
        this.sCdGestao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdOrdemCompraEmpresa() {
        return sCdOrdemCompraEmpresa;
    }

    /**
     * Sets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdOrdemCompraEmpresa(String value) {
        this.sCdOrdemCompraEmpresa = value;
    }

    /**
     * Gets the value of the sDsOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsOrdemCompra() {
        return sDsOrdemCompra;
    }

    /**
     * Sets the value of the sDsOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsOrdemCompra(String value) {
        this.sDsOrdemCompra = value;
    }

    /**
     * Gets the value of the tDtEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEmissao() {
        return tDtEmissao;
    }

    /**
     * Sets the value of the tDtEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEmissao(XMLGregorianCalendar value) {
        this.tDtEmissao = value;
    }

}
