package com.heapspace.solutions.leetcode;

public class DuplicateNumber {

	public static int firstDuplicate(int[] a) {
		if(a.length<=1) {
			return -1;
		}

		for(int i=0; i<a.length; i++){
			int absEl = Math.abs(a[i]);
			if (absEl < a.length && a[absEl] > 0) {
				a[absEl] = -a[absEl]; 
			}
			else if(absEl < a.length && a[absEl] == 0){
				a[absEl] = -a.length; 
			}
			else {
				if(absEl == a.length) {
					return -1;
				}
				else {
					return Math.abs(a[i]);
				}
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		System.out.println(firstDuplicate(new int[] {2,2}));
	}

}
