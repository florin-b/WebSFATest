
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package websfa.soap.client2;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-07-13T15:04:28.035+03:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "ZTBL_WEBSERVICE",
                      portName = "ZTBL_WEBSERVICE_soap12",
                      targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                      //wsdlLocation = "file:/D:/Aplicatii/Java/WebSFATest/WebSFATest/WebContent/resources/wsdl/soap_test.wsdl",
                      wsdlLocation = "classPath:wsdl/soap_test.wsdl",
                      endpointInterface = "websfa.soap.client2.ZTBLWEBSERVICE")
                      
public class ZTBL_WEBSERVICE_Soap12Impl implements ZTBLWEBSERVICE {

    private static final Logger LOG = Logger.getLogger(ZTBL_WEBSERVICE_Soap12Impl.class.getName());

    /* (non-Javadoc)
     * @see websfa.soap.client2.ZTBLWEBSERVICE#zcalcTrap(java.lang.String vCity, java.lang.String vKunnr, java.math.BigDecimal vNetwr, java.lang.String vRegio, java.lang.String vUl)*
     */
    public java.math.BigDecimal zcalcTrap(java.lang.String vCity, java.lang.String vKunnr, java.math.BigDecimal vNetwr, java.lang.String vRegio, java.lang.String vUl) { 
        LOG.info("Executing operation zcalcTrap");
        System.out.println(vCity);
        System.out.println(vKunnr);
        System.out.println(vNetwr);
        System.out.println(vRegio);
        System.out.println(vUl);
        try {
            java.math.BigDecimal _return = new java.math.BigDecimal("-4759655656995553015.290862644930638964");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see websfa.soap.client2.ZTBLWEBSERVICE#zactDiscMaxim(java.lang.String pattId)*
     */
    public java.lang.String zactDiscMaxim(java.lang.String pattId) { 
        LOG.info("Executing operation zactDiscMaxim");
        System.out.println(pattId);
        try {
            java.lang.String _return = "_return1942168722";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see websfa.soap.client2.ZTBLWEBSERVICE#zcreazaComanda(java.lang.String canal, java.lang.String faraTransp, java.lang.String gvEvent, java.lang.String id, java.lang.String vMesaj, java.lang.String vOk, java.math.BigDecimal vTrans)*
     */
    public void zcreazaComanda(java.lang.String canal, java.lang.String faraTransp, java.lang.String gvEvent, java.lang.String id, javax.xml.ws.Holder<java.lang.String> vMesaj, javax.xml.ws.Holder<java.lang.String> vOk, javax.xml.ws.Holder<java.math.BigDecimal> vTrans) { 
        LOG.info("Executing operation zcreazaComanda");
        System.out.println(canal);
        System.out.println(faraTransp);
        System.out.println(gvEvent);
        System.out.println(id);
        try {
            java.lang.String vMesajValue = "vMesajValue-443227878";
            vMesaj.value = vMesajValue;
            java.lang.String vOkValue = "vOkValue1751899350";
            vOk.value = vOkValue;
            java.math.BigDecimal vTransValue = new java.math.BigDecimal("-7398977116294974061.3383720736935963081");
            vTrans.value = vTransValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see websfa.soap.client2.ZTBLWEBSERVICE#zgetPrice(java.lang.String canal, java.lang.String city, java.lang.String dzterm, java.math.BigDecimal gvCant, java.lang.String gvKunnr, java.lang.String gvLgort, java.lang.String gvMatnr, java.lang.String gvSite, java.lang.String gvSpart, java.lang.String gvVrkme, java.lang.String gvWerks, java.lang.String mp, java.lang.String regio, java.lang.String tipPers, java.lang.String ulStoc, java.lang.Short errorCode, java.math.BigDecimal gvCantFree, java.lang.String gvCond, java.lang.String gvCurrency, java.lang.String gvMatnrFree, java.math.BigDecimal gvNetwr, java.math.BigDecimal gvNetwrFree, java.math.BigDecimal gvNetwrList, java.lang.String gvNoDisc, java.lang.String gvVrkmeFree, java.lang.String impachet, java.math.BigDecimal multiplu, java.math.BigDecimal outCantUmb, java.lang.String outUmb, java.math.BigDecimal procTrap, java.lang.String vMess, java.math.BigDecimal valTrap)*
     */
    public void zgetPrice(java.lang.String canal, java.lang.String city, java.lang.String dzterm, javax.xml.ws.Holder<java.math.BigDecimal> gvCant, java.lang.String gvKunnr, java.lang.String gvLgort, java.lang.String gvMatnr, java.lang.String gvSite, java.lang.String gvSpart, javax.xml.ws.Holder<java.lang.String> gvVrkme, java.lang.String gvWerks, java.lang.String mp, java.lang.String regio, java.lang.String tipPers, java.lang.String ulStoc, javax.xml.ws.Holder<java.lang.Short> errorCode, javax.xml.ws.Holder<java.math.BigDecimal> gvCantFree, javax.xml.ws.Holder<java.lang.String> gvCond, javax.xml.ws.Holder<java.lang.String> gvCurrency, javax.xml.ws.Holder<java.lang.String> gvMatnrFree, javax.xml.ws.Holder<java.math.BigDecimal> gvNetwr, javax.xml.ws.Holder<java.math.BigDecimal> gvNetwrFree, javax.xml.ws.Holder<java.math.BigDecimal> gvNetwrList, javax.xml.ws.Holder<java.lang.String> gvNoDisc, javax.xml.ws.Holder<java.lang.String> gvVrkmeFree, javax.xml.ws.Holder<java.lang.String> impachet, javax.xml.ws.Holder<java.math.BigDecimal> multiplu, javax.xml.ws.Holder<java.math.BigDecimal> outCantUmb, javax.xml.ws.Holder<java.lang.String> outUmb, javax.xml.ws.Holder<java.math.BigDecimal> procTrap, javax.xml.ws.Holder<java.lang.String> vMess, javax.xml.ws.Holder<java.math.BigDecimal> valTrap) { 
        LOG.info("Executing operation zgetPrice");
        System.out.println(canal);
        System.out.println(city);
        System.out.println(dzterm);
        System.out.println(gvCant.value);
        System.out.println(gvKunnr);
        System.out.println(gvLgort);
        System.out.println(gvMatnr);
        System.out.println(gvSite);
        System.out.println(gvSpart);
        System.out.println(gvVrkme.value);
        System.out.println(gvWerks);
        System.out.println(mp);
        System.out.println(regio);
        System.out.println(tipPers);
        System.out.println(ulStoc);
        try {
            short errorCodeValue = (short)-27950;
            errorCode.value = errorCodeValue;
            java.math.BigDecimal gvCantFreeValue = new java.math.BigDecimal("-7682136373362694726.8410634638370154221");
            gvCantFree.value = gvCantFreeValue;
            java.lang.String gvCondValue = "gvCondValue202845948";
            gvCond.value = gvCondValue;
            java.lang.String gvCurrencyValue = "gvCurrencyValue-1379257034";
            gvCurrency.value = gvCurrencyValue;
            java.lang.String gvMatnrFreeValue = "gvMatnrFreeValue-825476564";
            gvMatnrFree.value = gvMatnrFreeValue;
            java.math.BigDecimal gvNetwrValue = new java.math.BigDecimal("1298875851936941280.3861650552547110446");
            gvNetwr.value = gvNetwrValue;
            java.math.BigDecimal gvNetwrFreeValue = new java.math.BigDecimal("3895262979935418774.1016324489551965758");
            gvNetwrFree.value = gvNetwrFreeValue;
            java.math.BigDecimal gvNetwrListValue = new java.math.BigDecimal("-2382272488264743390.4617337763434972973");
            gvNetwrList.value = gvNetwrListValue;
            java.lang.String gvNoDiscValue = "gvNoDiscValue-1574722566";
            gvNoDisc.value = gvNoDiscValue;
            java.lang.String gvVrkmeFreeValue = "gvVrkmeFreeValue1895445620";
            gvVrkmeFree.value = gvVrkmeFreeValue;
            java.lang.String impachetValue = "impachetValue1745436777";
            impachet.value = impachetValue;
            java.math.BigDecimal multipluValue = new java.math.BigDecimal("-8934422732345734340.8760104040463284951");
            multiplu.value = multipluValue;
            java.math.BigDecimal outCantUmbValue = new java.math.BigDecimal("-5223824858059127672.3873659373518024026");
            outCantUmb.value = outCantUmbValue;
            java.lang.String outUmbValue = "outUmbValue75413270";
            outUmb.value = outUmbValue;
            java.math.BigDecimal procTrapValue = new java.math.BigDecimal("-3542588952116890859.5945760605288945784");
            procTrap.value = procTrapValue;
            java.lang.String vMessValue = "vMessValue1132865207";
            vMess.value = vMessValue;
            java.math.BigDecimal valTrapValue = new java.math.BigDecimal("5497112901061443663.9044395485471451646");
            valTrap.value = valTrapValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see websfa.soap.client2.ZTBLWEBSERVICE#zstareComanda(java.lang.String nrCom, java.lang.String pernrCh, java.lang.String stare, java.lang.String vMess, java.lang.String vOk)*
     */
    public void zstareComanda(java.lang.String nrCom, java.lang.String pernrCh, java.lang.String stare, javax.xml.ws.Holder<java.lang.String> vMess, javax.xml.ws.Holder<java.lang.String> vOk) { 
        LOG.info("Executing operation zstareComanda");
        System.out.println(nrCom);
        System.out.println(pernrCh);
        System.out.println(stare);
        try {
            java.lang.String vMessValue = "vMessValue2080217249";
            vMess.value = vMessValue;
            java.lang.String vOkValue = "vOkValue1273698282";
            vOk.value = vOkValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
