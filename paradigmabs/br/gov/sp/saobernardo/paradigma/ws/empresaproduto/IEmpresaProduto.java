
package br.gov.sp.saobernardo.paradigma.ws.empresaproduto;

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
@WebService(name = "IEmpresaProduto", targetNamespace = "http://tempuri.org/")
public interface IEmpresaProduto {


    /**
     * 
     * @param lstItemFornecedor
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaproduto.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarEmpresaProduto", action = "http://tempuri.org/IEmpresaProduto/ProcessarEmpresaProduto")
    @WebResult(name = "ProcessarEmpresaProdutoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarEmpresaProduto", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaproduto.ProcessarEmpresaProduto")
    @ResponseWrapper(localName = "ProcessarEmpresaProdutoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaproduto.ProcessarEmpresaProdutoResponse")
    public RetornoDTO processarEmpresaProduto(
        @WebParam(name = "lstItemFornecedor", targetNamespace = "http://tempuri.org/")
        ArrayOfEmpresaProdutoDetalheDTO lstItemFornecedor);

    /**
     * 
     * @param dto
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaproduto.RetornoDTO
     */
    @WebMethod(operationName = "RemoverEmpresaProduto", action = "http://tempuri.org/IEmpresaProduto/RemoverEmpresaProduto")
    @WebResult(name = "RemoverEmpresaProdutoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RemoverEmpresaProduto", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaproduto.RemoverEmpresaProduto")
    @ResponseWrapper(localName = "RemoverEmpresaProdutoResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaproduto.RemoverEmpresaProdutoResponse")
    public RetornoDTO removerEmpresaProduto(
        @WebParam(name = "dto", targetNamespace = "http://tempuri.org/")
        EmpresaProdutoDetalhePesquisaDTO dto);

}
