package br.gov.sp.saobernardo.webservice.classes.modelos;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.classes.utils.Validadores;

public class EmpresaModel {

	/** Situacao da Empresa */
	public static final int SITUACAO_INATIVA = 0;
	public static final int SITUACAO_ATIVA = 1;
	public static final int SITUACAO_PROCESSO_EXTERNO = 2;
	public static final int SITUACAO_HOMOLOGACAO = 3;
	public static final int SITUACAO_NAO_APROVADA = 4;
	public static final int SITUACAO_EXPORTACAO = 5;
	public static final int SITUACAO_CLIC_BUSSINES = 32;

	/** Tipo da Empresa */
	public static final int TIPO_ADMINISTRADORA = 1;
	public static final int TIPO_COMPRADORA = 2;
	public static final int TIPO_VENDEDORA = 3;
	public static final int TIPO_TRANSPORTADORA = 5;

	Validadores validador;

	TratamentoDeString trataString;

	/**
	 * Código ou CNPJ da empresa no sistema cliente
	 */
	private String codigoEmpresa;

	private String codigoFornecedor;

	private String cnpj;

	/** String 100 Razão Social da empresa */
	private String nomeEmpresa;

	/** String 100 Fantasia da empresa */
	private String nomeFantasia;

	private EnderecoModel endereco;

	private EnderecoModel enderecoCorrespondencia;

	private SituacaoEmpresa situacao;

	private TipoEmpresa tipoEmpresa;

	private MicroOuPequenoPorte microOuPequenoPorte;

	/**
	 * sDsEmailContato String 250 Não obrigatório. E-mail de contato da empresa
	 */
	private String emailContato;

	private LogDeRetornoDaGravacao logDaGravacao;
	private int beneficiarioLei123;

	private String inscricaoMunicipal;

	private String inscricaoEstadual;

	private String ddd;

	private String telefone1;

	private String telefone2;

	private String fax;

	private BancoModel banco;

	private String tipoIdentificacao;

	private List<MaterialModel> materiais = new ArrayList<MaterialModel>();

	private CertidaoNegTributosMunicipaisMobi certidaoNegTributosMunicipaisMobi;

	private CertidaoNegTributosEstaduais certidaoNegTributosEstaduais;

	private CertidaoNegTributosFederais certidaoNegTributosFederais;

	private CertidaoNegDebitosTrabalhistas certidaoNegDebitosTrabalhistas;

	private CertidaoNegFalenciaEConcordata certidaoNegFalenciaEConcordata;
	private CertidaoDeRegularidadeDoFGTS certidaoDeRegularidadeDoFGTS;

	private List<SocioModel> socios = new ArrayList<SocioModel>();

	private String fornecedorCredor;

	public EmpresaModel() {
		validador = new Validadores();
		trataString = new TratamentoDeString();
		fornecedorCredor = "F";
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/** Sera sempre utilizado o CNPJ da empresa */
	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
		this.codigoEmpresa = validador.maxLen(this.cnpj, Validadores.CNPJ_SIZE);
	}

	public void setCodigo(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		String cnpjOK = validador.maxLen(cnpj, Validadores.CNPJ_SIZE);
		this.cnpj = cnpjOK;
		this.codigoEmpresa = cnpjOK;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = TratamentoDeString.removerAcentos( validador.maxLen(nomeEmpresa, 100) );
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = TratamentoDeString.removerAcentos( validador.maxLen(nomeFantasia, 100) );
	}

