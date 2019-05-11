package com.heapspace.pratice.code;

import java.io.IOException;
import java.util.Scanner;

public class HourGlass {


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] array) {
  
        int maxSum = Integer.MIN_VALUE; 
        int rowMid, colMid;
        rowMid = colMid = array.length - 2; 
        for(int row=0; row < rowMid; row++) {
            for(int col=0; col < colMid; col++) {
                int sum = array[row][col]+ array[row][col+1]+array[row][col+2]+
                        array[row+1][col+1] + array[row+2][col]+array[row+2][col+1]+
                        array[row+2][col+2];
                maxSum = Math.max(maxSum, sum);
        }    
    }
    return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(hourglassSum(arr));

        scanner.close();
    }
}
