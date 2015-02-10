
package unspc.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCSegmentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCSegmentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Records" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNSPSCSegmenData" type="{http://www.webservicex.net/}ArrayOfUNSPSCSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCSegmentList", propOrder = {
    "records",
    "unspscSegmenData"
})
public class UNSPSCSegmentList {

    @XmlElement(name = "Records")
    protected int records;
    @XmlElement(name = "UNSPSCSegmenData")
    protected ArrayOfUNSPSCSegment unspscSegmenData;

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
     * Gets the value of the unspscSegmenData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUNSPSCSegment }
     *     
     */
    public ArrayOfUNSPSCSegment getUNSPSCSegmenData() {
        return unspscSegmenData;
    }

    /**
     * Sets the value of the unspscSegmenData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUNSPSCSegment }
     *     
     */
    public void setUNSPSCSegmenData(ArrayOfUNSPSCSegment value) {
        this.unspscSegmenData = value;
    }

}
