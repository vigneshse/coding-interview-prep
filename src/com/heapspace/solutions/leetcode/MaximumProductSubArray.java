package com.heapspace.solutions.leetcode;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {

        if (nums.length == 1) return nums[0];
        if (nums.length == 0) return 0;

        int maxProduct = Integer.MIN_VALUE;
        int leftProduct = 1, rightProduct = 1;

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            leftProduct *= nums[i];
            rightProduct *= nums[j];
            maxProduct = Math.max(leftProduct, maxProduct);
            maxProduct = Math.max(rightProduct, maxProduct);
            if (leftProduct == 0) {
                leftProduct = 1;
            }
            if (rightProduct == 0) {
                rightProduct = 1;
            }
        }

        return maxProduct;
    }


    public static void main(String args[]) {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        System.out.println(maximumProductSubArray.maxProduct(new int[]{-2, 0, 3, 1, -1, 4, 6, -1, -1, 5}));
    }
}
