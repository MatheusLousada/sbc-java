
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

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
@WebServiceClient(name = "Cotacao", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/Cotacao.wsdl")
public class Cotacao
    extends Service
{

    private final static URL COTACAO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.cotacao.Cotacao.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.cotacao.Cotacao.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/Cotacao.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/workspace/PARADIGMA_WEBSERVICE_projeto/gerador_ws/Cotacao.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        COTACAO_WSDL_LOCATION = url;
    }

    public Cotacao(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Cotacao() {
        super(COTACAO_WSDL_LOCATION, new QName("http://tempuri.org/", "Cotacao"));
    }

    /**
     * 
     * @return
     *     returns ICotacao
     */
    @WebEndpoint(name = "BasicHttpBinding_ICotacao")
    public ICotacao getBasicHttpBindingICotacao() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICotacao"), ICotacao.class);
    }

}