package websfa.soap.client2;


import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-07-13T15:04:28.080+03:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "ZTBL_WEBSERVICE", 
                  //wsdlLocation = "file:/D:/Aplicatii/Java/WebSFATest/WebSFATest/WebContent/resources/wsdl/soap_test.wsdl",
			  	  wsdlLocation = "file:soap_test.wsdl",
                  targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style") 
public class ZTBLWEBSERVICE_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZTBL_WEBSERVICE");
    public final static QName ZTBLWEBSERVICESoap12 = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZTBL_WEBSERVICE_soap12");
    public final static QName ZTBLWEBSERVICE = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZTBL_WEBSERVICE");
    static {
        URL url = null;
        try {
            url = ZTBLWEBSERVICE_Service.class.getResource("soap_test.wsdl");
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(ZTBLWEBSERVICE_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Aplicatii/Java/WebSFATest/WebSFATest/WebContent/resources/wsdl/soap_test.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZTBLWEBSERVICE_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZTBLWEBSERVICE_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZTBLWEBSERVICE_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ZTBLWEBSERVICE_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ZTBLWEBSERVICE_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ZTBLWEBSERVICE_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ZTBLWEBSERVICE
     */
    @WebEndpoint(name = "ZTBL_WEBSERVICE_soap12")
    public ZTBLWEBSERVICE getZTBLWEBSERVICESoap12() {
        return super.getPort(ZTBLWEBSERVICESoap12, ZTBLWEBSERVICE.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZTBLWEBSERVICE
     */
    @WebEndpoint(name = "ZTBL_WEBSERVICE_soap12")
    public ZTBLWEBSERVICE getZTBLWEBSERVICESoap12(WebServiceFeature... features) {
        return super.getPort(ZTBLWEBSERVICESoap12, ZTBLWEBSERVICE.class, features);
    }


    /**
     *
     * @return
     *     returns ZTBLWEBSERVICE
     */
    @WebEndpoint(name = "ZTBL_WEBSERVICE")
    public ZTBLWEBSERVICE getZTBLWEBSERVICE() {
        return super.getPort(ZTBLWEBSERVICE, ZTBLWEBSERVICE.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZTBLWEBSERVICE
     */
    @WebEndpoint(name = "ZTBL_WEBSERVICE")
    public ZTBLWEBSERVICE getZTBLWEBSERVICE(WebServiceFeature... features) {
        return super.getPort(ZTBLWEBSERVICE, ZTBLWEBSERVICE.class, features);
    }

}
