package br.gov.sp.saobernardo.webservice.integracao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.orcom.controller.ORCOMFornecedorController;
import br.gov.sp.saobernardo.webservice.orcom.controller.ParadigmaFornecedorController;

public class MarcaTodasEmpresasDaWBCComoWBCNoORCOM {

	private boolean imprimeQuery;
	private String ambiente;

	public MarcaTodasEmpresasDaWBCComoWBCNoORCOM(String ambiente, boolean imprimeQuery) {
		this.imprimeQuery = imprimeQuery;
		this.ambiente = ambiente;
	}

	public void executa() throws Exception {
		ParadigmaFornecedorController fornecedorWBC = new ParadigmaFornecedorController(ambiente, imprimeQuery);
		ORCOMFornecedorController fornecedorORCOM = new ORCOMFornecedorController(ambiente, imprimeQuery);

		List<EmpresaModel> empresasParadigma = fornecedorWBC.buscaTodas();

		Map<String, Boolean> retornosTrue = new HashMap<String, Boolean>();
		Map<String, Boolean> retornosFalse = new HashMap<String, Boolean>();

		for (EmpresaModel empresaParadigma : empresasParadigma) {
			String cnpj = empresaParadigma.getCnpj();

			boolean retorno = fornecedorORCOM.marcaFornecedorComoWBCNoORCOM(cnpj);
			if (retorno) {
				retornosTrue.put(cnpj, retorno);
			} else {
				retornosFalse.put(cnpj, retorno);
			}
		}

		verificaRetorno(empresasParadigma, retornosTrue);
		verificaRetorno(empresasParadigma, retornosFalse);

	}

	public void verificaRetorno(List<EmpresaModel> empresasParadigma, Map<String, Boolean> retorno) {
		for (EmpresaModel empresaParadigma : empresasParadigma) {
			String cnpj = empresaParadigma.getCnpj();
			if (retorno.containsKey(cnpj)) {
				boolean valorRetorno = retorno.get(cnpj);
				if (valorRetorno) {
					System.out.println(String.format("Tentando alterar a empresa %s obteve %s como retorno!", cnpj,
							String.valueOf(valorRetorno)));
				}
			}
		}
	}
}
