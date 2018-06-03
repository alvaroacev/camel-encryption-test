package com.encryption.dataformat;

import java.nio.charset.Charset;
import java.security.SecureRandom;

import javax.crypto.spec.SecretKeySpec;

import org.apache.camel.converter.crypto.CryptoDataFormat;

public class EncryptionConfiguration extends CryptoDataFormat {

	public EncryptionConfiguration(String encryptionKey) {
		super("AES/CBC/PKCS5Padding", new SecretKeySpec(encryptionKey.getBytes(Charset.forName("UTF-8")), "AES"));
		setShouldInlineInitializationVector(true);
	}

	public static byte[] generateIV() {
		byte[] iv = new byte[16];
		new SecureRandom().nextBytes(iv);
		return iv;
	}

}
