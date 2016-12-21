
package com.eim.common.utils;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eim.common.constant.EIMMDMConstant;

public class AESCodeHelper
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AESCodeHelper.class);
	// This string has 64 characters. When sent to convertToByteArray it returns
	// a byte array or 32 bytes
	public static final String key = "00112233445566778899AABBCCDDEEFF0123456789ABCDEF0123456789ABCDEF";
	public static final String iv = "1234567890987654";

	/**
	 * This method do encrypt the string with AES algorithm.
	 * 
	 * @param bytes
	 * @param key
	 * @param iv
	 * @return byte[]
	 */
	public static byte[] encryptBytes(byte[] bytes, byte[] key, String iv)

	{
		String inMethodName = " in encryptBytes() : ";
		Cipher cipher = null;

		try
		{
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
			return Base64.encodeBase64(cipher.doFinal(bytes));
		}
		catch(NoSuchAlgorithmException noSuchAlgo)
		{
			LOGGER.error(EIMMDMConstant.NO_SUCH_ALGORITHM_EXCEPTION + inMethodName + noSuchAlgo);
		}

		catch(NoSuchPaddingException noSuchPad)
		{
			LOGGER.error(EIMMDMConstant.NO_SUCH_PADDING_EXCEPTION + inMethodName + noSuchPad);
		}

		catch(InvalidKeyException invalidKey)
		{
			LOGGER.error(EIMMDMConstant.INVALID_KEY_EXCEPTION + inMethodName + invalidKey);
		}

		catch(BadPaddingException badPadding)
		{
			LOGGER.error(EIMMDMConstant.BAD_PADDING_EXCEPTION + inMethodName + badPadding);
		}

		catch(IllegalBlockSizeException illegalBlockSize)
		{
			LOGGER.error(EIMMDMConstant.ILLEGAL_BLOCK_EXCEPTION + inMethodName + illegalBlockSize);
		}

		catch(InvalidAlgorithmParameterException invalidParam)
		{
			System.out.println(EIMMDMConstant.INVALID_PARAMETER_EXCEPTION + inMethodName + invalidParam);
		}

		return null;
	}

	/**
	 * This method do decrypt the string with AES algorithm.
	 * 
	 * @param bytes
	 * @param key
	 * @param iv
	 * @return byte[]
	 */
	public static byte[] decrpytBytes(byte[] encryptedData, String key, String iv)
	{
		byte[] keyBytes = convertToByteArray(key);
		Cipher cipher = null;
		String inMethodName = " in decrpytBytes() : ";

		try
		{
			cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);

			return cipher.doFinal(Base64.decodeBase64(encryptedData));
		}
		catch(NoSuchAlgorithmException noSuchAlgo)
		{
			LOGGER.error(EIMMDMConstant.NO_SUCH_ALGORITHM_EXCEPTION + inMethodName + noSuchAlgo);
		}

		catch(NoSuchPaddingException noSuchPad)
		{
			LOGGER.error(EIMMDMConstant.NO_SUCH_PADDING_EXCEPTION + inMethodName + noSuchPad);
		}

		catch(InvalidKeyException invalidKey)
		{
			LOGGER.error(EIMMDMConstant.INVALID_KEY_EXCEPTION + inMethodName + invalidKey);
		}

		catch(BadPaddingException badPadding)
		{
			LOGGER.error(EIMMDMConstant.BAD_PADDING_EXCEPTION + inMethodName + badPadding);
		}

		catch(IllegalBlockSizeException illegalBlockSize)
		{
			LOGGER.error(EIMMDMConstant.ILLEGAL_BLOCK_EXCEPTION + inMethodName + illegalBlockSize);
		}

		catch(InvalidAlgorithmParameterException invalidParam)
		{
			LOGGER.error(EIMMDMConstant.INVALID_PARAMETER_EXCEPTION + inMethodName + invalidParam);
		}

		return null;
	}

	/**
	 * Simply takes every other two characters and terms them into a byte value
	 * then stuffs them into a byteArray
	 * 
	 * @param key
	 * @return byte[]
	 */
	public static byte[] convertToByteArray(String key)
	{
		byte[] b = new byte[key.length() / 2];

		for (int i = 0, bStepper = 0; i < key.length() + 2; i += 2)
			if (i != 0)
				b[bStepper++] = ((byte) Integer.parseInt((key.charAt(i - 2) + "" + key.charAt(i - 1)), 16));

		return b;
	}

	public static byte[] getByteKey()
	{
		byte[] newKey = convertToByteArray(key);
		return newKey;
	}

	public static String getKey()
	{
		String newKey = key;
		return newKey;
	}

	public static String getIV()
	{
		String newIV = iv;
		return newIV;
	}

	public static void main(String[] args) throws Exception
	{

		// Test it out
		String plaintext = "msr-cosmos";
		byte str[] = plaintext.getBytes();
		byte[] encrypted = encryptBytes(str, getByteKey(), getIV());
		byte[] decrypted = decrpytBytes(encrypted, getKey(), getIV());
		String encryptStr = new String(encrypted, "UTF-8");
		String decryptStr = new String(decrypted, "UTF-8");
		System.out.println(plaintext);
		System.out.println(encryptStr);
		System.out.print(decryptStr);
	}
}