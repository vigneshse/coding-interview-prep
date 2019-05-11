package com.heapspace.pratice.code;

public class BinarySearch {

	public static int search(int arr[], int x) {
		int r=arr.length - 1, l =0;
		while(l<r) {
			int mid = l + (r-l) /2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid] < x) {
				l = mid+1;
			}
			else {
				r = mid -1;
				
			}
		}
		return -1;
	}

}
