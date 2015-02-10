
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestMatchesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestMatchesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://www.serviceobjects.com}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com}AV3Error" minOccurs="0"/>
 *         &lt;element name="IsCASS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestMatchesResponse", propOrder = {
    "addresses",
    "error",
    "isCASS"
})
public class BestMatchesResponse {

    @XmlElementRef(name = "Addresses", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddress> addresses;
    @XmlElementRef(name = "Error", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AV3Error> error;
    @XmlElement(name = "IsCASS")
    protected Boolean isCASS;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddress> getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public void setAddresses(JAXBElement<ArrayOfAddress> value) {
        this.addresses = value;
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

    /**
     * Gets the value of the isCASS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCASS() {
        return isCASS;
    }

    /**
     * Sets the value of the isCASS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCASS(Boolean value) {
        this.isCASS = value;
    }

}
