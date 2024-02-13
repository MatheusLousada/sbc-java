
package br.gov.sp.saobernardo.paradigma.ws.empresabanco;

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
@WebServiceClient(name = "EmpresaBanco", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://comprashmg.pmsbc.gov.br/Services/EmpresaBanco.svc?wsdl")
public class EmpresaBanco
    extends Service
{

    private final static URL EMPRESABANCO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.gov.sp.saobernardo.paradigma.ws.empresabanco.EmpresaBanco.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.gov.sp.saobernardo.paradigma.ws.empresabanco.EmpresaBanco.class.getResource(".");
            url = new URL(baseUrl, "http://comprashmg.pmsbc.gov.br/Services/EmpresaBanco.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://comprashmg.pmsbc.gov.br/Services/EmpresaBanco.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPRESABANCO_WSDL_LOCATION = url;
    }

    public EmpresaBanco(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpresaBanco() {
        super(EMPRESABANCO_WSDL_LOCATION, new QName("http://tempuri.org/", "EmpresaBanco"));
    }

    /**
     * 
     * @return
     *     returns IEmpresaBanco
     */
    @WebEndpoint(name = "BasicHttpBinding_IEmpresaBanco")
    public IEmpresaBanco getBasicHttpBindingIEmpresaBanco() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IEmpresaBanco"), IEmpresaBanco.class);
    }

}
