package com.skandha.eim.air.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eim.common.exception.EIMProcessException;
import com.skandha.eim.air.jaxb.v1.AirLowFareSearchRS;

/**
 * This is the used to accept the input request media type
 * 
 */

@Path("/")
public class SaveDcInfoRestService 
{
	@POST
	@Produces(
	{ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public AirLowFareSearchRS insertDcDetailsInfo() throws EIMProcessException
	{
		return null;
	}
}
