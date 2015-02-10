
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="RDIAddressResponse" type="{http://www.serviceobjects.com}RDIAddressResponse" minOccurs="0"/>
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
    "rdiAddressResponse"
})
@XmlRootElement(name = "ValidateAddressWithRDI_DELETEResponse")
public class ValidateAddressWithRDIDELETEResponse {

    @XmlElementRef(name = "RDIAddressResponse", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RDIAddressResponse> rdiAddressResponse;

    /**
     * Gets the value of the rdiAddressResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}
     *     
     */
    public JAXBElement<RDIAddressResponse> getRDIAddressResponse() {
        return rdiAddressResponse;
    }

    /**
     * Sets the value of the rdiAddressResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}
     *     
     */
    public void setRDIAddressResponse(JAXBElement<RDIAddressResponse> value) {
        this.rdiAddressResponse = value;
    }

}
