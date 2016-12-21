package com.eim.common.log;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.apache.log4j.NDC;

/**
 * The class is used as a Intercepter for all SOAP web services.
 */
public class LoggingInterceptor extends LoggingInInterceptor
{
	/**
	 * The method will be used to add NDC logging for each service.
	 */
	public void handleMessage(Message message) throws Fault
	{
		String operationName = (String) message.get(Message.PATH_INFO);
		NDC.remove();
		NDC.clear();
		NDC.push("RequestId : " + System.nanoTime());
		NDC.push(" - Service Name : " + operationName);
		HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
		NDC.push(" - Client IP : " + request.getRemoteAddr());
	}
}
