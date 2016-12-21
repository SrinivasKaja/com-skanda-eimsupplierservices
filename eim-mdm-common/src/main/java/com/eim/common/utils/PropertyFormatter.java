
package com.eim.common.utils;

import java.util.Properties;


/**
 * The <code>PropertyFormatter</code> class, to handler properties from external
 * files. <li>setInstance()</li> <li>format()</li> <li>getInteger()</li> <li>
 * getValue()</li>
 * 
 * @version 1.0,
 */
public class PropertyFormatter
{

	/** Variable to hold properties reference */
	private static Properties properties;

	/**
	 * Method to set properties reference. Used by spring singleton reference.
	 * 
	 * @param properties
	 *            - holds properties reference.
	 * @return Properties - returns same reference.
	 */
	public static Properties setInstance(Properties properties)
	{
		PropertyFormatter.properties = properties;
		return properties;
	}

	public static Properties getInstance()
	{
		return properties;
	}

	/**
	 * Method to get value from properties and substitute corresponding values
	 * to place holders for given key and values.
	 * 
	 * @param key
	 *            - holds the key.
	 * @param params
	 *            - holds the place holder values.
	 * @return String - returns resultant string.
	 */
	public static String format(String key, Object... params)
	{
		String message = properties.getProperty(key);
		return EIMPropertyUtils.replaceParams(message, params);
	}

	/**
	 * Method to get integer value from properties .
	 * 
	 * @param key
	 *            - holds the key.
	 * @return integer - returns resultant integer.
	 */
	public static int getInteger(String key)
	{
		return Integer.parseInt(properties.getProperty(key));
	}

	/**
	 * Method to get integer value from properties .
	 * 
	 * @param key
	 *            - holds the key.
	 * @return String - returns value of the key.
	 */
	public static String getValue(String key)
	{
		return properties.getProperty(key);
	}

	/**
	 * Method to return the JAVA Util properties created for all properties file
	 * in the application
	 * 
	 * @return
	 */
	public Properties getProperties()
	{
		return properties;
	}
}
