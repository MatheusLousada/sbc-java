
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

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
@WebServiceClient(name = "CompraDireta", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/CompraDireta.wsdl")
public class CompraDireta
    extends Service
{

    private final static URL COMPRADIRETA_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDireta.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.compradireta.CompraDireta.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/CompraDireta.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/CompraDireta.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        COMPRADIRETA_WSDL_LOCATION = url;
    }

    public CompraDireta(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompraDireta() {
        super(COMPRADIRETA_WSDL_LOCATION, new QName("http://tempuri.org/", "CompraDireta"));
    }

    /**
     * 
     * @return
     *     returns ICompraDireta
     */
    @WebEndpoint(name = "BasicHttpBinding_ICompraDireta")
    public ICompraDireta getBasicHttpBindingICompraDireta() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICompraDireta"), ICompraDireta.class);
    }

}
