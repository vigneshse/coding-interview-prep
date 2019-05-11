package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RepeatElement {
	static int printRepeating(int arr[]) { 
		List<Integer> list = new ArrayList<>();
		for(int i:arr) {
			if(list.contains(i)) {
				return i;
			}
			else {
				list.add(i);
			}
		}
		return -1;
    }  
  
    /* Driver program to test the above function */
    public static void main(String[] args)  
    { 
        int arr[] = {2,2}; 
        System.out.println(printRepeating(arr)); 
    } 
}
