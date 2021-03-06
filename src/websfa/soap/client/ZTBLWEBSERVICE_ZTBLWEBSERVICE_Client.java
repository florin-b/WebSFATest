
package websfa.soap.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-03-09T14:39:16.015+02:00
 * Generated source version: 3.2.1
 * 
 */
public final class ZTBLWEBSERVICE_ZTBLWEBSERVICE_Client {

    private static final QName SERVICE_NAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZTBL_WEBSERVICE");

    private ZTBLWEBSERVICE_ZTBLWEBSERVICE_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ZTBLWEBSERVICE_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ZTBLWEBSERVICE_Service ss = new ZTBLWEBSERVICE_Service(wsdlURL, SERVICE_NAME);
        ZTBLWEBSERVICE port = ss.getZTBLWEBSERVICE();  
        
        {
        System.out.println("Invoking zcalcTrap...");
        java.lang.String _zcalcTrap_vCity = "_zcalcTrap_vCity1251673420";
        java.lang.String _zcalcTrap_vKunnr = "_zcalcTrap_vKunnr1528709342";
        java.math.BigDecimal _zcalcTrap_vNetwr = new java.math.BigDecimal("140971654567126796.3129460441914539429");
        java.lang.String _zcalcTrap_vRegio = "_zcalcTrap_vRegio-1994232923";
        java.lang.String _zcalcTrap_vUl = "_zcalcTrap_vUl945276079";
        java.math.BigDecimal _zcalcTrap__return = port.zcalcTrap(_zcalcTrap_vCity, _zcalcTrap_vKunnr, _zcalcTrap_vNetwr, _zcalcTrap_vRegio, _zcalcTrap_vUl);
        System.out.println("zcalcTrap.result=" + _zcalcTrap__return);


        }
        {
        System.out.println("Invoking zactDiscMaxim...");
        java.lang.String _zactDiscMaxim_pattId = "_zactDiscMaxim_pattId-649089916";
        java.lang.String _zactDiscMaxim__return = port.zactDiscMaxim(_zactDiscMaxim_pattId);
        System.out.println("zactDiscMaxim.result=" + _zactDiscMaxim__return);


        }
        {
        System.out.println("Invoking zcreazaComanda...");
        java.lang.String _zcreazaComanda_canal = "_zcreazaComanda_canal1725727194";
        java.lang.String _zcreazaComanda_faraTransp = "_zcreazaComanda_faraTransp446628456";
        java.lang.String _zcreazaComanda_gvEvent = "_zcreazaComanda_gvEvent368886904";
        java.lang.String _zcreazaComanda_id = "_zcreazaComanda_id-335142620";
        javax.xml.ws.Holder<java.lang.String> _zcreazaComanda_vMesaj = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zcreazaComanda_vOk = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zcreazaComanda_vTrans = new javax.xml.ws.Holder<java.math.BigDecimal>();
        port.zcreazaComanda(_zcreazaComanda_canal, _zcreazaComanda_faraTransp, _zcreazaComanda_gvEvent, _zcreazaComanda_id, _zcreazaComanda_vMesaj, _zcreazaComanda_vOk, _zcreazaComanda_vTrans);

        System.out.println("zcreazaComanda._zcreazaComanda_vMesaj=" + _zcreazaComanda_vMesaj.value);
        System.out.println("zcreazaComanda._zcreazaComanda_vOk=" + _zcreazaComanda_vOk.value);
        System.out.println("zcreazaComanda._zcreazaComanda_vTrans=" + _zcreazaComanda_vTrans.value);

        }
        {
        System.out.println("Invoking zgetPrice...");
        java.lang.String _zgetPrice_canal = "_zgetPrice_canal71261035";
        java.lang.String _zgetPrice_city = "_zgetPrice_city-2051720895";
        java.lang.String _zgetPrice_dzterm = "_zgetPrice_dzterm509574840";
        java.math.BigDecimal _zgetPrice_gvCantVal = new java.math.BigDecimal("3018616657245908618.8274069924024987046");
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_gvCant = new javax.xml.ws.Holder<java.math.BigDecimal>(_zgetPrice_gvCantVal);
        java.lang.String _zgetPrice_gvKunnr = "_zgetPrice_gvKunnr-157750558";
        java.lang.String _zgetPrice_gvLgort = "_zgetPrice_gvLgort671023264";
        java.lang.String _zgetPrice_gvMatnr = "_zgetPrice_gvMatnr-1488444853";
        java.lang.String _zgetPrice_gvSite = "_zgetPrice_gvSite-1661846141";
        java.lang.String _zgetPrice_gvSpart = "_zgetPrice_gvSpart-2054334387";
        java.lang.String _zgetPrice_gvVrkmeVal = "_zgetPrice_gvVrkmeVal2066072527";
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvVrkme = new javax.xml.ws.Holder<java.lang.String>(_zgetPrice_gvVrkmeVal);
        java.lang.String _zgetPrice_gvWerks = "_zgetPrice_gvWerks1761656187";
        java.lang.String _zgetPrice_mp = "_zgetPrice_mp-1199621377";
        java.lang.String _zgetPrice_regio = "_zgetPrice_regio1329838753";
        java.lang.String _zgetPrice_tipPers = "_zgetPrice_tipPers1758004719";
        java.lang.String _zgetPrice_ulStoc = "_zgetPrice_ulStoc-1724817180";
        javax.xml.ws.Holder<java.lang.Short> _zgetPrice_errorCode = new javax.xml.ws.Holder<java.lang.Short>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_gvCantFree = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvCond = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvCurrency = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvMatnrFree = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_gvNetwr = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_gvNetwrFree = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_gvNetwrList = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvNoDisc = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_gvVrkmeFree = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_impachet = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_multiplu = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_outCantUmb = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_outUmb = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_procTrap = new javax.xml.ws.Holder<java.math.BigDecimal>();
        javax.xml.ws.Holder<java.lang.String> _zgetPrice_vMess = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.math.BigDecimal> _zgetPrice_valTrap = new javax.xml.ws.Holder<java.math.BigDecimal>();
        port.zgetPrice(_zgetPrice_canal, _zgetPrice_city, _zgetPrice_dzterm, _zgetPrice_gvCant, _zgetPrice_gvKunnr, _zgetPrice_gvLgort, _zgetPrice_gvMatnr, _zgetPrice_gvSite, _zgetPrice_gvSpart, _zgetPrice_gvVrkme, _zgetPrice_gvWerks, _zgetPrice_mp, _zgetPrice_regio, _zgetPrice_tipPers, _zgetPrice_ulStoc, _zgetPrice_errorCode, _zgetPrice_gvCantFree, _zgetPrice_gvCond, _zgetPrice_gvCurrency, _zgetPrice_gvMatnrFree, _zgetPrice_gvNetwr, _zgetPrice_gvNetwrFree, _zgetPrice_gvNetwrList, _zgetPrice_gvNoDisc, _zgetPrice_gvVrkmeFree, _zgetPrice_impachet, _zgetPrice_multiplu, _zgetPrice_outCantUmb, _zgetPrice_outUmb, _zgetPrice_procTrap, _zgetPrice_vMess, _zgetPrice_valTrap);

        System.out.println("zgetPrice._zgetPrice_gvCant=" + _zgetPrice_gvCant.value);
        System.out.println("zgetPrice._zgetPrice_gvVrkme=" + _zgetPrice_gvVrkme.value);
        System.out.println("zgetPrice._zgetPrice_errorCode=" + _zgetPrice_errorCode.value);
        System.out.println("zgetPrice._zgetPrice_gvCantFree=" + _zgetPrice_gvCantFree.value);
        System.out.println("zgetPrice._zgetPrice_gvCond=" + _zgetPrice_gvCond.value);
        System.out.println("zgetPrice._zgetPrice_gvCurrency=" + _zgetPrice_gvCurrency.value);
        System.out.println("zgetPrice._zgetPrice_gvMatnrFree=" + _zgetPrice_gvMatnrFree.value);
        System.out.println("zgetPrice._zgetPrice_gvNetwr=" + _zgetPrice_gvNetwr.value);
        System.out.println("zgetPrice._zgetPrice_gvNetwrFree=" + _zgetPrice_gvNetwrFree.value);
        System.out.println("zgetPrice._zgetPrice_gvNetwrList=" + _zgetPrice_gvNetwrList.value);
        System.out.println("zgetPrice._zgetPrice_gvNoDisc=" + _zgetPrice_gvNoDisc.value);
        System.out.println("zgetPrice._zgetPrice_gvVrkmeFree=" + _zgetPrice_gvVrkmeFree.value);
        System.out.println("zgetPrice._zgetPrice_impachet=" + _zgetPrice_impachet.value);
        System.out.println("zgetPrice._zgetPrice_multiplu=" + _zgetPrice_multiplu.value);
        System.out.println("zgetPrice._zgetPrice_outCantUmb=" + _zgetPrice_outCantUmb.value);
        System.out.println("zgetPrice._zgetPrice_outUmb=" + _zgetPrice_outUmb.value);
        System.out.println("zgetPrice._zgetPrice_procTrap=" + _zgetPrice_procTrap.value);
        System.out.println("zgetPrice._zgetPrice_vMess=" + _zgetPrice_vMess.value);
        System.out.println("zgetPrice._zgetPrice_valTrap=" + _zgetPrice_valTrap.value);

        }
        {
        System.out.println("Invoking zstareComanda...");
        java.lang.String _zstareComanda_nrCom = "_zstareComanda_nrCom1660535771";
        java.lang.String _zstareComanda_pernrCh = "_zstareComanda_pernrCh-454433111";
        java.lang.String _zstareComanda_stare = "_zstareComanda_stare560860114";
        javax.xml.ws.Holder<java.lang.String> _zstareComanda_vMess = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _zstareComanda_vOk = new javax.xml.ws.Holder<java.lang.String>();
        port.zstareComanda(_zstareComanda_nrCom, _zstareComanda_pernrCh, _zstareComanda_stare, _zstareComanda_vMess, _zstareComanda_vOk);

        System.out.println("zstareComanda._zstareComanda_vMess=" + _zstareComanda_vMess.value);
        System.out.println("zstareComanda._zstareComanda_vOk=" + _zstareComanda_vOk.value);

        }

        System.exit(0);
    }

}
