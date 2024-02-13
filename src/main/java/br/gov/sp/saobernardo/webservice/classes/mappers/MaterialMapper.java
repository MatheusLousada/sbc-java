package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.MaterialMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;

public class MaterialMapper extends AbstractMapper implements InterfaceMapper<MaterialModel, MaterialMapperParametro> {

    private MaterialMapperParametro materialMapperParametro;

    public MaterialMapper(MaterialMapperParametro p) throws Exception {
        this.materialMapperParametro = p;
        setDados();
    }

    @Override
    public void setDados() throws SQLException {

        ResultSet resultSet = this.materialMapperParametro.getResultSet();
        List<MaterialModel> materiais = this.materialMapperParametro.getMateriais();

        while (resultSet.next()) {
            MaterialModel novaMaterial = new MaterialModel(resultSet.getString("sCdClasseEmpresa"), resultSet.getString("sDsCaminho"));
            materiais.add(novaMaterial);
        }
        
        resultSet.close();
        this.materialMapperParametro.setMateriais(materiais);;
    }

    @Override
    public List<MaterialModel> listarTodos() {
        return this.materialMapperParametro.getMateriais();
    }
}
