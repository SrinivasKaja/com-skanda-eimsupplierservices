
package com.eim.common.handler;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * Fault Interceptor class which will interceptor all responses going from EIM
 * application and change the HTTP Response code
 */
public class EIMFaultInterceptor extends AbstractPhaseInterceptor<Message>
{

	/**
	 * Constructor to set the Phase in the parent class
	 */
	public EIMFaultInterceptor()
	{
		super(Phase.POST_PROTOCOL);
	}

	/**
	 * Overridden method to set the RESPONSE_CODE to 200 as all types of
	 * exception is handled inside the application
	 * 
	 * @see org.apache.cxf.interceptor.Interceptor#handleMessage(org.apache.cxf.message
	 *      .Message)
	 */
	public void handleMessage(Message message) throws Fault
	{
		message.put(Message.RESPONSE_CODE, Integer.valueOf(200));
	}
}
