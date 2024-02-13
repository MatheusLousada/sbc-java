package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoItemSituacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.PregaoEletronicoItemSituacaoMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemSituacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemSituacao;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class PregaoEletronicoItemSituacaoDAORest extends
        AbstractDAORest<PregaoEletronicoItemSituacao, PregaoEletronicoItemSituacaoMapperParametro, PregaoEletronicoItemSituacaoResponse>
        implements PregaoEletronicoItemSituacaoDAOInterface {

    public PregaoEletronicoItemSituacaoDAORest(ContextoImportacao contexto, RequestData requestData) {
        super(contexto, requestData);
    }

    public PregaoEletronicoItemSituacao listar() throws Exception {

        PregaoEletronicoItemSituacao pregrao = new PregaoEletronicoItemSituacao();
        PregaoEletronicoItemSituacaoMapperParametro itemSituacaoParametro = new PregaoEletronicoItemSituacaoMapperParametro(this.contexto, pregrao);
        PregaoEletronicoItemSituacaoMapper pregaoMapper = new PregaoEletronicoItemSituacaoMapper(itemSituacaoParametro);

        return pregaoMapper.listar();
    }
}