package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CompraDiretaItemSituacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.compradireta.CompraDiretaItemSituacao;
import br.gov.sp.saobernardo.webservice.classes.responses.CompraDiretaItemSituacaoResponse;

public class CompraDiretaItemSituacaoMapper extends AbstractMapper<CompraDiretaItemSituacao, CompraDiretaItemSituacaoMapperParametro, CompraDiretaItemSituacaoResponse> {

    CompraDiretaItemSituacaoMapperParametro compraDiretaItemSituacaoMapperParametro;

    public CompraDiretaItemSituacaoMapper(CompraDiretaItemSituacaoMapperParametro p) throws Exception {
        
        super(p);
        this.compraDiretaItemSituacaoMapperParametro = super.getParametro();
        this.setDados();
    }

    @Override
    public void setDados() throws Exception {

        
        CompraDiretaItemSituacao situacao = this.compraDiretaItemSituacaoMapperParametro.getSituacao();

        while (resultSet.next()) {
            situacao.setCodigo(resultSet.getInt("nCdSituacao"));
            situacao.setDescricao(resultSet.getString("sDsSituacao"));
        }

        resultSet.close();
        this.compraDiretaItemSituacaoMapperParametro.setSituacao(situacao);
    }

    @Override
    public CompraDiretaItemSituacao listar() throws Exception {
        return this.compraDiretaItemSituacaoMapperParametro.getSituacao();
    }
}
