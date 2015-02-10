
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDIAddressResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDIAddressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RDIAddress" type="{http://www.serviceobjects.com}RDIAddress" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com}AV3Error" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RDIAddressResponse", propOrder = {
    "rdiAddress",
    "error"
})
public class RDIAddressResponse {

    @XmlElementRef(name = "RDIAddress", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RDIAddress> rdiAddress;
    @XmlElementRef(name = "Error", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AV3Error> error;

    /**
     * Gets the value of the rdiAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RDIAddress }{@code >}
     *     
     */
    public JAXBElement<RDIAddress> getRDIAddress() {
        return rdiAddress;
    }

    /**
     * Sets the value of the rdiAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RDIAddress }{@code >}
     *     
     */
    public void setRDIAddress(JAXBElement<RDIAddress> value) {
        this.rdiAddress = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AV3Error }{@code >}
     *     
     */
    public JAXBElement<AV3Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AV3Error }{@code >}
     *     
     */
    public void setError(JAXBElement<AV3Error> value) {
        this.error = value;
    }

}
