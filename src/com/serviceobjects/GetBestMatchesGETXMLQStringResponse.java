
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
 *         &lt;element name="GetBestMatches_GETXMLQStringResult" type="{http://www.serviceobjects.com}BestMatchesResponse" minOccurs="0"/>
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
    "getBestMatchesGETXMLQStringResult"
})
@XmlRootElement(name = "GetBestMatches_GETXMLQStringResponse")
public class GetBestMatchesGETXMLQStringResponse {

    @XmlElementRef(name = "GetBestMatches_GETXMLQStringResult", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BestMatchesResponse> getBestMatchesGETXMLQStringResult;

    /**
     * Gets the value of the getBestMatchesGETXMLQStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public JAXBElement<BestMatchesResponse> getGetBestMatchesGETXMLQStringResult() {
        return getBestMatchesGETXMLQStringResult;
    }

    /**
     * Sets the value of the getBestMatchesGETXMLQStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}
     *     
     */
    public void setGetBestMatchesGETXMLQStringResult(JAXBElement<BestMatchesResponse> value) {
        this.getBestMatchesGETXMLQStringResult = value;
    }

}
