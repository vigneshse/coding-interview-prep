package com.heapspace.assignments;

public class MagicIndex {

	public int findMagicIndexBruteForce(int arr[]) {
		int res = -1;
		if(arr== null || arr.length < 1) return -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==i) {
				return i;
			}
		}
		return res;
	}
	
	public int findMagicIndexBinSearch(int arr[]) {
		int res = -1;
		if(arr== null || arr.length < 1) return -1;
		int start = 0;
		int end = arr.length-1; 
		int mid = 0;
		while(start < end) {
			 mid = (start+end)/2;
			 if(arr[mid]==mid) {
				 return mid;
			 }
			 else if (arr[mid] > mid) {
				 start = mid + 1;
			 }
			 else {
				 end = mid - 1;
			 }
		}
		return res;
	}
	
	public static void main(String args[]) {
		MagicIndex m = new MagicIndex();
		System.out.println(m.findMagicIndexBruteForce(new int[] {0,1,3,3,5}));
		System.out.println(m.findMagicIndexBinSearch(new int[] {0,1,3,3,5}));
	}
}
