
package com.eim.common.handlers;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Properties;
import org.apache.camel.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * The <code>AuditServiceProcessor</code> class is used to auditing purpose.<li>
 * saveAudit()</li>
 */
public class AuditServiceHandler
{
	/*
	 * Represents the Logger reference variable.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(AuditServiceHandler.class);

	/**
	 * The <code>loadAudit</code> method will load the audit information and set
	 * it in a Map
	 * 
	 * @param exchange
	 *            - Exchange Object
	 * @param properties
	 *            - Map containing audit details
	 */
	@Handler
	public void loadAudit(Exchange exchange, @Properties Map<String, Object> properties)
	{
		if (properties.get(EIMMDMConstant.AUDIT_ID) == null)
		{
			properties.put(EIMMDMConstant.AUDIT_ID, exchange.getIn().getMessageId());
			properties.put(EIMMDMConstant.INTERFACE_ID, exchange.getContext().getName());
		}
		LOGGER.info("exchange.getFromEndpoint()--" + String.valueOf(exchange.getFromEndpoint() == null));
		properties.put(EIMMDMConstant.EXCHANGEID, exchange.getExchangeId());
	}

	/**
	 * The <code>saveAudit</code> method will save the audit information to a
	 * log file
	 * 
	 * @param properties
	 *            - Map containing the audit details
	 */
	@Handler
	public void saveAudit(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Properties Map<String, Object> properties)
	{
		StringBuffer buffer = new StringBuffer();
		LOGGER.error("An exception occured during processing. Details  - ");

		buffer.append(EIMMDMConstant.START_KEY);
		buffer.append(EIMMDMConstant.EXCEPTION_MESSAGE);
		buffer.append(EIMMDMConstant.ARROW_SEPARATOR);
		buffer.append(exception);
		buffer.append(EIMMDMConstant.NEW_LINE);
		if (exception != null && exception.getCause() != null)
		{
			buffer.append(exception.getCause());
			buffer.append(EIMMDMConstant.NEW_LINE);
		}

		Map<String, Object> e = exchange.getProperties();
		for (Entry<String, Object> entry : e.entrySet())
		{
			Object value = entry.getValue();
			String key = entry.getKey();
			if (value instanceof String)
			{
				buffer.append(key);
				buffer.append(EIMMDMConstant.ARROW_SEPARATOR);
				buffer.append(value);
				buffer.append(EIMMDMConstant.NEW_LINE);
			}
		}
		buffer.append(EIMMDMConstant.END_KEY);
		LOGGER.error(buffer.toString(), exception);
	}
}
