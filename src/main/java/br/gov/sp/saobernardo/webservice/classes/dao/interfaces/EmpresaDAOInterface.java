package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.EmpresaModel;

public interface EmpresaDAOInterface {

    public abstract EmpresaModel buscaPeloCodigoDaParadigma(Long codigoWBC) throws SQLException, Exception;
    
    public abstract List<EmpresaModel> buscaTodasEmpresasAlteradasRecentemente() throws SQLException, Exception;
    
    public abstract List<EmpresaModel> buscaTodasEmpresas() throws SQLException, Exception;
    
    public abstract List<EmpresaModel> buscaDadosCadastraisDeEmpresas() throws SQLException, Exception;
    
    public abstract List<EmpresaModel> buscaDadosCadastraisDeNovasEmpresas() throws SQLException, Exception;
    
    public abstract EmpresaModel buscaPeloCnpj(String cnpj) throws SQLException, Exception;
    
    public abstract EmpresaModel buscaNovoPeloCnpj(String cnpj) throws SQLException, Exception;

    public abstract List<String> listaCnpj() throws SQLException, Exception;
}
