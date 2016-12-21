
package com.eim.common.util;

import com.eim.common.datatypes.messagefault.MessageFault;

/**
 * 
 */
public final class EIMServiceUtils
{
	/**
	 * Private constructor to prevent instantiation
	 */
	private EIMServiceUtils()
	{
	}

	/**
	 * Method to create the <code>MessageFault</code> object for all response
	 * translators.
	 * 
	 * @param errorCode
	 *            - Error Code from back-end systems
	 * @param errorMessage
	 *            - Error Message from back-end systems
	 * @param detail
	 *            - Error Detail from back-end systems
	 * @return msgFault - <code>MessageFault</code> object with the error code,
	 *         message & details
	 */
	public static MessageFault createMessageFault(String errorCode, String errorMessage, String detail)
	{
		MessageFault msgFault = new MessageFault();
		msgFault.setErrorCode(errorCode);
		msgFault.setErrorText(errorMessage + detail);
		return msgFault;
	}

}
