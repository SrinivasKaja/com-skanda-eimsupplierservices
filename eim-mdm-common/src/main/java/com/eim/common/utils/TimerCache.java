
package com.eim.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * The singleton class to cache the timer.properties.
 */
public final class TimerCache
{
	private static TimerCache timerCache = null;
	private final Logger logger = LoggerFactory.getLogger(TimerCache.class);
	private Properties props = new Properties();
	private static Map<String, Map<String, String>> dateTimerCacheMap = new HashMap<String, Map<String, String>>();
	private Map<String, String> timerCacheMap = new HashMap<String, String>();

	/**
	 * Private constructor class for the singleton
	 * 
	 * @param propertiesPath
	 *            - Input timer properties file path
	 * @throws IOException
	 */
	private TimerCache(String propertiesPath) throws IOException
	{
		loadCache(propertiesPath);
	}

	/**
	 * Accessor method for the timerCache object.
	 * 
	 * @param propertiesPath
	 *            - Input timer properties file path
	 * @throws IOException
	 */
	public static TimerCache getInstance(String propertiesPath) throws IOException
	{
		// If cache date is not same as current date then reload the
		// cache.
		if (!dateTimerCacheMap.containsKey(EIMDateUtils.getCurrentDateString(EIMMDMConstant.REGULAR_DATE_FORMAT)))
		{
			synchronized(dateTimerCacheMap)
			{
				destroy(timerCache);
			}
		}
		// If object instance is null then instantiate the same
		if (timerCache == null)
		{
			timerCache = new TimerCache(propertiesPath);
		}
		return timerCache;
	}

	/**
	 * Method to load the properties file and store it in the HashMap.
	 * 
	 * @param propertiesPath
	 *            - Input timer properties file path
	 * @throws IOException
	 */
	private void loadTimerProps(String propertiesPath) throws IOException
	{
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream(new File(propertiesPath));
			props.load(fileInputStream);
		}
		catch(IOException exce)
		{
			logger.error("Timer file not present in the location " + propertiesPath);
			throw exce;
		}
		finally
		{
			if (fileInputStream != null)
			{
				fileInputStream.close();
			}
		}
	}

	/**
	 * Method to load the cache object in the Map. The map will contain the date
	 * and a Map having key values from properties.
	 * 
	 * @param propertiesPath
	 * @throws IOException
	 */
	private void loadCache(String propertiesPath) throws IOException
	{
		loadTimerProps(propertiesPath);
		Set<String> keys = props.stringPropertyNames();
		String stringCurrentDate = EIMDateUtils.getCurrentDateString(EIMMDMConstant.REGULAR_DATE_FORMAT);
		for (String key : keys)
		{
			timerCacheMap.put(key, props.getProperty(key));
		}
		dateTimerCacheMap.put(stringCurrentDate, timerCacheMap);
	}

	/**
	 * Method to return the country and timer entries for the whole file
	 * 
	 * @return Map containing country code and trigger time.
	 */
	public Map<String, String> getAllTimerEntry()
	{
		return dateTimerCacheMap.get(EIMDateUtils.getCurrentDateString(EIMMDMConstant.REGULAR_DATE_FORMAT));
	}

	/**
	 * Method used to remove the data from the cached map.
	 */
	public static void destroy(TimerCache timerCache)
	{
		TimerCache.dateTimerCacheMap.clear();
		TimerCache.timerCache = null;
	}
}
