
package com.eim.common.processors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Property;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

/**
 * This class is used to perform all file operations.
 */
public class FileOperationProcessor
{
	private static final Logger LOGGER = LoggerFactory.getLogger(FileOperationProcessor.class);

	/**
	 * The method to rename the file and move to a given file path
	 * 
	 * @throws IOException
	 */
	@Handler
	public void processRename(@Property(EIMMDMConstant.SOURCE_FILE) String sourceDirectory,
			@Property("DestinationFile") String destFile) throws IOException
	{
		File sourceDir = new File(sourceDirectory);
		List<File> deleteFiles = new ArrayList<File>();
		if (sourceDir != null && sourceDir.exists())
		{
			// Iterate over the files and write it to the output file
			for (File file : sourceDir.listFiles())
			{
				if (file.isDirectory() || file.isHidden())
				{
					continue;
				}
				String fileName = file.getName();
				File destinationFile = new File(destFile + fileName);
				LOGGER.info("Source-" + file.getAbsolutePath() + ";Destination-" + destinationFile.getAbsolutePath());
				FileUtils.copyFile(file, destinationFile);
				deleteFiles.add(file);
			}
		}
		// Clean the input directory
		for (File file : deleteFiles)
		{
			FileUtils.deleteQuietly(file);
		}
	}

	/**
	 * The method to read the file in the given file path
	 * 
	 * @throws IOException
	 */
	@Handler
	public void processRead(Exchange exchange, @Property(EIMMDMConstant.SOURCE_FILE) String sourceFile)
			throws IOException
	{
		File file = new File(sourceFile);
		exchange.getOut().setBody(file);
	}

	/**
	 * The method to archive the file in the given file path
	 * 
	 * @throws IOException
	 */
	@Handler
	public void processArchive(Exchange exchange, @Property(EIMMDMConstant.SOURCE_FILE) String sourceFile,
			@Property(EIMMDMConstant.DESTINATION_FILE) String destinationFile,
			@Property("DestinationDirectory") String destDirectory) throws IOException
	{
		File destDir = new File(destDirectory);
		if (!destDir.exists())
		{
			destDir.mkdirs();
		}
		File file = new File(sourceFile);
		boolean isRenameSuccessful = file.renameTo(new File(destinationFile));
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("File " + sourceFile + " moved to " + destinationFile + " " + isRenameSuccessful);
	}

	/**
	 * The method to copy the file in the given file path
	 * 
	 * @throws IOException
	 */
	@Handler
	public void processCopy(Exchange exchange, @Property(EIMMDMConstant.SOURCE_FILE) String sourceFile,
			@Property(EIMMDMConstant.DESTINATION_FILE) String destinationFile) throws IOException
	{
		File srcFile = new File(sourceFile);
		File destFile = new File(destinationFile);
		if (srcFile.exists())
		{
			FileUtils.copyFile(srcFile, destFile);
		}
	}

	/**
	 * Method to delete input sourceFile
	 * 
	 * @param exchange
	 *            - Exchange object
	 * @param sourceFile
	 *            - Source File to be deleted
	 * @throws IOException
	 */
	@Handler
	public void deleteFile(Exchange exchange, @Property(EIMMDMConstant.SOURCE_FILE) String sourceFile)
			throws IOException
	{
		File srcFile = new File(sourceFile);
		// File destFile = new File(destinationFile);
		FileUtils.deleteQuietly(srcFile);// (srcFile, destFile);
	}

	/**
	 * Method to merge all files in a folder to a destination.
	 * 
	 * @param exchange
	 *            - Exchange object
	 * @param sourceDirectory
	 *            - Source directory containing files
	 * @param destination
	 *            - Final output file
	 * @param destinationDirectory
	 *            - output directory
	 * @throws IOException
	 */
	@Handler
	public void mergeFilesInDirectory(Exchange exchange, @Property(EIMMDMConstant.SOURCE_FILE) String sourceDirectory,
			@Property(EIMMDMConstant.DESTINATION_FILE) String destination,
			@Property(EIMMDMConstant.DESTINATION_DIR) String destinationDirectory) throws IOException
	{
		LOGGER.info("Source Directory-" + sourceDirectory);
		LOGGER.info("Destination File-" + destination);
		LOGGER.info("Destination Directory-" + destinationDirectory);

		File destinationDir = new File(destinationDirectory);
		File destinationFile = new File(destination);
		// Create destination directory if it doesn't exist.
		if (!destinationDir.exists())
		{
			destinationDir.mkdir();
		}
		File sourceDir = new File(sourceDirectory);
		FileWriter fstream = null;
		BufferedWriter out = null;

		List<File> deleteFiles = new ArrayList<File>();
		int i = 0;
		if (sourceDir != null && sourceDir.exists())
		{
			// Iterate over the files and write it to the output file
			for (File file : sourceDir.listFiles())
			{
				LOGGER.info("File read:-" + file.getAbsolutePath());
				// The file shouldn't be a directory or a hidden file
				if (file.isDirectory() || file.isHidden())
				{
					continue;
				}
				// If the file length is less than 20 bytes then ignore.
				if (file.length() > 20)
				{
					// Create output file before writing
					if (i == 0)
					{
						try
						{
							fstream = new FileWriter(destinationFile, true);
							out = new BufferedWriter(fstream);
							i++;
						}
						catch(IOException e1)
						{
							e1.printStackTrace();
							throw e1;
						}
					}
					LOGGER.info("File to be merged:-" + file.getAbsolutePath());
					deleteFiles.add(file);
					FileInputStream fis;
					try
					{
						fis = new FileInputStream(file);
						BufferedReader in = new BufferedReader(new InputStreamReader(fis));
						String aLine;
						while((aLine = in.readLine()) != null)
						{
							out.write(aLine);
							out.newLine();
						}
						in.close();
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
		// Close the stream for the destination file.
		try
		{
			if (out != null)
			{
				out.close();
			}
			else
			{
				LOGGER.info("Merged file is not created as the hadoop output is not having data");
				exchange.setProperty("FilePresent", "N");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		// Clean the input directory
		for (File file : deleteFiles)
		{
			FileUtils.deleteQuietly(file);
		}
	}
}
