
package com.serviceobjects;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddressValidation3", targetNamespace = "http://www.serviceobjects.com", wsdlLocation = "http://trial.serviceobjects.com/AV3/api.svc?wsdl")
public class AddressValidation3
    extends Service
{

    private final static URL ADDRESSVALIDATION3_WSDL_LOCATION;
    private final static WebServiceException ADDRESSVALIDATION3_EXCEPTION;
    private final static QName ADDRESSVALIDATION3_QNAME = new QName("http://www.serviceobjects.com", "AddressValidation3");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://trial.serviceobjects.com/AV3/api.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDRESSVALIDATION3_WSDL_LOCATION = url;
        ADDRESSVALIDATION3_EXCEPTION = e;
    }

    public AddressValidation3() {
        super(__getWsdlLocation(), ADDRESSVALIDATION3_QNAME);
    }

    public AddressValidation3(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDRESSVALIDATION3_QNAME, features);
    }

    public AddressValidation3(URL wsdlLocation) {
        super(wsdlLocation, ADDRESSVALIDATION3_QNAME);
    }

    public AddressValidation3(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDRESSVALIDATION3_QNAME, features);
    }

    public AddressValidation3(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddressValidation3(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAddressValidation3
     */
    @WebEndpoint(name = "DOTSAddressValidation3")
    public IAddressValidation3 getDOTSAddressValidation3() {
        return super.getPort(new QName("http://www.serviceobjects.com", "DOTSAddressValidation3"), IAddressValidation3.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAddressValidation3
     */
    @WebEndpoint(name = "DOTSAddressValidation3")
    public IAddressValidation3 getDOTSAddressValidation3(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.serviceobjects.com", "DOTSAddressValidation3"), IAddressValidation3.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDRESSVALIDATION3_EXCEPTION!= null) {
            throw ADDRESSVALIDATION3_EXCEPTION;
        }
        return ADDRESSVALIDATION3_WSDL_LOCATION;
    }

}
