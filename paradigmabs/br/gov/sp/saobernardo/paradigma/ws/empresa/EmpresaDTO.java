
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpresaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAreaInfluencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlAssinaturaDigital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlAssinaturaEletronica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlAtividadeComercial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlAtividadeIndustrial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlAtividadeServico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlCapitalIntegralizado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlCapitalSocial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlPatrimonioLiquido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstDocumento" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCrcHistoricoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaBanco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaBancoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaClasse" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaClasseDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaContato" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaContatoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoCobranca" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoEntrega" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoFaturamento" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoInstitucional" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaRepresentanteSocio" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaRepresentanteSocioDTO" minOccurs="0"/>
 *         &lt;element name="nCdEmpresaWbc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdIdioma" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoCadastroMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdSuperSimples" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoPessoa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrAutoAvaliacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrNotaAvaliacao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sCdAtividadeMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdNaturezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsarioHomologador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsCep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsEmailContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsEnderecoComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmApelido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmBairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrCnpj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCnpjMatriz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrInscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrInscricaoMunicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrInscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTelefoneDDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSgEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSgPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicioAtividade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtIntegralizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtValidadeCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaDTO", propOrder = {
    "bFlAreaInfluencia",
    "bFlAssinaturaDigital",
    "bFlAssinaturaEletronica",
    "bFlAtividadeComercial",
    "bFlAtividadeIndustrial",
    "bFlAtividadeServico",
    "dVlCapitalIntegralizado",
    "dVlCapitalSocial",
    "dVlPatrimonioLiquido",
    "lstDocumento",
    "lstEmpresaBanco",
    "lstEmpresaClasse",
    "lstEmpresaContato",
    "lstEmpresaEnderecoCobranca",
    "lstEmpresaEnderecoEntrega",
    "lstEmpresaEnderecoFaturamento",
    "lstEmpresaEnderecoInstitucional",
    "lstEmpresaRepresentanteSocio",
    "nCdEmpresaWbc",
    "nCdIdioma",
    "nCdSituacao",
    "nCdTipo",
    "nCdTipoCadastroMap",
    "nIdSuperSimples",
    "nIdTipoPessoa",
    "nNrAutoAvaliacao",
    "nNrNotaAvaliacao",
    "sCdAtividadeMap",
    "sCdCnae",
    "sCdEmpresa",
    "sCdEmpresaCliente",
    "sCdEmpresaEnvio",
    "sCdMoeda",
    "sCdNaturezaJuridica",
    "sCdUsarioHomologador",
    "sDsCep",
    "sDsEmailContato",
    "sDsEndereco",
    "sDsEnderecoComplemento",
    "sDsUrl",
    "sNmApelido",
    "sNmBairro",
    "sNmCidade",
    "sNmContato",
    "sNmEmpresa",
    "sNmFantasia",
    "sNrCelular",
    "sNrCnpj",
    "sNrCnpjMatriz",
    "sNrEndereco",
    "sNrFax",
    "sNrInscricaoEstadual",
    "sNrInscricaoMunicial",
    "sNrInscricaoMunicipal",
    "sNrTelefone",
    "sNrTelefoneDDD",
    "sSgEstado",
    "sSgGrupoConta",
    "sSgPais",
    "tDtCadastro",
    "tDtInicioAtividade",
    "tDtIntegralizacao",
    "tDtValidadeCadastro"
})
public class EmpresaDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAreaInfluencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAreaInfluencia;
    @XmlElementRef(name = "bFlAssinaturaDigital", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAssinaturaDigital;
    @XmlElementRef(name = "bFlAssinaturaEletronica", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAssinaturaEletronica;
    @XmlElementRef(name = "bFlAtividadeComercial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtividadeComercial;
    @XmlElementRef(name = "bFlAtividadeIndustrial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtividadeIndustrial;
    @XmlElementRef(name = "bFlAtividadeServico", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtividadeServico;
    @XmlElementRef(name = "dVlCapitalIntegralizado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlCapitalIntegralizado;
    @XmlElementRef(name = "dVlCapitalSocial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlCapitalSocial;
    @XmlElementRef(name = "dVlPatrimonioLiquido", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlPatrimonioLiquido;
    @XmlElementRef(name = "lstDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrcHistoricoDTO> lstDocumento;
    @XmlElementRef(name = "lstEmpresaBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaBancoDTO> lstEmpresaBanco;
    @XmlElementRef(name = "lstEmpresaClasse", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaClasseDTO> lstEmpresaClasse;
    @XmlElementRef(name = "lstEmpresaContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaContatoDTO> lstEmpresaContato;
    @XmlElementRef(name = "lstEmpresaEnderecoCobranca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoCobranca;
    @XmlElementRef(name = "lstEmpresaEnderecoEntrega", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoEntrega;
    @XmlElementRef(name = "lstEmpresaEnderecoFaturamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoFaturamento;
    @XmlElementRef(name = "lstEmpresaEnderecoInstitucional", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoInstitucional;
    @XmlElementRef(name = "lstEmpresaRepresentanteSocio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> lstEmpresaRepresentanteSocio;
    @XmlElementRef(name = "nCdEmpresaWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdEmpresaWbc;
    protected Long nCdIdioma;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdSituacao;
    protected long nCdTipo;
    protected Integer nCdTipoCadastroMap;
    @XmlElementRef(name = "nIdSuperSimples", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdSuperSimples;
    @XmlElementRef(name = "nIdTipoPessoa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoPessoa;
    @XmlElementRef(name = "nNrAutoAvaliacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrAutoAvaliacao;
    @XmlElementRef(name = "nNrNotaAvaliacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> nNrNotaAvaliacao;
    @XmlElementRef(name = "sCdAtividadeMap", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAtividadeMap;
    @XmlElementRef(name = "sCdCnae", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCnae;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdEmpresaCliente", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaCliente;
    @XmlElementRef(name = "sCdEmpresaEnvio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaEnvio;
    @XmlElementRef(name = "sCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoeda;
    @XmlElementRef(name = "sCdNaturezaJuridica", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNaturezaJuridica;
    @XmlElementRef(name = "sCdUsarioHomologador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsarioHomologador;
    @XmlElement(required = true, nillable = true)
    protected String sDsCep;
    @XmlElementRef(name = "sDsEmailContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsEmailContato;
    @XmlElement(required = true, nillable = true)
    protected String sDsEndereco;
    @XmlElementRef(name = "sDsEnderecoComplemento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsEnderecoComplemento;
    @XmlElementRef(name = "sDsUrl", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUrl;
    @XmlElementRef(name = "sNmApelido", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmApelido;
    @XmlElement(required = true, nillable = true)
    protected String sNmBairro;
    @XmlElement(required = true, nillable = true)
    protected String sNmCidade;
    @XmlElementRef(name = "sNmContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmContato;
    @XmlElement(required = true, nillable = true)
    protected String sNmEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sNmFantasia;
    @XmlElementRef(name = "sNrCelular", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCelular;
    @XmlElement(required = true, nillable = true)
    protected String sNrCnpj;
    @XmlElementRef(name = "sNrCnpjMatriz", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCnpjMatriz;
    @XmlElementRef(name = "sNrEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrEndereco;
    @XmlElementRef(name = "sNrFax", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrFax;
    @XmlElementRef(name = "sNrInscricaoEstadual", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrInscricaoEstadual;
    @XmlElementRef(name = "sNrInscricaoMunicial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrInscricaoMunicial;
    @XmlElementRef(name = "sNrInscricaoMunicipal", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrInscricaoMunicipal;
    @XmlElementRef(name = "sNrTelefone", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefone;
    @XmlElementRef(name = "sNrTelefoneDDD", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefoneDDD;
    @XmlElement(required = true, nillable = true)
    protected String sSgEstado;
    @XmlElementRef(name = "sSgGrupoConta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgGrupoConta;
    @XmlElement(required = true, nillable = true)
    protected String sSgPais;
    @XmlElementRef(name = "tDtCadastro", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtCadastro;
    @XmlElementRef(name = "tDtInicioAtividade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtInicioAtividade;
    @XmlElementRef(name = "tDtIntegralizacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtIntegralizacao;
    @XmlElementRef(name = "tDtValidadeCadastro", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtValidadeCadastro;

    /**
     * Gets the value of the bFlAreaInfluencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAreaInfluencia() {
        return bFlAreaInfluencia;
    }

    /**
     * Sets the value of the bFlAreaInfluencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAreaInfluencia(JAXBElement<Integer> value) {
        this.bFlAreaInfluencia = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlAssinaturaDigital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAssinaturaDigital() {
        return bFlAssinaturaDigital;
    }

    /**
     * Sets the value of the bFlAssinaturaDigital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAssinaturaDigital(JAXBElement<Integer> value) {
        this.bFlAssinaturaDigital = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlAssinaturaEletronica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAssinaturaEletronica() {
        return bFlAssinaturaEletronica;
    }

    /**
     * Sets the value of the bFlAssinaturaEletronica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAssinaturaEletronica(JAXBElement<Integer> value) {
        this.bFlAssinaturaEletronica = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlAtividadeComercial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtividadeComercial() {
        return bFlAtividadeComercial;
    }

    /**
     * Sets the value of the bFlAtividadeComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtividadeComercial(JAXBElement<Integer> value) {
        this.bFlAtividadeComercial = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlAtividadeIndustrial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtividadeIndustrial() {
        return bFlAtividadeIndustrial;
    }

    /**
     * Sets the value of the bFlAtividadeIndustrial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtividadeIndustrial(JAXBElement<Integer> value) {
        this.bFlAtividadeIndustrial = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlAtividadeServico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtividadeServico() {
        return bFlAtividadeServico;
    }

    /**
     * Sets the value of the bFlAtividadeServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtividadeServico(JAXBElement<Integer> value) {
        this.bFlAtividadeServico = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dVlCapitalIntegralizado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlCapitalIntegralizado() {
        return dVlCapitalIntegralizado;
    }

    /**
     * Sets the value of the dVlCapitalIntegralizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlCapitalIntegralizado(JAXBElement<BigDecimal> value) {
        this.dVlCapitalIntegralizado = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dVlCapitalSocial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlCapitalSocial() {
        return dVlCapitalSocial;
    }

    /**
     * Sets the value of the dVlCapitalSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlCapitalSocial(JAXBElement<BigDecimal> value) {
        this.dVlCapitalSocial = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dVlPatrimonioLiquido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlPatrimonioLiquido() {
        return dVlPatrimonioLiquido;
    }

    /**
     * Sets the value of the dVlPatrimonioLiquido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlPatrimonioLiquido(JAXBElement<BigDecimal> value) {
        this.dVlPatrimonioLiquido = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the lstDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrcHistoricoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrcHistoricoDTO> getLstDocumento() {
        return lstDocumento;
    }

    /**
     * Sets the value of the lstDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrcHistoricoDTO }{@code >}
     *     
     */
    public void setLstDocumento(JAXBElement<ArrayOfCrcHistoricoDTO> value) {
        this.lstDocumento = ((JAXBElement<ArrayOfCrcHistoricoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaBancoDTO> getLstEmpresaBanco() {
        return lstEmpresaBanco;
    }

    /**
     * Sets the value of the lstEmpresaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public void setLstEmpresaBanco(JAXBElement<ArrayOfEmpresaBancoDTO> value) {
        this.lstEmpresaBanco = ((JAXBElement<ArrayOfEmpresaBancoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaClasse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaClasseDTO> getLstEmpresaClasse() {
        return lstEmpresaClasse;
    }

    /**
     * Sets the value of the lstEmpresaClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}
     *     
     */
    public void setLstEmpresaClasse(JAXBElement<ArrayOfEmpresaClasseDTO> value) {
        this.lstEmpresaClasse = ((JAXBElement<ArrayOfEmpresaClasseDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaContatoDTO> getLstEmpresaContato() {
        return lstEmpresaContato;
    }

    /**
     * Sets the value of the lstEmpresaContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaContatoDTO }{@code >}
     *     
     */
    public void setLstEmpresaContato(JAXBElement<ArrayOfEmpresaContatoDTO> value) {
        this.lstEmpresaContato = ((JAXBElement<ArrayOfEmpresaContatoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoCobranca() {
        return lstEmpresaEnderecoCobranca;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoCobranca(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoCobranca = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoEntrega() {
        return lstEmpresaEnderecoEntrega;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoEntrega(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoEntrega = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoFaturamento() {
        return lstEmpresaEnderecoFaturamento;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoFaturamento(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoFaturamento = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoInstitucional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoInstitucional() {
        return lstEmpresaEnderecoInstitucional;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoInstitucional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoInstitucional(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoInstitucional = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaRepresentanteSocio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaRepresentanteSocioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> getLstEmpresaRepresentanteSocio() {
        return lstEmpresaRepresentanteSocio;
    }

    /**
     * Sets the value of the lstEmpresaRepresentanteSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaRepresentanteSocioDTO }{@code >}
     *     
     */
    public void setLstEmpresaRepresentanteSocio(JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> value) {
        this.lstEmpresaRepresentanteSocio = ((JAXBElement<ArrayOfEmpresaRepresentanteSocioDTO> ) value);
    }

    /**
     * Gets the value of the nCdEmpresaWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdEmpresaWbc() {
        return nCdEmpresaWbc;
    }

    /**
     * Sets the value of the nCdEmpresaWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdEmpresaWbc(JAXBElement<Long> value) {
        this.nCdEmpresaWbc = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdIdioma() {
        return nCdIdioma;
    }

    /**
     * Sets the value of the nCdIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdIdioma(Long value) {
        this.nCdIdioma = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdSituacao(Long value) {
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
     * Gets the value of the nCdTipoCadastroMap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdTipoCadastroMap() {
        return nCdTipoCadastroMap;
    }

    /**
     * Sets the value of the nCdTipoCadastroMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdTipoCadastroMap(Integer value) {
        this.nCdTipoCadastroMap = value;
    }

    /**
     * Gets the value of the nIdSuperSimples property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdSuperSimples() {
        return nIdSuperSimples;
    }

    /**
     * Sets the value of the nIdSuperSimples property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdSuperSimples(JAXBElement<Integer> value) {
        this.nIdSuperSimples = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdTipoPessoa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoPessoa() {
        return nIdTipoPessoa;
    }

    /**
     * Sets the value of the nIdTipoPessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoPessoa(JAXBElement<Integer> value) {
        this.nIdTipoPessoa = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrAutoAvaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrAutoAvaliacao() {
        return nNrAutoAvaliacao;
    }

    /**
     * Sets the value of the nNrAutoAvaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrAutoAvaliacao(JAXBElement<Integer> value) {
        this.nNrAutoAvaliacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrNotaAvaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNNrNotaAvaliacao() {
        return nNrNotaAvaliacao;
    }

    /**
     * Sets the value of the nNrNotaAvaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNNrNotaAvaliacao(JAXBElement<BigDecimal> value) {
        this.nNrNotaAvaliacao = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sCdAtividadeMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAtividadeMap() {
        return sCdAtividadeMap;
    }

    /**
     * Sets the value of the sCdAtividadeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAtividadeMap(JAXBElement<String> value) {
        this.sCdAtividadeMap = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdCnae property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCnae() {
        return sCdCnae;
    }

    /**
     * Sets the value of the sCdCnae property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCnae(JAXBElement<String> value) {
        this.sCdCnae = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdEmpresaEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaEnvio() {
        return sCdEmpresaEnvio;
    }

    /**
     * Sets the value of the sCdEmpresaEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaEnvio(JAXBElement<String> value) {
        this.sCdEmpresaEnvio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoeda(JAXBElement<String> value) {
        this.sCdMoeda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdNaturezaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNaturezaJuridica() {
        return sCdNaturezaJuridica;
    }

    /**
     * Sets the value of the sCdNaturezaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNaturezaJuridica(JAXBElement<String> value) {
        this.sCdNaturezaJuridica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsarioHomologador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsarioHomologador() {
        return sCdUsarioHomologador;
    }

    /**
     * Sets the value of the sCdUsarioHomologador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsarioHomologador(JAXBElement<String> value) {
        this.sCdUsarioHomologador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsCep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCep() {
        return sDsCep;
    }

    /**
     * Sets the value of the sDsCep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCep(String value) {
        this.sDsCep = value;
    }

    /**
     * Gets the value of the sDsEmailContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsEmailContato() {
        return sDsEmailContato;
    }

    /**
     * Sets the value of the sDsEmailContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsEmailContato(JAXBElement<String> value) {
        this.sDsEmailContato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsEndereco() {
        return sDsEndereco;
    }

    /**
     * Sets the value of the sDsEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsEndereco(String value) {
        this.sDsEndereco = value;
    }

    /**
     * Gets the value of the sDsEnderecoComplemento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsEnderecoComplemento() {
        return sDsEnderecoComplemento;
    }

    /**
     * Sets the value of the sDsEnderecoComplemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsEnderecoComplemento(JAXBElement<String> value) {
        this.sDsEnderecoComplemento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsUrl() {
        return sDsUrl;
    }

    /**
     * Sets the value of the sDsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsUrl(JAXBElement<String> value) {
        this.sDsUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmApelido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmApelido() {
        return sNmApelido;
    }

    /**
     * Sets the value of the sNmApelido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmApelido(JAXBElement<String> value) {
        this.sNmApelido = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmBairro() {
        return sNmBairro;
    }

    /**
     * Sets the value of the sNmBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmBairro(String value) {
        this.sNmBairro = value;
    }

    /**
     * Gets the value of the sNmCidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmCidade() {
        return sNmCidade;
    }

    /**
     * Sets the value of the sNmCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmCidade(String value) {
        this.sNmCidade = value;
    }

    /**
     * Gets the value of the sNmContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmContato() {
        return sNmContato;
    }

    /**
     * Sets the value of the sNmContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmContato(JAXBElement<String> value) {
        this.sNmContato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmEmpresa() {
        return sNmEmpresa;
    }

    /**
     * Sets the value of the sNmEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmEmpresa(String value) {
        this.sNmEmpresa = value;
    }

    /**
     * Gets the value of the sNmFantasia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmFantasia() {
        return sNmFantasia;
    }

    /**
     * Sets the value of the sNmFantasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmFantasia(String value) {
        this.sNmFantasia = value;
    }

    /**
     * Gets the value of the sNrCelular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCelular() {
        return sNrCelular;
    }

    /**
     * Sets the value of the sNrCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCelular(JAXBElement<String> value) {
        this.sNrCelular = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrCnpj() {
        return sNrCnpj;
    }

    /**
     * Sets the value of the sNrCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrCnpj(String value) {
        this.sNrCnpj = value;
    }

    /**
     * Gets the value of the sNrCnpjMatriz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCnpjMatriz() {
        return sNrCnpjMatriz;
    }

    /**
     * Sets the value of the sNrCnpjMatriz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCnpjMatriz(JAXBElement<String> value) {
        this.sNrCnpjMatriz = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrEndereco() {
        return sNrEndereco;
    }

    /**
     * Sets the value of the sNrEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrEndereco(JAXBElement<String> value) {
        this.sNrEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrFax() {
        return sNrFax;
    }

    /**
     * Sets the value of the sNrFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrFax(JAXBElement<String> value) {
        this.sNrFax = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrInscricaoEstadual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrInscricaoEstadual() {
        return sNrInscricaoEstadual;
    }

    /**
     * Sets the value of the sNrInscricaoEstadual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrInscricaoEstadual(JAXBElement<String> value) {
        this.sNrInscricaoEstadual = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrInscricaoMunicial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrInscricaoMunicial() {
        return sNrInscricaoMunicial;
    }

    /**
     * Sets the value of the sNrInscricaoMunicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrInscricaoMunicial(JAXBElement<String> value) {
        this.sNrInscricaoMunicial = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrInscricaoMunicipal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrInscricaoMunicipal() {
        return sNrInscricaoMunicipal;
    }

    /**
     * Sets the value of the sNrInscricaoMunicipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrInscricaoMunicipal(JAXBElement<String> value) {
        this.sNrInscricaoMunicipal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTelefone() {
        return sNrTelefone;
    }

    /**
     * Sets the value of the sNrTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTelefone(JAXBElement<String> value) {
        this.sNrTelefone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrTelefoneDDD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTelefoneDDD() {
        return sNrTelefoneDDD;
    }

    /**
     * Sets the value of the sNrTelefoneDDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTelefoneDDD(JAXBElement<String> value) {
        this.sNrTelefoneDDD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sSgEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgEstado() {
        return sSgEstado;
    }

    /**
     * Sets the value of the sSgEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgEstado(String value) {
        this.sSgEstado = value;
    }

    /**
     * Gets the value of the sSgGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgGrupoConta() {
        return sSgGrupoConta;
    }

    /**
     * Sets the value of the sSgGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgGrupoConta(JAXBElement<String> value) {
        this.sSgGrupoConta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sSgPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgPais() {
        return sSgPais;
    }

    /**
     * Sets the value of the sSgPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgPais(String value) {
        this.sSgPais = value;
    }

    /**
     * Gets the value of the tDtCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtCadastro() {
        return tDtCadastro;
    }

    /**
     * Sets the value of the tDtCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtCadastro(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtCadastro = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtInicioAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtInicioAtividade() {
        return tDtInicioAtividade;
    }

    /**
     * Sets the value of the tDtInicioAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtInicioAtividade(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtInicioAtividade = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtIntegralizacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtIntegralizacao() {
        return tDtIntegralizacao;
    }

    /**
     * Sets the value of the tDtIntegralizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtIntegralizacao(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtIntegralizacao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtValidadeCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtValidadeCadastro() {
        return tDtValidadeCadastro;
    }

    /**
     * Sets the value of the tDtValidadeCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtValidadeCadastro(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtValidadeCadastro = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
