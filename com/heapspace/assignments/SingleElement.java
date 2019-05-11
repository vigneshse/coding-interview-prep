package com.heapspace.assignments;

//0,1,2,3,4,5,6,7,8,9,10
//1,1,2,3,3,4,4,5,5,6,6
//mid = 5
//Time complexity = O(logn)



public class SingleElement {
	
	public int findSingleOccurence(int[] arr) {
		if(arr==null || arr.length < 1)return -1;
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		
		while (start < end) {
			mid = (start + end) / 2;
			
			if(mid%2==1) {
				mid--;
			}
			if(arr[mid]==arr[mid+1]) {
				start = mid + 2;
			}
			else {
				end = mid;
			}
		}
		return arr[start];
	}
	
	public static void main(String args[]) {
		SingleElement se = new SingleElement();
		System.out.println(se.findSingleOccurence(new int[] {1,1,3,3,4,5,5,6,6,8,8}));
	}
}


