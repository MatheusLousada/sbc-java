package br.gov.sp.saobernardo.webservice.classes.dao.interfaces;

import java.util.List;

import br.gov.sp.saobernardo.webservice.classes.modelos.pregao.PregaoEletronicoModel;

public interface PregaoEletronicoDAOInterface {

    public List<PregaoEletronicoModel> selecionaPregoesHomologados(String quantidadePregoes) throws Exception;
    
    public List<PregaoEletronicoModel> selecionaPregaoPorProcessoComEdital(String pregao, String processo) throws Exception;

    public List<String> selecionaPregaoPorAno(final String ano) throws Exception;
}