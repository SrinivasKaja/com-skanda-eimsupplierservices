
package com.eim.common.utils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Common Utility class containing methods used across projects/applications
 */
public class EIMCommonUtils
{
	// Defining logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(EIMCommonUtils.class);

	/**
	 * Method to convert the input Map values to Object arrays
	 * 
	 * @param map
	 *            - Input HashMap
	 * @return
	 */
	public static Object[] convertMapValuesToObject(Map<String, Object> map)
	{
		Object[] objs = new Object[map.size()];
		Set<String> keys = map.keySet();
		int i = 0;
		for (String key : keys)
		{
			objs[i] = map.get(key);
			i++;
		}
		return objs;
	}

	/**
	 * Method to retrieve the array of classes from the input array of objects.
	 * 
	 * @param objs
	 *            - Array of objects
	 * @return Array of classes for the input objects
	 */
	public static Class<?>[] getClassesFromObjects(Object[] objs)
	{
		Class<?>[] classes = new Class<?>[objs.length];
		int i = 0;
		for (Object obj : objs)
		{
			classes[i] = obj.getClass();
			i++;
		}
		return classes;
	}

	/**
	 * Method to create a Gson object
	 * 
	 * @return created <code>Gson</code> object
	 */
	public static Gson createGsonMapper()
	{
		GsonBuilder builder = new GsonBuilder();
		return builder.registerTypeAdapter(XMLGregorianCalendar.class, new JsonXGCalConverter.XGCalSerializer())
				.registerTypeAdapter(XMLGregorianCalendar.class, new JsonXGCalConverter.XGCalDeSerializer()).create();
	}

	/**
	 * Method to check whether any of the input argument has any value. If they
	 * have, then return false, otherwise return true.
	 * 
	 * @param args
	 *            - input parameters
	 * @return true/false
	 */
	public static boolean isNull(String... args)
	{
		boolean isNull = true;
		for (String arg : args)
		{
			if (arg != null && !arg.trim().equals(EIMMDMConstant.BLANK_STRING))
			{
				isNull = false;
				break;
			}
		}
		return isNull;
	}

	/**
	 * Method to check whether any of the input argument is null. If they are,
	 * then return true, otherwise return false.
	 * 
	 * @param args
	 *            - input parameters
	 * @return true/false
	 */
	public static boolean isAnyNull(String... args)
	{
		boolean isNull = false;
		for (String arg : args)
		{
			if (arg == null || arg.trim().equals(EIMMDMConstant.BLANK_STRING))
			{
				isNull = true;
				break;
			}
		}
		return isNull;
	}

	/**
	 * This method use the AES helper to encrypt the string
	 * 
	 * @param inputString
	 * @return String
	 */
	public static String encryptString(String inputString)
	{

		return inputString;
		/*
		 * String inMethodName = " in encryptString() : "; // check null or
		 * empty before proceeding for decryption if
		 * (StringUtils.isEmpty(inputString)) { return inputString; } String
		 * encryptedStr = null; try { byte accNbrBytes[] =
		 * inputString.getBytes(); byte[] encrypteBytes =
		 * AESCodeHelper.encryptBytes(accNbrBytes, AESCodeHelper.getByteKey(),
		 * AESCodeHelper.getIV()); if (encrypteBytes != null) { encryptedStr =
		 * new String(encrypteBytes, "UTF-8"); }
		 * System.out.println("  Encrypted === " + encryptedStr); return
		 * encryptedStr; } catch(UnsupportedEncodingException e) {
		 * LOGGER.error(EIMMDMConstant.UN_SUPPORTED_ENCODING_EXCEPTION +
		 * inMethodName + e); return encryptedStr; }
		 */
	}

	/**
	 * This method use the AES helper to decrypt the string
	 * 
	 * @param inputString
	 * @return String
	 */
	public static String decryptString(String inputString)
	{
		return inputString;
		/*
		 * String inMethodName = " in encryptString() : "; // check null or
		 * empty before proceeding for decryption if
		 * (StringUtils.isEmpty(inputString)) { return inputString; } String
		 * decryptedStr = null; try { byte accNbrBytes[] =
		 * inputString.getBytes(); byte[] decryptBytes = AESCodeHelper
		 * .decrpytBytes(accNbrBytes, AESCodeHelper.getKey(),
		 * AESCodeHelper.getIV()); decryptedStr = new String(decryptBytes,
		 * "UTF-8"); System.out.println("  Decrypted === " + decryptedStr);
		 * return decryptedStr; } catch(UnsupportedEncodingException e) {
		 * LOGGER.error(EIMMDMConstant.UN_SUPPORTED_ENCODING_EXCEPTION +
		 * inMethodName + e); return decryptedStr; }
		 */
	}

	/**
	 * Method to remove special characters from input string
	 * 
	 * @param ip
	 * @param regex
	 * @return Well formed String
	 */
	public static String replaceSpclChar(String input, String... regex)
	{
		if (isNull(input))
		{
			return EIMMDMConstant.BLANK_STRING;
		}
		else
		{
			for (String spclChar : regex)
				input = input.replace(spclChar, EIMMDMConstant.BLANK_STRING);
			return input;
		}

	}

	/**
	 * Method to Escape special characters from input string
	 * 
	 * @param ip
	 * @param regex
	 * @return Well formed String
	 */
	public static String escapeSpclChar(String input, String... regex)
	{
		if (isNull(input))
		{
			return EIMMDMConstant.BLANK_STRING;
		}
		else
		{
			for (String spclChar : regex)
				input = input.replace(spclChar, "\\" + spclChar);
			return input;
		}

	}
	
	public static <T> List<T> nullsafe(List<T> l){
		return l!=null?l:Collections.EMPTY_LIST;
	}
	
	public static <K,V> Map<K,V> nullsafe(Map<K,V> l){
		return l!=null?l:Collections.EMPTY_MAP;
	}

}
