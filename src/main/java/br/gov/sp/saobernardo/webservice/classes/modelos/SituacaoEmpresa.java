package br.gov.sp.saobernardo.webservice.classes.modelos;

public class SituacaoEmpresa {
	public static final long INATIVA = (long) 0;
	public static final long ATIVA = (long) 1;
	public static final long PROCESSO_EXTERNO = (long) 2;
	public static final long HOMOLOGACAO = (long) 3;
	public static final long NAO_APROVADA = (long) 4;
	public static final long EXPORTACAO = (long) 5;
	public static final long CLIC_BUSSINES = (long) 32;

	private long situacao;

	public SituacaoEmpresa(long l) {
		if (l >= 0 && l < 6 || l == 32) {
			this.situacao = l;
		} else {
			throw new RuntimeException("Situacao de empresa invalida");
		}
	}

	public long getSituacaoEmpresa() {
		return this.situacao;
	}
}