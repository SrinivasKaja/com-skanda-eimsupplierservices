
package com.eim.common.handler;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Property;
import org.apache.camel.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constants.EIMServiceConstants;
import com.eim.common.datatypes.messagefault.MessageFault;
import com.eim.common.exception.EIMProcessException;
import com.eim.common.util.EIMServiceUtils;
import com.eim.common.utils.PropertyFormatter;

/**
 * The <code>ExceptionHandler</code> class to handle exceptions. <li>
 * recoverableException()</li> <li>unhandledException()</li> <li>
 * businessException()</li> <li>payloadValidationException()</li>
 */
public class ExceptionHandler
{

	/** Variable to hold LOGGER reference */
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

	/**
	 * Method to handler unhandled exception.
	 * 
	 * @param exchange
	 *            - holds Exchange reference.
	 * @param exception
	 *            - holds Exception reference.
	 * @param message
	 *            - holds original message.
	 */
	@Handler
	public void unhandledException(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Property(EIMServiceConstants.ORIGINAL_MESSAGE) String message)
	{
		LOGGER.info("Handling the Unhandled Exception");
		String errorCode = PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_NOT_HANDLED_CODE);
		setExceptionDetail(exchange, exception, message, errorCode,
				PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_NOT_HANDLED));
	}

	/**
	 * Method to handle business exception.
	 * 
	 * @param exchange
	 *            - holds Exchange reference.
	 * @param exception
	 *            - holds Exception reference.
	 * @param message
	 *            - holds original message.
	 * @param errCode
	 *            - holds actual error code only for BAL exception.
	 */
	@Handler
	public void businessException(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Property(EIMServiceConstants.ORIGINAL_MESSAGE) String message)
	{
		LOGGER.info("businessException");
		EIMProcessException eimProcessExp = null;
		if (exception instanceof EIMProcessException)
		{
			eimProcessExp = (EIMProcessException) exception;
		}
		else
		{
			eimProcessExp = new EIMProcessException(exception);
		}
		MessageFault msgFault = eimProcessExp.getMessageFault();
		msgFault.setErrorDescription(message);
		String exceptionMessage = PropertyFormatter.format(EIMServiceConstants.EXCEPTION_MESSAGE_KEY,
				msgFault.getErrorCode(), PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_BUSINESS)
						+ msgFault.getErrorText(), message);
		exchange.setProperty(EIMServiceConstants.EXCEPTION_MESSAGE, exceptionMessage);
		exchange.getIn().setBody(msgFault);
		LOGGER.error(exceptionMessage, eimProcessExp);
		LOGGER.info("businessException");
	}

	/**
	 * Method to handle dal exception.
	 * 
	 * @param exchange
	 *            - holds Exchange reference.
	 * @param exception
	 *            - holds Exception reference.
	 * @param message
	 *            - holds original message.
	 * @param errCode
	 *            - holds actual error code only for DAL exception.
	 */

	/**
	 * Method to handle PayLoad Validation Exception
	 * 
	 * @param exchange
	 *            - holds Exchange reference.
	 * @param exception
	 *            - holds Exception reference.
	 * @param message
	 *            - holds original message.
	 */
	@Handler
	public void payloadValidationException(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Property(EIMServiceConstants.ORIGINAL_MESSAGE) String message)
	{
		LOGGER.info("payLoadValidationException");
		String errorCode = PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_PAYLOAD_VALIDATION_CODE);
		setExceptionDetail(exchange, exception, message, errorCode,
				PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_PAYLOAD_VALIDATION));
		LOGGER.info("payLoadValidationException");
	}

	/**
	 * Common method which will create the exceptionMessage for audit and alert
	 * and also set the MessageFault object for the response. The method is
	 * called for all non-business exception.
	 * 
	 * @param exchange
	 *            - Camel <code>Exchange</code> object
	 * @param exception
	 *            - Exception object for all non-business exception
	 * @param requestXML
	 *            - Original request XML as string
	 * @param errorCode
	 *            - Error Code for the particular error
	 * @param additionalMessage
	 *            - Additional message for the particular exception
	 */
	private void setExceptionDetail(Exchange exchange, Exception exception, String requestXML, String errorCode,
			String additionalMessage)
	{
		String errorMessage = exception.getMessage();
		String exceptionMessage = PropertyFormatter.format(EIMServiceConstants.EXCEPTION_MESSAGE_KEY, errorCode,
				additionalMessage + errorMessage, requestXML);
		exchange.setProperty(EIMServiceConstants.EXCEPTION_MESSAGE, exceptionMessage);
		MessageFault msgFault = EIMServiceUtils.createMessageFault(errorCode, additionalMessage + errorMessage, "");
		msgFault.setErrorDescription(requestXML);
		exchange.getOut().setBody(msgFault);
		LOGGER.error(exceptionMessage, exception);
	}

	/**
	 * Method to handle PayLoad Validation Exception
	 * 
	 * @param exchange
	 *            - holds Exchange reference.
	 * @param exception
	 *            - holds Exception reference.
	 * @param message
	 *            - holds original message.
	 */
	@Handler
	public void handleAllExceptions(Exchange exchange, @Property(Exchange.EXCEPTION_CAUGHT) Exception exception,
			@Property(EIMServiceConstants.ORIGINAL_MESSAGE) String message)
	{
		if (exception instanceof EIMProcessException)
		{
			businessException(exchange, exception, message);
		}
		else if (exception instanceof ValidationException)
		{
			payloadValidationException(exchange, exception, message);
		}
		else
		{
			unhandledException(exchange, exception, message);
		}
	}

}
