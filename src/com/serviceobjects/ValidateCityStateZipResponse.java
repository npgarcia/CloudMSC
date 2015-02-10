
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
 *         &lt;element name="ValidateCityStateZipResult" type="{http://www.serviceobjects.com}CityStateZipResponse" minOccurs="0"/>
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
    "validateCityStateZipResult"
})
@XmlRootElement(name = "ValidateCityStateZipResponse")
public class ValidateCityStateZipResponse {

    @XmlElementRef(name = "ValidateCityStateZipResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CityStateZipResponse> validateCityStateZipResult;

    /**
     * Gets the value of the validateCityStateZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}
     *     
     */
    public JAXBElement<CityStateZipResponse> getValidateCityStateZipResult() {
        return validateCityStateZipResult;
    }

    /**
     * Sets the value of the validateCityStateZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}
     *     
     */
    public void setValidateCityStateZipResult(JAXBElement<CityStateZipResponse> value) {
        this.validateCityStateZipResult = value;
    }

}
