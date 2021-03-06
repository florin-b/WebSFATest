
package websfa.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VMess" type="{urn:sap-com:document:sap:rfc:functions}char220"/&gt;
 *         &lt;element name="VOk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vMess",
    "vOk"
})
@XmlRootElement(name = "ZstareComandaResponse")
public class ZstareComandaResponse {

    @XmlElement(name = "VMess", required = true)
    protected String vMess;
    @XmlElement(name = "VOk", required = true)
    protected String vOk;

    /**
     * Gets the value of the vMess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMess() {
        return vMess;
    }

    /**
     * Sets the value of the vMess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMess(String value) {
        this.vMess = value;
    }

    /**
     * Gets the value of the vOk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOk() {
        return vOk;
    }

    /**
     * Sets the value of the vOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOk(String value) {
        this.vOk = value;
    }

}
