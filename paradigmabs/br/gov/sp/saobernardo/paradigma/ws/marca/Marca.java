
package br.gov.sp.saobernardo.paradigma.ws.marca;

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
@WebServiceClient(name = "Marca", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/Marca.svc?wsdl")
public class Marca
    extends Service
{

    private final static URL MARCA_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.marca.Marca.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.marca.Marca.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/Marca.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/Marca.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MARCA_WSDL_LOCATION = url;
    }

    public Marca(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Marca() {
        super(MARCA_WSDL_LOCATION, new QName("http://tempuri.org/", "Marca"));
    }

    /**
     * 
     * @return
     *     returns IMarca
     */
    @WebEndpoint(name = "BasicHttpBinding_IMarca")
    public IMarca getBasicHttpBindingIMarca() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMarca"), IMarca.class);
    }

}
