package com.eim.common.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;
import com.eim.common.exceptions.EIMProcessException;



/**
 * The processor is used to set properties for queue
 */
public class QueueProcessor implements Processor
{
	private static final Logger LOGGER = LoggerFactory.getLogger(QueueProcessor.class);

	/**
	 * Method to populate the queue properties
	 */
	@Override
	public void process(Exchange exchange) throws Exception
	{
		try
		{
			exchange.setProperty(EIMMDMConstant.JMS_EXPIRY,
					String.valueOf(System.currentTimeMillis() + EIMMDMConstant.TWENTY_FOUR_HOURS));

			exchange.setProperty(EIMMDMConstant.JMS_PRIORITY, EIMMDMConstant.DEFAULT_PRIORITY);
		}
		catch(Exception e)
		{
			throw new EIMProcessException("Exception from QueryProcessor", e);
		}

	}
}

