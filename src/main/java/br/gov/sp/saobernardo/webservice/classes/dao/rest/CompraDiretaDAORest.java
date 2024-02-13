package br.gov.sp.saobernardo.webservice.classes.dao.rest;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.dao.abstracts.AbstractDAORest;
import br.gov.sp.saobernardo.webservice.classes.dao.interfaces.CompraDiretaDAOInterface;
import br.gov.sp.saobernardo.webservice.classes.mappers.CompraDiretaMapper;
import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaResponse;
import br.gov.sp.saobernardo.webservice.classes.utils.ContextoImportacao;
import br.gov.sp.saobernardo.webservice.licitar_digital.utils.RequestData;
import br.gov.sp.saobernardo.webservice.enums.TipoCompraEnum;

public class CompraDiretaDAORest extends AbstractDAORest<CompraDiretaModel, CompraDiretaMapperParametro, CompraDiretaResponse> implements CompraDiretaDAOInterface {

    public CompraDiretaDAORest(ContextoImportacao contexto, RequestData requestData) throws Exception {
        super(contexto, requestData);
    }

    public List<CompraDiretaModel> selecionaComprasHomologadas() throws Exception {

        CompraDiretaMapperParametro compraDiretaParametro = new CompraDiretaMapperParametro(contexto, TipoCompraEnum.HOMOLOGADA);
        CompraDiretaMapper compraDiretaMapper = new CompraDiretaMapper(compraDiretaParametro);

        return compraDiretaMapper.listarComprasHomologadas();
    }

    public List<CompraDiretaModel> selecionaCompraPorProcessoComEdital(String compra, String processo) throws Exception {
        
        CompraDiretaMapperParametro compraDiretaParametro = new CompraDiretaMapperParametro(contexto, TipoCompraEnum.POR_PROCESSO_COM_EDITAL);
        CompraDiretaMapper compraDiretaMapper = new CompraDiretaMapper(compraDiretaParametro);

        return compraDiretaMapper.listarComprasPorProcessoComEdital();
    }

    public List<String> selecionaCompraDiretaPorAno(String ano) throws Exception {

        CompraDiretaMapperParametro compraDiretaParametro = new CompraDiretaMapperParametro(contexto, TipoCompraEnum.DIRETA_POR_ANO);
        CompraDiretaMapper compraDiretaMapper = new CompraDiretaMapper(compraDiretaParametro);

        return compraDiretaMapper.listarComprasDiretasPorAno();
    }
}
