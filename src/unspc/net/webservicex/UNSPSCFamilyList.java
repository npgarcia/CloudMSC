
package unspc.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCFamilyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCFamilyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Records" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNSPSCFamilyData" type="{http://www.webservicex.net/}ArrayOfUNSPSCFamily" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCFamilyList", propOrder = {
    "records",
    "unspscFamilyData"
})
public class UNSPSCFamilyList {

    @XmlElement(name = "Records")
    protected int records;
    @XmlElement(name = "UNSPSCFamilyData")
    protected ArrayOfUNSPSCFamily unspscFamilyData;

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
     * Gets the value of the unspscFamilyData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUNSPSCFamily }
     *     
     */
    public ArrayOfUNSPSCFamily getUNSPSCFamilyData() {
        return unspscFamilyData;
    }

    /**
     * Sets the value of the unspscFamilyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUNSPSCFamily }
     *     
     */
    public void setUNSPSCFamilyData(ArrayOfUNSPSCFamily value) {
        this.unspscFamilyData = value;
    }

}
