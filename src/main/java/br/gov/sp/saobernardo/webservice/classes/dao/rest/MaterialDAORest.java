package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.MaterialDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.MaterialMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.MaterialMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.MaterialModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class MaterialDAORest extends AbstractDAORest<MaterialModel, MaterialMapperParametro, MaterialResponse> implements MaterialDAOInterface {

    public MaterialDAORest(ContextoImportacao contexto, RequestData requestData) {
        super(contexto, requestData);
    }

    public List<MaterialModel> listarMateriaisEmpresa(String cnpj) throws Exception {

        ResultSet resultSet = dao.getResultSet();
        List<MaterialModel> materiais = new ArrayList<MaterialModel>();
        MaterialMapperParametro materialParametro = new MaterialMapperParametro(materiais);
        MaterialMapper materialMapper = new MaterialMapper(materialParametro);
        
        return materialMapper.listarTodos();
    }
}
