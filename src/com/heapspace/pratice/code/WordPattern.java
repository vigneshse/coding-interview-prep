package com.heapspace.pratice.code;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {


	 public static boolean wordPattern(String pattern, String str) {
	        int pLen = pattern.length();
	        String[] strArr = str.split(" ");
	        int sLen = strArr.length;
	        if(pLen!=sLen){
	            return false;
	        }
	        
	        Map<Character, String> map = new HashMap<>();
	        
	        for(int i = 0; i < pLen; i++){
	            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(strArr[i])){
	                map.put(pattern.charAt(i), strArr[i]);
	            }
	            else{
	                if(!strArr[i].equalsIgnoreCase(map.get(pattern.charAt(i)))){
	                    return false;
	                }
	            }
	        }
	        
	       return true;
	    }


	 
	 public static void main(String args[]) {

		 System.out.println(wordPattern("abba", "dog cat cat dog"));
	 }
}