package com.skandha.eim.air.processor;


import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.JAXBException;

import org.apache.axis.types.UnsignedShort;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Processor;
import org.ebxml.www.namespaces.messageHeader.From;
import org.ebxml.www.namespaces.messageHeader.MessageData;
import org.ebxml.www.namespaces.messageHeader.MessageHeader;
import org.ebxml.www.namespaces.messageHeader.PartyId;
import org.ebxml.www.namespaces.messageHeader.Service;
import org.ebxml.www.namespaces.messageHeader.To;
import org.ebxml.www.namespaces.messageHeader.holders.MessageHeaderHolder;
import org.opentravel.www.OTA._2003._05.AirSearchPrefsType;
import org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions;
import org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters;
import org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings;
import org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType;
import org.opentravel.www.OTA._2003._05.AirTripType;
import org.opentravel.www.OTA._2003._05.CabinPrefType;
import org.opentravel.www.OTA._2003._05.CabinType;
import org.opentravel.www.OTA._2003._05.CompanyNameType;
import org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQ;
import org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation;
import org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions;
import org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage;
import org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS;
import org.opentravel.www.OTA._2003._05.OnlineIndicator;
import org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation;
import org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation;
import org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType;
import org.opentravel.www.OTA._2003._05.SourceType;
import org.opentravel.www.OTA._2003._05.Target;
import org.opentravel.www.OTA._2003._05.TransactionType;
import org.opentravel.www.OTA._2003._05.TransactionTypeRequestType;
import org.opentravel.www.OTA._2003._05.TravelerCountTypeCode;
import org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType;
import org.opentravel.www.OTA._2003._05.TravelerInformationType;
import org.opentravel.www.OTA._2003._05.UniqueID_Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;
import org.xmlsoap.schemas.ws._2002._12.secext.holders.SecurityHolder;

import com.eim.common.exception.EIMProcessException;
import com.sabre.webservices.websvc.BargainFinderMaxPortTypeProxy;
import com.skandha.eim.air.jaxb.v1.AirLowFareSearchRQ;

/**
 * This is the request processor to process the input parameters and use them
 * for further processing in the camel routes.
 */

public class DcDetailsInfoProcessorV2 implements Processor
{

	private static final Logger LOGGER = LoggerFactory.getLogger(DcDetailsInfoProcessorV2.class);


