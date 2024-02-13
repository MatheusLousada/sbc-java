
package br.gov.sp.saobernardo.paradigma.ws.produto;

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
@WebServiceClient(name = "Produto", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/Produto.svc?wsdl")
public class Produto
    extends Service
{

    private final static URL PRODUTO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.produto.Produto.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.produto.Produto.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/Produto.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/Produto.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PRODUTO_WSDL_LOCATION = url;
    }

    public Produto(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Produto() {
        super(PRODUTO_WSDL_LOCATION, new QName("http://tempuri.org/", "Produto"));
    }

    /**
     * 
     * @return
     *     returns IProduto
     */
    @WebEndpoint(name = "BasicHttpBinding_IProduto")
    public IProduto getBasicHttpBindingIProduto() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IProduto"), IProduto.class);
    }

}
