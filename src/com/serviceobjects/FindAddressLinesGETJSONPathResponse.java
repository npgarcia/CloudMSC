
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
 *         &lt;element name="FindAddressLines_GETJSONPathResult" type="{http://www.serviceobjects.com}AddressLinesResponse" minOccurs="0"/>
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
    "findAddressLinesGETJSONPathResult"
})
@XmlRootElement(name = "FindAddressLines_GETJSONPathResponse")
public class FindAddressLinesGETJSONPathResponse {

    @XmlElementRef(name = "FindAddressLines_GETJSONPathResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressLinesResponse> findAddressLinesGETJSONPathResult;

    /**
     * Gets the value of the findAddressLinesGETJSONPathResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}
     *     
     */
    public JAXBElement<AddressLinesResponse> getFindAddressLinesGETJSONPathResult() {
        return findAddressLinesGETJSONPathResult;
    }

    /**
     * Sets the value of the findAddressLinesGETJSONPathResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}
     *     
     */
    public void setFindAddressLinesGETJSONPathResult(JAXBElement<AddressLinesResponse> value) {
        this.findAddressLinesGETJSONPathResult = value;
    }

}
