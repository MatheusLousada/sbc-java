
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

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
@WebService(name = "IEmpresaClasse", targetNamespace = "http://tempuri.org/")
public interface IEmpresaClasse {


    /**
     * 
     * @param lstEmpresaClasse
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarEmpresaCategoria", action = "http://tempuri.org/IEmpresaClasse/ProcessarEmpresaCategoria")
    @WebResult(name = "ProcessarEmpresaCategoriaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarEmpresaCategoria", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ProcessarEmpresaCategoria")
    @ResponseWrapper(localName = "ProcessarEmpresaCategoriaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ProcessarEmpresaCategoriaResponse")
    public RetornoDTO processarEmpresaCategoria(
        @WebParam(name = "lstEmpresaClasse", targetNamespace = "http://tempuri.org/")
        ArrayOfEmpresaClasseDTO lstEmpresaClasse);

    /**
     * 
     * @param lstEmpresaClasse
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornoDTO
     */
    @WebMethod(operationName = "ProcessarArvoreCategoriaEmpresa", action = "http://tempuri.org/IEmpresaClasse/ProcessarArvoreCategoriaEmpresa")
    @WebResult(name = "ProcessarArvoreCategoriaEmpresaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProcessarArvoreCategoriaEmpresa", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ProcessarArvoreCategoriaEmpresa")
    @ResponseWrapper(localName = "ProcessarArvoreCategoriaEmpresaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ProcessarArvoreCategoriaEmpresaResponse")
    public RetornoDTO processarArvoreCategoriaEmpresa(
        @WebParam(name = "lstEmpresaClasse", targetNamespace = "http://tempuri.org/")
        ArrayOfEmpresaClasseDTO lstEmpresaClasse);

    /**
     * 
     * @param lstEmpresaClasse
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornoDTO
     */
    @WebMethod(operationName = "ExcluirEmpresaCategoria", action = "http://tempuri.org/IEmpresaClasse/ExcluirEmpresaCategoria")
    @WebResult(name = "ExcluirEmpresaCategoriaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExcluirEmpresaCategoria", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ExcluirEmpresaCategoria")
    @ResponseWrapper(localName = "ExcluirEmpresaCategoriaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ExcluirEmpresaCategoriaResponse")
    public RetornoDTO excluirEmpresaCategoria(
        @WebParam(name = "lstEmpresaClasse", targetNamespace = "http://tempuri.org/")
        ArrayOfEmpresaClasseDTO lstEmpresaClasse);

    /**
     * 
     * @param lstEmpresaClasse
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornoDTO
     */
    @WebMethod(operationName = "AtualizarEmpresaCategoria", action = "http://tempuri.org/IEmpresaClasse/AtualizarEmpresaCategoria")
    @WebResult(name = "AtualizarEmpresaCategoriaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AtualizarEmpresaCategoria", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.AtualizarEmpresaCategoria")
    @ResponseWrapper(localName = "AtualizarEmpresaCategoriaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.AtualizarEmpresaCategoriaResponse")
    public RetornoDTO atualizarEmpresaCategoria(
        @WebParam(name = "lstEmpresaClasse", targetNamespace = "http://tempuri.org/")
        ArrayOfEmpresaListaClasseDTO lstEmpresaClasse);

    /**
     * 
     * @param sCdEmpresaErp
     * @return
     *     returns br.gov.sp.saobernardo.paradigma.ws.empresaclasse.ArrayOfEmpresaClasseDTO
     */
    @WebMethod(operationName = "RetornarEmpresaCategoria", action = "http://tempuri.org/IEmpresaClasse/RetornarEmpresaCategoria")
    @WebResult(name = "RetornarEmpresaCategoriaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornarEmpresaCategoria", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornarEmpresaCategoria")
    @ResponseWrapper(localName = "RetornarEmpresaCategoriaResponse", targetNamespace = "http://tempuri.org/", className = "br.gov.sp.saobernardo.paradigma.ws.empresaclasse.RetornarEmpresaCategoriaResponse")
    public ArrayOfEmpresaClasseDTO retornarEmpresaCategoria(
        @WebParam(name = "sCdEmpresaErp", targetNamespace = "http://tempuri.org/")
        String sCdEmpresaErp);

}