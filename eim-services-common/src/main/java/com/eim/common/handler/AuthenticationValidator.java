package com.eim.common.handler;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.jasypt.JasyptPropertiesParser;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constants.EIMServiceConstants;

public class AuthenticationValidator implements Processor
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationValidator.class);

	private Map<String, String> userProps;
	private JasyptPropertiesParser jasyptEncryptor;

	public Map<String, String> getUserProps()
	{
		return userProps;
	}

	public void setUserProps(Map<String, String> credentials)
	{
		this.userProps = credentials;
	}

	/**
	 * @return the jasyptEncryptor
	 */
	public JasyptPropertiesParser getJasyptEncryptor()
	{
		return jasyptEncryptor;
	}

	/**
	 * @param encryptor
	 *            the jasyptEncryptor to set
	 */
	public void setJasyptEncryptor(JasyptPropertiesParser encryptor)
	{
		this.jasyptEncryptor = encryptor;
	}
	

	@Override
	public void process(Exchange exchange) throws Exception
	{
		// TODO Auto-generated method stub
		String encryptedAuth = (String) exchange.getIn().getHeader(EIMServiceConstants.DCFREIGHT_SECURE_ID);
		LOGGER.info("encryptedUserName:" + encryptedAuth);
		String userName = userProps.get(EIMServiceConstants.DCFREIGHT_AUTH_NAME);
		LOGGER.info(" UserName:" + userName);
		// Decrypting the Request User Name and Password. If bad user name
		// property comes up, then handle the
		// EncryptionOperationNotPossibleException
		String reqUserName = null;
		try
		{
			reqUserName = jasyptEncryptor.getEncryptor().decrypt(encryptedAuth);
			LOGGER.info("Request UserName:" + reqUserName);
		}
		catch(EncryptionOperationNotPossibleException eonpException)
		{
			reqUserName = "";
			LOGGER.info("EncryptionOperationNotPossibleException occurred: Input is not decryptable");
		}

		LOGGER.info("Request UserName:" + reqUserName);
		if (userName.equals(reqUserName))
		{
			exchange.getIn().setHeader(EIMServiceConstants.HEADER_AUTH, "true");
		}
		else
		{
			exchange.getIn().setHeader(EIMServiceConstants.HEADER_AUTH, "false");
		}
	}

}
