package com.heapspace.solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

public class KthLargest {

    public static int findKthLargest(int[] nums, int k) {
        Set<Integer> set = new HashSet();
        for(int num: nums){
        	if(set.size() < k)
            set.add(num);
        }
        Object[] arr = set.toArray();
        
        return (int) arr[set.size()-1];
    }
    
    public static void main(String args[]) {
    	int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
    	System.out.println(KthLargest.findKthLargest(arr, arr.length-1));
    }
}
