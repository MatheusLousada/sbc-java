package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.PregaoEletronicoPrazoDeEntregaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.PregaoEletronicoPrazoDeEntregaMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoPrazoDeEntregaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoPrazoDeEntregaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.PregaoEletronicoPrazoDeEntregaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class PregaoEletronicoPrazoDeEntregaDAORest extends AbstractDAORest<PregaoEletronicoPrazoDeEntregaModel, PregaoEletronicoPrazoDeEntregaMapperParametro, PregaoEletronicoPrazoDeEntregaResponse> implements PregaoEletronicoPrazoDeEntregaDAOInterface {

    public PregaoEletronicoPrazoDeEntregaDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public PregaoEletronicoPrazoDeEntregaModel buscaPeloCodigoDoParadigma(Long codigoWBC) throws Exception {

        final PregaoEletronicoPrazoDeEntregaModel pregao = new PregaoEletronicoPrazoDeEntregaModel();
        PregaoEletronicoPrazoDeEntregaMapperParametro pregaoEletronicoParametro = new PregaoEletronicoPrazoDeEntregaMapperParametro(contexto, pregao);
        PregaoEletronicoPrazoDeEntregaMapper pregaoEletronico = new PregaoEletronicoPrazoDeEntregaMapper(pregaoEletronicoParametro);
        pregaoEletronico.setDados();
        DAORest<PregaoEletronicoPrazoDeEntregaModel> dao = new DAORest<PregaoEletronicoPrazoDeEntregaModel>(this.contexto, this.requestData, "PregaoEletronicoPrazoDeEntrega");
        
        return dao.getResponse().get(0);
    }
}