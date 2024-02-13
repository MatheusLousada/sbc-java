
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
@WebServiceClient(name = "Leilao", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/Leilao.svc?wsdl")
public class Leilao
    extends Service
{

    private final static URL LEILAO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.leilao.Leilao.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.leilao.Leilao.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/Leilao.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/Leilao.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LEILAO_WSDL_LOCATION = url;
    }

    public Leilao(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Leilao() {
        super(LEILAO_WSDL_LOCATION, new QName("http://tempuri.org/", "Leilao"));
    }

    /**
     * 
     * @return
     *     returns ILeilao
     */
    @WebEndpoint(name = "BasicHttpBinding_ILeilao")
    public ILeilao getBasicHttpBindingILeilao() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ILeilao"), ILeilao.class);
    }

}