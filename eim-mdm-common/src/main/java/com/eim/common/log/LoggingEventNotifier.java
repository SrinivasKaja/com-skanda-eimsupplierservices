
package com.eim.common.log;

import java.util.Date;
import java.util.EventObject;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.management.event.ExchangeCompletedEvent;
import org.apache.camel.management.event.ExchangeSentEvent;
import org.apache.camel.support.EventNotifierSupport;
import org.apache.log4j.NDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * Notifies the time taken for Camel Events
 */
public class LoggingEventNotifier extends EventNotifierSupport
{
	// Logger for defining event logs
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingEventNotifier.class);
	private Date created;

	/**
	 * Checks when the event is SentEvent or CompletedEvent and logs the time
	 * taken
	 */
	public void notify(EventObject event)
	{
		// check if the event is a SentEvent
		if (event instanceof ExchangeSentEvent)
		{
			ExchangeSentEvent sent = (ExchangeSentEvent) event;

			final Exchange sentExchange = sent.getExchange();
			if (sentExchange.getFromEndpoint().getEndpointUri().startsWith(EIMMDMConstant.MQ)
					|| sentExchange.getFromEndpoint().getEndpointUri().startsWith(EIMMDMConstant.TIMER))
			{
				initiateNDC(sentExchange);
			}
			else if (sentExchange.getFromEndpoint().getEndpointUri().startsWith(EIMMDMConstant.FILE))
			{
				checkSplit(sentExchange);
			}
			Endpoint endpoint = sent.getEndpoint();
			if (endpoint.getEndpointUri().startsWith(EIMMDMConstant.SFTP)
					|| endpoint.getEndpointUri().startsWith(EIMMDMConstant.FTP)
					|| endpoint.getEndpointUri().startsWith(EIMMDMConstant.MQ))
			{
				if (created == null)
				{
					created = sentExchange.getProperty(Exchange.CREATED_TIMESTAMP, Date.class);
				}
				LOGGER.info("Took " + (System.currentTimeMillis() - created.getTime()) + " millis for " + endpoint);
				NDC.clear();
				NDC.remove();
			}
		}
	}

	/**
	 * Check the camel split index and initiate logging.
	 * 
	 * @param exchange
	 */
	public void checkSplit(final Exchange exchange)
	{
		Object splitObj = exchange.getProperty(EIMMDMConstant.CAMEL_SPLIT_INDEX);
		if (splitObj != null)
		{
			int splitIndex = (Integer) splitObj;
			if (splitIndex == 0)
			{
				initiateNDC(exchange);
			}
		}
	}

	/**
	 * Method to initiate NDC and set the Created Time
	 * 
	 * @param exchange
	 */
	public void initiateNDC(final Exchange exchange)
	{
		initiateNDCLog((String) exchange.getProperty(EIMMDMConstant.FILE_NAME));
		created = exchange.getProperty(Exchange.CREATED_TIMESTAMP, Date.class);
	}

	/**
	 * Enable SentEvent and Completed Event for logging. To enable other events
	 * add them here.
	 */
	public boolean isEnabled(EventObject event)
	{
		return (event instanceof ExchangeSentEvent || event instanceof ExchangeCompletedEvent);
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.camel.support.ServiceSupport#doStart()
	 */
	@Override
	protected void doStart()
	{
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.camel.support.ServiceSupport#doStop()
	 */
	@Override
	protected void doStop()
	{
	}

	/**
	 * The method will add specific request identification inside the log for
	 * all requests
	 */
	private void initiateNDCLog(String fileName)
	{
		// Code for NDC logging
		NDC.remove();
		NDC.clear();
		NDC.push(EIMMDMConstant.REQUEST_ID);
		NDC.push(EIMMDMConstant.HYPHEN);
		NDC.push(String.valueOf(System.nanoTime()));
		if (fileName != null && !fileName.isEmpty())
		{
			NDC.push(EIMMDMConstant.COLON);
			NDC.push(EIMMDMConstant.FILE_NAME);
			NDC.push(EIMMDMConstant.HYPHEN);
			NDC.push(fileName);
		}
	}
}
