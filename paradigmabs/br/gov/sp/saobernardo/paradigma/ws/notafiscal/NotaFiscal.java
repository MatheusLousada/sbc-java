
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

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
@WebServiceClient(name = "NotaFiscal", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/NotaFiscal.svc?wsdl")
public class NotaFiscal
    extends Service
{

    private final static URL NOTAFISCAL_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.notafiscal.NotaFiscal.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.notafiscal.NotaFiscal.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/NotaFiscal.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/NotaFiscal.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NOTAFISCAL_WSDL_LOCATION = url;
    }

    public NotaFiscal(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotaFiscal() {
        super(NOTAFISCAL_WSDL_LOCATION, new QName("http://tempuri.org/", "NotaFiscal"));
    }

    /**
     * 
     * @return
     *     returns INotaFiscal
     */
    @WebEndpoint(name = "BasicHttpBinding_INotaFiscal")
    public INotaFiscal getBasicHttpBindingINotaFiscal() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_INotaFiscal"), INotaFiscal.class);
    }

}
