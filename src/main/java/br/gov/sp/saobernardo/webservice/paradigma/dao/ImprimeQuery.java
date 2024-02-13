package br.gov.sp.saobernardo.webservice.paradigma.dao;

@Deprecated
public class ImprimeQuery {
	public static void imprimeQuery(String sql, String... parametros) {
		
		String novaQuery = sql;
		/*for(int i = 0; i<sb.length();i++){
			novaQuery += sb.
		}*/
		
		for (String parametro : parametros) {
			boolean ehInteiro = true;
			
			try{
				Long.valueOf(parametro);
			}catch (Exception e){
				ehInteiro = false;
			}
			if(ehInteiro){				
				novaQuery = novaQuery.replaceFirst("\\?", parametro);
			}else{
				novaQuery = novaQuery.replaceFirst("\\?", "'" + parametro + "'");				
			}
		}
		final StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
		String callerClassName = stackTraceElement.getClassName().replace("br.gov.sp.saobernardo.webservice.paradigma.orcom.dao.", "");
		String c = callerClassName.substring(callerClassName.lastIndexOf('.') + 1);
		String m= stackTraceElement.getMethodName();
		int n = stackTraceElement.getLineNumber();
	 
		System.out.println(String.format("Chamado por: %s.%s()[%d] > %s", c, m,n, novaQuery));
	}
}
