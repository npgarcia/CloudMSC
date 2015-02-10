
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
 *         &lt;element name="CityStateZipResponse" type="{http://www.serviceobjects.com}CityStateZipResponse" minOccurs="0"/>
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
    "cityStateZipResponse"
})
@XmlRootElement(name = "ValidateCityStateZip_PUTResponse")
public class ValidateCityStateZipPUTResponse {

    @XmlElementRef(name = "CityStateZipResponse", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CityStateZipResponse> cityStateZipResponse;

    /**
     * Gets the value of the cityStateZipResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}
     *     
     */
    public JAXBElement<CityStateZipResponse> getCityStateZipResponse() {
        return cityStateZipResponse;
    }

    /**
     * Sets the value of the cityStateZipResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}
     *     
     */
    public void setCityStateZipResponse(JAXBElement<CityStateZipResponse> value) {
        this.cityStateZipResponse = value;
    }

}