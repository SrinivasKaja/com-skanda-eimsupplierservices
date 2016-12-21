package com.skandha.eim.air.processor;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.skandha.eim.air.jaxb.v1.AirLowFareSearchRQ;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
File a = new File ("src/main/resources/xsd/request.xml");
JAXBContext jc = JAXBContext.newInstance(AirLowFareSearchRQ.class);
Unmarshaller uj = jc.createUnmarshaller();
AirLowFareSearchRQ air = (AirLowFareSearchRQ) uj.unmarshal(a);
System.out.println(air.getOriginDestinationInformation().get(0).getArrivalDateTime());

} catch (JAXBException e) {
	e.printStackTrace();
	
}
	}

}
