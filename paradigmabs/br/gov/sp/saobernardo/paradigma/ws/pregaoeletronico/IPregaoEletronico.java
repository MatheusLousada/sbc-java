
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

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
@WebService(name = "IPregaoEletronico", targetNamespace = "http://tempuri.org/")
public interface IPregaoEletronico {


    /**
     * 
     * @param lstPregaoEletronicoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarPregaoEletronico", action = "http://tempuri.org/IPregaoEletronico/ProcessarPregaoEletronico")
    @WebResult(name = "ProcessarPregaoEletronicoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarPregaoEletronico", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ProcessarPregaoEletronico")
    @ResponseWrapper(localName = "ProcessarPregaoEletronicoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ProcessarPregaoEletronicoResponse")
    public RetornoDTO processarPregaoEletronico(
        @WebParam(name = "lstPregaoEletronicoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfPregaoEletronicoDTO lstPregaoEletronicoDTO);

    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.ArrayOfPregaoEletronicoDTO
     */
    @WebMethod(operationName = "RetornarPregaoEletronico", action = "http://tempuri.org/IPregaoEletronico/RetornarPregaoEletronico")
    @WebResult(name = "RetornarPregaoEletronicoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarPregaoEletronico", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.RetornarPregaoEletronico")
    @ResponseWrapper(localName = "RetornarPregaoEletronicoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.RetornarPregaoEletronicoResponse")
    public ArrayOfPregaoEletronicoDTO retornarPregaoEletronico();

    /**
     * 
     * @param lstHabilitarPregaoEletronicoDTO
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.RetornoDTO
     */
    @WebMethod(operationName = "HabilitarRetornarPregaoEletronico", action = "http://tempuri.org/IPregaoEletronico/HabilitarRetornarPregaoEletronico")
    @WebResult(name = "HabilitarRetornarPregaoEletronicoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HabilitarRetornarPregaoEletronico", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.HabilitarRetornarPregaoEletronico")
    @ResponseWrapper(localName = "HabilitarRetornarPregaoEletronicoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico.HabilitarRetornarPregaoEletronicoResponse")
    public RetornoDTO habilitarRetornarPregaoEletronico(
        @WebParam(name = "lstHabilitarPregaoEletronicoDTO", targetNamespace = "http://tempuri.org/")
        ArrayOfHabilitarPregaoEletronicoDTO lstHabilitarPregaoEletronicoDTO);

}
