
package unspc.net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * The United Nations Standard Products and Services Code® (UNSPSC®) provides an open, global multi-sector standard for efficient, accurate classification of products and services. Search the code on this website to locate commodity codes that can be used by your company. The UNSPSC offers a single global classification system that can be used for: Company-wide visibility of spend analysis,Cost-effective procurement optimization,	Full exploitation of electronic commerce capabilities 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GenericUNSPSC", targetNamespace = "http://www.webservicex.net/", wsdlLocation = "http://www.webservicex.net/GenericUNSPSC.asmx?WSDL")
public class GenericUNSPSC
    extends Service
{

    private final static URL GENERICUNSPSC_WSDL_LOCATION;
    private final static WebServiceException GENERICUNSPSC_EXCEPTION;
    private final static QName GENERICUNSPSC_QNAME = new QName("http://www.webservicex.net/", "GenericUNSPSC");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/GenericUNSPSC.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GENERICUNSPSC_WSDL_LOCATION = url;
        GENERICUNSPSC_EXCEPTION = e;
    }

    public GenericUNSPSC() {
        super(__getWsdlLocation(), GENERICUNSPSC_QNAME);
    }

    public GenericUNSPSC(WebServiceFeature... features) {
        super(__getWsdlLocation(), GENERICUNSPSC_QNAME, features);
    }

    public GenericUNSPSC(URL wsdlLocation) {
        super(wsdlLocation, GENERICUNSPSC_QNAME);
    }

    public GenericUNSPSC(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GENERICUNSPSC_QNAME, features);
    }

    public GenericUNSPSC(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GenericUNSPSC(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GenericUNSPSCSoap
     */
    @WebEndpoint(name = "GenericUNSPSCSoap")
    public GenericUNSPSCSoap getGenericUNSPSCSoap() {
        return super.getPort(new QName("http://www.webservicex.net/", "GenericUNSPSCSoap"), GenericUNSPSCSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GenericUNSPSCSoap
     */
    @WebEndpoint(name = "GenericUNSPSCSoap")
    public GenericUNSPSCSoap getGenericUNSPSCSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net/", "GenericUNSPSCSoap"), GenericUNSPSCSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GENERICUNSPSC_EXCEPTION!= null) {
            throw GENERICUNSPSC_EXCEPTION;
        }
        return GENERICUNSPSC_WSDL_LOCATION;
    }

}