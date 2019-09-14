package com.heapspace.pratice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triplets {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> triplets = new ArrayList<>();
		if(nums.length >= 3){
			if( nums[0]+nums[1]+nums[2]==0) {
				List temp = Arrays.asList(nums[0],nums[1],nums[2]);
				Collections.sort(temp);
				triplets.add(temp);
			}
			for(int i=0; i< nums.length - 2; i++){
				for(int j=i+2; j < nums.length -1; j ++){
					int sum = nums[i]+nums[j]+nums[j+1];
					if(sum==0){
						List temp = Arrays.asList(nums[i],nums[j],nums[j+1]);
						Collections.sort(temp);
						if(!triplets.contains(temp))  {
							triplets.add(Arrays.asList(nums[i],nums[j],nums[j+1]));
						}
					}
				}
			}
		}
		return triplets;
	}

	public static void main(String args[]) {
		int nums[] = new int[] {-1,0,1,0};
		System.out.println(threeSum(nums).toString());
	}
}

