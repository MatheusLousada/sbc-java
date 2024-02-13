package br.gov.sp.saobernardo.webservice.classes.modelos;

public class TipoEmpresa {

	/**  ADMINISTRADORA(1), COMPRADORA(2), VENDEDORA(3), TRANSPORTADORA(5); */
	
	private long tipo;

	public TipoEmpresa(long l) {
		if (l >= 1 && l <= 3 || l == 5 || l == 0) {
			this.tipo = l;
		} else {

			throw new IllegalArgumentException("Tipo de Empresa invalido " + l);
		}
	}

	public long getTipo() {
		return this.tipo;
	}
}
