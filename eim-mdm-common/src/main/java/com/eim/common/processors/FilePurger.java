
package com.eim.common.processors;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.exceptions.EIMProcessException;

/**
 * This class is used to purge all the shared and local directories used in this
 * application.
 */
public class FilePurger
{
	// Define the logger here.
	private static final Logger LOGGER = LoggerFactory.getLogger(FilePurger.class);

	private String ftpUserName;
	private String ftpPassword;
	private String ftpHost;
	private int ftpPort;
	private Map<String, String> localDirectories;
	private Map<String, String> sharedDirectories;

	/**
	 * Method to purge files from shared and local (archive, error, stage &
	 * intermediate) directories.
	 * 
	 * @param exchange
	 *            - The camel exchange file
	 */
	@Handler
	public void purge(Exchange exchange)
	{
		// Perform the purging activity on the files in local directories
		for (Entry<String, String> entry : getLocalDirectories().entrySet())
		{
			purgeLocalDirectories(entry.getKey(), Integer.valueOf(entry.getValue()));
		}

		// Perform the purging activity on the files in shared directories
		/*for (Entry<String, String> entry : getSharedDirectories().entrySet())
		{
			LOGGER.info("Files last modified before " + entry.getValue() + " days from now, will be purged from "
					+ entry.getKey());
			try
			{
				purgeSharedDirectories(entry.getKey(), Integer.valueOf(entry.getValue()));
			}
			catch(NumberFormatException exec)
			{
				LOGGER.error("NumberFormatException occured while purging files from " + entry.getKey());
				exchange.setException(exec);
			}
			catch(EIMProcessException exec)
			{
				LOGGER.error("EIMProcessException occured while purging files from " + entry.getKey());
				exchange.setException(exec);
			}
		}*/
	}

	/**
	 * Method to purge local directories
	 * 
	 * @param dirPath
	 *            - Directory to be purged
	 * @param purgingPeriod
	 *            - Period before which the files would be purged
	 */
	private void purgeLocalDirectories(String dirPath, int purgingPeriod)
	{
		File directory = new File(dirPath);
		if (directory.exists())
		{
			LOGGER.info("Files last modified before " + purgingPeriod + " days from now, will be purged from "
					+ dirPath);
			long purgeTimeThresholdMillis = System.currentTimeMillis() - (purgingPeriod * 24 * 60 * 60 * 1000);
			File[] fileList = directory.listFiles();

			for (File file : fileList)
			{
				/*
				 * Check if it's a directory. If it is, then recurse this method
				 * until it's not a directory.
				 */
				if (file.isDirectory())
				{
					purgeLocalDirectories(file.getAbsolutePath(), purgingPeriod);
				}
				// Check whether it's a normal file.
				else if (file.isFile())
				{
					if (file.lastModified() < purgeTimeThresholdMillis)
					{
						boolean deleted = file.delete();
						if (deleted)
						{
							LOGGER.info("Successfully deleted file: " + file.getAbsolutePath());
						}
						else
						{
							LOGGER.info("Unable to delete file: " + file.getAbsolutePath());
						}
					}
				}
				else
				{
					LOGGER.info("It is neither a directory nor a normal file: " + file.getAbsolutePath());
				}
			}
		}
		else
		{
			LOGGER.info("Files were not deleted from " + dirPath + " because the directory does not exist.");
		}

	}

	/**
	 * Method to purge shared directories using FTP
	 * 
	 * @param dirPath
	 *            - Directory to be purged
	 * @param purgingPeriod
	 *            - Period before which the files would be purged
	 * @throws EIMProcessException
	 */
	private void purgeSharedDirectories(String dirPath, int purgingPeriod) throws EIMProcessException
	{
		FTPClient client = new FTPClient();
		try
		{
			client.connect(getFtpHost(), getFtpPort());
			client.login(getFtpUserName(), getFtpPassword());
			long purgeTimeThresholdMillis = System.currentTimeMillis() - (purgingPeriod * 24 * 60 * 60 * 1000);

			// Get all the files in that directory
			FTPFile[] ftpFiles = client.listFiles(dirPath);
			for (FTPFile ftpFile : ftpFiles)
			{
				if (ftpFile.getTimestamp().getTimeInMillis() < purgeTimeThresholdMillis)
				{
					boolean deleted = client.deleteFile(dirPath + "\\" + ftpFile.getName());
					if (deleted)
					{
						LOGGER.info("Successfully deleted file: " + dirPath + "\\" + ftpFile.getName());
					}
					else
					{
						LOGGER.info("Unable to delete file: " + dirPath + "\\" + ftpFile.getName());
					}
				}
			}
		}
		catch(SocketException exec)
		{
			LOGGER.error("SocketException occured while purging files from " + dirPath);
			throw new EIMProcessException("SocketException occured while purging files from " + dirPath, exec);
		}
		catch(IOException exec)
		{
			LOGGER.error("IOException occured while purging files from " + dirPath);
			throw new EIMProcessException("IOException occured while purging files from " + dirPath, exec);
		}
		finally
		{
			try
			{
				client.disconnect();
			}
			catch(IOException exec)
			{
				LOGGER.error("IOException occured while purging files from " + dirPath);
				throw new EIMProcessException("IOException occured while purging files from " + dirPath, exec);
			}
		}
	}

	/**
	 * @return the ftpUserName
	 */
	public String getFtpUserName()
	{
		return ftpUserName;
	}

	/**
	 * @param ftpUserName
	 *            the ftpUserName to set
	 */
	public void setFtpUserName(String ftpUserName)
	{
		this.ftpUserName = ftpUserName;
	}

	/**
	 * @return the ftpPassword
	 */
	public String getFtpPassword()
	{
		return ftpPassword;
	}

	/**
	 * @param ftpPassword
	 *            the ftpPassword to set
	 */
	public void setFtpPassword(String ftpPassword)
	{
		this.ftpPassword = ftpPassword;
	}

	/**
	 * @return the ftpHost
	 */
	public String getFtpHost()
	{
		return ftpHost;
	}

	/**
	 * @param ftpHost
	 *            the ftpHost to set
	 */
	public void setFtpHost(String ftpHost)
	{
		this.ftpHost = ftpHost;
	}

	/**
	 * @return the ftpPort
	 */
	public int getFtpPort()
	{
		return ftpPort;
	}

	/**
	 * @param ftpPort
	 *            the ftpPort to set
	 */
	public void setFtpPort(int ftpPort)
	{
		this.ftpPort = ftpPort;
	}

	/**
	 * @return the localDirectories
	 */
	public Map<String, String> getLocalDirectories()
	{
		return localDirectories;
	}

	/**
	 * @param localDirectories
	 *            the localDirectories to set
	 */
	public void setLocalDirectories(Map<String, String> localDirectories)
	{
		this.localDirectories = localDirectories;
	}

	/**
	 * @return the sharedDirectories
	 */
	public Map<String, String> getSharedDirectories()
	{
		return sharedDirectories;
	}

	/**
	 * @param sharedDirectories
	 *            the sharedDirectories to set
	 */
	public void setSharedDirectories(Map<String, String> sharedDirectories)
	{
		this.sharedDirectories = sharedDirectories;
	}
}
