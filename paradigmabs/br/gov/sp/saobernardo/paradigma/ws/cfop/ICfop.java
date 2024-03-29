
package br.gov.sp.saobernardo.paradigma.ws.cfop;

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
@WebService(name = "ICfop", targetNamespace = "http://tempuri.org/")
public interface ICfop {


    /**
     * 
     * @param lstCfop
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.cfop.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarCfop", action = "http://tempuri.org/ICfop/ProcessarCfop")
    @WebResult(name = "ProcessarCfopResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarCfop", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cfop.ProcessarCfop")
    @ResponseWrapper(localName = "ProcessarCfopResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.cfop.ProcessarCfopResponse")
    public RetornoDTO processarCfop(
        @WebParam(name = "lstCfop", targetNamespace = "http://tempuri.org/")
        ArrayOfCfopDTO lstCfop);

}
