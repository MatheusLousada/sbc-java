
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ICotacao", targetNamespace = "http://tempuri.org/")
public interface ICotacao {


    /**
     * 
     * @param lstCotacao
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarCotacao", action = "http://tempuri.org/ICotacao/ProcessarCotacao")
    @WebResult(name = "ProcessarCotacaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarCotacao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ProcessarCotacao")
    @ResponseWrapper(localName = "ProcessarCotacaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ProcessarCotacaoResponse")
    public RetornoDTO processarCotacao(
        @WebParam(name = "lstCotacao", targetNamespace = "http://tempuri.org/")
        ArrayOfCotacaoDTO lstCotacao);

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoDTO
     */
    @WebMethod(operationName = "RetornarCotacao", action = "http://tempuri.org/ICotacao/RetornarCotacao")
    @WebResult(name = "RetornarCotacaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarCotacao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacao")
    @ResponseWrapper(localName = "RetornarCotacaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoResponse")
    public ArrayOfCotacaoDTO retornarCotacao();

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoDTO
     */
    @WebMethod(operationName = "RetornarCotacaoItem", action = "http://tempuri.org/ICotacao/RetornarCotacaoItem")
    @WebResult(name = "RetornarCotacaoItemResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarCotacaoItem", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoItem")
    @ResponseWrapper(localName = "RetornarCotacaoItemResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoItemResponse")
    public ArrayOfCotacaoDTO retornarCotacaoItem();

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfCotacaoDTO
     */
    @WebMethod(operationName = "RetornarCotacaoOrcamento", action = "http://tempuri.org/ICotacao/RetornarCotacaoOrcamento")
    @WebResult(name = "RetornarCotacaoOrcamentoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarCotacaoOrcamento", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoOrcamento")
    @ResponseWrapper(localName = "RetornarCotacaoOrcamentoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoOrcamentoResponse")
    public ArrayOfCotacaoDTO retornarCotacaoOrcamento();

    /**
     * 
     * @param lstConfirmacaoNegociacaoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO
     */
    @WebMethod(operationName = "ReabrirCotacao", action = "http://tempuri.org/ICotacao/ReabrirCotacao")
    @WebResult(name = "ReabrirCotacaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReabrirCotacao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ReabrirCotacao")
    @ResponseWrapper(localName = "ReabrirCotacaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ReabrirCotacaoResponse")
    public RetornoDTO reabrirCotacao(
        @WebParam(name = "lstConfirmacaoNegociacaoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO);

    /**
     * 
     * @param lstConfirmacaoNegociacaoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO
     */
    @WebMethod(operationName = "HabilitarRetornarCotacao", action = "http://tempuri.org/ICotacao/HabilitarRetornarCotacao")
    @WebResult(name = "HabilitarRetornarCotacaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HabilitarRetornarCotacao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.HabilitarRetornarCotacao")
    @ResponseWrapper(localName = "HabilitarRetornarCotacaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.HabilitarRetornarCotacaoResponse")
    public RetornoDTO habilitarRetornarCotacao(
        @WebParam(name = "lstConfirmacaoNegociacaoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO);

    /**
     * 
     * @param lstConfirmacaoNegociacaoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO
     */
    @WebMethod(operationName = "ReabrirCotacaoItem", action = "http://tempuri.org/ICotacao/ReabrirCotacaoItem")
    @WebResult(name = "ReabrirCotacaoItemResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReabrirCotacaoItem", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ReabrirCotacaoItem")
    @ResponseWrapper(localName = "ReabrirCotacaoItemResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.ReabrirCotacaoItemResponse")
    public RetornoDTO reabrirCotacaoItem(
        @WebParam(name = "lstConfirmacaoNegociacaoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO);

    /**
     * 
     * @param lstConfirmacaoNegociacaoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornoDTO
     */
    @WebMethod(operationName = "HabilitarRetornarCotacaoItem", action = "http://tempuri.org/ICotacao/HabilitarRetornarCotacaoItem")
    @WebResult(name = "HabilitarRetornarCotacaoItemResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HabilitarRetornarCotacaoItem", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.HabilitarRetornarCotacaoItem")
    @ResponseWrapper(localName = "HabilitarRetornarCotacaoItemResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.HabilitarRetornarCotacaoItemResponse")
    public RetornoDTO habilitarRetornarCotacaoItem(
        @WebParam(name = "lstConfirmacaoNegociacaoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfConfirmacaoNegociacaoDTO lstConfirmacaoNegociacaoDTO);

    /**
     * 
     * @param nFlParticipa
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cotacao.ArrayOfProcessoCotacaoDTO
     */
    @WebMethod(operationName = "RetornarCotacaoComEmpresaSemDePara", action = "http://tempuri.org/ICotacao/RetornarCotacaoComEmpresaSemDePara")
    @WebResult(name = "RetornarCotacaoComEmpresaSemDeParaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarCotacaoComEmpresaSemDePara", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoComEmpresaSemDePara")
    @ResponseWrapper(localName = "RetornarCotacaoComEmpresaSemDeParaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cotacao.RetornarCotacaoComEmpresaSemDeParaResponse")
    public ArrayOfProcessoCotacaoDTO retornarCotacaoComEmpresaSemDePara(
        @WebParam(name = "nFlParticipa", targetNamespace = "http://tempuri.org/")
        Integer nFlParticipa);

}