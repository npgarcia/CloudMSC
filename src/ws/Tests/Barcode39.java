package ws.Tests;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;

import code39.net.webservicex.BarCode;
import code39.net.webservicex.BarCodeSoap;

public class Barcode39 {

	public static BufferedImage barcodeImage(String imageString, int size)
	{
	    byte[] imageByte = null;
	    BarCode barcodeService = new BarCode();
	    
	    BarCodeSoap serviceSoap = barcodeService.getBarCodeSoap();
	    imageByte = serviceSoap.code39(imageString, size, true, imageString);
	    
	    return getImage(imageByte);
	}
	
	private static BufferedImage getImage(byte[] imageByte){

	    BufferedImage img = null;
		try
	    {
	    	 img = ImageIO.read(new ByteArrayInputStream(imageByte));
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return img;
	}

}