	@Override
	@Handler
	public void process(Exchange exchange) throws EIMProcessException, JAXBException, FileNotFoundException, MalformedURLException
	{
/*		System.out.println("**********************");
		String a = (String) exchange.getProperty("body");
		System.out.println(a);
*/		
		AirLowFareSearchRQ request = exchange.getIn().getBody(AirLowFareSearchRQ.class);
		BargainFinderMaxPortTypeProxy proxy = new BargainFinderMaxPortTypeProxy();
	 	proxy.setEndpoint("https://sws-crt.cert.sabre.com");
	  	
	     // set from
	 	PartyId[] fromPartyId = new PartyId[5];
	 	fromPartyId[0] = new  PartyId("Via Testing");
	 	//	fromPartyId[0].setType("urn:x12.org.IO5:01");
	 	From from =new From();
	 	from.setPartyId(fromPartyId);
	 	//set to
	 	PartyId[] toPartyId = new PartyId[10];
	 	toPartyId[0] = new PartyId("AbacusHost");
	 	//toPartyId[0].setType("urn:x12.org.IO5:01");
	 	To to = new To();
	 	to.setPartyId(toPartyId);
	 	//set service
	 	Service service= new Service();
	 	//service.setType("SabreXML");
	 	service.set_value("BargainFinderMaxRQ");
	 	//set Message Data
	 	MessageData messageData =new MessageData();
	 	messageData.setMessageId("mid:1308909055awc.abacus.com.sg");
	 	messageData.setTimestamp("2016-11-14T11-01-58Z");
	 	Calendar cal = Calendar.getInstance();
	 	cal.setTime(new Date());
	 	messageData.setTimeToLive(cal);
	 	//set Message Header
	 	MessageHeader header = new MessageHeader();
	 	header.setAction("BargainFinderMaxRQ");
	 	header.setCPAId("3HQD");
	 	header.setFrom(from);
	 	header.setTo(to);
	 	header.setService(service);
	 	header.setConversationId("1308909055@abacus.com.sg");
	     header.setMessageData(messageData);
	     //set Message Header Holder
	     MessageHeaderHolder messageHeaderHolder =new MessageHeaderHolder(header);
	     String securityToken = "T1RLAQJHmSmNkMEjN2o/ZkUtU0YcXBIcMxAPnQMLeCGoEbxdVHTwGKPqAADAVijP1dlQABWCr/ywnvKU1I6+uYJNz0OLF57M8xkTCmXqyYqlWT1xrGQLUg/s5S5Om+OzgyX7uf1uQJSvf0MzYJiN54jPsfIu84xbP88Ek5NbxDgPZFpwI8Hd4eKHPb18VqL3h/8sax6zX85j3J1peBdeOTv/p2JmxyU9B+qrtOaiL+aI3HNG90PKVmcluLikQwc1RaGuE35Fy/WywsgRVtQBBYEMQ3xw+Hcrc+K3ksYSeW3xcrn08fj1EACIEklW";
	     //set Security
	     Security security =new Security();
	     //security.setUsernameToken(securityUsernameToken);
	     security.setBinarySecurityToken(securityToken);
	     //Set Security Holder
	     SecurityHolder securityHolder =new SecurityHolder(security);
	     //set Target
	     Target target = null;
	     
	     // set CompanyNameType 
	     CompanyNameType companyNameType = new CompanyNameType();
	     companyNameType.set_value("TN");
	   //set UniqueID_Type
	     UniqueID_Type requestorId = new UniqueID_Type();
	     requestorId.setCompanyName(companyNameType);
	     requestorId.setID("1");
	     requestorId.setType("1");
	     //set POS
	     SourceType[] sourceType = new SourceType[10];
	     sourceType[0] = new SourceType();
	     sourceType[0].setPseudoCityCode("3HQD");
	     sourceType[0].setRequestorID(requestorId);
	     //set OriginDestinationInformation
	     OTA_AirLowFareSearchRQOriginDestinationInformation[] originDestinationInformation = null;
	     if(null!= request.getOriginDestinationInformation() && request.getOriginDestinationInformation().size()>0) {
	    	 originDestinationInformation = new OTA_AirLowFareSearchRQOriginDestinationInformation[request.getOriginDestinationInformation().size()];
		     for(int i = 0;i< request.getOriginDestinationInformation().size();i++) {
		    	 originDestinationInformation[i] = new OTA_AirLowFareSearchRQOriginDestinationInformation();
		    	 originDestinationInformation[i].setRPH("1");
		    	 if(null != request.getOriginDestinationInformation().get(i).getDepartureDateTime())
			     originDestinationInformation[i].setDepartureDateTime(request.getOriginDestinationInformation().get(i).getDepartureDateTime());
		    	 if(null != request.getOriginDestinationInformation().get(i).getOriginLocation()) {
		    		 OriginDestinationInformationTypeOriginLocation originLocation = new OriginDestinationInformationTypeOriginLocation(request.getOriginDestinationInformation().get(i).getOriginLocation());
				     originDestinationInformation[i].setOriginLocation(originLocation);
				 }
		    	 if(null != request.getOriginDestinationInformation().get(i).getDestinationLocation()) {
		    		 OriginDestinationInformationTypeDestinationLocation destLocation = new OriginDestinationInformationTypeDestinationLocation(request.getOriginDestinationInformation().get(i).getDestinationLocation());
					 originDestinationInformation[i].setDestinationLocation(destLocation);
				 }
			  }
	     }
	     
	     //set cabin pref
	     CabinPrefType[] cabinPref = new CabinPrefType[4];
	     cabinPref[0] = new CabinPrefType();
	     cabinPref[0].setCabin(CabinType.Business);
	     //set OnlineIndicator 
	     OnlineIndicator onlineIndicator = new OnlineIndicator();
	     onlineIndicator.setInd(true);
	     //set AirTripType
	     AirTripType airTripType = null;
	     //set AirSearchPrefsTypeTPA_ExtensionsTripType
	     AirSearchPrefsTypeTPA_ExtensionsTripType tripType = new AirSearchPrefsTypeTPA_ExtensionsTripType();
	     tripType.setValue(airTripType.OneWay);
	     
	     //set UnsignedShort
	     UnsignedShort unsignedShort = new UnsignedShort();
	     unsignedShort.setValue(20);
	     UnsignedShort priceWeight = new UnsignedShort();
	     unsignedShort.setValue(4);
	     UnsignedShort travelTimeWeight = new UnsignedShort();
	     unsignedShort.setValue(6);
	    
	     //set AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings
	     AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings weightings = new AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings();
	     weightings.setPriceWeight(priceWeight);
	     weightings.setTravelTimeWeight(travelTimeWeight);
	     
	     //set AirSearchPrefsTypeTPA_ExtensionsDiversityParameters
	     AirSearchPrefsTypeTPA_ExtensionsDiversityParameters diversityPrameters = new AirSearchPrefsTypeTPA_ExtensionsDiversityParameters();
	     diversityPrameters.setAdditionalNonStopsPercentage(unsignedShort);
	     diversityPrameters.setWeightings(weightings);
	     
	     //set AirSearchPrefsTypeTPA_Extensions
	     AirSearchPrefsTypeTPA_Extensions tpa_extentions = new AirSearchPrefsTypeTPA_Extensions();
	     tpa_extentions.setOnlineIndicator(onlineIndicator);
	     tpa_extentions.setTripType(tripType);
	     tpa_extentions.setDiversityParameters(diversityPrameters);
	     
	     //set AirSearchPrefsType
	     AirSearchPrefsType  travelPrefs = new AirSearchPrefsType();
	     travelPrefs.setValidInterlineTicket(true);
	     travelPrefs.setCabinPref(cabinPref);
	     travelPrefs.setTPA_Extensions(tpa_extentions);
	     //set TravelerCountTypeCode
	     TravelerCountTypeCode codeType1 = new TravelerCountTypeCode();
	     codeType1.setOTA_CodeTypeValue("ADT");
	     
	     TravelerCountTypeCode codeType2 = new TravelerCountTypeCode();
	     codeType1.setOTA_CodeTypeValue("CNN");
	     
	     TravelerCountTypeCode codeType3 = new TravelerCountTypeCode();
	     codeType1.setOTA_CodeTypeValue("INF");
	     
	     
	     
	     //set TravelerInformationType
	     TravelerInformationType[] airTravelerAvail = new TravelerInformationType[request.getTravelerInfoSummary().size()];
	     for (int i=0;i<request.getTravelerInfoSummary().size();i++) {
	    	 airTravelerAvail[i] = new TravelerInformationType();
	    	 PassengerTypeQuantityType[] passengerTypeQuantityType = null;
	    	 //set PassengerTypeQuantityType
	    	 if( null != request.getTravelerInfoSummary().get(i).getPassengerTypeQuantity() && request.getTravelerInfoSummary().get(i).getPassengerTypeQuantity().size() > 0) {
	    		 passengerTypeQuantityType = new PassengerTypeQuantityType[request.getTravelerInfoSummary().get(i).getPassengerTypeQuantity().size()];
	    		 for ( int j=0;j<request.getTravelerInfoSummary().get(i).getPassengerTypeQuantity().size();i++) {
	    			 passengerTypeQuantityType[j] = new PassengerTypeQuantityType();
				     passengerTypeQuantityType[j].setCode(codeType1);
				     passengerTypeQuantityType[j].setQuantity(BigInteger.valueOf(2));
	    		 }
			 }
	    	 if(null != passengerTypeQuantityType)
	    	 airTravelerAvail[i].setPassengerTypeQuantity(passengerTypeQuantityType);
		 }
	     
	     //set TravelerInfoSummaryType
	     TravelerInfoSummaryType travelerInfoSummaryType = new TravelerInfoSummaryType();
	     travelerInfoSummaryType.setAirTravelerAvail(airTravelerAvail);
	    
	     //set TransactionTypeRequestType
	     TransactionTypeRequestType requestType = new TransactionTypeRequestType();
	     requestType.setName("50ITINS");
	     //set TransactionType
	     TransactionType intelliSellTransaction = new TransactionType();
	     intelliSellTransaction.setRequestType(requestType);
	     //set OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage
	     OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage alternateAirportMileage = new OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage();
	     alternateAirportMileage.setNumber("50");
	     // set OTA_AirLowFareSearchRQTPA_Extensions
	     OTA_AirLowFareSearchRQTPA_Extensions ota_TPA_extentions = new OTA_AirLowFareSearchRQTPA_Extensions();
	     ota_TPA_extentions.setIntelliSellTransaction(intelliSellTransaction);
	     ota_TPA_extentions.setAlternateAirportMileage(alternateAirportMileage);
	     OTA_AirLowFareSearchRQ otaAirLowFareSearchRQ = new OTA_AirLowFareSearchRQ();
	     otaAirLowFareSearchRQ.setTarget(target.Production);
	     otaAirLowFareSearchRQ.setVersion("1.9.2");
	     otaAirLowFareSearchRQ.setResponseType("OTA");
	     otaAirLowFareSearchRQ.setResponseVersion("1.9.2");
	     otaAirLowFareSearchRQ.setPOS(sourceType);
	     if( null != originDestinationInformation)
	     otaAirLowFareSearchRQ.setOriginDestinationInformation(originDestinationInformation);
	     otaAirLowFareSearchRQ.setTravelPreferences(travelPrefs);
	     otaAirLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummaryType);
	     otaAirLowFareSearchRQ.setTPA_Extensions(ota_TPA_extentions);
	   	try {
			OTA_AirLowFareSearchRS response = proxy.bargainFinderMaxRQ(messageHeaderHolder, securityHolder, otaAirLowFareSearchRQ);
			exchange.getOut().setBody(response);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void processResponse(Exchange ex)
	{
		String body = ex.getIn().getBody(String.class);
		System.out.println(body);
	}

	public void processErrorResponse(Exchange ex)
	{
	}

}
