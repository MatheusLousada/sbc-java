package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.DAO;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CategoriaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.CategoriaModel;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;

public class CategoriaDAO extends DAO {

	public CategoriaDAO(Connection con, boolean imprimirSQL) throws Exception {
		super(con, imprimirSQL, Buscador.getDAO());
	}
	
	public CategoriaModel buscaPeloCodigoDoParadigma(Long nCdProduto) throws Exception {
        return ((CategoriaDAOInterface) super.getDAO()).buscaPeloCodigoDoParadigma(nCdProduto);
	}
}
