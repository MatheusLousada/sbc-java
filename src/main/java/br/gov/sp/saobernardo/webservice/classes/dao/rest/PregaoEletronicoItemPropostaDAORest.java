package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemPropostaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemPropostaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemProposta;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class PregaoEletronicoItemPropostaDAORest extends AbstractDAORest<PregaoEletronicoItemProposta, PregaoEletronicoItemPropostaMapperParametro, PregaoEletronicoItemPropostaResponse> implements PregaoEletronicoItemPropostaDAOInterface {

    public PregaoEletronicoItemPropostaDAORest(ContextoImportacao contexto, RequestData requestData) {
        super(contexto, requestData);
    }

    public PregaoEletronicoItemProposta listar() throws Exception {
        
        PregaoEletronicoItemProposta proposta = new PregaoEletronicoItemProposta();
        PregaoEletronicoItemPropostaMapperParametro pregaoPropostaParametro = new PregaoEletronicoItemPropostaMapperParametro(contexto, requestData, proposta);
        
        return super.listar();
    }
}