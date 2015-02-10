
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
 *         &lt;element name="DPVAddressResponse" type="{http://www.serviceobjects.com}DPVAddressResponse" minOccurs="0"/>
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
    "dpvAddressResponse"
})
@XmlRootElement(name = "ValidateAddressSingleLine_GETJSONResponse")
public class ValidateAddressSingleLineGETJSONResponse {

    @XmlElementRef(name = "DPVAddressResponse", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<DPVAddressResponse> dpvAddressResponse;

    /**
     * Gets the value of the dpvAddressResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}
     *     
     */
    public JAXBElement<DPVAddressResponse> getDPVAddressResponse() {
        return dpvAddressResponse;
    }

    /**
     * Sets the value of the dpvAddressResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}
     *     
     */
    public void setDPVAddressResponse(JAXBElement<DPVAddressResponse> value) {
        this.dpvAddressResponse = value;
    }

}
