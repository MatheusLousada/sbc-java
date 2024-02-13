package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;

public interface CompraDiretaDAOInterface {

    List<CompraDiretaModel> selecionaComprasHomologadas() throws SQLException, Exception;

    List<CompraDiretaModel> selecionaCompraPorProcessoComEdital(String compra, String processo) throws SQLException, Exception;

    List<String> selecionaCompraDiretaPorAno(String ano) throws SQLException, Exception;
}
