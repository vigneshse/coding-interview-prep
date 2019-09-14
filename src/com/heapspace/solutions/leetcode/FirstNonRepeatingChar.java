package com.heapspace.solutions.leetcode;

public class FirstNonRepeatingChar {

	public static char firstNotRepeatingCharacter(String s) {
		if (s.length() == 1) return s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			char char_ = s.charAt(i);
			if (s.indexOf(char_) == s.lastIndexOf(char_)) 
				return char_;
		}
		return '_';
	}
	
	public static void main(String args[]) {
		System.out.println(firstNotRepeatingCharacter("abcdefabcdefq"));
	}
}
