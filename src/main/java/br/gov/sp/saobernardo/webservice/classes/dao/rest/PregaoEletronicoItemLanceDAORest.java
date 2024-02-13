package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemLanceDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemLanceMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class PregaoEletronicoItemLanceDAORest extends AbstractDAORest<PregaoEletronicoItemLanceModel, PregaoEletronicoItemLanceMapperParametro, PregaoEletronicoItemLanceResponse> implements PregaoEletronicoItemLanceDAOInterface {

    public PregaoEletronicoItemLanceDAORest(ContextoImportacao contexto, RequestData requestData) {
        super(contexto, requestData);
    }

    public PregaoEletronicoItemLanceModel listar() throws Exception {
        
        List<PregaoEletronicoItemLanceModel> pregoes = new ArrayList<>();
        PregaoEletronicoItemLanceMapperParametro itemLanceParametro = new PregaoEletronicoItemLanceMapperParametro(this.contexto, this.requestData, pregoes);
       
        return super.listar();
    }

    public List<PregaoEletronicoItemLanceModel> listarTodos() throws Exception {

        List<PregaoEletronicoItemLanceModel> pregoes = new ArrayList<>();
        PregaoEletronicoItemLanceMapperParametro itemLanceParametro = new PregaoEletronicoItemLanceMapperParametro(this.contexto, this.requestData, pregoes);
       
        return super.listarTodos();
    }
}