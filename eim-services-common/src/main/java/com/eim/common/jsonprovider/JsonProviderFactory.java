package com.eim.common.jsonprovider;

import org.codehaus.jackson.jaxrs.Annotations;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

/**
 * JSON provider factory for the SOA services
 */
public class JsonProviderFactory
{
	/**
	 * Private constructor to prevent instantiation
	 */
	private JsonProviderFactory()
	{
	}

	/**
	 * Method to create a JSON provider.
	 * 
	 * @return <code>JacksonJaxbJsonProvider</code> object
	 */
	@SuppressWarnings("deprecation")
	public static JacksonJaxbJsonProvider create()
	{
		ObjectMapper mapper = new ObjectMapper();
		AnnotationIntrospector jaxbAnnotationIntrospector = new JaxbAnnotationIntrospector();
		AnnotationIntrospector jaxsonAnnotationIntrospector = new JacksonAnnotationIntrospector();
		AnnotationIntrospector combinedIntrospector = AnnotationIntrospector.pair(jaxbAnnotationIntrospector,
				jaxsonAnnotationIntrospector);
		mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
		Annotations[] annotationsToUse =
		{ Annotations.JAXB, Annotations.JACKSON };
		mapper.getDeserializationConfig().setAnnotationIntrospector(combinedIntrospector);
		mapper.getSerializationConfig().setAnnotationIntrospector(combinedIntrospector);
		return new JacksonJaxbJsonProvider(mapper, annotationsToUse);
	}
}
