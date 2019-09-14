package com.heapspace.solutions.leetcode;

import java.util.Arrays;

public class SearchRotatedSorted {

    public int search(int[] nums, int target) {

        if (nums.length == 0)
            return -1;
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;

        int pivot = searchPivot(nums);
        System.out.println("pivot" + pivot);

        if (pivot < 0) {
            return binarySearch(nums, target);
        } else {
            int[] arr1 = Arrays.copyOfRange(nums, 0, pivot);
            int[] arr2 = Arrays.copyOfRange(nums, pivot, nums.length);
            int res = -1;
            if (target <= arr2[arr2.length - 1]) {
                res = binarySearch(arr2, target);
                System.out.println("arr2 find" + res);
                if(res>=0) {
                    res += arr1.length;
                }

            } else {
                res = binarySearch(arr1, target);
                System.out.println("arr1 find" + res);
            }
            return res;
        }
    }

    private int binarySearch(int[] nums, int x) {
        int begin = 0, end = nums.length - 1, mid;
        System.out.println("nums.length" + nums.length);
        while (begin <= end) {
            mid = (begin + end) / 2;
            System.out.println("mid" + mid);
            System.out.println("nums[mid]" + nums[mid]);

            if (nums[mid] == x) {

                return mid;
            } else if (nums[mid] > x) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }

    private int searchPivot(int[] nums) {

        int begin = 0, end = nums.length - 1, mid;

        if (nums[begin] < nums[end])
            return 0;

        while (begin <= end) {
            mid = (begin + end) / 2;

            if (nums[mid] > nums[mid + 1]) {

                return mid + 1;
            } else {

                if (nums[mid] < nums[begin]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        SearchRotatedSorted srs = new SearchRotatedSorted();
        int[] input = new int[]{4,1};
        System.out.println("Result: " + srs.search(input, 4));
    }
}
