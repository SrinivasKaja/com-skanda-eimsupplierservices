
package com.eim.common.handlers;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Properties;
import org.apache.camel.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * Class is used to determine the failure count for the incoming file loading
 * request.
 */
public class EmailServiceHandler
{
	// Represents the Logger reference variable.
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailServiceHandler.class);
	private int failureCount = 0;
	private String fileName;

	/**
	 * The <code>countFailures</code> method will count the failure for a
	 * particular file. The failure count is set as a property. This method
	 * works only for batch processing where input file is provided. For all
	 * other requests from web-service/MQ based requests, count set is not
	 * required
	 * 
	 * @param exchange
	 *            - Exchange object for the route
	 * @param exception
	 *            - Exception caught
	 * @param properties
	 *            - Map containing the properties in the current exchange
	 */
	@Handler
	public void countFailures(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Properties Map<String, Object> properties)
	{
		if (properties.get(EIMMDMConstant.FILE_NAME) != null)
		{
			// Set the count to 0 when the file name changes.
			if (fileName != null && !fileName.equals((String) properties.get(EIMMDMConstant.FILE_NAME)))
			{
				failureCount = 0;
			}
			// If there is exception in the exchange increment the count
			if (exception != null)
			{
				failureCount++;
			}

			fileName = (String) properties.get(EIMMDMConstant.FILE_NAME);
			properties.put("EMAIL_FAIL_COUNT", failureCount);
			LOGGER.info("EMAIL_FAIL_COUNT: " + failureCount);
		}
	}
}
