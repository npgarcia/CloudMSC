
package unspc.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCCommodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCCommodity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commodity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommodityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCCommodity", propOrder = {
    "commodity",
    "commodityTitle"
})
public class UNSPSCCommodity {

    @XmlElement(name = "Commodity")
    protected String commodity;
    @XmlElement(name = "CommodityTitle")
    protected String commodityTitle;

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the commodityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityTitle() {
        return commodityTitle;
    }

    /**
     * Sets the value of the commodityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityTitle(String value) {
        this.commodityTitle = value;
    }

}
