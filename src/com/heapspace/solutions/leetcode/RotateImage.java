package com.heapspace.solutions.leetcode;

import java.util.Arrays;

public class RotateImage {

	
	public static int[][] rotateImage(int[][] a) {
		if(a.length > 0 && a.length != a[0].length)
			return a;
		return reverse(transpose(a));
	}
	
	 static int[][] transpose(int arr[][]) 
	    { 
	        for (int i = 0; i < arr.length; i++) 
	            for (int j = i; j < arr[0].length; j++) { 
	                int temp = arr[j][i]; 
	                arr[j][i] = arr[i][j]; 
	                arr[i][j] = temp; 
	            } 
	        return arr;
	    } 
	 static int[][] reverse(int arr[][]){
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0; j < arr[i].length/2; j++) {
				 int tmp = arr[i][j];
				 arr[i][j]=arr[i][arr[i].length-1-j];
				 arr[i][arr[i].length-1-j] = tmp;
			 }
		 }
		 return arr;
	 }

	public static void main(String args[]) {
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("RESULT : "+Arrays.deepToString(rotateImage(a)));
	}
}



//a = [[1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]]
//    		 
//    		 rotateImage(a) =
//    		    [[7, 4, 1],
//    		     [8, 5, 2],
//    		     [9, 6, 3]]