
package com.eim.common.utils;

import java.lang.reflect.Type;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Utility method used while converting <code>XMLGregorianCalendar</code>
 * objects with GSON.
 */
@SuppressWarnings("rawtypes")
public class JsonXGCalConverter
{
	/**
	 * Class to be used when XMLGregorianCalendar object is mapped into a JSON
	 * object.
	 */
	public static class XGCalSerializer implements JsonSerializer
	{
		public XGCalSerializer()
		{
			super();
		}

		/**
		 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object,
		 *      java.lang.reflect.Type,
		 *      com.google.gson.JsonSerializationContext)
		 */
		@Override
		public JsonElement serialize(Object src, Type typeOfSrc, JsonSerializationContext context)
		{
			XMLGregorianCalendar xgCal = (XMLGregorianCalendar) src;
			return new JsonPrimitive(xgCal.toXMLFormat());
		}
	}

	/**
	 * Class to be used when XMLGregorianCalendar object is extracted from JSON
	 * object.
	 */
	public static class XGCalDeSerializer implements JsonDeserializer
	{
		public XGCalDeSerializer()
		{
			super();
		}

		/**
		 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement,
		 *      java.lang.reflect.Type,
		 *      com.google.gson.JsonDeserializationContext)
		 */
		@Override
		public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException
		{
			try
			{
				return DatatypeFactory.newInstance().newXMLGregorianCalendar(json.getAsString());
			}
			catch(DatatypeConfigurationException exce)
			{
				throw new JsonParseException("Error while creating XMLGregorianCalendar object", exce);
			}
		}
	}
}
