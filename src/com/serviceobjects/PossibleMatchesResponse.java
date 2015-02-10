
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PossibleMatchesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleMatchesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PossibleMatches" type="{http://www.serviceobjects.com}ArrayOfAddressCandidate" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com}AV3Error" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleMatchesResponse", propOrder = {
    "possibleMatches",
    "error"
})
public class PossibleMatchesResponse {

    @XmlElementRef(name = "PossibleMatches", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddressCandidate> possibleMatches;
    @XmlElementRef(name = "Error", namespace = "http://www.serviceobjects.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AV3Error> error;

    /**
     * Gets the value of the possibleMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressCandidate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddressCandidate> getPossibleMatches() {
        return possibleMatches;
    }

    /**
     * Sets the value of the possibleMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressCandidate }{@code >}
     *     
     */
    public void setPossibleMatches(JAXBElement<ArrayOfAddressCandidate> value) {
        this.possibleMatches = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AV3Error }{@code >}
     *     
     */
    public JAXBElement<AV3Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AV3Error }{@code >}
     *     
     */
    public void setError(JAXBElement<AV3Error> value) {
        this.error = value;
    }

}
