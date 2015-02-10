
package code39.net.webservicex;

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
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BarSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShowCodeString" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "code",
    "barSize",
    "showCodeString",
    "title"
})
@XmlRootElement(name = "Code39")
public class Code39 {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "BarSize")
    protected int barSize;
    @XmlElement(name = "ShowCodeString")
    protected boolean showCodeString;
    @XmlElement(name = "Title")
    protected String title;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the barSize property.
     * 
     */
    public int getBarSize() {
        return barSize;
    }

    /**
     * Sets the value of the barSize property.
     * 
     */
    public void setBarSize(int value) {
        this.barSize = value;
    }

    /**
     * Gets the value of the showCodeString property.
     * 
     */
    public boolean isShowCodeString() {
        return showCodeString;
    }

    /**
     * Sets the value of the showCodeString property.
     * 
     */
    public void setShowCodeString(boolean value) {
        this.showCodeString = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
