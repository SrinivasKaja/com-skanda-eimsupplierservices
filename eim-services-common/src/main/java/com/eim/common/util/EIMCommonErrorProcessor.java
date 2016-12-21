
package com.eim.common.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;

import com.eim.common.datatypes.messagefault.MessageFault;
import com.eim.common.exception.EIMProcessException;

/**
 * This processor class will be used across all SOAP services to form the common
 * error response body.
 */
public class EIMCommonErrorProcessor
{
	private static Map<String, Integer> httpstatusCodeMap = new HashMap<String, Integer>();

	/**
	 * @return the httpstatusCodeMap
	 */
	public static Map<String, Integer> getHttpstatusCodeMap()
	{
		return httpstatusCodeMap;
	}

	/**
	 * @param httpstatusCodeMap
	 *            the httpstatusCodeMap to set
	 */
	public static void setHttpstatusCodeMap(Map<String, Integer> httpstatusCodeMap)
	{
		EIMCommonErrorProcessor.httpstatusCodeMap = httpstatusCodeMap;
	}

	public EIMCommonErrorProcessor()
	{
	}

	public EIMCommonErrorProcessor(Map<String, Integer> httpStatusMap)
	{
		httpstatusCodeMap = httpStatusMap;
	}

	/**
	 * Method will create a common CXF <code>SoapFault</code> and set the
	 * <code>MessageFault</code> object in the detail tag of soap the fault
	 * object
	 * 
	 * @param exchange
	 *            - holds exchange reference
	 * @param msgFault
	 *            - MessageFault object set inside the exchange body
	 * @throws EIMProcessException
	 */
	@Handler
	public void processErrorResponse(Exchange exchange, @Body MessageFault msgFault) throws EIMProcessException
	{
		if (exchange.getProperty("WsType").toString().equalsIgnoreCase("REST"))
		{
			sendRESTResponse(exchange, msgFault);
		}

	}

	/**
	 * for rest services this method set the http status code in the message
	 * header and the message fault in the body
	 * 
	 * @param exchange
	 * @param msgFault
	 */
	private void sendRESTResponse(Exchange exchange, MessageFault msgFault)
	{
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, httpstatusCodeMap.get(msgFault.getErrorCode()));
		exchange.getIn().setBody(msgFault);
	}
}
