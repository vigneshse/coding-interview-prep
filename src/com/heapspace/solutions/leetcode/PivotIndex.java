package com.heapspace.solutions.leetcode;

public class PivotIndex {
	public static int findPivotIndex(int[] nums) {

		for(int i = 1 ; i < nums.length ; i++){
			int firstSum = 0;
			int secondSum = 0;  

			for(int j=0 ; j < i ; j++){
				firstSum+=nums[j];
			}
			for(int k = i; k < nums.length -1; k++ ){
				secondSum+=nums[k+1];
			}
			if(firstSum==secondSum){
				return i;
			}
		}
		return -1;
	}

	public static void main (String args[]) {
		int arr[] = {-1,-1,-1,-1,-1,0};
		System.out.println(PivotIndex.findPivotIndex(arr));
	}
}
