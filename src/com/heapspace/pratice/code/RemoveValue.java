package com.heapspace.pratice.code;

public class RemoveValue {
	public static int removeElement(int[] nums, int val) {
		int returnIndex = 0;
		if(nums.length==1){
			return returnIndex;
		}
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == val){
				for(int j=i; j < nums.length-1; j++){
					if(val==nums[j+1]){
						continue;
					}
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int k = 0; k < nums.length; k++){
			if(nums[k]==val){
				returnIndex = k-1;
			}
		}
		return returnIndex;
	}

	public static void main(String args[]) {
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		int length = removeElement(nums, 2);
		for(int i=0;i<length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
