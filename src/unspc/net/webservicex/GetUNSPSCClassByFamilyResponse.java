
package unspc.net.webservicex;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUNSPSCClassByFamilyResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UNSPSCClassData" type="{http://www.webservicex.net/}UNSPSCClassList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUNSPSCClassByFamilyResult",
    "unspscClassData"
})
@XmlRootElement(name = "GetUNSPSCClassByFamilyResponse")
public class GetUNSPSCClassByFamilyResponse {

    @XmlElement(name = "GetUNSPSCClassByFamilyResult")
    protected boolean getUNSPSCClassByFamilyResult;
    @XmlElement(name = "UNSPSCClassData", required = true)
    protected UNSPSCClassList unspscClassData;

    /**
     * Gets the value of the getUNSPSCClassByFamilyResult property.
     * 
     */
    public boolean isGetUNSPSCClassByFamilyResult() {
        return getUNSPSCClassByFamilyResult;
    }

    /**
     * Sets the value of the getUNSPSCClassByFamilyResult property.
     * 
     */
    public void setGetUNSPSCClassByFamilyResult(boolean value) {
        this.getUNSPSCClassByFamilyResult = value;
    }

    /**
     * Gets the value of the unspscClassData property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSCClassList }
     *     
     */
    public UNSPSCClassList getUNSPSCClassData() {
        return unspscClassData;
    }

    /**
     * Sets the value of the unspscClassData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSCClassList }
     *     
     */
    public void setUNSPSCClassData(UNSPSCClassList value) {
        this.unspscClassData = value;
    }

}
