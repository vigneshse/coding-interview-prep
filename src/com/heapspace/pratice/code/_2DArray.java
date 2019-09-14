package com.heapspace.pratice.code;

public class _2DArray {

	
	public static void print2DArray(int[][] array) {
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void populateValue(int[][] array) {
		
		int rowValue = 10;
		for(int row=0; row<array.length; row++) {	
			for(int col=0; col<array[row].length; col++) {
				array[row][col]= rowValue++;
			}
		}
	}
	
	public static void calculateHourGlassSum(int[][] array) {
		System.out.println("HOUR GLASS------------------");
		int maxSum = 0;
		int rowMid, colMid;
		rowMid = colMid = array.length - 3; 
		for(int row=0; row < rowMid; row++) {
			for(int col=0; col < colMid; col++) {
				int sum = array[row][col]+ array[row][col+1]+array[row][col+2]+
						array[row+1][col+1] + array[row+2][col]+array[row+2][col+1]+
						array[row+2][col+2];
				maxSum = Math.max(sum, maxSum);
	
		}	
	}
		System.out.print(maxSum);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[6][6];
		populateValue(array);
		print2DArray(array);
		calculateHourGlassSum(array);
	}

}
