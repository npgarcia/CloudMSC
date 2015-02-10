
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.serviceobjects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateCityStateZipZip_QNAME = new QName("http://www.serviceobjects.com", "Zip");
    private final static QName _ValidateCityStateZipCity_QNAME = new QName("http://www.serviceobjects.com", "City");
    private final static QName _ValidateCityStateZipLicenseKey_QNAME = new QName("http://www.serviceobjects.com", "LicenseKey");
    private final static QName _ValidateCityStateZipState_QNAME = new QName("http://www.serviceobjects.com", "State");
    private final static QName _AddressLinesResponse_QNAME = new QName("http://www.serviceobjects.com", "AddressLinesResponse");
    private final static QName _CityStateZipInfo_QNAME = new QName("http://www.serviceobjects.com", "CityStateZipInfo");
    private final static QName _RDIAddress_QNAME = new QName("http://www.serviceobjects.com", "RDIAddress");
    private final static QName _Address_QNAME = new QName("http://www.serviceobjects.com", "Address");
    private final static QName _CityStateZipResponse_QNAME = new QName("http://www.serviceobjects.com", "CityStateZipResponse");
    private final static QName _AddressFragments_QNAME = new QName("http://www.serviceobjects.com", "AddressFragments");
    private final static QName _SuiteLinkResponse_QNAME = new QName("http://www.serviceobjects.com", "SuiteLinkResponse");
    private final static QName _AddressCandidate_QNAME = new QName("http://www.serviceobjects.com", "AddressCandidate");
    private final static QName _SuiteLinkAddress_QNAME = new QName("http://www.serviceobjects.com", "SuiteLinkAddress");
    private final static QName _DPVAddressResponse_QNAME = new QName("http://www.serviceobjects.com", "DPVAddressResponse");
    private final static QName _RDIAddressResponse_QNAME = new QName("http://www.serviceobjects.com", "RDIAddressResponse");
    private final static QName _PossibleMatchesResponse_QNAME = new QName("http://www.serviceobjects.com", "PossibleMatchesResponse");
    private final static QName _AV3Error_QNAME = new QName("http://www.serviceobjects.com", "AV3Error");
    private final static QName _BestMatchesResponse_QNAME = new QName("http://www.serviceobjects.com", "BestMatchesResponse");
    private final static QName _ArrayOfAddressCandidate_QNAME = new QName("http://www.serviceobjects.com", "ArrayOfAddressCandidate");
    private final static QName _ArrayOfAddress_QNAME = new QName("http://www.serviceobjects.com", "ArrayOfAddress");
    private final static QName _ParsedAddressResponse_QNAME = new QName("http://www.serviceobjects.com", "ParsedAddressResponse");
    private final static QName _DPVAddress_QNAME = new QName("http://www.serviceobjects.com", "DPVAddress");
    private final static QName _GetBestMatchesPOSTJSONBusinessName_QNAME = new QName("http://www.serviceobjects.com", "BusinessName");
    private final static QName _GetBestMatchesPOSTJSONPostalCode_QNAME = new QName("http://www.serviceobjects.com", "PostalCode");
    private final static QName _GetBestMatchesPOSTJSONAddress2_QNAME = new QName("http://www.serviceobjects.com", "Address2");
    private final static QName _FindAddressLinesResponseFindAddressLinesResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLinesResult");
    private final static QName _AV3ErrorDescCode_QNAME = new QName("http://www.serviceobjects.com", "DescCode");
    private final static QName _AV3ErrorDesc_QNAME = new QName("http://www.serviceobjects.com", "Desc");
    private final static QName _AV3ErrorTypeCode_QNAME = new QName("http://www.serviceobjects.com", "TypeCode");
    private final static QName _AV3ErrorType_QNAME = new QName("http://www.serviceobjects.com", "Type");
    private final static QName _GetBestMatchesResponseGetBestMatchesResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesResult");
    private final static QName _GetBestMatchesGETJSONPathResponseGetBestMatchesGETJSONPathResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatches_GETJSONPathResult");
    private final static QName _AddressCandidateFragmentPMBNumber_QNAME = new QName("http://www.serviceobjects.com", "FragmentPMBNumber");
    private final static QName _AddressCandidateCountyName_QNAME = new QName("http://www.serviceobjects.com", "CountyName");
    private final static QName _AddressCandidateFragment_QNAME = new QName("http://www.serviceobjects.com", "Fragment");
    private final static QName _AddressCandidateDPVNotesDesc_QNAME = new QName("http://www.serviceobjects.com", "DPVNotesDesc");
    private final static QName _AddressCandidateCorrections_QNAME = new QName("http://www.serviceobjects.com", "Corrections");
    private final static QName _AddressCandidateCountyCode_QNAME = new QName("http://www.serviceobjects.com", "CountyCode");
    private final static QName _AddressCandidateDebug_QNAME = new QName("http://www.serviceobjects.com", "Debug");
    private final static QName _AddressCandidateFragmentStreet_QNAME = new QName("http://www.serviceobjects.com", "FragmentStreet");
    private final static QName _AddressCandidateFragmentUnit_QNAME = new QName("http://www.serviceobjects.com", "FragmentUnit");
    private final static QName _AddressCandidateFragmentPreDir_QNAME = new QName("http://www.serviceobjects.com", "FragmentPreDir");
    private final static QName _AddressCandidateCongressCode_QNAME = new QName("http://www.serviceobjects.com", "CongressCode");
    private final static QName _AddressCandidateCarrierRoute_QNAME = new QName("http://www.serviceobjects.com", "CarrierRoute");
    private final static QName _AddressCandidateDPV_QNAME = new QName("http://www.serviceobjects.com", "DPV");
    private final static QName _AddressCandidateFragmentPostDir_QNAME = new QName("http://www.serviceobjects.com", "FragmentPostDir");
    private final static QName _AddressCandidateCorrectionsDesc_QNAME = new QName("http://www.serviceobjects.com", "CorrectionsDesc");
    private final static QName _AddressCandidateDPVDesc_QNAME = new QName("http://www.serviceobjects.com", "DPVDesc");
    private final static QName _AddressCandidateDPVNotes_QNAME = new QName("http://www.serviceobjects.com", "DPVNotes");
    private final static QName _AddressCandidateFragmentPMBPrefix_QNAME = new QName("http://www.serviceobjects.com", "FragmentPMBPrefix");
    private final static QName _AddressCandidateFragmentHouse_QNAME = new QName("http://www.serviceobjects.com", "FragmentHouse");
    private final static QName _AddressCandidateFragmentSuffix_QNAME = new QName("http://www.serviceobjects.com", "FragmentSuffix");
    private final static QName _AddressCandidateBarcodeDigits_QNAME = new QName("http://www.serviceobjects.com", "BarcodeDigits");
    private final static QName _GetBestMatchesPOSTJSONResponseGetBestMatchesPOSTJSONResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatches_POSTJSONResult");
    private final static QName _ValidateCityStateZipResponseValidateCityStateZipResult_QNAME = new QName("http://www.serviceobjects.com", "ValidateCityStateZipResult");
    private final static QName _GetBestMatchesSingleLineGETJSONQStringResponseGetBestMatchesSingleLineGETJSONQStringResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLine_GETJSONQStringResult");
    private final static QName _SuiteLinkResponseError_QNAME = new QName("http://www.serviceobjects.com", "Error");
    private final static QName _FindAddressLinesGETXMLPathResponseFindAddressLinesGETXMLPathResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLines_GETXMLPathResult");
    private final static QName _ParseAddressPUTResponseParseAddressResponse_QNAME = new QName("http://www.serviceobjects.com", "ParseAddressResponse");
    private final static QName _ValidateAddressWithSLKResponseValidateAddressWithSLKResult_QNAME = new QName("http://www.serviceobjects.com", "ValidateAddressWithSLKResult");
    private final static QName _FindAddressLinesGETXMLPathAddress4_QNAME = new QName("http://www.serviceobjects.com", "Address4");
    private final static QName _FindAddressLinesGETXMLPathAddress5_QNAME = new QName("http://www.serviceobjects.com", "Address5");
    private final static QName _FindAddressLinesGETXMLPathAddress6_QNAME = new QName("http://www.serviceobjects.com", "Address6");
    private final static QName _FindAddressLinesGETXMLPathAddress3_QNAME = new QName("http://www.serviceobjects.com", "Address3");
    private final static QName _FindAddressLinesGETXMLPathAddress1_QNAME = new QName("http://www.serviceobjects.com", "Address1");
    private final static QName _GetBestMatchesGETXMLQStringResponseGetBestMatchesGETXMLQStringResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatches_GETXMLQStringResult");
    private final static QName _PossibleMatchesResponsePossibleMatches_QNAME = new QName("http://www.serviceobjects.com", "PossibleMatches");
    private final static QName _AddressIsResidential_QNAME = new QName("http://www.serviceobjects.com", "IsResidential");
    private final static QName _ValidateAddressWithRDIResponseValidateAddressWithRDIResult_QNAME = new QName("http://www.serviceobjects.com", "ValidateAddressWithRDIResult");
    private final static QName _CityStateZipInfoGeneralDeliveryService_QNAME = new QName("http://www.serviceobjects.com", "GeneralDeliveryService");
    private final static QName _CityStateZipInfoIsUniqueZipCode_QNAME = new QName("http://www.serviceobjects.com", "IsUniqueZipCode");
    private final static QName _CityStateZipInfoRRHCService_QNAME = new QName("http://www.serviceobjects.com", "RRHCService");
    private final static QName _CityStateZipInfoPOBoxRangeLow_QNAME = new QName("http://www.serviceobjects.com", "POBoxRangeLow");
    private final static QName _CityStateZipInfoStreetService_QNAME = new QName("http://www.serviceobjects.com", "StreetService");
    private final static QName _CityStateZipInfoPOBoxRangeHigh_QNAME = new QName("http://www.serviceobjects.com", "POBoxRangeHigh");
    private final static QName _CityStateZipInfoPOBoxService_QNAME = new QName("http://www.serviceobjects.com", "POBoxService");
    private final static QName _CityStateZipInfoUrbanizationService_QNAME = new QName("http://www.serviceobjects.com", "UrbanizationService");
    private final static QName _GetBestMatchesGETXMLPathResponseGetBestMatchesGETXMLPathResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatches_GETXMLPathResult");
    private final static QName _BestMatchesResponseAddresses_QNAME = new QName("http://www.serviceobjects.com", "Addresses");
    private final static QName _CityStateZipResponseCityStateZip_QNAME = new QName("http://www.serviceobjects.com", "CityStateZip");
    private final static QName _GetBestMatchesGETJSONQStringResponseGetBestMatchesGETJSONQStringResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatches_GETJSONQStringResult");
    private final static QName _GetPossibleMatchesResponseGetPossibleMatchesResult_QNAME = new QName("http://www.serviceobjects.com", "GetPossibleMatchesResult");
    private final static QName _GetBestMatchesSingleLineGETXMLPathResponseGetBestMatchesSingleLineGETXMLPathResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLine_GETXMLPathResult");
    private final static QName _ParseAddressResponseParseAddressResult_QNAME = new QName("http://www.serviceobjects.com", "ParseAddressResult");
    private final static QName _FindAddressLinesGetJSONQStringResponseFindAddressLinesGetJSONQStringResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLines_GetJSONQStringResult");
    private final static QName _GetPossibleMatchesSingleLineResponseGetPossibleMatchesSingleLineResult_QNAME = new QName("http://www.serviceobjects.com", "GetPossibleMatchesSingleLineResult");
    private final static QName _AddressLinesResponseBestAddress2_QNAME = new QName("http://www.serviceobjects.com", "BestAddress2");
    private final static QName _AddressLinesResponseBestAddress1_QNAME = new QName("http://www.serviceobjects.com", "BestAddress1");
    private final static QName _FindAddressLinesGETXMLQStringResponseFindAddressLinesGETXMLQStringResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLines_GETXMLQStringResult");
    private final static QName _FindAddressLinesPOSTJSONResponseFindAddressLinesPOSTJSONResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLines_POSTJSONResult");
    private final static QName _RDIAddressIsResidence_QNAME = new QName("http://www.serviceobjects.com", "IsResidence");
    private final static QName _GetBestMatchesSingleLineGETJSONPathResponseGetBestMatchesSingleLineGETJSONPathResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLine_GETJSONPathResult");
    private final static QName _ValidateAddressSingleLineResponseValidateAddressSingleLineResult_QNAME = new QName("http://www.serviceobjects.com", "ValidateAddressSingleLineResult");
    private final static QName _FindAddressLinesGETJSONPathResponseFindAddressLinesGETJSONPathResult_QNAME = new QName("http://www.serviceobjects.com", "FindAddressLines_GETJSONPathResult");
    private final static QName _ValidateAddressWithDPVResponseValidateAddressWithDPVResult_QNAME = new QName("http://www.serviceobjects.com", "ValidateAddressWithDPVResult");
    private final static QName _GetBestMatchesSingleLineResponseGetBestMatchesSingleLineResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLineResult");
    private final static QName _GetBestMatchesSingleLinePOSTJSONResponseGetBestMatchesSingleLinePOSTJSONResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLine_POSTJSONResult");
    private final static QName _GetBestMatchesSingleLineGETXMLQStringResponseGetBestMatchesSingleLineGETXMLQStringResult_QNAME = new QName("http://www.serviceobjects.com", "GetBestMatchesSingleLine_GETXMLQStringResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.serviceobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link ArrayOfAddressCandidate }
     * 
     */
    public ArrayOfAddressCandidate createArrayOfAddressCandidate() {
        return new ArrayOfAddressCandidate();
    }

    /**
     * Create an instance of {@link FindAddressLinesResponse }
     * 
     */
    public FindAddressLinesResponse createFindAddressLinesResponse() {
        return new FindAddressLinesResponse();
    }

    /**
     * Create an instance of {@link AddressLinesResponse }
     * 
     */
    public AddressLinesResponse createAddressLinesResponse() {
        return new AddressLinesResponse();
    }

    /**
     * Create an instance of {@link ParseAddressDELETEResponse }
     * 
     */
    public ParseAddressDELETEResponse createParseAddressDELETEResponse() {
        return new ParseAddressDELETEResponse();
    }

    /**
     * Create an instance of {@link ParsedAddressResponse }
     * 
     */
    public ParsedAddressResponse createParsedAddressResponse() {
        return new ParsedAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIPOSTResponse }
     * 
     */
    public ValidateAddressWithRDIPOSTResponse createValidateAddressWithRDIPOSTResponse() {
        return new ValidateAddressWithRDIPOSTResponse();
    }

    /**
     * Create an instance of {@link RDIAddressResponse }
     * 
     */
    public RDIAddressResponse createRDIAddressResponse() {
        return new RDIAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineDELETE }
     * 
     */
    public ValidateAddressSingleLineDELETE createValidateAddressSingleLineDELETE() {
        return new ValidateAddressSingleLineDELETE();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIQUERYGETXML }
     * 
     */
    public ValidateAddressWithRDIQUERYGETXML createValidateAddressWithRDIQUERYGETXML() {
        return new ValidateAddressWithRDIQUERYGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineResponse }
     * 
     */
    public ValidateAddressSingleLineResponse createValidateAddressSingleLineResponse() {
        return new ValidateAddressSingleLineResponse();
    }

    /**
     * Create an instance of {@link DPVAddressResponse }
     * 
     */
    public DPVAddressResponse createDPVAddressResponse() {
        return new DPVAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineQUERYGETXMLResponse }
     * 
     */
    public ValidateAddressSingleLineQUERYGETXMLResponse createValidateAddressSingleLineQUERYGETXMLResponse() {
        return new ValidateAddressSingleLineQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKPUTResponse }
     * 
     */
    public ValidateAddressWithSLKPUTResponse createValidateAddressWithSLKPUTResponse() {
        return new ValidateAddressWithSLKPUTResponse();
    }

    /**
     * Create an instance of {@link SuiteLinkResponse }
     * 
     */
    public SuiteLinkResponse createSuiteLinkResponse() {
        return new SuiteLinkResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETXMLQStringResponse }
     * 
     */
    public GetBestMatchesGETXMLQStringResponse createGetBestMatchesGETXMLQStringResponse() {
        return new GetBestMatchesGETXMLQStringResponse();
    }

    /**
     * Create an instance of {@link BestMatchesResponse }
     * 
     */
    public BestMatchesResponse createBestMatchesResponse() {
        return new BestMatchesResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKGETJSON }
     * 
     */
    public ValidateAddressWithSLKGETJSON createValidateAddressWithSLKGETJSON() {
        return new ValidateAddressWithSLKGETJSON();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineDELETEResponse }
     * 
     */
    public ValidateAddressSingleLineDELETEResponse createValidateAddressSingleLineDELETEResponse() {
        return new ValidateAddressSingleLineDELETEResponse();
    }

    /**
     * Create an instance of {@link FindAddressLinesGetJSONQString }
     * 
     */
    public FindAddressLinesGetJSONQString createFindAddressLinesGetJSONQString() {
        return new FindAddressLinesGetJSONQString();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipResponse }
     * 
     */
    public ValidateCityStateZipResponse createValidateCityStateZipResponse() {
        return new ValidateCityStateZipResponse();
    }

    /**
     * Create an instance of {@link CityStateZipResponse }
     * 
     */
    public CityStateZipResponse createCityStateZipResponse() {
        return new CityStateZipResponse();
    }

    /**
     * Create an instance of {@link PossibleMatchesResponse }
     * 
     */
    public PossibleMatchesResponse createPossibleMatchesResponse() {
        return new PossibleMatchesResponse();
    }

    /**
     * Create an instance of {@link ParseAddressResponse }
     * 
     */
    public ParseAddressResponse createParseAddressResponse() {
        return new ParseAddressResponse();
    }

    /**
     * Create an instance of {@link ParseAddressPUTResponse }
     * 
     */
    public ParseAddressPUTResponse createParseAddressPUTResponse() {
        return new ParseAddressPUTResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineDELETEResponse }
     * 
     */
    public GetPossibleMatchesSingleLineDELETEResponse createGetPossibleMatchesSingleLineDELETEResponse() {
        return new GetPossibleMatchesSingleLineDELETEResponse();
    }

    /**
     * Create an instance of {@link ParseAddressGETJSONResponse }
     * 
     */
    public ParseAddressGETJSONResponse createParseAddressGETJSONResponse() {
        return new ParseAddressGETJSONResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKGETJSONResponse }
     * 
     */
    public ValidateAddressWithSLKGETJSONResponse createValidateAddressWithSLKGETJSONResponse() {
        return new ValidateAddressWithSLKGETJSONResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineDELETE }
     * 
     */
    public GetPossibleMatchesSingleLineDELETE createGetPossibleMatchesSingleLineDELETE() {
        return new GetPossibleMatchesSingleLineDELETE();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVPOST }
     * 
     */
    public ValidateAddressWithDPVPOST createValidateAddressWithDPVPOST() {
        return new ValidateAddressWithDPVPOST();
    }

    /**
     * Create an instance of {@link AV3Error }
     * 
     */
    public AV3Error createAV3Error() {
        return new AV3Error();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLinePUTResponse }
     * 
     */
    public ValidateAddressSingleLinePUTResponse createValidateAddressSingleLinePUTResponse() {
        return new ValidateAddressSingleLinePUTResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETJSONQStringResponse }
     * 
     */
    public GetBestMatchesSingleLineGETJSONQStringResponse createGetBestMatchesSingleLineGETJSONQStringResponse() {
        return new GetBestMatchesSingleLineGETJSONQStringResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLinePOSTResponse }
     * 
     */
    public ValidateAddressSingleLinePOSTResponse createValidateAddressSingleLinePOSTResponse() {
        return new ValidateAddressSingleLinePOSTResponse();
    }

    /**
     * Create an instance of {@link AddressFragments }
     * 
     */
    public AddressFragments createAddressFragments() {
        return new AddressFragments();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesGETXML }
     * 
     */
    public GetPossibleMatchesGETXML createGetPossibleMatchesGETXML() {
        return new GetPossibleMatchesGETXML();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETJSONPath }
     * 
     */
    public GetBestMatchesSingleLineGETJSONPath createGetBestMatchesSingleLineGETJSONPath() {
        return new GetBestMatchesSingleLineGETJSONPath();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKDELETEResponse }
     * 
     */
    public ValidateAddressWithSLKDELETEResponse createValidateAddressWithSLKDELETEResponse() {
        return new ValidateAddressWithSLKDELETEResponse();
    }

    /**
     * Create an instance of {@link FindAddressLines }
     * 
     */
    public FindAddressLines createFindAddressLines() {
        return new FindAddressLines();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVPUT }
     * 
     */
    public ValidateAddressWithDPVPUT createValidateAddressWithDPVPUT() {
        return new ValidateAddressWithDPVPUT();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesQUERYGETXMLResponse }
     * 
     */
    public GetPossibleMatchesQUERYGETXMLResponse createGetPossibleMatchesQUERYGETXMLResponse() {
        return new GetPossibleMatchesQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipGETXML }
     * 
     */
    public ValidateCityStateZipGETXML createValidateCityStateZipGETXML() {
        return new ValidateCityStateZipGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineGETJSONResponse }
     * 
     */
    public ValidateAddressSingleLineGETJSONResponse createValidateAddressSingleLineGETJSONResponse() {
        return new ValidateAddressSingleLineGETJSONResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLinePOSTJSON }
     * 
     */
    public GetBestMatchesSingleLinePOSTJSON createGetBestMatchesSingleLinePOSTJSON() {
        return new GetBestMatchesSingleLinePOSTJSON();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipPUTResponse }
     * 
     */
    public ValidateCityStateZipPUTResponse createValidateCityStateZipPUTResponse() {
        return new ValidateCityStateZipPUTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIDELETE }
     * 
     */
    public ValidateAddressWithRDIDELETE createValidateAddressWithRDIDELETE() {
        return new ValidateAddressWithRDIDELETE();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVGETXML }
     * 
     */
    public ValidateAddressWithDPVGETXML createValidateAddressWithDPVGETXML() {
        return new ValidateAddressWithDPVGETXML();
    }

    /**
     * Create an instance of {@link GetPossibleMatches }
     * 
     */
    public GetPossibleMatches createGetPossibleMatches() {
        return new GetPossibleMatches();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVQUERYGETXMLResponse }
     * 
     */
    public ValidateAddressWithDPVQUERYGETXMLResponse createValidateAddressWithDPVQUERYGETXMLResponse() {
        return new ValidateAddressWithDPVQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVPOSTResponse }
     * 
     */
    public ValidateAddressWithDPVPOSTResponse createValidateAddressWithDPVPOSTResponse() {
        return new ValidateAddressWithDPVPOSTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIPOST }
     * 
     */
    public ValidateAddressWithRDIPOST createValidateAddressWithRDIPOST() {
        return new ValidateAddressWithRDIPOST();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETJSONQStringResponse }
     * 
     */
    public GetBestMatchesGETJSONQStringResponse createGetBestMatchesGETJSONQStringResponse() {
        return new GetBestMatchesGETJSONQStringResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKPUT }
     * 
     */
    public ValidateAddressWithSLKPUT createValidateAddressWithSLKPUT() {
        return new ValidateAddressWithSLKPUT();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETJSONPathResponse }
     * 
     */
    public GetBestMatchesGETJSONPathResponse createGetBestMatchesGETJSONPathResponse() {
        return new GetBestMatchesGETJSONPathResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVGETXMLResponse }
     * 
     */
    public ValidateAddressWithDPVGETXMLResponse createValidateAddressWithDPVGETXMLResponse() {
        return new ValidateAddressWithDPVGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineQUERYGETXMLResponse }
     * 
     */
    public GetPossibleMatchesSingleLineQUERYGETXMLResponse createGetPossibleMatchesSingleLineQUERYGETXMLResponse() {
        return new GetPossibleMatchesSingleLineQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVResponse }
     * 
     */
    public ValidateAddressWithDPVResponse createValidateAddressWithDPVResponse() {
        return new ValidateAddressWithDPVResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLK }
     * 
     */
    public ValidateAddressWithSLK createValidateAddressWithSLK() {
        return new ValidateAddressWithSLK();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKGETXML }
     * 
     */
    public ValidateAddressWithSLKGETXML createValidateAddressWithSLKGETXML() {
        return new ValidateAddressWithSLKGETXML();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETXMLQString }
     * 
     */
    public FindAddressLinesGETXMLQString createFindAddressLinesGETXMLQString() {
        return new FindAddressLinesGETXMLQString();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETJSONPath }
     * 
     */
    public FindAddressLinesGETJSONPath createFindAddressLinesGETJSONPath() {
        return new FindAddressLinesGETJSONPath();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipDELETE }
     * 
     */
    public ValidateCityStateZipDELETE createValidateCityStateZipDELETE() {
        return new ValidateCityStateZipDELETE();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLinePOST }
     * 
     */
    public GetPossibleMatchesSingleLinePOST createGetPossibleMatchesSingleLinePOST() {
        return new GetPossibleMatchesSingleLinePOST();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLinePOST }
     * 
     */
    public ValidateAddressSingleLinePOST createValidateAddressSingleLinePOST() {
        return new ValidateAddressSingleLinePOST();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETXMLQStringResponse }
     * 
     */
    public GetBestMatchesSingleLineGETXMLQStringResponse createGetBestMatchesSingleLineGETXMLQStringResponse() {
        return new GetBestMatchesSingleLineGETXMLQStringResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKQUERYGETXMLResponse }
     * 
     */
    public ValidateAddressWithSLKQUERYGETXMLResponse createValidateAddressWithSLKQUERYGETXMLResponse() {
        return new ValidateAddressWithSLKQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETXMLPathResponse }
     * 
     */
    public GetBestMatchesSingleLineGETXMLPathResponse createGetBestMatchesSingleLineGETXMLPathResponse() {
        return new GetBestMatchesSingleLineGETXMLPathResponse();
    }

    /**
     * Create an instance of {@link SuiteLinkAddress }
     * 
     */
    public SuiteLinkAddress createSuiteLinkAddress() {
        return new SuiteLinkAddress();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVQUERYGETXML }
     * 
     */
    public ValidateAddressWithDPVQUERYGETXML createValidateAddressWithDPVQUERYGETXML() {
        return new ValidateAddressWithDPVQUERYGETXML();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipDELETEResponse }
     * 
     */
    public ValidateCityStateZipDELETEResponse createValidateCityStateZipDELETEResponse() {
        return new ValidateCityStateZipDELETEResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesPOSTJSON }
     * 
     */
    public GetBestMatchesPOSTJSON createGetBestMatchesPOSTJSON() {
        return new GetBestMatchesPOSTJSON();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKResponse }
     * 
     */
    public ValidateAddressWithSLKResponse createValidateAddressWithSLKResponse() {
        return new ValidateAddressWithSLKResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETJSONPathResponse }
     * 
     */
    public GetBestMatchesSingleLineGETJSONPathResponse createGetBestMatchesSingleLineGETJSONPathResponse() {
        return new GetBestMatchesSingleLineGETJSONPathResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLine }
     * 
     */
    public GetPossibleMatchesSingleLine createGetPossibleMatchesSingleLine() {
        return new GetPossibleMatchesSingleLine();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesGETJSONResponse }
     * 
     */
    public GetPossibleMatchesGETJSONResponse createGetPossibleMatchesGETJSONResponse() {
        return new GetPossibleMatchesGETJSONResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineGETXML }
     * 
     */
    public ValidateAddressSingleLineGETXML createValidateAddressSingleLineGETXML() {
        return new ValidateAddressSingleLineGETXML();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETXMLPathResponse }
     * 
     */
    public FindAddressLinesGETXMLPathResponse createFindAddressLinesGETXMLPathResponse() {
        return new FindAddressLinesGETXMLPathResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVDELETE }
     * 
     */
    public ValidateAddressWithDPVDELETE createValidateAddressWithDPVDELETE() {
        return new ValidateAddressWithDPVDELETE();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineGETXMLResponse }
     * 
     */
    public GetPossibleMatchesSingleLineGETXMLResponse createGetPossibleMatchesSingleLineGETXMLResponse() {
        return new GetPossibleMatchesSingleLineGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLinePOSTJSONResponse }
     * 
     */
    public GetBestMatchesSingleLinePOSTJSONResponse createGetBestMatchesSingleLinePOSTJSONResponse() {
        return new GetBestMatchesSingleLinePOSTJSONResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesPOSTResponse }
     * 
     */
    public GetPossibleMatchesPOSTResponse createGetPossibleMatchesPOSTResponse() {
        return new GetPossibleMatchesPOSTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIResponse }
     * 
     */
    public ValidateAddressWithRDIResponse createValidateAddressWithRDIResponse() {
        return new ValidateAddressWithRDIResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLinePUT }
     * 
     */
    public ValidateAddressSingleLinePUT createValidateAddressSingleLinePUT() {
        return new ValidateAddressSingleLinePUT();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesPUT }
     * 
     */
    public GetPossibleMatchesPUT createGetPossibleMatchesPUT() {
        return new GetPossibleMatchesPUT();
    }

    /**
     * Create an instance of {@link GetBestMatchesPOSTJSONResponse }
     * 
     */
    public GetBestMatchesPOSTJSONResponse createGetBestMatchesPOSTJSONResponse() {
        return new GetBestMatchesPOSTJSONResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVDELETEResponse }
     * 
     */
    public ValidateAddressWithDPVDELETEResponse createValidateAddressWithDPVDELETEResponse() {
        return new ValidateAddressWithDPVDELETEResponse();
    }

    /**
     * Create an instance of {@link ParseAddress }
     * 
     */
    public ParseAddress createParseAddress() {
        return new ParseAddress();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipGETXMLResponse }
     * 
     */
    public ValidateCityStateZipGETXMLResponse createValidateCityStateZipGETXMLResponse() {
        return new ValidateCityStateZipGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIGETXMLResponse }
     * 
     */
    public ValidateAddressWithRDIGETXMLResponse createValidateAddressWithRDIGETXMLResponse() {
        return new ValidateAddressWithRDIGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesPOST }
     * 
     */
    public GetPossibleMatchesPOST createGetPossibleMatchesPOST() {
        return new GetPossibleMatchesPOST();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPV }
     * 
     */
    public ValidateAddressWithDPV createValidateAddressWithDPV() {
        return new ValidateAddressWithDPV();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesQUERYGETXML }
     * 
     */
    public GetPossibleMatchesQUERYGETXML createGetPossibleMatchesQUERYGETXML() {
        return new GetPossibleMatchesQUERYGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIQUERYGETXMLResponse }
     * 
     */
    public ValidateAddressWithRDIQUERYGETXMLResponse createValidateAddressWithRDIQUERYGETXMLResponse() {
        return new ValidateAddressWithRDIQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETJSONQString }
     * 
     */
    public GetBestMatchesSingleLineGETJSONQString createGetBestMatchesSingleLineGETJSONQString() {
        return new GetBestMatchesSingleLineGETJSONQString();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETXMLQString }
     * 
     */
    public GetBestMatchesGETXMLQString createGetBestMatchesGETXMLQString() {
        return new GetBestMatchesGETXMLQString();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipQUERYGETXML }
     * 
     */
    public ValidateCityStateZipQUERYGETXML createValidateCityStateZipQUERYGETXML() {
        return new ValidateCityStateZipQUERYGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineGETXMLResponse }
     * 
     */
    public ValidateAddressSingleLineGETXMLResponse createValidateAddressSingleLineGETXMLResponse() {
        return new ValidateAddressSingleLineGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLinePOSTResponse }
     * 
     */
    public GetPossibleMatchesSingleLinePOSTResponse createGetPossibleMatchesSingleLinePOSTResponse() {
        return new GetPossibleMatchesSingleLinePOSTResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLine }
     * 
     */
    public GetBestMatchesSingleLine createGetBestMatchesSingleLine() {
        return new GetBestMatchesSingleLine();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKDELETE }
     * 
     */
    public ValidateAddressWithSLKDELETE createValidateAddressWithSLKDELETE() {
        return new ValidateAddressWithSLKDELETE();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETJSONPathResponse }
     * 
     */
    public FindAddressLinesGETJSONPathResponse createFindAddressLinesGETJSONPathResponse() {
        return new FindAddressLinesGETJSONPathResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineGETJSONResponse }
     * 
     */
    public GetPossibleMatchesSingleLineGETJSONResponse createGetPossibleMatchesSingleLineGETJSONResponse() {
        return new GetPossibleMatchesSingleLineGETJSONResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineQUERYGETXML }
     * 
     */
    public GetPossibleMatchesSingleLineQUERYGETXML createGetPossibleMatchesSingleLineQUERYGETXML() {
        return new GetPossibleMatchesSingleLineQUERYGETXML();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesResponse }
     * 
     */
    public GetPossibleMatchesResponse createGetPossibleMatchesResponse() {
        return new GetPossibleMatchesResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETJSONQString }
     * 
     */
    public GetBestMatchesGETJSONQString createGetBestMatchesGETJSONQString() {
        return new GetBestMatchesGETJSONQString();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIDELETEResponse }
     * 
     */
    public ValidateAddressWithRDIDELETEResponse createValidateAddressWithRDIDELETEResponse() {
        return new ValidateAddressWithRDIDELETEResponse();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipPOSTResponse }
     * 
     */
    public ValidateCityStateZipPOSTResponse createValidateCityStateZipPOSTResponse() {
        return new ValidateCityStateZipPOSTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVGETJSONResponse }
     * 
     */
    public ValidateAddressWithDPVGETJSONResponse createValidateAddressWithDPVGETJSONResponse() {
        return new ValidateAddressWithDPVGETJSONResponse();
    }

    /**
     * Create an instance of {@link AddressCandidate }
     * 
     */
    public AddressCandidate createAddressCandidate() {
        return new AddressCandidate();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIGETJSON }
     * 
     */
    public ValidateAddressWithRDIGETJSON createValidateAddressWithRDIGETJSON() {
        return new ValidateAddressWithRDIGETJSON();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesGETJSON }
     * 
     */
    public GetPossibleMatchesGETJSON createGetPossibleMatchesGETJSON() {
        return new GetPossibleMatchesGETJSON();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesGETXMLResponse }
     * 
     */
    public GetPossibleMatchesGETXMLResponse createGetPossibleMatchesGETXMLResponse() {
        return new GetPossibleMatchesGETXMLResponse();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETXMLQStringResponse }
     * 
     */
    public FindAddressLinesGETXMLQStringResponse createFindAddressLinesGETXMLQStringResponse() {
        return new FindAddressLinesGETXMLQStringResponse();
    }

    /**
     * Create an instance of {@link ValidateCityStateZip }
     * 
     */
    public ValidateCityStateZip createValidateCityStateZip() {
        return new ValidateCityStateZip();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIPUT }
     * 
     */
    public ValidateAddressWithRDIPUT createValidateAddressWithRDIPUT() {
        return new ValidateAddressWithRDIPUT();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETXMLPath }
     * 
     */
    public GetBestMatchesSingleLineGETXMLPath createGetBestMatchesSingleLineGETXMLPath() {
        return new GetBestMatchesSingleLineGETXMLPath();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineResponse }
     * 
     */
    public GetBestMatchesSingleLineResponse createGetBestMatchesSingleLineResponse() {
        return new GetBestMatchesSingleLineResponse();
    }

    /**
     * Create an instance of {@link GetBestMatches }
     * 
     */
    public GetBestMatches createGetBestMatches() {
        return new GetBestMatches();
    }

    /**
     * Create an instance of {@link ParseAddressDELETE }
     * 
     */
    public ParseAddressDELETE createParseAddressDELETE() {
        return new ParseAddressDELETE();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKPOST }
     * 
     */
    public ValidateAddressWithSLKPOST createValidateAddressWithSLKPOST() {
        return new ValidateAddressWithSLKPOST();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipPUT }
     * 
     */
    public ValidateCityStateZipPUT createValidateCityStateZipPUT() {
        return new ValidateCityStateZipPUT();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineGETJSON }
     * 
     */
    public GetPossibleMatchesSingleLineGETJSON createGetPossibleMatchesSingleLineGETJSON() {
        return new GetPossibleMatchesSingleLineGETJSON();
    }

    /**
     * Create an instance of {@link ParseAddressPUT }
     * 
     */
    public ParseAddressPUT createParseAddressPUT() {
        return new ParseAddressPUT();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineGETXML }
     * 
     */
    public GetPossibleMatchesSingleLineGETXML createGetPossibleMatchesSingleLineGETXML() {
        return new GetPossibleMatchesSingleLineGETXML();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipPOST }
     * 
     */
    public ValidateCityStateZipPOST createValidateCityStateZipPOST() {
        return new ValidateCityStateZipPOST();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVGETJSON }
     * 
     */
    public ValidateAddressWithDPVGETJSON createValidateAddressWithDPVGETJSON() {
        return new ValidateAddressWithDPVGETJSON();
    }

    /**
     * Create an instance of {@link FindAddressLinesGetJSONQStringResponse }
     * 
     */
    public FindAddressLinesGetJSONQStringResponse createFindAddressLinesGetJSONQStringResponse() {
        return new FindAddressLinesGetJSONQStringResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKPOSTResponse }
     * 
     */
    public ValidateAddressWithSLKPOSTResponse createValidateAddressWithSLKPOSTResponse() {
        return new ValidateAddressWithSLKPOSTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineQUERYGETXML }
     * 
     */
    public ValidateAddressSingleLineQUERYGETXML createValidateAddressSingleLineQUERYGETXML() {
        return new ValidateAddressSingleLineQUERYGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKQUERYGETXML }
     * 
     */
    public ValidateAddressWithSLKQUERYGETXML createValidateAddressWithSLKQUERYGETXML() {
        return new ValidateAddressWithSLKQUERYGETXML();
    }

    /**
     * Create an instance of {@link ParseAddressGETXML }
     * 
     */
    public ParseAddressGETXML createParseAddressGETXML() {
        return new ParseAddressGETXML();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIPUTResponse }
     * 
     */
    public ValidateAddressWithRDIPUTResponse createValidateAddressWithRDIPUTResponse() {
        return new ValidateAddressWithRDIPUTResponse();
    }

    /**
     * Create an instance of {@link DPVAddress }
     * 
     */
    public DPVAddress createDPVAddress() {
        return new DPVAddress();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLineGETJSON }
     * 
     */
    public ValidateAddressSingleLineGETJSON createValidateAddressSingleLineGETJSON() {
        return new ValidateAddressSingleLineGETJSON();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETXMLPath }
     * 
     */
    public GetBestMatchesGETXMLPath createGetBestMatchesGETXMLPath() {
        return new GetBestMatchesGETXMLPath();
    }

    /**
     * Create an instance of {@link ParseAddressGETJSON }
     * 
     */
    public ParseAddressGETJSON createParseAddressGETJSON() {
        return new ParseAddressGETJSON();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLinePUT }
     * 
     */
    public GetPossibleMatchesSingleLinePUT createGetPossibleMatchesSingleLinePUT() {
        return new GetPossibleMatchesSingleLinePUT();
    }

    /**
     * Create an instance of {@link ParseAddressQUERYGETXML }
     * 
     */
    public ParseAddressQUERYGETXML createParseAddressQUERYGETXML() {
        return new ParseAddressQUERYGETXML();
    }

    /**
     * Create an instance of {@link ParseAddressQUERYGETXMLResponse }
     * 
     */
    public ParseAddressQUERYGETXMLResponse createParseAddressQUERYGETXMLResponse() {
        return new ParseAddressQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesPUTResponse }
     * 
     */
    public GetPossibleMatchesPUTResponse createGetPossibleMatchesPUTResponse() {
        return new GetPossibleMatchesPUTResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIGETXML }
     * 
     */
    public ValidateAddressWithRDIGETXML createValidateAddressWithRDIGETXML() {
        return new ValidateAddressWithRDIGETXML();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLinePUTResponse }
     * 
     */
    public GetPossibleMatchesSingleLinePUTResponse createGetPossibleMatchesSingleLinePUTResponse() {
        return new GetPossibleMatchesSingleLinePUTResponse();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipQUERYGETXMLResponse }
     * 
     */
    public ValidateCityStateZipQUERYGETXMLResponse createValidateCityStateZipQUERYGETXMLResponse() {
        return new ValidateCityStateZipQUERYGETXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithSLKGETXMLResponse }
     * 
     */
    public ValidateAddressWithSLKGETXMLResponse createValidateAddressWithSLKGETXMLResponse() {
        return new ValidateAddressWithSLKGETXMLResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesDELETE }
     * 
     */
    public GetPossibleMatchesDELETE createGetPossibleMatchesDELETE() {
        return new GetPossibleMatchesDELETE();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDI }
     * 
     */
    public ValidateAddressWithRDI createValidateAddressWithRDI() {
        return new ValidateAddressWithRDI();
    }

    /**
     * Create an instance of {@link FindAddressLinesPOSTJSONResponse }
     * 
     */
    public FindAddressLinesPOSTJSONResponse createFindAddressLinesPOSTJSONResponse() {
        return new FindAddressLinesPOSTJSONResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETJSONPath }
     * 
     */
    public GetBestMatchesGETJSONPath createGetBestMatchesGETJSONPath() {
        return new GetBestMatchesGETJSONPath();
    }

    /**
     * Create an instance of {@link ValidateAddressSingleLine }
     * 
     */
    public ValidateAddressSingleLine createValidateAddressSingleLine() {
        return new ValidateAddressSingleLine();
    }

    /**
     * Create an instance of {@link GetBestMatchesResponse }
     * 
     */
    public GetBestMatchesResponse createGetBestMatchesResponse() {
        return new GetBestMatchesResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressWithDPVPUTResponse }
     * 
     */
    public ValidateAddressWithDPVPUTResponse createValidateAddressWithDPVPUTResponse() {
        return new ValidateAddressWithDPVPUTResponse();
    }

    /**
     * Create an instance of {@link GetBestMatchesGETXMLPathResponse }
     * 
     */
    public GetBestMatchesGETXMLPathResponse createGetBestMatchesGETXMLPathResponse() {
        return new GetBestMatchesGETXMLPathResponse();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipGETJSON }
     * 
     */
    public ValidateCityStateZipGETJSON createValidateCityStateZipGETJSON() {
        return new ValidateCityStateZipGETJSON();
    }

    /**
     * Create an instance of {@link CityStateZipInfo }
     * 
     */
    public CityStateZipInfo createCityStateZipInfo() {
        return new CityStateZipInfo();
    }

    /**
     * Create an instance of {@link ParseAddressGETXMLResponse }
     * 
     */
    public ParseAddressGETXMLResponse createParseAddressGETXMLResponse() {
        return new ParseAddressGETXMLResponse();
    }

    /**
     * Create an instance of {@link RDIAddress }
     * 
     */
    public RDIAddress createRDIAddress() {
        return new RDIAddress();
    }

    /**
     * Create an instance of {@link ValidateAddressWithRDIGETJSONResponse }
     * 
     */
    public ValidateAddressWithRDIGETJSONResponse createValidateAddressWithRDIGETJSONResponse() {
        return new ValidateAddressWithRDIGETJSONResponse();
    }

    /**
     * Create an instance of {@link FindAddressLinesPOSTJSON }
     * 
     */
    public FindAddressLinesPOSTJSON createFindAddressLinesPOSTJSON() {
        return new FindAddressLinesPOSTJSON();
    }

    /**
     * Create an instance of {@link GetBestMatchesSingleLineGETXMLQString }
     * 
     */
    public GetBestMatchesSingleLineGETXMLQString createGetBestMatchesSingleLineGETXMLQString() {
        return new GetBestMatchesSingleLineGETXMLQString();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesSingleLineResponse }
     * 
     */
    public GetPossibleMatchesSingleLineResponse createGetPossibleMatchesSingleLineResponse() {
        return new GetPossibleMatchesSingleLineResponse();
    }

    /**
     * Create an instance of {@link FindAddressLinesGETXMLPath }
     * 
     */
    public FindAddressLinesGETXMLPath createFindAddressLinesGETXMLPath() {
        return new FindAddressLinesGETXMLPath();
    }

    /**
     * Create an instance of {@link ValidateCityStateZipGETJSONResponse }
     * 
     */
    public ValidateCityStateZipGETJSONResponse createValidateCityStateZipGETJSONResponse() {
        return new ValidateCityStateZipGETJSONResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesDELETEResponse }
     * 
     */
    public GetPossibleMatchesDELETEResponse createGetPossibleMatchesDELETEResponse() {
        return new GetPossibleMatchesDELETEResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZip.class)
    public JAXBElement<String> createValidateCityStateZipZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZip.class)
    public JAXBElement<String> createValidateCityStateZipCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZip.class)
    public JAXBElement<String> createValidateCityStateZipLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZip.class)
    public JAXBElement<String> createValidateCityStateZipState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "AddressLinesResponse")
    public JAXBElement<AddressLinesResponse> createAddressLinesResponse(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_AddressLinesResponse_QNAME, AddressLinesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipInfo")
    public JAXBElement<CityStateZipInfo> createCityStateZipInfo(CityStateZipInfo value) {
        return new JAXBElement<CityStateZipInfo>(_CityStateZipInfo_QNAME, CityStateZipInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddress")
    public JAXBElement<RDIAddress> createRDIAddress(RDIAddress value) {
        return new JAXBElement<RDIAddress>(_RDIAddress_QNAME, RDIAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse")
    public JAXBElement<CityStateZipResponse> createCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFragments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "AddressFragments")
    public JAXBElement<AddressFragments> createAddressFragments(AddressFragments value) {
        return new JAXBElement<AddressFragments>(_AddressFragments_QNAME, AddressFragments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse")
    public JAXBElement<SuiteLinkResponse> createSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCandidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "AddressCandidate")
    public JAXBElement<AddressCandidate> createAddressCandidate(AddressCandidate value) {
        return new JAXBElement<AddressCandidate>(_AddressCandidate_QNAME, AddressCandidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkAddress")
    public JAXBElement<SuiteLinkAddress> createSuiteLinkAddress(SuiteLinkAddress value) {
        return new JAXBElement<SuiteLinkAddress>(_SuiteLinkAddress_QNAME, SuiteLinkAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse")
    public JAXBElement<DPVAddressResponse> createDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse")
    public JAXBElement<RDIAddressResponse> createRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse")
    public JAXBElement<PossibleMatchesResponse> createPossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "AV3Error")
    public JAXBElement<AV3Error> createAV3Error(AV3Error value) {
        return new JAXBElement<AV3Error>(_AV3Error_QNAME, AV3Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BestMatchesResponse")
    public JAXBElement<BestMatchesResponse> createBestMatchesResponse(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_BestMatchesResponse_QNAME, BestMatchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressCandidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ArrayOfAddressCandidate")
    public JAXBElement<ArrayOfAddressCandidate> createArrayOfAddressCandidate(ArrayOfAddressCandidate value) {
        return new JAXBElement<ArrayOfAddressCandidate>(_ArrayOfAddressCandidate_QNAME, ArrayOfAddressCandidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ArrayOfAddress")
    public JAXBElement<ArrayOfAddress> createArrayOfAddress(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_ArrayOfAddress_QNAME, ArrayOfAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParsedAddressResponse")
    public JAXBElement<ParsedAddressResponse> createParsedAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParsedAddressResponse_QNAME, ParsedAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddress")
    public JAXBElement<DPVAddress> createDPVAddress(DPVAddress value) {
        return new JAXBElement<DPVAddress>(_DPVAddress_QNAME, DPVAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipPOSTResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipPOSTResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipPOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIGETJSONResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIGETJSONResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLineGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLineGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLineGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLineGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesPOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesPOSTJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLinesResult", scope = FindAddressLinesResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesResponseFindAddressLinesResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesResponseFindAddressLinesResult_QNAME, AddressLinesResponse.class, FindAddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKPUT.class)
    public JAXBElement<String> createValidateAddressWithSLKPUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLine.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLine.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DescCode", scope = AV3Error.class)
    public JAXBElement<String> createAV3ErrorDescCode(String value) {
        return new JAXBElement<String>(_AV3ErrorDescCode_QNAME, String.class, AV3Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Desc", scope = AV3Error.class)
    public JAXBElement<String> createAV3ErrorDesc(String value) {
        return new JAXBElement<String>(_AV3ErrorDesc_QNAME, String.class, AV3Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "TypeCode", scope = AV3Error.class)
    public JAXBElement<String> createAV3ErrorTypeCode(String value) {
        return new JAXBElement<String>(_AV3ErrorTypeCode_QNAME, String.class, AV3Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Type", scope = AV3Error.class)
    public JAXBElement<String> createAV3ErrorType(String value) {
        return new JAXBElement<String>(_AV3ErrorType_QNAME, String.class, AV3Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKGETJSON.class)
    public JAXBElement<String> createValidateAddressWithSLKGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVPUTResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVPUTResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesResult", scope = GetBestMatchesResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesResponseGetBestMatchesResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesResponseGetBestMatchesResult_QNAME, BestMatchesResponse.class, GetBestMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatches_GETJSONPathResult", scope = GetBestMatchesGETJSONPathResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesGETJSONPathResponseGetBestMatchesGETJSONPathResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesGETJSONPathResponseGetBestMatchesGETJSONPathResult_QNAME, BestMatchesResponse.class, GetBestMatchesGETJSONPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLinePOST.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLinePOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLinePOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLinePOST.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLinePOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLinePOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKQUERYGETXMLResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKQUERYGETXMLResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLineQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressSingleLineQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLineQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLineQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressSingleLineQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLineQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyName", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCountyName(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyName_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotesDesc", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateDPVNotesDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotesDesc_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Corrections", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCorrections(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrections_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyCode", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCountyCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyCode_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CongressCode", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCongressCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCongressCode_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CarrierRoute", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCarrierRoute(String value) {
        return new JAXBElement<String>(_AddressCandidateCarrierRoute_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPV", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateDPV(String value) {
        return new JAXBElement<String>(_AddressCandidateDPV_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CorrectionsDesc", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateCorrectionsDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrectionsDesc_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVDesc", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateDPVDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVDesc_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotes", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateDPVNotes(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotes_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BarcodeDigits", scope = AddressCandidate.class)
    public JAXBElement<String> createAddressCandidateBarcodeDigits(String value) {
        return new JAXBElement<String>(_AddressCandidateBarcodeDigits_QNAME, String.class, AddressCandidate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatches_POSTJSONResult", scope = GetBestMatchesPOSTJSONResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesPOSTJSONResponseGetBestMatchesPOSTJSONResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesPOSTJSONResponseGetBestMatchesPOSTJSONResult_QNAME, BestMatchesResponse.class, GetBestMatchesPOSTJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLine.class)
    public JAXBElement<String> createGetBestMatchesSingleLineBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLine.class)
    public JAXBElement<String> createGetBestMatchesSingleLineLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLine.class)
    public JAXBElement<String> createGetBestMatchesSingleLineAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETEBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETEPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETEAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKDELETE.class)
    public JAXBElement<String> createValidateAddressWithSLKDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ValidateCityStateZipResult", scope = ValidateCityStateZipResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipResponseValidateCityStateZipResult(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_ValidateCityStateZipResponseValidateCityStateZipResult_QNAME, CityStateZipResponse.class, ValidateCityStateZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLineGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLQStringBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLineGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLineGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLineGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLineGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLQStringAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLineGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipGETXML.class)
    public JAXBElement<String> createValidateCityStateZipGETXMLZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipGETXML.class)
    public JAXBElement<String> createValidateCityStateZipGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipGETXML.class)
    public JAXBElement<String> createValidateCityStateZipGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipGETXML.class)
    public JAXBElement<String> createValidateCityStateZipGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLine_GETJSONQStringResult", scope = GetBestMatchesSingleLineGETJSONQStringResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLineGETJSONQStringResponseGetBestMatchesSingleLineGETJSONQStringResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLineGETJSONQStringResponseGetBestMatchesSingleLineGETJSONQStringResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLineGETJSONQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLinePUTResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLinePUTResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLinePUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkAddress", scope = SuiteLinkResponse.class)
    public JAXBElement<SuiteLinkAddress> createSuiteLinkResponseSuiteLinkAddress(SuiteLinkAddress value) {
        return new JAXBElement<SuiteLinkAddress>(_SuiteLinkAddress_QNAME, SuiteLinkAddress.class, SuiteLinkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = SuiteLinkResponse.class)
    public JAXBElement<AV3Error> createSuiteLinkResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, SuiteLinkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLines_GETXMLPathResult", scope = FindAddressLinesGETXMLPathResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesGETXMLPathResponseFindAddressLinesGETXMLPathResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesGETXMLPathResponseFindAddressLinesGETXMLPathResult_QNAME, AddressLinesResponse.class, FindAddressLinesGETXMLPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResponse", scope = ParseAddressPUTResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressPUTResponseParseAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressPUTResponseParseAddressResponse_QNAME, ParsedAddressResponse.class, ParseAddressPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ValidateAddressWithSLKResult", scope = ValidateAddressWithSLKResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKResponseValidateAddressWithSLKResult(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_ValidateAddressWithSLKResponseValidateAddressWithSLKResult_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVPOST.class)
    public JAXBElement<String> createValidateAddressWithDPVPOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLineDELETEResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLineDELETEResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLineDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIQUERYGETXMLResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIQUERYGETXMLResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLinesGETXMLPath.class)
    public JAXBElement<String> createFindAddressLinesGETXMLPathAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLinesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETEPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETEAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIDELETE.class)
    public JAXBElement<String> createValidateAddressWithRDIDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipPUTResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipPUTResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesPOST.class)
    public JAXBElement<String> createGetPossibleMatchesPOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIPUTResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIPUTResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIDELETEResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIDELETEResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLineGETJSON.class)
    public JAXBElement<String> createValidateAddressSingleLineGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLineGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLineGETJSON.class)
    public JAXBElement<String> createValidateAddressSingleLineGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLineGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatches.class)
    public JAXBElement<String> createGetPossibleMatchesAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatches_GETXMLQStringResult", scope = GetBestMatchesGETXMLQStringResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesGETXMLQStringResponseGetBestMatchesGETXMLQStringResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesGETXMLQStringResponseGetBestMatchesGETXMLQStringResult_QNAME, BestMatchesResponse.class, GetBestMatchesGETXMLQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKGETXMLResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKGETXMLResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = AddressFragments.class)
    public JAXBElement<String> createAddressFragmentsFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, AddressFragments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVQUERYGETXMLResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVQUERYGETXMLResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVGETJSONResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVGETJSONResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLineDELETE.class)
    public JAXBElement<String> createValidateAddressSingleLineDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLineDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLineDELETE.class)
    public JAXBElement<String> createValidateAddressSingleLineDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLineDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETEPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETEAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddressDELETE.class)
    public JAXBElement<String> createParseAddressDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddressDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLineGETXMLResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLineGETXMLResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLineGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddressGETJSON.class)
    public JAXBElement<String> createParseAddressGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddressGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = PossibleMatchesResponse.class)
    public JAXBElement<AV3Error> createPossibleMatchesResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, PossibleMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddressCandidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatches", scope = PossibleMatchesResponse.class)
    public JAXBElement<ArrayOfAddressCandidate> createPossibleMatchesResponsePossibleMatches(ArrayOfAddressCandidate value) {
        return new JAXBElement<ArrayOfAddressCandidate>(_PossibleMatchesResponsePossibleMatches_QNAME, ArrayOfAddressCandidate.class, PossibleMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "IsResidential", scope = Address.class)
    public JAXBElement<String> createAddressIsResidential(String value) {
        return new JAXBElement<String>(_AddressIsResidential_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = Address.class)
    public JAXBElement<String> createAddressFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyName", scope = Address.class)
    public JAXBElement<String> createAddressCountyName(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyName_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = Address.class)
    public JAXBElement<String> createAddressZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CarrierRoute", scope = Address.class)
    public JAXBElement<String> createAddressCarrierRoute(String value) {
        return new JAXBElement<String>(_AddressCandidateCarrierRoute_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPV", scope = Address.class)
    public JAXBElement<String> createAddressDPV(String value) {
        return new JAXBElement<String>(_AddressCandidateDPV_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = Address.class)
    public JAXBElement<String> createAddressFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = Address.class)
    public JAXBElement<String> createAddressFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotesDesc", scope = Address.class)
    public JAXBElement<String> createAddressDPVNotesDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotesDesc_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVDesc", scope = Address.class)
    public JAXBElement<String> createAddressDPVDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVDesc_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotes", scope = Address.class)
    public JAXBElement<String> createAddressDPVNotes(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotes_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Corrections", scope = Address.class)
    public JAXBElement<String> createAddressCorrections(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrections_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CorrectionsDesc", scope = Address.class)
    public JAXBElement<String> createAddressCorrectionsDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrectionsDesc_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = Address.class)
    public JAXBElement<String> createAddressAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyCode", scope = Address.class)
    public JAXBElement<String> createAddressCountyCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = Address.class)
    public JAXBElement<String> createAddressAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = Address.class)
    public JAXBElement<String> createAddressFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = Address.class)
    public JAXBElement<String> createAddressFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = Address.class)
    public JAXBElement<String> createAddressFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = Address.class)
    public JAXBElement<String> createAddressFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = Address.class)
    public JAXBElement<String> createAddressFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BarcodeDigits", scope = Address.class)
    public JAXBElement<String> createAddressBarcodeDigits(String value) {
        return new JAXBElement<String>(_AddressCandidateBarcodeDigits_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = Address.class)
    public JAXBElement<String> createAddressFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CongressCode", scope = Address.class)
    public JAXBElement<String> createAddressCongressCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCongressCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIPUT.class)
    public JAXBElement<String> createValidateAddressWithRDIPUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddressPUT.class)
    public JAXBElement<String> createParseAddressPUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddressPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ValidateAddressWithRDIResult", scope = ValidateAddressWithRDIResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIResponseValidateAddressWithRDIResult(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_ValidateAddressWithRDIResponseValidateAddressWithRDIResult_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKGETJSONResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKGETJSONResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesGETXMLPathAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResponse", scope = ParseAddressDELETEResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressDELETEResponseParseAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressPUTResponseParseAddressResponse_QNAME, ParsedAddressResponse.class, ParseAddressDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GeneralDeliveryService", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoGeneralDeliveryService(String value) {
        return new JAXBElement<String>(_CityStateZipInfoGeneralDeliveryService_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "IsUniqueZipCode", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoIsUniqueZipCode(String value) {
        return new JAXBElement<String>(_CityStateZipInfoIsUniqueZipCode_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RRHCService", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoRRHCService(String value) {
        return new JAXBElement<String>(_CityStateZipInfoRRHCService_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "POBoxRangeLow", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoPOBoxRangeLow(String value) {
        return new JAXBElement<String>(_CityStateZipInfoPOBoxRangeLow_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "StreetService", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoStreetService(String value) {
        return new JAXBElement<String>(_CityStateZipInfoStreetService_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "POBoxRangeHigh", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoPOBoxRangeHigh(String value) {
        return new JAXBElement<String>(_CityStateZipInfoPOBoxRangeHigh_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "POBoxService", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoPOBoxService(String value) {
        return new JAXBElement<String>(_CityStateZipInfoPOBoxService_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "UrbanizationService", scope = CityStateZipInfo.class)
    public JAXBElement<String> createCityStateZipInfoUrbanizationService(String value) {
        return new JAXBElement<String>(_CityStateZipInfoUrbanizationService_QNAME, String.class, CityStateZipInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatches_GETXMLPathResult", scope = GetBestMatchesGETXMLPathResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesGETXMLPathResponseGetBestMatchesGETXMLPathResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesGETXMLPathResponseGetBestMatchesGETXMLPathResult_QNAME, BestMatchesResponse.class, GetBestMatchesGETXMLPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResponse", scope = ParseAddressGETJSONResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressGETJSONResponseParseAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressPUTResponseParseAddressResponse_QNAME, ParsedAddressResponse.class, ParseAddressGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipGETXMLResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipGETXMLResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesPOSTResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesPOSTResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesPOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKGETXML.class)
    public JAXBElement<String> createValidateAddressWithSLKGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = BestMatchesResponse.class)
    public JAXBElement<AV3Error> createBestMatchesResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, BestMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Addresses", scope = BestMatchesResponse.class)
    public JAXBElement<ArrayOfAddress> createBestMatchesResponseAddresses(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_BestMatchesResponseAddresses_QNAME, ArrayOfAddress.class, BestMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipGETJSON.class)
    public JAXBElement<String> createValidateCityStateZipGETJSONZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipGETJSON.class)
    public JAXBElement<String> createValidateCityStateZipGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipGETJSON.class)
    public JAXBElement<String> createValidateCityStateZipGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipGETJSON.class)
    public JAXBElement<String> createValidateCityStateZipGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDICity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDILicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDIPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDIState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDIAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDI.class)
    public JAXBElement<String> createValidateAddressWithRDIAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesGETJSONQStringAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipGETJSONResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipGETJSONResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = CityStateZipResponse.class)
    public JAXBElement<AV3Error> createCityStateZipResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, CityStateZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZip", scope = CityStateZipResponse.class)
    public JAXBElement<CityStateZipInfo> createCityStateZipResponseCityStateZip(CityStateZipInfo value) {
        return new JAXBElement<CityStateZipInfo>(_CityStateZipResponseCityStateZip_QNAME, CityStateZipInfo.class, CityStateZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatches_GETJSONQStringResult", scope = GetBestMatchesGETJSONQStringResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesGETJSONQStringResponseGetBestMatchesGETJSONQStringResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesGETJSONQStringResponseGetBestMatchesGETJSONQStringResult_QNAME, BestMatchesResponse.class, GetBestMatchesGETJSONQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyName", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCountyName(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyName_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotesDesc", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressDPVNotesDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotesDesc_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Corrections", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCorrections(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrections_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyCode", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCountyCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyCode_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CongressCode", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCongressCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCongressCode_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CarrierRoute", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCarrierRoute(String value) {
        return new JAXBElement<String>(_AddressCandidateCarrierRoute_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPV", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressDPV(String value) {
        return new JAXBElement<String>(_AddressCandidateDPV_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CorrectionsDesc", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressCorrectionsDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrectionsDesc_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVDesc", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressDPVDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVDesc_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotes", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressDPVNotes(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotes_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BarcodeDigits", scope = SuiteLinkAddress.class)
    public JAXBElement<String> createSuiteLinkAddressBarcodeDigits(String value) {
        return new JAXBElement<String>(_AddressCandidateBarcodeDigits_QNAME, String.class, SuiteLinkAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETEPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETEAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVDELETE.class)
    public JAXBElement<String> createValidateAddressWithDPVDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetPossibleMatchesResult", scope = GetPossibleMatchesResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesResponseGetPossibleMatchesResult(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_GetPossibleMatchesResponseGetPossibleMatchesResult_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLinePUTResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLinePUTResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLinePUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKDELETEResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKDELETEResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLineQUERYGETXMLResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLineQUERYGETXMLResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLineQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLineGETJSONResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLineGETJSONResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLineGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKPUTResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKPUTResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = DPVAddressResponse.class)
    public JAXBElement<AV3Error> createDPVAddressResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, DPVAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddress", scope = DPVAddressResponse.class)
    public JAXBElement<DPVAddress> createDPVAddressResponseDPVAddress(DPVAddress value) {
        return new JAXBElement<DPVAddress>(_DPVAddress_QNAME, DPVAddress.class, DPVAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLineGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLineGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLineGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLineGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLine_GETXMLPathResult", scope = GetBestMatchesSingleLineGETXMLPathResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLineGETXMLPathResponseGetBestMatchesSingleLineGETXMLPathResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLineGETXMLPathResponseGetBestMatchesSingleLineGETXMLPathResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLineGETXMLPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesGETJSONResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesGETJSONResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatches.class)
    public JAXBElement<String> createGetBestMatchesAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLines.class)
    public JAXBElement<String> createFindAddressLinesAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLineGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLPathBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLineGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLineGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLineGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLineGETXMLPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETXMLPathAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLineGETXMLPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResult", scope = ParseAddressResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressResponseParseAddressResult(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressResponseParseAddressResult_QNAME, ParsedAddressResponse.class, ParseAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLineGETJSONResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLineGETJSONResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLineGETJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLines_GetJSONQStringResult", scope = FindAddressLinesGetJSONQStringResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesGetJSONQStringResponseFindAddressLinesGetJSONQStringResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesGetJSONQStringResponseFindAddressLinesGetJSONQStringResult_QNAME, AddressLinesResponse.class, FindAddressLinesGetJSONQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLinePOST.class)
    public JAXBElement<String> createValidateAddressSingleLinePOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLinePOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLinePOST.class)
    public JAXBElement<String> createValidateAddressSingleLinePOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLinePOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesGETJSONPathAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLinePOSTResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLinePOSTResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLinePOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLineGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONQStringBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLineGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLineGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLineGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLineGETJSONQString.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONQStringAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLineGETJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLineGETXML.class)
    public JAXBElement<String> createValidateAddressSingleLineGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLineGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLineGETXML.class)
    public JAXBElement<String> createValidateAddressSingleLineGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLineGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetPossibleMatchesSingleLineResult", scope = GetPossibleMatchesSingleLineResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLineResponseGetPossibleMatchesSingleLineResult(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_GetPossibleMatchesSingleLineResponseGetPossibleMatchesSingleLineResult_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesDELETEResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesDELETEResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPV.class)
    public JAXBElement<String> createValidateAddressWithDPVAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIGETJSON.class)
    public JAXBElement<String> createValidateAddressWithRDIGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesQUERYGETXMLResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesQUERYGETXMLResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesPUT.class)
    public JAXBElement<String> createGetPossibleMatchesPUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLineQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLineQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLineQUERYGETXML.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLineQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BestAddress2", scope = AddressLinesResponse.class)
    public JAXBElement<String> createAddressLinesResponseBestAddress2(String value) {
        return new JAXBElement<String>(_AddressLinesResponseBestAddress2_QNAME, String.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BestAddress1", scope = AddressLinesResponse.class)
    public JAXBElement<String> createAddressLinesResponseBestAddress1(String value) {
        return new JAXBElement<String>(_AddressLinesResponseBestAddress1_QNAME, String.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = AddressLinesResponse.class)
    public JAXBElement<String> createAddressLinesResponseCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = AddressLinesResponse.class)
    public JAXBElement<AV3Error> createAddressLinesResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = AddressLinesResponse.class)
    public JAXBElement<String> createAddressLinesResponsePostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = AddressLinesResponse.class)
    public JAXBElement<String> createAddressLinesResponseState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, AddressLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLineQUERYGETXMLResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLineQUERYGETXMLResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLineQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLines_GETXMLQStringResult", scope = FindAddressLinesGETXMLQStringResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesGETXMLQStringResponseFindAddressLinesGETXMLQStringResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesGETXMLQStringResponseFindAddressLinesGETXMLQStringResult_QNAME, AddressLinesResponse.class, FindAddressLinesGETXMLQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResponse", scope = ParseAddressQUERYGETXMLResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressQUERYGETXMLResponseParseAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressPUTResponseParseAddressResponse_QNAME, ParsedAddressResponse.class, ParseAddressQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLines_POSTJSONResult", scope = FindAddressLinesPOSTJSONResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesPOSTJSONResponseFindAddressLinesPOSTJSONResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesPOSTJSONResponseFindAddressLinesPOSTJSONResult_QNAME, AddressLinesResponse.class, FindAddressLinesPOSTJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesGETXMLResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesGETXMLResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIPOST.class)
    public JAXBElement<String> createValidateAddressWithRDIPOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLinesGetJSONQString.class)
    public JAXBElement<String> createFindAddressLinesGetJSONQStringAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLinesGetJSONQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLK.class)
    public JAXBElement<String> createValidateAddressWithSLKAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIGETXMLResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIGETXMLResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipQUERYGETXML.class)
    public JAXBElement<String> createValidateCityStateZipQUERYGETXMLZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipQUERYGETXML.class)
    public JAXBElement<String> createValidateCityStateZipQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipQUERYGETXML.class)
    public JAXBElement<String> createValidateCityStateZipQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipQUERYGETXML.class)
    public JAXBElement<String> createValidateCityStateZipQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVPUT.class)
    public JAXBElement<String> createValidateAddressWithDPVPUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddress.class)
    public JAXBElement<String> createParseAddressAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddressGETXML.class)
    public JAXBElement<String> createParseAddressGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddressGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLineDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLineDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLineDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLineDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLineDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = RDIAddressResponse.class)
    public JAXBElement<AV3Error> createRDIAddressResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, RDIAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddress", scope = RDIAddressResponse.class)
    public JAXBElement<RDIAddress> createRDIAddressResponseRDIAddress(RDIAddress value) {
        return new JAXBElement<RDIAddress>(_RDIAddress_QNAME, RDIAddress.class, RDIAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLineGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONPathBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLineGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLineGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLineGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLineGETJSONPath.class)
    public JAXBElement<String> createGetBestMatchesSingleLineGETJSONPathAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLineGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithDPVQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RDIAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "RDIAddressResponse", scope = ValidateAddressWithRDIPOSTResponse.class)
    public JAXBElement<RDIAddressResponse> createValidateAddressWithRDIPOSTResponseRDIAddressResponse(RDIAddressResponse value) {
        return new JAXBElement<RDIAddressResponse>(_RDIAddressResponse_QNAME, RDIAddressResponse.class, ValidateAddressWithRDIPOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETEPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETEAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesDELETE.class)
    public JAXBElement<String> createGetPossibleMatchesDELETEAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLinesGETXMLQString.class)
    public JAXBElement<String> createFindAddressLinesGETXMLQStringAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLinesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipDELETEResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipDELETEResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipPOST.class)
    public JAXBElement<String> createValidateCityStateZipPOSTZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipPOST.class)
    public JAXBElement<String> createValidateCityStateZipPOSTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipPOST.class)
    public JAXBElement<String> createValidateCityStateZipPOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipPOST.class)
    public JAXBElement<String> createValidateCityStateZipPOSTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVDELETEResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVDELETEResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyName", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCountyName(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyName_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotesDesc", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressDPVNotesDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotesDesc_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Corrections", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCorrections(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrections_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyCode", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCountyCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyCode_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "IsResidence", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressIsResidence(String value) {
        return new JAXBElement<String>(_RDIAddressIsResidence_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CongressCode", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCongressCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCongressCode_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CarrierRoute", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCarrierRoute(String value) {
        return new JAXBElement<String>(_AddressCandidateCarrierRoute_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPV", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressDPV(String value) {
        return new JAXBElement<String>(_AddressCandidateDPV_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CorrectionsDesc", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressCorrectionsDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrectionsDesc_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVDesc", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressDPVDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVDesc_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotes", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressDPVNotes(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotes_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BarcodeDigits", scope = RDIAddress.class)
    public JAXBElement<String> createRDIAddressBarcodeDigits(String value) {
        return new JAXBElement<String>(_AddressCandidateBarcodeDigits_QNAME, String.class, RDIAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBNumber", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentPMBNumber(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBNumber_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyName", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCountyName(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyName_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Fragment", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragment(String value) {
        return new JAXBElement<String>(_AddressCandidateFragment_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotesDesc", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressDPVNotesDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotesDesc_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Corrections", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCorrections(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrections_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CountyCode", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCountyCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCountyCode_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Debug", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressDebug(String value) {
        return new JAXBElement<String>(_AddressCandidateDebug_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentStreet", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentStreet(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentStreet_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentUnit", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentUnit(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentUnit_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPreDir", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentPreDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPreDir_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CongressCode", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCongressCode(String value) {
        return new JAXBElement<String>(_AddressCandidateCongressCode_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CarrierRoute", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCarrierRoute(String value) {
        return new JAXBElement<String>(_AddressCandidateCarrierRoute_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPV", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressDPV(String value) {
        return new JAXBElement<String>(_AddressCandidateDPV_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPostDir", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentPostDir(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPostDir_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CorrectionsDesc", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressCorrectionsDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateCorrectionsDesc_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVDesc", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressDPVDesc(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVDesc_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVNotes", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressDPVNotes(String value) {
        return new JAXBElement<String>(_AddressCandidateDPVNotes_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentPMBPrefix", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentPMBPrefix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentPMBPrefix_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentHouse", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentHouse(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentHouse_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FragmentSuffix", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressFragmentSuffix(String value) {
        return new JAXBElement<String>(_AddressCandidateFragmentSuffix_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BarcodeDigits", scope = DPVAddress.class)
    public JAXBElement<String> createDPVAddressBarcodeDigits(String value) {
        return new JAXBElement<String>(_AddressCandidateBarcodeDigits_QNAME, String.class, DPVAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLine.class)
    public JAXBElement<String> createValidateAddressSingleLineLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLine.class)
    public JAXBElement<String> createValidateAddressSingleLineAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVGETXMLResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVGETXMLResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityStateZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "CityStateZipResponse", scope = ValidateCityStateZipQUERYGETXMLResponse.class)
    public JAXBElement<CityStateZipResponse> createValidateCityStateZipQUERYGETXMLResponseCityStateZipResponse(CityStateZipResponse value) {
        return new JAXBElement<CityStateZipResponse>(_CityStateZipResponse_QNAME, CityStateZipResponse.class, ValidateCityStateZipQUERYGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithRDIQUERYGETXML.class)
    public JAXBElement<String> createValidateAddressWithRDIQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithRDIQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLine_GETJSONPathResult", scope = GetBestMatchesSingleLineGETJSONPathResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLineGETJSONPathResponseGetBestMatchesSingleLineGETJSONPathResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLineGETJSONPathResponseGetBestMatchesSingleLineGETJSONPathResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLineGETJSONPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesSingleLinePUT.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLinePUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesSingleLinePUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesSingleLinePUT.class)
    public JAXBElement<String> createGetPossibleMatchesSingleLinePUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesSingleLinePUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithDPVGETJSON.class)
    public JAXBElement<String> createValidateAddressWithDPVGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithDPVGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFragments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "AddressFragments", scope = ParsedAddressResponse.class)
    public JAXBElement<AddressFragments> createParsedAddressResponseAddressFragments(AddressFragments value) {
        return new JAXBElement<AddressFragments>(_AddressFragments_QNAME, AddressFragments.class, ParsedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AV3Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Error", scope = ParsedAddressResponse.class)
    public JAXBElement<AV3Error> createParsedAddressResponseError(AV3Error value) {
        return new JAXBElement<AV3Error>(_SuiteLinkResponseError_QNAME, AV3Error.class, ParsedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ValidateAddressSingleLineResult", scope = ValidateAddressSingleLineResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLineResponseValidateAddressSingleLineResult(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_ValidateAddressSingleLineResponseValidateAddressSingleLineResult_QNAME, DPVAddressResponse.class, ValidateAddressSingleLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesGETXMLQString.class)
    public JAXBElement<String> createGetBestMatchesGETXMLQStringAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesGETXMLQString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressSingleLineGETXMLResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressSingleLineGETXMLResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressSingleLineGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipPUT.class)
    public JAXBElement<String> createValidateCityStateZipPUTZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipPUT.class)
    public JAXBElement<String> createValidateCityStateZipPUTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipPUT.class)
    public JAXBElement<String> createValidateCityStateZipPUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipPUT.class)
    public JAXBElement<String> createValidateCityStateZipPUTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipPUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressSingleLinePUT.class)
    public JAXBElement<String> createValidateAddressSingleLinePUTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressSingleLinePUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressSingleLinePUT.class)
    public JAXBElement<String> createValidateAddressSingleLinePUTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressSingleLinePUT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLinesGETJSONPath.class)
    public JAXBElement<String> createFindAddressLinesGETJSONPathAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLinesGETJSONPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "FindAddressLines_GETJSONPathResult", scope = FindAddressLinesGETJSONPathResponse.class)
    public JAXBElement<AddressLinesResponse> createFindAddressLinesGETJSONPathResponseFindAddressLinesGETJSONPathResult(AddressLinesResponse value) {
        return new JAXBElement<AddressLinesResponse>(_FindAddressLinesGETJSONPathResponseFindAddressLinesGETJSONPathResult_QNAME, AddressLinesResponse.class, FindAddressLinesGETJSONPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "DPVAddressResponse", scope = ValidateAddressWithDPVPOSTResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVPOSTResponseDPVAddressResponse(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_DPVAddressResponse_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVPOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuiteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "SuiteLinkResponse", scope = ValidateAddressWithSLKPOSTResponse.class)
    public JAXBElement<SuiteLinkResponse> createValidateAddressWithSLKPOSTResponseSuiteLinkResponse(SuiteLinkResponse value) {
        return new JAXBElement<SuiteLinkResponse>(_SuiteLinkResponse_QNAME, SuiteLinkResponse.class, ValidateAddressWithSLKPOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPVAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ValidateAddressWithDPVResult", scope = ValidateAddressWithDPVResponse.class)
    public JAXBElement<DPVAddressResponse> createValidateAddressWithDPVResponseValidateAddressWithDPVResult(DPVAddressResponse value) {
        return new JAXBElement<DPVAddressResponse>(_ValidateAddressWithDPVResponseValidateAddressWithDPVResult_QNAME, DPVAddressResponse.class, ValidateAddressWithDPVResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLinePOSTResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLinePOSTResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLinePOSTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetPossibleMatchesGETJSON.class)
    public JAXBElement<String> createGetPossibleMatchesGETJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetPossibleMatchesGETJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = GetBestMatchesSingleLinePOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesSingleLinePOSTJSONBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, GetBestMatchesSingleLinePOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = GetBestMatchesSingleLinePOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesSingleLinePOSTJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, GetBestMatchesSingleLinePOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = GetBestMatchesSingleLinePOSTJSON.class)
    public JAXBElement<String> createGetBestMatchesSingleLinePOSTJSONAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, GetBestMatchesSingleLinePOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLineResult", scope = GetBestMatchesSingleLineResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLineResponseGetBestMatchesSingleLineResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLineResponseGetBestMatchesSingleLineResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ParseAddressQUERYGETXML.class)
    public JAXBElement<String> createParseAddressQUERYGETXMLAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ParseAddressQUERYGETXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "BusinessName", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTBusinessName(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONBusinessName_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address", scope = ValidateAddressWithSLKPOST.class)
    public JAXBElement<String> createValidateAddressWithSLKPOSTAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, ValidateAddressWithSLKPOST.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParsedAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "ParseAddressResponse", scope = ParseAddressGETXMLResponse.class)
    public JAXBElement<ParsedAddressResponse> createParseAddressGETXMLResponseParseAddressResponse(ParsedAddressResponse value) {
        return new JAXBElement<ParsedAddressResponse>(_ParseAddressPUTResponseParseAddressResponse_QNAME, ParsedAddressResponse.class, ParseAddressGETXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLine_POSTJSONResult", scope = GetBestMatchesSingleLinePOSTJSONResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLinePOSTJSONResponseGetBestMatchesSingleLinePOSTJSONResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLinePOSTJSONResponseGetBestMatchesSingleLinePOSTJSONResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLinePOSTJSONResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "GetBestMatchesSingleLine_GETXMLQStringResult", scope = GetBestMatchesSingleLineGETXMLQStringResponse.class)
    public JAXBElement<BestMatchesResponse> createGetBestMatchesSingleLineGETXMLQStringResponseGetBestMatchesSingleLineGETXMLQStringResult(BestMatchesResponse value) {
        return new JAXBElement<BestMatchesResponse>(_GetBestMatchesSingleLineGETXMLQStringResponseGetBestMatchesSingleLineGETXMLQStringResult_QNAME, BestMatchesResponse.class, GetBestMatchesSingleLineGETXMLQStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesSingleLineDELETEResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesSingleLineDELETEResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesSingleLineDELETEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address4", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress4(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress4_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address5", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress5(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress5_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address6", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress6(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress6_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONCity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONLicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PostalCode", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONPostalCode(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONPostalCode_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address3", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress3(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress3_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address2", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress2(String value) {
        return new JAXBElement<String>(_GetBestMatchesPOSTJSONAddress2_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Address1", scope = FindAddressLinesPOSTJSON.class)
    public JAXBElement<String> createFindAddressLinesPOSTJSONAddress1(String value) {
        return new JAXBElement<String>(_FindAddressLinesGETXMLPathAddress1_QNAME, String.class, FindAddressLinesPOSTJSON.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "PossibleMatchesResponse", scope = GetPossibleMatchesPUTResponse.class)
    public JAXBElement<PossibleMatchesResponse> createGetPossibleMatchesPUTResponsePossibleMatchesResponse(PossibleMatchesResponse value) {
        return new JAXBElement<PossibleMatchesResponse>(_PossibleMatchesResponse_QNAME, PossibleMatchesResponse.class, GetPossibleMatchesPUTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "Zip", scope = ValidateCityStateZipDELETE.class)
    public JAXBElement<String> createValidateCityStateZipDELETEZip(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipZip_QNAME, String.class, ValidateCityStateZipDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "City", scope = ValidateCityStateZipDELETE.class)
    public JAXBElement<String> createValidateCityStateZipDELETECity(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipCity_QNAME, String.class, ValidateCityStateZipDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "LicenseKey", scope = ValidateCityStateZipDELETE.class)
    public JAXBElement<String> createValidateCityStateZipDELETELicenseKey(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipLicenseKey_QNAME, String.class, ValidateCityStateZipDELETE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com", name = "State", scope = ValidateCityStateZipDELETE.class)
    public JAXBElement<String> createValidateCityStateZipDELETEState(String value) {
        return new JAXBElement<String>(_ValidateCityStateZipState_QNAME, String.class, ValidateCityStateZipDELETE.class, value);
    }

}
