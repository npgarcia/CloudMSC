package ws.Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.Holder;

import unspc.net.webservicex.ArrayOfUNSPSCClass;
import unspc.net.webservicex.ArrayOfUNSPSCCommodity;
import unspc.net.webservicex.ArrayOfUNSPSCFamily;
import unspc.net.webservicex.ArrayOfUNSPSCSegment;
import unspc.net.webservicex.GenericUNSPSC;
import unspc.net.webservicex.GenericUNSPSCSoap;
import unspc.net.webservicex.UNSPSCClass;
import unspc.net.webservicex.UNSPSCClassList;
import unspc.net.webservicex.UNSPSCCommodity;
import unspc.net.webservicex.UNSPSCCommodityList;
import unspc.net.webservicex.UNSPSCFamily;
import unspc.net.webservicex.UNSPSCFamilyList;
import unspc.net.webservicex.UNSPSCSegment;
import unspc.net.webservicex.UNSPSCSegmentList;

public class UNSPC {

	private static List<UNSPSCSegment> getSegments() {
		GenericUNSPSC g = new GenericUNSPSC();
		GenericUNSPSCSoap soap = g.getGenericUNSPSCSoap();

		Holder<UNSPSCSegmentList> resultList = new Holder<UNSPSCSegmentList>();
		Holder<Boolean> result = new Holder<Boolean>();

		soap.getUNSPSCSegments(result, resultList);

		if (result.value) {
			UNSPSCSegmentList list = resultList.value;
			ArrayOfUNSPSCSegment data = list.getUNSPSCSegmenData();
			return data.getUNSPSCSegment();
		} else {
			return null;
		}

	}

	public static List<String> getSegmentsStrings() {
		List<UNSPSCSegment> segmentos = getSegments();
		List<String> laLista = new ArrayList<String>();

		if (segmentos != null) {
			Iterator<UNSPSCSegment> iSegmentos = segmentos.iterator();

			while (iSegmentos.hasNext()) {
				UNSPSCSegment segmento = iSegmentos.next();
				laLista.add(segmento.getSegment() + "\t"
						+ segmento.getSegmentTitle());
			}

		}

		return laLista;

	}

	private static List<UNSPSCFamily> getFamilyBySegment(String segment) {
		GenericUNSPSC g = new GenericUNSPSC();
		GenericUNSPSCSoap soap = g.getGenericUNSPSCSoap();

		Holder<UNSPSCFamilyList> resultList = new Holder<UNSPSCFamilyList>();
		Holder<Boolean> result = new Holder<Boolean>();

		soap.getUNSPSCFamilyBySegment(segment, result, resultList);

		if (result.value) {
			UNSPSCFamilyList list = resultList.value;
			ArrayOfUNSPSCFamily data = list.getUNSPSCFamilyData();
			return data.getUNSPSCFamily();
		} else {
			return null;
		}
	}

	public static List<String> getFamilyBySegmentString(String segment) {
		List<String> families = new ArrayList<String>();

		List<UNSPSCFamily> list = getFamilyBySegment(segment);

		Iterator<UNSPSCFamily> i = list.iterator();

		while (i.hasNext()) {
			UNSPSCFamily family = i.next();
			families.add(family.getFamily() + "\t"
					+ family.getFamilyTitle());
		}

		return families;

	}

	private static List<UNSPSCClass> getClassByFamily(String family) {
		GenericUNSPSC g = new GenericUNSPSC();
		GenericUNSPSCSoap soap = g.getGenericUNSPSCSoap();

		Holder<UNSPSCClassList> resultList = new Holder<UNSPSCClassList>();
		Holder<Boolean> result = new Holder<Boolean>();

		soap.getUNSPSCClassByFamily(family, result, resultList);

		if (result.value) {
			UNSPSCClassList list = resultList.value;
			ArrayOfUNSPSCClass data = list.getUNSPSCClassData();
			return data.getUNSPSCClass();
		} else {
			return null;
		}
	}

	public static List<String> getClassByFamilyString(String family) {
		List<String> classes = new ArrayList<String>();
		
		List<UNSPSCClass> list = getClassByFamily(family);

		Iterator<UNSPSCClass> i = list.iterator();

		while (i.hasNext()) {
			UNSPSCClass uClass = i.next();
			classes.add(uClass.getClazz() + "\t"
					+ uClass.getClassTitle());

		}
		
		return classes;
	}

	private static List<UNSPSCCommodity> getComodityByClass(String uClass) {
		GenericUNSPSC g = new GenericUNSPSC();
		GenericUNSPSCSoap soap = g.getGenericUNSPSCSoap();

		Holder<UNSPSCCommodityList> resultList = new Holder<UNSPSCCommodityList>();
		Holder<Boolean> result = new Holder<Boolean>();

		soap.getUNSPSCCommodityByClass(uClass, result, resultList);

		if (result.value) {
			UNSPSCCommodityList list = resultList.value;
			ArrayOfUNSPSCCommodity data = list.getUNSPSCCommodityData();
			return data.getUNSPSCCommodity();
		} else {
			return null;
		}
	}

	public static List<String> getComodityByClassString(String uClass) {
		List<String> comodities = new ArrayList<String>();
		
		List<UNSPSCCommodity> list = getComodityByClass(uClass);

		Iterator<UNSPSCCommodity> i = list.iterator();

		while (i.hasNext()) {
			UNSPSCCommodity comodity = i.next();
			comodities.add(comodity.getCommodity() + "\t"
					+ comodity.getCommodityTitle());

		}
		
		return comodities;
	}
}
