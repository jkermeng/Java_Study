package util;

import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import com.mysql.cj.util.Base64Decoder;

public class DESUtile {
	private static Key key;
	private static String KEY_STR = "Shop_System";
	private static String CHARSETNAME = "UTF-8";
	private static String ALGORITHM = "DES";
	// ��̬�����
	static {
		try {
			// ����DES�㷨����
			KeyGenerator generator = KeyGenerator.getInstance(ALGORITHM);
			// ����SHA1��ȫ����
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			// ��������Կ����
			secureRandom.setSeed(KEY_STR.getBytes());
			// ��ʼ������SHA1���㷨����
			generator.init(secureRandom);
			// ������Կ����
			key = generator.generateKey();
			generator = null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * * ��ȡ���ܺ����Ϣ * @param str * @return
	 */

	public static String getEncryptString(String str) {
		// ����BASE64���룬����byte[]��ת��ΪString
		Encoder encoder = Base64.getEncoder();
		try {
			// ��UTF-8����
			byte[] bytes = str.getBytes(CHARSETNAME);
			// ��ȡ���ܶ���
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			// ��ʼ��������Ϣ
			cipher.init(Cipher.ENCRYPT_MODE, key);
			// ����
			byte[] doFinal = cipher.doFinal(bytes);
			// byte[] to encode�õ�String������
			return encoder.encodeToString(doFinal);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

	/**
	 * 64 * ��ȡ���ܺ����Ϣ 65 * 66 * @param str 67 * @return 68
	 */

	public static String getDecryptString(String str) {
		// ����BASE64���룬����byte[]��ת��ΪString
		// BASE64Decoder base64decoder = new BASE64Decoder();
		Decoder decoder = Base64.getDecoder();
		try {
			// ���ַ���decodeΪbyte[]

			byte[] bytes = decoder.decode(str);
			// ��ȡ���ܶ���
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			// ��ʼ��������Ϣ
			cipher.init(Cipher.DECRYPT_MODE, key);
			// ����
			byte[] doFinal = cipher.doFinal(bytes);
			// ���ؽ���֮�����Ϣ
			return new String(doFinal, CHARSETNAME);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
