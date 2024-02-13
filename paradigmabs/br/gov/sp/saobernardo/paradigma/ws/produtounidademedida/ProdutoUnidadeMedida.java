
package br.gov.sp.saobernardo.paradigma.ws.produtounidademedida;

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
@WebServiceClient(name = "ProdutoUnidadeMedida", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/ProdutoUnidadeMedida.svc?wsdl")
public class ProdutoUnidadeMedida
    extends Service
{

    private final static URL PRODUTOUNIDADEMEDIDA_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.produtounidademedida.ProdutoUnidadeMedida.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.produtounidademedida.ProdutoUnidadeMedida.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/ProdutoUnidadeMedida.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/ProdutoUnidadeMedida.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PRODUTOUNIDADEMEDIDA_WSDL_LOCATION = url;
    }

    public ProdutoUnidadeMedida(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProdutoUnidadeMedida() {
        super(PRODUTOUNIDADEMEDIDA_WSDL_LOCATION, new QName("http://tempuri.org/", "ProdutoUnidadeMedida"));
    }

    /**
     * 
     * @return
     *     returns IProdutoUnidadeMedida
     */
    @WebEndpoint(name = "BasicHttpBinding_IProdutoUnidadeMedida")
    public IProdutoUnidadeMedida getBasicHttpBindingIProdutoUnidadeMedida() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IProdutoUnidadeMedida"), IProdutoUnidadeMedida.class);
    }

}
