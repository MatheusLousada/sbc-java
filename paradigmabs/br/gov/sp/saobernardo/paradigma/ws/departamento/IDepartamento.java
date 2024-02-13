
package br.gov.sp.saobernardo.paradigma.ws.departamento;

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
@WebService(name = "IDepartamento", targetNamespace = "http://tempuri.org/")
public interface IDepartamento {


    /**
     * 
     * @param lstDepartamento
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.departamento.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarDepartamento", action = "http://tempuri.org/IDepartamento/ProcessarDepartamento")
    @WebResult(name = "ProcessarDepartamentoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarDepartamento", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.ProcessarDepartamento")
    @ResponseWrapper(localName = "ProcessarDepartamentoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.ProcessarDepartamentoResponse")
    public RetornoDTO processarDepartamento(
        @WebParam(name = "lstDepartamento", targetNamespace = "http://tempuri.org/")
        ArrayOfDepartamentoDTO lstDepartamento);

    /**
     * 
     * @param lstDepartamentoInativarDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.departamento.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarInativarDepartamentoDePara", action = "http://tempuri.org/IDepartamento/ProcessarInativarDepartamentoDePara")
    @WebResult(name = "ProcessarInativarDepartamentoDeParaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarInativarDepartamentoDePara", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.ProcessarInativarDepartamentoDePara")
    @ResponseWrapper(localName = "ProcessarInativarDepartamentoDeParaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.ProcessarInativarDepartamentoDeParaResponse")
    public RetornoDTO processarInativarDepartamentoDePara(
        @WebParam(name = "lstDepartamentoInativarDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfDepartamentoEmpresaDTO lstDepartamentoInativarDTO);

    /**
     * 
     * @param nNrPagina
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.departamento.RetornoListaX003CDepartamentoDTOX003E
     */
    @WebMethod(operationName = "RetornarDepartamento", action = "http://tempuri.org/IDepartamento/RetornarDepartamento")
    @WebResult(name = "RetornarDepartamentoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarDepartamento", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.RetornarDepartamento")
    @ResponseWrapper(localName = "RetornarDepartamentoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.RetornarDepartamentoResponse")
    public RetornoListaX003CDepartamentoDTOX003E retornarDepartamento(
        @WebParam(name = "nNrPagina", targetNamespace = "http://tempuri.org/")
        Integer nNrPagina);

    /**
     * 
     * @param nCdSituacao
     * @param nNrPagina
     * @param sDsDepartamento
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.departamento.RetornoListaX003CDepartamentoDTOX003E
     */
    @WebMethod(operationName = "RetornarDepartamentoPorDescricao", action = "http://tempuri.org/IDepartamento/RetornarDepartamentoPorDescricao")
    @WebResult(name = "RetornarDepartamentoPorDescricaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarDepartamentoPorDescricao", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.RetornarDepartamentoPorDescricao")
    @ResponseWrapper(localName = "RetornarDepartamentoPorDescricaoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.departamento.RetornarDepartamentoPorDescricaoResponse")
    public RetornoListaX003CDepartamentoDTOX003E retornarDepartamentoPorDescricao(
        @WebParam(name = "sDsDepartamento", targetNamespace = "http://tempuri.org/")
        String sDsDepartamento,
        @WebParam(name = "nCdSituacao", targetNamespace = "http://tempuri.org/")
        Integer nCdSituacao,
        @WebParam(name = "nNrPagina", targetNamespace = "http://tempuri.org/")
        Integer nNrPagina);

}