	public EnderecoModel getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}

	public EnderecoModel getEnderecoCorrespondencia() {
		return enderecoCorrespondencia;
	}

	public void setEnderecoCorrespondencia(EnderecoModel enderecoCorrespondencia) {
		this.enderecoCorrespondencia = enderecoCorrespondencia;
	}

	public SituacaoEmpresa getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEmpresa situacao) {
		this.situacao = situacao;
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public MicroOuPequenoPorte getMicroOuPequenoPorte() {
		return microOuPequenoPorte;
	}

	public void setMicroOuPequenoPorte(MicroOuPequenoPorte microOuPequenoPorte) {
		this.microOuPequenoPorte = microOuPequenoPorte;
	}

	public LogDeRetornoDaGravacao getLogDaGravacao() {
		return logDaGravacao;
	}

	public void setLogDaGravacao(LogDeRetornoDaGravacao logDaGravacao) {
		this.logDaGravacao = logDaGravacao;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		boolean isNulo = null == emailContato;
		this.emailContato = isNulo ? "" : TratamentoDeString.removerAcentos( validador.maxLen(emailContato, 250));
	}

	public int getBeneficiarioLei123() {
		return beneficiarioLei123;
	}

	public void setBeneficiarioLei123(int valor) {
		this.beneficiarioLei123 = valor;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = validador.valorNaoPodeSer(inscricaoMunicipal, new String[] { "1", "" });
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		if (null != inscricaoEstadual) {
			this.inscricaoEstadual = validador.valorNaoPodeSer(trataString.removeNaoNumericos(inscricaoEstadual),
					new String[] { "1", "" });
		}
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public BancoModel getBanco() {
		return banco;
	}

	public void setBanco(BancoModel banco) {
		this.banco = banco;
	}

	public String getTipoIdentificacao() {
		return tipoIdentificacao;
	}

	public void setTipoIdentificacao(String tipoIdentificacao) {
		this.tipoIdentificacao = tipoIdentificacao;
	}

	public List<MaterialModel> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<MaterialModel> materiais) {
		this.materiais = materiais;
	}

	public CertidaoNegTributosMunicipaisMobi getCertidaoNegTributosMunicipaisMobi() {
		return certidaoNegTributosMunicipaisMobi;
	}

	public void setCertidaoNegTributosMunicipaisMobi(
			CertidaoNegTributosMunicipaisMobi certidaoNegTributosMunicipaisMobi) {
		this.certidaoNegTributosMunicipaisMobi = certidaoNegTributosMunicipaisMobi;
	}

	public CertidaoNegTributosEstaduais getCertidaoNegTributosEstaduais() {
		return certidaoNegTributosEstaduais;
	}

	public void setCertidaoNegTributosEstaduais(CertidaoNegTributosEstaduais certidaoNegTributosEstaduais) {
		this.certidaoNegTributosEstaduais = certidaoNegTributosEstaduais;
	}

	public CertidaoNegTributosFederais getCertidaoNegTributosFederais() {
		return certidaoNegTributosFederais;
	}

	public void setCertidaoNegTributosFederais(CertidaoNegTributosFederais certidaoNegTributosFederais) {
		this.certidaoNegTributosFederais = certidaoNegTributosFederais;
	}

	public CertidaoNegDebitosTrabalhistas getCertidaoNegDebitosTrabalhistas() {
		return certidaoNegDebitosTrabalhistas;
	}

	public void setCertidaoNegDebitosTrabalhistas(CertidaoNegDebitosTrabalhistas certidaoNegDebitosTrabalhistas) {
		this.certidaoNegDebitosTrabalhistas = certidaoNegDebitosTrabalhistas;
	}

	public CertidaoNegFalenciaEConcordata getCertidaoNegFalenciaEConcordata() {
		return certidaoNegFalenciaEConcordata;
	}

	public void setCertidaoNegFalenciaEConcordata(CertidaoNegFalenciaEConcordata certidaoNegFalenciaEConcordata) {
		this.certidaoNegFalenciaEConcordata = certidaoNegFalenciaEConcordata;
	}

	public List<SocioModel> getSocios() {
		return socios;
	}

	public void setSocios(List<SocioModel> socios) {
		this.socios = socios;
	}

	public String getFornecedorCredor() {
		return fornecedorCredor;
	}

	public void setFornecedorCredor(String fornecedorCredor) {
		this.fornecedorCredor = fornecedorCredor;
	}
 
	@Override
	public String toString() {
		return "EmpresaModel [" + codigoEmpresa + "] fornecedor[" + codigoFornecedor + "] cnpj["
				+ cnpj + "] nome[" + nomeEmpresa + "]";
	}

	public final CertidaoDeRegularidadeDoFGTS getCertidaoDeRegularidadeDoFGTS() {
		return certidaoDeRegularidadeDoFGTS;
	}

	public final void setCertidaoDeRegularidadeDoFGTS(CertidaoDeRegularidadeDoFGTS certidaoDeRegularidadeDoFGTS) {
		this.certidaoDeRegularidadeDoFGTS = certidaoDeRegularidadeDoFGTS;
	}

}
