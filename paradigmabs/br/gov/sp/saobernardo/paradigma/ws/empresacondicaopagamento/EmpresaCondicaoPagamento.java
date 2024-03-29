
package br.gov.sp.saobernardo.paradigma.ws.empresacondicaopagamento;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "EmpresaCondicaoPagamento", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/EmpresaCondicaoPagamento.svc?wsdl")
public class EmpresaCondicaoPagamento
    extends Service
{

    private final static URL EMPRESACONDICAOPAGAMENTO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.empresacondicaopagamento.EmpresaCondicaoPagamento.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.empresacondicaopagamento.EmpresaCondicaoPagamento.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/EmpresaCondicaoPagamento.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/EmpresaCondicaoPagamento.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPRESACONDICAOPAGAMENTO_WSDL_LOCATION = url;
    }

    public EmpresaCondicaoPagamento(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpresaCondicaoPagamento() {
        super(EMPRESACONDICAOPAGAMENTO_WSDL_LOCATION, new QName("http://tempuri.org/", "EmpresaCondicaoPagamento"));
    }

    /**
     * 
     * @return
     *     returns IEmpresaCondicaoPagamento
     */
    @WebEndpoint(name = "BasicHttpBinding_IEmpresaCondicaoPagamento")
    public IEmpresaCondicaoPagamento getBasicHttpBindingIEmpresaCondicaoPagamento() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IEmpresaCondicaoPagamento"), IEmpresaCondicaoPagamento.class);
    }

}
