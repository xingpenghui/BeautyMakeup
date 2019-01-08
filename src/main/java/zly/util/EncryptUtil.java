package zly.util;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import zly.util.Base64Util;

public class EncryptUtil {
	public static final String SHA1 = "SHA-1";
	public static final String SHA256 = "SHA-256";
	public static final String SHA512 = "SHA-512";
	public static final String ENCODING = "UTF-8";
	public static final String PUBKEY = "publicKey";
	public static final String PRIKEY = "privateKey";
	// Hash算法
	// MD5 返回值是16进制
	public static String md5Enc(String msg) {
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.update(msg.getBytes(ENCODING));
			return new BigInteger(1, digest.digest()).toString(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// SHA-1 SHA-256 SHA-512 返回值是16进制
	public static String SHAEnc(String type, String msg) {
		try {
			MessageDigest digest = MessageDigest.getInstance(type);
			digest.update(msg.getBytes(ENCODING));
			return new BigInteger(1, digest.digest()).toString(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// AES
	public static byte[] createAESKey() {
		try {
			// 创建秘钥生成器
			KeyGenerator generator = KeyGenerator.getInstance("AES");
			// 完成秘钥初始化 AES的128
			generator.init(128);
			// 生成秘钥
			SecretKey key = generator.generateKey();
			return key.getEncoded();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// AES加密 返回值base64
	public static String AESEnc(byte[] key, String msg) {
		// 转换秘钥
		SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
		try {
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, keySpec);
			byte[] r = cipher.doFinal(msg.getBytes(ENCODING));
			return Base64Util.base64Enc(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// AES解密
	public static String AESDec(byte[] key, String msg) {
		// 转换秘钥
		SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
		try {
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, keySpec);
			byte[] r = cipher.doFinal(Base64Util.base64Dec(msg));
			return new String(r, ENCODING);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// RSA
	// 创建秘钥
	// 创建秘钥 1024
	public static Map<String, String> createRSAKey() {
		try {
			// 创建秘钥生成器
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			// 完成秘钥初始化
			generator.initialize(1024);
			// 生成秘钥
			KeyPair keyPair = generator.generateKeyPair();
			
			Map<String, String> map = new LinkedHashMap<String, String>();
			// 获取公钥
			map.put(PUBKEY, Base64Util.base64Enc(keyPair.getPublic().getEncoded()));
			// 获取私钥
			map.put(PRIKEY, Base64Util.base64Enc(keyPair.getPrivate().getEncoded()));
			return map;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// 获取公钥
	public static PublicKey getPubKey(String key) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64Util.base64Dec(key));
			return (PublicKey) keyFactory.generatePublic(keySpec);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	// 获取私钥
	public static PrivateKey getPriKey(String key) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64Util.base64Dec(key));
			return (PrivateKey) keyFactory.generatePrivate(keySpec);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	// RSA 私钥加密 返回值base64
	public static String RSAEnc(String key, String msg) {
		try {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, getPriKey(key));
			byte[] r = cipher.doFinal(msg.getBytes(ENCODING));
			return Base64Util.base64Enc(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	// RSA解密
	public static String RSADec(String key, String msg) {
		// 转换秘钥
		try {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, getPubKey(key));
			byte[] r = cipher.doFinal(Base64Util.base64Dec(msg));
			return new String(r,ENCODING);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}