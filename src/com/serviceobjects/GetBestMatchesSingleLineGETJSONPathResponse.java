
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
 *         &lt;element name="GetBestMatchesSingleLine_GETJSONPathResult" type="{http://www.serviceobjects.com}BestMatchesResponse" minOccurs="0"/>
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
    "getBestMatchesSingleLineGETJSONPathResult"
})
@XmlRootElement(name = "GetBestMatchesSingleLine_GETJSONPathResponse")
public class GetBestMatchesSingleLineGETJSONPathResponse {

    @XmlElementRef(name = "GetBestMatchesSingleLine_GETJSONPathResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BestMatchesResponse> getBestMatchesSingleLineGETJSONPathResult;

    /**
     * Gets the value of the getBestMatchesSingleLineGETJSONPathResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public JAXBElement<BestMatchesResponse> getGetBestMatchesSingleLineGETJSONPathResult() {
        return getBestMatchesSingleLineGETJSONPathResult;
    }

    /**
     * Sets the value of the getBestMatchesSingleLineGETJSONPathResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public void setGetBestMatchesSingleLineGETJSONPathResult(JAXBElement<BestMatchesResponse> value) {
        this.getBestMatchesSingleLineGETJSONPathResult = value;
    }

}
