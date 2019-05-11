package com.heapspace.solutions.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

	public static boolean wordBreak(String s, List<String> wordDict) {
		Map<String, Integer> dict = new HashMap<>();
		for(String word: wordDict){
			dict.put(word, word.length());
		}
		int end = s.length();
		int start = 0;
		int matchCnt = 0;
		while(end > start){
			System.out.println("substring: "+s.substring(start, end));
			if(dict.containsKey(s.substring(start, end))){
				System.out.println("Matched: "+s.substring(start, end));
				matchCnt+=dict.get(s.substring(start, end));
				start=end-1;
				end=s.length()+1;
			}
			end--;
		}
		System.out.println("MatchCnt"+matchCnt);
		if(matchCnt == s.length()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]) {
		List<String> words = Arrays.asList("a","abc","b","cd");
		System.out.print(wordBreak("abcd", words));
	}
}
