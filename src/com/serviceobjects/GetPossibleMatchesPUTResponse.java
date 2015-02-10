
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
 *         &lt;element name="PossibleMatchesResponse" type="{http://www.serviceobjects.com}PossibleMatchesResponse" minOccurs="0"/>
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
    "possibleMatchesResponse"
})
@XmlRootElement(name = "GetPossibleMatches_PUTResponse")
public class GetPossibleMatchesPUTResponse {

    @XmlElementRef(name = "PossibleMatchesResponse", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<PossibleMatchesResponse> possibleMatchesResponse;

    /**
     * Gets the value of the possibleMatchesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}
     *     
     */
    public JAXBElement<PossibleMatchesResponse> getPossibleMatchesResponse() {
        return possibleMatchesResponse;
    }

    /**
     * Sets the value of the possibleMatchesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}
     *     
     */
    public void setPossibleMatchesResponse(JAXBElement<PossibleMatchesResponse> value) {
        this.possibleMatchesResponse = value;
    }

}
