package com.heapspace.solutions.leetcode;

public class DominantIndex {

	public static int dominantIndex(int[] nums) {
		int domInd = -1;
		int j;
		for(int i = 0; i < nums.length; i++) {
			for(j = 0; j < nums.length; j++) {
				if(i!=j) {
					if(nums[i] > (nums[j]*2)) {
						domInd = i;
					}
					else {
						domInd=-1;
						break;
					}
				}
			}
		}
		return domInd;
	}

	public static void main(String args[]) {
		System.out.println(DominantIndex.dominantIndex(new int[] {3,0,0,0,1}));
	}
}
