package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.DAO;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;

public class CompraDiretaDAO extends DAO {

	public CompraDiretaDAO(Connection con, boolean imprimirSQL) throws Exception {
		super(con, imprimirSQL, Buscador.getDAO());
	}

	public List<CompraDiretaModel> selecionaComprasHomologadas() throws Exception {
		return ((CompraDiretaDAOInterface) super.getDAO()).selecionaComprasHomologadas();
	}

    public List<CompraDiretaModel> selecionaCompraPorProcessoComEdital(String compra, String processo) throws Exception {
		return ((CompraDiretaDAOInterface) super.getDAO()).selecionaCompraPorProcessoComEdital(compra, processo);
	}

    public List<String> selecionaCompraDiretaPorAno(String ano) throws Exception {
		return ((CompraDiretaDAOInterface) super.getDAO()).selecionaCompraDiretaPorAno(ano);
	}
}