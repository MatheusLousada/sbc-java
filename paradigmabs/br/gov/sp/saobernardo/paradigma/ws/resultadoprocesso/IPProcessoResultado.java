
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
@WebService(name = "IPProcessoResultado", targetNamespace = "http://tempuri.org/")
public interface IPProcessoResultado {


    /**
     * 
     * @param nQtRegistros
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ArrayOfPProcessoResultadoDTO
     */
    @WebMethod(operationName = "RetornarPProcessoResultado", action = "http://tempuri.org/IPProcessoResultado/RetornarPProcessoResultado")
    @WebResult(name = "RetornarPProcessoResultadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarPProcessoResultado", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornarPProcessoResultado")
    @ResponseWrapper(localName = "RetornarPProcessoResultadoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornarPProcessoResultadoResponse")
    public ArrayOfPProcessoResultadoDTO retornarPProcessoResultado(
        @WebParam(name = "nQtRegistros", targetNamespace = "http://tempuri.org/")
        Integer nQtRegistros);

    /**
     * 
     * @param lstProcessoLiberacaoDto
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarPProcessoLiberacao", action = "http://tempuri.org/IPProcessoResultado/ProcessarPProcessoLiberacao")
    @WebResult(name = "ProcessarPProcessoLiberacaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarPProcessoLiberacao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ProcessarPProcessoLiberacao")
    @ResponseWrapper(localName = "ProcessarPProcessoLiberacaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ProcessarPProcessoLiberacaoResponse")
    public RetornoDTO processarPProcessoLiberacao(
        @WebParam(name = "lstProcessoLiberacaoDto", targetNamespace = "http://tempuri.org/")
        ArrayOfPProcessoLiberacaoDTO lstProcessoLiberacaoDto);

    /**
     * 
     * @param lstProcessoLiberacaoModalidadeDto
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarPProcessoLiberacaoPorModalidade", action = "http://tempuri.org/IPProcessoResultado/ProcessarPProcessoLiberacaoPorModalidade")
    @WebResult(name = "ProcessarPProcessoLiberacaoPorModalidadeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarPProcessoLiberacaoPorModalidade", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ProcessarPProcessoLiberacaoPorModalidade")
    @ResponseWrapper(localName = "ProcessarPProcessoLiberacaoPorModalidadeResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ProcessarPProcessoLiberacaoPorModalidadeResponse")
    public RetornoDTO processarPProcessoLiberacaoPorModalidade(
        @WebParam(name = "lstProcessoLiberacaoModalidadeDto", targetNamespace = "http://tempuri.org/")
        ArrayOfPProcessoLiberacaoModalidadeDTO lstProcessoLiberacaoModalidadeDto);

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ArrayOfDecisaoCompraDTO
     */
    @WebMethod(operationName = "RetornarDecisaoCompra", action = "http://tempuri.org/IPProcessoResultado/RetornarDecisaoCompra")
    @WebResult(name = "RetornarDecisaoCompraResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarDecisaoCompra", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornarDecisaoCompra")
    @ResponseWrapper(localName = "RetornarDecisaoCompraResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.RetornarDecisaoCompraResponse")
    public ArrayOfDecisaoCompraDTO retornarDecisaoCompra();

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ArrayOfCotacaoIntegracaoDTO
     */
    @WebMethod(operationName = "PesquisarProcessoCancelado", action = "http://tempuri.org/IPProcessoResultado/PesquisarProcessoCancelado")
    @WebResult(name = "PesquisarProcessoCanceladoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PesquisarProcessoCancelado", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoCancelado")
    @ResponseWrapper(localName = "PesquisarProcessoCanceladoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoCanceladoResponse")
    public ArrayOfCotacaoIntegracaoDTO pesquisarProcessoCancelado();

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ArrayOfCotacaoIntegracaoDTO
     */
    @WebMethod(operationName = "PesquisarProcessoIniciado", action = "http://tempuri.org/IPProcessoResultado/PesquisarProcessoIniciado")
    @WebResult(name = "PesquisarProcessoIniciadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PesquisarProcessoIniciado", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoIniciado")
    @ResponseWrapper(localName = "PesquisarProcessoIniciadoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoIniciadoResponse")
    public ArrayOfCotacaoIntegracaoDTO pesquisarProcessoIniciado();

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.ArrayOfCotacaoIntegracaoDTO
     */
    @WebMethod(operationName = "PesquisarProcessoRealizado", action = "http://tempuri.org/IPProcessoResultado/PesquisarProcessoRealizado")
    @WebResult(name = "PesquisarProcessoRealizadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PesquisarProcessoRealizado", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoRealizado")
    @ResponseWrapper(localName = "PesquisarProcessoRealizadoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PesquisarProcessoRealizadoResponse")
    public ArrayOfCotacaoIntegracaoDTO pesquisarProcessoRealizado();

}
