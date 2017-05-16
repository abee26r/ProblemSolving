package com;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.io.FileUtils;

/**
 * This example program shows how AES encryption and decryption can be done in Java.
 * Please note that secret key and encrypted text is unreadable binary and hence 
 * in the following program we display it in hexadecimal format of the underlying bytes.
 * @author Jayson
 */
public class AESEncryption {
 
    /**
     * 1. Generate a plain text for encryption
     * 2. Get a secret key (printed in hexadecimal form). In actual use this must 
     * by encrypted and kept safe. The same key is required for decryption.
     * 3. 
     */
	static String plainText = "C:/Users/XX61691/Documents/Data/Junk/visa.zip";
	static int counter = 123456789;
    public static void main(String[] args) throws Exception {
        
        SecretKey secKey = getSecretEncryptionKey();       
        byte[] cipherText = encryptText(plainText, secKey);
        String decryptedText = decryptText(cipherText, secKey);
        
        mydecryptText(cipherText, bytesToHex(secKey.getEncoded()));
        
        System.out.println("Original Text:" + plainText);
        System.out.println("AES Key (Hex Form):"+bytesToHex(secKey.getEncoded()));
//        System.out.println("Encrypted Text (Hex Form):"+bytesToHex(cipherText));
//        System.out.println("Decrypted Text:"+decryptedText);
        
    }
    
    /**
     * gets the AES encryption key. In your actual programs, this should be safely
     * stored.
     * @return
     * @throws Exception 
     */
    public static SecretKey getSecretEncryptionKey() throws Exception{
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(256); // The AES key size in number of bits
        SecretKey secKey = generator.generateKey();
        return secKey;
    }
    
    /**
     * Encrypts plainText in AES using the secret key
     * @param plainText
     * @param secKey
     * @return
     * @throws Exception 
     */
    public static byte[] encryptText(String plainText,SecretKey secKey) throws Exception{
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
        byte [] byteCipherText = FileUtils.readFileToByteArray(new File(plainText));
        for(int i=0; i<counter; i++){
        	System.out.println(i);
        	byteCipherText = aesCipher.doFinal(byteCipherText);
        }        
//        Files.write(p, byteCipherText, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        FileUtils.writeByteArrayToFile(new File(plainText + "xxx"), byteCipherText);
        return byteCipherText;
    }
    
    /**
     * Decrypts encrypted byte array using the key used for encryption.
     * @param byteCipherText
     * @param secKey
     * @return
     * @throws Exception 
     */
    public static String decryptText(byte[] byteCipherText, SecretKey secKey) throws Exception {
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.DECRYPT_MODE, secKey);
        byte[] bytePlainText = byteCipherText;
        
        for(int i=0;i<counter;i++)
        	bytePlainText = aesCipher.doFinal(bytePlainText);
        Path p = Paths.get(plainText+"dec");
        FileUtils.writeByteArrayToFile(new File(plainText + "dec"), bytePlainText);
        return new String(bytePlainText);
    }
    
    public static String mydecryptText(byte[] byteCipherText, String key) throws Exception {
    	
    	SecretKey secKey = new SecretKeySpec(hexStringToByteArray(key), "AES");
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.DECRYPT_MODE, secKey);
        byte[] bytePlainText = byteCipherText;
        
        for(int i=0;i<counter;i++)
        	bytePlainText = aesCipher.doFinal(bytePlainText);
        Path p = Paths.get(plainText+"dec");
        FileUtils.writeByteArrayToFile(new File(plainText + "mydec"), bytePlainText);
        return new String(bytePlainText);
    }
    
    
    
    /**
     * Convert a binary byte array into readable hex form
     * @param hash
     * @return 
     */
    private static String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
    
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
