package br.gov.sp.saobernardo.webservice.classes.modelos.pregao;

public class PregaoEletronicoItemProposta {

	private String marca;
	private String numeroDoRegistro;
	private String embalagem;
	private String modelo;
	private String fabricante;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroDoRegistro() {
		return numeroDoRegistro;
	}

	public void setNumeroDoRegistro(String numeroDoRegistro) {
		this.numeroDoRegistro = numeroDoRegistro;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
