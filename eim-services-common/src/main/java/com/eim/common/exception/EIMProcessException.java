package com.eim.common.exception;

import com.eim.common.constant.EIMMDMConstant;
import com.eim.common.constants.EIMServiceConstants;
import com.eim.common.datatypes.messagefault.MessageFault;
import com.eim.common.util.EIMServiceUtils;
import com.eim.common.utils.PropertyFormatter;

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
	private MessageFault messageFault;

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
		setMessageFault(EIMServiceUtils.createMessageFault(
				PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_BUSINESS_CODE), message,
				EIMMDMConstant.BLANK_STRING));
	}

	/**
	 * <code>EIMProcessException</code> Constructor with String message and
	 * String code as input parameter. This invokes Exception constructor by
	 * passing String This is to facilitate different error code for different
	 * errors
	 * 
	 * @param message
	 *            - String message to set
	 */
	public EIMProcessException(String message, String code)
	{
		super(message);
		setMessageFault(EIMServiceUtils.createMessageFault(code, message, EIMMDMConstant.BLANK_STRING));
	}

	/**
	 * <code>EIMProcessException</code> Constructor with MessageFault object.
	 * This invokes Exception constructor by passing errorCode from the
	 * MessageFault.
	 * 
	 * @param fault
	 *            - MessageFault instance
	 */
	public EIMProcessException(MessageFault fault)
	{
		super(fault.getErrorCode());
		setMessageFault(fault);
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
		exception.printStackTrace();
		setMessageFault(EIMServiceUtils.createMessageFault(
				PropertyFormatter.getValue(EIMServiceConstants.EXCEPTION_HANDLER_BUSINESS_CODE),
				exception.getMessage(), EIMMDMConstant.BLANK_STRING));
	}

	/**
	 * Accessor methods
	 */
	public MessageFault getMessageFault()
	{
		return messageFault;
	}

	/**
	 * Mutator methods
	 */
	public void setMessageFault(MessageFault messageFault)
	{
		this.messageFault = messageFault;
	}

}
