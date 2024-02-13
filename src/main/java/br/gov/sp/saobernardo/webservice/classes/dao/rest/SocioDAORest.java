package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.SocioDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.SocioMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.SocioMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.SocioModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class SocioDAORest extends AbstractDAORest<SocioModel, SocioMapperParametro, SocioDAORest> implements SocioDAOInterface {

    public SocioDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public List<SocioModel> listarSociosEmpresa() throws Exception {

        ResultSet resultSet = dao.getResultSet();
        List<SocioModel> socios = new ArrayList<SocioModel>();
        SocioMapperParametro socioParametro = new SocioMapperParametro(this.contexto, socios);
        SocioMapper socioMapper = new SocioMapper(socioParametro);
        
        return socioMapper.listarTodos();
    }
}