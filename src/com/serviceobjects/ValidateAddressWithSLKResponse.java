
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
 *         &lt;element name="ValidateAddressWithSLKResult" type="{http://www.serviceobjects.com}SuiteLinkResponse" minOccurs="0"/>
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
    "validateAddressWithSLKResult"
})
@XmlRootElement(name = "ValidateAddressWithSLKResponse")
public class ValidateAddressWithSLKResponse {

    @XmlElementRef(name = "ValidateAddressWithSLKResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SuiteLinkResponse> validateAddressWithSLKResult;

    /**
     * Gets the value of the validateAddressWithSLKResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}
     *     
     */
    public JAXBElement<SuiteLinkResponse> getValidateAddressWithSLKResult() {
        return validateAddressWithSLKResult;
    }

    /**
     * Sets the value of the validateAddressWithSLKResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}
     *     
     */
    public void setValidateAddressWithSLKResult(JAXBElement<SuiteLinkResponse> value) {
        this.validateAddressWithSLKResult = value;
    }

}
