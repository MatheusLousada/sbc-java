package br.gov.sp.saobernardo.webservice.classes.modelos;

import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;

public class MaterialModel {

	private String grupo;
	private String subGrupo;
	private String descricao;
	private TratamentoDeString trataString;

	public MaterialModel(String grupoESubGrupo, String descricao) {
		trataString = new TratamentoDeString();
		if (null != grupoESubGrupo) {
			grupo = grupoESubGrupo.substring(0, 2);
			subGrupo = trataString.removeZerosAEsquerda(grupoESubGrupo.substring(2, 4));
		}
		this.descricao = descricao;
	}
	
	public MaterialModel() {}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSubGrupo() {
		return subGrupo;
	}

	public void setSubGrupo(String subGrupo) {
		this.subGrupo = subGrupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
