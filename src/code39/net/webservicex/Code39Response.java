
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
 *         &lt;element name="Code39Result" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "code39Result"
})
@XmlRootElement(name = "Code39Response")
public class Code39Response {

    @XmlElement(name = "Code39Result")
    protected byte[] code39Result;

    /**
     * Gets the value of the code39Result property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCode39Result() {
        return code39Result;
    }

    /**
     * Sets the value of the code39Result property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCode39Result(byte[] value) {
        this.code39Result = value;
    }

}
