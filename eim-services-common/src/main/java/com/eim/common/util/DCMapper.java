
package com.eim.common.util;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;

/**
 * Singleton object creation for mapping 
 */
public enum DCMapper
{
	MAPPER_INSTANCE;

	private DozerBeanMapper mapper;

	/**
	 * Private constructor for singleton
	 */
	private DCMapper()
	{
		mapper = new DozerBeanMapper();
		ArrayList fileList = new ArrayList();
		//fileList.add("dozer/get-dcSupplier-info-mapper-request.xml");
		fileList.add("dozer/get-dcSupplier-info-mapper-response.xml");
		fileList.add("dozer/save-dc-info-mapper-request.xml");
		mapper.setMappingFiles(fileList);
	}

	public DozerBeanMapper getMapper()
	{
		return mapper;
	}

}
