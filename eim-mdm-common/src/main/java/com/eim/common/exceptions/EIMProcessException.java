
package com.eim.common.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The <code>EIMProcessException</code> exception class, used for fault messages
 * and all type of business process failure.
 */
public class EIMProcessException extends Exception
{

	/**
	 * Represents the serial version id.
	 */
	private static final long serialVersionUID = 5511423566028362339L;

	/**
	 * <code>EIMProcessException</code> Constructor with String as input
	 * parameter. This invokes Exception constructor by passing String
	 * 
	 * @param message
	 *            - String message to set
	 */
	public EIMProcessException(String message)
	{
		super(message);
	}

	/**
	 * <code>EIMProcessException</code> Constructor with Exception as input
	 * parameter. This invokes Exception constructor by passing Exception object
	 * 
	 * @param exception
	 *            - Exception to set
	 */
	public EIMProcessException(Exception exception)
	{
		super(exception);
		Logger logger = LoggerFactory.getLogger(EIMProcessException.class);
		logger.error("Internal exception:" + exception);
	}

	/**
	 * <code>EIMProcessException</code> Constructor with String and Exception as
	 * input parameter. This invokes Exception constructor by passing String and
	 * Exception object
	 * 
	 * @param message
	 *            - String message to set
	 * @param exception
	 *            - Exception to set
	 */
	public EIMProcessException(String message, Exception exception)
	{
		super(message, exception);
	}
}
