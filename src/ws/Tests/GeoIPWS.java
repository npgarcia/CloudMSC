package ws.Tests;

import geo.net.webservicex.GeoIP;
import geo.net.webservicex.GeoIPService;
import geo.net.webservicex.GeoIPServiceSoap;

public class GeoIPWS {

	private static String toString(GeoIP info) {
		String analysis = "";
		if (info.getReturnCode() == 1) {
			analysis = "IP: \t" + info.getIP() + "\n" + "Country: \t"
					+ info.getCountryName() + "\n" + "Country Code: \t"
					+ info.getCountryCode();
		} else {
			analysis = "Error...\n";
			analysis += "info: " + info.getReturnCode() + "\n"
					+ info.getReturnCodeDetails();
		}

		return analysis;

	}

	public static String getIPGeo(String ip) {

		GeoIPService ipService = new GeoIPService();

		GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap();

		GeoIP result = ipServiceSoap.getGeoIP(ip);
		return toString(result);

	}

}
