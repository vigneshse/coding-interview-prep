package com.heapspace.pratice.code;

import java.util.Arrays;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		int size = nums.length;
		Arrays.sort(nums);
		int occurrences = 0;
		int prevMajorityCount = 0;
		int prevMajority = Integer.MIN_VALUE;
		int currMajority = nums[0];
		if(size==1){
			return nums[0];
		}
		//   System.out.print(Arrays.toString(nums));
		for(int i=0; i < size-1; i++){
			if(nums[i] == nums[i+1]) {
				occurrences++;
				currMajority = nums[i];
			}
			else {
				if(prevMajorityCount < occurrences) {
					prevMajorityCount = occurrences;
					prevMajority = nums[i];
				}
				occurrences = 0;
			}
		}
		if(prevMajority==Integer.MIN_VALUE) {
			prevMajority = currMajority;
		}
		return prevMajority;
	}

	public static void main(String args[]) {
		int [] arr = new int[] {2,2,1,1,1,2,2};
		System.out.print(majorityElement(arr));
	}
}
