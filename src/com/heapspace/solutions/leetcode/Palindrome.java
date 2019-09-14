package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	
	public static boolean isPalindrome(String string) {
		for(int start=0,end=string.length()-1; start < end; start++,end--) {
			if(string.charAt(start)!=string.charAt(end)) {
				return false;
			}
		}
		return true;	
	}
	
	 public static List<List<String>> partition(String s) {
		 List<List<String>> palindromes = new ArrayList<>();
		 List<String> begin = new ArrayList<>();
		 List<String> end = new ArrayList<>();
		 int start = 0;
		 for(int i = 1; i < s.length(); i++) {
			 String temp = s.substring(start,i+1);
			 end.add(String.valueOf(s.charAt(i)));
			 if(isPalindrome(temp)) {
				 begin.add(temp);
				 start = i+1;
			 }
		 }
		 palindromes.add(begin);
		
		 palindromes.add(end);
		
		 return palindromes;
	 }

	public static void main(String args[]) {
		System.out.println(partition("aab").toString());
	}
}
