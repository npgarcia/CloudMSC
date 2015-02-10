
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
 *         &lt;element name="GetUNSPSCByCommodityByTitleResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UNSPSCCommodityData" type="{http://www.webservicex.net/}UNSPSCCommodityList"/>
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
    "getUNSPSCByCommodityByTitleResult",
    "unspscCommodityData"
})
@XmlRootElement(name = "GetUNSPSCByCommodityByTitleResponse")
public class GetUNSPSCByCommodityByTitleResponse {

    @XmlElement(name = "GetUNSPSCByCommodityByTitleResult")
    protected boolean getUNSPSCByCommodityByTitleResult;
    @XmlElement(name = "UNSPSCCommodityData", required = true)
    protected UNSPSCCommodityList unspscCommodityData;

    /**
     * Gets the value of the getUNSPSCByCommodityByTitleResult property.
     * 
     */
    public boolean isGetUNSPSCByCommodityByTitleResult() {
        return getUNSPSCByCommodityByTitleResult;
    }

    /**
     * Sets the value of the getUNSPSCByCommodityByTitleResult property.
     * 
     */
    public void setGetUNSPSCByCommodityByTitleResult(boolean value) {
        this.getUNSPSCByCommodityByTitleResult = value;
    }

    /**
     * Gets the value of the unspscCommodityData property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSCCommodityList }
     *     
     */
    public UNSPSCCommodityList getUNSPSCCommodityData() {
        return unspscCommodityData;
    }

    /**
     * Sets the value of the unspscCommodityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSCCommodityList }
     *     
     */
    public void setUNSPSCCommodityData(UNSPSCCommodityList value) {
        this.unspscCommodityData = value;
    }

}
