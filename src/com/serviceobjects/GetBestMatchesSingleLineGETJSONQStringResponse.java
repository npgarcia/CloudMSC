
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
 *         &lt;element name="GetBestMatchesSingleLine_GETJSONQStringResult" type="{http://www.serviceobjects.com}BestMatchesResponse" minOccurs="0"/>
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
    "getBestMatchesSingleLineGETJSONQStringResult"
})
@XmlRootElement(name = "GetBestMatchesSingleLine_GETJSONQStringResponse")
public class GetBestMatchesSingleLineGETJSONQStringResponse {

    @XmlElementRef(name = "GetBestMatchesSingleLine_GETJSONQStringResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BestMatchesResponse> getBestMatchesSingleLineGETJSONQStringResult;

    /**
     * Gets the value of the getBestMatchesSingleLineGETJSONQStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public JAXBElement<BestMatchesResponse> getGetBestMatchesSingleLineGETJSONQStringResult() {
        return getBestMatchesSingleLineGETJSONQStringResult;
    }

    /**
     * Sets the value of the getBestMatchesSingleLineGETJSONQStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public void setGetBestMatchesSingleLineGETJSONQStringResult(JAXBElement<BestMatchesResponse> value) {
        this.getBestMatchesSingleLineGETJSONQStringResult = value;
    }

}
