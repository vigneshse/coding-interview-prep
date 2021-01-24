package com.heapspace.spoj;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Solution solve = new Solution();
        int n = scanner.nextInt(), i = 0;
        int[] arr = new int[n];

        while(i < n){
            arr[i++] = scanner.nextInt();
        }
        arr = solve.solve(arr);
        for(int num : arr){
            System.out.println(num);
        }
    }
}

class Solution {
    public int[] solve(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = reverse(nums[i]);
        }
        return nums;
    }

    private int reverse(int num){
        long res = 0;
        while(num > 0){
            res =  res*10 + num%10;
            num /= 10;
        }
        if(res <= Integer.MAX_VALUE && res >= Integer.MIN_VALUE)
            return (int) res;
        else
            return 0;
    }

}
