package br.gov.sp.saobernardo.webservice.classes.modelos;

import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.classes.utils.Validadores;

public class EnderecoModel {

	private String bairro;
	private String cep;
	private String cidade;
	private String descricao;
	private String complemento;
	private String siglaPais;
	private long tipoEndereco;
	private String uf;
	private String numero;

	Validadores validador;
	TratamentoDeString trataString;

	public EnderecoModel() {
		validador = new Validadores();
		trataString = new TratamentoDeString();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = TratamentoDeString.removerAcentos(validador.maxLen(bairro, 40));
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = validador.maxLen(cep.replace("-", ""), 10);
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = TratamentoDeString.removerAcentos(validador.maxLen(cidade, 100));
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = TratamentoDeString.removerAcentos(validador.maxLen(descricao, 200));
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		final String txt = complemento == null ? "" : complemento;
		this.complemento = TratamentoDeString.removerAcentos(validador.maxLen(txt, 20));
	}

	public String getSiglaPais() {
		return siglaPais;
	}

	public void setSiglaPais(String siglaPais) {
		this.siglaPais = TratamentoDeString.removerAcentos(validador.maxLen(siglaPais, 3));
	}

	public long getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(long tipoEmpresa) {
		this.tipoEndereco = tipoEmpresa;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = TratamentoDeString.removerAcentos(validador.maxLen(uf, 2));
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (null != numero) {
			this.numero = trataString.removeNaoNumericos(numero);
		}
	}

}
