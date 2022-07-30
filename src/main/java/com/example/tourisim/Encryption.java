package com.example.tourisim;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
    public static byte[] digest(byte[] password){
        MessageDigest message;
        try{
            message=MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e){
            throw new IllegalArgumentException(e);
        }
        byte[] encryptpassword=message.digest(password);
        return encryptpassword;
    }
    public static String bytesToMax(byte[]bytes){
        StringBuilder build =new StringBuilder();
        for(byte b:bytes){
            build.append(String.format("%02x", b));
        

        }
        return build.toString();
    }
    
}
