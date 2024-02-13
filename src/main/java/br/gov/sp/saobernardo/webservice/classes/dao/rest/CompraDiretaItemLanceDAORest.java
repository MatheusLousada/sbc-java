package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaItemLanceDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaItemLanceMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemLanceModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemLanceResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.Buscador;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class CompraDiretaItemLanceDAORest extends AbstractDAORest<CompraDiretaItemLanceModel, CompraDiretaItemLanceMapperParametro, CompraDiretaItemLanceResponse> implements CompraDiretaItemLanceDAOInterface {

    public CompraDiretaItemLanceDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception  {

        super(contexto, requestData);

        List<CompraDiretaItemLanceModel> lances = new ArrayList<CompraDiretaItemLanceModel>();
        CompraDiretaItemLanceMapperParametro compraItemParametro = new CompraDiretaItemLanceMapperParametro(contexto, requestData, lances);
        super.setParametro(compraItemParametro);
    }

    public List<CompraDiretaItemLanceModel> buscaPeloCodigoDoParadigma(Long codigoWBCCompraDireta, Long codigoWBCItem) throws Exception {

        String cnpj = Buscador.getCnpj(Long.toString(codigoWBCCompraDireta));
        String bodyString = String.format("{\"cnpj\":\"%s\", \"itemId\":%d}", cnpj, codigoWBCItem);

        super.getDaoRest().getRequestData().getBody().updateJson(bodyString);
        this.parametro.setResponse(super.getDaoRest().getResponse());

        return this.listarTodos();
    }

    public List<CompraDiretaItemLanceModel> listarTodos() throws Exception {
        return super.listarTodos();
    }
}