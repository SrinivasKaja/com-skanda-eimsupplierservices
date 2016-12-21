
package com.eim.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * Class containing common utility methods for different supplier projects
 */
public class EIMDateUtils
{
	private static final Logger log = LoggerFactory.getLogger(EIMDateUtils.class);
	private static Date oldDate = new Date(-2209008600000l);
	private static final TimeZone defaultTimeZone = TimeZone.getDefault();

	/**
	 * Private constructor to prevent instantiation.
	 */
	private EIMDateUtils()
	{
	}

	/**
	 * Method to create a Date object when a time is provided in hh:mm format.
	 * 
	 * @param timeString
	 *            - Time in hh:mm format.
	 * @return Date object with current date and input time.
	 * @throws ParseException
	 */
	public static Date getDateStringWithGivenTime(String timeString) throws ParseException
	{
		String[] hourAndMin = timeString.split(EIMMDMConstant.COLON);
		if (hourAndMin.length != 2)
		{
			log.error("Wrong timestamp format. Format should be hh:mm");
			throw new ParseException("Wrong timestamp format. Format should be hh:mm", 0);
		}
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		try
		{
			cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(hourAndMin[0]));
			cal.set(Calendar.MINUTE, Integer.valueOf(hourAndMin[1]));
		}
		catch(NumberFormatException nfEx)
		{
			log.error("Wrong timestamp format. Format should be hh:mm and h and m should be Integers");
			throw new ParseException("Wrong timestamp format. Format should be hh:mm and h and m should be Integers", 0);
		}
		return cal.getTime();
	}

	/**
	 * Method to return string date in given input format.
	 * 
	 * @return String current date
	 */
	public static String getCurrentDateString(String format)
	{
		final Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(currentDate);
	}

	/**
	 * Method to return XMLGregorianCalendar object from a java.util.Date object
	 * for timer flow in PubSub module.
	 * 
	 * @param date
	 *            - java.util.Date object
	 * @return corresponding XMLGregorianCalendar object
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public static XMLGregorianCalendar getXMLGCForTimerFlow(Date date) throws DatatypeConfigurationException,
			ParseException
	{
		date = formatDate(date, EIMMDMConstant.REGULAR_DATE_FORMAT);
		return getXMLGregorianCalendar(date);
	}

	/**
	 * This method is used to get a XMLGregorianCalendar object from a
	 * java.util.Date object
	 * 
	 * @param date
	 *            - java.util.Date object
	 * @return corresponding XMLGregorianCalendar object
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) throws DatatypeConfigurationException
	{
		if (date != null)
		{
			GregorianCalendar gCal = (GregorianCalendar) GregorianCalendar.getInstance();
			gCal.setTime(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
		}
		return null;
	}

	/**
	 * Method used to retrieve the UTC time from a date in XMLGreGCal format.
	 * 
	 * @param date
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendarUTCFormat(Date date)
			throws DatatypeConfigurationException
	{
		if (date != null)
		{
			GregorianCalendar gCal = (GregorianCalendar) GregorianCalendar.getInstance();
			gCal.setTime(date);
			gCal.setTimeZone(TimeZone.getTimeZone(EIMMDMConstant.UTC));
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
		}
		return null;
	}

	/**
	 * This method is used to get a shifted date from a given date.
	 * 
	 * @param currentDate
	 * @param numberOfDays
	 * @return shifted date
	 */
	public static Date getShiftedDate(Date currentDate, int numberOfDays)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.add(Calendar.DATE, numberOfDays);
		return cal.getTime();
	}

	/**
	 * This method is used to get a shifted day/hour/minute/second from a given
	 * date.
	 * 
	 * @param hourMinSec
	 *            - Unit that needs the shift; Eg:
	 *            Calendar.SECOND/Calendar.MINUTE
	 *            /Calendar.HOUR/Calendar.DAY/Calendar.MONTH/Calendar.YEAR etc
	 * @param currentDate
	 *            - Current Date Object
	 * @param numberOfUnits
	 *            - number of units to be shifted.
	 * @return shifted date
	 */
	public static Date getShiftedTime(int hourMinSec, Date currentDate, int numberOfUnits)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.add(hourMinSec, numberOfUnits);
		return cal.getTime();
	}

	/**
	 * Method to get java.util.Date object from a XMLGregorianCalendar object.
	 * 
	 * @param xmlGC
	 *            - XMLGregorianCalendar object
	 * @return corresponding java.util.Date object
	 */
	public static Date getDateFromXMLGC(XMLGregorianCalendar xmlGC)
	{
		if (xmlGC == null)
			return null;
		else
			return xmlGC.toGregorianCalendar().getTime();
	}

	/**
	 * Method to get a Date object in certain format
	 * 
	 * @param date
	 *            - java.util.Date object
	 * @param pattern
	 *            - date format pattern
	 * @return - formatted Date
	 * @throws ParseException
	 */
	public static Date formatDate(Date date, String pattern) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(sdf.format(date));
	}

	/**
	 * Method to get Date object from a string using a certain pattern
	 * 
	 * @param dateString
	 *            -date in string format
	 * @param pattern
	 *            - date format pattern
	 * @return - formatted Date
	 * @throws ParseException
	 */
	public static Date getDateFromString(String dateString, String pattern) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(dateString);
	}

	/**
	 * Method that converts XMLGregorianCalendar to Date Object using UTC time
	 * zone
	 * 
	 * @param calender
	 * @return
	 */
	public static Date toDate(XMLGregorianCalendar calender)
	{
		if (calender == null || calender.getYear() < 1900)
		{
			return null;
		}
		GregorianCalendar gregCal = calender.toGregorianCalendar();
		gregCal.setTimeZone(TimeZone.getTimeZone("UTC"));
		return gregCal.getTime();
	}

	/**
	 * Method that converts Date to XMLGregorianCalendar Object using UTC time
	 * zone
	 * 
	 * @param calender
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar fromDate(Date date) throws DatatypeConfigurationException
	{
		if (date != null)
		{
			GregorianCalendar gCal = (GregorianCalendar) GregorianCalendar.getInstance();
			gCal.setTime(date);
			gCal.setTimeZone(TimeZone.getTimeZone("UTC"));
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
		}
		return null;
	}

	/**
	 * Method to get a Date object in certain format
	 * 
	 * @param date
	 *            - java.util.Date object
	 * @param pattern
	 *            - date format pattern
	 * @return - formatted Date String
	 * @throws ParseException
	 */
	public static String formatDateToString(Date date, String pattern) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * This Method get the Java util date and convert into XMLGregorianCalendar
	 * Date
	 * 
	 * @param stringDate
	 * @return
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendarDate(String stringDate)
	{
		String msg = "caught DatatypeConfigurationException in the method getXMLGregorianCalendarDate";
		XMLGregorianCalendar gDate = null;
		try
		{
			int truncatedTimestamp = stringDate.length() - 3;
			String trimmedDate = stringDate;
			if (truncatedTimestamp == EIMMDMConstant.DATE_FORMAT_IN_MILSEC.length())
			{
				trimmedDate = stringDate.substring(0, truncatedTimestamp);
			}
			gDate = dateToXmlGregCal(trimmedDate, EIMMDMConstant.DATE_FORMAT_IN_MILSEC);
		}
		catch(ParseException e)
		{
			TimeZone.setDefault(defaultTimeZone);
			try
			{
				gDate = dateToXmlGregCal(stringDate, EIMMDMConstant.REGULAR_DATE_FORMAT);
			}
			catch(DatatypeConfigurationException e1)
			{
				TimeZone.setDefault(defaultTimeZone);
				log.error(msg, e1);
			}
			catch(ParseException pEx)
			{
				TimeZone.setDefault(defaultTimeZone);
				log.error("wrong date format", pEx);
			}
		}
		catch(DatatypeConfigurationException e1)
		{
			TimeZone.setDefault(defaultTimeZone);
			log.error(msg, e1);
		}
		return gDate;
	}

	/**
	 * Method to convert the given date to XmlGregorianCalendar
	 * 
	 * @param date
	 *            - JAVA util Date object
	 * @param datePattern
	 *            - Pattern of the incoming date
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	private static XMLGregorianCalendar dateToXmlGregCal(String stringDate, String datePattern)
			throws DatatypeConfigurationException, ParseException
	{
		TimeZone timeZoneCST = TimeZone.getTimeZone(EIMMDMConstant.CST);
		if (TimeZone.getDefault().getID().equals(EIMMDMConstant.UTC))
		{
			// setting CST time zone
			TimeZone.setDefault(timeZoneCST);
		}
		XMLGregorianCalendar gDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		Date date = sdf.parse(stringDate);
		if (date != null && date.after(oldDate))
		{
			GregorianCalendar xmlDate = new GregorianCalendar();
			xmlDate.setTime(date);
			xmlDate.setTimeZone(TimeZone.getTimeZone(EIMMDMConstant.UTC));
			gDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlDate);
		}
		TimeZone.setDefault(defaultTimeZone);
		return gDate;

	}

	/**
	 * This method convert String to XmlGregorian
	 * 
	 * @param dateString
	 * @return XMLGregorianCalendar
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar convertStringToXmlGregorian(String dateString)
			throws DatatypeConfigurationException
	{
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = sdf.parse(dateString);
			GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
			gc.setTime(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		}
		catch(ParseException e)
		{
			// Optimize exception handling
			// System.out.print(e.getMessage());
			return null;
		}

	}

	/**
	 * Method to format XMLGregorianCalendar to cassandra input date string
	 * without altering the time stamp
	 * 
	 * @param inputDate
	 * @param pattern
	 * @return
	 */
	public static String formatStringDate(XMLGregorianCalendar inputDate, String pattern)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(EIMMDMConstant.DATE_FORMAT_XMLGC);
		String outString = null;
		try
		{
			Date outdate = sdf.parse(inputDate.toString());
			outString = formatDateToString(outdate, pattern);
		}
		catch(ParseException pEx)
		{
			log.error("unparsable date format", pEx);
		}
		return outString;
	}

	/**
	 * used specifically for UTC time zone 
	 * 
	 * @param inputDate
	 * @param pattern
	 * @return
	 */
	public static Date getDateFromXmlGC(XMLGregorianCalendar inputDate, String pattern)
	{
		TimeZone timeZoneCST = TimeZone.getTimeZone(EIMMDMConstant.CST);
		if (TimeZone.getDefault().getID().equals(EIMMDMConstant.UTC))
		{
			// setting CST time zone
			TimeZone.setDefault(timeZoneCST);
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date outdate = null;
		try
		{
			outdate = sdf.parse(inputDate.toString());
			TimeZone.setDefault(defaultTimeZone);
		}
		catch(ParseException pEx)
		{
			TimeZone.setDefault(defaultTimeZone);
			log.error("unparsable date format", pEx);
		}
		return outdate;
	}
	
	/**
	 * Method used for jaxb unmarshalling only
	 * 
	 * @param inputDate
	 * @param pattern
	 * @return
	 */
	public static Date getServiceDateFromXmlGC(XMLGregorianCalendar inputDate, String pattern)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date outdate = null;
		try
		{
			outdate = sdf.parse(inputDate.toString());
		}
		catch(ParseException pEx)
		{
			log.error("unparsable date format", pEx);
		}
		return outdate;
	}

}