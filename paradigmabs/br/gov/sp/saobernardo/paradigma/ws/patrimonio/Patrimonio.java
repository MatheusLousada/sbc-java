
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

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
@WebServiceClient(name = "Patrimonio", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/Patrimonio.svc?wsdl")
public class Patrimonio
    extends Service
{

    private final static URL PATRIMONIO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.patrimonio.Patrimonio.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.patrimonio.Patrimonio.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/Patrimonio.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/Patrimonio.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PATRIMONIO_WSDL_LOCATION = url;
    }

    public Patrimonio(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Patrimonio() {
        super(PATRIMONIO_WSDL_LOCATION, new QName("http://tempuri.org/", "Patrimonio"));
    }

    /**
     * 
     * @return
     *     returns IPatrimonio
     */
    @WebEndpoint(name = "BasicHttpBinding_IPatrimonio")
    public IPatrimonio getBasicHttpBindingIPatrimonio() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPatrimonio"), IPatrimonio.class);
    }

}
