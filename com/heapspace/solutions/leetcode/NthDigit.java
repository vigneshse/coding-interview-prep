package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NthDigit {
	public int findNthDigit(int n) {
		int number = 0;
		List<Integer> c = new ArrayList<>();
		for(int i=0; i < n; i++){
			number+=1;
			c.add(Integer.parseInt(String.valueOf(number)));
		}
		System.out.print(c.toString());
		return c.get(n-1);
	}
	
	public static void main(String args[]) {
		NthDigit nthDigit = new NthDigit();
		int n = (int) Math.pow(2, 6) -1 ;
		System.out.println(nthDigit.findNthDigit(n));
	}
}

