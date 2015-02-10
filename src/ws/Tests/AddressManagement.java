package ws.Tests;

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import com.serviceobjects.AV3Error;
import com.serviceobjects.Address;
import com.serviceobjects.AddressValidation3;
import com.serviceobjects.ArrayOfAddress;
import com.serviceobjects.BestMatchesResponse;
import com.serviceobjects.IAddressValidation3;

public class AddressManagement {

	

	public static AddressValidation getMatchAddress(String name,
			String address1, String address2, String city, String state,
			String zip) {
		AddressValidation3 av3 = new AddressValidation3();
		IAddressValidation3 av3Response = av3.getDOTSAddressValidation3();
		BestMatchesResponse response = av3Response.getBestMatches(name,
				address1, address2, city, state, zip, "WS72-HVJ3-ZSA1");

		JAXBElement<AV3Error> error = response.getError();
		String addressString = "";
		String barcode = "";

		AddressValidation address;

		if (error == null) {

			JAXBElement<ArrayOfAddress> addresses = response.getAddresses();
			ArrayOfAddress addressesArray = addresses.getValue();

			List<Address> addressList = addressesArray.getAddress();

			Iterator<Address> i = addressList.iterator();

			while (i.hasNext()) {
				Address theAddress = i.next();
				addressString += theAddress.getAddress1().getValue() + "\n";
				addressString += theAddress.getAddress2().getValue() + "\n";
				addressString += theAddress.getCity().getValue() + "\n";
				addressString += theAddress.getState().getValue() + "\n";
				addressString += theAddress.getZip().getValue() + "\n";
				addressString += "----------------\n";
				addressString += theAddress.getDPVDesc().getValue();

				barcode = theAddress.getBarcodeDigits().getValue();
			}
			address = new AddressValidation(addressString,barcode);
			
		} else {
			AV3Error theError = error.getValue();
			address = new AddressValidation(theError.getDesc().getValue());
		}

		return address;
	}
}
