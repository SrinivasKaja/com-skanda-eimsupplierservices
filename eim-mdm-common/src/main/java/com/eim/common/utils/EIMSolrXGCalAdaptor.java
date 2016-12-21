
package com.eim.common.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * XML Adaptor class for XMLGregorianCalendar fields used while jaxb marshaling
 * and unmarshalling for solr type response date format
 */
public class EIMSolrXGCalAdaptor extends XmlAdapter<String, XMLGregorianCalendar>
{
	// define the logger here.
	private static final Logger log = LoggerFactory.getLogger(EIMXGCalAdaptor.class);

	/**
	 * Method to unmarshal a date string into XMLGregorianCalendar object.
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public XMLGregorianCalendar unmarshal(String str) throws Exception
	{
		log.info("Unmarshalling date string");
		return EIMDateUtils.getXMLGregorianCalendar(EIMDateUtils.getDateFromString(str,
				EIMMDMConstant.DATE_FORMAT_SOLR_SERVICE));
	}

	/**
	 * Method to marshal a XMLGregorianCalendar object into string.
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(XMLGregorianCalendar str) throws Exception
	{
		log.info("Marshalling XMLGregorianCalendar object");
		return EIMDateUtils.formatDateToString(EIMDateUtils.getServiceDateFromXmlGC(str, EIMMDMConstant.DATE_FORMAT_XMLGC),
				EIMMDMConstant.DATE_FORMAT_SOLR_SERVICE);
	}

}
