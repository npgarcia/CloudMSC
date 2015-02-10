
package unspc.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCClassList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCClassList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Records" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNSPSCClassData" type="{http://www.webservicex.net/}ArrayOfUNSPSCClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCClassList", propOrder = {
    "records",
    "unspscClassData"
})
public class UNSPSCClassList {

    @XmlElement(name = "Records")
    protected int records;
    @XmlElement(name = "UNSPSCClassData")
    protected ArrayOfUNSPSCClass unspscClassData;

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
     * Gets the value of the unspscClassData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUNSPSCClass }
     *     
     */
    public ArrayOfUNSPSCClass getUNSPSCClassData() {
        return unspscClassData;
    }

    /**
     * Sets the value of the unspscClassData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUNSPSCClass }
     *     
     */
    public void setUNSPSCClassData(ArrayOfUNSPSCClass value) {
        this.unspscClassData = value;
    }

}
