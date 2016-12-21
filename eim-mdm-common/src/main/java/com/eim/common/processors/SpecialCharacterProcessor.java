
package com.eim.common.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;
import com.eim.common.exceptions.EIMProcessException;

/**
 * This class is for special character handling
 */
public class SpecialCharacterProcessor
{
	/*
	 * Represents the Logger reference variable.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(SpecialCharacterProcessor.class);

	/**
	 * This method will be used to replace the special characters in the input
	 * string with blank. The method sets the output in camel exchange out body.
	 * The list of characters replaced are: <li>(nul), (soh), (stx), (etx),
	 * (eot), (enq), (ack), (bel), (bs), (cr), (so), (si), (dle), (dc1), (dc2),
	 * (dc3), (dc4), (nak), (syn), (etb), (can), (em), (sub), (esc), (fs), (gs),
	 * (rs), (us)</li>
	 * 
	 * @param exchange
	 *            - Exchange object containing headers and body
	 * @throws EIMProcessException
	 */
	@Handler
	public void process(Exchange exchange) throws EIMProcessException
	{
		String csvData = exchange.getIn().getBody(String.class);
		StringBuilder replacedString = new StringBuilder();
		final int nullAscii = 0;
		final int horizontalTabAscii = 9;
		final int carraigeReturnAscii = 13;
		final int spaceAscii = 32;
		for (char c : csvData.toCharArray())
		{
			int i = (int) c;
			if ((i >= nullAscii && i < horizontalTabAscii) || (i > carraigeReturnAscii && i < spaceAscii))
			{
				replacedString.append(EIMMDMConstant.SPACE);
			}
			else
			{
				replacedString.append(c);
			}
		}
		String finalString = replacedString.toString();
		// Replacing all ? with space.
		finalString = finalString.replace("?", " ");
		// Replacing any | occurrence with ,
		finalString = finalString.replace("|", ",");
		// Replacing all @!@ separator with |
		finalString = finalString.replace("@,@", "|");
		// Replacing all multiple spaces in every field with a single space
		finalString = finalString.replaceAll("( )+", " ");
		// Replacing all " |" with "|"
		finalString = finalString.replaceAll("\\s\\|", "|");
		// Replacing all "| " with "|"
		finalString = finalString.replaceAll("\\|\\s", "|");
		// Replacing all " <end-of-line>" with ""
		finalString = finalString.replaceAll("\\s+\n", "\n");
		/*LOGGER.info("Final modified string fed to Bean-IO-\n" + finalString);*/
		exchange.getOut().setBody(finalString.trim());
	}
}
