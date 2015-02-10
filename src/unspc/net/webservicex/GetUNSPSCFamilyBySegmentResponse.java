
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
 *         &lt;element name="GetUNSPSCFamilyBySegmentResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UNSPSCFamilyData" type="{http://www.webservicex.net/}UNSPSCFamilyList"/>
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
    "getUNSPSCFamilyBySegmentResult",
    "unspscFamilyData"
})
@XmlRootElement(name = "GetUNSPSCFamilyBySegmentResponse")
public class GetUNSPSCFamilyBySegmentResponse {

    @XmlElement(name = "GetUNSPSCFamilyBySegmentResult")
    protected boolean getUNSPSCFamilyBySegmentResult;
    @XmlElement(name = "UNSPSCFamilyData", required = true)
    protected UNSPSCFamilyList unspscFamilyData;

    /**
     * Gets the value of the getUNSPSCFamilyBySegmentResult property.
     * 
     */
    public boolean isGetUNSPSCFamilyBySegmentResult() {
        return getUNSPSCFamilyBySegmentResult;
    }

    /**
     * Sets the value of the getUNSPSCFamilyBySegmentResult property.
     * 
     */
    public void setGetUNSPSCFamilyBySegmentResult(boolean value) {
        this.getUNSPSCFamilyBySegmentResult = value;
    }

    /**
     * Gets the value of the unspscFamilyData property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSCFamilyList }
     *     
     */
    public UNSPSCFamilyList getUNSPSCFamilyData() {
        return unspscFamilyData;
    }

    /**
     * Sets the value of the unspscFamilyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSCFamilyList }
     *     
     */
    public void setUNSPSCFamilyData(UNSPSCFamilyList value) {
        this.unspscFamilyData = value;
    }

}
