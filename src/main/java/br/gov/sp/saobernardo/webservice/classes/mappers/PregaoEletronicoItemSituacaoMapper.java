package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.sql.ResultSet;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.PregaoEletronicoItemSituacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoItemSituacao;

public class PregaoEletronicoItemSituacaoMapper extends AbstractMapper implements InterfaceMapper<PregaoEletronicoItemSituacao, PregaoEletronicoItemSituacaoMapperParametro> {

    private PregaoEletronicoItemSituacaoMapperParametro pregaoEletronicoItemSituacaoParametro;

    public PregaoEletronicoItemSituacaoMapper(PregaoEletronicoItemSituacaoMapperParametro p) throws Exception {
        this.pregaoEletronicoItemSituacaoParametro = p;
        setDados();
    }

    @Override
    public void setDados() throws Exception {

        ResultSet resultSet = this.pregaoEletronicoItemSituacaoParametro.getResultSet();
        PregaoEletronicoItemSituacao situacao = this.pregaoEletronicoItemSituacaoParametro.getSituacao();

        while (resultSet.next()) {

            int codigo = resultSet.getInt("nCdSituacao");
            String descricao = resultSet.getString("sDsSituacao");

            situacao.setCodigo(codigo);
            situacao.setDescricao(descricao);
        }
        
        resultSet.close();
        this.pregaoEletronicoItemSituacaoParametro.setSituacao(situacao);
    }

    @Override
    public PregaoEletronicoItemSituacao listar() {
        return this.pregaoEletronicoItemSituacaoParametro.getSituacao();
    }
}
