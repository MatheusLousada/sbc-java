package br.gov.sp.saobernardo.webservice.paradigma.dao;

import java.sql.Connection;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.DAO;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.BancoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.modelos.BancoModel;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;

public class BancoDAO extends DAO {

    public BancoDAO(Connection con, boolean imprimirSQL) throws Exception {
        super(con, imprimirSQL, Buscador.getDAO());
    }

    public BancoModel buscaPeloCodigoDeEmpresaParadigma(Long codigoWBCEmpresa) throws Exception {
        return ((BancoDAOInterface) super.getDAO()).buscaPeloCodigoDeEmpresaParadigma(codigoWBCEmpresa);
    }
}
