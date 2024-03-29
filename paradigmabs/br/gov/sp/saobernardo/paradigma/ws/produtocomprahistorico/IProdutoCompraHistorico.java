
package br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico;

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
@WebService(name = "IProdutoCompraHistorico", targetNamespace = "http://tempuri.org/")
public interface IProdutoCompraHistorico {


    /**
     * 
     * @param lstProdutoCompraHistorico
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarUltimaCompraHistorico", action = "http://tempuri.org/IProdutoCompraHistorico/ProcessarUltimaCompraHistorico")
    @WebResult(name = "ProcessarUltimaCompraHistoricoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarUltimaCompraHistorico", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico.ProcessarUltimaCompraHistorico")
    @ResponseWrapper(localName = "ProcessarUltimaCompraHistoricoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.produtocomprahistorico.ProcessarUltimaCompraHistoricoResponse")
    public RetornoDTO processarUltimaCompraHistorico(
        @WebParam(name = "lstProdutoCompraHistorico", targetNamespace = "http://tempuri.org/")
        ArrayOfProdutoCompraHistoricoDTO lstProdutoCompraHistorico);

}
