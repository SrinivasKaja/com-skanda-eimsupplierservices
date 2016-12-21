
package com.eim.common.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * This is a common utility class which can used to determine whether a switch
 * is ON or OFF
 */
public class EIMSwitchHelper
{
	// define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(EIMSwitchHelper.class);

	/**
	 * Private constructor to prevent instantiation from outside.
	 */
	private EIMSwitchHelper()
	{
	}

	/**
	 * Method to determine whether a switch is ON or OFF
	 * 
	 * @param moduleName
	 * @param switchName
	 *            - name of the switch
	 * @return <code>false</code> - if the switch is turned OFF. Else return
	 *         <code>true</code>
	 */
	public static boolean isSwitchOn(String moduleName, String switchName)
	{
		EIMPropertyUtils propUtils;
		String relativePropsPath = null;
		String propsFileNameHeader = null;

		if (EIMMDMConstant.PUB_SUB.equalsIgnoreCase(moduleName))
		{
			relativePropsPath = EIMMDMConstant.PUB_SUB_SWITCH_FILE_PATH;
			propsFileNameHeader = EIMMDMConstant.PUB_SUB_SWITCH_FILE_NAME;
		}

		try
		{
			propUtils = EIMPropertyUtils.getInstance(relativePropsPath, propsFileNameHeader,
					EIMMDMConstant.SWITCH_FILE_EXTN);
		}
		catch(Exception e)
		{
			/*
			 * By default, the polling will take place. If will NOT if and only
			 * if the switch is explicitly turned OFF.
			 */
			LOGGER.info("Error while loading the supplier-messaging_TC_ENV.switch file: polling will happen by default");
			return true;
		}

		// If switch in OFF, the return false. Else return true.
		if (EIMMDMConstant.SWITCH_ON.equalsIgnoreCase(propUtils.getProperty(switchName)))
		{
			return true;
		}
		else if (EIMMDMConstant.SWITCH_OFF.equalsIgnoreCase(propUtils.getProperty(switchName)))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
