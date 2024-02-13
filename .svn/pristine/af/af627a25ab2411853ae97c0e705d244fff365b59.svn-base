package br.gov.sp.saobernardo.webservice.paradigma.log;

import org.apache.log4j.Logger;

import br.gov.sp.saobernardo.webservice.paradigma.dao.Ambientes;

public class ArquivoDeLog {
	private static final String AMBIENTE = "AMBIENTE";
	private Logger logger;

	public ArquivoDeLog(Logger logger) {
		this.logger = logger;
	}

	public ArquivoDeLog()   {
		this.logger = Logger.getLogger(ArquivoDeLog.class);
	}

	public void adiciona(String mensagem) {
		logger.info(detalheExecucao() + "  " + mensagem);
	}

	public void adiciona(String campo, String de, String para) {
		logger.info(detalheExecucao() + "  " + "Campo:" + campo + ". De: " + de + " para: " + para);
	}

	private boolean isProducao() {
		//return true;
		return System.getenv(AMBIENTE).equals(Ambientes.ORCOM_PRODUCAO);
	}

	private String detalheExecucao() {
		StackTraceElement y = Thread.currentThread().getStackTrace()[3];
		final String classNome = y.getClassName();

		String[] name = classNome.split(".");
		StringBuilder np = new StringBuilder();
		for (String n : name) {
			if (!n.equals(classNome)) {
				np.append(n.charAt(0));
				np.append(".");
			}
		}
		np.append(y.getFileName());

		String x = np.toString() + "." + y.getMethodName() + ":" + y.getLineNumber();
		return (isProducao() ? "" : "[" + x + "]");
	}

	public void erro(String mensagem) {
		logger.error(detalheExecucao() + mensagem);

	}

	public void excecao(Exception e) {
		logger.info(e);
	}

	public void rotina( String tela, String titulo ){
		rotina( String.format( "%s - %s", tela, titulo ) );
	}
	public void rotina(String titulo) {
		StringBuilder s = new StringBuilder();
		s.append("%0");
		s.append(titulo.length());
		s.append("d");
		String formato = s.toString() ;
		final String linha = String.format(formato, 0).replace("0", "_");
		this.adiciona(" ");
		this.adiciona(" ");
		this.adiciona(linha);
		this.adiciona(titulo);
		this.adiciona(linha);
	}

	public void erroXSeed(String xseedmsg, String codigoFornecedor, String cnpj, String rsocial) {
		//this.adiciona(String.format("Resultado de submit.getXSEEDMSG() = '%s'", xseedmsg));
		
		String msgPassou ="Dados do fornecedor (codigo '%s' %s [%s]) submetidos com sucesso. %s";
		String msgFalhou ="Fornecedor (codigo '%s') %s [%s] : %s";
		if ("".equals(xseedmsg) || xseedmsg.isEmpty()) {
			this.adiciona(String.format( msgPassou, codigoFornecedor, rsocial, cnpj, xseedmsg) );
		} else {
			this.erro(String.format( msgFalhou, codigoFornecedor, rsocial, cnpj, xseedmsg) );
		}
	}

}
