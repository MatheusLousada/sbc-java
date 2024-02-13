package br.gov.sp.saobernardo.webservice.classes.modelos.depara;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import br.gov.sp.saobernardo.orcom.cforx.CFORXBean;
import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;
import br.gov.sp.saobernardo.webservice.classes.utils.TratamentoDeString;
import br.gov.sp.saobernardo.webservice.paradigma.log.ArquivoDeLog;

public class DeParaDadosCadastrais {

	private static final int MAX_LARGURA_RSOCIAL_50 = 50;
	private Map<String, String> mapa;
	private ArquivoDeLog log;

	public DeParaDadosCadastrais(ArquivoDeLog log) {
		mapa = new HashMap<String, String>();
		mapa.put("R_SOCIAL", "nomeEmpresa");
		mapa.put("INSC_EST", "inscricaoEstadual");
		mapa.put("DDD", "ddd");
		mapa.put("DDDC", "ddd");
		mapa.put("TEL1", "telefone1");
		mapa.put("TEL1C", "telefone1");
		mapa.put("TEL2", "telefone2");
		mapa.put("TEL2C", "telefone2");
		mapa.put("FAXN", "fax");
		mapa.put("FAXNC", "fax");
		mapa.put("EMAILCORR", "emailContato");
		mapa.put("TP_IDENT_WS", "tipoIdentificacao");
		mapa.put("TP_FC_WS", "fornecedorCredor");

		this.log = log;
	}
// 43894609000164
	public void populaDados(EmpresaModel de, CFORXBean para)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<? extends CFORXBean> classeCFORXBEAN = para.getClass();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			Class<? extends EmpresaModel> classeEmpresaModel = de.getClass();
			Field campoEmpresaModel = classeEmpresaModel.getDeclaredField(entry.getValue());
			campoEmpresaModel.setAccessible(true);

			Field campoCFORXBEAN = classeCFORXBEAN.getDeclaredField(entry.getKey());
			//log.adiciona("Analisando campo '" + entry.getKey() + "'...");
			campoCFORXBEAN.setAccessible(true);
			Object valorDe = campoEmpresaModel.get(de);
			Object valorPara = campoCFORXBEAN.get(para);
			
			if ("nomeEmpresa".equals(campoEmpresaModel.getName())) {
				valorDe =(Object)TratamentoDeString.removerAcentos(valorDe.toString() );
			}
			
			if (valorDe != null && !valorPara.equals(valorDe)) {
				
				final String vDe = TratamentoDeString.removerAcentos(valorDe.toString());
				if ("nomeEmpresa".equals(campoEmpresaModel.getName())/* && valorDe.toString().length() >= MAX_LARGURA_RSOCIAL_50*/) {
					
					// Campos R_SOCIAL e R_SOCIAL2 (2a linha da Razao Social no ORCOM)
					final boolean isMaiorQue50 = vDe.length() >= MAX_LARGURA_RSOCIAL_50;
					final String rsoc1 =isMaiorQue50 ? vDe.substring(0, MAX_LARGURA_RSOCIAL_50) : vDe;
					
					final String rsocial2 = rsoc1.length() >= MAX_LARGURA_RSOCIAL_50
							? TratamentoDeString.removerAcentos(vDe.substring(MAX_LARGURA_RSOCIAL_50))
							: " ";

					Field campoRazaoSocial2 = classeCFORXBEAN.getDeclaredField("R_SOCIAL2");
					campoRazaoSocial2.setAccessible(true);
					
					campoCFORXBEAN.set(para, rsoc1);
					campoRazaoSocial2.set(para, TratamentoDeString.removerAcentos(  rsocial2) );
					
					//log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString().substring(0, MAX_LARGURA_RSOCIAL_50));
					//log.adiciona("nomeEmpresa2: ", valorParaRazaoSocial2.toString(), rsocial2);
					
				} else {
					// Campo R_SOCIAL
					campoCFORXBEAN.set(para, valorDe);
					log.adiciona(entry.getValue(), valorPara.toString(), valorDe.toString());
				}

			}
		}
	}

}
