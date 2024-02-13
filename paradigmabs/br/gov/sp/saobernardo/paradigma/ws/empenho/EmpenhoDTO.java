
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpenhoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpenhoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlAnulado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlEmpenho" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlLiquidado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlPago" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlReforco" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdOrigem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdModalidadeEmpenhoMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoCredor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoDespesaMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoLicitacaoMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrExercicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProgramaTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsLocalEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtEmpenho" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpenhoDTO", propOrder = {
    "dVlAnulado",
    "dVlEmpenho",
    "dVlLiquidado",
    "dVlPago",
    "dVlReforco",
    "nCdOrigem",
    "nIdModalidadeEmpenhoMap",
    "nIdTipoCredor",
    "nIdTipoDespesaMap",
    "nIdTipoLicitacaoMap",
    "nNrExercicio",
    "sCdContrato",
    "sCdDocumento",
    "sCdEmpresaCliente",
    "sCdGestao",
    "sCdNaturezaDespesa",
    "sCdProgramaTrabalho",
    "sDsLocalEntrega",
    "sDsObservacao",
    "sNrSolicitacao",
    "tDtAtualizacao",
    "tDtEmpenho"
})
public class EmpenhoDTO
    extends DtoBase
{

    protected BigDecimal dVlAnulado;
    protected BigDecimal dVlEmpenho;
    protected BigDecimal dVlLiquidado;
    protected BigDecimal dVlPago;
    protected BigDecimal dVlReforco;
    @XmlElementRef(name = "nCdOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdOrigem;
    @XmlElementRef(name = "nIdModalidadeEmpenhoMap", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdModalidadeEmpenhoMap;
    @XmlElementRef(name = "nIdTipoCredor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoCredor;
    @XmlElementRef(name = "nIdTipoDespesaMap", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoDespesaMap;
    @XmlElementRef(name = "nIdTipoLicitacaoMap", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoLicitacaoMap;
    @XmlElementRef(name = "nNrExercicio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrExercicio;
    @XmlElementRef(name = "sCdContrato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContrato;
    @XmlElementRef(name = "sCdDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDocumento;
    @XmlElementRef(name = "sCdEmpresaCliente", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaCliente;
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElementRef(name = "sCdNaturezaDespesa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNaturezaDespesa;
    @XmlElementRef(name = "sCdProgramaTrabalho", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdProgramaTrabalho;
    @XmlElementRef(name = "sDsLocalEntrega", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsLocalEntrega;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlElementRef(name = "sNrSolicitacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrSolicitacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmpenho;

    /**
     * Gets the value of the dVlAnulado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAnulado() {
        return dVlAnulado;
    }

    /**
     * Sets the value of the dVlAnulado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAnulado(BigDecimal value) {
        this.dVlAnulado = value;
    }

    /**
     * Gets the value of the dVlEmpenho property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlEmpenho() {
        return dVlEmpenho;
    }

    /**
     * Sets the value of the dVlEmpenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlEmpenho(BigDecimal value) {
        this.dVlEmpenho = value;
    }

    /**
     * Gets the value of the dVlLiquidado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlLiquidado() {
        return dVlLiquidado;
    }

    /**
     * Sets the value of the dVlLiquidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlLiquidado(BigDecimal value) {
        this.dVlLiquidado = value;
    }

    /**
     * Gets the value of the dVlPago property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlPago() {
        return dVlPago;
    }

    /**
     * Sets the value of the dVlPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlPago(BigDecimal value) {
        this.dVlPago = value;
    }

    /**
     * Gets the value of the dVlReforco property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlReforco() {
        return dVlReforco;
    }

    /**
     * Sets the value of the dVlReforco property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlReforco(BigDecimal value) {
        this.dVlReforco = value;
    }

    /**
     * Gets the value of the nCdOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdOrigem() {
        return nCdOrigem;
    }

    /**
     * Sets the value of the nCdOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdOrigem(JAXBElement<Integer> value) {
        this.nCdOrigem = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdModalidadeEmpenhoMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdModalidadeEmpenhoMap() {
        return nIdModalidadeEmpenhoMap;
    }

    /**
     * Sets the value of the nIdModalidadeEmpenhoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdModalidadeEmpenhoMap(JAXBElement<Integer> value) {
        this.nIdModalidadeEmpenhoMap = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdTipoCredor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoCredor() {
        return nIdTipoCredor;
    }

    /**
     * Sets the value of the nIdTipoCredor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoCredor(JAXBElement<Integer> value) {
        this.nIdTipoCredor = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdTipoDespesaMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoDespesaMap() {
        return nIdTipoDespesaMap;
    }

    /**
     * Sets the value of the nIdTipoDespesaMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoDespesaMap(JAXBElement<Integer> value) {
        this.nIdTipoDespesaMap = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdTipoLicitacaoMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoLicitacaoMap() {
        return nIdTipoLicitacaoMap;
    }

    /**
     * Sets the value of the nIdTipoLicitacaoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoLicitacaoMap(JAXBElement<Integer> value) {
        this.nIdTipoLicitacaoMap = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrExercicio() {
        return nNrExercicio;
    }

    /**
     * Sets the value of the nNrExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrExercicio(JAXBElement<Integer> value) {
        this.nNrExercicio = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the sCdDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDocumento() {
        return sCdDocumento;
    }

    /**
     * Sets the value of the sCdDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDocumento(JAXBElement<String> value) {
        this.sCdDocumento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaCliente() {
        return sCdEmpresaCliente;
    }

    /**
     * Sets the value of the sCdEmpresaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaCliente(JAXBElement<String> value) {
        this.sCdEmpresaCliente = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNaturezaDespesa() {
        return sCdNaturezaDespesa;
    }

    /**
     * Sets the value of the sCdNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNaturezaDespesa(JAXBElement<String> value) {
        this.sCdNaturezaDespesa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProgramaTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdProgramaTrabalho() {
        return sCdProgramaTrabalho;
    }

    /**
     * Sets the value of the sCdProgramaTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdProgramaTrabalho(JAXBElement<String> value) {
        this.sCdProgramaTrabalho = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsLocalEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsLocalEntrega() {
        return sDsLocalEntrega;
    }

    /**
     * Sets the value of the sDsLocalEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsLocalEntrega(JAXBElement<String> value) {
        this.sDsLocalEntrega = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacao(JAXBElement<String> value) {
        this.sDsObservacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrSolicitacao() {
        return sNrSolicitacao;
    }

    /**
     * Sets the value of the sNrSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrSolicitacao(JAXBElement<String> value) {
        this.sNrSolicitacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAtualizacao() {
        return tDtAtualizacao;
    }

    /**
     * Sets the value of the tDtAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAtualizacao(XMLGregorianCalendar value) {
        this.tDtAtualizacao = value;
    }

    /**
     * Gets the value of the tDtEmpenho property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEmpenho() {
        return tDtEmpenho;
    }

    /**
     * Sets the value of the tDtEmpenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEmpenho(XMLGregorianCalendar value) {
        this.tDtEmpenho = value;
    }

}
