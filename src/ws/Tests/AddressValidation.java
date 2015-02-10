package ws.Tests;

import java.awt.image.BufferedImage;

public class AddressValidation {
	private String address;
	private BufferedImage barcode;

	public AddressValidation(String address, String barcode) {
		this.setAddress(address);
		this.setBarcode(Barcode39.barcodeImage(barcode,40));
	}

	public AddressValidation(String error) {
		this.setAddress(error);
		this.setBarcode(error);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BufferedImage getBarcode() {
		return barcode;
	}

	public void setBarcode(BufferedImage barcode) {
		this.barcode = barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = Barcode39.barcodeImage(barcode, 40);
	}
}
