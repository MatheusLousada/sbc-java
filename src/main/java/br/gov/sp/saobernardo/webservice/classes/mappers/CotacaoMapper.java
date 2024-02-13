package br.gov.sp.saobernardo.webservice.classes.mappers;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.mappers.parametros.CotacaoMapperParametro;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;
import br.gov.sp.saobernardo.webservice.classes.responses.CotacaoResponse;

public class CotacaoMapper extends AbstractMapper<CotacaoModel, CotacaoMapperParametro, CotacaoResponse> {

    private CotacaoMapperParametro cotacaoMapperParametro;
    private List<CotacaoModel> cotacoes;

    public CotacaoMapper(CotacaoMapperParametro p) throws Exception {
        
        super(p);
        this.cotacaoMapperParametro = super.getParametro();
        this.setDados();
    }

    @Override
    public void setDados() throws Exception {

        switch (this.cotacaoMapperParametro.getRequestData().getBody().getAction()) {

            case "selecionaCotacoesEncerradasDescricao":
                this.selecionaCotacoesEncerradasDescricao();
                break;

            case "selecionaCotacoesEncerradas":
                this.selecionaCotacoesEncerradas();
                break;

            case "filtraAnosComCotacoesEncerradas":
                this.filtraAnosComCotacoesEncerradas();
                break;

            case "isProcessoComCotacoesEncerradas":
                this.isProcessoComCotacoesEncerradas();
                break;
        }
    }

    public List<String> selecionaCotacoesEncerradasDescricao(String ano) throws Exception {
        this.cotacaoMapperParametro.setAno(ano);
        return this.cotacaoMapperParametro.getCotacoesString();
    }

    public List<CotacaoModel> selecionaCotacoesEncerradas(int ano, int mes) throws Exception {
        this.cotacaoMapperParametro.setAno(ano);
        this.cotacaoMapperParametro.setMes(mes);
        return this.cotacaoMapperParametro.getCotacoesModel();
    }

    public List<Integer> filtraAnosComCotacoesEncerradas() throws Exception {
        return this.cotacaoMapperParametro.getAnos();
    }

    public  Boolean isProcessoComCotacoesEncerradas(String processo) throws Exception {
        this.cotacaoMapperParametro.setProcesso(processo);
        return this.cotacaoMapperParametro.getIsProcessoComCotacoesEncerradas();
    }
}
