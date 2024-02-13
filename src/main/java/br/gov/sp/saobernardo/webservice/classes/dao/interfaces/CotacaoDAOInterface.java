package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.util.List;
import br.gov.sp.saobernardo.webservice.classes.modelos.cotacao.CotacaoModel;

public interface CotacaoDAOInterface {

    List<String> selecionaCotacoesEncerradasDescricao(String ano) throws Exception;

    List<CotacaoModel> selecionaCotacoesEncerradas(int ano, int mes) throws Exception;

    List<Integer> filtraAnosComCotacoesEncerradas() throws Exception;

    Boolean isProcessoComCotacoesEncerradas(String processo) throws Exception;
}
