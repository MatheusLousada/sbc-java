
package br.gov.sp.saobernardo.paradigma.ws.empresaproduto;

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
@WebServiceClient(name = "EmpresaProduto", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/EmpresaProduto.svc?wsdl")
public class EmpresaProduto
    extends Service
{

    private final static URL EMPRESAPRODUTO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.empresaproduto.EmpresaProduto.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.empresaproduto.EmpresaProduto.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/EmpresaProduto.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/EmpresaProduto.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPRESAPRODUTO_WSDL_LOCATION = url;
    }

    public EmpresaProduto(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpresaProduto() {
        super(EMPRESAPRODUTO_WSDL_LOCATION, new QName("http://tempuri.org/", "EmpresaProduto"));
    }

    /**
     * 
     * @return
     *     returns IEmpresaProduto
     */
    @WebEndpoint(name = "BasicHttpBinding_IEmpresaProduto")
    public IEmpresaProduto getBasicHttpBindingIEmpresaProduto() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IEmpresaProduto"), IEmpresaProduto.class);
    }

}
