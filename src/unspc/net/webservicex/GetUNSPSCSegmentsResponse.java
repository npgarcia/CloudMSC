
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
 *         &lt;element name="GetUNSPSCSegmentsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UNSPSCSegmentData" type="{http://www.webservicex.net/}UNSPSCSegmentList"/>
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
    "getUNSPSCSegmentsResult",
    "unspscSegmentData"
})
@XmlRootElement(name = "GetUNSPSCSegmentsResponse")
public class GetUNSPSCSegmentsResponse {

    @XmlElement(name = "GetUNSPSCSegmentsResult")
    protected boolean getUNSPSCSegmentsResult;
    @XmlElement(name = "UNSPSCSegmentData", required = true)
    protected UNSPSCSegmentList unspscSegmentData;

    /**
     * Gets the value of the getUNSPSCSegmentsResult property.
     * 
     */
    public boolean isGetUNSPSCSegmentsResult() {
        return getUNSPSCSegmentsResult;
    }

    /**
     * Sets the value of the getUNSPSCSegmentsResult property.
     * 
     */
    public void setGetUNSPSCSegmentsResult(boolean value) {
        this.getUNSPSCSegmentsResult = value;
    }

    /**
     * Gets the value of the unspscSegmentData property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSCSegmentList }
     *     
     */
    public UNSPSCSegmentList getUNSPSCSegmentData() {
        return unspscSegmentData;
    }

    /**
     * Sets the value of the unspscSegmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSCSegmentList }
     *     
     */
    public void setUNSPSCSegmentData(UNSPSCSegmentList value) {
        this.unspscSegmentData = value;
    }

}
