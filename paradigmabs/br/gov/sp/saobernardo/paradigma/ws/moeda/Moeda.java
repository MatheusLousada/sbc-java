
package br.gov.sp.saobernardo.paradigma.ws.moeda;

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
@WebServiceClient(name = "Moeda", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/Moeda.svc?wsdl")
public class Moeda
    extends Service
{

    private final static URL MOEDA_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.moeda.Moeda.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.moeda.Moeda.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/Moeda.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/Moeda.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MOEDA_WSDL_LOCATION = url;
    }

    public Moeda(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Moeda() {
        super(MOEDA_WSDL_LOCATION, new QName("http://tempuri.org/", "Moeda"));
    }

    /**
     * 
     * @return
     *     returns IMoeda
     */
    @WebEndpoint(name = "BasicHttpBinding_IMoeda")
    public IMoeda getBasicHttpBindingIMoeda() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMoeda"), IMoeda.class);
    }

}