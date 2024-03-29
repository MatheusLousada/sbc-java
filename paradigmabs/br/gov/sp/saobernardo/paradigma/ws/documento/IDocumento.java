
package br.gov.sp.saobernardo.paradigma.ws.documento;

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
@WebService(name = "IDocumento", targetNamespace = "http://tempuri.org/")
public interface IDocumento {


    /**
     * 
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.documento.ArrayOfDocumentoEmpresaDTO
     */
    @WebMethod(operationName = "RetornarDocumento", action = "http://tempuri.org/IDocumento/RetornarDocumento")
    @WebResult(name = "RetornarDocumentoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarDocumento", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.documento.RetornarDocumento")
    @ResponseWrapper(localName = "RetornarDocumentoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.documento.RetornarDocumentoResponse")
    public ArrayOfDocumentoEmpresaDTO retornarDocumento();

    /**
     * 
     * @param sCdIdentificador
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.documento.ArrayOfEmpresaContatoDTO
     */
    @WebMethod(operationName = "RetornarDocumentoPorFuncionario", action = "http://tempuri.org/IDocumento/RetornarDocumentoPorFuncionario")
    @WebResult(name = "RetornarDocumentoPorFuncionarioResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarDocumentoPorFuncionario", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.documento.RetornarDocumentoPorFuncionario")
    @ResponseWrapper(localName = "RetornarDocumentoPorFuncionarioResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.documento.RetornarDocumentoPorFuncionarioResponse")
    public ArrayOfEmpresaContatoDTO retornarDocumentoPorFuncionario(
        @WebParam(name = "sCdIdentificador", targetNamespace = "http://tempuri.org/")
        String sCdIdentificador);

}
