
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

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
@WebServiceClient(name = "WfAlcada", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/WfAlcada.svc?wsdl")
public class WfAlcada
    extends Service
{

    private final static URL WFALCADA_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.wfalcada.WfAlcada.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.wfalcada.WfAlcada.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/WfAlcada.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/WfAlcada.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WFALCADA_WSDL_LOCATION = url;
    }

    public WfAlcada(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WfAlcada() {
        super(WFALCADA_WSDL_LOCATION, new QName("http://tempuri.org/", "WfAlcada"));
    }

    /**
     * 
     * @return
     *     returns IWfAlcada
     */
    @WebEndpoint(name = "BasicHttpBinding_IWfAlcada")
    public IWfAlcada getBasicHttpBindingIWfAlcada() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IWfAlcada"), IWfAlcada.class);
    }

}