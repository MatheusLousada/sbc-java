
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
@WebServiceClient(name = "PProcessoResultado", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/ResultadoProcesso.svc?wsdl")
public class PProcessoResultado
    extends Service
{

    private final static URL PPROCESSORESULTADO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PProcessoResultado.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso.PProcessoResultado.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/ResultadoProcesso.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/ResultadoProcesso.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PPROCESSORESULTADO_WSDL_LOCATION = url;
    }

    public PProcessoResultado(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PProcessoResultado() {
        super(PPROCESSORESULTADO_WSDL_LOCATION, new QName("http://tempuri.org/", "PProcessoResultado"));
    }

    /**
     * 
     * @return
     *     returns IPProcessoResultado
     */
    @WebEndpoint(name = "BasicHttpBinding_IPProcessoResultado")
    public IPProcessoResultado getBasicHttpBindingIPProcessoResultado() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPProcessoResultado"), IPProcessoResultado.class);
    }

}
