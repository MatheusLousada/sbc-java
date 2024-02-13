package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaComissaoModel;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.enums.TipoPregaoEnum;

public class PregaoEletronicoDAORest extends AbstractDAORest<PregaoEletronicoModel, PregaoEletronicoMapperParametro, PregaoEletronicoResponse> implements PregaoEletronicoDAOInterface {

    public PregaoEletronicoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public List<PregaoEletronicoModel> selecionaPregoesHomologados(String quantidadePregoes) throws Exception {

        List<PregaoEletronicoModel> pregoes = new ArrayList<>();
        
        PregaoEletronicoMapperParametro pregaoEletronicoParametro = new PregaoEletronicoMapperParametro(contexto, pregoes, TipoPregaoEnum.HOMOLOGADO);

        String bodyString = String.format("{\"limit\":\"%s\"}", quantidadePregoes);
        super.getDaoRest().getRequestData().getBody().updateJson(bodyString);
        super.setParametro(pregaoEletronicoParametro);
        pregaoEletronicoParametro.setResponse(super.getDaoRest().getResponse());

        return super.listarTodos();
    }

    public List<PregaoEletronicoModel> selecionaPregaoPorProcessoComEdital(String pregao, String processo) throws Exception {

        List<PregaoEletronicoModel> pregoes = new ArrayList<>();
        PregaoEletronicoMapperParametro pregaoEletronicoParametro = new PregaoEletronicoMapperParametro(contexto, pregoes, TipoPregaoEnum.POR_PROCESSO_COM_EDITAL);
        super.setParametro(pregaoEletronicoParametro);
        pregaoEletronicoParametro.setResponse(super.getDaoRest().getResponse());
        return super.listarTodos();
    }

    public List<String> selecionaPregaoPorAno(final String ano) throws Exception {

        List<String> pregoesString = new ArrayList<String>();
        PregaoEletronicoMapperParametro pregaoEletronicoParametro = new PregaoEletronicoMapperParametro(contexto, pregoesString);

        super.setParametro(pregaoEletronicoParametro);

        List<PregaoEletronicoResponse> pregoes = super.getDaoRest().getResponse();
        for (PregaoEletronicoResponse pregao : pregoes) {
            pregoesString.add(pregao.toString());
        }

        return pregoesString;
    }

    public List<CompraDiretaComissaoModel> listarComissao() throws Exception {

        PregaoEletronicoMapperParametro pregaoEletronicoParametro = new PregaoEletronicoMapperParametro(contexto);
        pregaoEletronicoParametro.setCompras();

        super.setParametro(pregaoEletronicoParametro);

        List<PregaoEletronicoResponse> pregoes = super.getDaoRest().getResponse();
        return pregoes.get(0).getComissao();
    }
}