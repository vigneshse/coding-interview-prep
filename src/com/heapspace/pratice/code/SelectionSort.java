package com.heapspace.pratice.code;

public class SelectionSort {


	public static void sort(int[] arr){
		if(arr==null || arr.length==1){
			return;	
		}
		int swapCount = 0;

		for (int i=1; i<arr.length; ++i) 
		{ 
			int key = arr[i]; 
			int j = i-1; 

			while (j>=0 && arr[j] > key) 
			{ 
				arr[j+1] = arr[j]; 
				j = j-1; 
				swapCount++;
			} 
			arr[j+1] = key; 
		} 
		System.out.println("Swap Count: "+ swapCount);
	}
	public static void main(String args[]){
		int[] arr = new int[] {2,3,4,1,5};
		sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}
}
