
package unspc.net.webservicex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUNSPSCClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUNSPSCClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UNSPSCClass" type="{http://www.webservicex.net/}UNSPSCClass" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUNSPSCClass", propOrder = {
    "unspscClass"
})
public class ArrayOfUNSPSCClass {

    @XmlElement(name = "UNSPSCClass")
    protected List<UNSPSCClass> unspscClass;

    /**
     * Gets the value of the unspscClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unspscClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNSPSCClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNSPSCClass }
     * 
     * 
     */
    public List<UNSPSCClass> getUNSPSCClass() {
        if (unspscClass == null) {
            unspscClass = new ArrayList<UNSPSCClass>();
        }
        return this.unspscClass;
    }

}
