package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {
	public static List<List<Integer>> threeSum(int nums[]){
		List<List<Integer>> resultSet = new ArrayList<>();
		Arrays.sort(nums);
		int mid = nums.length/2;
		List<Integer> list = new ArrayList<>();
		for(int i =mid ; i > 0; i--){
			for(int j=mid; j < nums.length-1;j++) {
				if(nums[i]+nums[j]+nums[j+1]==0) {
					list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[j+1]);
					
				}
				else if(nums[i]+nums[i-1]+nums[j]==0) {
					list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[i-1]);
					list.add(nums[j]);
				}
				resultSet.add(list);
			}
		}
		return resultSet;
	}
	public static void main(String args[]){
		System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}).toString());
	}
}



/*
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
	-4, -1, -1, 0 , 1, 2 

 */