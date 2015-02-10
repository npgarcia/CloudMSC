
package unspc.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCCommodityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCCommodityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Records" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNSPSCCommodityData" type="{http://www.webservicex.net/}ArrayOfUNSPSCCommodity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCCommodityList", propOrder = {
    "records",
    "unspscCommodityData"
})
public class UNSPSCCommodityList {

    @XmlElement(name = "Records")
    protected int records;
    @XmlElement(name = "UNSPSCCommodityData")
    protected ArrayOfUNSPSCCommodity unspscCommodityData;

    /**
     * Gets the value of the records property.
     * 
     */
    public int getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     */
    public void setRecords(int value) {
        this.records = value;
    }

    /**
     * Gets the value of the unspscCommodityData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUNSPSCCommodity }
     *     
     */
    public ArrayOfUNSPSCCommodity getUNSPSCCommodityData() {
        return unspscCommodityData;
    }

    /**
     * Sets the value of the unspscCommodityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUNSPSCCommodity }
     *     
     */
    public void setUNSPSCCommodityData(ArrayOfUNSPSCCommodity value) {
        this.unspscCommodityData = value;
    }

}
