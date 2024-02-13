package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CotacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.CotacaoMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CotacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CotacaoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class CotacaoDAORest extends AbstractDAORest<CotacaoModel, CotacaoMapperParametro, CotacaoResponse> implements CotacaoDAOInterface {

    public CotacaoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {

        super(contexto, requestData);
        
        CotacaoMapperParametro cotacaoParametro = new CotacaoMapperParametro(contexto, this.requestData);
        super.setParametro(cotacaoParametro);
    }

    public List<String> selecionaCotacoesEncerradasDescricao(String ano) throws Exception {

        CotacaoMapper cotacao = new CotacaoMapper(this.getParametro());
        return cotacao.selecionaCotacoesEncerradasDescricao(ano);
    }

    public List<CotacaoModel> selecionaCotacoesEncerradas(int ano, int mes) throws Exception {

        // setar body
        CotacaoMapper cotacao = new CotacaoMapper(this.getParametro());
        return cotacao.listarTodos();
    }

    public List<Integer> filtraAnosComCotacoesEncerradas() throws Exception {

        CotacaoMapper cotacao = new CotacaoMapper(this.getParametro());
        return cotacao.filtraAnosComCotacoesEncerradas();
    }

    public Boolean isProcessoComCotacoesEncerradas(String processo) throws Exception {

        CotacaoMapper cotacao = new CotacaoMapper(this.getParametro());
        return cotacao.isProcessoComCotacoesEncerradas(processo);
    }
}