package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaItemSituacaoDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaItemSituacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemSituacaoResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;

public class CompraDiretaItemSituacaoDAORest extends AbstractDAORest<CompraDiretaItemSituacao, CompraDiretaItemSituacaoMapperParametro, CompraDiretaItemSituacaoResponse> implements CompraDiretaItemSituacaoDAOInterface {

    public CompraDiretaItemSituacaoDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {

        super(contexto, requestData);
        
        CompraDiretaItemSituacao situacao = new CompraDiretaItemSituacao();
        CompraDiretaItemSituacaoMapperParametro compraItemParametro = new CompraDiretaItemSituacaoMapperParametro(contexto, situacao);
        super.setParametro(compraItemParametro);
    }

    public CompraDiretaItemSituacao buscaPeloCodigoDoParadigma(Long codigoWBC) throws Exception{
        return this.listar();
    }

    public CompraDiretaItemSituacao listar() throws Exception {
        return super.listar();
    }
}
