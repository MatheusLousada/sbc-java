package br.gov.sp.saobernardo.webservice.classes.modelos;

import br.gov.sp.saobernardo.orcom.c7701.C7701;
import br.gov.sp.saobernardo.orcom.c7701.C7701Bean;
import br.gov.sp.saobernardo.orcom.m077.M077;
import br.gov.sp.saobernardo.orcom.m077.M077Bean;
import br.gov.sp.saobernardo.orcom.menusetelas.MenuOrcomM077;
import br.gov.sp.saobernardo.orcom.menusetelas.TelaC7701;

public class BuscadorCodigoFornecedor {
	
	public String buscaCodigoDe(String cnpj, String ambienteORCOM) throws Exception {
 	
		M077 menuDeFornecedores = new MenuOrcomM077( ambienteORCOM ).getMenu();
		M077Bean dadosDoMenuM077 = menuDeFornecedores.loadPage();
		dadosDoMenuM077.setOPCAO2( MenuOrcomM077.MENU_ORCOM_M077_OPCAO_01_PESQUISA_PELO_CNPJ_CPF_RAZAO_SOCIAL );
		
		menuDeFornecedores.submit(dadosDoMenuM077);
		C7701 telaC7701 =  new TelaC7701(menuDeFornecedores,  ambienteORCOM ).getTela();
		
		C7701Bean beanC7701 = telaC7701.redirecionadaDaTela();
		beanC7701.setCGC_CPF(cnpj);
		beanC7701 = telaC7701.executa(beanC7701, false);
		return beanC7701.getCOPYFROM_ORD_TFORN_0();
		//return beanC7701.getCOLOR_ORD_TFORN_0();
	}
	
	public String buscaRazaoSocialDe(String cnpj, String ambienteORCOM) throws Exception {
		M077 telaDoMenuConsultaFornecedor = new MenuOrcomM077( ambienteORCOM ).getMenu();
		M077Bean dadosDaTelaDeMenuFornecedor = telaDoMenuConsultaFornecedor.loadPage();
		dadosDaTelaDeMenuFornecedor.setOPCAO2( MenuOrcomM077.MENU_ORCOM_M077_OPCAO_01_PESQUISA_PELO_CNPJ_CPF_RAZAO_SOCIAL);
		
		telaDoMenuConsultaFornecedor.submit(dadosDaTelaDeMenuFornecedor);
		C7701 telaC7701 =  new TelaC7701(telaDoMenuConsultaFornecedor,  ambienteORCOM ).getTela();
		C7701Bean beanC7701 = telaC7701.redirecionadaDaTela();
		beanC7701.setCGC_CPF(cnpj);
		beanC7701 = telaC7701.executa(beanC7701, false);
		return beanC7701.getCOPYFROM_R_SOCIAL1_0();
		//return beanC7701.getCOLOR_R_SOCIAL1_0();
	}

   
}
