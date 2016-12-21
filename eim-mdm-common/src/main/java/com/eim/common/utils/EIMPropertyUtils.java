
package com.eim.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;
import com.eim.common.exceptions.EIMProcessException;

/**
 * Class containing common utility methods for properties files used in
 * different supplier projects
 */
public class EIMPropertyUtils
{
	private static final Logger LOGGER = LoggerFactory.getLogger(EIMPropertyUtils.class);
	private Properties props = new Properties();

	/**
	 * Private constructor to prevent instantiation and to load the properties
	 * file.
	 * @throws IOException
	 * @throws EIMProcessException 
	 */
	private EIMPropertyUtils(String relativePropsPath, String propsFileNameHeader, String extn)
			throws IOException, EIMProcessException
	{
		loadProperties(relativePropsPath, propsFileNameHeader, extn);
	}

	/**
	 * Method to get the instance of this utility class in a static way.
	 * 
	 * @param relativePropsPath
	 * @param propsFileNameHeader
	 * @return
	 * @throws IOException
	 * @throws EIMProcessException 
	 */
	public static EIMPropertyUtils getInstance(String relativePropsPath, String propsFileNameHeader, String extn)
			throws  IOException, EIMProcessException
	{
		return new EIMPropertyUtils(relativePropsPath, propsFileNameHeader, extn);
	}

	/**
	 * Get Properties from the input properties file
	 * 
	 * @param key
	 *            - key in properties file
	 * @return the value of the input key
	 */
	public String getProperty(String key)
	{
		return props.getProperty(key);
	}

	/**
	 * Method to load the properties file provided in input. The properties are
	 * not cached as they can change dynamically and will work without a server
	 * start.
	 * 
	 * @param relativePropsPath
	 *            - Relative path of the properties file
	 * @param propsFileNameHeader
	 *            - Properties fie name without extension and the environment.
	 * @throws IOException
	 * @throws EIMProcessException 
	 */
	private void loadProperties(String relativePropsPath, String propsFileNameHeader, String extn)
			throws  IOException, EIMProcessException
	{
		loadFile(relativePropsPath, propsFileNameHeader, extn);
	}

	/**
	 * @param relativePropsPath
	 * @param propsFileNameHeader
	 * @param extn
	 * @throws IOException
	 * @throws EIMProcessException 
	 */
	private void loadFile(String relativePropsPath, String propsFileNameHeader, String extn) throws IOException, EIMProcessException
	{
		String propertiesPath = System.getProperty(EIMMDMConstant.LOG_HOME) + relativePropsPath + propsFileNameHeader
				+ EIMMDMConstant.UNDERSCORE + System.getProperty(EIMMDMConstant.TC_ENV) + extn;
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream(new File(propertiesPath));
			props.load(fileInputStream);
		}
		catch(IOException ioexce)
		{
			LOGGER.error("File not present: " + propertiesPath);
			throw ioexce;
		}
		catch(Exception exce)
		{
			LOGGER.error("Error while loading properties file");
			throw new EIMProcessException("Error while loading properties file", exce);
		}
		finally
		{
			if (fileInputStream != null)
			{
				fileInputStream.close();
				LOGGER.info("closed the file input stream");
			}
		}
	}

	/**
	 * Method to replace the parameters in the input message. The parameters are
	 * provided in {n} format where n is an integer value.
	 * 
	 * @param message
	 *            - Input message with the parameters.
	 * @param params
	 *            - Object array of parameters
	 * @return
	 */
	public static String replaceParams(String message, Object... params)
	{
		if (message != null && message.length() > 0)
		{
			MessageFormat messageFormat = new MessageFormat(message);
			message = messageFormat.format(params);
		}
		return message;
	}
}
