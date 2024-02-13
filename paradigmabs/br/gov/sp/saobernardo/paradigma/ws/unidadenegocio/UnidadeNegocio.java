
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

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
@WebServiceClient(name = "UnidadeNegocio", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/UnidadeNegocio.svc?wsdl")
public class UnidadeNegocio
    extends Service
{

    private final static URL UNIDADENEGOCIO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.unidadenegocio.UnidadeNegocio.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.unidadenegocio.UnidadeNegocio.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/UnidadeNegocio.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/UnidadeNegocio.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UNIDADENEGOCIO_WSDL_LOCATION = url;
    }

    public UnidadeNegocio(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnidadeNegocio() {
        super(UNIDADENEGOCIO_WSDL_LOCATION, new QName("http://tempuri.org/", "UnidadeNegocio"));
    }

    /**
     * 
     * @return
     *     returns IUnidadeNegocio
     */
    @WebEndpoint(name = "BasicHttpBinding_IUnidadeNegocio")
    public IUnidadeNegocio getBasicHttpBindingIUnidadeNegocio() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUnidadeNegocio"), IUnidadeNegocio.class);
    }

}
