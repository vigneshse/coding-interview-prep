package com.heapspace.pratice.code;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encoding {

	
	public static String encode(String str) {
		Base64.Encoder encode = Base64.getEncoder();
		
		try {
			return encode.encodeToString(str.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.print(Base64Encoding.encode("asdfsad#$%#$%#$"));
	}
	
}
