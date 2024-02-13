package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.DAO;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaItemSituacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;

public class CompraDiretaItemSituacaoDAO extends DAO {

	public CompraDiretaItemSituacaoDAO(Connection con, boolean imprimirSQL) throws Exception {
		super(con, imprimirSQL, Buscador.getDAO());
	}

	public CompraDiretaItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws Exception {
		return ((CompraDiretaItemSituacaoDAOInterface) super.getDAO()).buscaPeloCodigoDoParadigma(codigoWBC);
	}
}
