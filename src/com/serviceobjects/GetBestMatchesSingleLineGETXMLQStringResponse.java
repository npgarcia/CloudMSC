
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
 *         &lt;element name="GetBestMatchesSingleLine_GETXMLQStringResult" type="{http://www.serviceobjects.com}BestMatchesResponse" minOccurs="0"/>
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
    "getBestMatchesSingleLineGETXMLQStringResult"
})
@XmlRootElement(name = "GetBestMatchesSingleLine_GETXMLQStringResponse")
public class GetBestMatchesSingleLineGETXMLQStringResponse {

    @XmlElementRef(name = "GetBestMatchesSingleLine_GETXMLQStringResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BestMatchesResponse> getBestMatchesSingleLineGETXMLQStringResult;

    /**
     * Gets the value of the getBestMatchesSingleLineGETXMLQStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public JAXBElement<BestMatchesResponse> getGetBestMatchesSingleLineGETXMLQStringResult() {
        return getBestMatchesSingleLineGETXMLQStringResult;
    }

    /**
     * Sets the value of the getBestMatchesSingleLineGETXMLQStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public void setGetBestMatchesSingleLineGETXMLQStringResult(JAXBElement<BestMatchesResponse> value) {
        this.getBestMatchesSingleLineGETXMLQStringResult = value;
    }

}
