package com.heapspace.pratice.code;


public class Solution {
	
	public boolean subChar(String s1, String s2) {
		  boolean charFlag[]=new boolean[26]; 
	     
	        for (int i = 0; i < s1.length(); i++) {
	            charFlag[s1.charAt(i) - 'a'] = true; 
	        }
	          
	   
	        for (int i = 0; i < s2.length(); i++)  {
	            if (charFlag[s2.charAt(i) -'a']) {
	            	  return true; 
	            }
	          
	        }
	        return false;
	}

    public static void main(String[] args) {
     Solution solution = new Solution();
     System.out.print(solution.subChar("cest", "zzzzzzzzzzzzzzzzaaaaaaaaaaaaa"));
    }
}
