
package unspc.net.webservicex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUNSPSCFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUNSPSCFamily">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UNSPSCFamily" type="{http://www.webservicex.net/}UNSPSCFamily" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUNSPSCFamily", propOrder = {
    "unspscFamily"
})
public class ArrayOfUNSPSCFamily {

    @XmlElement(name = "UNSPSCFamily")
    protected List<UNSPSCFamily> unspscFamily;

    /**
     * Gets the value of the unspscFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unspscFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNSPSCFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNSPSCFamily }
     * 
     * 
     */
    public List<UNSPSCFamily> getUNSPSCFamily() {
        if (unspscFamily == null) {
            unspscFamily = new ArrayList<UNSPSCFamily>();
        }
        return this.unspscFamily;
    }

}
